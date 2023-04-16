package kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.sequences.SequencesKt___SequencesJvmKt;
import wsd.m;
import java.util.Collection;
import msd.p;
import java.util.Iterator;
import java.lang.Object;
import fsd.l;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.lang.ArithmeticException;
import java.lang.String;
import java.lang.Integer;
import java.lang.Iterable;
import trd.y;
import java.util.Comparator;
import kotlin.jvm.internal.a;
import msd.l;
import xrd.b$b;
import kotlin.sequences.SequencesKt___SequencesKt$flatMapIndexed$2;
import kotlin.sequences.SequencesKt__SequencesKt;
import java.lang.Comparable;
import xrd.b$d;
import java.lang.Double;
import xrd.b;
import java.lang.Boolean;
import wsd.i;
import kotlin.sequences.SequencesKt___SequencesKt$flatMap$1;
import java.lang.Float;
import kotlin.sequences.SequencesKt___SequencesKt$d;
import java.lang.Number;
import kotlin.sequences.SequencesKt___SequencesKt$a;
import java.lang.Math;
import java.util.NoSuchElementException;
import msd.q;
import java.util.Map;
import java.util.LinkedHashMap;
import kotlin.Pair;
import java.util.ArrayList;
import java.util.List;
import trd.e0;
import kotlin.sequences.SequencesKt___SequencesKt$b;
import qrd.x0;
import qrd.b1;
import wsd.e;
import wsd.t;
import java.lang.StringBuilder;
import java.lang.IllegalArgumentException;
import java.lang.Appendable;
import java.lang.CharSequence;
import zsd.n;
import wsd.u;
import kotlin.sequences.SequencesKt___SequencesKt$minus$3;
import kotlin.sequences.SequencesKt___SequencesKt$minus$1;
import java.util.HashSet;
import kotlin.sequences.SequencesKt___SequencesKt$minus$4;
import kotlin.sequences.SequencesKt___SequencesKt$minus$2;
import java.util.Set;
import java.util.LinkedHashSet;
import trd.d1;
import kotlin.collections.SlidingWindowKt;
import kotlin.sequences.SequencesKt___SequencesKt$onEach$1;
import kotlin.sequences.SequencesKt___SequencesKt$distinct$1;
import wsd.w;
import kotlin.sequences.SequencesKt___SequencesKt$onEachIndexed$1;
import wsd.c;
import wsd.v;
import wsd.d;
import kotlin.collections.CollectionsKt___CollectionsKt;
import wsd.k;
import wsd.f;
import wsd.l;
import kotlin.sequences.SequencesKt___SequencesKt$zip$1;
import kotlin.sequences.SequencesKt___SequencesKt$elementAt$1;
import trd.n;
import kotlin.sequences.SequencesKt___SequencesKt$zipWithNext$1;
import kotlin.sequences.SequencesKt___SequencesKt$zipWithNext$2;
import asd.c;
import wsd.q;
import wsd.h;
import java.lang.UnsupportedOperationException;
import kotlin.sequences.SequencesKt___SequencesKt$filterIndexed$1;
import kotlin.sequences.SequencesKt___SequencesKt$filterIndexed$2;
import kotlin.sequences.SequencesKt___SequencesKt$filterIsInstance$1;
import java.util.Objects;
import kotlin.sequences.SequencesKt___SequencesKt$requireNoNulls$1;
import kotlin.sequences.SequencesKt___SequencesKt$runningFold$1;
import kotlin.sequences.SequencesKt___SequencesKt$filterNotNull$1;
import kotlin.sequences.SequencesKt___SequencesKt$runningFoldIndexed$1;
import kotlin.sequences.SequencesKt___SequencesKt$runningReduce$1;
import kotlin.sequences.SequencesKt___SequencesKt$runningReduceIndexed$1;
import kotlin.sequences.SequencesKt___SequencesKt$flatMap$2;
import kotlin.sequences.SequencesKt___SequencesKt$flatMapIndexed$1;
import kotlin.sequences.SequencesKt___SequencesKt$c;

public class SequencesKt___SequencesKt extends SequencesKt___SequencesJvmKt	// class@0018e7
{

    public void SequencesKt___SequencesKt(){
       super();
    }
    public static final Collection A0(m p0,Collection p1,p p2){
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
    public static final Object A1(m p0,Comparator p1){
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
    public static final m A2(m p0,l p1){
       a.p(p0, "$this$sortedBy");
       a.p(p1, "selector");
       return SequencesKt___SequencesKt.D2(p0, new b$b(p1));
    }
    public static final m B0(m p0,p p1){
       a.p(p0, "$this$flatMapIndexed");
       a.p(p1, "transform");
       return SequencesKt__SequencesKt.k(p0, p1, SequencesKt___SequencesKt$flatMapIndexed$2.INSTANCE);
    }
    public static final Comparable B1(m p0){
       a.p(p0, "$this$min");
       return SequencesKt___SequencesKt.O1(p0);
    }
    public static final m B2(m p0,l p1){
       a.p(p0, "$this$sortedByDescending");
       a.p(p1, "selector");
       return SequencesKt___SequencesKt.D2(p0, new b$d(p1));
    }
    public static final Collection C0(m p0,Collection p1,p p2){
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
    public static final Double C1(m p0){
       a.p(p0, "$this$min");
       return SequencesKt___SequencesKt.P1(p0);
    }
    public static final m C2(m p0){
       a.p(p0, "$this$sortedDescending");
       return SequencesKt___SequencesKt.D2(p0, b.p());
    }
    public static final boolean D(m p0,l p1){
       a.p(p0, "$this$all");
       a.p(p1, "predicate");
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
    public static final m D0(m p0,l p1){
       a.p(p0, "$this$flatMap");
       a.p(p1, "transform");
       return new i(p0, p1, SequencesKt___SequencesKt$flatMap$1.INSTANCE);
    }
    public static final Float D1(m p0){
       a.p(p0, "$this$min");
       return SequencesKt___SequencesKt.Q1(p0);
    }
    public static final m D2(m p0,Comparator p1){
       a.p(p0, "$this$sortedWith");
       a.p(p1, "comparator");
       return new SequencesKt___SequencesKt$d(p0, p1);
    }
    public static final boolean E(m p0){
       a.p(p0, "$this$any");
       return p0.iterator().hasNext();
    }
    public static final Collection E0(m p0,Collection p1,l p2){
       a.p(p0, "$this$flatMapTo");
       a.p(p1, "destination");
       a.p(p2, "transform");
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          y.q0(p1, p2.invoke(iterator.next()));
       }
       return p1;
    }
    public static final Object E1(m p0,l p1){
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
    public static final int E2(m p0,l p1){
       a.p(p0, "$this$sumBy");
       a.p(p1, "selector");
       Iterator iterator = p0.iterator();
       int i = 0;
       while (iterator.hasNext()) {
          i = i + p1.invoke(iterator.next()).intValue();
       }
       return i;
    }
    public static final boolean F(m p0,l p1){
       a.p(p0, "$this$any");
       a.p(p1, "predicate");
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
    public static final Collection F0(m p0,Collection p1,l p2){
       a.p(p0, "$this$flatMapTo");
       a.p(p1, "destination");
       a.p(p2, "transform");
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          y.r0(p1, p2.invoke(iterator.next()));
       }
       return p1;
    }
    public static final Object F1(m p0,l p1){
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
    public static final double F2(m p0,l p1){
       a.p(p0, "$this$sumByDouble");
       a.p(p1, "selector");
       Iterator iterator = p0.iterator();
       double d = 0;
       while (iterator.hasNext()) {
          d = d + p1.invoke(iterator.next()).doubleValue();
       }
       return d;
    }
    public static final Iterable G(m p0){
       a.p(p0, "$this$asIterable");
       return new SequencesKt___SequencesKt$a(p0);
    }
    public static final Object G0(m p0,Object p1,p p2){
       a.p(p0, "$this$fold");
       a.p(p2, "operation");
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          p1 = p2.invoke(p1, iterator.next());
       }
       return p1;
    }
    public static final double G1(m p0,l p1){
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
    public static final int G2(m p0){
       a.p(p0, "$this$sum");
       Iterator iterator = p0.iterator();
       int i = 0;
       while (iterator.hasNext()) {
          i = i + iterator.next().byteValue();
       }
       return i;
    }
    public static final m H(m p0){
       return p0;
    }
    public static final Object H0(m p0,Object p1,q p2){
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
    public static final float H1(m p0,l p1){
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
    public static final double H2(m p0){
       a.p(p0, "$this$sum");
       Iterator iterator = p0.iterator();
       double d = 0;
       while (iterator.hasNext()) {
          d = d + iterator.next().doubleValue();
       }
       return d;
    }
    public static final Map I(m p0,l p1){
       a.p(p0, "$this$associate");
       a.p(p1, "transform");
       LinkedHashMap linkedHashMa = new LinkedHashMap();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          Pair pair = p1.invoke(iterator.next());
          Object first = pair.getFirst();
          linkedHashMa.put(first, pair.getSecond());
       }
       return linkedHashMa;
    }
    public static final void I0(m p0,l p1){
       a.p(p0, "$this$forEach");
       a.p(p1, "action");
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          p1.invoke(iterator.next());
       }
       return;
    }
    public static final Comparable I1(m p0,l p1){
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
    public static final double I2(m p0,l p1){
       double d = (double)0;
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          d = d + p1.invoke(iterator.next()).doubleValue();
       }
       return d;
    }
    public static final Map J(m p0,l p1){
       a.p(p0, "$this$associateBy");
       a.p(p1, "keySelector");
       LinkedHashMap linkedHashMa = new LinkedHashMap();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          Object obj = iterator.next();
          linkedHashMa.put(p1.invoke(obj), obj);
       }
       return linkedHashMa;
    }
    public static final void J0(m p0,p p1){
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
    public static final Comparable J1(m p0,l p1){
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
    public static final float J2(m p0){
       a.p(p0, "$this$sum");
       Iterator iterator = p0.iterator();
       float f = 0;
       while (iterator.hasNext()) {
          f = f + iterator.next().floatValue();
       }
       return f;
    }
    public static final Map K(m p0,l p1,l p2){
       a.p(p0, "$this$associateBy");
       a.p(p1, "keySelector");
       a.p(p2, "valueTransform");
       LinkedHashMap linkedHashMa = new LinkedHashMap();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          Object obj = iterator.next();
          Object obj1 = p1.invoke(obj);
          linkedHashMa.put(obj1, p2.invoke(obj));
       }
       return linkedHashMa;
    }
    public static final Map K0(m p0,l p1){
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
    public static final Double K1(m p0,l p1){
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
    public static final int K2(m p0){
       a.p(p0, "$this$sum");
       Iterator iterator = p0.iterator();
       int i = 0;
       while (iterator.hasNext()) {
          i = i + iterator.next().intValue();
       }
       return i;
    }
    public static final Map L(m p0,Map p1,l p2){
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
    public static final Map L0(m p0,l p1,l p2){
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
    public static final Float L1(m p0,l p1){
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
    public static final int L2(m p0,l p1){
       Iterator iterator = p0.iterator();
       int i = 0;
       while (iterator.hasNext()) {
          i = i + p1.invoke(iterator.next()).intValue();
       }
       return i;
    }
    public static final Map M(m p0,Map p1,l p2,l p3){
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
    public static final Map M0(m p0,Map p1,l p2){
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
    public static final Object M1(m p0,Comparator p1,l p2){
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
    public static final long M2(m p0){
       a.p(p0, "$this$sum");
       Iterator iterator = p0.iterator();
       long l = 0;
       while (iterator.hasNext()) {
          l = l + iterator.next().longValue();
       }
       return l;
    }
    public static final Map N(m p0,Map p1,l p2){
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
    public static final Map N0(m p0,Map p1,l p2,l p3){
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
    public static final Object N1(m p0,Comparator p1,l p2){
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
    public static final long N2(m p0,l p1){
       Iterator iterator = p0.iterator();
       long l = 0;
       while (iterator.hasNext()) {
          l = l + p1.invoke(iterator.next()).longValue();
       }
       return l;
    }
    public static final Map O(m p0,l p1){
       a.p(p0, "$this$associateWith");
       a.p(p1, "valueSelector");
       LinkedHashMap linkedHashMa = new LinkedHashMap();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          Object obj = iterator.next();
          linkedHashMa.put(obj, p1.invoke(obj));
       }
       return linkedHashMa;
    }
    public static final e0 O0(m p0,l p1){
       a.p(p0, "$this$groupingBy");
       a.p(p1, "keySelector");
       return new SequencesKt___SequencesKt$b(p0, p1);
    }
    public static final Comparable O1(m p0){
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
    public static final int O2(m p0){
       a.p(p0, "$this$sum");
       Iterator iterator = p0.iterator();
       int i = 0;
       while (iterator.hasNext()) {
          i = i + iterator.next().shortValue();
       }
       return i;
    }
    public static final Map P(m p0,Map p1,l p2){
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
    public static final int P0(m p0,Object p1){
       a.p(p0, "$this$indexOf");
       Iterator iterator = p0.iterator();
       int i = 0;
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
    public static final Double P1(m p0){
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
    public static final int P2(m p0,l p1){
       int i = x0.h(0);
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          i = i + p1.invoke(iterator.next()).J0();
          i = x0.h(i);
       }
       return i;
    }
    public static final double Q(m p0){
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
    public static final int Q0(m p0,l p1){
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
    public static final Float Q1(m p0){
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
    public static final long Q2(m p0,l p1){
       long l = b1.h((long)0);
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          l = l + p1.invoke(iterator.next()).J0();
          l = b1.h(l);
       }
       return l;
    }
    public static final double R(m p0){
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
    public static final int R0(m p0,l p1){
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
    public static final Object R1(m p0,Comparator p1){
       a.p(p0, "$this$minWith");
       a.p(p1, "comparator");
       return SequencesKt___SequencesKt.S1(p0, p1);
    }
    public static final m R2(m p0,int p1){
       a.p(p0, "$this$take");
       String str = (p1 >= 0)? 1: null;
       if (str) {
          if (!p1) {
             p0 = SequencesKt__SequencesKt.j();
          }else if(p0 instanceof e){
             p0 = p0.a(p1);
          }else {
             t ot = new t(p0, p1);
          }
          return p0;
       }else {
          throw new IllegalArgumentException("Requested element count "+p1+" is less than zero.".toString());
       }
    }
    public static final double S(m p0){
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
    public static final Appendable S0(m p0,Appendable p1,CharSequence p2,CharSequence p3,CharSequence p4,int p5,CharSequence p6,l p7){
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
    public static final Object S1(m p0,Comparator p1){
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
    public static final m S2(m p0,l p1){
       a.p(p0, "$this$takeWhile");
       a.p(p1, "predicate");
       return new u(p0, p1);
    }
    public static final double T(m p0){
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
    public static Appendable T0(m p0,Appendable p1,CharSequence p2,CharSequence p3,CharSequence p4,int p5,CharSequence p6,l p7,int p8,Object p9){
       String str = (p8 & 0x02)? ", ": p2;
       String str1 = "";
       String str2 = (p8 & 0x04)? str1: p3;
       if (!(p8 & 0x08)) {
          str1 = p4;
       }
       int i = (p8 & 0x10)? -1: p5;
       String str3 = (p8 & 0x20)? "...": p6;
       int i1 = (p8 & 0x40)? 0: p7;
       return SequencesKt___SequencesKt.S0(p0, p1, str, str2, str1, i, str3, i1);
    }
    public static final m T1(m p0,Iterable p1){
       a.p(p0, "$this$minus");
       a.p(p1, "elements");
       return new SequencesKt___SequencesKt$minus$3(p0, p1);
    }
    public static final Collection T2(m p0,Collection p1){
       a.p(p0, "$this$toCollection");
       a.p(p1, "destination");
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          p1.add(iterator.next());
       }
       return p1;
    }
    public static final double U(m p0){
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
    public static final String U0(m p0,CharSequence p1,CharSequence p2,CharSequence p3,int p4,CharSequence p5,l p6){
       a.p(p0, "$this$joinToString");
       a.p(p1, "separator");
       a.p(p2, "prefix");
       a.p(p3, "postfix");
       a.p(p5, "truncated");
       String str = SequencesKt___SequencesKt.S0(p0, "", p1, p2, p3, p4, p5, p6);
       a.o(str, "joinTo\(StringBuilder\(\), ¡­ed, transform\).toString\(\)");
       return str;
    }
    public static final m U1(m p0,Object p1){
       a.p(p0, "$this$minus");
       return new SequencesKt___SequencesKt$minus$1(p0, p1);
    }
    public static final HashSet U2(m p0){
       a.p(p0, "$this$toHashSet");
       return SequencesKt___SequencesKt.T2(p0, new HashSet());
    }
    public static final double V(m p0){
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
    public static String V0(m p0,CharSequence p1,CharSequence p2,CharSequence p3,int p4,CharSequence p5,l p6,int p7,Object p8){
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
       return SequencesKt___SequencesKt.U0(p0, str, p8, str1, i, str3, p6);
    }
    public static final m V1(m p0,m p1){
       a.p(p0, "$this$minus");
       a.p(p1, "elements");
       return new SequencesKt___SequencesKt$minus$4(p0, p1);
    }
    public static final List V2(m p0){
       a.p(p0, "$this$toList");
       return CollectionsKt__CollectionsKt.Q(SequencesKt___SequencesKt.W2(p0));
    }
    public static final m W(m p0,int p1){
       a.p(p0, "$this$chunked");
       return SequencesKt___SequencesKt.Z2(p0, p1, p1, true);
    }
    public static final Object W0(m p0){
       a.p(p0, "$this$last");
       Iterator iterator = p0.iterator();
       if (!iterator.hasNext()) {
          throw new NoSuchElementException("Sequence is empty.");
       }
       Object obj = iterator.next();
       while (iterator.hasNext()) {
          obj = iterator.next();
       }
       return obj;
    }
    public static final m W1(m p0,Object[] p1){
       a.p(p0, "$this$minus");
       a.p(p1, "elements");
       SequencesKt___SequencesKt$minus$2 ominus$2 = (!p1.length)? 1: null;
       if (ominus$2) {
          return p0;
       }else {
          return new SequencesKt___SequencesKt$minus$2(p0, p1);
       }
    }
    public static final List W2(m p0){
       a.p(p0, "$this$toMutableList");
       return SequencesKt___SequencesKt.T2(p0, new ArrayList());
    }
    public static final m X(m p0,int p1,l p2){
       a.p(p0, "$this$chunked");
       a.p(p2, "transform");
       return SequencesKt___SequencesKt.a3(p0, p1, p1, true, p2);
    }
    public static final Object X0(m p0,l p1){
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
       throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }
    public static final m X1(m p0,Object p1){
       return SequencesKt___SequencesKt.U1(p0, p1);
    }
    public static final Set X2(m p0){
       a.p(p0, "$this$toMutableSet");
       LinkedHashSet linkedHashSe = new LinkedHashSet();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          linkedHashSe.add(iterator.next());
       }
       return linkedHashSe;
    }
    public static final boolean Y(m p0,Object p1){
       a.p(p0, "$this$contains");
       boolean b = (SequencesKt___SequencesKt.P0(p0, p1) >= 0)? true: false;
       return b;
    }
    public static final int Y0(m p0,Object p1){
       a.p(p0, "$this$lastIndexOf");
       Iterator iterator = p0.iterator();
       int i = -1;
       int i1 = 0;
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
    public static final boolean Y1(m p0){
       a.p(p0, "$this$none");
       return (p0.iterator().hasNext() ^ 0x01);
    }
    public static final Set Y2(m p0){
       a.p(p0, "$this$toSet");
       return d1.r(SequencesKt___SequencesKt.T2(p0, new LinkedHashSet()));
    }
    public static final int Z(m p0){
       a.p(p0, "$this$count");
       Iterator iterator = p0.iterator();
       int i = 0;
       while (iterator.hasNext()) {
          iterator.next();
          i = i + 1;
          if (i < 0) {
             CollectionsKt__CollectionsKt.V();
          }
       }
       return i;
    }
    public static final Object Z0(m p0){
       a.p(p0, "$this$lastOrNull");
       Iterator iterator = p0.iterator();
       if (!iterator.hasNext()) {
          return null;
       }
       Object obj = iterator.next();
       while (iterator.hasNext()) {
          obj = iterator.next();
       }
       return obj;
    }
    public static final boolean Z1(m p0,l p1){
       a.p(p0, "$this$none");
       a.p(p1, "predicate");
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
    public static final m Z2(m p0,int p1,int p2,boolean p3){
       a.p(p0, "$this$windowed");
       return SlidingWindowKt.c(p0, p1, p2, p3, false);
    }
    public static final int a0(m p0,l p1){
       a.p(p0, "$this$count");
       a.p(p1, "predicate");
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
    public static final Object a1(m p0,l p1){
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
    public static final m a2(m p0,l p1){
       a.p(p0, "$this$onEach");
       a.p(p1, "action");
       return SequencesKt___SequencesKt.b1(p0, new SequencesKt___SequencesKt$onEach$1(p1));
    }
    public static final m a3(m p0,int p1,int p2,boolean p3,l p4){
       a.p(p0, "$this$windowed");
       a.p(p4, "transform");
       return SequencesKt___SequencesKt.b1(SlidingWindowKt.c(p0, p1, p2, p3, true), p4);
    }
    public static final m b0(m p0){
       a.p(p0, "$this$distinct");
       return SequencesKt___SequencesKt.c0(p0, SequencesKt___SequencesKt$distinct$1.INSTANCE);
    }
    public static final m b1(m p0,l p1){
       a.p(p0, "$this$map");
       a.p(p1, "transform");
       return new w(p0, p1);
    }
    public static final m b2(m p0,p p1){
       a.p(p0, "$this$onEachIndexed");
       a.p(p1, "action");
       return SequencesKt___SequencesKt.c1(p0, new SequencesKt___SequencesKt$onEachIndexed$1(p1));
    }
    public static m b3(m p0,int p1,int p2,boolean p3,int p4,Object p5){
       if (p4 & 0x02) {
          p2 = 1;
       }
       if (p4 & 0x04) {
          p3 = false;
       }
       return SequencesKt___SequencesKt.Z2(p0, p1, p2, p3);
    }
    public static final m c0(m p0,l p1){
       a.p(p0, "$this$distinctBy");
       a.p(p1, "selector");
       return new c(p0, p1);
    }
    public static final m c1(m p0,p p1){
       a.p(p0, "$this$mapIndexed");
       a.p(p1, "transform");
       return new v(p0, p1);
    }
    public static final Pair c2(m p0,l p1){
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
    public static m c3(m p0,int p1,int p2,boolean p3,l p4,int p5,Object p6){
       if (p5 & 0x02) {
          p2 = 1;
       }
       if (p5 & 0x04) {
          p3 = false;
       }
       return SequencesKt___SequencesKt.a3(p0, p1, p2, p3, p4);
    }
    public static final m d0(m p0,int p1){
       d uod;
       a.p(p0, "$this$drop");
       String str = (p1 >= 0)? 1: null;
       if (str) {
          if (p1) {
             p0 = (p0 instanceof e)? p0.b(p1): new d(p0, p1);
          }
       label_0020 :
          return p0;
       }else {
          throw new IllegalArgumentException("Requested element count "+p1+" is less than zero.".toString());
       }
    }
    public static final m d1(m p0,p p1){
       a.p(p0, "$this$mapIndexedNotNull");
       a.p(p1, "transform");
       return SequencesKt___SequencesKt.o0(new v(p0, p1));
    }
    public static final m d2(m p0,Iterable p1){
       a.p(p0, "$this$plus");
       a.p(p1, "elements");
       m[] omArray = new m[]{p0,CollectionsKt___CollectionsKt.l1(p1)};
       return SequencesKt__SequencesKt.l(SequencesKt__SequencesKt.t(omArray));
    }
    public static final m d3(m p0){
       a.p(p0, "$this$withIndex");
       return new k(p0);
    }
    public static final m e0(m p0,l p1){
       a.p(p0, "$this$dropWhile");
       a.p(p1, "predicate");
       return new f(p0, p1);
    }
    public static final Collection e1(m p0,Collection p1,p p2){
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
    public static final m e2(m p0,Object p1){
       Object[] objArray;
       a.p(p0, "$this$plus");
       m[] omArray = new m[]{p0,SequencesKt__SequencesKt.t(objArray)};
       objArray = new Object[]{p1};
       return SequencesKt__SequencesKt.l(SequencesKt__SequencesKt.t(omArray));
    }
    public static final m e3(m p0,m p1){
       a.p(p0, "$this$zip");
       a.p(p1, "other");
       return new l(p0, p1, SequencesKt___SequencesKt$zip$1.INSTANCE);
    }
    public static final Object f0(m p0,int p1){
       a.p(p0, "$this$elementAt");
       return SequencesKt___SequencesKt.g0(p0, p1, new SequencesKt___SequencesKt$elementAt$1(p1));
    }
    public static final Collection f1(m p0,Collection p1,p p2){
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
    public static final m f2(m p0,m p1){
       a.p(p0, "$this$plus");
       a.p(p1, "elements");
       m[] omArray = new m[]{p0,p1};
       return SequencesKt__SequencesKt.l(SequencesKt__SequencesKt.t(omArray));
    }
    public static final m f3(m p0,m p1,p p2){
       a.p(p0, "$this$zip");
       a.p(p1, "other");
       a.p(p2, "transform");
       return new l(p0, p1, p2);
    }
    public static final Object g0(m p0,int p1,l p2){
       Object obj;
       a.p(p0, "$this$elementAtOrElse");
       a.p(p2, "defaultValue");
       if (p1 < 0) {
          return p2.invoke(Integer.valueOf(p1));
       }
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
    public static final m g1(m p0,l p1){
       a.p(p0, "$this$mapNotNull");
       a.p(p1, "transform");
       return SequencesKt___SequencesKt.o0(new w(p0, p1));
    }
    public static final m g2(m p0,Object[] p1){
       a.p(p0, "$this$plus");
       a.p(p1, "elements");
       return SequencesKt___SequencesKt.d2(p0, n.t(p1));
    }
    public static final m g3(m p0){
       a.p(p0, "$this$zipWithNext");
       return SequencesKt___SequencesKt.h3(p0, SequencesKt___SequencesKt$zipWithNext$1.INSTANCE);
    }
    public static final Object h0(m p0,int p1){
       Object obj;
       a.p(p0, "$this$elementAtOrNull");
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
    public static final Collection h1(m p0,Collection p1,l p2){
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
    public static final m h2(m p0,Object p1){
       return SequencesKt___SequencesKt.e2(p0, p1);
    }
    public static final m h3(m p0,p p1){
       a.p(p0, "$this$zipWithNext");
       a.p(p1, "transform");
       return q.e(new SequencesKt___SequencesKt$zipWithNext$2(p0, p1, null));
    }
    public static final m i0(m p0,l p1){
       a.p(p0, "$this$filter");
       a.p(p1, "predicate");
       return new h(p0, true, p1);
    }
    public static final Collection i1(m p0,Collection p1,l p2){
       a.p(p0, "$this$mapTo");
       a.p(p1, "destination");
       a.p(p2, "transform");
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          p1.add(p2.invoke(iterator.next()));
       }
       return p1;
    }
    public static final Object i2(m p0,p p1){
       a.p(p0, "$this$reduce");
       a.p(p1, "operation");
       Iterator iterator = p0.iterator();
       if (!iterator.hasNext()) {
          throw new UnsupportedOperationException("Empty sequence can\'t be reduced.");
       }
       Object obj = iterator.next();
       while (iterator.hasNext()) {
          obj = p1.invoke(obj, iterator.next());
       }
       return obj;
    }
    public static final m j0(m p0,p p1){
       a.p(p0, "$this$filterIndexed");
       a.p(p1, "predicate");
       return new w(new h(new k(p0), true, new SequencesKt___SequencesKt$filterIndexed$1(p1)), SequencesKt___SequencesKt$filterIndexed$2.INSTANCE);
    }
    public static final Comparable j1(m p0){
       a.p(p0, "$this$max");
       return SequencesKt___SequencesKt.w1(p0);
    }
    public static final Object j2(m p0,q p1){
       a.p(p0, "$this$reduceIndexed");
       a.p(p1, "operation");
       Iterator iterator = p0.iterator();
       if (!iterator.hasNext()) {
          throw new UnsupportedOperationException("Empty sequence can\'t be reduced.");
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
    public static final Collection k0(m p0,Collection p1,p p2){
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
    public static final Double k1(m p0){
       a.p(p0, "$this$max");
       return SequencesKt___SequencesKt.x1(p0);
    }
    public static final Object k2(m p0,q p1){
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
    public static final m l0(m p0){
       a.p(p0, "$this$filterIsInstance");
       a.w();
       p0 = SequencesKt___SequencesKt.i0(p0, SequencesKt___SequencesKt$filterIsInstance$1.INSTANCE);
       Objects.requireNonNull(p0, "null cannot be cast to non-null type kotlin.sequences.Sequence<R>");
       return p0;
    }
    public static final Float l1(m p0){
       a.p(p0, "$this$max");
       return SequencesKt___SequencesKt.y1(p0);
    }
    public static final Object l2(m p0,p p1){
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
    public static final Collection m0(m p0,Collection p1){
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
    public static final Object m1(m p0,l p1){
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
    public static final m m2(m p0){
       a.p(p0, "$this$requireNoNulls");
       return SequencesKt___SequencesKt.b1(p0, new SequencesKt___SequencesKt$requireNoNulls$1(p0));
    }
    public static final m n0(m p0,l p1){
       a.p(p0, "$this$filterNot");
       a.p(p1, "predicate");
       return new h(p0, false, p1);
    }
    public static final Object n1(m p0,l p1){
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
    public static final m n2(m p0,Object p1,p p2){
       a.p(p0, "$this$runningFold");
       a.p(p2, "operation");
       return q.e(new SequencesKt___SequencesKt$runningFold$1(p0, p1, p2, null));
    }
    public static final m o0(m p0){
       a.p(p0, "$this$filterNotNull");
       p0 = SequencesKt___SequencesKt.n0(p0, SequencesKt___SequencesKt$filterNotNull$1.INSTANCE);
       Objects.requireNonNull(p0, "null cannot be cast to non-null type kotlin.sequences.Sequence<T>");
       return p0;
    }
    public static final double o1(m p0,l p1){
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
    public static final m o2(m p0,Object p1,q p2){
       a.p(p0, "$this$runningFoldIndexed");
       a.p(p2, "operation");
       return q.e(new SequencesKt___SequencesKt$runningFoldIndexed$1(p0, p1, p2, null));
    }
    public static final Collection p0(m p0,Collection p1){
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
    public static final float p1(m p0,l p1){
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
    public static final m p2(m p0,p p1){
       a.p(p0, "$this$runningReduce");
       a.p(p1, "operation");
       return q.e(new SequencesKt___SequencesKt$runningReduce$1(p0, p1, null));
    }
    public static final Collection q0(m p0,Collection p1,l p2){
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
    public static final Comparable q1(m p0,l p1){
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
    public static final m q2(m p0,q p1){
       a.p(p0, "$this$runningReduceIndexed");
       a.p(p1, "operation");
       return q.e(new SequencesKt___SequencesKt$runningReduceIndexed$1(p0, p1, null));
    }
    public static final Collection r0(m p0,Collection p1,l p2){
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
    public static final Comparable r1(m p0,l p1){
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
    public static final m r2(m p0,Object p1,p p2){
       a.p(p0, "$this$scan");
       a.p(p2, "operation");
       return SequencesKt___SequencesKt.n2(p0, p1, p2);
    }
    public static final Object s0(m p0,l p1){
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
    public static final Double s1(m p0,l p1){
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
    public static final m s2(m p0,Object p1,q p2){
       a.p(p0, "$this$scanIndexed");
       a.p(p2, "operation");
       return SequencesKt___SequencesKt.o2(p0, p1, p2);
    }
    public static final Object t0(m p0,l p1){
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
    public static final Float t1(m p0,l p1){
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
    public static final m t2(m p0,p p1){
       a.p(p0, "$this$scanReduce");
       a.p(p1, "operation");
       return SequencesKt___SequencesKt.p2(p0, p1);
    }
    public static final Object u0(m p0){
       a.p(p0, "$this$first");
       Iterator iterator = p0.iterator();
       if (iterator.hasNext()) {
          return iterator.next();
       }
       throw new NoSuchElementException("Sequence is empty.");
    }
    public static final Object u1(m p0,Comparator p1,l p2){
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
    public static final m u2(m p0,q p1){
       a.p(p0, "$this$scanReduceIndexed");
       a.p(p1, "operation");
       return SequencesKt___SequencesKt.q2(p0, p1);
    }
    public static final Object v0(m p0,l p1){
       Object obj;
       a.p(p0, "$this$first");
       a.p(p1, "predicate");
       Iterator iterator = p0.iterator();
       while (true) {
          if (!iterator.hasNext()) {
             throw new NoSuchElementException("Sequence contains no element matching the predicate.");
          }
          obj = iterator.next();
          if (p1.invoke(obj).booleanValue()) {
             break ;
          }
       }
       return obj;
    }
    public static final Object v1(m p0,Comparator p1,l p2){
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
    public static final Object v2(m p0){
       a.p(p0, "$this$single");
       Iterator iterator = p0.iterator();
       if (!iterator.hasNext()) {
          throw new NoSuchElementException("Sequence is empty.");
       }
       Object obj = iterator.next();
       if (!iterator.hasNext()) {
          return obj;
       }
       throw new IllegalArgumentException("Sequence has more than one element.");
    }
    public static final Object w0(m p0){
       a.p(p0, "$this$firstOrNull");
       Iterator iterator = p0.iterator();
       if (!iterator.hasNext()) {
          return null;
       }
       return iterator.next();
    }
    public static final Comparable w1(m p0){
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
    public static final Object w2(m p0,l p1){
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
             throw new NoSuchElementException("Sequence contains no element matching the predicate.");
          }
       }
       throw new IllegalArgumentException("Sequence contains more than one matching element.");
    }
    public static final Object x0(m p0,l p1){
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
    public static final Double x1(m p0){
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
    public static final Object x2(m p0){
       a.p(p0, "$this$singleOrNull");
       Iterator iterator = p0.iterator();
       if (!iterator.hasNext()) {
          return null;
       }
       Object obj = iterator.next();
       if (iterator.hasNext()) {
          return null;
       }
       return obj;
    }
    public static final m y0(m p0,l p1){
       a.p(p0, "$this$flatMap");
       a.p(p1, "transform");
       return new i(p0, p1, SequencesKt___SequencesKt$flatMap$2.INSTANCE);
    }
    public static final Float y1(m p0){
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
    public static final Object y2(m p0,l p1){
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
    public static final m z0(m p0,p p1){
       a.p(p0, "$this$flatMapIndexed");
       a.p(p1, "transform");
       return SequencesKt__SequencesKt.k(p0, p1, SequencesKt___SequencesKt$flatMapIndexed$1.INSTANCE);
    }
    public static final Object z1(m p0,Comparator p1){
       a.p(p0, "$this$maxWith");
       a.p(p1, "comparator");
       return SequencesKt___SequencesKt.A1(p0, p1);
    }
    public static final m z2(m p0){
       a.p(p0, "$this$sorted");
       return new SequencesKt___SequencesKt$c(p0);
    }
}
