package nsd.s0;
import java.lang.Object;
import nsd.b0;
import msd.a;
import msd.l;
import msd.p;
import msd.q;
import msd.r;
import msd.s;
import msd.t;
import msd.u;
import msd.v;
import msd.w;
import msd.b;
import msd.c;
import msd.d;
import msd.e;
import msd.f;
import msd.g;
import msd.h;
import msd.i;
import msd.j;
import msd.k;
import msd.m;
import msd.n;
import msd.o;
import qrd.l;
import java.util.Collection;
import osd.a;
import osd.b;
import java.lang.Iterable;
import osd.c;
import java.util.Iterator;
import osd.d;
import java.util.List;
import osd.e;
import java.util.ListIterator;
import osd.f;
import java.util.Map;
import osd.g;
import java.util.Map$Entry;
import osd.g$a;
import java.util.Set;
import osd.h;
import java.lang.Throwable;
import java.lang.String;
import java.lang.Class;
import kotlin.jvm.internal.a;
import java.lang.ClassCastException;
import java.lang.StringBuilder;

public class s0	// class@001f76
{

    public void s0(){
       super();
    }
    public static int A(Object p0){
       if (p0 instanceof b0) {
          return p0.getArity();
       }
       if (p0 instanceof a) {
          return 0;
       }
       if (p0 instanceof l) {
          return 1;
       }
       if (p0 instanceof p) {
          return 2;
       }
       if (p0 instanceof q) {
          return 3;
       }
       if (p0 instanceof r) {
          return 4;
       }
       if (p0 instanceof s) {
          return 5;
       }
       if (p0 instanceof t) {
          return 6;
       }
       if (p0 instanceof u) {
          return 7;
       }
       if (p0 instanceof v) {
          return 8;
       }
       if (p0 instanceof w) {
          return 9;
       }
       if (p0 instanceof b) {
          return 10;
       }
       if (p0 instanceof c) {
          return 11;
       }
       if (p0 instanceof d) {
          return 12;
       }
       if (p0 instanceof e) {
          return 13;
       }
       if (p0 instanceof f) {
          return 14;
       }
       if (p0 instanceof g) {
          return 15;
       }
       if (p0 instanceof h) {
          return 16;
       }
       if (p0 instanceof i) {
          return 17;
       }
       if (p0 instanceof j) {
          return 18;
       }
       if (p0 instanceof k) {
          return 19;
       }
       if (p0 instanceof m) {
          return 20;
       }
       if (p0 instanceof n) {
          return 21;
       }
       if (p0 instanceof o) {
          return 22;
       }
       return -1;
    }
    public static boolean B(Object p0,int p1){
       boolean b = (p0 instanceof l && s0.A(p0) == p1)? true: false;
       return b;
    }
    public static boolean C(Object p0){
       boolean b = (p0 instanceof Collection && (!p0 instanceof a || p0 instanceof b))? true: false;
       return b;
    }
    public static boolean D(Object p0){
       boolean b = (p0 instanceof Iterable && (!p0 instanceof a || p0 instanceof c))? true: false;
       return b;
    }
    public static boolean E(Object p0){
       boolean b = (p0 instanceof Iterator && (!p0 instanceof a || p0 instanceof d))? true: false;
       return b;
    }
    public static boolean F(Object p0){
       boolean b = (p0 instanceof List && (!p0 instanceof a || p0 instanceof e))? true: false;
       return b;
    }
    public static boolean G(Object p0){
       boolean b = (p0 instanceof ListIterator && (!p0 instanceof a || p0 instanceof f))? true: false;
       return b;
    }
    public static boolean H(Object p0){
       boolean b = (p0 instanceof Map && (!p0 instanceof a || p0 instanceof g))? true: false;
       return b;
    }
    public static boolean I(Object p0){
       boolean b = (p0 instanceof Map$Entry && (!p0 instanceof a || p0 instanceof g$a))? true: false;
       return b;
    }
    public static boolean J(Object p0){
       boolean b = (p0 instanceof Set && (!p0 instanceof a || p0 instanceof h))? true: false;
       return b;
    }
    public static Throwable K(Throwable p0){
       return a.B(p0, s0.class.getName());
    }
    public static ClassCastException L(ClassCastException p0){
       throw s0.K(p0);
    }
    public static void M(Object p0,String p1){
       p0 = (p0 == null)? "null": p0.getClass().getName();
       s0.N(p0+" cannot be cast to "+p1);
       return;
    }
    public static void N(String p0){
       throw s0.L(new ClassCastException(p0));
    }
    public static Collection a(Object p0){
       if (p0 instanceof a && !p0 instanceof b) {
          s0.M(p0, "kotlin.collections.MutableCollection");
       }
       return s0.s(p0);
    }
    public static Collection b(Object p0,String p1){
       if (p0 instanceof a && !p0 instanceof b) {
          s0.N(p1);
       }
       return s0.s(p0);
    }
    public static Iterable c(Object p0){
       if (p0 instanceof a && !p0 instanceof c) {
          s0.M(p0, "kotlin.collections.MutableIterable");
       }
       return s0.t(p0);
    }
    public static Iterable d(Object p0,String p1){
       if (p0 instanceof a && !p0 instanceof c) {
          s0.N(p1);
       }
       return s0.t(p0);
    }
    public static Iterator e(Object p0){
       if (p0 instanceof a && !p0 instanceof d) {
          s0.M(p0, "kotlin.collections.MutableIterator");
       }
       return s0.u(p0);
    }
    public static Iterator f(Object p0,String p1){
       if (p0 instanceof a && !p0 instanceof d) {
          s0.N(p1);
       }
       return s0.u(p0);
    }
    public static List g(Object p0){
       if (p0 instanceof a && !p0 instanceof e) {
          s0.M(p0, "kotlin.collections.MutableList");
       }
       return s0.v(p0);
    }
    public static List h(Object p0,String p1){
       if (p0 instanceof a && !p0 instanceof e) {
          s0.N(p1);
       }
       return s0.v(p0);
    }
    public static ListIterator i(Object p0){
       if (p0 instanceof a && !p0 instanceof f) {
          s0.M(p0, "kotlin.collections.MutableListIterator");
       }
       return s0.w(p0);
    }
    public static ListIterator j(Object p0,String p1){
       if (p0 instanceof a && !p0 instanceof f) {
          s0.N(p1);
       }
       return s0.w(p0);
    }
    public static Map k(Object p0){
       if (p0 instanceof a && !p0 instanceof g) {
          s0.M(p0, "kotlin.collections.MutableMap");
       }
       return s0.x(p0);
    }
    public static Map l(Object p0,String p1){
       if (p0 instanceof a && !p0 instanceof g) {
          s0.N(p1);
       }
       return s0.x(p0);
    }
    public static Map$Entry m(Object p0){
       if (p0 instanceof a && !p0 instanceof g$a) {
          s0.M(p0, "kotlin.collections.MutableMap.MutableEntry");
       }
       return s0.y(p0);
    }
    public static Map$Entry n(Object p0,String p1){
       if (p0 instanceof a && !p0 instanceof g$a) {
          s0.N(p1);
       }
       return s0.y(p0);
    }
    public static Set o(Object p0){
       if (p0 instanceof a && !p0 instanceof h) {
          s0.M(p0, "kotlin.collections.MutableSet");
       }
       return s0.z(p0);
    }
    public static Set p(Object p0,String p1){
       if (p0 instanceof a && !p0 instanceof h) {
          s0.N(p1);
       }
       return s0.z(p0);
    }
    public static Object q(Object p0,int p1){
       if (p0 != null && !s0.B(p0, p1)) {
          s0.M(p0, "kotlin.jvm.functions.Function"+p1);
       }
       return p0;
    }
    public static Object r(Object p0,int p1,String p2){
       if (p0 != null && !s0.B(p0, p1)) {
          s0.N(p2);
       }
       return p0;
    }
    public static Collection s(Object p0){
       try{
          return p0;
       }catch(java.lang.ClassCastException e0){
          throw s0.L(e0);
       }
    }
    public static Iterable t(Object p0){
       try{
          return p0;
       }catch(java.lang.ClassCastException e0){
          throw s0.L(e0);
       }
    }
    public static Iterator u(Object p0){
       try{
          return p0;
       }catch(java.lang.ClassCastException e0){
          throw s0.L(e0);
       }
    }
    public static List v(Object p0){
       try{
          return p0;
       }catch(java.lang.ClassCastException e0){
          throw s0.L(e0);
       }
    }
    public static ListIterator w(Object p0){
       try{
          return p0;
       }catch(java.lang.ClassCastException e0){
          throw s0.L(e0);
       }
    }
    public static Map x(Object p0){
       try{
          return p0;
       }catch(java.lang.ClassCastException e0){
          throw s0.L(e0);
       }
    }
    public static Map$Entry y(Object p0){
       try{
          return p0;
       }catch(java.lang.ClassCastException e0){
          throw s0.L(e0);
       }
    }
    public static Set z(Object p0){
       try{
          return p0;
       }catch(java.lang.ClassCastException e0){
          throw s0.L(e0);
       }
    }
}
