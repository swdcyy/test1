package kotlin.text.StringsKt__IndentKt;
import zsd.n;
import java.lang.String;
import msd.l;
import java.lang.CharSequence;
import kotlin.text.StringsKt__IndentKt$getIndentFunction$1;
import kotlin.text.StringsKt__IndentKt$getIndentFunction$2;
import zsd.b;
import java.lang.Object;
import kotlin.jvm.internal.a;
import wsd.m;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.StringsKt__IndentKt$prependIndent$1;
import kotlin.sequences.SequencesKt___SequencesKt;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import fsd.l;
import java.lang.ArithmeticException;
import zsd.u;
import java.util.Collection;
import java.lang.StringBuilder;
import java.lang.Appendable;
import kotlin.collections.CollectionsKt___CollectionsKt;
import trd.u;
import java.lang.Integer;
import java.lang.Comparable;
import kotlin.text.StringsKt___StringsKt;
import java.util.Objects;
import java.lang.IllegalArgumentException;

public class StringsKt__IndentKt extends n	// class@001cc4
{

    public void StringsKt__IndentKt(){
       super();
    }
    public static final l g(String p0){
       StringsKt__IndentKt$getIndentFunction$2 ogetIndentFu = (!p0.length())? 1: null;
       StringsKt__IndentKt$getIndentFunction$1 iNSTANCE = (ogetIndentFu)? StringsKt__IndentKt$getIndentFunction$1.INSTANCE: new StringsKt__IndentKt$getIndentFunction$2(p0);
       return iNSTANCE;
    }
    public static final int h(String p0){
       int i = p0.length();
       int i1 = 0;
       while (true) {
          if (i1 < i) {
             int i2 = b.r(p0.charAt(i1)) ^ 0x01;
             if (i2) {
             label_0019 :
                if (i1 == -1) {
                   i1 = p0.length();
                   break ;
                }
                break ;
             }else {
                i1 = i1 + 1;
             }
          }else {
             i1 = -1;
             goto label_0019 ;
          }
       }
       return i1;
    }
    public static final String i(String p0,String p1){
       a.p(p0, "$this$prependIndent");
       a.p(p1, "indent");
       return SequencesKt___SequencesKt.V0(SequencesKt___SequencesKt.b1(StringsKt__StringsKt.B3(p0), new StringsKt__IndentKt$prependIndent$1(p1)), "\n", null, null, 0, null, null, 62, null);
    }
    public static String j(String p0,String p1,int p2,Object p3){
       if (p2 & 0x01) {
          p1 = "    ";
       }
       return StringsKt__IndentKt.i(p0, p1);
    }
    public static final String k(List p0,int p1,l p2,l p3){
       int i = CollectionsKt__CollectionsKt.G(p0);
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = p0.iterator();
       int i1 = 0;
       int i2 = 0;
       while (true) {
          if (iterator.hasNext()) {
             Object obj = iterator.next();
             int i3 = i2 + 1;
             if (i2 < 0) {
                if (l.a(1, 3, i1)) {
                   CollectionsKt__CollectionsKt.W();
                }else {
                   break ;
                }
             }
             if (!i2 || (i2 == i && u.S1(obj))) {
                obj = null;
             }else {
                String str = p3.invoke(obj);
                if (str != null) {
                   str = p2.invoke(str);
                   if (str != null) {
                      obj = str;
                   }
                }
             }
             if (obj != null) {
                uArrayList.add(obj);
             }
             i2 = i3;
          }else {
             String str1 = CollectionsKt___CollectionsKt.T2(uArrayList, new StringBuilder(p1), "\n", null, null, 0, null, null, 124, null);
             a.o(str1, "mapIndexedNotNull { inde¡­\"\\n\"\)\n        .toString\(\)");
             return str1;
          }
       }
       throw new ArithmeticException("Index overflow has happened.");
    }
    public static final String l(String p0,String p1){
       a.p(p0, "$this$replaceIndent");
       a.p(p1, "newIndent");
       List list = StringsKt__StringsKt.C3(p0);
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = list.iterator();
       while (iterator.hasNext()) {
          Object obj = iterator.next();
          int i = u.S1(obj) ^ 0x01;
          if (i) {
             uArrayList.add(obj);
          }
       }
       ArrayList uArrayList1 = new ArrayList(u.Y(uArrayList, 10));
       Iterator iterator1 = uArrayList.iterator();
       while (iterator1.hasNext()) {
          uArrayList1.add(Integer.valueOf(StringsKt__IndentKt.h(iterator1.next())));
       }
       Integer integer = CollectionsKt___CollectionsKt.T3(uArrayList1);
       int i1 = 0;
       int i2 = (integer != null)? integer.intValue(): 0;
       int i3 = p0.length() + (p1.length() * list.size());
       l ol = StringsKt__IndentKt.g(p1);
       int i4 = CollectionsKt__CollectionsKt.G(list);
       ArrayList uArrayList2 = new ArrayList();
       Iterator iterator2 = list.iterator();
       while (iterator2.hasNext()) {
          Object obj1 = iterator2.next();
          int i5 = i1 + 1;
          if (i1 < 0) {
             CollectionsKt__CollectionsKt.W();
          }
          if (!i1 || (i1 == i4 && u.S1(obj1))) {
             obj1 = null;
          }else {
             String str = StringsKt___StringsKt.e6(obj1, i2);
             if (str != null) {
                str = ol.invoke(str);
                if (str != null) {
                   obj1 = str;
                }
             }
          }
          if (obj1 != null) {
             uArrayList2.add(obj1);
          }
          i1 = i5;
       }
       i3 = CollectionsKt___CollectionsKt.T2(uArrayList2, new StringBuilder(i3), "\n", null, null, 0, null, null, 124, null);
       a.o(i3, "mapIndexedNotNull { inde¡­\"\\n\"\)\n        .toString\(\)");
       return i3;
    }
    public static String m(String p0,String p1,int p2,Object p3){
       if (p2 & 0x01) {
          p1 = "";
       }
       return StringsKt__IndentKt.l(p0, p1);
    }
    public static final String n(String p0,String p1,String p2){
       int i7;
       a.p(p0, "$this$replaceIndentByMargin");
       a.p(p1, "newIndent");
       a.p(p2, "marginPrefix");
       if (!(u.S1(p2) ^ 0x01)) {
          throw new IllegalArgumentException("marginPrefix must be non-blank string.".toString());
       }
       List list = StringsKt__StringsKt.C3(p0);
       int i = p0.length() + (p1.length() * list.size());
       l ol = StringsKt__IndentKt.g(p1);
       int i1 = CollectionsKt__CollectionsKt.G(list);
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = list.iterator();
       int i2 = 0;
       while (iterator.hasNext()) {
          Object obj = iterator.next();
          int i3 = i2 + 1;
          if (i2 < 0) {
             CollectionsKt__CollectionsKt.W();
          }
          Object obj1 = obj;
          String str = null;
          if (!i2 || (i2 == i1 && u.S1(obj1))) {
             obj1 = str;
          }else {
             i2 = obj1.length();
             int i4 = 0;
             while (true) {
                int i5 = -1;
                if (i4 < i2) {
                   int i6 = b.r(obj1.charAt(i4)) ^ 0x01;
                   if (i6) {
                      i7 = i4;
                   label_007f :
                      if (i7 != i5) {
                         int i8 = i7;
                         if (u.p2(obj1, p2, i7, false, 4, 0)) {
                            i7 = i8 + p2.length();
                            Objects.requireNonNull(obj1, "null cannot be cast to non-null type java.lang.String");
                            str = obj1.substring(i7);
                            a.o(str, "\(this as java.lang.String\).substring\(startIndex\)");
                         }
                      }
                      if (str != null) {
                         String str1 = ol.invoke(str);
                         if (str1 != null) {
                            obj1 = str1;
                         }
                      }
                   }else {
                      i4 = i4 + 1;
                   }
                }else {
                   i7 = -1;
                   goto label_007f ;
                }
             }
          }
          if (obj1 != null) {
             uArrayList.add(obj1);
          }
          i2 = i3;
       }
       String str2 = CollectionsKt___CollectionsKt.T2(uArrayList, new StringBuilder(i), "\n", null, null, 0, null, null, 124, null);
       a.o(str2, "mapIndexedNotNull { inde¡­\"\\n\"\)\n        .toString\(\)");
       return str2;
    }
    public static String o(String p0,String p1,String p2,int p3,Object p4){
       if (p3 & 0x01) {
          p1 = "";
       }
       if (p3 & 0x02) {
          p2 = "|";
       }
       return StringsKt__IndentKt.n(p0, p1, p2);
    }
    public static final String p(String p0){
       a.p(p0, "$this$trimIndent");
       return StringsKt__IndentKt.l(p0, "");
    }
    public static final String q(String p0,String p1){
       a.p(p0, "$this$trimMargin");
       a.p(p1, "marginPrefix");
       return StringsKt__IndentKt.n(p0, "", p1);
    }
    public static String r(String p0,String p1,int p2,Object p3){
       if (p2 & 0x01) {
          p1 = "|";
       }
       return StringsKt__IndentKt.q(p0, p1);
    }
}
