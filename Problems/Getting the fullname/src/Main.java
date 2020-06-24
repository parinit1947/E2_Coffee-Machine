class User {
    private String firstName;
    private String lastName;

    public User() {
        this.firstName = "";
        this.lastName = "";
    }

    public void setFirstName(String firstName) {
        // write your code here
        this.firstName = firstName == null ? new String("") : new String(firstName);
    }

    public void setLastName(String lastName) {
        // write your code here
        this.lastName = lastName == null ? new String("") : new String(lastName);
    }

    public String getFullName() {

        if ("".equals(firstName) && "".equals(lastName)) {
            return "Unknown";
        } else if ("".equals(lastName)) {
            return new String(firstName);
        } else if ("".equals(firstName)) {
            return new String(lastName);
        }

        return new String(firstName + " " + lastName);
    }
}