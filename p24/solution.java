interface IX {
    void f1();
    void f2();
}
class CA implements IX {
    void f1() { ...
    }
    void f2() { ...
    }
}
class Factory {
    IX getInstance() {
        return new CA();
    }
}
//*********************
class Client {
    public static void main() {
        Factory f = new Factory();
        IX obj = f.getInstance();
        obj.f1();
        obj.f2();
    }
}
