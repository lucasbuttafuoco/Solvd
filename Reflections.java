package com.Solvd;

import com.Solvd.Models.person.Person;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Reflections {
    private static final Logger LOGGER = LogManager.getLogger(Reflections.class);

    public static void getFields(){
        //create class object for Person.class
        Class person = Person.class;
        //Get all the fields information in the Fields array
        Field[] fieldsList = Person.class.getDeclaredFields();

        for( Field field:fieldsList){
            LOGGER.info("Field name: " + field.getName());
            LOGGER.info("Type: " + field.getType().getName());
            LOGGER.info("Access modifiers: " + Modifier.toString(field.getModifiers()));
        }
    }

    public static void getMethods(){
        //create class object for Person.class
        Class person = Person.class;
        //get all method information in the methods array
        Method[] methodsList = person.getDeclaredMethods();
        for(Method method:methodsList){
            LOGGER.info("Method name: " + method.getName());
            LOGGER.info("Return type: " + method.getGenericReturnType());
            LOGGER.info("Parameter count: " + method.getParameterCount());
            LOGGER.info("Parameter types: " + method.getParameterTypes());
        }
    }

    public static void getConstructors(){
        //create class object for Person.class
        Class person = Person.class;

        //Get all the constructor information in the Constructor array
        Constructor[] personConstructorList = person.getConstructors();

        for(Constructor constructor : personConstructorList){
            LOGGER.info("Constructor name: " + constructor.getName() );

            //Get and print access modifiers
            int personModifiers = constructor.getModifiers();
            LOGGER.info("Constructor modifiers: " + Modifier.toString(personModifiers));

            //get and print parameter types
            Class[] personParameterList = constructor.getParameterTypes();
            LOGGER.info("Constructor parameter types: ");
            for(Class class1: personParameterList){
                LOGGER.info(class1.getName()+" ");
            }

            //Get and print exception thrown by constructors
            Class[] personExceptionList = constructor.getExceptionTypes();
            LOGGER.info("Exceptions thrown by constructors:");
            for(Class class1:personExceptionList){
                LOGGER.info(class1.getName());
            }
        }
    }

    public static void main (String[] args){
        getFields();
        getConstructors();
        getMethods();;
    }
}
