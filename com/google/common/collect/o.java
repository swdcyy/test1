package com.google.common.collect.o;
import java.util.Set;
import com.google.common.collect.o$f;
import java.lang.Object;
import ok.n;
import com.google.common.collect.o$b;
import java.util.Collection;
import ok.o;
import java.util.SortedSet;
import com.google.common.collect.o$c;
import com.google.common.collect.e$a;
import com.google.common.base.Predicates;
import com.google.common.collect.o$d;
import java.util.Iterator;
import java.lang.Iterable;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableEnumSet;
import java.util.EnumSet;
import com.google.common.collect.o$a;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.Collections;
import java.util.HashSet;
import com.google.common.collect.e;
import com.google.common.collect.Iterators;
import com.google.common.collect.Maps;
import com.google.common.collect.k;

public final class o	// class@000535
{

    public static o$f a(Set p0,Set p1){
       n.k(p0, "set1");
       n.k(p1, "set2");
       return new o$b(p0, p1);
    }
    public static boolean b(Set p0,Object p1){
       boolean b = true;
       if (p0 == p1) {
          return b;
       }
       if (!p1 instanceof Set) {
          return false;
       }
       try{
          if (p0.size() != p1.size() || !p0.containsAll(p1)) {
             b = false;
          }
          return b;
       }catch(java.lang.NullPointerException e0){
       }catch(java.lang.ClassCastException e0){
       }
    }
    public static Set c(Set p0,o p1){
       o$d uod;
       if (p0 instanceof SortedSet) {
          if (p0 instanceof o$c) {
             uod = new o$d(p0.b, Predicates.b(p0.c, p1));
          }else {
             n.j(p0);
             n.j(p1);
             uod = new o$d(p0, p1);
          }
          return uod;
       }else if(p0 instanceof o$c){
          return new o$c(p0.b, Predicates.b(p0.c, p1));
       }else {
          n.j(p0);
          n.j(p1);
          return new o$c(p0, p1);
       }
    }
    public static int d(Set p0){
       Iterator iterator = p0.iterator();
       int i = 0;
       while (iterator.hasNext()) {
          Object obj = iterator.next();
          int i1 = (obj != null)? obj.hashCode(): 0;
          i = i + i1;
          i = ~ i;
          i = ~ i;
       }
       return i;
    }
    public static ImmutableSet e(Iterable p0){
       if (p0 instanceof ImmutableEnumSet) {
          return p0;
       }
       if (p0.isEmpty()) {
          return ImmutableSet.of();
       }
       return ImmutableEnumSet.asImmutable(EnumSet.copyOf(p0));
    }
    public static o$f f(Set p0,Set p1){
       n.k(p0, "set1");
       n.k(p1, "set2");
       return new o$a(p0, p1);
    }
    public static Set g(){
       return Collections.newSetFromMap(new ConcurrentHashMap());
    }
    public static HashSet h(){
       return new HashSet();
    }
    public static HashSet i(Iterable p0){
       HashSet hashSet = (p0 instanceof Collection)? new HashSet(e.a(p0)): o.j(p0.iterator());
       return hashSet;
    }
    public static HashSet j(Iterator p0){
       HashSet hashSet = o.h();
       Iterators.a(hashSet, p0);
       return hashSet;
    }
    public static HashSet k(Object[] p0){
       HashSet hashSet = o.l(p0.length);
       Collections.addAll(hashSet, p0);
       return hashSet;
    }
    public static HashSet l(int p0){
       return new HashSet(Maps.c(p0));
    }
    public static boolean m(Set p0,Collection p1){
       Set set;
       n.j(p1);
       if (p1 instanceof k) {
          set = p1.elementSet();
       }
       if (set instanceof Set && set.size() > p0.size()) {
          return Iterators.q(p0.iterator(), set);
       }else {
          return o.n(p0, set.iterator());
       }
    }
    public static boolean n(Set p0,Iterator p1){
       int i = 0;
       while (p1.hasNext()) {
          i = i | p0.remove(p1.next());
       }
       return i;
    }
}
