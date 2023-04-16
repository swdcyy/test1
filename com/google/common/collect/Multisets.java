package com.google.common.collect.Multisets;
import java.lang.Iterable;
import com.google.common.collect.k;
import java.lang.Object;
import java.util.Set;
import java.util.Iterator;
import com.google.common.collect.k$a;

public final class Multisets	// class@001862
{

    public static k a(Iterable p0){
       return p0;
    }
    public static boolean b(k p0,Object p1){
       if (p1 == p0) {
          return true;
       }
       if (p1 instanceof k && (p0.size() != p1.size() || p0.entrySet().size() != p1.entrySet().size())) {
          return false;
       }
       p1 = p1.entrySet().iterator();
       while (true) {
          if (!p1.hasNext()) {
             return true;
          }
          k$a uoa = p1.next();
          if (p0.count(uoa.getElement()) != uoa.getCount()) {
             break ;
          }
       }
       return false;
    }
}
