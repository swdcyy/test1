package kotlin.collections.CollectionsKt___CollectionsKt;
import trd.a0;
import java.lang.Iterable;
import java.util.List;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import msd.p;
import java.util.ListIterator;
import java.util.Comparator;
import msd.l;
import java.util.Iterator;
import java.lang.UnsupportedOperationException;
import java.util.Collection;
import java.lang.Character;
import msd.q;
import java.lang.Integer;
import java.lang.Comparable;
import java.lang.Double;
import java.lang.Number;
import java.lang.Math;
import fsd.l;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.lang.ArithmeticException;
import java.lang.Float;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.util.HashSet;
import trd.u;
import trd.s0;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.ArrayList;
import trd.t;
import java.lang.Boolean;
import trd.e0;
import kotlin.collections.CollectionsKt___CollectionsKt$b;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import trd.c1;
import trd.d1;
import java.util.RandomAccess;
import trd.y;
import usd.q;
import kotlin.collections.SlidingWindowKt;
import ssd.e;
import trd.v0;
import kotlin.collections.CollectionsKt___CollectionsKt$elementAt$1;
import java.lang.Appendable;
import java.lang.CharSequence;
import zsd.n;
import trd.j0;
import kotlin.collections.CollectionsKt___CollectionsKt$withIndex$1;
import msd.a;
import kotlin.Pair;
import qrd.r0;
import usd.k;
import xrd.b$b;
import trd.x;
import xrd.b$d;
import wsd.m;
import kotlin.sequences.SequencesKt___SequencesKt;
import xrd.b;
import kotlin.collections.ArraysKt___ArraysKt;
import java.util.Objects;
import trd.n;
import kotlin.collections.CollectionsKt___CollectionsKt$a;
import qrd.x0;
import qrd.b1;

public class CollectionsKt___CollectionsKt extends a0	// class@001c6c
{

    public void CollectionsKt___CollectionsKt(){
       super();
    }
    public static final List A1(Iterable p0,int p1){
       a.p(p0, "$this$chunked");
       return CollectionsKt___CollectionsKt.O5(p0, p1, p1, true);
    }
    public static final Object A2(List p0,Object p1,p p2){
       a.p(p0, "$this$foldRight");
       a.p(p2, "operation");
       if (!p0.isEmpty()) {
          ListIterator listIterator = p0.listIterator(p0.size());
          while (listIterator.hasPrevious()) {
             p1 = p2.invoke(listIterator.previous(), p1);
          }
       }
       return p1;
    }
    public static final Object A3(Iterable p0,Comparator p1,l p2){
       Iterator iterator = p0.iterator();
       if (!iterator.hasNext()) {
          return null;
       }
       Object obj = p2.invoke(iterator.next());
       while (iterator.hasNext()) {
          Object obj1 = p2.invoke(iterator.next());
          if (p1.compare(obj, obj1) < 0) {
             obj = obj1;
          }
       }
       return obj;
    }
    public static final Object A4(List p0,p p1){
       a.p(p0, "$this$reduceRight");
       a.p(p1, "operation");
       ListIterator listIterator = p0.listIterator(p0.size());
       if (!listIterator.hasPrevious()) {
          throw new UnsupportedOperationException("Empty list can\'t be reduced.");
       }
       Object obj = listIterator.previous();
       while (listIterator.hasPrevious()) {
          obj = p1.invoke(listIterator.previous(), obj);
       }
       return obj;
    }
    public static final char[] A5(Collection p0){
       a.p(p0, "$this$toCharArray");
       char[] uocharArray = new char[p0.size()];
       Iterator iterator = p0.iterator();
       int i = 0;
       while (iterator.hasNext()) {
          int i1 = i + 1;
          uocharArray[i] = iterator.next().charValue();
          i = i1;
       }
       return uocharArray;
    }
    public static final List B1(Iterable p0,int p1,l p2){
       a.p(p0, "$this$chunked");
       a.p(p2, "transform");
       return CollectionsKt___CollectionsKt.P5(p0, p1, p1, true, p2);
    }
    public static final Object B2(List p0,Object p1,q p2){
       a.p(p0, "$this$foldRightIndexed");
       a.p(p2, "operation");
       if (!p0.isEmpty()) {
          ListIterator listIterator = p0.listIterator(p0.size());
          while (listIterator.hasPrevious()) {
             p1 = p2.invoke(Integer.valueOf(listIterator.previousIndex()), listIterator.previous(), p1);
          }
       }
       return p1;
    }
    public static final Comparable B3(Iterable p0){
       a.p(p0, "$this$maxOrNull");
       Iterator iterator = p0.iterator();
       if (!iterator.hasNext()) {
          return null;
       }
       Comparable uComparable = iterator.next();
       while (iterator.hasNext()) {
          Comparable uComparable1 = iterator.next();
          if (uComparable.compareTo(uComparable1) < 0) {
             uComparable = uComparable1;
          }
       }
       return uComparable;
    }
    public static final Object B4(List p0,q p1){
       a.p(p0, "$this$reduceRightIndexed");
       a.p(p1, "operation");
       ListIterator listIterator = p0.listIterator(p0.size());
       if (!listIterator.hasPrevious()) {
          throw new UnsupportedOperationException("Empty list can\'t be reduced.");
       }
       Object obj = listIterator.previous();
       while (listIterator.hasPrevious()) {
          obj = p1.invoke(Integer.valueOf(listIterator.previousIndex()), listIterator.previous(), obj);
       }
       return obj;
    }
    public static final Collection B5(Iterable p0,Collection p1){
       a.p(p0, "$this$toCollection");
       a.p(p1, "destination");
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          p1.add(iterator.next());
       }
       return p1;
    }
    public static final Object C1(List p0){
       a.p(p0, "$this$component1");
       return p0.get(0);
    }
    public static final void C2(Iterable p0,l p1){
       a.p(p0, "$this$forEach");
       a.p(p1, "action");
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          p1.invoke(iterator.next());
       }
       return;
    }
    public static final Double C3(Iterable p0){
       a.p(p0, "$this$maxOrNull");
       Iterator iterator = p0.iterator();
       if (!iterator.hasNext()) {
          return null;
       }
       double d = iterator.next().doubleValue();
       while (iterator.hasNext()) {
          d = Math.max(d, iterator.next().doubleValue());
       }
       return Double.valueOf(d);
    }
    public static final Object C4(List p0,q p1){
       a.p(p0, "$this$reduceRightIndexedOrNull");
       a.p(p1, "operation");
       ListIterator listIterator = p0.listIterator(p0.size());
       if (!listIterator.hasPrevious()) {
          return null;
       }
       Object obj = listIterator.previous();
       while (listIterator.hasPrevious()) {
          obj = p1.invoke(Integer.valueOf(listIterator.previousIndex()), listIterator.previous(), obj);
       }
       return obj;
    }
    public static final double[] C5(Collection p0){
       a.p(p0, "$this$toDoubleArray");
       double[] uodoubleArra = new double[p0.size()];
       Iterator iterator = p0.iterator();
       int i = 0;
       while (iterator.hasNext()) {
          int i1 = i + 1;
          uodoubleArra[i] = iterator.next().doubleValue();
          i = i1;
       }
       return uodoubleArra;
    }
    public static final Object D1(List p0){
       a.p(p0, "$this$component2");
       return p0.get(1);
    }
    public static final void D2(Iterable p0,p p1){
       a.p(p0, "$this$forEachIndexed");
       a.p(p1, "action");
       Iterator iterator = p0.iterator();
       int i = 0;
       while (true) {
          if (!iterator.hasNext()) {
             return;
          }
          Object obj = iterator.next();
          int i1 = i + 1;
          if (i < 0) {
             if (l.a(1, 3, 0)) {
                CollectionsKt__CollectionsKt.W();
             }else {
                break ;
             }
          }
          p1.invoke(Integer.valueOf(i), obj);
          i = i1;
       }
       throw new ArithmeticException("Index overflow has happened.");
    }
    public static final Float D3(Iterable p0){
       a.p(p0, "$this$maxOrNull");
       Iterator iterator = p0.iterator();
       if (!iterator.hasNext()) {
          return null;
       }
       float f = iterator.next().floatValue();
       while (iterator.hasNext()) {
          f = Math.max(f, iterator.next().floatValue());
       }
       return Float.valueOf(f);
    }
    public static final Object D4(List p0,p p1){
       a.p(p0, "$this$reduceRightOrNull");
       a.p(p1, "operation");
       ListIterator listIterator = p0.listIterator(p0.size());
       if (!listIterator.hasPrevious()) {
          return null;
       }
       Object obj = listIterator.previous();
       while (listIterator.hasPrevious()) {
          obj = p1.invoke(listIterator.previous(), obj);
       }
       return obj;
    }
    public static final float[] D5(Collection p0){
       a.p(p0, "$this$toFloatArray");
       float[] uofloatArray = new float[p0.size()];
       Iterator iterator = p0.iterator();
       int i = 0;
       while (iterator.hasNext()) {
          int i1 = i + 1;
          uofloatArray[i] = iterator.next().floatValue();
          i = i1;
       }
       return uofloatArray;
    }
    public static final Object E1(List p0){
       a.p(p0, "$this$component3");
       return p0.get(2);
    }
    public static final Object E2(List p0,int p1,l p2){
       p0 = (p1 >= 0 && p1 <= CollectionsKt__CollectionsKt.G(p0))? p0.get(p1): p2.invoke(Integer.valueOf(p1));
       return p0;
    }
    public static final Object E3(Iterable p0,Comparator p1){
       a.p(p0, "$this$maxWith");
       a.p(p1, "comparator");
       return CollectionsKt___CollectionsKt.F3(p0, p1);
    }
    public static final Iterable E4(Iterable p0){
       a.p(p0, "$this$requireNoNulls");
       Iterator iterator = p0.iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return p0;
          }
          if (iterator.next() != null) {
             continue ;
          }else {
             break ;
          }
       }
       throw new IllegalArgumentException("null element found in "+p0+'.');
    }
    public static final HashSet E5(Iterable p0){
       a.p(p0, "$this$toHashSet");
       return CollectionsKt___CollectionsKt.B5(p0, new HashSet(s0.j(u.Y(p0, 12))));
    }
    public static final Object F1(List p0){
       a.p(p0, "$this$component4");
       return p0.get(3);
    }
    public static final Object F2(List p0,int p1){
       a.p(p0, "$this$getOrNull");
       p0 = (p1 >= 0 && p1 <= CollectionsKt__CollectionsKt.G(p0))? p0.get(p1): null;
       return p0;
    }
    public static final Object F3(Iterable p0,Comparator p1){
       a.p(p0, "$this$maxWithOrNull");
       a.p(p1, "comparator");
       Iterator iterator = p0.iterator();
       if (!iterator.hasNext()) {
          return null;
       }
       Object obj = iterator.next();
       while (iterator.hasNext()) {
          Object obj1 = iterator.next();
          if (p1.compare(obj, obj1) < 0) {
             obj = obj1;
          }
       }
       return obj;
    }
    public static final List F4(List p0){
       a.p(p0, "$this$requireNoNulls");
       Iterator iterator = p0.iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return p0;
          }
          if (iterator.next() != null) {
             continue ;
          }else {
             break ;
          }
       }
       throw new IllegalArgumentException("null element found in "+p0+'.');
    }
    public static final int[] F5(Collection p0){
       a.p(p0, "$this$toIntArray");
       int[] ointArray = new int[p0.size()];
       Iterator iterator = p0.iterator();
       int i = 0;
       while (iterator.hasNext()) {
          int i1 = i + 1;
          ointArray[i] = iterator.next().intValue();
          i = i1;
       }
       return ointArray;
    }
    public static final Object G1(List p0){
       a.p(p0, "$this$component5");
       return p0.get(4);
    }
    public static final Map G2(Iterable p0,l p1){
       a.p(p0, "$this$groupBy");
       a.p(p1, "keySelector");
       LinkedHashMap linkedHashMa = new LinkedHashMap();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          Object obj = iterator.next();
          Object obj1 = p1.invoke(obj);
          ArrayList uArrayList = linkedHashMa.get(obj1);
          if (uArrayList == null) {
             uArrayList = new ArrayList();
             linkedHashMa.put(obj1, uArrayList);
          }
          uArrayList.add(obj);
       }
       return linkedHashMa;
    }
    public static final Comparable G3(Iterable p0){
       a.p(p0, "$this$min");
       return CollectionsKt___CollectionsKt.T3(p0);
    }
    public static final List G4(Iterable p0){
       a.p(p0, "$this$reversed");
       if (p0 instanceof Collection && p0.size() <= 1) {
          return CollectionsKt___CollectionsKt.G5(p0);
       }
       List list = CollectionsKt___CollectionsKt.I5(p0);
       a0.c1(list);
       return list;
    }
    public static final List G5(Iterable p0){
       List list;
       a.p(p0, "$this$toList");
       if (!p0 instanceof Collection) {
          return CollectionsKt__CollectionsKt.Q(CollectionsKt___CollectionsKt.I5(p0));
       }
       Collection uCollection = p0;
       int i = uCollection.size();
       if (i) {
          if (i != 1) {
             list = CollectionsKt___CollectionsKt.J5(uCollection);
          }else if(p0 instanceof List){
             p0 = p0.get(0);
          }else {
             p0 = p0.iterator().next();
          }
          list = t.k(p0);
       }else {
          list = CollectionsKt__CollectionsKt.E();
       }
       return list;
    }
    public static final boolean H1(Iterable p0,Object p1){
       a.p(p0, "$this$contains");
       if (p0 instanceof Collection) {
          return p0.contains(p1);
       }
       boolean b = (CollectionsKt___CollectionsKt.L2(p0, p1) >= 0)? true: false;
       return b;
    }
    public static final Map H2(Iterable p0,l p1,l p2){
       a.p(p0, "$this$groupBy");
       a.p(p1, "keySelector");
       a.p(p2, "valueTransform");
       LinkedHashMap linkedHashMa = new LinkedHashMap();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          Object obj = iterator.next();
          Object obj1 = p1.invoke(obj);
          ArrayList uArrayList = linkedHashMa.get(obj1);
          if (uArrayList == null) {
             uArrayList = new ArrayList();
             linkedHashMa.put(obj1, uArrayList);
          }
          uArrayList.add(p2.invoke(obj));
       }
       return linkedHashMa;
    }
    public static final Double H3(Iterable p0){
       a.p(p0, "$this$min");
       return CollectionsKt___CollectionsKt.U3(p0);
    }
    public static final List H4(Iterable p0,Object p1,p p2){
       a.p(p0, "$this$runningFold");
       a.p(p2, "operation");
       int i = u.Y(p0, 9);
       if (!i) {
          return t.k(p1);
       }
       ArrayList uArrayList = new ArrayList((i + 1));
       uArrayList.add(p1);
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          uArrayList.add(p2.invoke(p1, iterator.next()));
       }
       return uArrayList;
    }
    public static final long[] H5(Collection p0){
       a.p(p0, "$this$toLongArray");
       long[] olongArray = new long[p0.size()];
       Iterator iterator = p0.iterator();
       int i = 0;
       while (iterator.hasNext()) {
          int i1 = i + 1;
          olongArray[i] = iterator.next().longValue();
          i = i1;
       }
       return olongArray;
    }
    public static final int I1(Iterable p0){
       a.p(p0, "$this$count");
       if (p0 instanceof Collection) {
          return p0.size();
       }
       int i = 0;
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          iterator.next();
          i = i + 1;
          if (i < 0) {
             CollectionsKt__CollectionsKt.V();
          }
       }
       return i;
    }
    public static final Map I2(Iterable p0,Map p1,l p2){
       a.p(p0, "$this$groupByTo");
       a.p(p1, "destination");
       a.p(p2, "keySelector");
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          Object obj = iterator.next();
          Object obj1 = p2.invoke(obj);
          ArrayList uArrayList = p1.get(obj1);
          if (uArrayList == null) {
             uArrayList = new ArrayList();
             p1.put(obj1, uArrayList);
          }
          uArrayList.add(obj);
       }
       return p1;
    }
    public static final Float I3(Iterable p0){
       a.p(p0, "$this$min");
       return CollectionsKt___CollectionsKt.V3(p0);
    }
    public static final List I4(Iterable p0,Object p1,q p2){
       a.p(p0, "$this$runningFoldIndexed");
       a.p(p2, "operation");
       int i = u.Y(p0, 9);
       if (!i) {
          return t.k(p1);
       }
       ArrayList uArrayList = new ArrayList((i + 1));
       uArrayList.add(p1);
       i = 0;
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          i = i + 1;
          uArrayList.add(p2.invoke(Integer.valueOf(i), p1, iterator.next()));
       }
       return uArrayList;
    }
    public static final List I5(Iterable p0){
       a.p(p0, "$this$toMutableList");
       if (p0 instanceof Collection) {
          return CollectionsKt___CollectionsKt.J5(p0);
       }
       return CollectionsKt___CollectionsKt.B5(p0, new ArrayList());
    }
    public static final int J1(Iterable p0,l p1){
       a.p(p0, "$this$count");
       a.p(p1, "predicate");
       if (p0 instanceof Collection && p0.isEmpty()) {
          return 0;
       }
       Iterator iterator = p0.iterator();
       int i = 0;
       while (true) {
          if (!iterator.hasNext()) {
             return i;
          }
          if (p1.invoke(iterator.next()).booleanValue()) {
             i = i + 1;
             if (i < 0) {
                if (l.a(1, 3, 0)) {
                   CollectionsKt__CollectionsKt.V();
                }else {
                   break ;
                }
             }
          }
       }
       throw new ArithmeticException("Count overflow has happened.");
    }
    public static final Map J2(Iterable p0,Map p1,l p2,l p3){
       a.p(p0, "$this$groupByTo");
       a.p(p1, "destination");
       a.p(p2, "keySelector");
       a.p(p3, "valueTransform");
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          Object obj = iterator.next();
          Object obj1 = p2.invoke(obj);
          ArrayList uArrayList = p1.get(obj1);
          if (uArrayList == null) {
             uArrayList = new ArrayList();
             p1.put(obj1, uArrayList);
          }
          uArrayList.add(p3.invoke(obj));
       }
       return p1;
    }
    public static final Object J3(Iterable p0,l p1){
       a.p(p0, "$this$minBy");
       a.p(p1, "selector");
       Iterator iterator = p0.iterator();
       if (!iterator.hasNext()) {
          iterator = null;
       }else {
          Object obj = iterator.next();
          if (iterator.hasNext()) {
             Comparable uComparable = p1.invoke(obj);
             do {
                Object obj1 = iterator.next();
                Comparable uComparable1 = p1.invoke(obj1);
                if (uComparable.compareTo(uComparable1) > 0) {
                   obj = obj1;
                   uComparable = uComparable1;
                }
             } while (!iterator.hasNext());
          }
          iterator = obj;
       }
       return iterator;
    }
    public static final List J4(Iterable p0,p p1){
       a.p(p0, "$this$runningReduce");
       a.p(p1, "operation");
       Iterator iterator = p0.iterator();
       if (!iterator.hasNext()) {
          return CollectionsKt__CollectionsKt.E();
       }
       Object obj = iterator.next();
       ArrayList uArrayList = new ArrayList(u.Y(p0, 10));
       uArrayList.add(obj);
       while (iterator.hasNext()) {
          uArrayList.add(p1.invoke(obj, iterator.next()));
       }
       return uArrayList;
    }
    public static final List J5(Collection p0){
       a.p(p0, "$this$toMutableList");
       return new ArrayList(p0);
    }
    public static final int K1(Collection p0){
       return p0.size();
    }
    public static final e0 K2(Iterable p0,l p1){
       a.p(p0, "$this$groupingBy");
       a.p(p1, "keySelector");
       return new CollectionsKt___CollectionsKt$b(p0, p1);
    }
    public static final Object K3(Iterable p0,l p1){
       a.p(p0, "$this$minByOrNull");
       a.p(p1, "selector");
       Iterator iterator = p0.iterator();
       if (!iterator.hasNext()) {
          return null;
       }
       Object obj = iterator.next();
       if (!iterator.hasNext()) {
          return obj;
       }
       Comparable uComparable = p1.invoke(obj);
       do {
          Object obj1 = iterator.next();
          Comparable uComparable1 = p1.invoke(obj1);
          if (uComparable.compareTo(uComparable1) > 0) {
             obj = obj1;
             uComparable = uComparable1;
          }
       } while (!iterator.hasNext());
       return obj;
    }
    public static final List K4(Iterable p0,q p1){
       a.p(p0, "$this$runningReduceIndexed");
       a.p(p1, "operation");
       Iterator iterator = p0.iterator();
       if (!iterator.hasNext()) {
          return CollectionsKt__CollectionsKt.E();
       }
       Object obj = iterator.next();
       ArrayList uArrayList = new ArrayList(u.Y(p0, 10));
       uArrayList.add(obj);
       int i = 1;
       while (iterator.hasNext()) {
          i = i + 1;
          uArrayList.add(p1.invoke(Integer.valueOf(i), obj, iterator.next()));
       }
       return uArrayList;
    }
    public static final Set K5(Iterable p0){
       a.p(p0, "$this$toMutableSet");
       LinkedHashSet linkedHashSe = (p0 instanceof Collection)? new LinkedHashSet(p0): CollectionsKt___CollectionsKt.B5(p0, new LinkedHashSet());
       return linkedHashSe;
    }
    public static final List L1(Iterable p0){
       a.p(p0, "$this$distinct");
       return CollectionsKt___CollectionsKt.G5(CollectionsKt___CollectionsKt.K5(p0));
    }
    public static final int L2(Iterable p0,Object p1){
       a.p(p0, "$this$indexOf");
       if (p0 instanceof List) {
          return p0.indexOf(p1);
       }
       int i = 0;
       Iterator iterator = p0.iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return -1;
          }
          Object obj = iterator.next();
          if (i < 0) {
             CollectionsKt__CollectionsKt.W();
          }
          if (a.g(p1, obj)) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return i;
    }
    public static final double L3(Iterable p0,l p1){
       Iterator iterator = p0.iterator();
       if (!iterator.hasNext()) {
          throw new NoSuchElementException();
       }
       double d = p1.invoke(iterator.next()).doubleValue();
       while (iterator.hasNext()) {
          d = Math.min(d, p1.invoke(iterator.next()).doubleValue());
       }
       return d;
    }
    public static final List L4(Iterable p0,Object p1,p p2){
       List list;
       a.p(p0, "$this$scan");
       a.p(p2, "operation");
       int i = u.Y(p0, 9);
       if (!i) {
          list = t.k(p1);
       }else {
          ArrayList uArrayList = new ArrayList((i + 1));
          uArrayList.add(p1);
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             uArrayList.add(p2.invoke(p1, iterator.next()));
          }
          list = uArrayList;
       }
       return list;
    }
    public static final Set L5(Iterable p0){
       Set set;
       a.p(p0, "$this$toSet");
       if (!p0 instanceof Collection) {
          return d1.r(CollectionsKt___CollectionsKt.B5(p0, new LinkedHashSet()));
       }
       Collection uCollection = p0;
       int i = uCollection.size();
       if (i) {
          if (i != 1) {
             set = CollectionsKt___CollectionsKt.B5(p0, new LinkedHashSet(s0.j(uCollection.size())));
          }else if(p0 instanceof List){
             p0 = p0.get(0);
          }else {
             p0 = p0.iterator().next();
          }
          set = c1.f(p0);
       }else {
          set = d1.k();
       }
       return set;
    }
    public static final List M1(Iterable p0,l p1){
       a.p(p0, "$this$distinctBy");
       a.p(p1, "selector");
       HashSet hashSet = new HashSet();
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          Object obj = iterator.next();
          if (hashSet.add(p1.invoke(obj))) {
             uArrayList.add(obj);
          }
       }
       return uArrayList;
    }
    public static final int M2(List p0,Object p1){
       a.p(p0, "$this$indexOf");
       return p0.indexOf(p1);
    }
    public static final float M3(Iterable p0,l p1){
       Iterator iterator = p0.iterator();
       if (!iterator.hasNext()) {
          throw new NoSuchElementException();
       }
       float f = p1.invoke(iterator.next()).floatValue();
       while (iterator.hasNext()) {
          f = Math.min(f, p1.invoke(iterator.next()).floatValue());
       }
       return f;
    }
    public static final List M4(Iterable p0,Object p1,q p2){
       List list;
       a.p(p0, "$this$scanIndexed");
       a.p(p2, "operation");
       int i = u.Y(p0, 9);
       if (!i) {
          list = t.k(p1);
       }else {
          ArrayList uArrayList = new ArrayList((i + 1));
          uArrayList.add(p1);
          i = 0;
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             i = i + 1;
             uArrayList.add(p2.invoke(Integer.valueOf(i), p1, iterator.next()));
          }
          list = uArrayList;
       }
       return list;
    }
    public static final short[] M5(Collection p0){
       a.p(p0, "$this$toShortArray");
       short[] oshortArray = new short[p0.size()];
       Iterator iterator = p0.iterator();
       int i = 0;
       while (iterator.hasNext()) {
          int i1 = i + 1;
          oshortArray[i] = iterator.next().shortValue();
          i = i1;
       }
       return oshortArray;
    }
    public static final List N1(Iterable p0,int p1){
       a.p(p0, "$this$drop");
       int i = 0;
       ArrayList uArrayList = 1;
       int i1 = (p1 >= 0)? 1: 0;
       if (i1) {
          if (!p1) {
             return CollectionsKt___CollectionsKt.G5(p0);
          }else if(p0 instanceof Collection){
             Collection uCollection = p0;
             int i2 = uCollection.size() - p1;
             if (i2 <= 0) {
                return CollectionsKt__CollectionsKt.E();
             }else if(i2 == uArrayList){
                return t.k(CollectionsKt___CollectionsKt.W2(p0));
             }else {
                uArrayList = new ArrayList(i2);
                if (p0 instanceof List) {
                   if (p0 instanceof RandomAccess) {
                      i = uCollection.size();
                      for (; p1 < i; p1++) {
                         uArrayList.add(p0.get(p1));
                      }
                   }else {
                      ListIterator listIterator = p0.listIterator(p1);
                      while (listIterator.hasNext()) {
                         uArrayList.add(listIterator.next());
                      }
                   }
                   return uArrayList;
                }
             }
          }else {
             uArrayList = new ArrayList();
          }
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             Object obj = iterator.next();
             if (i >= p1) {
                uArrayList.add(obj);
             }else {
                i = i + 1;
             }
          }
          return CollectionsKt__CollectionsKt.Q(uArrayList);
       }else {
          throw new IllegalArgumentException("Requested element count "+p1+" is less than zero.".toString());
       }
    }
    public static final int N2(Iterable p0,l p1){
       a.p(p0, "$this$indexOfFirst");
       a.p(p1, "predicate");
       Iterator iterator = p0.iterator();
       int i = 0;
       while (true) {
          if (!iterator.hasNext()) {
             return -1;
          }
          Object obj = iterator.next();
          if (i < 0) {
             if (l.a(1, 3, 0)) {
                CollectionsKt__CollectionsKt.W();
             }else {
                throw new ArithmeticException("Index overflow has happened.");
             }
          }
          if (p1.invoke(obj).booleanValue()) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return i;
    }
    public static final Comparable N3(Iterable p0,l p1){
       Iterator iterator = p0.iterator();
       if (!iterator.hasNext()) {
          throw new NoSuchElementException();
       }
       Comparable uComparable = p1.invoke(iterator.next());
       while (iterator.hasNext()) {
          Comparable uComparable1 = p1.invoke(iterator.next());
          if (uComparable.compareTo(uComparable1) > 0) {
             uComparable = uComparable1;
          }
       }
       return uComparable;
    }
    public static final List N4(Iterable p0,p p1){
       List list;
       a.p(p0, "$this$scanReduce");
       a.p(p1, "operation");
       Iterator iterator = p0.iterator();
       if (!iterator.hasNext()) {
          list = CollectionsKt__CollectionsKt.E();
       }else {
          Object obj = iterator.next();
          ArrayList uArrayList = new ArrayList(u.Y(p0, 10));
          uArrayList.add(obj);
          while (iterator.hasNext()) {
             uArrayList.add(p1.invoke(obj, iterator.next()));
          }
          list = uArrayList;
       }
       return list;
    }
    public static final Set N5(Iterable p0,Iterable p1){
       a.p(p0, "$this$union");
       a.p(p1, "other");
       Set set = CollectionsKt___CollectionsKt.K5(p0);
       y.q0(set, p1);
       return set;
    }
    public static final List O1(List p0,int p1){
       a.p(p0, "$this$dropLast");
       int i = 0;
       int i1 = (p1 >= 0)? 1: 0;
       if (i1) {
          return CollectionsKt___CollectionsKt.u5(p0, q.n((p0.size() - p1), i));
       }else {
          throw new IllegalArgumentException("Requested element count "+p1+" is less than zero.".toString());
       }
    }
    public static final int O2(List p0,l p1){
       a.p(p0, "$this$indexOfFirst");
       a.p(p1, "predicate");
       Iterator iterator = p0.iterator();
       int i = 0;
       while (true) {
          if (!iterator.hasNext()) {
             return -1;
          }
          if (p1.invoke(iterator.next()).booleanValue()) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return i;
    }
    public static final Comparable O3(Iterable p0,l p1){
       Iterator iterator = p0.iterator();
       if (!iterator.hasNext()) {
          return null;
       }
       Comparable uComparable = p1.invoke(iterator.next());
       while (iterator.hasNext()) {
          Comparable uComparable1 = p1.invoke(iterator.next());
          if (uComparable.compareTo(uComparable1) > 0) {
             uComparable = uComparable1;
          }
       }
       return uComparable;
    }
    public static final List O4(Iterable p0,q p1){
       List list;
       a.p(p0, "$this$scanReduceIndexed");
       a.p(p1, "operation");
       Iterator iterator = p0.iterator();
       if (!iterator.hasNext()) {
          list = CollectionsKt__CollectionsKt.E();
       }else {
          Object obj = iterator.next();
          ArrayList uArrayList = new ArrayList(u.Y(p0, 10));
          uArrayList.add(obj);
          int i = 1;
          int i1 = 1;
          while (iterator.hasNext()) {
             i1 = i1 + i;
             uArrayList.add(p1.invoke(Integer.valueOf(i1), obj, iterator.next()));
          }
          list = uArrayList;
       }
       return list;
    }
    public static final List O5(Iterable p0,int p1,int p2,boolean p3){
       a.p(p0, "$this$windowed");
       SlidingWindowKt.a(p1, p2);
       if (p0 instanceof RandomAccess && p0 instanceof List) {
          int i = p0.size();
          int i1 = i / p2;
          int i2 = (!(i % p2))? 0: 1;
          ArrayList uArrayList = new ArrayList((i1 + i2));
          for (i1 = 0; i1 >= 0 && i > i1; i1 = i1 + p2) {
             int i3 = i - i1;
             i3 = q.u(p1, i3);
             if (i3 < p1 && !p3) {
                break ;
             }else {
                ArrayList uArrayList1 = new ArrayList(i3);
                for (int i4 = 0; i4 < i3; i4 = i4 + 1) {
                   int i5 = i4 + i1;
                   uArrayList1.add(p0.get(i5));
                }
                uArrayList.add(uArrayList1);
             }
          }
          return uArrayList;
       }else {
          ArrayList uArrayList2 = new ArrayList();
          Iterator iterator = SlidingWindowKt.b(p0.iterator(), p1, p2, p3, false);
          while (iterator.hasNext()) {
             uArrayList2.add(iterator.next());
          }
          return uArrayList2;
       }
    }
    public static final List P1(List p0,l p1){
       a.p(p0, "$this$dropLastWhile");
       a.p(p1, "predicate");
       if (!p0.isEmpty()) {
          ListIterator listIterator = p0.listIterator(p0.size());
          while (listIterator.hasPrevious()) {
             if (!p1.invoke(listIterator.previous()).booleanValue()) {
                return CollectionsKt___CollectionsKt.u5(p0, (listIterator.nextIndex() + 1));
             }
          }
       }
       return CollectionsKt__CollectionsKt.E();
    }
    public static final int P2(Iterable p0,l p1){
       a.p(p0, "$this$indexOfLast");
       a.p(p1, "predicate");
       Iterator iterator = p0.iterator();
       int i = -1;
       int i1 = 0;
       while (true) {
          if (!iterator.hasNext()) {
             return i;
          }
          Object obj = iterator.next();
          if (i1 < 0) {
             if (l.a(1, 3, 0)) {
                CollectionsKt__CollectionsKt.W();
             }else {
                break ;
             }
          }
          if (p1.invoke(obj).booleanValue()) {
             i = i1;
          }
          i1 = i1 + 1;
       }
       throw new ArithmeticException("Index overflow has happened.");
    }
    public static final Double P3(Iterable p0,l p1){
       Iterator iterator = p0.iterator();
       if (!iterator.hasNext()) {
          return null;
       }
       double d = p1.invoke(iterator.next()).doubleValue();
       while (iterator.hasNext()) {
          d = Math.min(d, p1.invoke(iterator.next()).doubleValue());
       }
       return Double.valueOf(d);
    }
    public static final void P4(List p0,e p1){
       a.p(p0, "$this$shuffle");
       a.p(p1, "random");
       for (int i = CollectionsKt__CollectionsKt.G(p0); i >= 1; i = i - 1) {
          int i1 = i + 1;
          i1 = p1.l(i1);
          p0.set(i1, p0.set(i, p0.get(i1)));
       }
       return;
    }
    public static final List P5(Iterable p0,int p1,int p2,boolean p3,l p4){
       a.p(p0, "$this$windowed");
       a.p(p4, "transform");
       SlidingWindowKt.a(p1, p2);
       int i = 1;
       if (p0 instanceof RandomAccess && p0 instanceof List) {
          int i1 = p0.size();
          int i2 = i1 / p2;
          int i3 = 0;
          if (!(i1 % p2)) {
             i = 0;
          }
          ArrayList uArrayList = new ArrayList((i2 + i));
          v0 ov0 = new v0(p0);
          for (; i3 >= 0 && i1 > i3; i3 = i3 + p2) {
             int i4 = i1 - i3;
             i4 = q.u(p1, i4);
             if (!p3 && i4 < p1) {
                break ;
             }
             i4 = i4 + i3;
             ov0.d(i3, i4);
             uArrayList.add(p4.invoke(ov0));
          }
          return uArrayList;
       }else {
          ArrayList uArrayList1 = new ArrayList();
          Iterator iterator = SlidingWindowKt.b(p0.iterator(), p1, p2, p3, i);
          while (iterator.hasNext()) {
             uArrayList1.add(p4.invoke(iterator.next()));
          }
          return uArrayList1;
       }
    }
    public static final List Q1(Iterable p0,l p1){
       a.p(p0, "$this$dropWhile");
       a.p(p1, "predicate");
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = p0.iterator();
       int i = 0;
       while (iterator.hasNext()) {
          Object obj = iterator.next();
          if (i) {
             uArrayList.add(obj);
          }else if(!p1.invoke(obj).booleanValue()){
             uArrayList.add(obj);
             i = 1;
          }
       }
       return uArrayList;
    }
    public static final int Q2(List p0,l p1){
       a.p(p0, "$this$indexOfLast");
       a.p(p1, "predicate");
       ListIterator listIterator = p0.listIterator(p0.size());
       while (true) {
          if (!listIterator.hasPrevious()) {
             return -1;
          }
          if (p1.invoke(listIterator.previous()).booleanValue()) {
             break ;
          }
       }
       return listIterator.nextIndex();
    }
    public static final Float Q3(Iterable p0,l p1){
       Iterator iterator = p0.iterator();
       if (!iterator.hasNext()) {
          return null;
       }
       float f = p1.invoke(iterator.next()).floatValue();
       while (iterator.hasNext()) {
          f = Math.min(f, p1.invoke(iterator.next()).floatValue());
       }
       return Float.valueOf(f);
    }
    public static final Object Q4(Iterable p0){
       a.p(p0, "$this$single");
       if (p0 instanceof List) {
          return CollectionsKt___CollectionsKt.S4(p0);
       }
       Iterator iterator = p0.iterator();
       if (!iterator.hasNext()) {
          throw new NoSuchElementException("Collection is empty.");
       }
       Object obj = iterator.next();
       if (!iterator.hasNext()) {
          return obj;
       }
       throw new IllegalArgumentException("Collection has more than one element.");
    }
    public static List Q5(Iterable p0,int p1,int p2,boolean p3,int p4,Object p5){
       if (p4 & 0x02) {
          p2 = 1;
       }
       if (p4 & 0x04) {
          p3 = false;
       }
       return CollectionsKt___CollectionsKt.O5(p0, p1, p2, p3);
    }
    public static final Object R1(Iterable p0,int p1){
       a.p(p0, "$this$elementAt");
       if (p0 instanceof List) {
          return p0.get(p1);
       }
       return CollectionsKt___CollectionsKt.T1(p0, p1, new CollectionsKt___CollectionsKt$elementAt$1(p1));
    }
    public static final Set R2(Iterable p0,Iterable p1){
       a.p(p0, "$this$intersect");
       a.p(p1, "other");
       Set set = CollectionsKt___CollectionsKt.K5(p0);
       y.Q0(set, p1);
       return set;
    }
    public static final Object R3(Iterable p0,Comparator p1,l p2){
       Iterator iterator = p0.iterator();
       if (!iterator.hasNext()) {
          throw new NoSuchElementException();
       }
       Object obj = p2.invoke(iterator.next());
       while (iterator.hasNext()) {
          Object obj1 = p2.invoke(iterator.next());
          if (p1.compare(obj, obj1) > 0) {
             obj = obj1;
          }
       }
       return obj;
    }
    public static final Object R4(Iterable p0,l p1){
       a.p(p0, "$this$single");
       a.p(p1, "predicate");
       Iterator iterator = p0.iterator();
       Object obj = null;
       int i = 0;
       while (true) {
          if (iterator.hasNext()) {
             Object obj1 = iterator.next();
             if (p1.invoke(obj1).booleanValue()) {
                if (!i) {
                   obj = obj1;
                   i = 1;
                }else {
                   break ;
                }
             }
          }else if(i){
             return obj;
          }else {
             throw new NoSuchElementException("Collection contains no element matching the predicate.");
          }
       }
       throw new IllegalArgumentException("Collection contains more than one matching element.");
    }
    public static List R5(Iterable p0,int p1,int p2,boolean p3,l p4,int p5,Object p6){
       if (p5 & 0x02) {
          p2 = 1;
       }
       if (p5 & 0x04) {
          p3 = false;
       }
       return CollectionsKt___CollectionsKt.P5(p0, p1, p2, p3, p4);
    }
    public static final Object S1(List p0,int p1){
       return p0.get(p1);
    }
    public static final Appendable S2(Iterable p0,Appendable p1,CharSequence p2,CharSequence p3,CharSequence p4,int p5,CharSequence p6,l p7){
       a.p(p0, "$this$joinTo");
       a.p(p1, "buffer");
       a.p(p2, "separator");
       a.p(p3, "prefix");
       a.p(p4, "postfix");
       a.p(p6, "truncated");
       p1.append(p3);
       Iterator iterator = p0.iterator();
       int i = 0;
       while (iterator.hasNext()) {
          Object obj = iterator.next();
          i++;
          if (i > 1) {
             p1.append(p2);
          }
          if (p5 < 0 || i <= p5) {
             n.b(p1, obj, p7);
          }else if(p5 >= 0 && i > p5){
             p1.append(p6);
          }
          p1.append(p4);
          return p1;
       }
    }
    public static final Object S3(Iterable p0,Comparator p1,l p2){
       Iterator iterator = p0.iterator();
       if (!iterator.hasNext()) {
          return null;
       }
       Object obj = p2.invoke(iterator.next());
       while (iterator.hasNext()) {
          Object obj1 = p2.invoke(iterator.next());
          if (p1.compare(obj, obj1) > 0) {
             obj = obj1;
          }
       }
       return obj;
    }
    public static final Object S4(List p0){
       a.p(p0, "$this$single");
       int i = p0.size();
       if (!i) {
          throw new NoSuchElementException("List is empty.");
       }
       if (i == 1) {
          return p0.get(0);
       }
       throw new IllegalArgumentException("List has more than one element.");
    }
    public static final Iterable S5(Iterable p0){
       a.p(p0, "$this$withIndex");
       return new j0(new CollectionsKt___CollectionsKt$withIndex$1(p0));
    }
    public static final Object T1(Iterable p0,int p1,l p2){
       Object obj;
       a.p(p0, "$this$elementAtOrElse");
       a.p(p2, "defaultValue");
       if (p0 instanceof List) {
          p0 = (p1 >= 0 && p1 <= CollectionsKt__CollectionsKt.G(p0))? p0.get(p1): p2.invoke(Integer.valueOf(p1));
          return p0;
       }else if(p1 < 0){
          return p2.invoke(Integer.valueOf(p1));
       }else {
          Iterator iterator = p0.iterator();
          int i = 0;
          while (true) {
             if (!iterator.hasNext()) {
                return p2.invoke(Integer.valueOf(p1));
             }
             obj = iterator.next();
             int i1 = i + 1;
             if (p1 == i) {
                break ;
             }else {
                i = i1;
             }
          }
          return obj;
       }
    }
    public static Appendable T2(Iterable p0,Appendable p1,CharSequence p2,CharSequence p3,CharSequence p4,int p5,CharSequence p6,l p7,int p8,Object p9){
       String str = (p8 & 0x02)? ", ": p2;
       String str1 = "";
       String str2 = (p8 & 0x04)? str1: p3;
       if (!(p8 & 0x08)) {
          str1 = p4;
       }
       int i = (p8 & 0x10)? -1: p5;
       String str3 = (p8 & 0x20)? "...": p6;
       int i1 = (p8 & 0x40)? 0: p7;
       return CollectionsKt___CollectionsKt.S2(p0, p1, str, str2, str1, i, str3, i1);
    }
    public static final Comparable T3(Iterable p0){
       a.p(p0, "$this$minOrNull");
       Iterator iterator = p0.iterator();
       if (!iterator.hasNext()) {
          return null;
       }
       Comparable uComparable = iterator.next();
       while (iterator.hasNext()) {
          Comparable uComparable1 = iterator.next();
          if (uComparable.compareTo(uComparable1) > 0) {
             uComparable = uComparable1;
          }
       }
       return uComparable;
    }
    public static final Object T4(Iterable p0){
       a.p(p0, "$this$singleOrNull");
       Object obj = null;
       if (p0 instanceof List) {
          if (p0.size() == 1) {
             obj = p0.get(0);
          }
          return obj;
       }else {
          Iterator iterator = p0.iterator();
          if (!iterator.hasNext()) {
             return obj;
          }
          Object obj1 = iterator.next();
          if (iterator.hasNext()) {
             return obj;
          }
          return obj1;
       }
    }
    public static final List T5(Iterable p0,Iterable p1){
       a.p(p0, "$this$zip");
       a.p(p1, "other");
       Iterator iterator = p0.iterator();
       Iterator iterator1 = p1.iterator();
       ArrayList uArrayList = new ArrayList(Math.min(u.Y(p0, 10), u.Y(p1, 10)));
       while (iterator.hasNext() && iterator1.hasNext()) {
          uArrayList.add(r0.a(iterator.next(), iterator1.next()));
       }
       return uArrayList;
    }
    public static final Object U1(List p0,int p1,l p2){
       p0 = (p1 >= 0 && p1 <= CollectionsKt__CollectionsKt.G(p0))? p0.get(p1): p2.invoke(Integer.valueOf(p1));
       return p0;
    }
    public static final String U2(Iterable p0,CharSequence p1,CharSequence p2,CharSequence p3,int p4,CharSequence p5,l p6){
       a.p(p0, "$this$joinToString");
       a.p(p1, "separator");
       a.p(p2, "prefix");
       a.p(p3, "postfix");
       a.p(p5, "truncated");
       String str = CollectionsKt___CollectionsKt.S2(p0, "", p1, p2, p3, p4, p5, p6);
       a.o(str, "joinTo\(StringBuilder\(\), ¡­ed, transform\).toString\(\)");
       return str;
    }
    public static final Double U3(Iterable p0){
       a.p(p0, "$this$minOrNull");
       Iterator iterator = p0.iterator();
       if (!iterator.hasNext()) {
          return null;
       }
       double d = iterator.next().doubleValue();
       while (iterator.hasNext()) {
          d = Math.min(d, iterator.next().doubleValue());
       }
       return Double.valueOf(d);
    }
    public static final Object U4(Iterable p0,l p1){
       a.p(p0, "$this$singleOrNull");
       a.p(p1, "predicate");
       Iterator iterator = p0.iterator();
       int i = 0;
       Object obj = null;
       while (true) {
          if (iterator.hasNext()) {
             Object obj1 = iterator.next();
             if (p1.invoke(obj1).booleanValue()) {
                if (i) {
                   break ;
                }else {
                   i = 1;
                   obj = obj1;
                }
             }
          }else if(!i){
             return null;
          }else {
             return obj;
          }
       }
       return null;
    }
    public static final List U5(Iterable p0,Iterable p1,p p2){
       a.p(p0, "$this$zip");
       a.p(p1, "other");
       a.p(p2, "transform");
       Iterator iterator = p0.iterator();
       Iterator iterator1 = p1.iterator();
       ArrayList uArrayList = new ArrayList(Math.min(u.Y(p0, 10), u.Y(p1, 10)));
       while (iterator.hasNext() && iterator1.hasNext()) {
          uArrayList.add(p2.invoke(iterator.next(), iterator1.next()));
       }
       return uArrayList;
    }
    public static final Object V1(Iterable p0,int p1){
       Object obj;
       a.p(p0, "$this$elementAtOrNull");
       if (p0 instanceof List) {
          return CollectionsKt___CollectionsKt.F2(p0, p1);
       }
       if (p1 < 0) {
          return null;
       }
       Iterator iterator = p0.iterator();
       int i = 0;
       while (true) {
          if (!iterator.hasNext()) {
             return null;
          }
          obj = iterator.next();
          int i1 = i + 1;
          if (p1 == i) {
             break ;
          }else {
             i = i1;
          }
       }
       return obj;
    }
    public static String V2(Iterable p0,CharSequence p1,CharSequence p2,CharSequence p3,int p4,CharSequence p5,l p6,int p7,Object p8){
       String str;
       String str2;
       int i1;
       if (p7 & 0x01) {
          str = ", ";
       }
       String str1 = "";
       p8 = (p7 & 0x02)? str1: p2;
       if (!(p7 & 0x04)) {
          str1 = p3;
       }
       int i = (p7 & 0x08)? -1: p4;
       if (p7 & 0x10) {
          str2 = "...";
       }
       String str3 = str2;
       if (p7 & 0x20) {
          p6 = null;
       }
       return CollectionsKt___CollectionsKt.U2(p0, str, p8, str1, i, str3, p6);
    }
    public static final Float V3(Iterable p0){
       a.p(p0, "$this$minOrNull");
       Iterator iterator = p0.iterator();
       if (!iterator.hasNext()) {
          return null;
       }
       float f = iterator.next().floatValue();
       while (iterator.hasNext()) {
          f = Math.min(f, iterator.next().floatValue());
       }
       return Float.valueOf(f);
    }
    public static final Object V4(List p0){
       a.p(p0, "$this$singleOrNull");
       p0 = (p0.size() == 1)? p0.get(0): null;
       return p0;
    }
    public static final List V5(Iterable p0,Object[] p1){
       a.p(p0, "$this$zip");
       a.p(p1, "other");
       int len = p1.length;
       ArrayList uArrayList = new ArrayList(Math.min(u.Y(p0, 10), len));
       Iterator iterator = p0.iterator();
       int i = 0;
       while (iterator.hasNext()) {
          Object obj = iterator.next();
          if (i >= len) {
             break ;
          }else {
             int i1 = i + 1;
             uArrayList.add(r0.a(obj, p1[i]));
             i = i1;
          }
       }
       return uArrayList;
    }
    public static final Object W1(List p0,int p1){
       return CollectionsKt___CollectionsKt.F2(p0, p1);
    }
    public static final Object W2(Iterable p0){
       a.p(p0, "$this$last");
       if (p0 instanceof List) {
          return CollectionsKt___CollectionsKt.Y2(p0);
       }
       Iterator iterator = p0.iterator();
       if (!iterator.hasNext()) {
          throw new NoSuchElementException("Collection is empty.");
       }
       Object obj = iterator.next();
       while (iterator.hasNext()) {
          obj = iterator.next();
       }
       return obj;
    }
    public static final Object W3(Iterable p0,Comparator p1){
       a.p(p0, "$this$minWith");
       a.p(p1, "comparator");
       return CollectionsKt___CollectionsKt.X3(p0, p1);
    }
    public static final List W4(List p0,Iterable p1){
       a.p(p0, "$this$slice");
       a.p(p1, "indices");
       int i = u.Y(p1, 10);
       if (!i) {
          return CollectionsKt__CollectionsKt.E();
       }
       ArrayList uArrayList = new ArrayList(i);
       Iterator iterator = p1.iterator();
       while (iterator.hasNext()) {
          uArrayList.add(p0.get(iterator.next().intValue()));
       }
       return uArrayList;
    }
    public static final List W5(Iterable p0,Object[] p1,p p2){
       a.p(p0, "$this$zip");
       a.p(p1, "other");
       a.p(p2, "transform");
       int len = p1.length;
       ArrayList uArrayList = new ArrayList(Math.min(u.Y(p0, 10), len));
       Iterator iterator = p0.iterator();
       int i = 0;
       while (iterator.hasNext()) {
          Object obj = iterator.next();
          if (i >= len) {
             break ;
          }else {
             int i1 = i + 1;
             uArrayList.add(p2.invoke(obj, p1[i]));
             i = i1;
          }
       }
       return uArrayList;
    }
    public static final List X1(Iterable p0,l p1){
       a.p(p0, "$this$filter");
       a.p(p1, "predicate");
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          Object obj = iterator.next();
          if (p1.invoke(obj).booleanValue()) {
             uArrayList.add(obj);
          }
       }
       return uArrayList;
    }
    public static final Object X2(Iterable p0,l p1){
       a.p(p0, "$this$last");
       a.p(p1, "predicate");
       Iterator iterator = p0.iterator();
       Object obj = null;
       int i = 0;
       while (iterator.hasNext()) {
          Object obj1 = iterator.next();
          if (p1.invoke(obj1).booleanValue()) {
             obj = obj1;
             i = 1;
          }
       }
       if (i) {
          return obj;
       }
       throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
    public static final Object X3(Iterable p0,Comparator p1){
       a.p(p0, "$this$minWithOrNull");
       a.p(p1, "comparator");
       Iterator iterator = p0.iterator();
       if (!iterator.hasNext()) {
          return null;
       }
       Object obj = iterator.next();
       while (iterator.hasNext()) {
          Object obj1 = iterator.next();
          if (p1.compare(obj, obj1) > 0) {
             obj = obj1;
          }
       }
       return obj;
    }
    public static final List X4(List p0,k p1){
       a.p(p0, "$this$slice");
       a.p(p1, "indices");
       if (p1.isEmpty()) {
          return CollectionsKt__CollectionsKt.E();
       }
       return CollectionsKt___CollectionsKt.G5(p0.subList(p1.t().intValue(), (p1.s().intValue() + 1)));
    }
    public static final List X5(Iterable p0){
       List list;
       a.p(p0, "$this$zipWithNext");
       Iterator iterator = p0.iterator();
       if (!iterator.hasNext()) {
          list = CollectionsKt__CollectionsKt.E();
       }else {
          ArrayList uArrayList = new ArrayList();
          Object obj = iterator.next();
          while (iterator.hasNext()) {
             Object obj1 = iterator.next();
             uArrayList.add(r0.a(obj, obj1));
             obj = obj1;
          }
          list = uArrayList;
       }
       return list;
    }
    public static final List Y1(Iterable p0,p p1){
       a.p(p0, "$this$filterIndexed");
       a.p(p1, "predicate");
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = p0.iterator();
       int i = 0;
       while (true) {
          if (!iterator.hasNext()) {
             return uArrayList;
          }
          Object obj = iterator.next();
          int i1 = i + 1;
          if (i < 0) {
             if (l.a(1, 3, 0)) {
                CollectionsKt__CollectionsKt.W();
             }else {
                break ;
             }
          }
          if (p1.invoke(Integer.valueOf(i), obj).booleanValue()) {
             uArrayList.add(obj);
          }
          i = i1;
       }
       throw new ArithmeticException("Index overflow has happened.");
    }
    public static final Object Y2(List p0){
       a.p(p0, "$this$last");
       if (!p0.isEmpty()) {
          return p0.get(CollectionsKt__CollectionsKt.G(p0));
       }
       throw new NoSuchElementException("List is empty.");
    }
    public static final List Y3(Iterable p0,Iterable p1){
       a.p(p0, "$this$minus");
       a.p(p1, "elements");
       Collection uCollection = u.b0(p1, p0);
       if (uCollection.isEmpty()) {
          return CollectionsKt___CollectionsKt.G5(p0);
       }
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          Object obj = iterator.next();
          if (!uCollection.contains(obj)) {
             uArrayList.add(obj);
          }
       }
       return uArrayList;
    }
    public static final void Y4(List p0,l p1){
       a.p(p0, "$this$sortBy");
       a.p(p1, "selector");
       if (p0.size() > 1) {
          x.p0(p0, new b$b(p1));
       }
       return;
    }
    public static final List Y5(Iterable p0,p p1){
       a.p(p0, "$this$zipWithNext");
       a.p(p1, "transform");
       Iterator iterator = p0.iterator();
       if (!iterator.hasNext()) {
          return CollectionsKt__CollectionsKt.E();
       }
       ArrayList uArrayList = new ArrayList();
       Object obj = iterator.next();
       while (iterator.hasNext()) {
          Object obj1 = iterator.next();
          uArrayList.add(p1.invoke(obj, obj1));
          obj = obj1;
       }
       return uArrayList;
    }
    public static final Collection Z1(Iterable p0,Collection p1,p p2){
       a.p(p0, "$this$filterIndexedTo");
       a.p(p1, "destination");
       a.p(p2, "predicate");
       Iterator iterator = p0.iterator();
       int i = 0;
       while (true) {
          if (!iterator.hasNext()) {
             return p1;
          }
          Object obj = iterator.next();
          int i1 = i + 1;
          if (i < 0) {
             if (l.a(1, 3, 0)) {
                CollectionsKt__CollectionsKt.W();
             }else {
                break ;
             }
          }
          if (p2.invoke(Integer.valueOf(i), obj).booleanValue()) {
             p1.add(obj);
          }
          i = i1;
       }
       throw new ArithmeticException("Index overflow has happened.");
    }
    public static final Object Z2(List p0,l p1){
       Object obj;
       a.p(p0, "$this$last");
       a.p(p1, "predicate");
       ListIterator listIterator = p0.listIterator(p0.size());
       while (true) {
          if (!listIterator.hasPrevious()) {
             throw new NoSuchElementException("List contains no element matching the predicate.");
          }
          obj = listIterator.previous();
          if (p1.invoke(obj).booleanValue()) {
             break ;
          }
       }
       return obj;
    }
    public static final List Z3(Iterable p0,Object p1){
       a.p(p0, "$this$minus");
       ArrayList uArrayList = new ArrayList(u.Y(p0, 10));
       Iterator iterator = p0.iterator();
       int i = 0;
       while (iterator.hasNext()) {
          Object obj = iterator.next();
          int i1 = 1;
          if (!i && a.g(obj, p1)) {
             i = 1;
             i1 = 0;
          }
          if (i1) {
             uArrayList.add(obj);
          }
       }
       return uArrayList;
    }
    public static final void Z4(List p0,l p1){
       a.p(p0, "$this$sortByDescending");
       a.p(p1, "selector");
       if (p0.size() > 1) {
          x.p0(p0, new b$d(p1));
       }
       return;
    }
    public static final List a2(Iterable p0){
       a.p(p0, "$this$filterIsInstance");
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          Object obj = iterator.next();
          a.y(3, "R");
          if (obj instanceof Object) {
             uArrayList.add(obj);
          }
       }
       return uArrayList;
    }
    public static final int a3(Iterable p0,Object p1){
       a.p(p0, "$this$lastIndexOf");
       if (p0 instanceof List) {
          return p0.lastIndexOf(p1);
       }
       int i = -1;
       int i1 = 0;
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          Object obj = iterator.next();
          if (i1 < 0) {
             CollectionsKt__CollectionsKt.W();
          }
          if (a.g(p1, obj)) {
             i = i1;
          }
          i1 = i1 + 1;
       }
       return i;
    }
    public static final List a4(Iterable p0,m p1){
       a.p(p0, "$this$minus");
       a.p(p1, "elements");
       HashSet hashSet = SequencesKt___SequencesKt.U2(p1);
       if (hashSet.isEmpty()) {
          return CollectionsKt___CollectionsKt.G5(p0);
       }
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          Object obj = iterator.next();
          if (!hashSet.contains(obj)) {
             uArrayList.add(obj);
          }
       }
       return uArrayList;
    }
    public static final void a5(List p0){
       a.p(p0, "$this$sortDescending");
       x.p0(p0, b.p());
    }
    public static final Collection b2(Iterable p0,Collection p1){
       a.p(p0, "$this$filterIsInstanceTo");
       a.p(p1, "destination");
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          Object obj = iterator.next();
          a.y(3, "R");
          if (obj instanceof Object) {
             p1.add(obj);
          }
       }
       return p1;
    }
    public static final int b3(List p0,Object p1){
       a.p(p0, "$this$lastIndexOf");
       return p0.lastIndexOf(p1);
    }
    public static final List b4(Iterable p0,Object[] p1){
       a.p(p0, "$this$minus");
       a.p(p1, "elements");
       ArrayList uArrayList = (!p1.length)? 1: null;
       if (uArrayList) {
          return CollectionsKt___CollectionsKt.G5(p0);
       }else {
          HashSet hashSet = ArraysKt___ArraysKt.ky(p1);
          uArrayList = new ArrayList();
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             Object obj = iterator.next();
             if (!hashSet.contains(obj)) {
                uArrayList.add(obj);
             }
          }
          return uArrayList;
       }
    }
    public static final List b5(Iterable p0){
       a.p(p0, "$this$sorted");
       if (p0 instanceof Collection) {
          Collection uCollection = p0;
          if (uCollection.size() <= 1) {
             return CollectionsKt___CollectionsKt.G5(p0);
          }
          Comparable[] uComparableA = new Comparable[0];
          Object[] objArray = uCollection.toArray(uComparableA);
          Objects.requireNonNull(objArray, "null cannot be cast to non-null type kotlin.Array<T>");
          n.r3(objArray);
          return n.t(objArray);
       }else {
          List list = CollectionsKt___CollectionsKt.I5(p0);
          x.m0(list);
          return list;
       }
    }
    public static final List c2(Iterable p0,l p1){
       a.p(p0, "$this$filterNot");
       a.p(p1, "predicate");
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          Object obj = iterator.next();
          if (!p1.invoke(obj).booleanValue()) {
             uArrayList.add(obj);
          }
       }
       return uArrayList;
    }
    public static final Object c3(Iterable p0){
       a.p(p0, "$this$lastOrNull");
       Object obj = null;
       if (p0 instanceof List) {
          if (!p0.isEmpty()) {
             obj = p0.get((p0.size() - 1));
          }
          return obj;
       }else {
          Iterator iterator = p0.iterator();
          if (!iterator.hasNext()) {
             return obj;
          }
          Object obj1 = iterator.next();
          while (iterator.hasNext()) {
             obj1 = iterator.next();
          }
          return obj1;
       }
    }
    public static final List c4(Iterable p0,Object p1){
       return CollectionsKt___CollectionsKt.Z3(p0, p1);
    }
    public static final List c5(Iterable p0,l p1){
       a.p(p0, "$this$sortedBy");
       a.p(p1, "selector");
       return CollectionsKt___CollectionsKt.f5(p0, new b$b(p1));
    }
    public static final List d2(Iterable p0){
       a.p(p0, "$this$filterNotNull");
       return CollectionsKt___CollectionsKt.e2(p0, new ArrayList());
    }
    public static final Object d3(Iterable p0,l p1){
       a.p(p0, "$this$lastOrNull");
       a.p(p1, "predicate");
       Iterator iterator = p0.iterator();
       Object obj = null;
       while (iterator.hasNext()) {
          Object obj1 = iterator.next();
          if (p1.invoke(obj1).booleanValue()) {
             obj = obj1;
          }
       }
       return obj;
    }
    public static final boolean d4(Iterable p0){
       a.p(p0, "$this$none");
       if (p0 instanceof Collection) {
          return p0.isEmpty();
       }
       return (p0.iterator().hasNext() ^ 0x01);
    }
    public static final List d5(Iterable p0,l p1){
       a.p(p0, "$this$sortedByDescending");
       a.p(p1, "selector");
       return CollectionsKt___CollectionsKt.f5(p0, new b$d(p1));
    }
    public static final Collection e2(Iterable p0,Collection p1){
       a.p(p0, "$this$filterNotNullTo");
       a.p(p1, "destination");
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          Object obj = iterator.next();
          if (obj != null) {
             p1.add(obj);
          }
       }
       return p1;
    }
    public static final Object e3(List p0){
       a.p(p0, "$this$lastOrNull");
       p0 = (p0.isEmpty())? null: p0.get((p0.size() - 1));
       return p0;
    }
    public static final boolean e4(Iterable p0,l p1){
       a.p(p0, "$this$none");
       a.p(p1, "predicate");
       if (p0 instanceof Collection && p0.isEmpty()) {
          return true;
       }
       Iterator iterator = p0.iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return true;
          }
          if (p1.invoke(iterator.next()).booleanValue()) {
             break ;
          }
       }
       return false;
    }
    public static final List e5(Iterable p0){
       a.p(p0, "$this$sortedDescending");
       return CollectionsKt___CollectionsKt.f5(p0, b.p());
    }
    public static final Collection f2(Iterable p0,Collection p1,l p2){
       a.p(p0, "$this$filterNotTo");
       a.p(p1, "destination");
       a.p(p2, "predicate");
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          Object obj = iterator.next();
          if (!p2.invoke(obj).booleanValue()) {
             p1.add(obj);
          }
       }
       return p1;
    }
    public static final Object f3(List p0,l p1){
       Object obj;
       a.p(p0, "$this$lastOrNull");
       a.p(p1, "predicate");
       ListIterator listIterator = p0.listIterator(p0.size());
       while (true) {
          if (!listIterator.hasPrevious()) {
             return null;
          }
          obj = listIterator.previous();
          if (p1.invoke(obj).booleanValue()) {
             break ;
          }
       }
       return obj;
    }
    public static final Iterable f4(Iterable p0,l p1){
       a.p(p0, "$this$onEach");
       a.p(p1, "action");
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          p1.invoke(iterator.next());
       }
       return p0;
    }
    public static final List f5(Iterable p0,Comparator p1){
       a.p(p0, "$this$sortedWith");
       a.p(p1, "comparator");
       if (p0 instanceof Collection) {
          Collection uCollection = p0;
          if (uCollection.size() <= 1) {
             return CollectionsKt___CollectionsKt.G5(p0);
          }
          Object[] objArray = new Object[0];
          objArray = uCollection.toArray(objArray);
          Objects.requireNonNull(objArray, "null cannot be cast to non-null type kotlin.Array<T>");
          n.E3(objArray, p1);
          return n.t(objArray);
       }else {
          List list = CollectionsKt___CollectionsKt.I5(p0);
          x.p0(list, p1);
          return list;
       }
    }
    public static final Collection g2(Iterable p0,Collection p1,l p2){
       a.p(p0, "$this$filterTo");
       a.p(p1, "destination");
       a.p(p2, "predicate");
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          Object obj = iterator.next();
          if (p2.invoke(obj).booleanValue()) {
             p1.add(obj);
          }
       }
       return p1;
    }
    public static final List g3(Iterable p0,l p1){
       a.p(p0, "$this$map");
       a.p(p1, "transform");
       ArrayList uArrayList = new ArrayList(u.Y(p0, 10));
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          uArrayList.add(p1.invoke(iterator.next()));
       }
       return uArrayList;
    }
    public static final Iterable g4(Iterable p0,p p1){
       a.p(p0, "$this$onEachIndexed");
       a.p(p1, "action");
       Iterator iterator = p0.iterator();
       int i = 0;
       while (iterator.hasNext()) {
          Object obj = iterator.next();
          int i1 = i + 1;
          if (i < 0) {
             CollectionsKt__CollectionsKt.W();
          }
          p1.invoke(Integer.valueOf(i), obj);
          i = i1;
       }
       return p0;
    }
    public static final Set g5(Iterable p0,Iterable p1){
       a.p(p0, "$this$subtract");
       a.p(p1, "other");
       Set set = CollectionsKt___CollectionsKt.K5(p0);
       y.G0(set, p1);
       return set;
    }
    public static final boolean h1(Iterable p0,l p1){
       a.p(p0, "$this$all");
       a.p(p1, "predicate");
       if (p0 instanceof Collection && p0.isEmpty()) {
          return true;
       }
       Iterator iterator = p0.iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return true;
          }
          if (!p1.invoke(iterator.next()).booleanValue()) {
             break ;
          }
       }
       return false;
    }
    public static final Object h2(Iterable p0,l p1){
       Object obj;
       Iterator iterator = p0.iterator();
       do {
          if (iterator.hasNext()) {
          }else {
             obj = null;
             break ;
          }
          obj = iterator.next();
       } while (p1.invoke(obj).booleanValue());
       return obj;
    }
    public static final List h3(Iterable p0,p p1){
       a.p(p0, "$this$mapIndexed");
       a.p(p1, "transform");
       ArrayList uArrayList = new ArrayList(u.Y(p0, 10));
       Iterator iterator = p0.iterator();
       int i = 0;
       while (true) {
          if (!iterator.hasNext()) {
             return uArrayList;
          }
          Object obj = iterator.next();
          int i1 = i + 1;
          if (i < 0) {
             if (l.a(1, 3, 0)) {
                CollectionsKt__CollectionsKt.W();
             }else {
                break ;
             }
          }
          uArrayList.add(p1.invoke(Integer.valueOf(i), obj));
          i = i1;
       }
       throw new ArithmeticException("Index overflow has happened.");
    }
    public static final Pair h4(Iterable p0,l p1){
       a.p(p0, "$this$partition");
       a.p(p1, "predicate");
       ArrayList uArrayList = new ArrayList();
       ArrayList uArrayList1 = new ArrayList();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          Object obj = iterator.next();
          if (p1.invoke(obj).booleanValue()) {
             uArrayList.add(obj);
          }else {
             uArrayList1.add(obj);
          }
       }
       return new Pair(uArrayList, uArrayList1);
    }
    public static final int h5(Iterable p0,l p1){
       a.p(p0, "$this$sumBy");
       a.p(p1, "selector");
       Iterator iterator = p0.iterator();
       int i = 0;
       while (iterator.hasNext()) {
          i = i + p1.invoke(iterator.next()).intValue();
       }
       return i;
    }
    public static final boolean i1(Iterable p0){
       a.p(p0, "$this$any");
       if (p0 instanceof Collection) {
          return (p0.isEmpty() ^ 0x01);
       }
       return p0.iterator().hasNext();
    }
    public static final Object i2(Iterable p0,l p1){
       Iterator iterator = p0.iterator();
       Object obj = null;
       while (iterator.hasNext()) {
          Object obj1 = iterator.next();
          if (p1.invoke(obj1).booleanValue()) {
             obj = obj1;
          }
       }
       return obj;
    }
    public static final List i3(Iterable p0,p p1){
       a.p(p0, "$this$mapIndexedNotNull");
       a.p(p1, "transform");
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = p0.iterator();
       int i = 0;
       while (true) {
          if (!iterator.hasNext()) {
             return uArrayList;
          }
          Object obj = iterator.next();
          int i1 = i + 1;
          if (i < 0) {
             if (l.a(1, 3, 0)) {
                CollectionsKt__CollectionsKt.W();
             }else {
                break ;
             }
          }
          Object obj1 = p1.invoke(Integer.valueOf(i), obj);
          if (obj1 != null) {
             uArrayList.add(obj1);
          }
          i = i1;
       }
       throw new ArithmeticException("Index overflow has happened.");
    }
    public static final List i4(Iterable p0,Iterable p1){
       a.p(p0, "$this$plus");
       a.p(p1, "elements");
       if (p0 instanceof Collection) {
          return CollectionsKt___CollectionsKt.m4(p0, p1);
       }
       ArrayList uArrayList = new ArrayList();
       y.q0(uArrayList, p0);
       y.q0(uArrayList, p1);
       return uArrayList;
    }
    public static final double i5(Iterable p0,l p1){
       a.p(p0, "$this$sumByDouble");
       a.p(p1, "selector");
       Iterator iterator = p0.iterator();
       double d = 0;
       while (iterator.hasNext()) {
          d = d + p1.invoke(iterator.next()).doubleValue();
       }
       return d;
    }
    public static final boolean j1(Iterable p0,l p1){
       a.p(p0, "$this$any");
       a.p(p1, "predicate");
       if (p0 instanceof Collection && p0.isEmpty()) {
          return false;
       }
       Iterator iterator = p0.iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return false;
          }
          if (p1.invoke(iterator.next()).booleanValue()) {
             break ;
          }
       }
       return true;
    }
    public static final Object j2(List p0,l p1){
       Object obj;
       ListIterator listIterator = p0.listIterator(p0.size());
       do {
          if (listIterator.hasPrevious()) {
          }else {
             obj = null;
             break ;
          }
          obj = listIterator.previous();
       } while (p1.invoke(obj).booleanValue());
       return obj;
    }
    public static final Collection j3(Iterable p0,Collection p1,p p2){
       a.p(p0, "$this$mapIndexedNotNullTo");
       a.p(p1, "destination");
       a.p(p2, "transform");
       Iterator iterator = p0.iterator();
       int i = 0;
       while (true) {
          if (!iterator.hasNext()) {
             return p1;
          }
          Object obj = iterator.next();
          int i1 = i + 1;
          if (i < 0) {
             if (l.a(1, 3, 0)) {
                CollectionsKt__CollectionsKt.W();
             }else {
                break ;
             }
          }
          Object obj1 = p2.invoke(Integer.valueOf(i), obj);
          if (obj1 != null) {
             p1.add(obj1);
          }
          i = i1;
       }
       throw new ArithmeticException("Index overflow has happened.");
    }
    public static final List j4(Iterable p0,Object p1){
       a.p(p0, "$this$plus");
       if (p0 instanceof Collection) {
          return CollectionsKt___CollectionsKt.n4(p0, p1);
       }
       ArrayList uArrayList = new ArrayList();
       y.q0(uArrayList, p0);
       uArrayList.add(p1);
       return uArrayList;
    }
    public static final int j5(Iterable p0){
       a.p(p0, "$this$sum");
       Iterator iterator = p0.iterator();
       int i = 0;
       while (iterator.hasNext()) {
          i = i + iterator.next().byteValue();
       }
       return i;
    }
    public static final Iterable k1(Iterable p0){
       return p0;
    }
    public static final Object k2(Iterable p0){
       a.p(p0, "$this$first");
       if (p0 instanceof List) {
          return CollectionsKt___CollectionsKt.m2(p0);
       }
       Iterator iterator = p0.iterator();
       if (iterator.hasNext()) {
          return iterator.next();
       }
       throw new NoSuchElementException("Collection is empty.");
    }
    public static final Collection k3(Iterable p0,Collection p1,p p2){
       a.p(p0, "$this$mapIndexedTo");
       a.p(p1, "destination");
       a.p(p2, "transform");
       Iterator iterator = p0.iterator();
       int i = 0;
       while (true) {
          if (!iterator.hasNext()) {
             return p1;
          }
          Object obj = iterator.next();
          int i1 = i + 1;
          if (i < 0) {
             if (l.a(1, 3, 0)) {
                CollectionsKt__CollectionsKt.W();
             }else {
                break ;
             }
          }
          p1.add(p2.invoke(Integer.valueOf(i), obj));
          i = i1;
       }
       throw new ArithmeticException("Index overflow has happened.");
    }
    public static final List k4(Iterable p0,m p1){
       a.p(p0, "$this$plus");
       a.p(p1, "elements");
       ArrayList uArrayList = new ArrayList();
       y.q0(uArrayList, p0);
       y.r0(uArrayList, p1);
       return uArrayList;
    }
    public static final double k5(Iterable p0){
       a.p(p0, "$this$sum");
       Iterator iterator = p0.iterator();
       double d = 0;
       while (iterator.hasNext()) {
          d = d + iterator.next().doubleValue();
       }
       return d;
    }
    public static final m l1(Iterable p0){
       a.p(p0, "$this$asSequence");
       return new CollectionsKt___CollectionsKt$a(p0);
    }
    public static final Object l2(Iterable p0,l p1){
       Object obj;
       a.p(p0, "$this$first");
       a.p(p1, "predicate");
       Iterator iterator = p0.iterator();
       while (true) {
          if (!iterator.hasNext()) {
             throw new NoSuchElementException("Collection contains no element matching the predicate.");
          }
          obj = iterator.next();
          if (p1.invoke(obj).booleanValue()) {
             break ;
          }
       }
       return obj;
    }
    public static final List l3(Iterable p0,l p1){
       a.p(p0, "$this$mapNotNull");
       a.p(p1, "transform");
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          Object obj = p1.invoke(iterator.next());
          if (obj != null) {
             uArrayList.add(obj);
          }
       }
       return uArrayList;
    }
    public static final List l4(Iterable p0,Object[] p1){
       a.p(p0, "$this$plus");
       a.p(p1, "elements");
       if (p0 instanceof Collection) {
          return CollectionsKt___CollectionsKt.p4(p0, p1);
       }
       ArrayList uArrayList = new ArrayList();
       y.q0(uArrayList, p0);
       y.s0(uArrayList, p1);
       return uArrayList;
    }
    public static final double l5(Iterable p0,l p1){
       double d = (double)0;
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          d = d + p1.invoke(iterator.next()).doubleValue();
       }
       return d;
    }
    public static final Map m1(Iterable p0,l p1){
       a.p(p0, "$this$associate");
       a.p(p1, "transform");
       LinkedHashMap linkedHashMa = new LinkedHashMap(q.n(s0.j(u.Y(p0, 10)), 16));
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          Pair pair = p1.invoke(iterator.next());
          Object first = pair.getFirst();
          linkedHashMa.put(first, pair.getSecond());
       }
       return linkedHashMa;
    }
    public static final Object m2(List p0){
       a.p(p0, "$this$first");
       if (!p0.isEmpty()) {
          return p0.get(0);
       }
       throw new NoSuchElementException("List is empty.");
    }
    public static final Collection m3(Iterable p0,Collection p1,l p2){
       a.p(p0, "$this$mapNotNullTo");
       a.p(p1, "destination");
       a.p(p2, "transform");
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          Object obj = p2.invoke(iterator.next());
          if (obj != null) {
             p1.add(obj);
          }
       }
       return p1;
    }
    public static final List m4(Collection p0,Iterable p1){
       ArrayList uArrayList;
       a.p(p0, "$this$plus");
       a.p(p1, "elements");
       if (p1 instanceof Collection) {
          uArrayList = new ArrayList((p0.size() + p1.size()));
          uArrayList.addAll(p0);
          uArrayList.addAll(p1);
          return uArrayList;
       }else {
          uArrayList = new ArrayList(p0);
          y.q0(uArrayList, p1);
          return uArrayList;
       }
    }
    public static final float m5(Iterable p0){
       a.p(p0, "$this$sum");
       Iterator iterator = p0.iterator();
       float f = 0;
       while (iterator.hasNext()) {
          f = f + iterator.next().floatValue();
       }
       return f;
    }
    public static final Map n1(Iterable p0,l p1){
       a.p(p0, "$this$associateBy");
       a.p(p1, "keySelector");
       LinkedHashMap linkedHashMa = new LinkedHashMap(q.n(s0.j(u.Y(p0, 10)), 16));
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          Object obj = iterator.next();
          linkedHashMa.put(p1.invoke(obj), obj);
       }
       return linkedHashMa;
    }
    public static final Object n2(Iterable p0){
       a.p(p0, "$this$firstOrNull");
       if (p0 instanceof List) {
          if (p0.isEmpty()) {
             return null;
          }
          return p0.get(0);
       }else {
          Iterator iterator = p0.iterator();
          if (!iterator.hasNext()) {
             return null;
          }
          return iterator.next();
       }
    }
    public static final Collection n3(Iterable p0,Collection p1,l p2){
       a.p(p0, "$this$mapTo");
       a.p(p1, "destination");
       a.p(p2, "transform");
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          p1.add(p2.invoke(iterator.next()));
       }
       return p1;
    }
    public static final List n4(Collection p0,Object p1){
       a.p(p0, "$this$plus");
       ArrayList uArrayList = new ArrayList((p0.size() + 1));
       uArrayList.addAll(p0);
       uArrayList.add(p1);
       return uArrayList;
    }
    public static final int n5(Iterable p0){
       a.p(p0, "$this$sum");
       Iterator iterator = p0.iterator();
       int i = 0;
       while (iterator.hasNext()) {
          i = i + iterator.next().intValue();
       }
       return i;
    }
    public static final Map o1(Iterable p0,l p1,l p2){
       a.p(p0, "$this$associateBy");
       a.p(p1, "keySelector");
       a.p(p2, "valueTransform");
       LinkedHashMap linkedHashMa = new LinkedHashMap(q.n(s0.j(u.Y(p0, 10)), 16));
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          Object obj = iterator.next();
          Object obj1 = p1.invoke(obj);
          linkedHashMa.put(obj1, p2.invoke(obj));
       }
       return linkedHashMa;
    }
    public static final Object o2(Iterable p0,l p1){
       Object obj;
       a.p(p0, "$this$firstOrNull");
       a.p(p1, "predicate");
       Iterator iterator = p0.iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return null;
          }
          obj = iterator.next();
          if (p1.invoke(obj).booleanValue()) {
             break ;
          }
       }
       return obj;
    }
    public static final Comparable o3(Iterable p0){
       a.p(p0, "$this$max");
       return CollectionsKt___CollectionsKt.B3(p0);
    }
    public static final List o4(Collection p0,m p1){
       a.p(p0, "$this$plus");
       a.p(p1, "elements");
       ArrayList uArrayList = new ArrayList((p0.size() + 10));
       uArrayList.addAll(p0);
       y.r0(uArrayList, p1);
       return uArrayList;
    }
    public static final int o5(Iterable p0,l p1){
       Iterator iterator = p0.iterator();
       int i = 0;
       while (iterator.hasNext()) {
          i = i + p1.invoke(iterator.next()).intValue();
       }
       return i;
    }
    public static final Map p1(Iterable p0,Map p1,l p2){
       a.p(p0, "$this$associateByTo");
       a.p(p1, "destination");
       a.p(p2, "keySelector");
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          Object obj = iterator.next();
          p1.put(p2.invoke(obj), obj);
       }
       return p1;
    }
    public static final Object p2(List p0){
       a.p(p0, "$this$firstOrNull");
       p0 = (p0.isEmpty())? null: p0.get(0);
       return p0;
    }
    public static final Double p3(Iterable p0){
       a.p(p0, "$this$max");
       return CollectionsKt___CollectionsKt.C3(p0);
    }
    public static final List p4(Collection p0,Object[] p1){
       a.p(p0, "$this$plus");
       a.p(p1, "elements");
       ArrayList uArrayList = new ArrayList((p0.size() + p1.length));
       uArrayList.addAll(p0);
       y.s0(uArrayList, p1);
       return uArrayList;
    }
    public static final long p5(Iterable p0){
       a.p(p0, "$this$sum");
       Iterator iterator = p0.iterator();
       long l = 0;
       while (iterator.hasNext()) {
          l = l + iterator.next().longValue();
       }
       return l;
    }
    public static final Map q1(Iterable p0,Map p1,l p2,l p3){
       a.p(p0, "$this$associateByTo");
       a.p(p1, "destination");
       a.p(p2, "keySelector");
       a.p(p3, "valueTransform");
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          Object obj = iterator.next();
          Object obj1 = p2.invoke(obj);
          p1.put(obj1, p3.invoke(obj));
       }
       return p1;
    }
    public static final List q2(Iterable p0,l p1){
       a.p(p0, "$this$flatMap");
       a.p(p1, "transform");
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          y.q0(uArrayList, p1.invoke(iterator.next()));
       }
       return uArrayList;
    }
    public static final Float q3(Iterable p0){
       a.p(p0, "$this$max");
       return CollectionsKt___CollectionsKt.D3(p0);
    }
    public static final List q4(Iterable p0,Object p1){
       return CollectionsKt___CollectionsKt.j4(p0, p1);
    }
    public static final long q5(Iterable p0,l p1){
       Iterator iterator = p0.iterator();
       long l = 0;
       while (iterator.hasNext()) {
          l = l + p1.invoke(iterator.next()).longValue();
       }
       return l;
    }
    public static final Map r1(Iterable p0,Map p1,l p2){
       a.p(p0, "$this$associateTo");
       a.p(p1, "destination");
       a.p(p2, "transform");
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          Pair pair = p2.invoke(iterator.next());
          Object first = pair.getFirst();
          p1.put(first, pair.getSecond());
       }
       return p1;
    }
    public static final List r2(Iterable p0,p p1){
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = p0.iterator();
       int i = 0;
       while (true) {
          if (!iterator.hasNext()) {
             return uArrayList;
          }
          Object obj = iterator.next();
          int i1 = i + 1;
          if (i < 0) {
             if (l.a(1, 3, 0)) {
                CollectionsKt__CollectionsKt.W();
             }else {
                break ;
             }
          }
          y.q0(uArrayList, p1.invoke(Integer.valueOf(i), obj));
          i = i1;
       }
       throw new ArithmeticException("Index overflow has happened.");
    }
    public static final Object r3(Iterable p0,l p1){
       a.p(p0, "$this$maxBy");
       a.p(p1, "selector");
       Iterator iterator = p0.iterator();
       if (!iterator.hasNext()) {
          iterator = null;
       }else {
          Object obj = iterator.next();
          if (iterator.hasNext()) {
             Comparable uComparable = p1.invoke(obj);
             do {
                Object obj1 = iterator.next();
                Comparable uComparable1 = p1.invoke(obj1);
                if (uComparable.compareTo(uComparable1) < 0) {
                   obj = obj1;
                   uComparable = uComparable1;
                }
             } while (!iterator.hasNext());
          }
          iterator = obj;
       }
       return iterator;
    }
    public static final List r4(Collection p0,Object p1){
       return CollectionsKt___CollectionsKt.n4(p0, p1);
    }
    public static final int r5(Iterable p0){
       a.p(p0, "$this$sum");
       Iterator iterator = p0.iterator();
       int i = 0;
       while (iterator.hasNext()) {
          i = i + iterator.next().shortValue();
       }
       return i;
    }
    public static final Map s1(Iterable p0,l p1){
       a.p(p0, "$this$associateWith");
       a.p(p1, "valueSelector");
       LinkedHashMap linkedHashMa = new LinkedHashMap(q.n(s0.j(u.Y(p0, 10)), 16));
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          Object obj = iterator.next();
          linkedHashMa.put(obj, p1.invoke(obj));
       }
       return linkedHashMa;
    }
    public static final Collection s2(Iterable p0,Collection p1,p p2){
       Iterator iterator = p0.iterator();
       int i = 0;
       while (true) {
          if (!iterator.hasNext()) {
             return p1;
          }
          Object obj = iterator.next();
          int i1 = i + 1;
          if (i < 0) {
             if (l.a(1, 3, 0)) {
                CollectionsKt__CollectionsKt.W();
             }else {
                break ;
             }
          }
          y.q0(p1, p2.invoke(Integer.valueOf(i), obj));
          i = i1;
       }
       throw new ArithmeticException("Index overflow has happened.");
    }
    public static final Object s3(Iterable p0,l p1){
       a.p(p0, "$this$maxByOrNull");
       a.p(p1, "selector");
       Iterator iterator = p0.iterator();
       if (!iterator.hasNext()) {
          return null;
       }
       Object obj = iterator.next();
       if (!iterator.hasNext()) {
          return obj;
       }
       Comparable uComparable = p1.invoke(obj);
       do {
          Object obj1 = iterator.next();
          Comparable uComparable1 = p1.invoke(obj1);
          if (uComparable.compareTo(uComparable1) < 0) {
             obj = obj1;
             uComparable = uComparable1;
          }
       } while (!iterator.hasNext());
       return obj;
    }
    public static final Object s4(Collection p0){
       return CollectionsKt___CollectionsKt.t4(p0, e.b);
    }
    public static final int s5(Iterable p0,l p1){
       int i = x0.h(0);
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          i = i + p1.invoke(iterator.next()).J0();
          i = x0.h(i);
       }
       return i;
    }
    public static final Map t1(Iterable p0,Map p1,l p2){
       a.p(p0, "$this$associateWithTo");
       a.p(p1, "destination");
       a.p(p2, "valueSelector");
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          Object obj = iterator.next();
          p1.put(obj, p2.invoke(obj));
       }
       return p1;
    }
    public static final List t2(Iterable p0,p p1){
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = p0.iterator();
       int i = 0;
       while (true) {
          if (!iterator.hasNext()) {
             return uArrayList;
          }
          Object obj = iterator.next();
          int i1 = i + 1;
          if (i < 0) {
             if (l.a(1, 3, 0)) {
                CollectionsKt__CollectionsKt.W();
             }else {
                break ;
             }
          }
          y.r0(uArrayList, p1.invoke(Integer.valueOf(i), obj));
          i = i1;
       }
       throw new ArithmeticException("Index overflow has happened.");
    }
    public static final double t3(Iterable p0,l p1){
       Iterator iterator = p0.iterator();
       if (!iterator.hasNext()) {
          throw new NoSuchElementException();
       }
       double d = p1.invoke(iterator.next()).doubleValue();
       while (iterator.hasNext()) {
          d = Math.max(d, p1.invoke(iterator.next()).doubleValue());
       }
       return d;
    }
    public static final Object t4(Collection p0,e p1){
       a.p(p0, "$this$random");
       a.p(p1, "random");
       if (!p0.isEmpty()) {
          return CollectionsKt___CollectionsKt.R1(p0, p1.l(p0.size()));
       }
       throw new NoSuchElementException("Collection is empty.");
    }
    public static final long t5(Iterable p0,l p1){
       long l = b1.h((long)0);
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          l = l + p1.invoke(iterator.next()).J0();
          l = b1.h(l);
       }
       return l;
    }
    public static final double u1(Iterable p0){
       a.p(p0, "$this$average");
       Iterator iterator = p0.iterator();
       double d = 0;
       int i = 0;
       while (iterator.hasNext()) {
          d = d + (double)iterator.next().byteValue();
          i = i + 1;
          if (i < 0) {
             CollectionsKt__CollectionsKt.V();
          }
       }
       d = (!i)? Double.NaN: d / (double)i;
       return d;
    }
    public static final Collection u2(Iterable p0,Collection p1,p p2){
       Iterator iterator = p0.iterator();
       int i = 0;
       while (true) {
          if (!iterator.hasNext()) {
             return p1;
          }
          Object obj = iterator.next();
          int i1 = i + 1;
          if (i < 0) {
             if (l.a(1, 3, 0)) {
                CollectionsKt__CollectionsKt.W();
             }else {
                break ;
             }
          }
          y.r0(p1, p2.invoke(Integer.valueOf(i), obj));
          i = i1;
       }
       throw new ArithmeticException("Index overflow has happened.");
    }
    public static final float u3(Iterable p0,l p1){
       Iterator iterator = p0.iterator();
       if (!iterator.hasNext()) {
          throw new NoSuchElementException();
       }
       float f = p1.invoke(iterator.next()).floatValue();
       while (iterator.hasNext()) {
          f = Math.max(f, p1.invoke(iterator.next()).floatValue());
       }
       return f;
    }
    public static final Object u4(Collection p0){
       return CollectionsKt___CollectionsKt.v4(p0, e.b);
    }
    public static final List u5(Iterable p0,int p1){
       a.p(p0, "$this$take");
       int i = 0;
       int i1 = (p1 >= 0)? 1: 0;
       if (i1) {
          if (!p1) {
             return CollectionsKt__CollectionsKt.E();
          }else if(p0 instanceof Collection){
             if (p1 >= p0.size()) {
                return CollectionsKt___CollectionsKt.G5(p0);
             }else if(p1 == 1){
                return t.k(CollectionsKt___CollectionsKt.k2(p0));
             }
          }
          ArrayList uArrayList = new ArrayList(p1);
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             uArrayList.add(iterator.next());
             i = i + 1;
             if (i == p1) {
                break ;
             }
          }
          return CollectionsKt__CollectionsKt.Q(uArrayList);
       }else {
          throw new IllegalArgumentException("Requested element count "+p1+" is less than zero.".toString());
       }
    }
    public static final double v1(Iterable p0){
       a.p(p0, "$this$average");
       Iterator iterator = p0.iterator();
       double d = 0;
       int i = 0;
       while (iterator.hasNext()) {
          d = d + iterator.next().doubleValue();
          i = i + 1;
          if (i < 0) {
             CollectionsKt__CollectionsKt.V();
          }
       }
       d = (!i)? Double.NaN: d / (double)i;
       return d;
    }
    public static final List v2(Iterable p0,l p1){
       a.p(p0, "$this$flatMap");
       a.p(p1, "transform");
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          y.r0(uArrayList, p1.invoke(iterator.next()));
       }
       return uArrayList;
    }
    public static final Comparable v3(Iterable p0,l p1){
       Iterator iterator = p0.iterator();
       if (!iterator.hasNext()) {
          throw new NoSuchElementException();
       }
       Comparable uComparable = p1.invoke(iterator.next());
       while (iterator.hasNext()) {
          Comparable uComparable1 = p1.invoke(iterator.next());
          if (uComparable.compareTo(uComparable1) < 0) {
             uComparable = uComparable1;
          }
       }
       return uComparable;
    }
    public static final Object v4(Collection p0,e p1){
       a.p(p0, "$this$randomOrNull");
       a.p(p1, "random");
       if (p0.isEmpty()) {
          return null;
       }
       return CollectionsKt___CollectionsKt.R1(p0, p1.l(p0.size()));
    }
    public static final List v5(List p0,int p1){
       a.p(p0, "$this$takeLast");
       int i = 1;
       int i1 = (p1 >= 0)? 1: 0;
       if (i1) {
          if (!p1) {
             return CollectionsKt__CollectionsKt.E();
          }else {
             i1 = p0.size();
             if (p1 >= i1) {
                return CollectionsKt___CollectionsKt.G5(p0);
             }else if(p1 == i){
                return t.k(CollectionsKt___CollectionsKt.Y2(p0));
             }else {
                ArrayList uArrayList = new ArrayList(p1);
                if (p0 instanceof RandomAccess) {
                   for (p1 = i1 - p1; p1 < i1; p1++) {
                      uArrayList.add(p0.get(p1));
                   }
                }else {
                   ListIterator listIterator = p0.listIterator((i1 - p1));
                   while (listIterator.hasNext()) {
                      uArrayList.add(listIterator.next());
                   }
                }
                return uArrayList;
             }
          }
       }else {
          throw new IllegalArgumentException("Requested element count "+p1+" is less than zero.".toString());
       }
    }
    public static final double w1(Iterable p0){
       a.p(p0, "$this$average");
       Iterator iterator = p0.iterator();
       double d = 0;
       int i = 0;
       while (iterator.hasNext()) {
          d = d + (double)iterator.next().floatValue();
          i = i + 1;
          if (i < 0) {
             CollectionsKt__CollectionsKt.V();
          }
       }
       d = (!i)? Double.NaN: d / (double)i;
       return d;
    }
    public static final Collection w2(Iterable p0,Collection p1,l p2){
       a.p(p0, "$this$flatMapTo");
       a.p(p1, "destination");
       a.p(p2, "transform");
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          y.r0(p1, p2.invoke(iterator.next()));
       }
       return p1;
    }
    public static final Comparable w3(Iterable p0,l p1){
       Iterator iterator = p0.iterator();
       if (!iterator.hasNext()) {
          return null;
       }
       Comparable uComparable = p1.invoke(iterator.next());
       while (iterator.hasNext()) {
          Comparable uComparable1 = p1.invoke(iterator.next());
          if (uComparable.compareTo(uComparable1) < 0) {
             uComparable = uComparable1;
          }
       }
       return uComparable;
    }
    public static final Object w4(Iterable p0,p p1){
       a.p(p0, "$this$reduce");
       a.p(p1, "operation");
       Iterator iterator = p0.iterator();
       if (!iterator.hasNext()) {
          throw new UnsupportedOperationException("Empty collection can\'t be reduced.");
       }
       Object obj = iterator.next();
       while (iterator.hasNext()) {
          obj = p1.invoke(obj, iterator.next());
       }
       return obj;
    }
    public static final List w5(List p0,l p1){
       a.p(p0, "$this$takeLastWhile");
       a.p(p1, "predicate");
       if (p0.isEmpty()) {
          return CollectionsKt__CollectionsKt.E();
       }
       ListIterator listIterator = p0.listIterator(p0.size());
       while (true) {
          if (!listIterator.hasPrevious()) {
             return CollectionsKt___CollectionsKt.G5(p0);
          }
          if (!p1.invoke(listIterator.previous()).booleanValue()) {
             listIterator.next();
             int i = p0.size() - listIterator.nextIndex();
             if (!i) {
                break ;
             }else {
                ArrayList uArrayList = new ArrayList(i);
                while (listIterator.hasNext()) {
                   uArrayList.add(listIterator.next());
                }
                return uArrayList;
             }
          }
       }
       return CollectionsKt__CollectionsKt.E();
    }
    public static final double x1(Iterable p0){
       a.p(p0, "$this$average");
       Iterator iterator = p0.iterator();
       double d = 0;
       int i = 0;
       while (iterator.hasNext()) {
          d = d + (double)iterator.next().intValue();
          i = i + 1;
          if (i < 0) {
             CollectionsKt__CollectionsKt.V();
          }
       }
       d = (!i)? Double.NaN: d / (double)i;
       return d;
    }
    public static final Collection x2(Iterable p0,Collection p1,l p2){
       a.p(p0, "$this$flatMapTo");
       a.p(p1, "destination");
       a.p(p2, "transform");
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          y.q0(p1, p2.invoke(iterator.next()));
       }
       return p1;
    }
    public static final Double x3(Iterable p0,l p1){
       Iterator iterator = p0.iterator();
       if (!iterator.hasNext()) {
          return null;
       }
       double d = p1.invoke(iterator.next()).doubleValue();
       while (iterator.hasNext()) {
          d = Math.max(d, p1.invoke(iterator.next()).doubleValue());
       }
       return Double.valueOf(d);
    }
    public static final Object x4(Iterable p0,q p1){
       a.p(p0, "$this$reduceIndexed");
       a.p(p1, "operation");
       Iterator iterator = p0.iterator();
       if (!iterator.hasNext()) {
          throw new UnsupportedOperationException("Empty collection can\'t be reduced.");
       }
       Object obj = iterator.next();
       int i = 1;
       while (true) {
          if (!iterator.hasNext()) {
             return obj;
          }
          int i1 = i + 1;
          if (i < 0) {
             if (l.a(1, 3, 0)) {
                CollectionsKt__CollectionsKt.W();
             }else {
                break ;
             }
          }
          obj = p1.invoke(Integer.valueOf(i), obj, iterator.next());
          i = i1;
       }
       throw new ArithmeticException("Index overflow has happened.");
    }
    public static final List x5(Iterable p0,l p1){
       a.p(p0, "$this$takeWhile");
       a.p(p1, "predicate");
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          Object obj = iterator.next();
          if (!p1.invoke(obj).booleanValue()) {
             break ;
          }else {
             uArrayList.add(obj);
          }
       }
       return uArrayList;
    }
    public static final double y1(Iterable p0){
       a.p(p0, "$this$average");
       Iterator iterator = p0.iterator();
       double d = 0;
       int i = 0;
       while (iterator.hasNext()) {
          d = d + (double)iterator.next().longValue();
          i = i + 1;
          if (i < 0) {
             CollectionsKt__CollectionsKt.V();
          }
       }
       d = (!i)? Double.NaN: d / (double)i;
       return d;
    }
    public static final Object y2(Iterable p0,Object p1,p p2){
       a.p(p0, "$this$fold");
       a.p(p2, "operation");
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          p1 = p2.invoke(p1, iterator.next());
       }
       return p1;
    }
    public static final Float y3(Iterable p0,l p1){
       Iterator iterator = p0.iterator();
       if (!iterator.hasNext()) {
          return null;
       }
       float f = p1.invoke(iterator.next()).floatValue();
       while (iterator.hasNext()) {
          f = Math.max(f, p1.invoke(iterator.next()).floatValue());
       }
       return Float.valueOf(f);
    }
    public static final Object y4(Iterable p0,q p1){
       a.p(p0, "$this$reduceIndexedOrNull");
       a.p(p1, "operation");
       Iterator iterator = p0.iterator();
       if (!iterator.hasNext()) {
          return null;
       }
       Object obj = iterator.next();
       int i = 1;
       while (true) {
          if (!iterator.hasNext()) {
             return obj;
          }
          int i1 = i + 1;
          if (i < 0) {
             if (l.a(1, 3, 0)) {
                CollectionsKt__CollectionsKt.W();
             }else {
                break ;
             }
          }
          obj = p1.invoke(Integer.valueOf(i), obj, iterator.next());
          i = i1;
       }
       throw new ArithmeticException("Index overflow has happened.");
    }
    public static final boolean[] y5(Collection p0){
       a.p(p0, "$this$toBooleanArray");
       boolean[] uobooleanArr = new boolean[p0.size()];
       Iterator iterator = p0.iterator();
       int i = 0;
       while (iterator.hasNext()) {
          int i1 = i + 1;
          uobooleanArr[i] = iterator.next().booleanValue();
          i = i1;
       }
       return uobooleanArr;
    }
    public static final double z1(Iterable p0){
       a.p(p0, "$this$average");
       Iterator iterator = p0.iterator();
       double d = 0;
       int i = 0;
       while (iterator.hasNext()) {
          d = d + (double)iterator.next().shortValue();
          i = i + 1;
          if (i < 0) {
             CollectionsKt__CollectionsKt.V();
          }
       }
       d = (!i)? Double.NaN: d / (double)i;
       return d;
    }
    public static final Object z2(Iterable p0,Object p1,q p2){
       a.p(p0, "$this$foldIndexed");
       a.p(p2, "operation");
       Iterator iterator = p0.iterator();
       int i = 0;
       while (true) {
          if (!iterator.hasNext()) {
             return p1;
          }
          Object obj = iterator.next();
          int i1 = i + 1;
          if (i < 0) {
             if (l.a(1, 3, 0)) {
                CollectionsKt__CollectionsKt.W();
             }else {
                break ;
             }
          }
          p1 = p2.invoke(Integer.valueOf(i), p1, obj);
          i = i1;
       }
       throw new ArithmeticException("Index overflow has happened.");
    }
    public static final Object z3(Iterable p0,Comparator p1,l p2){
       Iterator iterator = p0.iterator();
       if (!iterator.hasNext()) {
          throw new NoSuchElementException();
       }
       Object obj = p2.invoke(iterator.next());
       while (iterator.hasNext()) {
          Object obj1 = p2.invoke(iterator.next());
          if (p1.compare(obj, obj1) < 0) {
             obj = obj1;
          }
       }
       return obj;
    }
    public static final Object z4(Iterable p0,p p1){
       a.p(p0, "$this$reduceOrNull");
       a.p(p1, "operation");
       Iterator iterator = p0.iterator();
       if (!iterator.hasNext()) {
          return null;
       }
       Object obj = iterator.next();
       while (iterator.hasNext()) {
          obj = p1.invoke(obj, iterator.next());
       }
       return obj;
    }
    public static final byte[] z5(Collection p0){
       a.p(p0, "$this$toByteArray");
       byte[] uobyteArray = new byte[p0.size()];
       Iterator iterator = p0.iterator();
       int i = 0;
       while (iterator.hasNext()) {
          int i1 = i + 1;
          uobyteArray[i] = iterator.next().byteValue();
          i = i1;
       }
       return uobyteArray;
    }
}
