package qk.y;
import java.util.Collection;
import java.lang.Iterable;
import com.google.common.collect.e;
import java.lang.Object;
import ok.n;
import java.util.Iterator;
import com.google.common.collect.Iterators;
import ok.o;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import qk.m;
import qk.y$a;
import java.util.List;
import java.util.NoSuchElementException;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.IllegalArgumentException;
import qk.y$d;
import java.util.RandomAccess;
import qk.y$c;
import java.lang.Class;
import java.lang.reflect.Array;
import ok.h;
import qk.y$b;
import com.google.common.base.Optional;

public final class y	// class@002298
{

    public static boolean a(Collection p0,Iterable p1){
       if (p1 instanceof Collection) {
          return p0.addAll(e.a(p1));
       }
       n.j(p1);
       return Iterators.a(p0, p1.iterator());
    }
    public static boolean b(Iterable p0,o p1){
       boolean b;
       Iterator iterator = p0.iterator();
       n.j(p1);
       while (true) {
          if (iterator.hasNext()) {
             if (!p1.apply(iterator.next())) {
                b = false;
                break ;
             }
          }else {
             b = true;
             break ;
          }
       }
       return b;
    }
    public static boolean c(Iterable p0,o p1){
       boolean b = (Iterators.n(p0.iterator(), p1) != -1)? true: false;
       return b;
    }
    public static Collection d(Iterable p0){
       if (p0 instanceof Collection) {
       }else {
          ArrayList uArrayList = Lists.d(p0.iterator());
       }
       return p0;
    }
    public static Iterable e(Iterable p0,Iterable p1){
       return m.m(p0, p1);
    }
    public static boolean f(Iterable p0,Object p1){
       if (p0 instanceof Collection) {
          return e.e(p0, p1);
       }
       return Iterators.f(p0.iterator(), p1);
    }
    public static boolean g(Iterable p0,Iterable p1){
       if (p0 instanceof Collection && (p1 instanceof Collection && p0.size() != p1.size())) {
          return false;
       }
       return Iterators.g(p0.iterator(), p1.iterator());
    }
    public static Iterable h(Iterable p0,o p1){
       n.j(p0);
       n.j(p1);
       return new y$a(p0, p1);
    }
    public static Object i(Iterable p0,o p1,Object p2){
       Iterator iterator = p0.iterator();
       n.j(iterator);
       n.j(p1);
       while (iterator.hasNext()) {
          Object obj = iterator.next();
          if (p1.apply(obj)) {
             p2 = obj;
             break ;
          }
       }
       return p2;
    }
    public static Object j(Iterable p0,Object p1){
       return Iterators.m(p0.iterator(), p1);
    }
    public static Object k(Iterable p0){
       if (!p0 instanceof List) {
          return Iterators.l(p0.iterator());
       }
       if (!p0.isEmpty()) {
          return y.m(p0);
       }
       throw new NoSuchElementException();
    }
    public static Object l(Iterable p0,Object p1){
       if (p0 instanceof Collection) {
          if (e.a(p0).isEmpty()) {
             return p1;
          }else if(p0 instanceof List){
             return y.m(Lists.a(p0));
          }
       }
       Iterator iterator = p0.iterator();
       if (iterator.hasNext()) {
          p1 = Iterators.l(iterator);
       }
       return p1;
    }
    public static Object m(List p0){
       return p0.get((p0.size() - 1));
    }
    public static Object n(Iterable p0){
       Iterator iterator = p0.iterator();
       Object obj = iterator.next();
       if (!iterator.hasNext()) {
          return obj;
       }
       StringBuilder str = "expected one element but was: <"+obj;
       for (int i = 0; i < 4 && iterator.hasNext(); i = i + 1) {
          str = str+", "+iterator.next();
       }
       if (iterator.hasNext()) {
          str = str+", ...";
       }
       throw new IllegalArgumentException(str+'>');
    }
    public static int o(Iterable p0,o p1){
       return Iterators.n(p0.iterator(), p1);
    }
    public static Iterable p(Iterable p0,int p1){
       n.j(p0);
       boolean b = (p1 >= 0)? true: false;
       n.c(b, "limit is negative");
       return new y$d(p0, p1);
    }
    public static boolean q(Iterable p0,o p1){
       boolean b = false;
       if (p0 instanceof RandomAccess && p0 instanceof List) {
          n.j(p1);
          int i = 0;
          int i1 = 0;
          while (i < p0.size()) {
             Object obj = p0.get(i);
             if (!p1.apply(obj)) {
                if (i > i1) {
                   try{
                      p0.set(i1, obj);
                   }catch(java.lang.UnsupportedOperationException e0){
                      y.t(p0, p1, i1, e0);
                   }catch(java.lang.IllegalArgumentException e0){
                      y.t(p0, p1, i1, e0);
                   }
                }
                i1 = i1 + 1;
             }
             i = i + 1;
          }
          p0.subList(i1, p0.size()).clear();
          if (i != i1) {
             b = 1;
          }
          boolean b1 = b;
       }else {
          Iterator iterator = p0.iterator();
          n.j(p1);
          while (iterator.hasNext()) {
             if (p1.apply(iterator.next())) {
                iterator.remove();
                b = true;
             }
          }
          return b;
       }
    }
    public static int r(Iterable p0){
       int i = (p0 instanceof Collection)? p0.size(): Iterators.r(p0.iterator());
       return i;
    }
    public static Iterable s(Iterable p0,int p1){
       n.j(p0);
       boolean b = (p1 >= 0)? true: false;
       n.c(b, "number to skip cannot be negative");
       return new y$c(p0, p1);
    }
    public static void t(List p0,o p1,int p2,int p3){
       int i = p0.size();
       i = i - 1;
       while (i > p3) {
          if (p1.apply(p0.get(i))) {
             p0.remove(i);
          }
       }
       p3--;
       while (p3 >= p2) {
          p0.remove(p3);
       }
       return;
    }
    public static Object[] u(Iterable p0){
       return y.d(p0).toArray();
    }
    public static Object[] v(Iterable p0,Class p1){
       return y.w(p0, Array.newInstance(p1, 0));
    }
    public static Object[] w(Iterable p0,Object[] p1){
       return y.d(p0).toArray(p1);
    }
    public static Iterable x(Iterable p0,h p1){
       n.j(p0);
       n.j(p1);
       return new y$b(p0, p1);
    }
    public static Optional y(Iterable p0,o p1){
       return Iterators.t(p0.iterator(), p1);
    }
}
