

public class User {

    private String name;

    private String lastName;

    public User(String name, String lastName){
        this.name = name;
        this.lastName = lastName;
    }

    public String getUserName() {return name;}
    public String getUserLastName() {return lastName;}


    /*
     * We need to override the hashcode of the User 
     * class to handle the HashSet correctly
    */
    @Override
    public int hashCode(){
        /*
         * I will use as a strategy to concatenate the individual hashcode of the 
         * user's first and last name
         */
       return name.hashCode() + lastName.hashCode();
    }

    /*
     * We also need to override the equality operator
     */
    @Override
    public boolean equals(Object obj){

        if (!(obj instanceof User)) {
            return false;
        }

        /*
         * Here I cast the object to compare
         * it with the User of the current instance
         */

        var user = (User)obj;

        return this.name.equals(user.name) 
            && this.lastName.equals(user.lastName);
    }
}