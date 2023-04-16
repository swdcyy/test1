package trd.t;
import java.lang.Object;
import java.util.List;
import java.lang.String;
import kotlin.jvm.internal.a;
import urd.a;
import msd.l;
import fsd.l;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.lang.ArithmeticException;
import java.util.Collection;
import nsd.t;
import java.util.Objects;
import java.lang.Class;
import java.util.Arrays;
import java.util.Collections;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.util.Random;
import java.util.Enumeration;
import java.util.ArrayList;

public class t	// class@002586
{

    public void t(){
       super();
    }
    public static final List a(List p0){
       a.p(p0, "builder");
       return p0.n();
    }
    public static final List b(int p0,l p1){
       List list = t.j(p0);
       p1.invoke(list);
       return t.a(list);
    }
    public static final List c(l p0){
       List list = t.i();
       p0.invoke(list);
       return t.a(list);
    }
    public static final int d(int p0){
       if (p0 < 0) {
          if (l.a(1, 3, 0)) {
             CollectionsKt__CollectionsKt.V();
          }else {
             throw new ArithmeticException("Count overflow has happened.");
          }
       }
       return p0;
    }
    public static final int e(int p0){
       if (p0 < 0) {
          if (l.a(1, 3, 0)) {
             CollectionsKt__CollectionsKt.W();
          }else {
             throw new ArithmeticException("Index overflow has happened.");
          }
       }
       return p0;
    }
    public static final Object[] f(Collection p0){
       return t.a(p0);
    }
    public static final Object[] g(Collection p0,Object[] p1){
       Objects.requireNonNull(p1, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
       Object[] objArray = t.b(p0, p1);
       Objects.requireNonNull(objArray, "null cannot be cast to non-null type kotlin.Array<T>");
       return objArray;
    }
    public static final Object[] h(Object[] p0,boolean p1){
       a.p(p0, "$this$copyToArrayOfAny");
       if (!p1 || !a.g(p0.getClass(), Object[].class)) {
          p0 = Arrays.copyOf(p0, p0.length, Object[].class);
       }
       a.o(p0, "if \(isVarargs && this.ja\x20\x02 Array<Any?>::class.java\)\x00");
       return p0;
    }
    public static final List i(){
       return new a();
    }
    public static final List j(int p0){
       return new a(p0);
    }
    public static final List k(Object p0){
       p0 = Collections.singletonList(p0);
       a.o(p0, "java.util.Collections.singletonList\(element\)");
       return p0;
    }
    public static final List l(Iterable p0){
       a.p(p0, "$this$shuffled");
       List list = CollectionsKt___CollectionsKt.I5(p0);
       Collections.shuffle(list);
       return list;
    }
    public static final List m(Iterable p0,Random p1){
       a.p(p0, "$this$shuffled");
       a.p(p1, "random");
       List list = CollectionsKt___CollectionsKt.I5(p0);
       Collections.shuffle(list, p1);
       return list;
    }
    public static final List n(Enumeration p0){
       ArrayList uArrayList = Collections.list(p0);
       a.o(uArrayList, "java.util.Collections.list\(this\)");
       return uArrayList;
    }
}
