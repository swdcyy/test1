package com.google.common.graph.Graphs;
import java.lang.String;
import ok.n;
import rk.t;
import java.util.Set;
import java.util.HashMap;
import com.google.common.collect.Maps;
import java.util.Iterator;
import java.lang.Object;
import java.util.Map;
import com.google.common.graph.Graphs$NodeVisitState;
import ok.k;

public final class Graphs	// class@0018d7
{

    public static int a(int p0){
       boolean b = (p0 >= 0)? true: false;
       n.d(b, "Not true that %s is non-negative.", p0);
       return p0;
    }
    public static long b(long p0){
       boolean b = (p0 >= 0)? true: false;
       n.e(b, "Not true that %s is non-negative.", p0);
       return p0;
    }
    public static int c(int p0){
       boolean b = (p0 > 0)? true: false;
       n.d(b, "Not true that %s is positive.", p0);
       return p0;
    }
    public static boolean d(t p0){
       int i = p0.h().size();
       if (!i) {
          return false;
       }
       if (!p0.d() && i >= p0.f().size()) {
          return true;
       }
       HashMap hashMap = Maps.t(p0.f().size());
       Iterator iterator = p0.f().iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return false;
          }
          if (Graphs.e(p0, hashMap, iterator.next(), null)) {
             break ;
          }
       }
       return true;
    }
    public static boolean e(t p0,Map p1,Object p2,Object p3){
       Graphs$NodeVisitState nodeVisitSta = p1.get(p2);
       if (nodeVisitSta == Graphs$NodeVisitState.COMPLETE) {
          return false;
       }
       Graphs$NodeVisitState pENDING = Graphs$NodeVisitState.PENDING;
       if (nodeVisitSta == pENDING) {
          return true;
       }
       p1.put(p2, pENDING);
       Iterator iterator = p0.b(p2).iterator();
       while (true) {
          if (iterator.hasNext()) {
             Object obj = iterator.next();
             boolean b = (p0.d() || !k.a(p3, obj))? true: false;
             if (b && Graphs.e(p0, p1, obj, p2)) {
                break ;
             }
          }else {
             p1.put(p2, Graphs$NodeVisitState.COMPLETE);
             return false;
          }
       }
       return true;
    }
}
