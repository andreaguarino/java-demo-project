import java.util.List;
import java.util.Collections;

class MyClass {
  public void doSomething() {
    doSomethingElse();
  }

  private void doSomethingElse() {
    List immutableList = Collections.emptyList();
    addToList(immutableList);
  }

  void addToList(List list) {
    list.add("Foo"); // Potential issue if 'list' is immutable
  }
}

class MySubClass extends MyClass {
  @Override
  void addToList(List list) {
    // do nothing
  }
}

class PartialIssuesOnVirtualCalls {
  public static void main(String[] args) {
    new MyClass().doSomething(); // Noncompliant (S6322)
    new MySubClass().doSomething(); // Compliant
  }
}

