package com.google.common.collect.Iterators;
import java.util.Collection;
import java.util.Iterator;
import java.lang.Object;
import ok.n;
import java.lang.IndexOutOfBoundsException;
import java.lang.StringBuilder;
import java.lang.String;
import com.google.common.collect.Iterators$e;
import ok.k;
import qk.t0;
import qk.u0;
import com.google.common.collect.Iterators$d;
import com.google.common.collect.Iterators$EmptyModifiableIterator;
import ok.o;
import com.google.common.collect.Iterators$b;
import qk.i0;
import com.google.common.collect.Iterators$f;
import com.google.common.primitives.Ints;
import ok.h;
import com.google.common.collect.Iterators$c;
import com.google.common.base.Optional;
import com.google.common.collect.Iterators$a;

public final class Iterators	// class@001814
{

    public static boolean a(Collection p0,Iterator p1){
       n.j(p0);
       n.j(p1);
       int i = 0;
       while (p1.hasNext()) {
          i = i | p0.add(p1.next());
       }
       return i;
    }
    public static int b(Iterator p0,int p1){
       n.j(p0);
       int i = 0;
       boolean b = (p1 >= 0)? true: false;
       n.c(b, "numberToAdvance must be nonnegative");
       for (; i < p1 && p0.hasNext(); i = i + 1) {
          p0.next();
       }
       return i;
    }
    public static void c(int p0){
       if (p0 >= 0) {
          return;
       }
       throw new IndexOutOfBoundsException("position \("+p0+"\) must not be negative");
    }
    public static void d(Iterator p0){
       n.j(p0);
       while (p0.hasNext()) {
          p0.next();
          p0.remove();
       }
       return;
    }
    public static Iterator e(Iterator p0){
       return new Iterators$e(p0);
    }
    public static boolean f(Iterator p0,Object p1){
       if (p1 == null) {
          while (p0.hasNext()) {
             if (p0.next() == null) {
                return true;
             }
          }
       }else {
          while (p0.hasNext()) {
             if (p1.equals(p0.next())) {
                return true;
             }
          }
       }
       return false;
    }
    public static boolean g(Iterator p0,Iterator p1){
       while (true) {
          if (!p0.hasNext()) {
             return (p1.hasNext() ^ 0x01);
          }
          if (!p1.hasNext()) {
             break ;
          }else if(!k.a(p0.next(), p1.next())){
             return false;
          }
       }
       return false;
    }
    public static t0 h(){
       return Iterators.i();
    }
    public static u0 i(){
       return Iterators$d.f;
    }
    public static Iterator j(){
       return Iterators$EmptyModifiableIterator.INSTANCE;
    }
    public static t0 k(Iterator p0,o p1){
       n.j(p0);
       n.j(p1);
       return new Iterators$b(p0, p1);
    }
    public static Object l(Iterator p0){
       Object obj;
       do {
          obj = p0.next();
       } while (!p0.hasNext());
       return obj;
    }
    public static Object m(Iterator p0,Object p1){
       if (p0.hasNext()) {
          p1 = p0.next();
       }
       return p1;
    }
    public static int n(Iterator p0,o p1){
       n.k(p1, "predicate");
       int i = 0;
       while (true) {
          if (!p0.hasNext()) {
             return -1;
          }
          if (p1.apply(p0.next())) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return i;
    }
    public static i0 o(Iterator p0){
       if (p0 instanceof Iterators$f) {
          return p0;
       }
       return new Iterators$f(p0);
    }
    public static Object p(Iterator p0){
       if (!p0.hasNext()) {
          return null;
       }
       p0.remove();
       return p0.next();
    }
    public static boolean q(Iterator p0,Collection p1){
       n.j(p1);
       boolean b = false;
       while (p0.hasNext()) {
          if (p1.contains(p0.next())) {
             p0.remove();
             b = true;
          }
       }
       return b;
    }
    public static int r(Iterator p0){
       long l = 0;
       while (p0.hasNext()) {
          p0.next();
          l = l + 1;
       }
       return Ints.d(l);
    }
    public static Iterator s(Iterator p0,h p1){
       n.j(p1);
       return new Iterators$c(p0, p1);
    }
    public static Optional t(Iterator p0,o p1){
       Object obj;
       n.j(p0);
       n.j(p1);
       while (true) {
          if (!p0.hasNext()) {
             return Optional.absent();
          }
          obj = p0.next();
          if (p1.apply(obj)) {
             break ;
          }
       }
       return Optional.of(obj);
    }
    public static t0 u(Iterator p0){
       n.j(p0);
       if (p0 instanceof t0) {
          return p0;
       }
       return new Iterators$a(p0);
    }
}
