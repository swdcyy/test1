package kotlin.text.StringsKt__StringsKt;
import zsd.u;
import java.lang.CharSequence;
import java.lang.Object;
import java.lang.String;
import usd.k;
import java.util.Objects;
import kotlin.jvm.internal.a;
import zsd.b;
import wsd.m;
import kotlin.text.Regex;
import java.util.List;
import msd.l;
import java.lang.Character;
import java.lang.Boolean;
import kotlin.sequences.SequencesKt___SequencesKt;
import java.lang.Iterable;
import java.util.ArrayList;
import trd.u;
import java.util.Iterator;
import java.util.Collection;
import kotlin.collections.ArraysKt___ArraysKt;
import usd.q;
import trd.t;
import java.lang.StringBuilder;
import java.lang.IllegalArgumentException;
import java.lang.Math;
import zsd.c;
import kotlin.text.StringsKt__StringsKt$splitToSequence$2;
import kotlin.text.StringsKt__StringsKt$splitToSequence$1;
import zsd.f;
import kotlin.text.StringsKt__StringsKt$rangesDelimitedBy$2;
import msd.p;
import trd.n;
import kotlin.text.StringsKt__StringsKt$rangesDelimitedBy$4;
import java.lang.Integer;
import kotlin.Pair;
import kotlin.collections.CollectionsKt___CollectionsKt;
import qrd.r0;
import usd.i;
import java.lang.IndexOutOfBoundsException;
import msd.a;
import trd.r;
import kotlin.text.StringsKt__StringsKt$a;

public class StringsKt__StringsKt extends u	// class@001cca
{

    public void StringsKt__StringsKt(){
       super();
    }
    public static int A3(CharSequence p0,char[] p1,int p2,boolean p3,int p4,Object p5){
       if (p4 & 0x02) {
          p2 = StringsKt__StringsKt.Z2(p0);
       }
       if (p4 & 0x04) {
          p3 = false;
       }
       return StringsKt__StringsKt.y3(p0, p1, p2, p3);
    }
    public static final String A4(String p0,k p1,CharSequence p2){
       Objects.requireNonNull(p0, "null cannot be cast to non-null type kotlin.CharSequence");
       return StringsKt__StringsKt.y4(p0, p1, p2).toString();
    }
    public static final CharSequence A5(CharSequence p0){
       a.p(p0, "$this$trimStart");
       int i = p0.length();
       int i1 = 0;
       while (true) {
          if (i1 < i) {
             if (!b.r(p0.charAt(i1))) {
                p0 = p0.subSequence(i1, p0.length());
                break ;
             }else {
                i1 = i1 + 1;
             }
          }else {
             String str = "";
             break ;
          }
       }
       return p0;
    }
    public static final m B3(CharSequence p0){
       a.p(p0, "$this$lineSequence");
       String[] stringArray = new String[]{"\r\n","\n","\r"};
       return StringsKt__StringsKt.L4(p0, stringArray, false, 0, 6, null);
    }
    public static final List B4(CharSequence p0,Regex p1,int p2){
       return p1.split(p0, p2);
    }
    public static final CharSequence B5(CharSequence p0,l p1){
       a.p(p0, "$this$trimStart");
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
    public static final List C3(CharSequence p0){
       a.p(p0, "$this$lines");
       return SequencesKt___SequencesKt.V2(StringsKt__StringsKt.B3(p0));
    }
    public static final List C4(CharSequence p0,char[] p1,boolean p2,int p3){
       a.p(p0, "$this$split");
       a.p(p1, "delimiters");
       if (p1.length == 1) {
          return StringsKt__StringsKt.E4(p0, String.valueOf(p1[0]), p2, p3);
       }
       Iterable iterable = SequencesKt___SequencesKt.G(StringsKt__StringsKt.P3(p0, p1, 0, p2, p3, 2, null));
       ArrayList uArrayList = new ArrayList(u.Y(iterable, 10));
       Iterator iterator = iterable.iterator();
       while (iterator.hasNext()) {
          uArrayList.add(StringsKt__StringsKt.V4(p0, iterator.next()));
       }
       return uArrayList;
    }
    public static final CharSequence C5(CharSequence p0,char[] p1){
       a.p(p0, "$this$trimStart");
       a.p(p1, "chars");
       int i = p0.length();
       int i1 = 0;
       while (true) {
          if (i1 < i) {
             if (!ArraysKt___ArraysKt.K7(p1, p0.charAt(i1))) {
                p0 = p0.subSequence(i1, p0.length());
                break ;
             }else {
                i1 = i1 + 1;
             }
          }else {
             String str = "";
             break ;
          }
       }
       return p0;
    }
    public static final boolean D3(CharSequence p0,Regex p1){
       return p1.matches(p0);
    }
    public static final List D4(CharSequence p0,String[] p1,boolean p2,int p3){
       a.p(p0, "$this$split");
       a.p(p1, "delimiters");
       int i = 1;
       if (p1.length == i) {
          object oobject = p1[0];
          if (oobject.length()) {
             i = 0;
          }
          if (!i) {
             return StringsKt__StringsKt.E4(p0, oobject, p2, p3);
          }
       }
       Iterable iterable = SequencesKt___SequencesKt.G(StringsKt__StringsKt.Q3(p0, p1, 0, p2, p3, 2, null));
       ArrayList uArrayList = new ArrayList(u.Y(iterable, 10));
       Iterator iterator = iterable.iterator();
       while (iterator.hasNext()) {
          uArrayList.add(StringsKt__StringsKt.V4(p0, iterator.next()));
       }
       return uArrayList;
    }
    public static final String D5(String p0){
       Objects.requireNonNull(p0, "null cannot be cast to non-null type kotlin.CharSequence");
       return StringsKt__StringsKt.A5(p0).toString();
    }
    public static final String E3(String p0){
       if (p0 != null) {
       }else {
          p0 = "";
       }
       return p0;
    }
    public static final List E4(CharSequence p0,String p1,boolean p2,int p3){
       int i2;
       int i = 0;
       int i1 = (p3 >= 0)? 1: 0;
       if (i1) {
          i1 = StringsKt__StringsKt.e3(p0, p1, i, p2);
          if (i1 == -1 || p3 == 1) {
             return t.k(p0.toString());
          }else if(p3 > 0){
             i2 = 1;
          }else {
             i2 = 0;
          }
          int i3 = 10;
          if (i2) {
             i3 = q.u(p3, i3);
          }
          ArrayList uArrayList = new ArrayList(i3);
          do {
             uArrayList.add(p0.subSequence(i, i1).toString());
             i = p1.length() + i1;
             if (i2) {
                i3 = p3 - 1;
                if (uArrayList.size() == i3) {
                   break ;
                }
             }
             i1 = StringsKt__StringsKt.e3(p0, p1, i, p2);
          } while (i1 == -1);
          uArrayList.add(p0.subSequence(i, p0.length()).toString());
          return uArrayList;
       }else {
          throw new IllegalArgumentException("Limit must be non-negative, but was "+p3+'.'.toString());
       }
    }
    public static final String E5(String p0,l p1){
       CharSequence uCharSequenc;
       a.p(p0, "$this$trimStart");
       a.p(p1, "predicate");
       int i = p0.length();
       int i1 = 0;
       while (true) {
          if (i1 < i) {
             if (!p1.invoke(Character.valueOf(p0.charAt(i1))).booleanValue()) {
                uCharSequenc = p0.subSequence(i1, p0.length());
                break ;
             }else {
                i1 = i1 + 1;
             }
          }else {
             p0 = "";
             break ;
          }
       }
       return uCharSequenc.toString();
    }
    public static final CharSequence F3(CharSequence p0,int p1,char p2){
       a.p(p0, "$this$padEnd");
       if (p1 < 0) {
          throw new IllegalArgumentException("Desired length "+p1+" is less than zero.");
       }
       if (p1 <= p0.length()) {
          return p0.subSequence(0, p0.length());
       }
       StringBuilder str = new StringBuilder(p1)+p0;
       p1 = p1 - p0.length();
       int i = 1;
       if (i <= p1) {
          str = str+p2;
          while (i != p1) {
             i++;
          }
       }
       return str;
    }
    public static List F4(CharSequence p0,Regex p1,int p2,int p3,Object p4){
       if (p3 & 0x02) {
          p2 = 0;
       }
       return p1.split(p0, p2);
    }
    public static final String F5(String p0,char[] p1){
       CharSequence uCharSequenc;
       a.p(p0, "$this$trimStart");
       a.p(p1, "chars");
       int i = p0.length();
       int i1 = 0;
       while (true) {
          if (i1 < i) {
             if (!ArraysKt___ArraysKt.K7(p1, p0.charAt(i1))) {
                uCharSequenc = p0.subSequence(i1, p0.length());
                break ;
             }else {
                i1 = i1 + 1;
             }
          }else {
             p0 = "";
             break ;
          }
       }
       return uCharSequenc.toString();
    }
    public static final String G2(CharSequence p0,CharSequence p1,boolean p2){
       a.p(p0, "$this$commonPrefixWith");
       a.p(p1, "other");
       int i = Math.min(p0.length(), p1.length());
       int i1 = 0;
       while (i1 < i && c.v(p0.charAt(i1), p1.charAt(i1), p2)) {
          i1 = i1 + 1;
       }
       int i2 = i1 - 1;
       if (StringsKt__StringsKt.a3(p0, i2) || StringsKt__StringsKt.a3(p1, i2)) {
          i1 = i1 - 1;
       }
       return p0.subSequence(0, i1).toString();
    }
    public static final String G3(String p0,int p1,char p2){
       a.p(p0, "$this$padEnd");
       return StringsKt__StringsKt.F3(p0, p1, p2).toString();
    }
    public static List G4(CharSequence p0,char[] p1,boolean p2,int p3,int p4,Object p5){
       if (p4 & 0x02) {
          p2 = false;
       }
       if (p4 & 0x04) {
          p3 = 0;
       }
       return StringsKt__StringsKt.C4(p0, p1, p2, p3);
    }
    public static String H2(CharSequence p0,CharSequence p1,boolean p2,int p3,Object p4){
       if (p3 & 0x02) {
          p2 = false;
       }
       return StringsKt__StringsKt.G2(p0, p1, p2);
    }
    public static CharSequence H3(CharSequence p0,int p1,char p2,int p3,Object p4){
       if (p3 & 0x02) {
          p2 = ' ';
       }
       return StringsKt__StringsKt.F3(p0, p1, p2);
    }
    public static List H4(CharSequence p0,String[] p1,boolean p2,int p3,int p4,Object p5){
       if (p4 & 0x02) {
          p2 = false;
       }
       if (p4 & 0x04) {
          p3 = 0;
       }
       return StringsKt__StringsKt.D4(p0, p1, p2, p3);
    }
    public static final String I2(CharSequence p0,CharSequence p1,boolean p2){
       a.p(p0, "$this$commonSuffixWith");
       a.p(p1, "other");
       int i = p0.length();
       int i1 = p1.length();
       int i2 = Math.min(i, i1);
       int i3 = 0;
       while (i3 < i2) {
          int i4 = i - i3;
          i4 = i4 - 1;
          int i5 = i1 - i3;
          i5 = i5 - 1;
          if (c.v(p0.charAt(i4), p1.charAt(i5), p2)) {
             i3 = i3 + 1;
          }else if(StringsKt__StringsKt.a3(p0, ((i - i3) - 1)) || StringsKt__StringsKt.a3(p1, ((i1 - i3) - 1))){
             i3 = i3 - 1;
          }
          return p0.subSequence((i - i3), i).toString();
       }
    }
    public static String I3(String p0,int p1,char p2,int p3,Object p4){
       if (p3 & 0x02) {
          p2 = ' ';
       }
       return StringsKt__StringsKt.G3(p0, p1, p2);
    }
    public static final m I4(CharSequence p0,char[] p1,boolean p2,int p3){
       a.p(p0, "$this$splitToSequence");
       a.p(p1, "delimiters");
       return SequencesKt___SequencesKt.b1(StringsKt__StringsKt.P3(p0, p1, 0, p2, p3, 2, null), new StringsKt__StringsKt$splitToSequence$2(p0));
    }
    public static String J2(CharSequence p0,CharSequence p1,boolean p2,int p3,Object p4){
       if (p3 & 0x02) {
          p2 = false;
       }
       return StringsKt__StringsKt.I2(p0, p1, p2);
    }
    public static final CharSequence J3(CharSequence p0,int p1,char p2){
       a.p(p0, "$this$padStart");
       if (p1 < 0) {
          throw new IllegalArgumentException("Desired length "+p1+" is less than zero.");
       }
       if (p1 <= p0.length()) {
          return p0.subSequence(0, p0.length());
       }
       StringBuilder str = new StringBuilder(p1);
       p1 = p1 - p0.length();
       int i = 1;
       if (i <= p1) {
          str = str+p2;
          while (i != p1) {
             i = i + 1;
          }
       }
       return str+p0;
    }
    public static final m J4(CharSequence p0,String[] p1,boolean p2,int p3){
       a.p(p0, "$this$splitToSequence");
       a.p(p1, "delimiters");
       return SequencesKt___SequencesKt.b1(StringsKt__StringsKt.Q3(p0, p1, 0, p2, p3, 2, null), new StringsKt__StringsKt$splitToSequence$1(p0));
    }
    public static final boolean K2(CharSequence p0,char p1,boolean p2){
       a.p(p0, "$this$contains");
       boolean b = (StringsKt__StringsKt.h3(p0, p1, 0, p2, 2, null) >= 0)? true: false;
       return b;
    }
    public static final String K3(String p0,int p1,char p2){
       a.p(p0, "$this$padStart");
       return StringsKt__StringsKt.J3(p0, p1, p2).toString();
    }
    public static m K4(CharSequence p0,char[] p1,boolean p2,int p3,int p4,Object p5){
       if (p4 & 0x02) {
          p2 = false;
       }
       if (p4 & 0x04) {
          p3 = 0;
       }
       return StringsKt__StringsKt.I4(p0, p1, p2, p3);
    }
    public static final boolean L2(CharSequence p0,CharSequence p1,boolean p2){
       a.p(p0, "$this$contains");
       a.p(p1, "other");
       boolean b = true;
       if (p1 instanceof String) {
          if (StringsKt__StringsKt.i3(p0, p1, 0, p2, 2, null) < 0) {
          label_0032 :
             b = false;
          }
       }else if(StringsKt__StringsKt.g3(p0, p1, 0, p0.length(), p2, false, 16, null) >= 0){
       }
       return b;
    }
    public static CharSequence L3(CharSequence p0,int p1,char p2,int p3,Object p4){
       if (p3 & 0x02) {
          p2 = ' ';
       }
       return StringsKt__StringsKt.J3(p0, p1, p2);
    }
    public static m L4(CharSequence p0,String[] p1,boolean p2,int p3,int p4,Object p5){
       if (p4 & 0x02) {
          p2 = false;
       }
       if (p4 & 0x04) {
          p3 = 0;
       }
       return StringsKt__StringsKt.J4(p0, p1, p2, p3);
    }
    public static final boolean M2(CharSequence p0,Regex p1){
       a.p(p0, "$this$contains");
       return p1.containsMatchIn(p0);
    }
    public static String M3(String p0,int p1,char p2,int p3,Object p4){
       if (p3 & 0x02) {
          p2 = ' ';
       }
       return StringsKt__StringsKt.K3(p0, p1, p2);
    }
    public static final boolean M4(CharSequence p0,char p1,boolean p2){
       a.p(p0, "$this$startsWith");
       int i = 0;
       if (p0.length() > 0 && c.v(p0.charAt(i), p1, p2)) {
          i = true;
       }
       return i;
    }
    public static boolean N2(CharSequence p0,char p1,boolean p2,int p3,Object p4){
       if (p3 & 0x02) {
          p2 = false;
       }
       return StringsKt__StringsKt.K2(p0, p1, p2);
    }
    public static final m N3(CharSequence p0,char[] p1,int p2,boolean p3,int p4){
       f uof = (p4 >= 0)? 1: null;
       if (uof) {
          return new f(p0, p2, p4, new StringsKt__StringsKt$rangesDelimitedBy$2(p1, p3));
       }else {
          throw new IllegalArgumentException("Limit must be non-negative, but was "+p4+'.'.toString());
       }
    }
    public static final boolean N4(CharSequence p0,CharSequence p1,int p2,boolean p3){
       a.p(p0, "$this$startsWith");
       a.p(p1, "prefix");
       if (!p3 && (p0 instanceof String && p1 instanceof String)) {
          return u.p2(p0, p1, p2, false, 4, null);
       }
       return StringsKt__StringsKt.R3(p0, p2, p1, 0, p1.length(), p3);
    }
    public static boolean O2(CharSequence p0,CharSequence p1,boolean p2,int p3,Object p4){
       if (p3 & 0x02) {
          p2 = false;
       }
       return StringsKt__StringsKt.L2(p0, p1, p2);
    }
    public static final m O3(CharSequence p0,String[] p1,int p2,boolean p3,int p4){
       f uof = (p4 >= 0)? 1: null;
       if (uof) {
          return new f(p0, p2, p4, new StringsKt__StringsKt$rangesDelimitedBy$4(n.t(p1), p3));
       }else {
          throw new IllegalArgumentException("Limit must be non-negative, but was "+p4+'.'.toString());
       }
    }
    public static final boolean O4(CharSequence p0,CharSequence p1,boolean p2){
       a.p(p0, "$this$startsWith");
       a.p(p1, "prefix");
       if (!p2 && (p0 instanceof String && p1 instanceof String)) {
          return u.q2(p0, p1, false, 2, null);
       }
       return StringsKt__StringsKt.R3(p0, 0, p1, 0, p1.length(), p2);
    }
    public static final boolean P2(CharSequence p0,char p1,boolean p2){
       a.p(p0, "$this$endsWith");
       boolean b = (p0.length() > 0 && c.v(p0.charAt(StringsKt__StringsKt.Z2(p0)), p1, p2))? true: false;
       return b;
    }
    public static m P3(CharSequence p0,char[] p1,int p2,boolean p3,int p4,int p5,Object p6){
       if (p5 & 0x02) {
          p2 = 0;
       }
       if (p5 & 0x04) {
          p3 = false;
       }
       if (p5 & 0x08) {
          p4 = 0;
       }
       return StringsKt__StringsKt.N3(p0, p1, p2, p3, p4);
    }
    public static boolean P4(CharSequence p0,char p1,boolean p2,int p3,Object p4){
       if (p3 & 0x02) {
          p2 = false;
       }
       return StringsKt__StringsKt.M4(p0, p1, p2);
    }
    public static final boolean Q2(CharSequence p0,CharSequence p1,boolean p2){
       a.p(p0, "$this$endsWith");
       a.p(p1, "suffix");
       if (!p2 && (p0 instanceof String && p1 instanceof String)) {
          return u.H1(p0, p1, false, 2, null);
       }
       return StringsKt__StringsKt.R3(p0, (p0.length() - p1.length()), p1, 0, p1.length(), p2);
    }
    public static m Q3(CharSequence p0,String[] p1,int p2,boolean p3,int p4,int p5,Object p6){
       if (p5 & 0x02) {
          p2 = 0;
       }
       if (p5 & 0x04) {
          p3 = false;
       }
       if (p5 & 0x08) {
          p4 = 0;
       }
       return StringsKt__StringsKt.O3(p0, p1, p2, p3, p4);
    }
    public static boolean Q4(CharSequence p0,CharSequence p1,int p2,boolean p3,int p4,Object p5){
       if (p4 & 0x04) {
          p3 = false;
       }
       return StringsKt__StringsKt.N4(p0, p1, p2, p3);
    }
    public static boolean R2(CharSequence p0,char p1,boolean p2,int p3,Object p4){
       if (p3 & 0x02) {
          p2 = false;
       }
       return StringsKt__StringsKt.P2(p0, p1, p2);
    }
    public static final boolean R3(CharSequence p0,int p1,CharSequence p2,int p3,int p4,boolean p5){
       a.p(p0, "$this$regionMatchesImpl");
       a.p(p2, "other");
       if (p3 >= 0 && (p1 >= 0 && (p1 > (p0.length() - p4) || p3 > (p2.length() - p4)))) {
          return false;
       }
       int i = 0;
       while (true) {
          if (i >= p4) {
             return true;
          }
          int i1 = p1 + i;
          int i2 = p3 + i;
          if (!c.v(p0.charAt(i1), p2.charAt(i2), p5)) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return false;
    }
    public static boolean R4(CharSequence p0,CharSequence p1,boolean p2,int p3,Object p4){
       if (p3 & 0x02) {
          p2 = false;
       }
       return StringsKt__StringsKt.O4(p0, p1, p2);
    }
    public static boolean S2(CharSequence p0,CharSequence p1,boolean p2,int p3,Object p4){
       if (p3 & 0x02) {
          p2 = false;
       }
       return StringsKt__StringsKt.Q2(p0, p1, p2);
    }
    public static final CharSequence S3(CharSequence p0,CharSequence p1){
       a.p(p0, "$this$removePrefix");
       a.p(p1, "prefix");
       boolean b = false;
       if (StringsKt__StringsKt.R4(p0, p1, b, 2, null)) {
          return p0.subSequence(p1.length(), p0.length());
       }
       return p0.subSequence(b, p0.length());
    }
    public static final CharSequence S4(CharSequence p0,k p1){
       a.p(p0, "$this$subSequence");
       a.p(p1, "range");
       return p0.subSequence(p1.t().intValue(), (p1.s().intValue() + 1));
    }
    public static final Pair T2(CharSequence p0,Collection p1,int p2,boolean p3){
       a.p(p0, "$this$findAnyOf");
       a.p(p1, "strings");
       return StringsKt__StringsKt.U2(p0, p1, p2, p3, false);
    }
    public static final String T3(String p0,CharSequence p1){
       a.p(p0, "$this$removePrefix");
       a.p(p1, "prefix");
       if (StringsKt__StringsKt.R4(p0, p1, false, 2, null)) {
          p0 = p0.substring(p1.length());
          a.o(p0, "\(this as java.lang.String\).substring\(startIndex\)");
       }
       return p0;
    }
    public static final CharSequence T4(String p0,int p1,int p2){
       return p0.subSequence(p1, p2);
    }
    public static final Pair U2(CharSequence p0,Collection p1,int p2,boolean p3,boolean p4){
       int i3;
       Iterator iterator;
       Pair pair1;
       Object obj;
       Pair pair = null;
       if (!p3 && p1.size() == 1) {
          String str = CollectionsKt___CollectionsKt.Q4(p1);
          CharSequence uCharSequenc = p0;
          String str1 = str;
          int i = p2;
          int i1 = (!p4)? StringsKt__StringsKt.i3(uCharSequenc, str1, i, false, 4, null): StringsKt__StringsKt.w3(uCharSequenc, str1, i, false, 4, null);
          if (i1 >= 0) {
             pair = r0.a(Integer.valueOf(i1), str);
          }
          return pair;
       }else {
          int i2 = 0;
          k ok = (!p4)? new k(q.n(p2, i2), p0.length()): q.W(q.u(p2, StringsKt__StringsKt.Z2(p0)), i2);
          if (p0 instanceof String) {
             p2 = ok.l();
             i2 = ok.m();
             i3 = ok.n();
             if (i3 >= 0) {
                if (p2 > i2) {
                }
             }else if(p2 >= i2){
             }
             while (true) {
                iterator = p1.iterator();
                break ;
             }
             while (true) {
                if (iterator.hasNext()) {
                   pair1 = iterator.next();
                   obj = pair1;
                   if (!u.Z1(obj, 0, p0, p2, obj.length(), p3)) {
                      continue ;
                   }
                }else {
                   pair1 = pair;
                }
                if (pair1 != null) {
                   return r0.a(Integer.valueOf(p2), pair1);
                }else if(p2 != i2){
                   p2 = p2 + i3;
                }else {
                   break ;
                }
             }
          }else {
             p2 = ok.l();
             i2 = ok.m();
             i3 = ok.n();
             if (i3 >= 0) {
                if (p2 > i2) {
                   return pair;
                }
             }else if(p2 >= i2){
             }
             while (true) {
                iterator = p1.iterator();
                break ;
             }
             while (true) {
                if (iterator.hasNext()) {
                   pair1 = iterator.next();
                   obj = pair1;
                   if (!StringsKt__StringsKt.R3(obj, 0, p0, p2, obj.length(), p3)) {
                      continue ;
                   }
                }else {
                   pair1 = pair;
                }
                if (pair1 != null) {
                   return r0.a(Integer.valueOf(p2), pair1);
                }else if(p2 != i2){
                   p2 = p2 + i3;
                }else {
                   goto label_00da ;
                }
             }
          }
       }
    }
    public static final CharSequence U3(CharSequence p0,int p1,int p2){
       a.p(p0, "$this$removeRange");
       if (p2 < p1) {
          throw new IndexOutOfBoundsException("End index \("+p2+"\) is less than start index \("+p1+"\).");
       }
       int i = 0;
       if (p2 == p1) {
          return p0.subSequence(i, p0.length());
       }
       StringBuilder str = new StringBuilder((p0.length() - (p2 - p1)))+p0;
       a.o(str, "this.append\(value, startIndex, endIndex\)");
       str = str+p0;
       a.o(str, "this.append\(value, startIndex, endIndex\)");
       return str;
    }
    public static final String U4(CharSequence p0,int p1,int p2){
       return p0.subSequence(p1, p2).toString();
    }
    public static Pair V2(CharSequence p0,Collection p1,int p2,boolean p3,int p4,Object p5){
       if (p4 & 0x02) {
          p2 = 0;
       }
       if (p4 & 0x04) {
          p3 = false;
       }
       return StringsKt__StringsKt.T2(p0, p1, p2, p3);
    }
    public static final CharSequence V3(CharSequence p0,k p1){
       a.p(p0, "$this$removeRange");
       a.p(p1, "range");
       return StringsKt__StringsKt.U3(p0, p1.t().intValue(), (p1.s().intValue() + 1));
    }
    public static final String V4(CharSequence p0,k p1){
       a.p(p0, "$this$substring");
       a.p(p1, "range");
       return p0.subSequence(p1.t().intValue(), (p1.s().intValue() + 1)).toString();
    }
    public static final Pair W2(CharSequence p0,Collection p1,int p2,boolean p3){
       a.p(p0, "$this$findLastAnyOf");
       a.p(p1, "strings");
       return StringsKt__StringsKt.U2(p0, p1, p2, p3, true);
    }
    public static final String W3(String p0,int p1,int p2){
       Objects.requireNonNull(p0, "null cannot be cast to non-null type kotlin.CharSequence");
       return StringsKt__StringsKt.U3(p0, p1, p2).toString();
    }
    public static final String W4(String p0,k p1){
       a.p(p0, "$this$substring");
       a.p(p1, "range");
       p0 = p0.substring(p1.t().intValue(), (p1.s().intValue() + 1));
       a.o(p0, "\(this as java.lang.Strin¡­ing\(startIndex, endIndex\)");
       return p0;
    }
    public static Pair X2(CharSequence p0,Collection p1,int p2,boolean p3,int p4,Object p5){
       if (p4 & 0x02) {
          p2 = StringsKt__StringsKt.Z2(p0);
       }
       if (p4 & 0x04) {
          p3 = false;
       }
       return StringsKt__StringsKt.W2(p0, p1, p2, p3);
    }
    public static final String X3(String p0,k p1){
       Objects.requireNonNull(p0, "null cannot be cast to non-null type kotlin.CharSequence");
       return StringsKt__StringsKt.V3(p0, p1).toString();
    }
    public static String X4(CharSequence p0,int p1,int p2,int p3,Object p4){
       if (p3 & 0x02) {
          p2 = p0.length();
       }
       return p0.subSequence(p1, p2).toString();
    }
    public static final k Y2(CharSequence p0){
       a.p(p0, "$this$indices");
       return new k(0, (p0.length() - 1));
    }
    public static final CharSequence Y3(CharSequence p0,CharSequence p1){
       a.p(p0, "$this$removeSuffix");
       a.p(p1, "suffix");
       if (StringsKt__StringsKt.S2(p0, p1, false, 2, null)) {
          return p0.subSequence(false, (p0.length() - p1.length()));
       }
       return p0.subSequence(false, p0.length());
    }
    public static final String Y4(String p0,char p1,String p2){
       a.p(p0, "$this$substringAfter");
       a.p(p2, "missingDelimiterValue");
       int i = StringsKt__StringsKt.h3(p0, p1, 0, false, 6, null);
       if (i == -1) {
       }else {
          i++;
          p2 = p0.substring(i, p0.length());
          a.o(p2, "\(this as java.lang.Strin¡­ing\(startIndex, endIndex\)");
       }
       return p2;
    }
    public static final int Z2(CharSequence p0){
       a.p(p0, "$this$lastIndex");
       return (p0.length() - 1);
    }
    public static final String Z3(String p0,CharSequence p1){
       a.p(p0, "$this$removeSuffix");
       a.p(p1, "suffix");
       if (StringsKt__StringsKt.S2(p0, p1, false, 2, null)) {
          p0 = p0.substring(false, (p0.length() - p1.length()));
          a.o(p0, "\(this as java.lang.Strin¡­ing\(startIndex, endIndex\)");
       }
       return p0;
    }
    public static final String Z4(String p0,String p1,String p2){
       a.p(p0, "$this$substringAfter");
       a.p(p1, "delimiter");
       a.p(p2, "missingDelimiterValue");
       int i = StringsKt__StringsKt.i3(p0, p1, 0, false, 6, null);
       if (i == -1) {
       }else {
          p2 = p0.substring((i + p1.length()), p0.length());
          a.o(p2, "\(this as java.lang.Strin¡­ing\(startIndex, endIndex\)");
       }
       return p2;
    }
    public static final boolean a3(CharSequence p0,int p1){
       a.p(p0, "$this$hasSurrogatePairAt");
       int i = p0.length() - 2;
       int i1 = 1;
       if (p1 < 0) {
       }else if(i >= p1 && (Character.isHighSurrogate(p0.charAt(p1)) && Character.isLowSurrogate(p0.charAt((p1 + i1))))){
       label_0028 :
          return i1;
       }
       i1 = false;
       goto label_0028 ;
    }
    public static final CharSequence a4(CharSequence p0,CharSequence p1){
       a.p(p0, "$this$removeSurrounding");
       a.p(p1, "delimiter");
       return StringsKt__StringsKt.b4(p0, p1, p1);
    }
    public static String a5(String p0,char p1,String p2,int p3,Object p4){
       if (p3 & 0x02) {
          p2 = p0;
       }
       return StringsKt__StringsKt.Y4(p0, p1, p2);
    }
    public static final Object b3(CharSequence p0,a p1){
       if (u.S1(p0)) {
          p0 = p1.invoke();
       }
       return p0;
    }
    public static final CharSequence b4(CharSequence p0,CharSequence p1,CharSequence p2){
       a.p(p0, "$this$removeSurrounding");
       a.p(p1, "prefix");
       a.p(p2, "suffix");
       if (p0.length() >= (p1.length() + p2.length())) {
          int i = 2;
          if (StringsKt__StringsKt.R4(p0, p1, false, i, null) && StringsKt__StringsKt.S2(p0, p2, false, i, null)) {
             return p0.subSequence(p1.length(), (p0.length() - p2.length()));
          }
       }
       return p0.subSequence(false, p0.length());
    }
    public static String b5(String p0,String p1,String p2,int p3,Object p4){
       if (p3 & 0x02) {
          p2 = p0;
       }
       return StringsKt__StringsKt.Z4(p0, p1, p2);
    }
    public static final Object c3(CharSequence p0,a p1){
       int i = (!p0.length())? 1: 0;
       if (i) {
          p0 = p1.invoke();
       }
       return p0;
    }
    public static final String c4(String p0,CharSequence p1){
       a.p(p0, "$this$removeSurrounding");
       a.p(p1, "delimiter");
       return StringsKt__StringsKt.d4(p0, p1, p1);
    }
    public static final String c5(String p0,char p1,String p2){
       a.p(p0, "$this$substringAfterLast");
       a.p(p2, "missingDelimiterValue");
       int i = StringsKt__StringsKt.v3(p0, p1, 0, false, 6, null);
       if (i == -1) {
       }else {
          i++;
          p2 = p0.substring(i, p0.length());
          a.o(p2, "\(this as java.lang.Strin¡­ing\(startIndex, endIndex\)");
       }
       return p2;
    }
    public static final int d3(CharSequence p0,char p1,int p2,boolean p3){
       int i;
       a.p(p0, "$this$indexOf");
       if (p3 || !p0 instanceof String) {
          char[] uocharArray = new char[]{p1};
          i = StringsKt__StringsKt.k3(p0, uocharArray, p2, p3);
       }else {
          i = p0.indexOf(p1, p2);
       }
       return i;
    }
    public static final String d4(String p0,CharSequence p1,CharSequence p2){
       a.p(p0, "$this$removeSurrounding");
       a.p(p1, "prefix");
       a.p(p2, "suffix");
       if (p0.length() >= (p1.length() + p2.length())) {
          boolean b = false;
          if (StringsKt__StringsKt.R4(p0, p1, b, 2, null) && StringsKt__StringsKt.S2(p0, p2, b, 2, null)) {
             p0 = p0.substring(p1.length(), (p0.length() - p2.length()));
             a.o(p0, "\(this as java.lang.Strin¡­ing\(startIndex, endIndex\)");
          }
       }
       return p0;
    }
    public static final String d5(String p0,String p1,String p2){
       a.p(p0, "$this$substringAfterLast");
       a.p(p1, "delimiter");
       a.p(p2, "missingDelimiterValue");
       int i = StringsKt__StringsKt.w3(p0, p1, 0, false, 6, null);
       if (i == -1) {
       }else {
          p2 = p0.substring((i + p1.length()), p0.length());
          a.o(p2, "\(this as java.lang.Strin¡­ing\(startIndex, endIndex\)");
       }
       return p2;
    }
    public static final int e3(CharSequence p0,String p1,int p2,boolean p3){
       a.p(p0, "$this$indexOf");
       a.p(p1, "string");
       int i = (p3 || !p0 instanceof String)? StringsKt__StringsKt.g3(p0, p1, p2, p0.length(), p3, false, 16, null): p0.indexOf(p1, p2);
       return i;
    }
    public static final String e4(CharSequence p0,Regex p1,String p2){
       return p1.replace(p0, p2);
    }
    public static String e5(String p0,char p1,String p2,int p3,Object p4){
       if (p3 & 0x02) {
          p2 = p0;
       }
       return StringsKt__StringsKt.c5(p0, p1, p2);
    }
    public static final int f3(CharSequence p0,CharSequence p1,int p2,int p3,boolean p4,boolean p5){
       int i1;
       int i = 0;
       k ok = (!p5)? new k(q.n(p2, i), q.u(p3, p0.length())): q.W(q.u(p2, StringsKt__StringsKt.Z2(p0)), q.n(p3, i));
       if (p0 instanceof String && p1 instanceof String) {
          p2 = ok.l();
          p3 = ok.m();
          i1 = ok.n();
          if (i1 >= 0) {
             if (p2 > p3) {
             }
          }else if(p2 >= p3){
          }
          while (true) {
             if (u.Z1(p1, 0, p0, p2, p1.length(), p4)) {
                return p2;
             }
             if (p2 != p3) {
                p2 = p2 + i1;
             }else {
                break ;
             }
          }
       }else {
          p2 = ok.l();
          p3 = ok.m();
          i1 = ok.n();
          if (i1 >= 0) {
             if (p2 > p3) {
                return -1;
             }
          }else if(p2 >= p3){
          }
          while (true) {
             if (StringsKt__StringsKt.R3(p1, 0, p0, p2, p1.length(), p4)) {
                return p2;
             }
             if (p2 != p3) {
                p2 = p2 + i1;
             }else {
                goto label_007f ;
             }
          }
       }
    }
    public static final String f4(CharSequence p0,Regex p1,l p2){
       return p1.replace(p0, p2);
    }
    public static String f5(String p0,String p1,String p2,int p3,Object p4){
       if (p3 & 0x02) {
          p2 = p0;
       }
       return StringsKt__StringsKt.d5(p0, p1, p2);
    }
    public static int g3(CharSequence p0,CharSequence p1,int p2,int p3,boolean p4,boolean p5,int p6,Object p7){
       boolean b = (p6 & 0x10)? false: p5;
       return StringsKt__StringsKt.f3(p0, p1, p2, p3, p4, b);
    }
    public static final String g4(String p0,char p1,String p2,String p3){
       a.p(p0, "$this$replaceAfter");
       a.p(p2, "replacement");
       a.p(p3, "missingDelimiterValue");
       int i = StringsKt__StringsKt.h3(p0, p1, 0, false, 6, null);
       if (i == -1) {
       }else {
          i++;
          p3 = StringsKt__StringsKt.x4(p0, i, p0.length(), p2).toString();
       }
       return p3;
    }
    public static final String g5(String p0,char p1,String p2){
       a.p(p0, "$this$substringBefore");
       a.p(p2, "missingDelimiterValue");
       int i = StringsKt__StringsKt.h3(p0, p1, 0, false, 6, null);
       if (i == -1) {
       }else {
          p2 = p0.substring(0, i);
          a.o(p2, "\(this as java.lang.Strin¡­ing\(startIndex, endIndex\)");
       }
       return p2;
    }
    public static int h3(CharSequence p0,char p1,int p2,boolean p3,int p4,Object p5){
       if (p4 & 0x02) {
          p2 = 0;
       }
       if (p4 & 0x04) {
          p3 = false;
       }
       return StringsKt__StringsKt.d3(p0, p1, p2, p3);
    }
    public static final String h4(String p0,String p1,String p2,String p3){
       a.p(p0, "$this$replaceAfter");
       a.p(p1, "delimiter");
       a.p(p2, "replacement");
       a.p(p3, "missingDelimiterValue");
       int i = StringsKt__StringsKt.i3(p0, p1, 0, false, 6, null);
       if (i == -1) {
       }else {
          p3 = StringsKt__StringsKt.x4(p0, (i + p1.length()), p0.length(), p2).toString();
       }
       return p3;
    }
    public static final String h5(String p0,String p1,String p2){
       a.p(p0, "$this$substringBefore");
       a.p(p1, "delimiter");
       a.p(p2, "missingDelimiterValue");
       int i = StringsKt__StringsKt.i3(p0, p1, 0, false, 6, null);
       if (i == -1) {
       }else {
          p2 = p0.substring(0, i);
          a.o(p2, "\(this as java.lang.Strin¡­ing\(startIndex, endIndex\)");
       }
       return p2;
    }
    public static int i3(CharSequence p0,String p1,int p2,boolean p3,int p4,Object p5){
       if (p4 & 0x02) {
          p2 = 0;
       }
       if (p4 & 0x04) {
          p3 = false;
       }
       return StringsKt__StringsKt.e3(p0, p1, p2, p3);
    }
    public static String i4(String p0,char p1,String p2,String p3,int p4,Object p5){
       if (p4 & 0x04) {
          p3 = p0;
       }
       return StringsKt__StringsKt.g4(p0, p1, p2, p3);
    }
    public static String i5(String p0,char p1,String p2,int p3,Object p4){
       if (p3 & 0x02) {
          p2 = p0;
       }
       return StringsKt__StringsKt.g5(p0, p1, p2);
    }
    public static final int j3(CharSequence p0,Collection p1,int p2,boolean p3){
       int i;
       a.p(p0, "$this$indexOfAny");
       a.p(p1, "strings");
       Pair pair = StringsKt__StringsKt.U2(p0, p1, p2, p3, false);
       if (pair != null) {
          Integer first = pair.getFirst();
          if (first != null) {
             i = first.intValue();
          label_001f :
             return i;
          }
       }
       i = -1;
       goto label_001f ;
    }
    public static String j4(String p0,String p1,String p2,String p3,int p4,Object p5){
       if (p4 & 0x04) {
          p3 = p0;
       }
       return StringsKt__StringsKt.h4(p0, p1, p2, p3);
    }
    public static String j5(String p0,String p1,String p2,int p3,Object p4){
       if (p3 & 0x02) {
          p2 = p0;
       }
       return StringsKt__StringsKt.h5(p0, p1, p2);
    }
    public static final int k3(CharSequence p0,char[] p1,int p2,boolean p3){
       a.p(p0, "$this$indexOfAny");
       a.p(p1, "chars");
       if (!p3 && (p1.length == 1 && p0 instanceof String)) {
          return p0.indexOf(ArraysKt___ArraysKt.Is(p1), p2);
       }
       p2 = q.n(p2, 0);
       int i = StringsKt__StringsKt.Z2(p0);
       if (p2 <= i) {
       label_002a :
          char c = p0.charAt(p2);
          int len = p1.length;
          int i1 = 0;
          while (true) {
             if (i1 < len) {
                if (c.v(p1[i1], c, p3)) {
                   c = 1;
                label_0040 :
                   if (c) {
                      return p2;
                   }else if(p2 != i){
                      p2++;
                      goto label_002a ;
                   }
                }else {
                   i1 = i1 + 1;
                }
             }else {
                c = 0;
                goto label_0040 ;
             }
          }
       }
       return -1;
    }
    public static final String k4(String p0,char p1,String p2,String p3){
       a.p(p0, "$this$replaceAfterLast");
       a.p(p2, "replacement");
       a.p(p3, "missingDelimiterValue");
       int i = StringsKt__StringsKt.v3(p0, p1, 0, false, 6, null);
       if (i == -1) {
       }else {
          i++;
          p3 = StringsKt__StringsKt.x4(p0, i, p0.length(), p2).toString();
       }
       return p3;
    }
    public static final String k5(String p0,char p1,String p2){
       a.p(p0, "$this$substringBeforeLast");
       a.p(p2, "missingDelimiterValue");
       int i = StringsKt__StringsKt.v3(p0, p1, 0, false, 6, null);
       if (i == -1) {
       }else {
          p2 = p0.substring(0, i);
          a.o(p2, "\(this as java.lang.Strin¡­ing\(startIndex, endIndex\)");
       }
       return p2;
    }
    public static int l3(CharSequence p0,Collection p1,int p2,boolean p3,int p4,Object p5){
       if (p4 & 0x02) {
          p2 = 0;
       }
       if (p4 & 0x04) {
          p3 = false;
       }
       return StringsKt__StringsKt.j3(p0, p1, p2, p3);
    }
    public static final String l4(String p0,String p1,String p2,String p3){
       a.p(p0, "$this$replaceAfterLast");
       a.p(p1, "delimiter");
       a.p(p2, "replacement");
       a.p(p3, "missingDelimiterValue");
       int i = StringsKt__StringsKt.w3(p0, p1, 0, false, 6, null);
       if (i == -1) {
       }else {
          p3 = StringsKt__StringsKt.x4(p0, (i + p1.length()), p0.length(), p2).toString();
       }
       return p3;
    }
    public static final String l5(String p0,String p1,String p2){
       a.p(p0, "$this$substringBeforeLast");
       a.p(p1, "delimiter");
       a.p(p2, "missingDelimiterValue");
       int i = StringsKt__StringsKt.w3(p0, p1, 0, false, 6, null);
       if (i == -1) {
       }else {
          p2 = p0.substring(0, i);
          a.o(p2, "\(this as java.lang.Strin¡­ing\(startIndex, endIndex\)");
       }
       return p2;
    }
    public static int m3(CharSequence p0,char[] p1,int p2,boolean p3,int p4,Object p5){
       if (p4 & 0x02) {
          p2 = 0;
       }
       if (p4 & 0x04) {
          p3 = false;
       }
       return StringsKt__StringsKt.k3(p0, p1, p2, p3);
    }
    public static String m4(String p0,char p1,String p2,String p3,int p4,Object p5){
       if (p4 & 0x04) {
          p3 = p0;
       }
       return StringsKt__StringsKt.k4(p0, p1, p2, p3);
    }
    public static String m5(String p0,char p1,String p2,int p3,Object p4){
       if (p3 & 0x02) {
          p2 = p0;
       }
       return StringsKt__StringsKt.k5(p0, p1, p2);
    }
    public static final boolean n3(CharSequence p0){
       boolean b = (!p0.length())? true: false;
       return b;
    }
    public static String n4(String p0,String p1,String p2,String p3,int p4,Object p5){
       if (p4 & 0x04) {
          p3 = p0;
       }
       return StringsKt__StringsKt.l4(p0, p1, p2, p3);
    }
    public static String n5(String p0,String p1,String p2,int p3,Object p4){
       if (p3 & 0x02) {
          p2 = p0;
       }
       return StringsKt__StringsKt.l5(p0, p1, p2);
    }
    public static final boolean o3(CharSequence p0){
       return (u.S1(p0) ^ 0x01);
    }
    public static final String o4(String p0,char p1,String p2,String p3){
       a.p(p0, "$this$replaceBefore");
       a.p(p2, "replacement");
       a.p(p3, "missingDelimiterValue");
       int i = StringsKt__StringsKt.h3(p0, p1, 0, false, 6, null);
       if (i == -1) {
       }else {
          p3 = StringsKt__StringsKt.x4(p0, 0, i, p2).toString();
       }
       return p3;
    }
    public static final CharSequence o5(CharSequence p0){
       a.p(p0, "$this$trim");
       int i = p0.length() - 1;
       int i1 = 0;
       int i2 = 0;
       while (i1 <= i) {
          boolean i3 = (!i2)? i1: i;
          i3 = b.r(p0.charAt(i3));
          if (!i2) {
             if (!i3) {
                i2 = 1;
             }else {
                i1 = i1 + 1;
             }
          }else if(!i3){
             break ;
          }else {
             i = i - 1;
          }
       }
       return p0.subSequence(i1, (i + 1));
    }
    public static final boolean p3(CharSequence p0){
       boolean b = (p0.length() > 0)? true: false;
       return b;
    }
    public static final String p4(String p0,String p1,String p2,String p3){
       a.p(p0, "$this$replaceBefore");
       a.p(p1, "delimiter");
       a.p(p2, "replacement");
       a.p(p3, "missingDelimiterValue");
       int i = StringsKt__StringsKt.i3(p0, p1, 0, false, 6, null);
       if (i == -1) {
       }else {
          p3 = StringsKt__StringsKt.x4(p0, 0, i, p2).toString();
       }
       return p3;
    }
    public static final CharSequence p5(CharSequence p0,l p1){
       a.p(p0, "$this$trim");
       a.p(p1, "predicate");
       int i = p0.length() - 1;
       int i1 = 0;
       int i2 = 0;
       while (i1 <= i) {
          boolean i3 = (!i2)? i1: i;
          i3 = p1.invoke(Character.valueOf(p0.charAt(i3))).booleanValue();
          if (!i2) {
             if (!i3) {
                i2 = 1;
             }else {
                i1 = i1 + 1;
             }
          }else if(!i3){
             break ;
          }else {
             i = i - 1;
          }
       }
       return p0.subSequence(i1, (i + 1));
    }
    public static final boolean q3(CharSequence p0){
       boolean b = (p0 == null || u.S1(p0))? true: false;
       return b;
    }
    public static String q4(String p0,char p1,String p2,String p3,int p4,Object p5){
       if (p4 & 0x04) {
          p3 = p0;
       }
       return StringsKt__StringsKt.o4(p0, p1, p2, p3);
    }
    public static final CharSequence q5(CharSequence p0,char[] p1){
       a.p(p0, "$this$trim");
       a.p(p1, "chars");
       int i = p0.length() - 1;
       int i1 = 0;
       int i2 = 0;
       while (i1 <= i) {
          boolean i3 = (!i2)? i1: i;
          i3 = ArraysKt___ArraysKt.K7(p1, p0.charAt(i3));
          if (!i2) {
             if (!i3) {
                i2 = 1;
             }else {
                i1 = i1 + 1;
             }
          }else if(!i3){
             break ;
          }else {
             i = i - 1;
          }
       }
       return p0.subSequence(i1, (i + 1));
    }
    public static final boolean r3(CharSequence p0){
       boolean b = (p0 == null || !p0.length())? true: false;
       return b;
    }
    public static String r4(String p0,String p1,String p2,String p3,int p4,Object p5){
       if (p4 & 0x04) {
          p3 = p0;
       }
       return StringsKt__StringsKt.p4(p0, p1, p2, p3);
    }
    public static final String r5(String p0){
       Objects.requireNonNull(p0, "null cannot be cast to non-null type kotlin.CharSequence");
       return StringsKt__StringsKt.o5(p0).toString();
    }
    public static final r s3(CharSequence p0){
       a.p(p0, "$this$iterator");
       return new StringsKt__StringsKt$a(p0);
    }
    public static final String s4(String p0,char p1,String p2,String p3){
       a.p(p0, "$this$replaceBeforeLast");
       a.p(p2, "replacement");
       a.p(p3, "missingDelimiterValue");
       int i = StringsKt__StringsKt.v3(p0, p1, 0, false, 6, null);
       if (i == -1) {
       }else {
          p3 = StringsKt__StringsKt.x4(p0, 0, i, p2).toString();
       }
       return p3;
    }
    public static final String s5(String p0,l p1){
       a.p(p0, "$this$trim");
       a.p(p1, "predicate");
       int i = p0.length() - 1;
       int i1 = 0;
       int i2 = 0;
       while (i1 <= i) {
          boolean i3 = (!i2)? i1: i;
          i3 = p1.invoke(Character.valueOf(p0.charAt(i3))).booleanValue();
          if (!i2) {
             if (!i3) {
                i2 = 1;
             }else {
                i1 = i1 + 1;
             }
          }else if(!i3){
             break ;
          }else {
             i = i - 1;
          }
       }
       return p0.subSequence(i1, (i + 1)).toString();
    }
    public static final int t3(CharSequence p0,char p1,int p2,boolean p3){
       int i;
       a.p(p0, "$this$lastIndexOf");
       if (p3 || !p0 instanceof String) {
          char[] uocharArray = new char[]{p1};
          i = StringsKt__StringsKt.y3(p0, uocharArray, p2, p3);
       }else {
          i = p0.lastIndexOf(p1, p2);
       }
       return i;
    }
    public static final String t4(String p0,String p1,String p2,String p3){
       a.p(p0, "$this$replaceBeforeLast");
       a.p(p1, "delimiter");
       a.p(p2, "replacement");
       a.p(p3, "missingDelimiterValue");
       int i = StringsKt__StringsKt.w3(p0, p1, 0, false, 6, null);
       if (i == -1) {
       }else {
          p3 = StringsKt__StringsKt.x4(p0, 0, i, p2).toString();
       }
       return p3;
    }
    public static final String t5(String p0,char[] p1){
       a.p(p0, "$this$trim");
       a.p(p1, "chars");
       int i = p0.length() - 1;
       int i1 = 0;
       int i2 = 0;
       while (i1 <= i) {
          boolean i3 = (!i2)? i1: i;
          i3 = ArraysKt___ArraysKt.K7(p1, p0.charAt(i3));
          if (!i2) {
             if (!i3) {
                i2 = 1;
             }else {
                i1 = i1 + 1;
             }
          }else if(!i3){
             break ;
          }else {
             i = i - 1;
          }
       }
       return p0.subSequence(i1, (i + 1)).toString();
    }
    public static final int u3(CharSequence p0,String p1,int p2,boolean p3){
       a.p(p0, "$this$lastIndexOf");
       a.p(p1, "string");
       int i = (p3 || !p0 instanceof String)? StringsKt__StringsKt.f3(p0, p1, p2, 0, p3, true): p0.lastIndexOf(p1, p2);
       return i;
    }
    public static String u4(String p0,char p1,String p2,String p3,int p4,Object p5){
       if (p4 & 0x04) {
          p3 = p0;
       }
       return StringsKt__StringsKt.s4(p0, p1, p2, p3);
    }
    public static final CharSequence u5(CharSequence p0){
       a.p(p0, "$this$trimEnd");
       int i = p0.length();
       while (true) {
          i = i - 1;
          if (i >= 0) {
             if (!b.r(p0.charAt(i))) {
                p0 = p0.subSequence(0, (i + 1));
                break ;
             }
          }else {
             String str = "";
             break ;
          }
       }
       return p0;
    }
    public static int v3(CharSequence p0,char p1,int p2,boolean p3,int p4,Object p5){
       if (p4 & 0x02) {
          p2 = StringsKt__StringsKt.Z2(p0);
       }
       if (p4 & 0x04) {
          p3 = false;
       }
       return StringsKt__StringsKt.t3(p0, p1, p2, p3);
    }
    public static String v4(String p0,String p1,String p2,String p3,int p4,Object p5){
       if (p4 & 0x04) {
          p3 = p0;
       }
       return StringsKt__StringsKt.t4(p0, p1, p2, p3);
    }
    public static final CharSequence v5(CharSequence p0,l p1){
       a.p(p0, "$this$trimEnd");
       a.p(p1, "predicate");
       int i = p0.length();
       while (true) {
          i = i - 1;
          if (i < 0) {
             return "";
          }
          if (!p1.invoke(Character.valueOf(p0.charAt(i))).booleanValue()) {
             break ;
          }
       }
       return p0.subSequence(0, (i + 1));
    }
    public static int w3(CharSequence p0,String p1,int p2,boolean p3,int p4,Object p5){
       if (p4 & 0x02) {
          p2 = StringsKt__StringsKt.Z2(p0);
       }
       if (p4 & 0x04) {
          p3 = false;
       }
       return StringsKt__StringsKt.u3(p0, p1, p2, p3);
    }
    public static final String w4(CharSequence p0,Regex p1,String p2){
       return p1.replaceFirst(p0, p2);
    }
    public static final CharSequence w5(CharSequence p0,char[] p1){
       a.p(p0, "$this$trimEnd");
       a.p(p1, "chars");
       int i = p0.length();
       while (true) {
          i = i - 1;
          if (i >= 0) {
             if (!ArraysKt___ArraysKt.K7(p1, p0.charAt(i))) {
                p0 = p0.subSequence(0, (i + 1));
                break ;
             }
          }else {
             String str = "";
             break ;
          }
       }
       return p0;
    }
    public static final int x3(CharSequence p0,Collection p1,int p2,boolean p3){
       int i;
       a.p(p0, "$this$lastIndexOfAny");
       a.p(p1, "strings");
       Pair pair = StringsKt__StringsKt.U2(p0, p1, p2, p3, true);
       if (pair != null) {
          Integer first = pair.getFirst();
          if (first != null) {
             i = first.intValue();
          label_001f :
             return i;
          }
       }
       i = -1;
       goto label_001f ;
    }
    public static final CharSequence x4(CharSequence p0,int p1,int p2,CharSequence p3){
       a.p(p0, "$this$replaceRange");
       a.p(p3, "replacement");
       if (p2 < p1) {
          throw new IndexOutOfBoundsException("End index \("+p2+"\) is less than start index \("+p1+"\).");
       }
       StringBuilder str = p0;
       a.o(str, "this.append\(value, startIndex, endIndex\)");
       str = str+p3+p0;
       a.o(str, "this.append\(value, startIndex, endIndex\)");
       return str;
    }
    public static final String x5(String p0){
       Objects.requireNonNull(p0, "null cannot be cast to non-null type kotlin.CharSequence");
       return StringsKt__StringsKt.u5(p0).toString();
    }
    public static final int y3(CharSequence p0,char[] p1,int p2,boolean p3){
       a.p(p0, "$this$lastIndexOfAny");
       a.p(p1, "chars");
       if (!p3 && (p1.length == 1 && p0 instanceof String)) {
          return p0.lastIndexOf(ArraysKt___ArraysKt.Is(p1), p2);
       }
       p2 = q.u(p2, StringsKt__StringsKt.Z2(p0));
       while (true) {
          if (p2 < 0) {
             return -1;
          }
          char c = p0.charAt(p2);
          int len = p1.length;
          int i = 0;
          int i1 = 0;
          while (i1 < len) {
             if (c.v(p1[i1], c, p3)) {
                i = 1;
                break ;
             }else {
                i1 = i1 + 1;
             }
          }
          if (i) {
          }else {
             p2--;
          }
       }
       return p2;
    }
    public static final CharSequence y4(CharSequence p0,k p1,CharSequence p2){
       a.p(p0, "$this$replaceRange");
       a.p(p1, "range");
       a.p(p2, "replacement");
       return StringsKt__StringsKt.x4(p0, p1.t().intValue(), (p1.s().intValue() + 1), p2);
    }
    public static final String y5(String p0,l p1){
       CharSequence uCharSequenc;
       a.p(p0, "$this$trimEnd");
       a.p(p1, "predicate");
       int i = p0.length();
       while (true) {
          i = i - 1;
          if (i >= 0) {
             if (!p1.invoke(Character.valueOf(p0.charAt(i))).booleanValue()) {
                uCharSequenc = p0.subSequence(0, (i + 1));
                break ;
             }
          }else {
             p0 = "";
             break ;
          }
       }
       return uCharSequenc.toString();
    }
    public static int z3(CharSequence p0,Collection p1,int p2,boolean p3,int p4,Object p5){
       if (p4 & 0x02) {
          p2 = StringsKt__StringsKt.Z2(p0);
       }
       if (p4 & 0x04) {
          p3 = false;
       }
       return StringsKt__StringsKt.x3(p0, p1, p2, p3);
    }
    public static final String z4(String p0,int p1,int p2,CharSequence p3){
       Objects.requireNonNull(p0, "null cannot be cast to non-null type kotlin.CharSequence");
       return StringsKt__StringsKt.x4(p0, p1, p2, p3).toString();
    }
    public static final String z5(String p0,char[] p1){
       CharSequence uCharSequenc;
       a.p(p0, "$this$trimEnd");
       a.p(p1, "chars");
       int i = p0.length();
       while (true) {
          i = i - 1;
          if (i >= 0) {
             if (!ArraysKt___ArraysKt.K7(p1, p0.charAt(i))) {
                uCharSequenc = p0.subSequence(0, (i + 1));
                break ;
             }
          }else {
             p0 = "";
             break ;
          }
       }
       return uCharSequenc.toString();
    }
}
