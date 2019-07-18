public class LooseCoupling {
    public static void main(String args[]) throws IOException {
        Show b = new B();
        Show c = new C();

        A a = new A(b);
        // a.display() will print A and B
        a.display();

        A a1 = new A(c);
        // a.display() will print A and C
        a1.display();
    }
}

interface Show {
    public void display();
}

class A {
    Show s;

    public A(Show s) {
        // s is loosely coupled to A
        this.s = s;
    }

    public void display() {
        System.out.println("A");
        s.display();
    }
}

class B implements Show {
    public B() {
    }

    public void display() {
        System.out.println("B");
    }
}

class C implements Show {
    public C() {
    }

    public void display() {
        System.out.println("C");
    }
}