package com.google.common.collect.e;
import java.lang.Iterable;
import java.util.Collection;
import java.util.Iterator;
import java.lang.Object;
import ok.o;
import com.google.common.collect.e$a;
import com.google.common.base.Predicates;
import ok.n;
import java.lang.StringBuilder;
import java.lang.String;
import qk.g;
import java.lang.Math;
import ok.h;
import com.google.common.collect.e$b;

public final class e	// class@00052c
{

    public static Collection a(Iterable p0){
       return p0;
    }
    public static boolean b(Collection p0,Collection p1){
       Iterator iterator = p1.iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return true;
          }
          if (!p0.contains(iterator.next())) {
             break ;
          }
       }
       return false;
    }
    public static Collection c(Collection p0,o p1){
       if (p0 instanceof e$a) {
          return new e$a(p0.b, Predicates.b(p0.c, p1));
       }
       n.j(p0);
       n.j(p1);
       return new e$a(p0, p1);
    }
    public static StringBuilder d(int p0){
       g.b(p0, "size");
       return new StringBuilder((int)Math.min(((long)p0 * 8), 0x40000000));
    }
    public static boolean e(Collection p0,Object p1){
       try{
          n.j(p0);
          return p0.contains(p1);
       }catch(java.lang.ClassCastException e0){
          return false;
       }catch(java.lang.NullPointerException e0){
       }
    }
    public static Collection f(Collection p0,h p1){
       return new e$b(p0, p1);
    }
}
