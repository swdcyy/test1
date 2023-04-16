package kotlin.collections.CollectionsKt__CollectionsKt;
import trd.t;
import java.util.List;
import java.lang.Comparable;
import msd.l;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import kotlin.collections.CollectionsKt__CollectionsKt$binarySearchBy$1;
import java.util.Collection;
import kotlin.collections.EmptyList;
import usd.k;
import msd.a;
import trd.n;
import kotlin.collections.ArraysKt___ArraysKt;
import java.util.ArrayList;
import trd.i;
import java.lang.IndexOutOfBoundsException;
import java.lang.StringBuilder;
import java.lang.IllegalArgumentException;
import java.lang.Iterable;
import ssd.e;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.lang.ArithmeticException;
import java.lang.Integer;
import java.lang.Number;
import xrd.b;
import java.util.Comparator;

public class CollectionsKt__CollectionsKt extends t	// class@001c67
{

    public void CollectionsKt__CollectionsKt(){
       super();
    }
    public static int A(List p0,Comparable p1,int p2,int p3,l p4,int p5,Object p6){
       if (p5 & 0x02) {
          p2 = 0;
       }
       if (p5 & 0x04) {
          p3 = p0.size();
       }
       a.p(p0, "$this$binarySearchBy");
       a.p(p4, "selector");
       return CollectionsKt__CollectionsKt.t(p0, p2, p3, new CollectionsKt__CollectionsKt$binarySearchBy$1(p4, p1));
    }
    public static final List B(int p0,l p1){
       List list = t.j(p0);
       p1.invoke(list);
       return t.a(list);
    }
    public static final List C(l p0){
       List list = t.i();
       p0.invoke(list);
       return t.a(list);
    }
    public static final boolean D(Collection p0,Collection p1){
       return p0.containsAll(p1);
    }
    public static final List E(){
       return EmptyList.INSTANCE;
    }
    public static final k F(Collection p0){
       a.p(p0, "$this$indices");
       return new k(0, (p0.size() - 1));
    }
    public static final int G(List p0){
       a.p(p0, "$this$lastIndex");
       return (p0.size() - 1);
    }
    public static final Object H(Collection p0,a p1){
       if (p0.isEmpty()) {
          p0 = p1.invoke();
       }
       return p0;
    }
    public static final boolean I(Collection p0){
       return (p0.isEmpty() ^ 0x01);
    }
    public static final boolean J(Collection p0){
       boolean b = (p0 == null || p0.isEmpty())? true: false;
       return b;
    }
    public static final List K(){
       return CollectionsKt__CollectionsKt.E();
    }
    public static final List L(Object[] p0){
       a.p(p0, "elements");
       List list = (p0.length > 0)? n.t(p0): CollectionsKt__CollectionsKt.E();
       return list;
    }
    public static final List M(Object p0){
       p0 = (p0 != null)? t.k(p0): CollectionsKt__CollectionsKt.E();
       return p0;
    }
    public static final List N(Object[] p0){
       a.p(p0, "elements");
       return ArraysKt___ArraysKt.qa(p0);
    }
    public static final List O(){
       return new ArrayList();
    }
    public static final List P(Object[] p0){
       a.p(p0, "elements");
       ArrayList uArrayList = (!p0.length)? new ArrayList(): new ArrayList(new i(p0, true));
       return uArrayList;
    }
    public static final List Q(List p0){
       a.p(p0, "$this$optimizeReadOnlyList");
       int i = p0.size();
       if (i) {
          if (i == 1) {
             p0 = t.k(p0.get(0));
          }
       }else {
          p0 = CollectionsKt__CollectionsKt.E();
       }
       return p0;
    }
    public static final Collection R(Collection p0){
       if (p0 != null) {
       }else {
          List list = CollectionsKt__CollectionsKt.E();
       }
       return p0;
    }
    public static final List S(List p0){
       if (p0 != null) {
       }else {
          p0 = CollectionsKt__CollectionsKt.E();
       }
       return p0;
    }
    public static final void T(int p0,int p1,int p2){
       String str = "fromIndex \(";
       if (p1 > p2) {
          throw new IllegalArgumentException(str+p1+"\) is greater than toIndex \("+p2+"\).");
       }
       if (p1 < 0) {
          throw new IndexOutOfBoundsException(str+p1+"\) is less than zero.");
       }
       if (p2 <= p0) {
          return;
       }
       throw new IndexOutOfBoundsException("toIndex \("+p2+"\) is greater than size \("+p0+"\).");
    }
    public static final List U(Iterable p0,e p1){
       a.p(p0, "$this$shuffled");
       a.p(p1, "random");
       List list = CollectionsKt___CollectionsKt.I5(p0);
       CollectionsKt___CollectionsKt.P4(list, p1);
       return list;
    }
    public static final void V(){
       throw new ArithmeticException("Count overflow has happened.");
    }
    public static final void W(){
       throw new ArithmeticException("Index overflow has happened.");
    }
    public static final List o(int p0,l p1){
       ArrayList uArrayList = new ArrayList(p0);
       for (int i = 0; i < p0; i = i + 1) {
          uArrayList.add(p1.invoke(Integer.valueOf(i)));
       }
       return uArrayList;
    }
    public static final List p(int p0,l p1){
       ArrayList uArrayList = new ArrayList(p0);
       for (int i = 0; i < p0; i = i + 1) {
          uArrayList.add(p1.invoke(Integer.valueOf(i)));
       }
       return uArrayList;
    }
    public static final ArrayList q(){
       return new ArrayList();
    }
    public static final ArrayList r(Object[] p0){
       a.p(p0, "elements");
       ArrayList uArrayList = (!p0.length)? new ArrayList(): new ArrayList(new i(p0, true));
       return uArrayList;
    }
    public static final Collection s(Object[] p0){
       a.p(p0, "$this$asCollection");
       return new i(p0, false);
    }
    public static final int t(List p0,int p1,int p2,l p3){
       int i;
       a.p(p0, "$this$binarySearch");
       a.p(p3, "comparison");
       CollectionsKt__CollectionsKt.T(p0.size(), p1, p2);
       p2--;
       while (true) {
          if (p1 <= p2) {
             i = p1 + p2;
             i = i >> 1;
             int i1 = p3.invoke(p0.get(i)).intValue();
             if (i1 < 0) {
                i = i + 1;
                p1 = i;
             }else if(i1 > 0){
                i = i - 1;
                p2 = i;
             }else {
                break ;
             }
          }else {
             p1++;
             return (- p1);
          }
       }
       return i;
    }
    public static final int u(List p0,Comparable p1,int p2,int p3){
       int i;
       a.p(p0, "$this$binarySearch");
       CollectionsKt__CollectionsKt.T(p0.size(), p2, p3);
       p3--;
       while (true) {
          if (p2 <= p3) {
             i = p2 + p3;
             i = i >> 1;
             int i1 = b.f(p0.get(i), p1);
             if (i1 < 0) {
                i = i + 1;
                p2 = i;
             }else if(i1 > 0){
                i = i - 1;
                p3 = i;
             }else {
                break ;
             }
          }else {
             p2++;
             return (- p2);
          }
       }
       return i;
    }
    public static final int v(List p0,Object p1,Comparator p2,int p3,int p4){
       int i;
       a.p(p0, "$this$binarySearch");
       a.p(p2, "comparator");
       CollectionsKt__CollectionsKt.T(p0.size(), p3, p4);
       p4--;
       while (true) {
          if (p3 <= p4) {
             i = p3 + p4;
             i = i >> 1;
             int i1 = p2.compare(p0.get(i), p1);
             if (i1 < 0) {
                i = i + 1;
                p3 = i;
             }else if(i1 > 0){
                i = i - 1;
                p4 = i;
             }else {
                break ;
             }
          }else {
             p3++;
             return (- p3);
          }
       }
       return i;
    }
    public static int w(List p0,int p1,int p2,l p3,int p4,Object p5){
       if (p4 & 0x01) {
          p1 = 0;
       }
       if (p4 & 0x02) {
          p2 = p0.size();
       }
       return CollectionsKt__CollectionsKt.t(p0, p1, p2, p3);
    }
    public static int x(List p0,Comparable p1,int p2,int p3,int p4,Object p5){
       if (p4 & 0x02) {
          p2 = 0;
       }
       if (p4 & 0x04) {
          p3 = p0.size();
       }
       return CollectionsKt__CollectionsKt.u(p0, p1, p2, p3);
    }
    public static int y(List p0,Object p1,Comparator p2,int p3,int p4,int p5,Object p6){
       if (p5 & 0x04) {
          p3 = 0;
       }
       if (p5 & 0x08) {
          p4 = p0.size();
       }
       return CollectionsKt__CollectionsKt.v(p0, p1, p2, p3, p4);
    }
    public static final int z(List p0,Comparable p1,int p2,int p3,l p4){
       a.p(p0, "$this$binarySearchBy");
       a.p(p4, "selector");
       return CollectionsKt__CollectionsKt.t(p0, p2, p3, new CollectionsKt__CollectionsKt$binarySearchBy$1(p4, p1));
    }
}
