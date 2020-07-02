package com.example.mydemo.task1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

  public static void main(String[] args) {
    System.out.println("Task 1 & Task 2");
    Main task = new Main();

    List<User> list1 = task.getList1();
    System.out.println("List 1: " + list1);

    List<User> list2 = task.getList2();
    System.out.println("List 2: " + list2);

    List<User> list = task.getIntersectionForLists(list1, list2);
    System.out.println("Intersection: " + list);

    Set<User> set1 = task.getSet1();
    System.out.println("Set 1: " + set1);

    Set<User> set2 = task.getSet2();
    System.out.println("Set 2: " + set2);

    Set<User> set = task.getIntersectionForSets(set1, set2);
    System.out.println("Intersection: " + set);
  }

  public List<User> getIntersectionForLists(List<User> list1, List<User> list2) {
    ArrayList<User> resultedList = new ArrayList<>(list1);
    resultedList.retainAll(list2);
    return resultedList;
  }

  public Set<User> getIntersectionForSets(Set<User> set1, Set<User> set2) {
    Set<User> resultedSet = new HashSet<>(set1);
    resultedSet.retainAll(set2);
    return resultedSet;
  }

  public List<User> getList1() {
    ArrayList<User> users = new ArrayList<>();
    users.add(new User(10, "Billy"));
    users.add(new User(20, "Bob"));
    users.add(new User(30, "Tornton"));
    return users;
  }

  public Set<User> getSet1() {
    Set<User> users = new HashSet<>();
    users.add(new User(10, "Billy"));
    users.add(new User(20, "Bob"));
    users.add(new User(30, "Tornton"));
    return users;
  }

  public List<User> getList2() {
    ArrayList<User> users = new ArrayList<>();
    users.add(new User(20, "Bob"));
    users.add(new User(30, "Tornton"));
    users.add(new User(40, "Samuel"));
    users.add(new User(50, "L"));
    users.add(new User(60, "Jackson"));
    return users;
  }

  public Set<User> getSet2() {
    Set<User> users = new HashSet<>();
    users.add(new User(20, "Bob"));
    users.add(new User(30, "Tornton"));
    users.add(new User(40, "Samuel"));
    users.add(new User(50, "L"));
    users.add(new User(60, "Jackson"));
    return users;
  }

}
