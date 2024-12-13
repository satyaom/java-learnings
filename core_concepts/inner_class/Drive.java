package learning.core_concepts.inner_class;


import static learning.core_concepts.static_and_final_with_inheritance.Parent.tt;

public class Drive {
    private static class Entry {
        private static final int tt = 84;
    }

    void yy() {
        Entry t = new Entry();

        System.out.println(tt);
    }
}
