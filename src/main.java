import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.lang.String;
class User {
    private int user_id;
    private String name;
    private int age;
    private double hourly_rate;
    private int completed_hours;
    public User(int user_id, String name, int age, double hourly_rate, int completed_hours) {
        this.user_id = user_id;
        this.name = name;
        this.age = age;
        this.hourly_rate = hourly_rate;
        this.completed_hours = completed_hours;
    }
    public int getUser_id() {
        return user_id;
    }
    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public double getHourly_rate() {
        return hourly_rate;
    }
    public void setHourly_rate(double hourly_rate) {
        this.hourly_rate = hourly_rate;
    }
    public int getCompleted_hours() {
        return completed_hours;
    }
    public void setCompleted_hours(int completed_hours) {
        this.completed_hours = completed_hours;
    }
    static class Staff extends User {
        public Staff(int user_id, String name, int age, double hourly_rate, int completed_hours) {
            super(user_id, name, age, hourly_rate, completed_hours);
        }
    }
    static class Manager extends User {
        private List<Staff> staff;
        public Manager(int user_id, String name, int age) {
            super(user_id, name, age, 0, 0);
            this.staff = new ArrayList<>();
        }
        public List<Staff> getStaff() {
            return staff;
        }
        public void setStaff(List<Staff> staff) {
            this.staff = staff;
        }
    }
    static class Director extends User {
        private List<Manager> managers;

        public Director(int user_id, String name, int age) {
            super(user_id, name, age, 0, 0);
            this.managers = new ArrayList<Manager>();
        }
        public List<Manager> getManagers() {
            return managers;
        }
        public void setManagers(List<Manager> managers) {
            this.managers = managers;
        }
    }
    static class FakeDB {
        private final Map<Integer, User> users;
        public FakeDB() {
            this.users = new HashMap<>();
        }
        public void add_user(User user) {
            users.put(user.getUser_id(), user);
        }
        public User get_user(int user_id) {
            return users.get(user_id);
        }
    }
    static class ReportGenerator {
        public void generateStaffListReport(Director director) {
        }
    }
    static class TemplateStore {
        public TemplateStore() {
            Map<String, String> templates = new HashMap<>();
        }
    }
    public static class myClass {
        public static void main(String[] args) {

            User.Director director = new User.Director(1, "Mustafa", 40);
            User.Manager manager = new User.Manager(2, "Hadeel", 30);
            User.Staff staff1 = new User.Staff(3, "Omar", 25, 15, 160);
            User.Staff staff2 = new User.Staff(4, "Aseel", 28, 18, 140);

        }
    }
}




