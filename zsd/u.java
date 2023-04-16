package zsd.u;
import zsd.t;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import zsd.d;
import java.nio.charset.Charset;
import java.util.Objects;
import trd.c;
import trd.c$a;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.util.Locale;
import java.util.regex.Pattern;
import java.nio.charset.CharsetEncoder;
import java.lang.CharSequence;
import java.util.Arrays;
import nsd.r0;
import java.util.Comparator;
import usd.k;
import kotlin.text.StringsKt__StringsKt;
import java.util.Collection;
import java.util.Iterator;
import java.lang.Iterable;
import trd.l0;
import zsd.b;
import java.lang.StringBuilder;
import java.lang.IllegalArgumentException;
import java.lang.StringBuffer;
import wsd.m;
import msd.l;
import kotlin.sequences.SequencesKt___SequencesKt;
import java.util.List;
import trd.n;
import java.lang.Character;

public class u extends t	// class@002976
{

    public void u(){
       super();
    }
    public static final String A1(byte[] p0){
       a.p(p0, "$this$decodeToString");
       return new String(p0, d.a);
    }
    public static final String A2(String p0){
       Objects.requireNonNull(p0, "null cannot be cast to non-null type java.lang.String");
       p0 = p0.toLowerCase();
       a.o(p0, "\(this as java.lang.String\).toLowerCase\(\)");
       return p0;
    }
    public static final String B1(byte[] p0,int p1,int p2,boolean p3){
       a.p(p0, "$this$decodeToString");
       c.b.a(p1, p2, p0.length);
       if (!p3) {
          return new String(p0, p1, (p2 - p1), d.a);
       }
       String str = d.a.newDecoder().onMalformedInput(CodingErrorAction.REPORT).onUnmappableCharacter(CodingErrorAction.REPORT).decode(ByteBuffer.wrap(p0, p1, (p2 - p1))).toString();
       a.o(str, "decoder.decode\(ByteBuffe¡­- startIndex\)\).toString\(\)");
       return str;
    }
    public static final String B2(String p0,Locale p1){
       Objects.requireNonNull(p0, "null cannot be cast to non-null type java.lang.String");
       p0 = p0.toLowerCase(p1);
       a.o(p0, "\(this as java.lang.String\).toLowerCase\(locale\)");
       return p0;
    }
    public static String C1(byte[] p0,int p1,int p2,boolean p3,int p4,Object p5){
       if (p4 & 0x01) {
          p1 = 0;
       }
       if (p4 & 0x02) {
          p2 = p0.length;
       }
       if (p4 & 0x04) {
          p3 = false;
       }
       return u.B1(p0, p1, p2, p3);
    }
    public static final Pattern C2(String p0,int p1){
       Pattern pattern = Pattern.compile(p0, p1);
       a.o(pattern, "java.util.regex.Pattern.compile\(this, flags\)");
       return pattern;
    }
    public static final byte[] D1(String p0){
       a.p(p0, "$this$encodeToByteArray");
       byte[] bytes = p0.getBytes(d.a);
       a.o(bytes, "\(this as java.lang.String\).getBytes\(charset\)");
       return bytes;
    }
    public static Pattern D2(String p0,int p1,int p2,Object p3){
       if (p2 & 0x01) {
          p1 = 0;
       }
       Pattern pattern = Pattern.compile(p0, p1);
       a.o(pattern, "java.util.regex.Pattern.compile\(this, flags\)");
       return pattern;
    }
    public static final byte[] E1(String p0,int p1,int p2,boolean p3){
       byte[] bytes;
       a.p(p0, "$this$encodeToByteArray");
       c.b.a(p1, p2, p0.length());
       if (!p3) {
          p0 = p0.substring(p1, p2);
          a.o(p0, "\(this as java.lang.Strin¡­ing\(startIndex, endIndex\)");
          Objects.requireNonNull(p0, "null cannot be cast to non-null type java.lang.String");
          bytes = p0.getBytes(d.a);
          a.o(bytes, "\(this as java.lang.String\).getBytes\(charset\)");
          return bytes;
       }else {
          ByteBuffer uByteBuffer = d.a.newEncoder().onMalformedInput(CodingErrorAction.REPORT).onUnmappableCharacter(CodingErrorAction.REPORT).encode(CharBuffer.wrap(p0, p1, p2));
          if (uByteBuffer.hasArray() && !uByteBuffer.arrayOffset()) {
             byte[] uobyteArray = uByteBuffer.array();
             a.m(uobyteArray);
             if (uByteBuffer.remaining() == uobyteArray.length) {
                bytes = uByteBuffer.array();
                a.o(bytes, "byteBuffer.array\(\)");
             label_0072 :
                return bytes;
             }
          }
          byte[] uobyteArray1 = new byte[uByteBuffer.remaining()];
          uByteBuffer.get(uobyteArray1);
          bytes = uobyteArray1;
          goto label_0072 ;
       }
    }
    public static final String E2(String p0){
       Objects.requireNonNull(p0, "null cannot be cast to non-null type java.lang.String");
       p0 = p0.toUpperCase();
       a.o(p0, "\(this as java.lang.String\).toUpperCase\(\)");
       return p0;
    }
    public static byte[] F1(String p0,int p1,int p2,boolean p3,int p4,Object p5){
       if (p4 & 0x01) {
          p1 = 0;
       }
       if (p4 & 0x02) {
          p2 = p0.length();
       }
       if (p4 & 0x04) {
          p3 = false;
       }
       return u.E1(p0, p1, p2, p3);
    }
    public static final String F2(String p0,Locale p1){
       Objects.requireNonNull(p0, "null cannot be cast to non-null type java.lang.String");
       p0 = p0.toUpperCase(p1);
       a.o(p0, "\(this as java.lang.String\).toUpperCase\(locale\)");
       return p0;
    }
    public static final boolean G1(String p0,String p1,boolean p2){
       a.p(p0, "$this$endsWith");
       a.p(p1, "suffix");
       if (!p2) {
          return p0.endsWith(p1);
       }
       return u.Z1(p0, (p0.length() - p1.length()), p1, 0, p1.length(), true);
    }
    public static boolean H1(String p0,String p1,boolean p2,int p3,Object p4){
       if (p3 & 0x02) {
          p2 = false;
       }
       return u.G1(p0, p1, p2);
    }
    public static final boolean I1(String p0,String p1,boolean p2){
       boolean b;
       if (p0 == null) {
          b = (p1 == null)? true: false;
          return b;
       }else if(!p2){
          b = p0.equals(p1);
       }else {
          b = p0.equalsIgnoreCase(p1);
       }
       return b;
    }
    public static boolean J1(String p0,String p1,boolean p2,int p3,Object p4){
       if (p3 & 0x02) {
          p2 = false;
       }
       return u.I1(p0, p1, p2);
    }
    public static final String K1(String p0,Locale p1,Object[] p2){
       p0 = String.format(p1, p0, Arrays.copyOf(p2, p2.length));
       a.o(p0, "java.lang.String.format\(locale, this, *args\)");
       return p0;
    }
    public static final String L1(String p0,Object[] p1){
       p0 = String.format(p0, Arrays.copyOf(p1, p1.length));
       a.o(p0, "java.lang.String.format\(this, *args\)");
       return p0;
    }
    public static final String M1(r0 p0,String p1,Object[] p2){
       String str = String.format(p1, Arrays.copyOf(p2, p2.length));
       a.o(str, "java.lang.String.format\(format, *args\)");
       return str;
    }
    public static final String N1(r0 p0,Locale p1,String p2,Object[] p3){
       String str = String.format(p1, p2, Arrays.copyOf(p3, p3.length));
       a.o(str, "java.lang.String.format\(locale, format, *args\)");
       return str;
    }
    public static final String O1(String p0,Locale p1,Object[] p2){
       p0 = String.format(p1, p0, Arrays.copyOf(p2, p2.length));
       a.o(p0, "java.lang.String.format\(locale, this, *args\)");
       return p0;
    }
    public static final String P1(r0 p0,Locale p1,String p2,Object[] p3){
       String str = String.format(p1, p2, Arrays.copyOf(p3, p3.length));
       a.o(str, "java.lang.String.format\(locale, format, *args\)");
       return str;
    }
    public static final Comparator Q1(r0 p0){
       a.p(p0, "$this$CASE_INSENSITIVE_ORDER");
       Comparator cASE_INSENSI = String.CASE_INSENSITIVE_ORDER;
       a.o(cASE_INSENSI, "java.lang.String.CASE_INSENSITIVE_ORDER");
       return cASE_INSENSI;
    }
    public static final String R1(String p0){
       Objects.requireNonNull(p0, "null cannot be cast to non-null type java.lang.String");
       p0 = p0.intern();
       a.o(p0, "\(this as java.lang.String\).intern\(\)");
       return p0;
    }
    public static final boolean S1(CharSequence p0){
       int i;
       a.p(p0, "$this$isBlank");
       boolean b = false;
       if (p0.length()) {
          k ok = StringsKt__StringsKt.Y2(p0);
          if (!ok instanceof Collection || !ok.isEmpty()) {
             Iterator iterator = ok.iterator();
             while (true) {
                if (iterator.hasNext()) {
                   if (!b.r(p0.charAt(iterator.b()))) {
                      i = 0;
                      break ;
                   }
                }
             }
             if (!i) {
             label_003f :
                return b;
             }
          }
          i = 1;
          goto label_003c ;
       }
       b = true;
       goto label_003f ;
    }
    public static final int T1(String p0,char p1,int p2){
       Objects.requireNonNull(p0, "null cannot be cast to non-null type java.lang.String");
       return p0.indexOf(p1, p2);
    }
    public static final int U1(String p0,String p1,int p2){
       Objects.requireNonNull(p0, "null cannot be cast to non-null type java.lang.String");
       return p0.indexOf(p1, p2);
    }
    public static final int V1(String p0,char p1,int p2){
       Objects.requireNonNull(p0, "null cannot be cast to non-null type java.lang.String");
       return p0.lastIndexOf(p1, p2);
    }
    public static final int W1(String p0,String p1,int p2){
       Objects.requireNonNull(p0, "null cannot be cast to non-null type java.lang.String");
       return p0.lastIndexOf(p1, p2);
    }
    public static final int X1(String p0,int p1,int p2){
       Objects.requireNonNull(p0, "null cannot be cast to non-null type java.lang.String");
       return p0.offsetByCodePoints(p1, p2);
    }
    public static final boolean Y1(CharSequence p0,int p1,CharSequence p2,int p3,int p4,boolean p5){
       a.p(p0, "$this$regionMatches");
       a.p(p2, "other");
       if (p0 instanceof String && p2 instanceof String) {
          return u.Z1(p0, p1, p2, p3, p4, p5);
       }
       return StringsKt__StringsKt.R3(p0, p1, p2, p3, p4, p5);
    }
    public static final boolean Z1(String p0,int p1,String p2,int p3,int p4,boolean p5){
       a.p(p0, "$this$regionMatches");
       a.p(p2, "other");
       boolean b = (!p5)? p0.regionMatches(p1, p2, p3, p4): (p0).regionMatches(p5, p1, p2, p3, p4);
       return b;
    }
    public static boolean a2(CharSequence p0,int p1,CharSequence p2,int p3,int p4,boolean p5,int p6,Object p7){
       boolean b = (p6 & 0x10)? false: p5;
       return u.Y1(p0, p1, p2, p3, p4, b);
    }
    public static boolean b2(String p0,int p1,String p2,int p3,int p4,boolean p5,int p6,Object p7){
       boolean b = (p6 & 0x10)? false: p5;
       return u.Z1(p0, p1, p2, p3, p4, b);
    }
    public static final String c2(CharSequence p0,int p1){
       a.p(p0, "$this$repeat");
       StringBuilder str = null;
       int i = 1;
       String str1 = (p1 >= 0)? 1: null;
       if (str1) {
          str1 = "";
          if (p1) {
             if (p1 != i) {
                int i1 = p0.length();
                if (i1) {
                   if (i1 != i) {
                      str = new StringBuilder((p0.length() * p1));
                      if (i <= p1) {
                         str = str+p0;
                         while (i != p1) {
                            i = i + 1;
                         }
                      }
                      str1 = str;
                      a.o(str1, "sb.toString\(\)");
                   }else {
                      char c = p0.charAt(str);
                      char[] uocharArray = new char[p1];
                      for (; str < p1; str = str + 1) {
                         uocharArray[str] = c;
                      }
                      str1 = new String(uocharArray);
                   }
                }
             }else {
                str1 = p0.toString();
             }
          }
          return str1;
       }else {
          throw new IllegalArgumentException("Count \'n\' must be non-negative, but was "+p1+'.'.toString());
       }
    }
    public static final String d1(StringBuffer p0){
       return new String(p0);
    }
    public static final String d2(String p0,char p1,char p2,boolean p3){
       a.p(p0, "$this$replace");
       if (!p3) {
          String str = p0.replace(p1, p2);
          a.o(str, "\(this as java.lang.Strin¡­replace\(oldChar, newChar\)");
          return str;
       }else {
          char[] uocharArray = new char[]{p1};
          return SequencesKt___SequencesKt.V0(StringsKt__StringsKt.K4(p0, uocharArray, p3, 0, 4, null), String.valueOf(p2), null, null, 0, null, null, 62, null);
       }
    }
    public static final String e1(StringBuilder p0){
       return new String(p0);
    }
    public static final String e2(String p0,String p1,String p2,boolean p3){
       a.p(p0, "$this$replace");
       a.p(p1, "oldValue");
       a.p(p2, "newValue");
       String[] stringArray = new String[]{p1};
       return SequencesKt___SequencesKt.V0(StringsKt__StringsKt.L4(p0, stringArray, p3, 0, 4, null), p2, null, null, 0, null, null, 62, null);
    }
    public static final String f1(byte[] p0){
       return new String(p0, d.a);
    }
    public static String f2(String p0,char p1,char p2,boolean p3,int p4,Object p5){
       if (p4 & 0x04) {
          p3 = false;
       }
       return u.d2(p0, p1, p2, p3);
    }
    public static final String g1(byte[] p0,int p1,int p2){
       return new String(p0, p1, p2, d.a);
    }
    public static String g2(String p0,String p1,String p2,boolean p3,int p4,Object p5){
       if (p4 & 0x04) {
          p3 = false;
       }
       return u.e2(p0, p1, p2, p3);
    }
    public static final String h1(byte[] p0,int p1,int p2,Charset p3){
       return new String(p0, p1, p2, p3);
    }
    public static final String h2(String p0,char p1,char p2,boolean p3){
       a.p(p0, "$this$replaceFirst");
       int i = StringsKt__StringsKt.h3(p0, p1, 0, p3, 2, null);
       if (i < 0) {
       }else {
          p0 = StringsKt__StringsKt.x4(p0, i, (i + 1), String.valueOf(p2)).toString();
       }
       return p0;
    }
    public static final String i1(byte[] p0,Charset p1){
       return new String(p0, p1);
    }
    public static final String i2(String p0,String p1,String p2,boolean p3){
       a.p(p0, "$this$replaceFirst");
       a.p(p1, "oldValue");
       a.p(p2, "newValue");
       int i = StringsKt__StringsKt.i3(p0, p1, 0, p3, 2, null);
       if (i < 0) {
       }else {
          p0 = StringsKt__StringsKt.x4(p0, i, (p1.length() + i), p2).toString();
       }
       return p0;
    }
    public static final String j1(char[] p0){
       return new String(p0);
    }
    public static String j2(String p0,char p1,char p2,boolean p3,int p4,Object p5){
       if (p4 & 0x04) {
          p3 = false;
       }
       return u.h2(p0, p1, p2, p3);
    }
    public static final String k1(char[] p0,int p1,int p2){
       return new String(p0, p1, p2);
    }
    public static String k2(String p0,String p1,String p2,boolean p3,int p4,Object p5){
       if (p4 & 0x04) {
          p3 = false;
       }
       return u.i2(p0, p1, p2, p3);
    }
    public static final String l1(int[] p0,int p1,int p2){
       return new String(p0, p1, p2);
    }
    public static final List l2(CharSequence p0,Pattern p1,int p2){
       a.p(p0, "$this$split");
       a.p(p1, "regex");
       int i = (p2 >= 0)? 1: 0;
       if (i) {
          if (!p2) {
             p2 = -1;
          }
          String[] stringArray = p1.split(p0, p2);
          a.o(stringArray, "regex.split\(this, if \(limit == 0\) -1 else limit\)");
          return n.t(stringArray);
       }else {
          throw new IllegalArgumentException("Limit must be non-negative, but was "+p2+'.'.toString());
       }
    }
    public static final String m1(String p0){
       a.p(p0, "$this$capitalize");
       Locale default = Locale.getDefault();
       a.o(default, "Locale.getDefault\(\)");
       return u.n1(p0, default);
    }
    public static List m2(CharSequence p0,Pattern p1,int p2,int p3,Object p4){
       if (p3 & 0x02) {
          p2 = 0;
       }
       return u.l2(p0, p1, p2);
    }
    public static final String n1(String p0,Locale p1){
       a.p(p0, "$this$capitalize");
       a.p(p1, "locale");
       int i = 0;
       char c = (p0.length() > 0)? 1: 0;
       if (c) {
          c = p0.charAt(i);
          if (Character.isLowerCase(c)) {
             StringBuilder str = "";
             char c1 = Character.toTitleCase(c);
             if (c1 != Character.toUpperCase(c)) {
                str = str+c1;
             }else {
                String str1 = p0.substring(i, 1);
                a.o(str1, "\(this as java.lang.Strin¡­ing\(startIndex, endIndex\)");
                Objects.requireNonNull(str1, "null cannot be cast to non-null type java.lang.String");
                String str2 = str1.toUpperCase(p1);
                a.o(str2, "\(this as java.lang.String\).toUpperCase\(locale\)");
                str = str+str2;
             }
             p0 = p0.substring(1);
             a.o(p0, "\(this as java.lang.String\).substring\(startIndex\)");
             p0 = str+p0;
             a.o(p0, "StringBuilder\(\).apply\(builderAction\).toString\(\)");
          }
       }
       return p0;
    }
    public static final boolean n2(String p0,String p1,int p2,boolean p3){
       a.p(p0, "$this$startsWith");
       a.p(p1, "prefix");
       if (!p3) {
          return p0.startsWith(p1, p2);
       }
       return u.Z1(p0, p2, p1, 0, p1.length(), p3);
    }
    public static final int o1(String p0,int p1){
       Objects.requireNonNull(p0, "null cannot be cast to non-null type java.lang.String");
       return p0.codePointAt(p1);
    }
    public static final boolean o2(String p0,String p1,boolean p2){
       a.p(p0, "$this$startsWith");
       a.p(p1, "prefix");
       if (!p2) {
          return p0.startsWith(p1);
       }
       return u.Z1(p0, 0, p1, 0, p1.length(), p2);
    }
    public static final int p1(String p0,int p1){
       Objects.requireNonNull(p0, "null cannot be cast to non-null type java.lang.String");
       return p0.codePointBefore(p1);
    }
    public static boolean p2(String p0,String p1,int p2,boolean p3,int p4,Object p5){
       if (p4 & 0x04) {
          p3 = false;
       }
       return u.n2(p0, p1, p2, p3);
    }
    public static final int q1(String p0,int p1,int p2){
       Objects.requireNonNull(p0, "null cannot be cast to non-null type java.lang.String");
       return p0.codePointCount(p1, p2);
    }
    public static boolean q2(String p0,String p1,boolean p2,int p3,Object p4){
       if (p3 & 0x02) {
          p2 = false;
       }
       return u.o2(p0, p1, p2);
    }
    public static final int r1(String p0,String p1,boolean p2){
       a.p(p0, "$this$compareTo");
       a.p(p1, "other");
       if (p2) {
          return p0.compareToIgnoreCase(p1);
       }
       return p0.compareTo(p1);
    }
    public static final String r2(String p0,int p1){
       Objects.requireNonNull(p0, "null cannot be cast to non-null type java.lang.String");
       p0 = p0.substring(p1);
       a.o(p0, "\(this as java.lang.String\).substring\(startIndex\)");
       return p0;
    }
    public static int s1(String p0,String p1,boolean p2,int p3,Object p4){
       if (p3 & 0x02) {
          p2 = false;
       }
       return u.r1(p0, p1, p2);
    }
    public static final String s2(String p0,int p1,int p2){
       Objects.requireNonNull(p0, "null cannot be cast to non-null type java.lang.String");
       p0 = p0.substring(p1, p2);
       a.o(p0, "\(this as java.lang.Strin¡­ing\(startIndex, endIndex\)");
       return p0;
    }
    public static final String t1(char[] p0){
       a.p(p0, "$this$concatToString");
       return new String(p0);
    }
    public static final byte[] t2(String p0,Charset p1){
       Objects.requireNonNull(p0, "null cannot be cast to non-null type java.lang.String");
       byte[] bytes = p0.getBytes(p1);
       a.o(bytes, "\(this as java.lang.String\).getBytes\(charset\)");
       return bytes;
    }
    public static final String u1(char[] p0,int p1,int p2){
       a.p(p0, "$this$concatToString");
       c.b.a(p1, p2, p0.length);
       return new String(p0, p1, (p2 - p1));
    }
    public static byte[] u2(String p0,Charset p1,int p2,Object p3){
       if (p2 & 0x01) {
          p1 = d.a;
       }
       Objects.requireNonNull(p0, "null cannot be cast to non-null type java.lang.String");
       byte[] bytes = p0.getBytes(p1);
       a.o(bytes, "\(this as java.lang.String\).getBytes\(charset\)");
       return bytes;
    }
    public static String v1(char[] p0,int p1,int p2,int p3,Object p4){
       if (p3 & 0x01) {
          p1 = 0;
       }
       if (p3 & 0x02) {
          p2 = p0.length;
       }
       return u.u1(p0, p1, p2);
    }
    public static final char[] v2(String p0){
       Objects.requireNonNull(p0, "null cannot be cast to non-null type java.lang.String");
       char[] uocharArray = p0.toCharArray();
       a.o(uocharArray, "\(this as java.lang.String\).toCharArray\(\)");
       return uocharArray;
    }
    public static final boolean w1(String p0,CharSequence p1){
       Objects.requireNonNull(p0, "null cannot be cast to non-null type java.lang.String");
       return p0.contentEquals(p1);
    }
    public static final char[] w2(String p0,int p1,int p2){
       a.p(p0, "$this$toCharArray");
       c.b.a(p1, p2, p0.length());
       char[] uocharArray = new char[(p2 - p1)];
       p0.getChars(p1, p2, uocharArray, 0);
       return uocharArray;
    }
    public static final boolean x1(String p0,StringBuffer p1){
       Objects.requireNonNull(p0, "null cannot be cast to non-null type java.lang.String");
       return p0.contentEquals(p1);
    }
    public static final char[] x2(String p0,char[] p1,int p2,int p3,int p4){
       Objects.requireNonNull(p0, "null cannot be cast to non-null type java.lang.String");
       p0.getChars(p3, p4, p1, p2);
       return p1;
    }
    public static final String y1(String p0){
       a.p(p0, "$this$decapitalize");
       int i = 1;
       int i1 = 0;
       char c = (p0.length() > 0)? 1: 0;
       if (c && !Character.isLowerCase(p0.charAt(i1))) {
          String str = p0.substring(i1, i);
          a.o(str, "\(this as java.lang.Strin¡­ing\(startIndex, endIndex\)");
          Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
          str = str.toLowerCase();
          a.o(str, "\(this as java.lang.String\).toLowerCase\(\)");
          p0 = p0.substring(i);
          a.o(p0, "\(this as java.lang.String\).substring\(startIndex\)");
          p0 = str+p0;
       }
       return p0;
    }
    public static char[] y2(String p0,int p1,int p2,int p3,Object p4){
       if (p3 & 0x01) {
          p1 = 0;
       }
       if (p3 & 0x02) {
          p2 = p0.length();
       }
       return u.w2(p0, p1, p2);
    }
    public static final String z1(String p0,Locale p1){
       a.p(p0, "$this$decapitalize");
       a.p(p1, "locale");
       int i = 0;
       char c = (p0.length() > 0)? 1: 0;
       if (c && !Character.isLowerCase(p0.charAt(i))) {
          String str = p0.substring(i, 1);
          a.o(str, "\(this as java.lang.Strin¡­ing\(startIndex, endIndex\)");
          Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
          String str1 = str.toLowerCase(p1);
          a.o(str1, "\(this as java.lang.String\).toLowerCase\(locale\)");
          StringBuilder str2 = str1;
          p0 = p0.substring(1);
          a.o(p0, "\(this as java.lang.String\).substring\(startIndex\)");
          p0 = str2+p0;
       }
       return p0;
    }
    public static char[] z2(String p0,char[] p1,int p2,int p3,int p4,int p5,Object p6){
       if (p5 & 0x02) {
          p2 = 0;
       }
       if (p5 & 0x04) {
          p3 = 0;
       }
       if (p5 & 0x08) {
          p4 = p0.length();
       }
       Objects.requireNonNull(p0, "null cannot be cast to non-null type java.lang.String");
       p0.getChars(p3, p4, p1, p2);
       return p1;
    }
}
