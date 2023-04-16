package trd.d1;
import trd.c1;
import msd.l;
import java.util.Set;
import java.lang.Object;
import kotlin.collections.EmptySet;
import java.util.HashSet;
import java.lang.String;
import kotlin.jvm.internal.a;
import trd.s0;
import java.util.Collection;
import kotlin.collections.ArraysKt___ArraysKt;
import java.util.LinkedHashSet;
import java.util.Iterator;

public class d1 extends c1	// class@00256c
{

    public void d1(){
       super();
    }
    public static final Set i(int p0,l p1){
       Set set = c1.e(p0);
       p1.invoke(set);
       return c1.a(set);
    }
    public static final Set j(l p0){
       Set set = c1.d();
       p0.invoke(set);
       return c1.a(set);
    }
    public static final Set k(){
       return EmptySet.INSTANCE;
    }
    public static final HashSet l(){
       return new HashSet();
    }
    public static final HashSet m(Object[] p0){
       a.p(p0, "elements");
       return ArraysKt___ArraysKt.Zx(p0, new HashSet(s0.j(p0.length)));
    }
    public static final LinkedHashSet n(){
       return new LinkedHashSet();
    }
    public static final LinkedHashSet o(Object[] p0){
       a.p(p0, "elements");
       return ArraysKt___ArraysKt.Zx(p0, new LinkedHashSet(s0.j(p0.length)));
    }
    public static final Set p(){
       return new LinkedHashSet();
    }
    public static final Set q(Object[] p0){
       a.p(p0, "elements");
       return ArraysKt___ArraysKt.Zx(p0, new LinkedHashSet(s0.j(p0.length)));
    }
    public static final Set r(Set p0){
       a.p(p0, "$this$optimizeReadOnlySet");
       int i = p0.size();
       if (i) {
          if (i == 1) {
             p0 = c1.f(p0.iterator().next());
          }
       }else {
          p0 = d1.k();
       }
       return p0;
    }
    public static final Set s(Set p0){
       if (p0 != null) {
       }else {
          p0 = d1.k();
       }
       return p0;
    }
    public static final Set t(){
       return d1.k();
    }
    public static final Set u(Object[] p0){
       a.p(p0, "elements");
       Set set = (p0.length > 0)? ArraysKt___ArraysKt.Wy(p0): d1.k();
       return set;
    }
    public static final Set v(Object p0){
       p0 = (p0 != null)? c1.f(p0): d1.k();
       return p0;
    }
    public static final Set w(Object[] p0){
       a.p(p0, "elements");
       return ArraysKt___ArraysKt.ra(p0, new LinkedHashSet());
    }
}
