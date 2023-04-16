package trd.c1;
import java.lang.Object;
import java.util.Set;
import java.lang.String;
import kotlin.jvm.internal.a;
import urd.g;
import msd.l;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;
import java.util.Collection;
import kotlin.collections.ArraysKt___ArraysKt;

public class c1	// class@00256a
{

    public void c1(){
       super();
    }
    public static final Set a(Set p0){
       a.p(p0, "builder");
       return p0.d();
    }
    public static final Set b(int p0,l p1){
       Set set = c1.e(p0);
       p1.invoke(set);
       return c1.a(set);
    }
    public static final Set c(l p0){
       Set set = c1.d();
       p0.invoke(set);
       return c1.a(set);
    }
    public static final Set d(){
       return new g();
    }
    public static final Set e(int p0){
       return new g(p0);
    }
    public static final Set f(Object p0){
       p0 = Collections.singleton(p0);
       a.o(p0, "java.util.Collections.singleton\(element\)");
       return p0;
    }
    public static final TreeSet g(Comparator p0,Object[] p1){
       a.p(p0, "comparator");
       a.p(p1, "elements");
       return ArraysKt___ArraysKt.Zx(p1, new TreeSet(p0));
    }
    public static final TreeSet h(Object[] p0){
       a.p(p0, "elements");
       return ArraysKt___ArraysKt.Zx(p0, new TreeSet());
    }
}
