package learning.core_concepts.generics;

public class Generics<T> {
    T obj;
    public Generics(T obj) {
        this.obj = obj;
    }

    //
    public T getObj() {
        return this.obj;
    }

    //<K> can print object
    public <K> void printObj(K obj) {
        System.out.println(obj);
    }
}
