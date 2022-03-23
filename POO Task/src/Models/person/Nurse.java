package Models.person;

import Interfaces.IWork;

public class Nurse extends Person implements IWork {


    private boolean onCall;

    public Nurse() {

    }

    public Nurse(String firstName, String lastName, int age, String realId, String email, String telephone, String address, boolean onCall) {
        super(firstName, lastName, age, realId, email, telephone, address);
        this.onCall = onCall;
    }

    public boolean isOnCall() {
        return onCall;
    }

    public void setOnCall(boolean onCall) {
        this.onCall = onCall;
    }

    @Override
    public String toString() {
        return "\nNurse info:" + super.toString() + "\n is on call: " + isOnCall();
    }

    @Override
    public String working() {
        return "I'm taking care of the hospitalized patients ";
    }
}
