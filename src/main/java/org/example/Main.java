package org.example;

import java.util.List;

public class Main {
  public static void main(String[] args) {
  }


  private String foo(List<String> ls) {
    Object s1 = new Integer(42);
    int size = ls.size();
    if (size > 200) {
      if (size > 0) {
        s1 = "hello";
      }
      return (String) s1; // Avoid FP for class cast thanks to integer support
    }
    return null;
  }
}
