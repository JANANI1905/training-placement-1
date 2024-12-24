import java.util.*;

class Student {}
class Rockstar {}
class Hacker {}

public class Solution {

    static void count(ArrayList<Object> mylist) {
        int studentCount = 0;
        int rockstarCount = 0;
        int hackerCount = 0;

        for (Object obj : mylist) {
            if (obj instanceof Student) {
                studentCount++;
            } else if (obj instanceof Rockstar) {
                rockstarCount++;
            } else if (obj instanceof Hacker) {
                hackerCount++;
            }
        }
        System.out.println(studentCount + " " + rockstarCount + " " + hackerCount);
    }

    public static void main(String[] args) {
        ArrayList<Object> mylist = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            String s = sc.next();
            if (s.equals("Student")) mylist.add(new Student());
            if (s.equals("Rockstar")) mylist.add(new Rockstar());
            if (s.equals("Hacker")) mylist.add(new Hacker());
        }
        count(mylist);
        sc.close();
    }
}