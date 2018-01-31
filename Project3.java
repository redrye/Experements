/* Java File */


class A {
    public void p() {
        System.out.println("A.p");
    }
    public void q() {
        System.out.println("A.q");
    }
    public void r() {
        p();
        q();
    }
}

class B extends A {
    public void p() {
        System.out.println("B.p");
    }
}

class C extends B {
    public void q() {
        System.out.println("C.q");
    }
    public void r() {
        p();
        q();
    }
}

public class Project3 {
    public static void main(String[] args) {
        A a;
        C c = new C();
        a = c;
        a.r();
        a = new B();
        a.r();
        a = new C();
        a.r();
    }
}
