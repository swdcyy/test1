package trd.y;
import trd.x;
import java.util.Collection;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import wsd.m;
import java.util.List;
import java.util.Objects;
import nsd.s0;
import java.lang.Iterable;
import msd.l;
import trd.u;
import java.util.HashSet;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.collections.ArraysKt___ArraysKt;
import java.util.NoSuchElementException;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.util.Iterator;
import trd.n;
import java.lang.Boolean;
import java.util.RandomAccess;

public class y extends x	// class@002591
{

    public void y(){
       super();
    }
    public static final void A0(Collection p0,Object p1){
       a.p(p0, "$this$plusAssign");
       p0.add(p1);
    }
    public static final void B0(Collection p0,m p1){
       a.p(p0, "$this$plusAssign");
       y.r0(p0, p1);
    }
    public static final void C0(Collection p0,Object[] p1){
       a.p(p0, "$this$plusAssign");
       y.s0(p0, p1);
    }
    public static final Object D0(List p0,int p1){
       return p0.remove(p1);
    }
    public static final boolean E0(Collection p0,Object p1){
       Objects.requireNonNull(p0, "null cannot be cast to non-null type kotlin.collections.MutableCollection<T>");
       return s0.a(p0).remove(p1);
    }
    public static final boolean F0(Iterable p0,l p1){
       a.p(p0, "$this$removeAll");
       a.p(p1, "predicate");
       return y.t0(p0, p1, true);
    }
    public static final boolean G0(Collection p0,Iterable p1){
       a.p(p0, "$this$removeAll");
       a.p(p1, "elements");
       return s0.a(p0).removeAll(u.b0(p1, p0));
    }
    public static final boolean H0(Collection p0,Collection p1){
       Objects.requireNonNull(p0, "null cannot be cast to non-null type kotlin.collections.MutableCollection<T>");
       return s0.a(p0).removeAll(p1);
    }
    public static final boolean I0(Collection p0,m p1){
       a.p(p0, "$this$removeAll");
       a.p(p1, "elements");
       HashSet hashSet = SequencesKt___SequencesKt.U2(p1);
       int i = 1;
       if (!(hashSet.isEmpty() ^ i) || !p0.removeAll(hashSet)) {
          i = false;
       }
       return i;
    }
    public static final boolean J0(Collection p0,Object[] p1){
       a.p(p0, "$this$removeAll");
       a.p(p1, "elements");
       boolean b = false;
       int i = (!p1.length)? 1: 0;
       if ((i ^ 1) && p0.removeAll(ArraysKt___ArraysKt.ky(p1))) {
          b = true;
       }
       return b;
    }
    public static final boolean K0(List p0,l p1){
       a.p(p0, "$this$removeAll");
       a.p(p1, "predicate");
       return y.u0(p0, p1, true);
    }
    public static final Object L0(List p0){
       a.p(p0, "$this$removeFirst");
       if (!p0.isEmpty()) {
          return p0.remove(0);
       }
       throw new NoSuchElementException("List is empty.");
    }
    public static final Object M0(List p0){
       a.p(p0, "$this$removeFirstOrNull");
       p0 = (p0.isEmpty())? null: p0.remove(0);
       return p0;
    }
    public static final Object N0(List p0){
       a.p(p0, "$this$removeLast");
       if (!p0.isEmpty()) {
          return p0.remove(CollectionsKt__CollectionsKt.G(p0));
       }
       throw new NoSuchElementException("List is empty.");
    }
    public static final Object O0(List p0){
       a.p(p0, "$this$removeLastOrNull");
       p0 = (p0.isEmpty())? null: p0.remove(CollectionsKt__CollectionsKt.G(p0));
       return p0;
    }
    public static final boolean P0(Iterable p0,l p1){
       a.p(p0, "$this$retainAll");
       a.p(p1, "predicate");
       return y.t0(p0, p1, false);
    }
    public static final boolean Q0(Collection p0,Iterable p1){
       a.p(p0, "$this$retainAll");
       a.p(p1, "elements");
       return s0.a(p0).retainAll(u.b0(p1, p0));
    }
    public static final boolean R0(Collection p0,Collection p1){
       Objects.requireNonNull(p0, "null cannot be cast to non-null type kotlin.collections.MutableCollection<T>");
       return s0.a(p0).retainAll(p1);
    }
    public static final boolean S0(Collection p0,m p1){
       a.p(p0, "$this$retainAll");
       a.p(p1, "elements");
       HashSet hashSet = SequencesKt___SequencesKt.U2(p1);
       if (hashSet.isEmpty() ^ 0x01) {
          return p0.retainAll(hashSet);
       }
       return y.V0(p0);
    }
    public static final boolean T0(Collection p0,Object[] p1){
       a.p(p0, "$this$retainAll");
       a.p(p1, "elements");
       int i = (!p1.length)? 1: 0;
       if (i ^ 1) {
          return p0.retainAll(ArraysKt___ArraysKt.ky(p1));
       }else {
          return y.V0(p0);
       }
    }
    public static final boolean U0(List p0,l p1){
       a.p(p0, "$this$retainAll");
       a.p(p1, "predicate");
       return y.u0(p0, p1, false);
    }
    public static final boolean V0(Collection p0){
       p0.clear();
       return (p0.isEmpty() ^ 0x01);
    }
    public static final boolean q0(Collection p0,Iterable p1){
       a.p(p0, "$this$addAll");
       a.p(p1, "elements");
       if (p1 instanceof Collection) {
          return p0.addAll(p1);
       }
       boolean b = false;
       Iterator iterator = p1.iterator();
       while (iterator.hasNext()) {
          if (p0.add(iterator.next())) {
             b = true;
          }
       }
       return b;
    }
    public static final boolean r0(Collection p0,m p1){
       a.p(p0, "$this$addAll");
       a.p(p1, "elements");
       Iterator iterator = p1.iterator();
       boolean b = false;
       while (iterator.hasNext()) {
          if (p0.add(iterator.next())) {
             b = true;
          }
       }
       return b;
    }
    public static final boolean s0(Collection p0,Object[] p1){
       a.p(p0, "$this$addAll");
       a.p(p1, "elements");
       return p0.addAll(n.t(p1));
    }
    public static final boolean t0(Iterable p0,l p1,boolean p2){
       Iterator iterator = p0.iterator();
       boolean b = false;
       while (iterator.hasNext()) {
          if (p1.invoke(iterator.next()).booleanValue() == p2) {
             iterator.remove();
             b = true;
          }
       }
       return b;
    }
    public static final boolean u0(List p0,l p1,boolean p2){
       int i2;
       if (!p0 instanceof RandomAccess) {
          Objects.requireNonNull(p0, "null cannot be cast to non-null type kotlin.collections.MutableIterable<T>");
          return y.t0(s0.c(p0), p1, p2);
       }else {
          int i = CollectionsKt__CollectionsKt.G(p0);
          if (i >= 0) {
             int i1 = 0;
             i2 = 0;
             while (true) {
                Object obj = p0.get(i1);
                if (p1.invoke(obj).booleanValue() == p2) {
                label_0033 :
                   if (i1 != i) {
                      i1 = i1 + 1;
                   }
                }else if(i2 != i1){
                   p0.set(i2, obj);
                }
                i2 = i2 + 1;
                goto label_0033 ;
             }
          }else {
             i2 = 0;
          }
          if (i2 < p0.size()) {
             int i3 = CollectionsKt__CollectionsKt.G(p0);
             if (i3 >= i2) {
                p0.remove(i3);
                while (i3 != i2) {
                   i3--;
                }
             }
             return true;
          }else {
             return false;
          }
       }
    }
    public static final void v0(Collection p0,Iterable p1){
       a.p(p0, "$this$minusAssign");
       y.G0(p0, p1);
    }
    public static final void w0(Collection p0,Object p1){
       a.p(p0, "$this$minusAssign");
       p0.remove(p1);
    }
    public static final void x0(Collection p0,m p1){
       a.p(p0, "$this$minusAssign");
       y.I0(p0, p1);
    }
    public static final void y0(Collection p0,Object[] p1){
       a.p(p0, "$this$minusAssign");
       y.J0(p0, p1);
    }
    public static final void z0(Collection p0,Iterable p1){
       a.p(p0, "$this$plusAssign");
       y.q0(p0, p1);
    }
}
