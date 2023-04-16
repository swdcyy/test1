package trd.m;
import trd.l;
import java.lang.Object;
import java.util.Arrays;
import qrd.u0;
import kotlin.collections.unsigned.UArraysKt___UArraysKt;
import qrd.i1;
import qrd.y0;
import qrd.c1;
import kotlin.jvm.internal.a;
import java.lang.String;
import usd.q;
import java.lang.StringBuilder;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.util.Collection;
import trd.y;
import msd.a;
import kotlin.Pair;
import qrd.r0;

public class m extends l	// class@002574
{

    public void m(){
       super();
    }
    public static final boolean g(Object[] p0,Object[] p1){
       int i1;
       if (p0 == p1) {
          return true;
       }
       if (p0 != null && (p1 == null || p0.length != p1.length)) {
          return false;
       }
       int len = p0.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return true;
          }
          object oobject = p0[i];
          object oobject1 = p1[i];
          if (oobject != oobject1) {
             if (oobject == null || oobject1 == null) {
                break ;
             }else if(oobject instanceof Object[] && oobject1 instanceof Object[]){
                if (!m.g(oobject, oobject1)) {
                   return false;
                }
             }else if(oobject instanceof byte[] && oobject1 instanceof byte[]){
                if (!Arrays.equals(oobject, oobject1)) {
                   return false;
                }
             }else if(oobject instanceof short[] && oobject1 instanceof short[]){
                if (!Arrays.equals(oobject, oobject1)) {
                   return false;
                }
             }else if(oobject instanceof int[] && oobject1 instanceof int[]){
                if (!Arrays.equals(oobject, oobject1)) {
                   return false;
                }
             }else if(oobject instanceof long[] && oobject1 instanceof long[]){
                if (!Arrays.equals(oobject, oobject1)) {
                   return false;
                }
             }else if(oobject instanceof float[] && oobject1 instanceof float[]){
                if (!Arrays.equals(oobject, oobject1)) {
                   return false;
                }
             }else if(oobject instanceof double[] && oobject1 instanceof double[]){
                if (!Arrays.equals(oobject, oobject1)) {
                   return false;
                }
             }else if(oobject instanceof char[] && oobject1 instanceof char[]){
                if (!Arrays.equals(oobject, oobject1)) {
                   return false;
                }
             }else if(oobject instanceof boolean[] && oobject1 instanceof boolean[]){
                if (!Arrays.equals(oobject, oobject1)) {
                   return false;
                }
             }else if(oobject instanceof u0 && oobject1 instanceof u0){
                if (!UArraysKt___UArraysKt.x0(oobject.a0(), oobject1.a0())) {
                   return false;
                }
             }else if(oobject instanceof i1 && oobject1 instanceof i1){
                if (!UArraysKt___UArraysKt.u0(oobject.a0(), oobject1.a0())) {
                   return false;
                }
             }else if(oobject instanceof y0 && oobject1 instanceof y0){
                if (!UArraysKt___UArraysKt.v0(oobject.a0(), oobject1.a0())) {
                   return false;
                }
             }else if(oobject instanceof c1 && oobject1 instanceof c1){
                if (!UArraysKt___UArraysKt.z0(oobject.a0(), oobject1.a0())) {
                   return false;
                }
             }else {
                i1 = a.g(oobject, oobject1) ^ true;
                if (i1) {
                   return false;
                }
             }
          }
          i = i + 1;
       }
       return false;
    }
    public static final String h(Object[] p0){
       if (p0 == null) {
          return "null";
       }
       StringBuilder str = new StringBuilder(((q.u(p0.length, 0x19999999) * 5) + 2));
       m.i(p0, str, new ArrayList());
       String str1 = str;
       a.o(str1, "StringBuilder\(capacity\).¡­builderAction\).toString\(\)");
       return str1;
    }
    public static final void i(Object[] p0,StringBuilder p1,List p2){
       String str;
       if (p2.contains(p0)) {
          p1+"[...]";
          return;
       }else {
          p2.add(p0);
          p1 = p1+'[';
          int i = 0;
          int len = p0.length;
          while (i < len) {
             if (i) {
                p1 = p1+", ";
             }
             object oobject = p0[i];
             if (oobject == null) {
                p1 = p1+"null";
             }else if(oobject instanceof Object[]){
                m.i(oobject, p1, p2);
             }else if(oobject instanceof byte[]){
                str = Arrays.toString(oobject);
                a.o(str, "java.util.Arrays.toString\(this\)");
                p1 = p1+str;
             }else if(oobject instanceof short[]){
                str = Arrays.toString(oobject);
                a.o(str, "java.util.Arrays.toString\(this\)");
                p1 = p1+str;
             }else if(oobject instanceof int[]){
                str = Arrays.toString(oobject);
                a.o(str, "java.util.Arrays.toString\(this\)");
                p1 = p1+str;
             }else if(oobject instanceof long[]){
                str = Arrays.toString(oobject);
                a.o(str, "java.util.Arrays.toString\(this\)");
                p1 = p1+str;
             }else if(oobject instanceof float[]){
                str = Arrays.toString(oobject);
                a.o(str, "java.util.Arrays.toString\(this\)");
                p1 = p1+str;
             }else if(oobject instanceof double[]){
                str = Arrays.toString(oobject);
                a.o(str, "java.util.Arrays.toString\(this\)");
                p1 = p1+str;
             }else if(oobject instanceof char[]){
                str = Arrays.toString(oobject);
                a.o(str, "java.util.Arrays.toString\(this\)");
                p1 = p1+str;
             }else if(oobject instanceof boolean[]){
                str = Arrays.toString(oobject);
                a.o(str, "java.util.Arrays.toString\(this\)");
                p1 = p1+str;
             }else if(oobject instanceof u0){
                p1 = p1+UArraysKt___UArraysKt.L0(oobject.a0());
             }else if(oobject instanceof i1){
                p1 = p1+UArraysKt___UArraysKt.P0(oobject.a0());
             }else if(oobject instanceof y0){
                p1 = p1+UArraysKt___UArraysKt.O0(oobject.a0());
             }else if(oobject instanceof c1){
                p1 = p1+UArraysKt___UArraysKt.R0(oobject.a0());
             }else {
                p1 = p1+oobject.toString();
             }
             i = i + 1;
          }
          p1+']';
          p2.remove(CollectionsKt__CollectionsKt.G(p2));
          return;
       }
    }
    public static final List j(Object[][] p0){
       a.p(p0, "$this$flatten");
       int len = p0.length;
       int i = 0;
       int i2 = 0;
       for (int i1 = 0; i1 < len; i1 = i1 + 1) {
          i2 = i2 + p0[i1].length;
       }
       ArrayList uArrayList = new ArrayList(i2);
       i1 = p0.length;
       for (; i < i1; i = i + 1) {
          y.s0(uArrayList, p0[i]);
       }
       return uArrayList;
    }
    public static final Object k(Object[] p0,a p1){
       int i = (!p0.length)? 1: 0;
       if (i) {
          p0 = p1.invoke();
       }
       return p0;
    }
    public static final boolean l(Object[] p0){
       boolean b = false;
       if (p0 != null) {
          int i = (!p0.length)? 1: 0;
          if (!i) {
          label_000d :
             return b;
          }
       }
       b = true;
       goto label_000d ;
    }
    public static final Pair m(Pair[] p0){
       a.p(p0, "$this$unzip");
       ArrayList uArrayList = new ArrayList(p0.length);
       ArrayList uArrayList1 = new ArrayList(p0.length);
       int len = p0.length;
       for (int i = 0; i < len; i = i + 1) {
          object oobject = p0[i];
          uArrayList.add(oobject.getFirst());
          uArrayList1.add(oobject.getSecond());
       }
       return r0.a(uArrayList, uArrayList1);
    }
}
