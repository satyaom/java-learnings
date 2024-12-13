package learning.core_concepts.generics;

class GenericsGeneral<T, U> {
    T obj;
    U obj1;

    GenericsGeneral(T obj, U obj1) {
        this.obj = obj;
        this.obj1 = obj1;
    }

    void printObj() {
        System.out.println(this.obj);
        System.out.println(this.obj1);
    }
}
