package kotlin.text.StringsKt___StringsKt;
import zsd.v;
import java.lang.CharSequence;
import java.lang.Character;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import msd.l;
import java.lang.Comparable;
import kotlin.text.StringsKt__StringsKt;
import java.util.NoSuchElementException;
import usd.q;
import java.lang.StringBuilder;
import java.lang.IllegalArgumentException;
import java.lang.Boolean;
import java.util.List;
import java.util.ArrayList;
import java.lang.Iterable;
import java.util.Collection;
import trd.y;
import java.lang.Double;
import java.lang.Number;
import java.lang.Math;
import msd.p;
import java.lang.Integer;
import java.lang.Float;
import java.util.Comparator;
import msd.q;
import java.util.HashSet;
import trd.s0;
import trd.t;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.util.Set;
import java.util.LinkedHashSet;
import trd.c1;
import trd.d1;
import kotlin.text.StringsKt___StringsKt$a;
import kotlin.Pair;
import kotlin.text.StringsKt___StringsKt$windowed$1;
import wsd.m;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.text.StringsKt___StringsKt$b;
import java.util.Map;
import java.util.LinkedHashMap;
import kotlin.collections.SlidingWindowKt;
import ssd.e;
import kotlin.text.StringsKt___StringsKt$windowedSequence$1;
import trd.e0;
import kotlin.text.StringsKt___StringsKt$c;
import usd.k;
import usd.i;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.text.StringsKt___StringsKt$windowedSequence$2;
import kotlin.sequences.SequencesKt___SequencesKt;
import java.lang.UnsupportedOperationException;
import trd.j0;
import kotlin.text.StringsKt___StringsKt$withIndex$1;
import msd.a;
import qrd.r0;
import kotlin.text.StringsKt___StringsKt$chunkedSequence$1;
import java.util.Objects;
import java.lang.Appendable;
import trd.u;
import java.util.Iterator;
import qrd.x0;
import qrd.b1;

public class StringsKt___StringsKt extends v	// class@00190e
{

    public void StringsKt___StringsKt(){
       super();
    }
    public static final Character A6(CharSequence p0){
       a.p(p0, "$this$firstOrNull");
       int i = (!p0.length())? 1: 0;
       Character uCharacter = (i)? null: Character.valueOf(p0.charAt(0));
       return uCharacter;
    }
    public static final Comparable A7(CharSequence p0,l p1){
       int i = 0;
       int i1 = 1;
       char c = (!p0.length())? 1: 0;
       if (!c) {
          Comparable uComparable = p1.invoke(Character.valueOf(p0.charAt(i)));
          i = StringsKt__StringsKt.Z2(p0);
          if (i1 <= i) {
             Comparable uComparable1 = p1.invoke(Character.valueOf(p0.charAt(i1)));
             while (uComparable.compareTo(uComparable1) > 0) {
                uComparable = uComparable1;
                break ;
                i1 = i1 + 1;
             }
             if (i1 != i) {
                goto label_0038 ;
             }
          }
          return uComparable;
       }else {
          throw new NoSuchElementException();
       }
    }
    public static final CharSequence A8(CharSequence p0,int p1){
       a.p(p0, "$this$take");
       int i = 0;
       int i1 = (p1 >= 0)? 1: 0;
       if (i1) {
          return p0.subSequence(i, q.u(p1, p0.length()));
       }else {
          throw new IllegalArgumentException("Requested character count "+p1+" is less than zero.".toString());
       }
    }
    public static final Character B6(CharSequence p0,l p1){
       char c;
       a.p(p0, "$this$firstOrNull");
       a.p(p1, "predicate");
       int i = 0;
       while (true) {
          if (i >= p0.length()) {
             return null;
          }
          c = p0.charAt(i);
          if (p1.invoke(Character.valueOf(c)).booleanValue()) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return Character.valueOf(c);
    }
    public static final Comparable B7(CharSequence p0,l p1){
       int i = 0;
       int i1 = 1;
       char c = (!p0.length())? 1: 0;
       if (c) {
          return null;
       }else {
          Comparable uComparable = p1.invoke(Character.valueOf(p0.charAt(i)));
          i = StringsKt__StringsKt.Z2(p0);
          if (i1 <= i) {
             Comparable uComparable1 = p1.invoke(Character.valueOf(p0.charAt(i1)));
             while (uComparable.compareTo(uComparable1) > 0) {
                uComparable = uComparable1;
                break ;
                i1 = i1 + 1;
             }
             if (i1 != i) {
                goto label_003a ;
             }
          }
          return uComparable;
       }
    }
    public static final String B8(String p0,int p1){
       a.p(p0, "$this$take");
       int i = 0;
       int i1 = (p1 >= 0)? 1: 0;
       if (i1) {
          p0 = p0.substring(i, q.u(p1, p0.length()));
          a.o(p0, "\(this as java.lang.Strin¡­ing\(startIndex, endIndex\)");
          return p0;
       }else {
          throw new IllegalArgumentException("Requested character count "+p1+" is less than zero.".toString());
       }
    }
    public static final List C6(CharSequence p0,l p1){
       a.p(p0, "$this$flatMap");
       a.p(p1, "transform");
       ArrayList uArrayList = new ArrayList();
       for (int i = 0; i < p0.length(); i = i + 1) {
          y.q0(uArrayList, p1.invoke(Character.valueOf(p0.charAt(i))));
       }
       return uArrayList;
    }
    public static final Double C7(CharSequence p0,l p1){
       int i = 1;
       char c = (!p0.length())? 1: 0;
       if (c) {
          return null;
       }else {
          double d = p1.invoke(Character.valueOf(p0.charAt(0))).doubleValue();
          int i1 = StringsKt__StringsKt.Z2(p0);
          if (i <= i1) {
             d = Math.min(d, p1.invoke(Character.valueOf(p0.charAt(i))).doubleValue());
             while (i != i1) {
                i = i + 1;
             }
          }
          return Double.valueOf(d);
       }
    }
    public static final CharSequence C8(CharSequence p0,int p1){
       a.p(p0, "$this$takeLast");
       int i = (p1 >= 0)? 1: 0;
       if (i) {
          i = p0.length();
          return p0.subSequence((i - q.u(p1, i)), i);
       }else {
          throw new IllegalArgumentException("Requested character count "+p1+" is less than zero.".toString());
       }
    }
    public static final List D6(CharSequence p0,p p1){
       ArrayList uArrayList = new ArrayList();
       int i1 = 0;
       for (int i = 0; i < p0.length(); i = i + 1) {
          i1 = i1 + 1;
          y.q0(uArrayList, p1.invoke(Integer.valueOf(i1), Character.valueOf(p0.charAt(i))));
       }
       return uArrayList;
    }
    public static final Float D7(CharSequence p0,l p1){
       int i = 0;
       int i1 = 1;
       char c = (!p0.length())? 1: 0;
       if (c) {
          return null;
       }else {
          float f = p1.invoke(Character.valueOf(p0.charAt(i))).floatValue();
          i = StringsKt__StringsKt.Z2(p0);
          if (i1 <= i) {
             f = Math.min(f, p1.invoke(Character.valueOf(p0.charAt(i1))).floatValue());
             while (i1 != i) {
                i1 = i1 + 1;
             }
          }
          return Float.valueOf(f);
       }
    }
    public static final String D8(String p0,int p1){
       a.p(p0, "$this$takeLast");
       int i = (p1 >= 0)? 1: 0;
       if (i) {
          i = p0.length();
          p0 = p0.substring((i - q.u(p1, i)));
          a.o(p0, "\(this as java.lang.String\).substring\(startIndex\)");
          return p0;
       }else {
          throw new IllegalArgumentException("Requested character count "+p1+" is less than zero.".toString());
       }
    }
    public static final Collection E6(CharSequence p0,Collection p1,p p2){
       int i1 = 0;
       for (int i = 0; i < p0.length(); i = i + 1) {
          i1 = i1 + 1;
          y.q0(p1, p2.invoke(Integer.valueOf(i1), Character.valueOf(p0.charAt(i))));
       }
       return p1;
    }
    public static final Object E7(CharSequence p0,Comparator p1,l p2){
       int i = 0;
       int i1 = 1;
       char c = (!p0.length())? 1: 0;
       if (!c) {
          Object obj = p2.invoke(Character.valueOf(p0.charAt(i)));
          i = StringsKt__StringsKt.Z2(p0);
          if (i1 <= i) {
             Object obj1 = p2.invoke(Character.valueOf(p0.charAt(i1)));
             while (p1.compare(obj, obj1) > 0) {
                obj = obj1;
                break ;
                i1 = i1 + 1;
             }
             if (i1 != i) {
                goto label_0034 ;
             }
          }
          return obj;
       }else {
          throw new NoSuchElementException();
       }
    }
    public static final CharSequence E8(CharSequence p0,l p1){
       a.p(p0, "$this$takeLastWhile");
       a.p(p1, "predicate");
       int i = StringsKt__StringsKt.Z2(p0);
       while (true) {
          if (i < 0) {
             return p0.subSequence(0, p0.length());
          }
          if (!p1.invoke(Character.valueOf(p0.charAt(i))).booleanValue()) {
             break ;
          }else {
             i = i - 1;
          }
       }
       return p0.subSequence((i + 1), p0.length());
    }
    public static final Collection F6(CharSequence p0,Collection p1,l p2){
       a.p(p0, "$this$flatMapTo");
       a.p(p1, "destination");
       a.p(p2, "transform");
       for (int i = 0; i < p0.length(); i = i + 1) {
          y.q0(p1, p2.invoke(Character.valueOf(p0.charAt(i))));
       }
       return p1;
    }
    public static final Object F7(CharSequence p0,Comparator p1,l p2){
       int i = 0;
       int i1 = 1;
       char c = (!p0.length())? 1: 0;
       if (c) {
          return null;
       }else {
          Object obj = p2.invoke(Character.valueOf(p0.charAt(i)));
          i = StringsKt__StringsKt.Z2(p0);
          if (i1 <= i) {
             Object obj1 = p2.invoke(Character.valueOf(p0.charAt(i1)));
             while (p1.compare(obj, obj1) > 0) {
                obj = obj1;
                break ;
                i1 = i1 + 1;
             }
             if (i1 != i) {
                goto label_0036 ;
             }
          }
          return obj;
       }
    }
    public static final String F8(String p0,l p1){
       a.p(p0, "$this$takeLastWhile");
       a.p(p1, "predicate");
       int i = StringsKt__StringsKt.Z2(p0);
       while (true) {
          if (i < 0) {
             return p0;
          }
          if (!p1.invoke(Character.valueOf(p0.charAt(i))).booleanValue()) {
             break ;
          }else {
             i = i - 1;
          }
       }
       p0 = p0.substring((i + 1));
       a.o(p0, "\(this as java.lang.String\).substring\(startIndex\)");
       return p0;
    }
    public static final Object G6(CharSequence p0,Object p1,p p2){
       a.p(p0, "$this$fold");
       a.p(p2, "operation");
       for (int i = 0; i < p0.length(); i = i + 1) {
          p1 = p2.invoke(p1, Character.valueOf(p0.charAt(i)));
       }
       return p1;
    }
    public static final Character G7(CharSequence p0){
       a.p(p0, "$this$minOrNull");
       int i = 0;
       int i1 = 1;
       char c = (!p0.length())? 1: 0;
       if (c) {
          return null;
       }else {
          c = p0.charAt(i);
          i = StringsKt__StringsKt.Z2(p0);
          if (i1 <= i) {
             char c1 = p0.charAt(i1);
             while (a.t(c, c1) > 0) {
                c = c1;
                break ;
                i1 = i1 + 1;
             }
             if (i1 != i) {
                goto label_002b ;
             }
          }
          return Character.valueOf(c);
       }
    }
    public static final CharSequence G8(CharSequence p0,l p1){
       a.p(p0, "$this$takeWhile");
       a.p(p1, "predicate");
       int i = p0.length();
       int i1 = 0;
       while (true) {
          if (i1 >= i) {
             return p0.subSequence(0, p0.length());
          }
          if (!p1.invoke(Character.valueOf(p0.charAt(i1))).booleanValue()) {
             break ;
          }else {
             i1 = i1 + 1;
          }
       }
       return p0.subSequence(0, i1);
    }
    public static final Object H6(CharSequence p0,Object p1,q p2){
       a.p(p0, "$this$foldIndexed");
       a.p(p2, "operation");
       int i1 = 0;
       for (int i = 0; i < p0.length(); i = i + 1) {
          i1 = i1 + 1;
          p1 = p2.invoke(Integer.valueOf(i1), p1, Character.valueOf(p0.charAt(i)));
       }
       return p1;
    }
    public static final Character H7(CharSequence p0,Comparator p1){
       a.p(p0, "$this$minWith");
       a.p(p1, "comparator");
       return StringsKt___StringsKt.I7(p0, p1);
    }
    public static final String H8(String p0,l p1){
       a.p(p0, "$this$takeWhile");
       a.p(p1, "predicate");
       int i = p0.length();
       int i1 = 0;
       while (true) {
          if (i1 >= i) {
             return p0;
          }
          if (!p1.invoke(Character.valueOf(p0.charAt(i1))).booleanValue()) {
             break ;
          }else {
             i1 = i1 + 1;
          }
       }
       p0 = p0.substring(0, i1);
       a.o(p0, "\(this as java.lang.Strin¡­ing\(startIndex, endIndex\)");
       return p0;
    }
    public static final Object I6(CharSequence p0,Object p1,p p2){
       a.p(p0, "$this$foldRight");
       a.p(p2, "operation");
       for (int i = StringsKt__StringsKt.Z2(p0); i >= 0; i = i1) {
          int i1 = i - 1;
          p1 = p2.invoke(Character.valueOf(p0.charAt(i)), p1);
       }
       return p1;
    }
    public static final Character I7(CharSequence p0,Comparator p1){
       a.p(p0, "$this$minWithOrNull");
       a.p(p1, "comparator");
       int i = 0;
       int i1 = 1;
       char c = (!p0.length())? 1: 0;
       if (c) {
          return null;
       }else {
          c = p0.charAt(i);
          i = StringsKt__StringsKt.Z2(p0);
          if (i1 <= i) {
             char c1 = p0.charAt(i1);
             while (p1.compare(Character.valueOf(c), Character.valueOf(c1)) > 0) {
                c = c1;
                break ;
                i1 = i1 + 1;
             }
             if (i1 != i) {
                goto label_0038 ;
             }
          }
          return Character.valueOf(c);
       }
    }
    public static final Collection I8(CharSequence p0,Collection p1){
       a.p(p0, "$this$toCollection");
       a.p(p1, "destination");
       for (int i = 0; i < p0.length(); i = i + 1) {
          p1.add(Character.valueOf(p0.charAt(i)));
       }
       return p1;
    }
    public static final Object J6(CharSequence p0,Object p1,q p2){
       a.p(p0, "$this$foldRightIndexed");
       a.p(p2, "operation");
       for (int i = StringsKt__StringsKt.Z2(p0); i >= 0; i = i - 1) {
          p1 = p2.invoke(Integer.valueOf(i), Character.valueOf(p0.charAt(i)), p1);
       }
       return p1;
    }
    public static final boolean J7(CharSequence p0){
       a.p(p0, "$this$none");
       boolean b = (!p0.length())? true: false;
       return b;
    }
    public static final HashSet J8(CharSequence p0){
       a.p(p0, "$this$toHashSet");
       return StringsKt___StringsKt.I8(p0, new HashSet(s0.j(q.u(p0.length(), 128))));
    }
    public static final boolean K5(CharSequence p0,l p1){
       a.p(p0, "$this$all");
       a.p(p1, "predicate");
       int i = 0;
       while (true) {
          if (i >= p0.length()) {
             return true;
          }
          if (!p1.invoke(Character.valueOf(p0.charAt(i))).booleanValue()) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return false;
    }
    public static final void K6(CharSequence p0,l p1){
       a.p(p0, "$this$forEach");
       a.p(p1, "action");
       for (int i = 0; i < p0.length(); i = i + 1) {
          p1.invoke(Character.valueOf(p0.charAt(i)));
       }
       return;
    }
    public static final boolean K7(CharSequence p0,l p1){
       a.p(p0, "$this$none");
       a.p(p1, "predicate");
       int i = 0;
       while (true) {
          if (i >= p0.length()) {
             return true;
          }
          if (p1.invoke(Character.valueOf(p0.charAt(i))).booleanValue()) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return false;
    }
    public static final List K8(CharSequence p0){
       List list;
       a.p(p0, "$this$toList");
       int i = p0.length();
       if (i) {
          list = (i != 1)? StringsKt___StringsKt.L8(p0): t.k(Character.valueOf(p0.charAt(0)));
       }else {
          list = CollectionsKt__CollectionsKt.E();
       }
       return list;
    }
    public static final boolean L5(CharSequence p0){
       a.p(p0, "$this$any");
       int i = (!p0.length())? 1: 0;
       return (i ^ 1);
    }
    public static final void L6(CharSequence p0,p p1){
       a.p(p0, "$this$forEachIndexed");
       a.p(p1, "action");
       int i1 = 0;
       for (int i = 0; i < p0.length(); i = i + 1) {
          i1 = i1 + 1;
          p1.invoke(Integer.valueOf(i1), Character.valueOf(p0.charAt(i)));
       }
       return;
    }
    public static final CharSequence L7(CharSequence p0,l p1){
       a.p(p0, "$this$onEach");
       a.p(p1, "action");
       for (int i = 0; i < p0.length(); i = i + 1) {
          p1.invoke(Character.valueOf(p0.charAt(i)));
       }
       return p0;
    }
    public static final List L8(CharSequence p0){
       a.p(p0, "$this$toMutableList");
       return StringsKt___StringsKt.I8(p0, new ArrayList(p0.length()));
    }
    public static final boolean M5(CharSequence p0,l p1){
       a.p(p0, "$this$any");
       a.p(p1, "predicate");
       int i = 0;
       while (true) {
          if (i >= p0.length()) {
             return false;
          }
          if (p1.invoke(Character.valueOf(p0.charAt(i))).booleanValue()) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return true;
    }
    public static final char M6(CharSequence p0,int p1,l p2){
       char c = (p1 >= 0 && p1 <= StringsKt__StringsKt.Z2(p0))? p0.charAt(p1): p2.invoke(Integer.valueOf(p1)).charValue();
       return c;
    }
    public static final CharSequence M7(CharSequence p0,p p1){
       a.p(p0, "$this$onEachIndexed");
       a.p(p1, "action");
       int i1 = 0;
       for (int i = 0; i < p0.length(); i = i + 1) {
          i1 = i1 + 1;
          p1.invoke(Integer.valueOf(i1), Character.valueOf(p0.charAt(i)));
       }
       return p0;
    }
    public static final Set M8(CharSequence p0){
       Set set;
       a.p(p0, "$this$toSet");
       int i = p0.length();
       if (i) {
          set = (i != 1)? StringsKt___StringsKt.I8(p0, new LinkedHashSet(s0.j(q.u(p0.length(), 128)))): c1.f(Character.valueOf(p0.charAt(0)));
       }else {
          set = d1.k();
       }
       return set;
    }
    public static final Iterable N5(CharSequence p0){
       a.p(p0, "$this$asIterable");
       if (p0 instanceof String) {
          StringsKt___StringsKt$a uoa = (!p0.length())? 1: null;
          if (uoa) {
             return CollectionsKt__CollectionsKt.E();
          }
       }
       return new StringsKt___StringsKt$a(p0);
    }
    public static final Character N6(CharSequence p0,int p1){
       a.p(p0, "$this$getOrNull");
       Character uCharacter = (p1 >= 0 && p1 <= StringsKt__StringsKt.Z2(p0))? Character.valueOf(p0.charAt(p1)): null;
       return uCharacter;
    }
    public static final Pair N7(CharSequence p0,l p1){
       a.p(p0, "$this$partition");
       a.p(p1, "predicate");
       StringBuilder str = "";
       StringBuilder str1 = "";
       int i = 0;
       while (i < p0.length()) {
          char c = p0.charAt(i);
          if (p1.invoke(Character.valueOf(c)).booleanValue()) {
             str = str+c;
          }else {
             str1 = str1+c;
          }
          i = i + 1;
       }
       return new Pair(str, str1);
    }
    public static final List N8(CharSequence p0,int p1,int p2,boolean p3){
       a.p(p0, "$this$windowed");
       return StringsKt___StringsKt.O8(p0, p1, p2, p3, StringsKt___StringsKt$windowed$1.INSTANCE);
    }
    public static final m O5(CharSequence p0){
       a.p(p0, "$this$asSequence");
       if (p0 instanceof String) {
          StringsKt___StringsKt$b uob = (!p0.length())? 1: null;
          if (uob) {
             return SequencesKt__SequencesKt.j();
          }
       }
       return new StringsKt___StringsKt$b(p0);
    }
    public static final Map O6(CharSequence p0,l p1){
       a.p(p0, "$this$groupBy");
       a.p(p1, "keySelector");
       LinkedHashMap linkedHashMa = new LinkedHashMap();
       for (int i = 0; i < p0.length(); i = i + 1) {
          char c = p0.charAt(i);
          Object obj = p1.invoke(Character.valueOf(c));
          ArrayList uArrayList = linkedHashMa.get(obj);
          if (uArrayList == null) {
             uArrayList = new ArrayList();
             linkedHashMa.put(obj, uArrayList);
          }
          uArrayList.add(Character.valueOf(c));
       }
       return linkedHashMa;
    }
    public static final Pair O7(String p0,l p1){
       a.p(p0, "$this$partition");
       a.p(p1, "predicate");
       String str = "";
       StringBuilder str1 = "";
       int i = p0.length();
       int i1 = 0;
       while (i1 < i) {
          char c = p0.charAt(i1);
          if (p1.invoke(Character.valueOf(c)).booleanValue()) {
             str = str+c;
          }else {
             str1 = str1+c;
          }
          i1 = i1 + 1;
       }
       String str2 = str;
       a.o(str2, "first.toString\(\)");
       str = str1;
       a.o(str, "second.toString\(\)");
       return new Pair(str2, str);
    }
    public static final List O8(CharSequence p0,int p1,int p2,boolean p3,l p4){
       a.p(p0, "$this$windowed");
       a.p(p4, "transform");
       SlidingWindowKt.a(p1, p2);
       int i = p0.length();
       int i1 = i / p2;
       int i2 = 0;
       int i3 = (!(i % p2))? 0: 1;
       ArrayList uArrayList = new ArrayList((i1 + i3));
       for (; i2 >= 0 && i > i2; i2 = i2 + p2) {
          i1 = i2 + p1;
          if (i1 < 0 || i1 > i) {
             if (p3) {
                i1 = i;
             }else {
                break ;
             }
          }
          uArrayList.add(p4.invoke(p0.subSequence(i2, i1)));
       }
       return uArrayList;
    }
    public static final Map P5(CharSequence p0,l p1){
       a.p(p0, "$this$associate");
       a.p(p1, "transform");
       LinkedHashMap linkedHashMa = new LinkedHashMap(q.n(s0.j(p0.length()), 16));
       for (int i = 0; i < p0.length(); i = i + 1) {
          Pair pair = p1.invoke(Character.valueOf(p0.charAt(i)));
          Object first = pair.getFirst();
          linkedHashMa.put(first, pair.getSecond());
       }
       return linkedHashMa;
    }
    public static final Map P6(CharSequence p0,l p1,l p2){
       a.p(p0, "$this$groupBy");
       a.p(p1, "keySelector");
       a.p(p2, "valueTransform");
       LinkedHashMap linkedHashMa = new LinkedHashMap();
       for (int i = 0; i < p0.length(); i = i + 1) {
          char c = p0.charAt(i);
          Object obj = p1.invoke(Character.valueOf(c));
          ArrayList uArrayList = linkedHashMa.get(obj);
          if (uArrayList == null) {
             uArrayList = new ArrayList();
             linkedHashMa.put(obj, uArrayList);
          }
          uArrayList.add(p2.invoke(Character.valueOf(c)));
       }
       return linkedHashMa;
    }
    public static final char P7(CharSequence p0){
       return StringsKt___StringsKt.Q7(p0, e.b);
    }
    public static List P8(CharSequence p0,int p1,int p2,boolean p3,int p4,Object p5){
       if (p4 & 0x02) {
          p2 = 1;
       }
       if (p4 & 0x04) {
          p3 = false;
       }
       return StringsKt___StringsKt.N8(p0, p1, p2, p3);
    }
    public static final Map Q5(CharSequence p0,l p1){
       a.p(p0, "$this$associateBy");
       a.p(p1, "keySelector");
       LinkedHashMap linkedHashMa = new LinkedHashMap(q.n(s0.j(p0.length()), 16));
       for (int i = 0; i < p0.length(); i = i + 1) {
          char c = p0.charAt(i);
          linkedHashMa.put(p1.invoke(Character.valueOf(c)), Character.valueOf(c));
       }
       return linkedHashMa;
    }
    public static final Map Q6(CharSequence p0,Map p1,l p2){
       a.p(p0, "$this$groupByTo");
       a.p(p1, "destination");
       a.p(p2, "keySelector");
       for (int i = 0; i < p0.length(); i = i + 1) {
          char c = p0.charAt(i);
          Object obj = p2.invoke(Character.valueOf(c));
          ArrayList uArrayList = p1.get(obj);
          if (uArrayList == null) {
             uArrayList = new ArrayList();
             p1.put(obj, uArrayList);
          }
          uArrayList.add(Character.valueOf(c));
       }
       return p1;
    }
    public static final char Q7(CharSequence p0,e p1){
       a.p(p0, "$this$random");
       a.p(p1, "random");
       int i = (!p0.length())? 1: 0;
       if (!i) {
          return p0.charAt(p1.l(p0.length()));
       }else {
          throw new NoSuchElementException("Char sequence is empty.");
       }
    }
    public static List Q8(CharSequence p0,int p1,int p2,boolean p3,l p4,int p5,Object p6){
       if (p5 & 0x02) {
          p2 = 1;
       }
       if (p5 & 0x04) {
          p3 = false;
       }
       return StringsKt___StringsKt.O8(p0, p1, p2, p3, p4);
    }
    public static final Map R5(CharSequence p0,l p1,l p2){
       a.p(p0, "$this$associateBy");
       a.p(p1, "keySelector");
       a.p(p2, "valueTransform");
       LinkedHashMap linkedHashMa = new LinkedHashMap(q.n(s0.j(p0.length()), 16));
       for (int i = 0; i < p0.length(); i = i + 1) {
          char c = p0.charAt(i);
          linkedHashMa.put(p1.invoke(Character.valueOf(c)), p2.invoke(Character.valueOf(c)));
       }
       return linkedHashMa;
    }
    public static final Map R6(CharSequence p0,Map p1,l p2,l p3){
       a.p(p0, "$this$groupByTo");
       a.p(p1, "destination");
       a.p(p2, "keySelector");
       a.p(p3, "valueTransform");
       for (int i = 0; i < p0.length(); i = i + 1) {
          char c = p0.charAt(i);
          Object obj = p2.invoke(Character.valueOf(c));
          ArrayList uArrayList = p1.get(obj);
          if (uArrayList == null) {
             uArrayList = new ArrayList();
             p1.put(obj, uArrayList);
          }
          uArrayList.add(p3.invoke(Character.valueOf(c)));
       }
       return p1;
    }
    public static final Character R7(CharSequence p0){
       return StringsKt___StringsKt.S7(p0, e.b);
    }
    public static final m R8(CharSequence p0,int p1,int p2,boolean p3){
       a.p(p0, "$this$windowedSequence");
       return StringsKt___StringsKt.S8(p0, p1, p2, p3, StringsKt___StringsKt$windowedSequence$1.INSTANCE);
    }
    public static final Map S5(CharSequence p0,Map p1,l p2){
       a.p(p0, "$this$associateByTo");
       a.p(p1, "destination");
       a.p(p2, "keySelector");
       for (int i = 0; i < p0.length(); i = i + 1) {
          char c = p0.charAt(i);
          p1.put(p2.invoke(Character.valueOf(c)), Character.valueOf(c));
       }
       return p1;
    }
    public static final e0 S6(CharSequence p0,l p1){
       a.p(p0, "$this$groupingBy");
       a.p(p1, "keySelector");
       return new StringsKt___StringsKt$c(p0, p1);
    }
    public static final Character S7(CharSequence p0,e p1){
       a.p(p0, "$this$randomOrNull");
       a.p(p1, "random");
       int i = (!p0.length())? 1: 0;
       if (i) {
          return null;
       }else {
          return Character.valueOf(p0.charAt(p1.l(p0.length())));
       }
    }
    public static final m S8(CharSequence p0,int p1,int p2,boolean p3,l p4){
       a.p(p0, "$this$windowedSequence");
       a.p(p4, "transform");
       SlidingWindowKt.a(p1, p2);
       k ok = (p3)? StringsKt__StringsKt.Y2(p0): q.n1(0, ((p0.length() - p1) + 1));
       return SequencesKt___SequencesKt.b1(CollectionsKt___CollectionsKt.l1(q.S0(ok, p2)), new StringsKt___StringsKt$windowedSequence$2(p0, p1, p4));
    }
    public static final Map T5(CharSequence p0,Map p1,l p2,l p3){
       a.p(p0, "$this$associateByTo");
       a.p(p1, "destination");
       a.p(p2, "keySelector");
       a.p(p3, "valueTransform");
       for (int i = 0; i < p0.length(); i = i + 1) {
          char c = p0.charAt(i);
          p1.put(p2.invoke(Character.valueOf(c)), p3.invoke(Character.valueOf(c)));
       }
       return p1;
    }
    public static final int T6(CharSequence p0,l p1){
       a.p(p0, "$this$indexOfFirst");
       a.p(p1, "predicate");
       int i = p0.length();
       int i1 = 0;
       while (true) {
          if (i1 >= i) {
             return -1;
          }
          if (p1.invoke(Character.valueOf(p0.charAt(i1))).booleanValue()) {
             break ;
          }else {
             i1 = i1 + 1;
          }
       }
       return i1;
    }
    public static final char T7(CharSequence p0,p p1){
       a.p(p0, "$this$reduce");
       a.p(p1, "operation");
       int i = 0;
       int i1 = 1;
       char c = (!p0.length())? 1: 0;
       if (!c) {
          c = p0.charAt(i);
          i = StringsKt__StringsKt.Z2(p0);
          if (i1 <= i) {
             c = p1.invoke(Character.valueOf(c), Character.valueOf(p0.charAt(i1))).charValue();
             while (i1 != i) {
                i1 = i1 + 1;
             }
          }
          return c;
       }else {
          throw new UnsupportedOperationException("Empty char sequence can\'t be reduced.");
       }
    }
    public static m T8(CharSequence p0,int p1,int p2,boolean p3,int p4,Object p5){
       if (p4 & 0x02) {
          p2 = 1;
       }
       if (p4 & 0x04) {
          p3 = false;
       }
       return StringsKt___StringsKt.R8(p0, p1, p2, p3);
    }
    public static final Map U5(CharSequence p0,Map p1,l p2){
       a.p(p0, "$this$associateTo");
       a.p(p1, "destination");
       a.p(p2, "transform");
       for (int i = 0; i < p0.length(); i = i + 1) {
          Pair pair = p2.invoke(Character.valueOf(p0.charAt(i)));
          Object first = pair.getFirst();
          p1.put(first, pair.getSecond());
       }
       return p1;
    }
    public static final int U6(CharSequence p0,l p1){
       a.p(p0, "$this$indexOfLast");
       a.p(p1, "predicate");
       int i = p0.length() - 1;
       while (true) {
          if (i < 0) {
             return -1;
          }
          if (p1.invoke(Character.valueOf(p0.charAt(i))).booleanValue()) {
             break ;
          }else {
             i = i - 1;
          }
       }
       return i;
    }
    public static final char U7(CharSequence p0,q p1){
       a.p(p0, "$this$reduceIndexed");
       a.p(p1, "operation");
       int i = 0;
       int i1 = 1;
       char c = (!p0.length())? 1: 0;
       if (!c) {
          c = p0.charAt(i);
          i = StringsKt__StringsKt.Z2(p0);
          if (i1 <= i) {
             c = p1.invoke(Integer.valueOf(i1), Character.valueOf(c), Character.valueOf(p0.charAt(i1))).charValue();
             while (i1 != i) {
                i1 = i1 + 1;
             }
          }
          return c;
       }else {
          throw new UnsupportedOperationException("Empty char sequence can\'t be reduced.");
       }
    }
    public static m U8(CharSequence p0,int p1,int p2,boolean p3,l p4,int p5,Object p6){
       if (p5 & 0x02) {
          p2 = 1;
       }
       if (p5 & 0x04) {
          p3 = false;
       }
       return StringsKt___StringsKt.S8(p0, p1, p2, p3, p4);
    }
    public static final Map V5(CharSequence p0,l p1){
       a.p(p0, "$this$associateWith");
       a.p(p1, "valueSelector");
       LinkedHashMap linkedHashMa = new LinkedHashMap(q.n(s0.j(q.u(p0.length(), 128)), 16));
       for (int i = 0; i < p0.length(); i = i + 1) {
          char c = p0.charAt(i);
          Character uCharacter = Character.valueOf(c);
          linkedHashMa.put(uCharacter, p1.invoke(Character.valueOf(c)));
       }
       return linkedHashMa;
    }
    public static final char V6(CharSequence p0){
       a.p(p0, "$this$last");
       int i = (!p0.length())? 1: 0;
       if (!i) {
          return p0.charAt(StringsKt__StringsKt.Z2(p0));
       }else {
          throw new NoSuchElementException("Char sequence is empty.");
       }
    }
    public static final Character V7(CharSequence p0,q p1){
       a.p(p0, "$this$reduceIndexedOrNull");
       a.p(p1, "operation");
       int i = 0;
       int i1 = 1;
       char c = (!p0.length())? 1: 0;
       if (c) {
          return null;
       }else {
          c = p0.charAt(i);
          i = StringsKt__StringsKt.Z2(p0);
          if (i1 <= i) {
             c = p1.invoke(Integer.valueOf(i1), Character.valueOf(c), Character.valueOf(p0.charAt(i1))).charValue();
             while (i1 != i) {
                i1 = i1 + 1;
             }
          }
          return Character.valueOf(c);
       }
    }
    public static final Iterable V8(CharSequence p0){
       a.p(p0, "$this$withIndex");
       return new j0(new StringsKt___StringsKt$withIndex$1(p0));
    }
    public static final Map W5(CharSequence p0,Map p1,l p2){
       a.p(p0, "$this$associateWithTo");
       a.p(p1, "destination");
       a.p(p2, "valueSelector");
       for (int i = 0; i < p0.length(); i = i + 1) {
          char c = p0.charAt(i);
          Character uCharacter = Character.valueOf(c);
          p1.put(uCharacter, p2.invoke(Character.valueOf(c)));
       }
       return p1;
    }
    public static final char W6(CharSequence p0,l p1){
       char c;
       a.p(p0, "$this$last");
       a.p(p1, "predicate");
       int i = p0.length();
       while (true) {
          i = i - 1;
          if (i < 0) {
             throw new NoSuchElementException("Char sequence contains no character matching the predicate.");
          }
          c = p0.charAt(i);
          if (p1.invoke(Character.valueOf(c)).booleanValue()) {
             break ;
          }
       }
       return c;
    }
    public static final Character W7(CharSequence p0,p p1){
       a.p(p0, "$this$reduceOrNull");
       a.p(p1, "operation");
       int i = 0;
       int i1 = 1;
       char c = (!p0.length())? 1: 0;
       if (c) {
          return null;
       }else {
          c = p0.charAt(i);
          i = StringsKt__StringsKt.Z2(p0);
          if (i1 <= i) {
             c = p1.invoke(Character.valueOf(c), Character.valueOf(p0.charAt(i1))).charValue();
             while (i1 != i) {
                i1 = i1 + 1;
             }
          }
          return Character.valueOf(c);
       }
    }
    public static final List W8(CharSequence p0,CharSequence p1){
       a.p(p0, "$this$zip");
       a.p(p1, "other");
       int i = Math.min(p0.length(), p1.length());
       ArrayList uArrayList = new ArrayList(i);
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          uArrayList.add(r0.a(Character.valueOf(p0.charAt(i1)), Character.valueOf(p1.charAt(i1))));
       }
       return uArrayList;
    }
    public static final List X5(CharSequence p0,int p1){
       a.p(p0, "$this$chunked");
       return StringsKt___StringsKt.N8(p0, p1, p1, true);
    }
    public static final Character X6(CharSequence p0){
       a.p(p0, "$this$lastOrNull");
       int i = (!p0.length())? 1: 0;
       Character uCharacter = (i)? null: Character.valueOf(p0.charAt((p0.length() - 1)));
       return uCharacter;
    }
    public static final char X7(CharSequence p0,p p1){
       a.p(p0, "$this$reduceRight");
       a.p(p1, "operation");
       int i = StringsKt__StringsKt.Z2(p0);
       if (i < 0) {
          throw new UnsupportedOperationException("Empty char sequence can\'t be reduced.");
       }
       char c = p0.charAt(i);
       for (int i1 = i - 1; i1 >= 0; i1 = i2) {
          int i2 = i1 - 1;
          c = p1.invoke(Character.valueOf(p0.charAt(i1)), Character.valueOf(c)).charValue();
       }
       return c;
    }
    public static final List X8(CharSequence p0,CharSequence p1,p p2){
       a.p(p0, "$this$zip");
       a.p(p1, "other");
       a.p(p2, "transform");
       int i = Math.min(p0.length(), p1.length());
       ArrayList uArrayList = new ArrayList(i);
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          uArrayList.add(p2.invoke(Character.valueOf(p0.charAt(i1)), Character.valueOf(p1.charAt(i1))));
       }
       return uArrayList;
    }
    public static final List Y5(CharSequence p0,int p1,l p2){
       a.p(p0, "$this$chunked");
       a.p(p2, "transform");
       return StringsKt___StringsKt.O8(p0, p1, p1, true, p2);
    }
    public static final Character Y6(CharSequence p0,l p1){
       char c;
       a.p(p0, "$this$lastOrNull");
       a.p(p1, "predicate");
       int i = p0.length();
       while (true) {
          i = i - 1;
          if (i < 0) {
             return null;
          }
          c = p0.charAt(i);
          if (p1.invoke(Character.valueOf(c)).booleanValue()) {
             break ;
          }
       }
       return Character.valueOf(c);
    }
    public static final char Y7(CharSequence p0,q p1){
       a.p(p0, "$this$reduceRightIndexed");
       a.p(p1, "operation");
       int i = StringsKt__StringsKt.Z2(p0);
       if (i < 0) {
          throw new UnsupportedOperationException("Empty char sequence can\'t be reduced.");
       }
       char c = p0.charAt(i);
       for (int i1 = i - 1; i1 >= 0; i1 = i1 - 1) {
          c = p1.invoke(Integer.valueOf(i1), Character.valueOf(p0.charAt(i1)), Character.valueOf(c)).charValue();
       }
       return c;
    }
    public static final List Y8(CharSequence p0){
       List list;
       a.p(p0, "$this$zipWithNext");
       int i = 1;
       int i1 = p0.length() - i;
       if (i1 < i) {
          list = CollectionsKt__CollectionsKt.E();
       }else {
          ArrayList uArrayList = new ArrayList(i1);
          int i2 = 0;
          while (i2 < i1) {
             i2 = i2 + 1;
             uArrayList.add(r0.a(Character.valueOf(p0.charAt(i2)), Character.valueOf(p0.charAt(i2))));
          }
          list = uArrayList;
       }
       return list;
    }
    public static final m Z5(CharSequence p0,int p1){
       a.p(p0, "$this$chunkedSequence");
       return StringsKt___StringsKt.a6(p0, p1, StringsKt___StringsKt$chunkedSequence$1.INSTANCE);
    }
    public static final List Z6(CharSequence p0,l p1){
       a.p(p0, "$this$map");
       a.p(p1, "transform");
       ArrayList uArrayList = new ArrayList(p0.length());
       for (int i = 0; i < p0.length(); i = i + 1) {
          uArrayList.add(p1.invoke(Character.valueOf(p0.charAt(i))));
       }
       return uArrayList;
    }
    public static final Character Z7(CharSequence p0,q p1){
       a.p(p0, "$this$reduceRightIndexedOrNull");
       a.p(p1, "operation");
       int i = StringsKt__StringsKt.Z2(p0);
       if (i < 0) {
          return null;
       }
       char c = p0.charAt(i);
       for (int i1 = i - 1; i1 >= 0; i1 = i1 - 1) {
          c = p1.invoke(Integer.valueOf(i1), Character.valueOf(p0.charAt(i1)), Character.valueOf(c)).charValue();
       }
       return Character.valueOf(c);
    }
    public static final List Z8(CharSequence p0,p p1){
       a.p(p0, "$this$zipWithNext");
       a.p(p1, "transform");
       int i = 1;
       int i1 = p0.length() - i;
       if (i1 < i) {
          return CollectionsKt__CollectionsKt.E();
       }
       ArrayList uArrayList = new ArrayList(i1);
       int i2 = 0;
       while (i2 < i1) {
          i2 = i2 + 1;
          uArrayList.add(p1.invoke(Character.valueOf(p0.charAt(i2)), Character.valueOf(p0.charAt(i2))));
       }
       return uArrayList;
    }
    public static final m a6(CharSequence p0,int p1,l p2){
       a.p(p0, "$this$chunkedSequence");
       a.p(p2, "transform");
       return StringsKt___StringsKt.S8(p0, p1, p1, true, p2);
    }
    public static final List a7(CharSequence p0,p p1){
       a.p(p0, "$this$mapIndexed");
       a.p(p1, "transform");
       ArrayList uArrayList = new ArrayList(p0.length());
       int i1 = 0;
       for (int i = 0; i < p0.length(); i = i + 1) {
          i1 = i1 + 1;
          uArrayList.add(p1.invoke(Integer.valueOf(i1), Character.valueOf(p0.charAt(i))));
       }
       return uArrayList;
    }
    public static final Character a8(CharSequence p0,p p1){
       a.p(p0, "$this$reduceRightOrNull");
       a.p(p1, "operation");
       int i = StringsKt__StringsKt.Z2(p0);
       if (i < 0) {
          return null;
       }
       char c = p0.charAt(i);
       for (int i1 = i - 1; i1 >= 0; i1 = i2) {
          int i2 = i1 - 1;
          c = p1.invoke(Character.valueOf(p0.charAt(i1)), Character.valueOf(c)).charValue();
       }
       return Character.valueOf(c);
    }
    public static final int b6(CharSequence p0){
       return p0.length();
    }
    public static final List b7(CharSequence p0,p p1){
       a.p(p0, "$this$mapIndexedNotNull");
       a.p(p1, "transform");
       ArrayList uArrayList = new ArrayList();
       int i = 0;
       int i1 = 0;
       while (i < p0.length()) {
          int i2 = i1 + 1;
          Object obj = p1.invoke(Integer.valueOf(i1), Character.valueOf(p0.charAt(i)));
          if (obj != null) {
             uArrayList.add(obj);
          }
          i = i + 1;
          i1 = i2;
       }
       return uArrayList;
    }
    public static final CharSequence b8(CharSequence p0){
       a.p(p0, "$this$reversed");
       StringBuilder str = (new StringBuilder(p0)).reverse();
       a.o(str, "StringBuilder\(this\).reverse\(\)");
       return str;
    }
    public static final int c6(CharSequence p0,l p1){
       a.p(p0, "$this$count");
       a.p(p1, "predicate");
       int i = 0;
       int i1 = 0;
       while (i < p0.length()) {
          if (p1.invoke(Character.valueOf(p0.charAt(i))).booleanValue()) {
             i1 = i1 + 1;
          }
          i = i + 1;
       }
       return i1;
    }
    public static final Collection c7(CharSequence p0,Collection p1,p p2){
       a.p(p0, "$this$mapIndexedNotNullTo");
       a.p(p1, "destination");
       a.p(p2, "transform");
       int i = 0;
       int i1 = 0;
       while (i < p0.length()) {
          int i2 = i1 + 1;
          Object obj = p2.invoke(Integer.valueOf(i1), Character.valueOf(p0.charAt(i)));
          if (obj != null) {
             p1.add(obj);
          }
          i = i + 1;
          i1 = i2;
       }
       return p1;
    }
    public static final String c8(String p0){
       Objects.requireNonNull(p0, "null cannot be cast to non-null type kotlin.CharSequence");
       return StringsKt___StringsKt.b8(p0).toString();
    }
    public static final CharSequence d6(CharSequence p0,int p1){
       a.p(p0, "$this$drop");
       int i = (p1 >= 0)? 1: 0;
       if (i) {
          return p0.subSequence(q.u(p1, p0.length()), p0.length());
       }else {
          throw new IllegalArgumentException("Requested character count "+p1+" is less than zero.".toString());
       }
    }
    public static final Collection d7(CharSequence p0,Collection p1,p p2){
       a.p(p0, "$this$mapIndexedTo");
       a.p(p1, "destination");
       a.p(p2, "transform");
       int i1 = 0;
       for (int i = 0; i < p0.length(); i = i + 1) {
          i1 = i1 + 1;
          p1.add(p2.invoke(Integer.valueOf(i1), Character.valueOf(p0.charAt(i))));
       }
       return p1;
    }
    public static final List d8(CharSequence p0,Object p1,p p2){
       a.p(p0, "$this$runningFold");
       a.p(p2, "operation");
       int i = 0;
       int i1 = 1;
       ArrayList uArrayList = (!p0.length())? 1: null;
       if (uArrayList) {
          return t.k(p1);
       }else {
          uArrayList = new ArrayList((p0.length() + i1));
          uArrayList.add(p1);
          for (; i < p0.length(); i = i + 1) {
             uArrayList.add(p2.invoke(p1, Character.valueOf(p0.charAt(i))));
          }
          return uArrayList;
       }
    }
    public static final String e6(String p0,int p1){
       a.p(p0, "$this$drop");
       int i = (p1 >= 0)? 1: 0;
       if (i) {
          p0 = p0.substring(q.u(p1, p0.length()));
          a.o(p0, "\(this as java.lang.String\).substring\(startIndex\)");
          return p0;
       }else {
          throw new IllegalArgumentException("Requested character count "+p1+" is less than zero.".toString());
       }
    }
    public static final List e7(CharSequence p0,l p1){
       a.p(p0, "$this$mapNotNull");
       a.p(p1, "transform");
       ArrayList uArrayList = new ArrayList();
       int i = 0;
       while (i < p0.length()) {
          Object obj = p1.invoke(Character.valueOf(p0.charAt(i)));
          if (obj != null) {
             uArrayList.add(obj);
          }
          i = i + 1;
       }
       return uArrayList;
    }
    public static final List e8(CharSequence p0,Object p1,q p2){
       a.p(p0, "$this$runningFoldIndexed");
       a.p(p2, "operation");
       int i = 0;
       int i1 = 1;
       ArrayList uArrayList = (!p0.length())? 1: null;
       if (uArrayList) {
          return t.k(p1);
       }else {
          uArrayList = new ArrayList((p0.length() + i1));
          uArrayList.add(p1);
          i1 = p0.length();
          for (; i < i1; i = i + 1) {
             uArrayList.add(p2.invoke(Integer.valueOf(i), p1, Character.valueOf(p0.charAt(i))));
          }
          return uArrayList;
       }
    }
    public static final CharSequence f6(CharSequence p0,int p1){
       a.p(p0, "$this$dropLast");
       int i = 0;
       int i1 = (p1 >= 0)? 1: 0;
       if (i1) {
          return StringsKt___StringsKt.A8(p0, q.n((p0.length() - p1), i));
       }else {
          throw new IllegalArgumentException("Requested character count "+p1+" is less than zero.".toString());
       }
    }
    public static final Collection f7(CharSequence p0,Collection p1,l p2){
       a.p(p0, "$this$mapNotNullTo");
       a.p(p1, "destination");
       a.p(p2, "transform");
       int i = 0;
       while (i < p0.length()) {
          Object obj = p2.invoke(Character.valueOf(p0.charAt(i)));
          if (obj != null) {
             p1.add(obj);
          }
          i = i + 1;
       }
       return p1;
    }
    public static final List f8(CharSequence p0,p p1){
       a.p(p0, "$this$runningReduce");
       a.p(p1, "operation");
       int i = 0;
       int i1 = 1;
       char c = (!p0.length())? 1: 0;
       if (c) {
          return CollectionsKt__CollectionsKt.E();
       }else {
          c = p0.charAt(i);
          ArrayList uArrayList = new ArrayList(p0.length());
          uArrayList.add(Character.valueOf(c));
          int i2 = p0.length();
          for (; i1 < i2; i1 = i1 + 1) {
             uArrayList.add(Character.valueOf(p1.invoke(Character.valueOf(c), Character.valueOf(p0.charAt(i1))).charValue()));
          }
          return uArrayList;
       }
    }
    public static final String g6(String p0,int p1){
       a.p(p0, "$this$dropLast");
       int i = 0;
       int i1 = (p1 >= 0)? 1: 0;
       if (i1) {
          return StringsKt___StringsKt.B8(p0, q.n((p0.length() - p1), i));
       }else {
          throw new IllegalArgumentException("Requested character count "+p1+" is less than zero.".toString());
       }
    }
    public static final Collection g7(CharSequence p0,Collection p1,l p2){
       a.p(p0, "$this$mapTo");
       a.p(p1, "destination");
       a.p(p2, "transform");
       for (int i = 0; i < p0.length(); i = i + 1) {
          p1.add(p2.invoke(Character.valueOf(p0.charAt(i))));
       }
       return p1;
    }
    public static final List g8(CharSequence p0,q p1){
       a.p(p0, "$this$runningReduceIndexed");
       a.p(p1, "operation");
       int i = 0;
       int i1 = 1;
       char c = (!p0.length())? 1: 0;
       if (c) {
          return CollectionsKt__CollectionsKt.E();
       }else {
          c = p0.charAt(i);
          ArrayList uArrayList = new ArrayList(p0.length());
          uArrayList.add(Character.valueOf(c));
          int i2 = p0.length();
          for (; i1 < i2; i1 = i1 + 1) {
             uArrayList.add(Character.valueOf(p1.invoke(Integer.valueOf(i1), Character.valueOf(c), Character.valueOf(p0.charAt(i1))).charValue()));
          }
          return uArrayList;
       }
    }
    public static final CharSequence h6(CharSequence p0,l p1){
       a.p(p0, "$this$dropLastWhile");
       a.p(p1, "predicate");
       int i = StringsKt__StringsKt.Z2(p0);
       while (true) {
          if (i < 0) {
             return "";
          }
          if (!p1.invoke(Character.valueOf(p0.charAt(i))).booleanValue()) {
             break ;
          }else {
             i = i - 1;
          }
       }
       return p0.subSequence(0, (i + 1));
    }
    public static final Character h7(CharSequence p0){
       a.p(p0, "$this$max");
       return StringsKt___StringsKt.s7(p0);
    }
    public static final List h8(CharSequence p0,Object p1,p p2){
       List list;
       a.p(p0, "$this$scan");
       a.p(p2, "operation");
       int i = 0;
       int i1 = 1;
       ArrayList uArrayList = (!p0.length())? 1: null;
       if (uArrayList) {
          list = t.k(p1);
       }else {
          uArrayList = new ArrayList((p0.length() + i1));
          uArrayList.add(p1);
          for (; i < p0.length(); i = i + 1) {
             uArrayList.add(p2.invoke(p1, Character.valueOf(p0.charAt(i))));
          }
          list = uArrayList;
       }
       return list;
    }
    public static final String i6(String p0,l p1){
       a.p(p0, "$this$dropLastWhile");
       a.p(p1, "predicate");
       int i = StringsKt__StringsKt.Z2(p0);
       while (true) {
          if (i < 0) {
             return "";
          }
          if (!p1.invoke(Character.valueOf(p0.charAt(i))).booleanValue()) {
             break ;
          }else {
             i = i - 1;
          }
       }
       p0 = p0.substring(0, (i + 1));
       a.o(p0, "\(this as java.lang.Strin¡­ing\(startIndex, endIndex\)");
       return p0;
    }
    public static final Character i7(CharSequence p0,l p1){
       Character uCharacter;
       a.p(p0, "$this$maxBy");
       a.p(p1, "selector");
       int i = 0;
       int i1 = 1;
       char c = (!p0.length())? 1: 0;
       if (c) {
          uCharacter = null;
       }else {
          c = p0.charAt(i);
          i = StringsKt__StringsKt.Z2(p0);
          if (!i) {
             uCharacter = Character.valueOf(c);
          }else {
             Comparable uComparable = p1.invoke(Character.valueOf(c));
             if (i1 <= i) {
                char c1 = p0.charAt(i1);
                Comparable uComparable1 = p1.invoke(Character.valueOf(c1));
                while (uComparable.compareTo(uComparable1) < 0) {
                   c = c1;
                   uComparable = uComparable1;
                   break ;
                   i1 = i1 + 1;
                }
                if (i1 != i) {
                   goto label_004c ;
                }
             }
             uCharacter = Character.valueOf(c);
          }
       }
       return uCharacter;
    }
    public static final List i8(CharSequence p0,Object p1,q p2){
       List list;
       a.p(p0, "$this$scanIndexed");
       a.p(p2, "operation");
       int i = 0;
       int i1 = 1;
       ArrayList uArrayList = (!p0.length())? 1: null;
       if (uArrayList) {
          list = t.k(p1);
       }else {
          uArrayList = new ArrayList((p0.length() + i1));
          uArrayList.add(p1);
          i1 = p0.length();
          for (; i < i1; i = i + 1) {
             uArrayList.add(p2.invoke(Integer.valueOf(i), p1, Character.valueOf(p0.charAt(i))));
          }
          list = uArrayList;
       }
       return list;
    }
    public static final CharSequence j6(CharSequence p0,l p1){
       a.p(p0, "$this$dropWhile");
       a.p(p1, "predicate");
       int i = p0.length();
       int i1 = 0;
       while (true) {
          if (i1 >= i) {
             return "";
          }
          if (!p1.invoke(Character.valueOf(p0.charAt(i1))).booleanValue()) {
             break ;
          }else {
             i1 = i1 + 1;
          }
       }
       return p0.subSequence(i1, p0.length());
    }
    public static final Character j7(CharSequence p0,l p1){
       a.p(p0, "$this$maxByOrNull");
       a.p(p1, "selector");
       int i = 0;
       int i1 = 1;
       char c = (!p0.length())? 1: 0;
       if (c) {
          return null;
       }else {
          c = p0.charAt(i);
          i = StringsKt__StringsKt.Z2(p0);
          if (!i) {
             return Character.valueOf(c);
          }else {
             Comparable uComparable = p1.invoke(Character.valueOf(c));
             if (i1 <= i) {
                char c1 = p0.charAt(i1);
                Comparable uComparable1 = p1.invoke(Character.valueOf(c1));
                while (uComparable.compareTo(uComparable1) < 0) {
                   c = c1;
                   uComparable = uComparable1;
                   break ;
                   i1 = i1 + 1;
                }
                if (i1 != i) {
                   goto label_004c ;
                }
             }
             return Character.valueOf(c);
          }
       }
    }
    public static final List j8(CharSequence p0,p p1){
       List list;
       a.p(p0, "$this$scanReduce");
       a.p(p1, "operation");
       int i = 0;
       int i1 = 1;
       char c = (!p0.length())? 1: 0;
       if (c) {
          list = CollectionsKt__CollectionsKt.E();
       }else {
          c = p0.charAt(i);
          ArrayList uArrayList = new ArrayList(p0.length());
          uArrayList.add(Character.valueOf(c));
          int i2 = p0.length();
          for (; i1 < i2; i1 = i1 + 1) {
             uArrayList.add(Character.valueOf(p1.invoke(Character.valueOf(c), Character.valueOf(p0.charAt(i1))).charValue()));
          }
          list = uArrayList;
       }
       return list;
    }
    public static final String k6(String p0,l p1){
       a.p(p0, "$this$dropWhile");
       a.p(p1, "predicate");
       int i = p0.length();
       int i1 = 0;
       while (true) {
          if (i1 >= i) {
             return "";
          }
          if (!p1.invoke(Character.valueOf(p0.charAt(i1))).booleanValue()) {
             break ;
          }else {
             i1 = i1 + 1;
          }
       }
       p0 = p0.substring(i1);
       a.o(p0, "\(this as java.lang.String\).substring\(startIndex\)");
       return p0;
    }
    public static final double k7(CharSequence p0,l p1){
       int i = 1;
       char c = (!p0.length())? 1: 0;
       if (!c) {
          double d = p1.invoke(Character.valueOf(p0.charAt(0))).doubleValue();
          int i1 = StringsKt__StringsKt.Z2(p0);
          if (i <= i1) {
             d = Math.max(d, p1.invoke(Character.valueOf(p0.charAt(i))).doubleValue());
             while (i != i1) {
                i = i + 1;
             }
          }
          return d;
       }else {
          throw new NoSuchElementException();
       }
    }
    public static final List k8(CharSequence p0,q p1){
       List list;
       a.p(p0, "$this$scanReduceIndexed");
       a.p(p1, "operation");
       int i = 0;
       int i1 = 1;
       char c = (!p0.length())? 1: 0;
       if (c) {
          list = CollectionsKt__CollectionsKt.E();
       }else {
          c = p0.charAt(i);
          ArrayList uArrayList = new ArrayList(p0.length());
          uArrayList.add(Character.valueOf(c));
          int i2 = p0.length();
          for (; i1 < i2; i1 = i1 + 1) {
             uArrayList.add(Character.valueOf(p1.invoke(Integer.valueOf(i1), Character.valueOf(c), Character.valueOf(p0.charAt(i1))).charValue()));
          }
          list = uArrayList;
       }
       return list;
    }
    public static final char l6(CharSequence p0,int p1,l p2){
       char c = (p1 >= 0 && p1 <= StringsKt__StringsKt.Z2(p0))? p0.charAt(p1): p2.invoke(Integer.valueOf(p1)).charValue();
       return c;
    }
    public static final float l7(CharSequence p0,l p1){
       int i = 0;
       int i1 = 1;
       char c = (!p0.length())? 1: 0;
       if (!c) {
          float f = p1.invoke(Character.valueOf(p0.charAt(i))).floatValue();
          i = StringsKt__StringsKt.Z2(p0);
          if (i1 <= i) {
             f = Math.max(f, p1.invoke(Character.valueOf(p0.charAt(i1))).floatValue());
             while (i1 != i) {
                i1 = i1 + 1;
             }
          }
          return f;
       }else {
          throw new NoSuchElementException();
       }
    }
    public static final char l8(CharSequence p0){
       a.p(p0, "$this$single");
       int i = p0.length();
       if (!i) {
          throw new NoSuchElementException("Char sequence is empty.");
       }
       if (i == 1) {
          return p0.charAt(0);
       }
       throw new IllegalArgumentException("Char sequence has more than one element.");
    }
    public static final Character m6(CharSequence p0,int p1){
       return StringsKt___StringsKt.N6(p0, p1);
    }
    public static final Comparable m7(CharSequence p0,l p1){
       int i = 0;
       int i1 = 1;
       char c = (!p0.length())? 1: 0;
       if (!c) {
          Comparable uComparable = p1.invoke(Character.valueOf(p0.charAt(i)));
          i = StringsKt__StringsKt.Z2(p0);
          if (i1 <= i) {
             Comparable uComparable1 = p1.invoke(Character.valueOf(p0.charAt(i1)));
             while (uComparable.compareTo(uComparable1) < 0) {
                uComparable = uComparable1;
                break ;
                i1 = i1 + 1;
             }
             if (i1 != i) {
                goto label_0038 ;
             }
          }
          return uComparable;
       }else {
          throw new NoSuchElementException();
       }
    }
    public static final char m8(CharSequence p0,l p1){
       a.p(p0, "$this$single");
       a.p(p1, "predicate");
       int i = 0;
       Character uCharacter = null;
       Character uCharacter1 = null;
       while (true) {
          if (i < p0.length()) {
             char c = p0.charAt(i);
             if (p1.invoke(Character.valueOf(c)).booleanValue()) {
                if (!uCharacter1) {
                   uCharacter = Character.valueOf(c);
                   uCharacter1 = 1;
                }else {
                   break ;
                }
             }
             i = i + 1;
          }else if(uCharacter1 != null){
             Objects.requireNonNull(uCharacter, "null cannot be cast to non-null type kotlin.Char");
             return uCharacter.charValue();
          }else {
             throw new NoSuchElementException("Char sequence contains no character matching the predicate.");
          }
       }
       throw new IllegalArgumentException("Char sequence contains more than one matching element.");
    }
    public static final CharSequence n6(CharSequence p0,l p1){
       a.p(p0, "$this$filter");
       a.p(p1, "predicate");
       StringBuilder str = "";
       int i = p0.length();
       int i1 = 0;
       while (i1 < i) {
          char c = p0.charAt(i1);
          if (p1.invoke(Character.valueOf(c)).booleanValue()) {
             str.append(c);
          }
          i1 = i1 + 1;
       }
       return str;
    }
    public static final Comparable n7(CharSequence p0,l p1){
       int i = 0;
       int i1 = 1;
       char c = (!p0.length())? 1: 0;
       if (c) {
          return null;
       }else {
          Comparable uComparable = p1.invoke(Character.valueOf(p0.charAt(i)));
          i = StringsKt__StringsKt.Z2(p0);
          if (i1 <= i) {
             Comparable uComparable1 = p1.invoke(Character.valueOf(p0.charAt(i1)));
             while (uComparable.compareTo(uComparable1) < 0) {
                uComparable = uComparable1;
                break ;
                i1 = i1 + 1;
             }
             if (i1 != i) {
                goto label_003a ;
             }
          }
          return uComparable;
       }
    }
    public static final Character n8(CharSequence p0){
       a.p(p0, "$this$singleOrNull");
       Character uCharacter = (p0.length() == 1)? Character.valueOf(p0.charAt(0)): null;
       return uCharacter;
    }
    public static final String o6(String p0,l p1){
       a.p(p0, "$this$filter");
       a.p(p1, "predicate");
       StringBuilder str = "";
       int i = p0.length();
       int i1 = 0;
       while (i1 < i) {
          char c = p0.charAt(i1);
          if (p1.invoke(Character.valueOf(c)).booleanValue()) {
             str.append(c);
          }
          i1 = i1 + 1;
       }
       p0 = str;
       a.o(p0, "filterTo\(StringBuilder\(\), predicate\).toString\(\)");
       return p0;
    }
    public static final Double o7(CharSequence p0,l p1){
       int i = 1;
       char c = (!p0.length())? 1: 0;
       if (c) {
          return null;
       }else {
          double d = p1.invoke(Character.valueOf(p0.charAt(0))).doubleValue();
          int i1 = StringsKt__StringsKt.Z2(p0);
          if (i <= i1) {
             d = Math.max(d, p1.invoke(Character.valueOf(p0.charAt(i))).doubleValue());
             while (i != i1) {
                i = i + 1;
             }
          }
          return Double.valueOf(d);
       }
    }
    public static final Character o8(CharSequence p0,l p1){
       a.p(p0, "$this$singleOrNull");
       a.p(p1, "predicate");
       int i = 0;
       Character uCharacter = null;
       int i1 = 0;
       while (true) {
          if (i < p0.length()) {
             char c = p0.charAt(i);
             if (p1.invoke(Character.valueOf(c)).booleanValue()) {
                if (i1) {
                   break ;
                }else {
                   uCharacter = Character.valueOf(c);
                   i1 = 1;
                }
             }
             i = i + 1;
          }else if(!i1){
             return null;
          }else {
             return uCharacter;
          }
       }
       return null;
    }
    public static final CharSequence p6(CharSequence p0,p p1){
       a.p(p0, "$this$filterIndexed");
       a.p(p1, "predicate");
       StringBuilder str = "";
       int i = 0;
       int i1 = 0;
       while (i < p0.length()) {
          char c = p0.charAt(i);
          int i2 = i1 + 1;
          if (p1.invoke(Integer.valueOf(i1), Character.valueOf(c)).booleanValue()) {
             str.append(c);
          }
          i = i + 1;
          i1 = i2;
       }
       return str;
    }
    public static final Float p7(CharSequence p0,l p1){
       int i = 0;
       int i1 = 1;
       char c = (!p0.length())? 1: 0;
       if (c) {
          return null;
       }else {
          float f = p1.invoke(Character.valueOf(p0.charAt(i))).floatValue();
          i = StringsKt__StringsKt.Z2(p0);
          if (i1 <= i) {
             f = Math.max(f, p1.invoke(Character.valueOf(p0.charAt(i1))).floatValue());
             while (i1 != i) {
                i1 = i1 + 1;
             }
          }
          return Float.valueOf(f);
       }
    }
    public static final CharSequence p8(CharSequence p0,Iterable p1){
       a.p(p0, "$this$slice");
       a.p(p1, "indices");
       int i = u.Y(p1, 10);
       if (!i) {
          return "";
       }
       StringBuilder str = new StringBuilder(i);
       Iterator iterator = p1.iterator();
       while (iterator.hasNext()) {
          str = str+p0.charAt(iterator.next().intValue());
       }
       return str;
    }
    public static final String q6(String p0,p p1){
       a.p(p0, "$this$filterIndexed");
       a.p(p1, "predicate");
       StringBuilder str = "";
       int i = 0;
       int i1 = 0;
       while (i < p0.length()) {
          char c = p0.charAt(i);
          int i2 = i1 + 1;
          if (p1.invoke(Integer.valueOf(i1), Character.valueOf(c)).booleanValue()) {
             str.append(c);
          }
          i = i + 1;
          i1 = i2;
       }
       p0 = str;
       a.o(p0, "filterIndexedTo\(StringBu¡­\(\), predicate\).toString\(\)");
       return p0;
    }
    public static final Object q7(CharSequence p0,Comparator p1,l p2){
       int i = 0;
       int i1 = 1;
       char c = (!p0.length())? 1: 0;
       if (!c) {
          Object obj = p2.invoke(Character.valueOf(p0.charAt(i)));
          i = StringsKt__StringsKt.Z2(p0);
          if (i1 <= i) {
             Object obj1 = p2.invoke(Character.valueOf(p0.charAt(i1)));
             while (p1.compare(obj, obj1) < 0) {
                obj = obj1;
                break ;
                i1 = i1 + 1;
             }
             if (i1 != i) {
                goto label_0034 ;
             }
          }
          return obj;
       }else {
          throw new NoSuchElementException();
       }
    }
    public static final CharSequence q8(CharSequence p0,k p1){
       a.p(p0, "$this$slice");
       a.p(p1, "indices");
       if (p1.isEmpty()) {
          return "";
       }
       return StringsKt__StringsKt.S4(p0, p1);
    }
    public static final Appendable r6(CharSequence p0,Appendable p1,p p2){
       a.p(p0, "$this$filterIndexedTo");
       a.p(p1, "destination");
       a.p(p2, "predicate");
       int i = 0;
       int i1 = 0;
       while (i < p0.length()) {
          char c = p0.charAt(i);
          int i2 = i1 + 1;
          if (p2.invoke(Integer.valueOf(i1), Character.valueOf(c)).booleanValue()) {
             p1.append(c);
          }
          i = i + 1;
          i1 = i2;
       }
       return p1;
    }
    public static final Object r7(CharSequence p0,Comparator p1,l p2){
       int i = 0;
       int i1 = 1;
       char c = (!p0.length())? 1: 0;
       if (c) {
          return null;
       }else {
          Object obj = p2.invoke(Character.valueOf(p0.charAt(i)));
          i = StringsKt__StringsKt.Z2(p0);
          if (i1 <= i) {
             Object obj1 = p2.invoke(Character.valueOf(p0.charAt(i1)));
             while (p1.compare(obj, obj1) < 0) {
                obj = obj1;
                break ;
                i1 = i1 + 1;
             }
             if (i1 != i) {
                goto label_0036 ;
             }
          }
          return obj;
       }
    }
    public static final String r8(String p0,Iterable p1){
       Objects.requireNonNull(p0, "null cannot be cast to non-null type kotlin.CharSequence");
       return StringsKt___StringsKt.p8(p0, p1).toString();
    }
    public static final CharSequence s6(CharSequence p0,l p1){
       a.p(p0, "$this$filterNot");
       a.p(p1, "predicate");
       StringBuilder str = "";
       int i = 0;
       while (i < p0.length()) {
          char c = p0.charAt(i);
          if (!p1.invoke(Character.valueOf(c)).booleanValue()) {
             str.append(c);
          }
          i = i + 1;
       }
       return str;
    }
    public static final Character s7(CharSequence p0){
       a.p(p0, "$this$maxOrNull");
       int i = 0;
       int i1 = 1;
       char c = (!p0.length())? 1: 0;
       if (c) {
          return null;
       }else {
          c = p0.charAt(i);
          i = StringsKt__StringsKt.Z2(p0);
          if (i1 <= i) {
             char c1 = p0.charAt(i1);
             while (a.t(c, c1) < 0) {
                c = c1;
                break ;
                i1 = i1 + 1;
             }
             if (i1 != i) {
                goto label_002b ;
             }
          }
          return Character.valueOf(c);
       }
    }
    public static final String s8(String p0,k p1){
       a.p(p0, "$this$slice");
       a.p(p1, "indices");
       if (p1.isEmpty()) {
          return "";
       }
       return StringsKt__StringsKt.W4(p0, p1);
    }
    public static final String t6(String p0,l p1){
       a.p(p0, "$this$filterNot");
       a.p(p1, "predicate");
       StringBuilder str = "";
       int i = 0;
       while (i < p0.length()) {
          char c = p0.charAt(i);
          if (!p1.invoke(Character.valueOf(c)).booleanValue()) {
             str.append(c);
          }
          i = i + 1;
       }
       p0 = str;
       a.o(p0, "filterNotTo\(StringBuilder\(\), predicate\).toString\(\)");
       return p0;
    }
    public static final Character t7(CharSequence p0,Comparator p1){
       a.p(p0, "$this$maxWith");
       a.p(p1, "comparator");
       return StringsKt___StringsKt.u7(p0, p1);
    }
    public static final int t8(CharSequence p0,l p1){
       a.p(p0, "$this$sumBy");
       a.p(p1, "selector");
       int i1 = 0;
       for (int i = 0; i < p0.length(); i = i + 1) {
          i1 = i1 + p1.invoke(Character.valueOf(p0.charAt(i))).intValue();
       }
       return i1;
    }
    public static final Appendable u6(CharSequence p0,Appendable p1,l p2){
       a.p(p0, "$this$filterNotTo");
       a.p(p1, "destination");
       a.p(p2, "predicate");
       int i = 0;
       while (i < p0.length()) {
          char c = p0.charAt(i);
          if (!p2.invoke(Character.valueOf(c)).booleanValue()) {
             p1.append(c);
          }
          i = i + 1;
       }
       return p1;
    }
    public static final Character u7(CharSequence p0,Comparator p1){
       a.p(p0, "$this$maxWithOrNull");
       a.p(p1, "comparator");
       int i = 0;
       int i1 = 1;
       char c = (!p0.length())? 1: 0;
       if (c) {
          return null;
       }else {
          c = p0.charAt(i);
          i = StringsKt__StringsKt.Z2(p0);
          if (i1 <= i) {
             char c1 = p0.charAt(i1);
             while (p1.compare(Character.valueOf(c), Character.valueOf(c1)) < 0) {
                c = c1;
                break ;
                i1 = i1 + 1;
             }
             if (i1 != i) {
                goto label_0038 ;
             }
          }
          return Character.valueOf(c);
       }
    }
    public static final double u8(CharSequence p0,l p1){
       a.p(p0, "$this$sumByDouble");
       a.p(p1, "selector");
       double d = 0;
       for (int i = 0; i < p0.length(); i = i + 1) {
          d = d + p1.invoke(Character.valueOf(p0.charAt(i))).doubleValue();
       }
       return d;
    }
    public static final Appendable v6(CharSequence p0,Appendable p1,l p2){
       a.p(p0, "$this$filterTo");
       a.p(p1, "destination");
       a.p(p2, "predicate");
       int i = p0.length();
       int i1 = 0;
       while (i1 < i) {
          char c = p0.charAt(i1);
          if (p2.invoke(Character.valueOf(c)).booleanValue()) {
             p1.append(c);
          }
          i1 = i1 + 1;
       }
       return p1;
    }
    public static final Character v7(CharSequence p0){
       a.p(p0, "$this$min");
       return StringsKt___StringsKt.G7(p0);
    }
    public static final double v8(CharSequence p0,l p1){
       int i = 0;
       double d = (double)i;
       for (; i < p0.length(); i = i + 1) {
          d = d + p1.invoke(Character.valueOf(p0.charAt(i))).doubleValue();
       }
       return d;
    }
    public static final Character w6(CharSequence p0,l p1){
       Character uCharacter;
       int i = 0;
       while (true) {
          if (i < p0.length()) {
             char c = p0.charAt(i);
             if (p1.invoke(Character.valueOf(c)).booleanValue()) {
                uCharacter = Character.valueOf(c);
                break ;
             }else {
                i = i + 1;
             }
          }else {
             uCharacter = null;
             break ;
          }
       }
       return uCharacter;
    }
    public static final Character w7(CharSequence p0,l p1){
       Character uCharacter;
       a.p(p0, "$this$minBy");
       a.p(p1, "selector");
       int i = 0;
       int i1 = 1;
       char c = (!p0.length())? 1: 0;
       if (c) {
          uCharacter = null;
       }else {
          c = p0.charAt(i);
          i = StringsKt__StringsKt.Z2(p0);
          if (!i) {
             uCharacter = Character.valueOf(c);
          }else {
             Comparable uComparable = p1.invoke(Character.valueOf(c));
             if (i1 <= i) {
                char c1 = p0.charAt(i1);
                Comparable uComparable1 = p1.invoke(Character.valueOf(c1));
                while (uComparable.compareTo(uComparable1) > 0) {
                   c = c1;
                   uComparable = uComparable1;
                   break ;
                   i1 = i1 + 1;
                }
                if (i1 != i) {
                   goto label_004c ;
                }
             }
             uCharacter = Character.valueOf(c);
          }
       }
       return uCharacter;
    }
    public static final int w8(CharSequence p0,l p1){
       int i1 = 0;
       for (int i = 0; i < p0.length(); i = i + 1) {
          i1 = i1 + p1.invoke(Character.valueOf(p0.charAt(i))).intValue();
       }
       return i1;
    }
    public static final Character x6(CharSequence p0,l p1){
       Character uCharacter;
       int i = p0.length();
       while (true) {
          i = i - 1;
          if (i >= 0) {
             char c = p0.charAt(i);
             if (p1.invoke(Character.valueOf(c)).booleanValue()) {
                uCharacter = Character.valueOf(c);
                break ;
             }
          }else {
             uCharacter = null;
             break ;
          }
       }
       return uCharacter;
    }
    public static final Character x7(CharSequence p0,l p1){
       a.p(p0, "$this$minByOrNull");
       a.p(p1, "selector");
       int i = 0;
       int i1 = 1;
       char c = (!p0.length())? 1: 0;
       if (c) {
          return null;
       }else {
          c = p0.charAt(i);
          i = StringsKt__StringsKt.Z2(p0);
          if (!i) {
             return Character.valueOf(c);
          }else {
             Comparable uComparable = p1.invoke(Character.valueOf(c));
             if (i1 <= i) {
                char c1 = p0.charAt(i1);
                Comparable uComparable1 = p1.invoke(Character.valueOf(c1));
                while (uComparable.compareTo(uComparable1) > 0) {
                   c = c1;
                   uComparable = uComparable1;
                   break ;
                   i1 = i1 + 1;
                }
                if (i1 != i) {
                   goto label_004c ;
                }
             }
             return Character.valueOf(c);
          }
       }
    }
    public static final long x8(CharSequence p0,l p1){
       long l = 0;
       for (int i = 0; i < p0.length(); i = i + 1) {
          l = l + p1.invoke(Character.valueOf(p0.charAt(i))).longValue();
       }
       return l;
    }
    public static final char y6(CharSequence p0){
       a.p(p0, "$this$first");
       String str = (!p0.length())? 1: null;
       if (!str) {
          return p0.charAt(0);
       }else {
          throw new NoSuchElementException("Char sequence is empty.");
       }
    }
    public static final double y7(CharSequence p0,l p1){
       int i = 1;
       char c = (!p0.length())? 1: 0;
       if (!c) {
          double d = p1.invoke(Character.valueOf(p0.charAt(0))).doubleValue();
          int i1 = StringsKt__StringsKt.Z2(p0);
          if (i <= i1) {
             d = Math.min(d, p1.invoke(Character.valueOf(p0.charAt(i))).doubleValue());
             while (i != i1) {
                i = i + 1;
             }
          }
          return d;
       }else {
          throw new NoSuchElementException();
       }
    }
    public static final int y8(CharSequence p0,l p1){
       int i = 0;
       int i1 = x0.h(i);
       for (; i < p0.length(); i = i + 1) {
          i1 = i1 + p1.invoke(Character.valueOf(p0.charAt(i))).J0();
          i1 = x0.h(i1);
       }
       return i1;
    }
    public static final char z6(CharSequence p0,l p1){
       char c;
       a.p(p0, "$this$first");
       a.p(p1, "predicate");
       int i = 0;
       while (true) {
          if (i >= p0.length()) {
             throw new NoSuchElementException("Char sequence contains no character matching the predicate.");
          }
          c = p0.charAt(i);
          if (p1.invoke(Character.valueOf(c)).booleanValue()) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return c;
    }
    public static final float z7(CharSequence p0,l p1){
       int i = 0;
       int i1 = 1;
       char c = (!p0.length())? 1: 0;
       if (!c) {
          float f = p1.invoke(Character.valueOf(p0.charAt(i))).floatValue();
          i = StringsKt__StringsKt.Z2(p0);
          if (i1 <= i) {
             f = Math.min(f, p1.invoke(Character.valueOf(p0.charAt(i1))).floatValue());
             while (i1 != i) {
                i1 = i1 + 1;
             }
          }
          return f;
       }else {
          throw new NoSuchElementException();
       }
    }
    public static final long z8(CharSequence p0,l p1){
       int i = 0;
       long l = b1.h((long)i);
       for (; i < p0.length(); i = i + 1) {
          l = l + p1.invoke(Character.valueOf(p0.charAt(i))).J0();
          l = b1.h(l);
       }
       return l;
    }
}
