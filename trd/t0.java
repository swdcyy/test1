package trd.t0;
import trd.s0;
import java.util.Map;
import msd.l;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.Boolean;
import java.lang.Iterable;
import java.util.Collection;
import java.util.List;
import kotlin.Pair;
import wsd.m;
import msd.a;
import trd.r0;
import java.util.HashMap;
import trd.y;
import java.util.Objects;
import kotlin.collections.EmptyMap;
import nsd.s0;

public class t0 extends s0	// class@002585
{

    public void t0(){
       super();
    }
    public static final Map A(Map p0,l p1){
       a.p(p0, "$this$filter");
       a.p(p1, "predicate");
       LinkedHashMap linkedHashMa = new LinkedHashMap();
       Iterator iterator = p0.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          if (p1.invoke(uEntry).booleanValue()) {
             linkedHashMa.put(uEntry.getKey(), uEntry.getValue());
          }
       }
       return linkedHashMa;
    }
    public static final void A0(Map p0,Object p1,Object p2){
       a.p(p0, "$this$set");
       p0.put(p1, p2);
    }
    public static final Map B(Map p0,l p1){
       a.p(p0, "$this$filterKeys");
       a.p(p1, "predicate");
       LinkedHashMap linkedHashMa = new LinkedHashMap();
       Iterator iterator = p0.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          if (p1.invoke(uEntry.getKey()).booleanValue()) {
             linkedHashMa.put(uEntry.getKey(), uEntry.getValue());
          }
       }
       return linkedHashMa;
    }
    public static final Map B0(Iterable p0){
       Map map;
       Pair pair;
       a.p(p0, "$this$toMap");
       if (!p0 instanceof Collection) {
          return t0.k0(t0.C0(p0, new LinkedHashMap()));
       }
       Collection uCollection = p0;
       int i = uCollection.size();
       if (i) {
          if (i != 1) {
             map = t0.C0(p0, new LinkedHashMap(s0.j(uCollection.size())));
          }else if(p0 instanceof List){
             pair = p0.get(0);
          }else {
             pair = p0.iterator().next();
          }
          map = s0.k(pair);
       }else {
          map = t0.z();
       }
       return map;
    }
    public static final Map C(Map p0,l p1){
       a.p(p0, "$this$filterNot");
       a.p(p1, "predicate");
       LinkedHashMap linkedHashMa = new LinkedHashMap();
       Iterator iterator = p0.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          if (!p1.invoke(uEntry).booleanValue()) {
             linkedHashMa.put(uEntry.getKey(), uEntry.getValue());
          }
       }
       return linkedHashMa;
    }
    public static final Map C0(Iterable p0,Map p1){
       a.p(p0, "$this$toMap");
       a.p(p1, "destination");
       t0.w0(p1, p0);
       return p1;
    }
    public static final Map D(Map p0,Map p1,l p2){
       a.p(p0, "$this$filterNotTo");
       a.p(p1, "destination");
       a.p(p2, "predicate");
       Iterator iterator = p0.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          if (!p2.invoke(uEntry).booleanValue()) {
             p1.put(uEntry.getKey(), uEntry.getValue());
          }
       }
       return p1;
    }
    public static final Map D0(Map p0){
       a.p(p0, "$this$toMap");
       int i = p0.size();
       if (i) {
          p0 = (i != 1)? t0.J0(p0): s0.o(p0);
       }else {
          p0 = t0.z();
       }
       return p0;
    }
    public static final Map E(Map p0,Map p1,l p2){
       a.p(p0, "$this$filterTo");
       a.p(p1, "destination");
       a.p(p2, "predicate");
       Iterator iterator = p0.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          if (p2.invoke(uEntry).booleanValue()) {
             p1.put(uEntry.getKey(), uEntry.getValue());
          }
       }
       return p1;
    }
    public static final Map E0(Map p0,Map p1){
       a.p(p0, "$this$toMap");
       a.p(p1, "destination");
       p1.putAll(p0);
       return p1;
    }
    public static final Map F(Map p0,l p1){
       a.p(p0, "$this$filterValues");
       a.p(p1, "predicate");
       LinkedHashMap linkedHashMa = new LinkedHashMap();
       Iterator iterator = p0.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          if (p1.invoke(uEntry.getValue()).booleanValue()) {
             linkedHashMa.put(uEntry.getKey(), uEntry.getValue());
          }
       }
       return linkedHashMa;
    }
    public static final Map F0(m p0){
       a.p(p0, "$this$toMap");
       return t0.k0(t0.G0(p0, new LinkedHashMap()));
    }
    public static final Object G(Map p0,Object p1){
       a.p(p0, "$this$get");
       return p0.get(p1);
    }
    public static final Map G0(m p0,Map p1){
       a.p(p0, "$this$toMap");
       a.p(p1, "destination");
       t0.x0(p1, p0);
       return p1;
    }
    public static final Object H(Map p0,Object p1,a p2){
       p0 = p0.get(p1);
       if (p0 != null) {
       }else {
          p0 = p2.invoke();
       }
       return p0;
    }
    public static final Map H0(Pair[] p0){
       Map map;
       a.p(p0, "$this$toMap");
       int len = p0.length;
       if (len) {
          map = (len != 1)? t0.I0(p0, new LinkedHashMap(s0.j(p0.length))): s0.k(p0[0]);
       }else {
          map = t0.z();
       }
       return map;
    }
    public static final Object I(Map p0,Object p1,a p2){
       a.p(p0, "$this$getOrElseNullable");
       a.p(p2, "defaultValue");
       Object obj = p0.get(p1);
       if (obj == null && !p0.containsKey(p1)) {
          return p2.invoke();
       }
       return obj;
    }
    public static final Map I0(Pair[] p0,Map p1){
       a.p(p0, "$this$toMap");
       a.p(p1, "destination");
       t0.y0(p1, p0);
       return p1;
    }
    public static final Object J(Map p0,Object p1,a p2){
       a.p(p0, "$this$getOrPut");
       a.p(p2, "defaultValue");
       Object obj = p0.get(p1);
       if (obj == null) {
          obj = p2.invoke();
          p0.put(p1, obj);
       }
       return obj;
    }
    public static final Map J0(Map p0){
       a.p(p0, "$this$toMutableMap");
       return new LinkedHashMap(p0);
    }
    public static final Object K(Map p0,Object p1){
       a.p(p0, "$this$getValue");
       return r0.a(p0, p1);
    }
    public static final Pair K0(Map$Entry p0){
       return new Pair(p0.getKey(), p0.getValue());
    }
    public static final HashMap L(){
       return new HashMap();
    }
    public static final HashMap M(Pair[] p0){
       a.p(p0, "pairs");
       HashMap hashMap = new HashMap(s0.j(p0.length));
       t0.y0(hashMap, p0);
       return hashMap;
    }
    public static final Object N(Map p0,a p1){
       if (p0.isEmpty()) {
          p0 = p1.invoke();
       }
       return p0;
    }
    public static final boolean O(Map p0){
       return (p0.isEmpty() ^ 0x01);
    }
    public static final boolean P(Map p0){
       boolean b = (p0 == null || p0.isEmpty())? true: false;
       return b;
    }
    public static final Iterator Q(Map p0){
       a.p(p0, "$this$iterator");
       return p0.entrySet().iterator();
    }
    public static final LinkedHashMap R(){
       return new LinkedHashMap();
    }
    public static final LinkedHashMap S(Pair[] p0){
       a.p(p0, "pairs");
       return t0.I0(p0, new LinkedHashMap(s0.j(p0.length)));
    }
    public static final Map T(Map p0,l p1){
       a.p(p0, "$this$mapKeys");
       a.p(p1, "transform");
       LinkedHashMap linkedHashMa = new LinkedHashMap(s0.j(p0.size()));
       Iterator iterator = p0.entrySet().iterator();
       while (iterator.hasNext()) {
          Object obj = iterator.next();
          Map$Entry uEntry = p1.invoke(obj);
          linkedHashMa.put(uEntry, obj.getValue());
       }
       return linkedHashMa;
    }
    public static final Map U(Map p0,Map p1,l p2){
       a.p(p0, "$this$mapKeysTo");
       a.p(p1, "destination");
       a.p(p2, "transform");
       Iterator iterator = p0.entrySet().iterator();
       while (iterator.hasNext()) {
          Object obj = iterator.next();
          Map$Entry uEntry = p2.invoke(obj);
          p1.put(uEntry, obj.getValue());
       }
       return p1;
    }
    public static final Map V(){
       return t0.z();
    }
    public static final Map W(Pair[] p0){
       a.p(p0, "pairs");
       Map map = (p0.length > 0)? t0.I0(p0, new LinkedHashMap(s0.j(p0.length))): t0.z();
       return map;
    }
    public static final Map X(Map p0,l p1){
       a.p(p0, "$this$mapValues");
       a.p(p1, "transform");
       LinkedHashMap linkedHashMa = new LinkedHashMap(s0.j(p0.size()));
       Iterator iterator = p0.entrySet().iterator();
       while (iterator.hasNext()) {
          Object obj = iterator.next();
          linkedHashMa.put(obj.getKey(), p1.invoke(obj));
       }
       return linkedHashMa;
    }
    public static final Map Y(Map p0,Map p1,l p2){
       a.p(p0, "$this$mapValuesTo");
       a.p(p1, "destination");
       a.p(p2, "transform");
       Iterator iterator = p0.entrySet().iterator();
       while (iterator.hasNext()) {
          Object obj = iterator.next();
          p1.put(obj.getKey(), p2.invoke(obj));
       }
       return p1;
    }
    public static final Map Z(Map p0,Iterable p1){
       a.p(p0, "$this$minus");
       a.p(p1, "keys");
       p0 = t0.J0(p0);
       y.G0(p0.keySet(), p1);
       return t0.k0(p0);
    }
    public static final Map a0(Map p0,Object p1){
       a.p(p0, "$this$minus");
       p0 = t0.J0(p0);
       p0.remove(p1);
       return t0.k0(p0);
    }
    public static final Map b0(Map p0,m p1){
       a.p(p0, "$this$minus");
       a.p(p1, "keys");
       p0 = t0.J0(p0);
       y.I0(p0.keySet(), p1);
       return t0.k0(p0);
    }
    public static final Map c0(Map p0,Object[] p1){
       a.p(p0, "$this$minus");
       a.p(p1, "keys");
       p0 = t0.J0(p0);
       y.J0(p0.keySet(), p1);
       return t0.k0(p0);
    }
    public static final void d0(Map p0,Iterable p1){
       a.p(p0, "$this$minusAssign");
       y.G0(p0.keySet(), p1);
    }
    public static final void e0(Map p0,Object p1){
       a.p(p0, "$this$minusAssign");
       p0.remove(p1);
    }
    public static final void f0(Map p0,m p1){
       a.p(p0, "$this$minusAssign");
       y.I0(p0.keySet(), p1);
    }
    public static final void g0(Map p0,Object[] p1){
       a.p(p0, "$this$minusAssign");
       y.J0(p0.keySet(), p1);
    }
    public static final Iterator h0(Map p0){
       a.p(p0, "$this$iterator");
       return p0.entrySet().iterator();
    }
    public static final Map i0(){
       return new LinkedHashMap();
    }
    public static final Map j0(Pair[] p0){
       a.p(p0, "pairs");
       LinkedHashMap linkedHashMa = new LinkedHashMap(s0.j(p0.length));
       t0.y0(linkedHashMa, p0);
       return linkedHashMa;
    }
    public static final Map k0(Map p0){
       a.p(p0, "$this$optimizeReadOnlyMap");
       int i = p0.size();
       if (i) {
          if (i == 1) {
             p0 = s0.o(p0);
          }
       }else {
          p0 = t0.z();
       }
       return p0;
    }
    public static final Map l0(Map p0){
       if (p0 != null) {
       }else {
          p0 = t0.z();
       }
       return p0;
    }
    public static final Map m0(Map p0,Iterable p1){
       a.p(p0, "$this$plus");
       a.p(p1, "pairs");
       if (p0.isEmpty()) {
          p0 = t0.B0(p1);
       }else {
          LinkedHashMap linkedHashMa = new LinkedHashMap(p0);
          t0.w0(linkedHashMa, p1);
          LinkedHashMap linkedHashMa1 = linkedHashMa;
       }
       return p0;
    }
    public static final Map n0(Map p0,Map p1){
       a.p(p0, "$this$plus");
       a.p(p1, "map");
       LinkedHashMap linkedHashMa = new LinkedHashMap(p0);
       linkedHashMa.putAll(p1);
       return linkedHashMa;
    }
    public static final Map o0(Map p0,Pair p1){
       a.p(p0, "$this$plus");
       a.p(p1, "pair");
       if (p0.isEmpty()) {
          p0 = s0.k(p1);
       }else {
          LinkedHashMap linkedHashMa = new LinkedHashMap(p0);
          linkedHashMa.put(p1.getFirst(), p1.getSecond());
          LinkedHashMap linkedHashMa1 = linkedHashMa;
       }
       return p0;
    }
    public static final Map p0(Map p0,m p1){
       a.p(p0, "$this$plus");
       a.p(p1, "pairs");
       LinkedHashMap linkedHashMa = new LinkedHashMap(p0);
       t0.x0(linkedHashMa, p1);
       return t0.k0(linkedHashMa);
    }
    public static final Map q0(Map p0,Pair[] p1){
       a.p(p0, "$this$plus");
       a.p(p1, "pairs");
       if (p0.isEmpty()) {
          p0 = t0.H0(p1);
       }else {
          LinkedHashMap linkedHashMa = new LinkedHashMap(p0);
          t0.y0(linkedHashMa, p1);
          LinkedHashMap linkedHashMa1 = linkedHashMa;
       }
       return p0;
    }
    public static final void r0(Map p0,Iterable p1){
       a.p(p0, "$this$plusAssign");
       t0.w0(p0, p1);
    }
    public static final Map s(int p0,l p1){
       Map map = s0.h(p0);
       p1.invoke(map);
       return s0.d(map);
    }
    public static final void s0(Map p0,Map p1){
       a.p(p0, "$this$plusAssign");
       p0.putAll(p1);
    }
    public static final Map t(l p0){
       Map map = s0.g();
       p0.invoke(map);
       return s0.d(map);
    }
    public static final void t0(Map p0,Pair p1){
       a.p(p0, "$this$plusAssign");
       p0.put(p1.getFirst(), p1.getSecond());
    }
    public static final Object u(Map$Entry p0){
       a.p(p0, "$this$component1");
       return p0.getKey();
    }
    public static final void u0(Map p0,m p1){
       a.p(p0, "$this$plusAssign");
       t0.x0(p0, p1);
    }
    public static final Object v(Map$Entry p0){
       a.p(p0, "$this$component2");
       return p0.getValue();
    }
    public static final void v0(Map p0,Pair[] p1){
       a.p(p0, "$this$plusAssign");
       t0.y0(p0, p1);
    }
    public static final boolean w(Map p0,Object p1){
       a.p(p0, "$this$contains");
       return p0.containsKey(p1);
    }
    public static final void w0(Map p0,Iterable p1){
       a.p(p0, "$this$putAll");
       a.p(p1, "pairs");
       Iterator iterator = p1.iterator();
       while (iterator.hasNext()) {
          Pair pair = iterator.next();
          Object obj = pair.component1();
          p0.put(obj, pair.component2());
       }
       return;
    }
    public static final boolean x(Map p0,Object p1){
       Objects.requireNonNull(p0, "null cannot be cast to non-null type kotlin.collections.Map<K, *>");
       return p0.containsKey(p1);
    }
    public static final void x0(Map p0,m p1){
       a.p(p0, "$this$putAll");
       a.p(p1, "pairs");
       Iterator iterator = p1.iterator();
       while (iterator.hasNext()) {
          Pair pair = iterator.next();
          Object obj = pair.component1();
          p0.put(obj, pair.component2());
       }
       return;
    }
    public static final boolean y(Map p0,Object p1){
       return p0.containsValue(p1);
    }
    public static final void y0(Map p0,Pair[] p1){
       a.p(p0, "$this$putAll");
       a.p(p1, "pairs");
       int len = p1.length;
       for (int i = 0; i < len; i = i + 1) {
          object oobject = p1[i];
          Object obj = oobject.component1();
          p0.put(obj, oobject.component2());
       }
       return;
    }
    public static final Map z(){
       EmptyMap iNSTANCE = EmptyMap.INSTANCE;
       Objects.requireNonNull(iNSTANCE, "null cannot be cast to non-null type kotlin.collections.Map<K, V>");
       return iNSTANCE;
    }
    public static final Object z0(Map p0,Object p1){
       Objects.requireNonNull(p0, "null cannot be cast to non-null type kotlin.collections.MutableMap<K, V>");
       return s0.k(p0).remove(p1);
    }
}
