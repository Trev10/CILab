public class CILab implements CILabInterface {
    private String myString;

    @Override
    public String getString() {
        return myString;
    }

    @Override
    public void setString(String string) {
        myString = string;
    }

    @Override
    public boolean detectCapitalUse() {
        if (myString.isEmpty()) {
            return true;
        }

        boolean allUpperCase = myString.equals(myString.toUpperCase());
        boolean allLowerCase = myString.equals(myString.toLowerCase());
        boolean firstCapitalRestLowerCase = Character.isUpperCase(myString.charAt(0))
                && myString.substring(1).equals(myString.substring(1).toLowerCase());

        return allUpperCase || allLowerCase || firstCapitalRestLowerCase;
    }


}

