package com.google.common.collect.Maps;
import java.util.Map;
import java.lang.String;
import java.lang.StringBuilder;
import com.google.common.collect.e;
import java.util.Set;
import java.util.Iterator;
import java.lang.Object;
import java.util.Map$Entry;
import java.lang.Iterable;
import ok.h;
import com.google.common.collect.ImmutableMap;
import ok.n;
import com.google.common.collect.ImmutableMap$b;
import java.lang.IllegalArgumentException;
import java.util.SortedMap;
import java.util.Collections;
import com.google.common.collect.Maps$EntryFunction;
import com.google.common.collect.Maps$b;
import ok.o;
import com.google.common.base.Predicates;
import com.google.common.collect.Maps$e;
import com.google.common.collect.Maps$c;
import qk.g;
import com.google.common.collect.f;
import java.util.Comparator;
import com.google.common.collect.Ordering;
import java.util.TreeMap;
import com.google.common.base.Equivalence;
import com.google.common.collect.Maps$q;
import java.util.LinkedHashMap;
import com.google.common.collect.Maps$n;
import com.google.common.collect.Maps$r;
import com.google.common.collect.Maps$d;
import com.google.common.collect.Maps$i;
import com.google.common.collect.Maps$j;
import com.google.common.collect.ImmutableEntry;
import java.util.Collection;
import java.lang.Integer;
import com.google.common.collect.Maps$a;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.Class;
import java.util.EnumMap;
import java.util.HashMap;

public final class Maps	// class@00050b
{

    public static String A(Map p0){
       StringBuilder str = e.d(p0.size())+'{';
       Iterator iterator = p0.entrySet().iterator();
       String str1 = 1;
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          if (!str1) {
             str = str+", ";
          }
          str1 = null;
          str = str+uEntry.getKey()+'='+uEntry.getValue();
       }
       return str+'}';
    }
    public static ImmutableMap B(Iterable p0,h p1){
       Iterator iterator = p0.iterator();
       n.j(p1);
       ImmutableMap$b uob = ImmutableMap.builder();
       while (iterator.hasNext()) {
          Object obj = iterator.next();
          uob.c(p1.apply(obj), obj);
       }
       try{
          return uob.a();
       }catch(java.lang.IllegalArgumentException e3){
          throw new IllegalArgumentException(e3.getMessage()+". To index multiple values under a key, use Multimaps.index.");
       }
    }
    public static Map C(Map p0){
       if (p0 instanceof SortedMap) {
          return Collections.unmodifiableSortedMap(p0);
       }
       return Collections.unmodifiableMap(p0);
    }
    public static h D(){
       return Maps$EntryFunction.VALUE;
    }
    public static Iterator E(Iterator p0){
       return new Maps$b(p0);
    }
    public static o F(o p0){
       return Predicates.c(p0, Maps.D());
    }
    public static Map a(Set p0,h p1){
       return new Maps$e(p0, p1);
    }
    public static Iterator b(Set p0,h p1){
       return new Maps$c(p0.iterator(), p1);
    }
    public static int c(int p0){
       if (p0 < 3) {
          g.b(p0, "expectedSize");
          p0++;
          return p0;
       }else if(p0 < 0x40000000){
          return (int)(((float)p0 / 0x3f400000) + 0x3f800000);
       }else {
          return Integer.MAX_VALUE;
       }
    }
    public static f d(Map p0,Map p1){
       if (p0 instanceof SortedMap) {
          Object obj = p0;
          n.j(obj);
          n.j(p1);
          Comparator uComparator = obj.comparator();
          if (uComparator == null) {
             uComparator = Ordering.natural();
          }
          TreeMap treeMap = Maps.w(uComparator);
          TreeMap treeMap1 = Maps.w(uComparator);
          treeMap1.putAll(p1);
          TreeMap treeMap2 = Maps.w(uComparator);
          TreeMap treeMap3 = Maps.w(uComparator);
          Maps.e(obj, p1, Equivalence.equals(), treeMap, treeMap1, treeMap2, treeMap3);
          return new Maps$q(treeMap, treeMap1, treeMap2, treeMap3);
       }else {
          Equivalence uEquivalence = Equivalence.equals();
          n.j(uEquivalence);
          LinkedHashMap linkedHashMa = Maps.u();
          LinkedHashMap linkedHashMa1 = new LinkedHashMap(p1);
          LinkedHashMap linkedHashMa2 = Maps.u();
          LinkedHashMap linkedHashMa3 = Maps.u();
          Maps.e(p0, p1, uEquivalence, linkedHashMa, linkedHashMa1, linkedHashMa2, linkedHashMa3);
          return new Maps$n(linkedHashMa, linkedHashMa1, linkedHashMa2, linkedHashMa3);
       }
    }
    public static void e(Map p0,Map p1,Equivalence p2,Map p3,Map p4,Map p5,Map p6){
       Iterator iterator = p0.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          Object key = uEntry.getKey();
          Object value = uEntry.getValue();
          if (p1.containsKey(key)) {
             Object obj = p4.remove(key);
             if (p2.equivalent(value, obj)) {
                p5.put(key, value);
             }else {
                p6.put(key, new Maps$r(value, obj));
             }
          }else {
             p3.put(key, value);
          }
       }
       return;
    }
    public static boolean f(Map p0,Object p1){
       if (p0 == p1) {
          return true;
       }
       if (p1 instanceof Map) {
          return p0.entrySet().equals(p1.entrySet());
       }
       return false;
    }
    public static Map g(Map p0,o p1){
       n.j(p1);
       if (p0 instanceof Maps$d) {
          p0 = Maps.h(p0, p1);
       }else {
          n.j(p0);
          Maps$i oi = new Maps$i(p0, p1);
       }
       return p0;
    }
    public static Map h(Maps$d p0,o p1){
       return new Maps$i(p0.e, Predicates.b(p0.f, p1));
    }
    public static Map i(Map p0,o p1){
       n.j(p1);
       o oo = Maps.p(p1);
       if (p0 instanceof Maps$d) {
          p0 = Maps.h(p0, oo);
       }else {
          n.j(p0);
          Maps$j oj = new Maps$j(p0, p1, oo);
       }
       return p0;
    }
    public static Map j(Map p0,o p1){
       return Maps.g(p0, Maps.F(p1));
    }
    public static Map$Entry k(Object p0,Object p1){
       return new ImmutableEntry(p0, p1);
    }
    public static ImmutableMap l(Collection p0){
       ImmutableMap$b uob = new ImmutableMap$b(p0.size());
       Iterator iterator = p0.iterator();
       int i = 0;
       while (iterator.hasNext()) {
          int i1 = i + 1;
          uob.c(iterator.next(), Integer.valueOf(i));
          i = i1;
       }
       return uob.a();
    }
    public static h m(){
       return Maps$EntryFunction.KEY;
    }
    public static Iterator n(Iterator p0){
       return new Maps$a(p0);
    }
    public static Object o(Map$Entry p0){
       p0 = (p0 == null)? null: p0.getKey();
       return p0;
    }
    public static o p(o p0){
       return Predicates.c(p0, Maps.m());
    }
    public static ConcurrentMap q(){
       return new ConcurrentHashMap();
    }
    public static EnumMap r(Class p0){
       n.j(p0);
       return new EnumMap(p0);
    }
    public static HashMap s(){
       return new HashMap();
    }
    public static HashMap t(int p0){
       return new HashMap(Maps.c(p0));
    }
    public static LinkedHashMap u(){
       return new LinkedHashMap();
    }
    public static LinkedHashMap v(int p0){
       return new LinkedHashMap(Maps.c(p0));
    }
    public static TreeMap w(Comparator p0){
       return new TreeMap(p0);
    }
    public static boolean x(Map p0,Object p1){
       try{
          n.j(p0);
          return p0.containsKey(p1);
       }catch(java.lang.ClassCastException e0){
          return false;
       }catch(java.lang.NullPointerException e0){
       }
    }
    public static Object y(Map p0,Object p1){
       try{
          n.j(p0);
          return p0.get(p1);
       }catch(java.lang.ClassCastException e0){
          return null;
       }catch(java.lang.NullPointerException e0){
       }
    }
    public static Object z(Map p0,Object p1){
       try{
          n.j(p0);
          return p0.remove(p1);
       }catch(java.lang.ClassCastException e0){
          return null;
       }catch(java.lang.NullPointerException e0){
       }
    }
}
