import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        
        List<User> users = new ArrayList<User>();

        users.add(new User("Cindy","Medina"));
        users.add(new User("Cindy","Medina"));
        users.add(new User("Amaury","Caballero"));
        users.add(new User("Rajamani","D"));
        users.add(new User("Amaury","Caballero"));
        users.add(new User("Amaury","Caballero"));
        users.add(new User("Amaury","Caballero"));
        users.add(new User("Amaury","Caballero"));
        users.add(new User("Amaury","Caballero"));
        users.add(new User("Rajamani","D"));
        users.add(new User("Amaury","Caballero"));
        users.add(new User("Rajamani","D"));
        users.add(new User("Amaury","Caballero"));
    
        var containsDuplicated  = containsDuplicatedUsers(users);
    
        System.out.println(containsDuplicated);
    }

    static Boolean containsDuplicatedUsers(List<User> listOfUser){

        // Here I am using the HashSet, because this will 
        // prevent me from having duplicates
        Set<User> usersSet = new HashSet<User>();
        Integer count = 0;

        for (User user : listOfUser) {
            count = usersSet.size();

            usersSet.add(user);

            /*
             * If the size of the hashset does not change when inserting a user, 
             * it means that I ignore that insert, 
             * so we can conclude that it is duplicated
             */
            if(count == usersSet.size()){
                return true;
            }
        }

        return false;
    }
}