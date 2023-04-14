package org.example.singleton;

public class SingleObjectDemo {
    public static void main(String[] args) {
        SingleObject object1 = SingleObject.getInstance();
        SingleObject object2 = SingleObject.getInstance();
        SingleObject object3 = SingleObject.getInstance();

        object1.showMessage();
        object2.showMessage();
        object3.showMessage();
        System.out.println(object1);
        System.out.println(object2);
        System.out.println(object3);
    }
}
