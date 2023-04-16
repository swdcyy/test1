package com.meizu.cloud.pushsdk.c.c.f;
import com.meizu.cloud.pushsdk.c.c.f$a;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import com.meizu.cloud.pushsdk.c.c.f$1;
import com.meizu.cloud.pushsdk.c.g.b;
import java.lang.Character;
import java.lang.StringBuilder;
import java.util.ArrayList;
import com.meizu.cloud.pushsdk.c.c.f$a$a;
import com.meizu.cloud.pushsdk.c.c.m;
import java.util.Iterator;
import java.util.Collections;
import java.util.Collection;

public class f	// class@0014d2
{
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;
    public final List g;
    public final List h;
    public final String i;
    public final String j;
    public static final char[] a;

    static {
       f.a = new char[16]{'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
    }
    public void f(f$a p0){
       super();
       this.b = p0.a;
       this.c = f.a(p0.b, false);
       this.d = f.a(p0.c, false);
       this.e = p0.d;
       this.f = p0.a();
       this.g = this.a(p0.f, false);
       f$a g = p0.g;
       String str = null;
       List list = (g != null)? this.a(g, true): str;
       this.h = list;
       g = p0.h;
       if (g != null) {
          str = f.a(g, false);
       }
       this.i = str;
       this.j = p0.toString();
       return;
    }
    public void f(f$a p0,f$1 p1){
       super(p0);
    }
    public static int a(char p0){
       return f.b(p0);
    }
    public static int a(String p0){
       if (("http").equals(p0)) {
          return 80;
       }
       if (("https").equals(p0)) {
          return 443;
       }
       return -1;
    }
    public static String a(f p0){
       return p0.b;
    }
    public static String a(String p0,int p1,int p2,String p3,boolean p4,boolean p5,boolean p6,boolean p7){
       return f.b(p0, p1, p2, p3, p4, p5, p6, p7);
    }
    public static String a(String p0,int p1,int p2,boolean p3){
       return f.b(p0, p1, p2, p3);
    }
    public static String a(String p0,String p1,boolean p2,boolean p3,boolean p4,boolean p5){
       return f.b(p0, 0, p0.length(), p1, p2, p3, p4, p5);
    }
    public static String a(String p0,boolean p1){
       return f.b(p0, 0, p0.length(), p1);
    }
    public static void a(b p0,String p1,int p2,int p3,String p4,boolean p5,boolean p6,boolean p7,boolean p8){
       int i = p3;
       b uob = null;
       for (int i1 = p2; i1 < i; i1 = i1 + Character.charCount(i2)) {
          int i2 = (p1).codePointAt(i1);
          if (i2 == 43 && p7) {
             String str = (p5)? "+": "%2B";
             p0.a(str);
          }else if(f.a(i2, i1, p1, p3, p4, p5, p6, p7, p8)){
             if (uob == null) {
                uob = new b();
             }
             uob.a(i2);
             while (!uob.c()) {
                int i3 = uob.f() & 0x00ff;
                p0.b(37);
                char[] a = f.a;
                int i4 = i3 >> 4;
                i4 = i4 & 0x0f;
                p0.b(a[i4]);
                i3 = i3 & 0x0f;
                p0.b(a[i3]);
             }
          }else {
             p0.a(i2);
          }
       }
       return;
    }
    public static void a(b p0,String p1,int p2,int p3,boolean p4){
       while (p2 < p3) {
          int i = p1.codePointAt(p2);
          if (i == 37) {
             int i1 = p2 + 2;
             if (i1 < p3) {
                int i2 = p2 + 1;
                i2 = f.b(p1.charAt(i2));
                int i3 = f.b(p1.charAt(i1));
                if (i2 != -1 && i3 != -1) {
                   p2 = i2 << 4;
                   p2 = p2 + i3;
                   p0.b(p2);
                   p2 = i1;
                }else {
                label_0039 :
                   p0.a(i);
                }
             }else if(i == 43 && p4){
                p0.b(32);
             }else {
                goto label_0039 ;
             }
          }else {
             goto label_002d ;
          }
          p2 = p2 + Character.charCount(i);
       }
       return;
    }
    public static void a(StringBuilder p0,List p1){
       int i = p1.size();
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          p0+'/'+p1.get(i1);
       }
       return;
    }
    public static boolean a(int p0,int p1,String p2,int p3,String p4,boolean p5,boolean p6,boolean p7,boolean p8){
       boolean b = true;
       if (p0 >= 32 && p0 != 127) {
          if (p0 >= 128 && p8) {
             return b;
          }else if(p4.indexOf(p0) != -1){
             return b;
          }else if(p6 && !f.a(p2, p1, p3)){
             p1 = 1;
          }else {
             p1 = 0;
          }
          p1 = (!p5 || p1)? 1: 0;
          if (p0 == 37 && p1) {
             return b;
          }else if(p0 == 43 && p7){
             b = false;
          }
       }
       return b;
    }
    public static boolean a(String p0,int p1,int p2){
       int i = p1 + 2;
       int i1 = 1;
       if (i >= p2 || (p0.charAt(p1) != '%' || (f.b(p0.charAt((p1 + i1))) == -1 || f.b(p0.charAt(i)) == -1))) {
          i1 = false;
       }
       return i1;
    }
    public static int b(char p0){
       char c = '0';
       if (p0 >= c && p0 <= '9') {
          return (p0 - c);
       }
       c = 'a';
       if (p0 < c || p0 > 'f') {
          c = 'A';
          if (p0 < c || p0 > 'F') {
             return -1;
          }
       }
       return ((p0 - c) + 10);
    }
    public static String b(f p0){
       return p0.e;
    }
    public static String b(String p0,int p1,int p2,String p3,boolean p4,boolean p5,boolean p6,boolean p7){
       int i = p1;
       int i1 = p2;
       while (true) {
          if (i >= i1) {
             return p0.substring(p1, p2);
          }
          int i2 = p0.codePointAt(i);
          if (f.a(i2, i, p0, p2, p3, p4, p5, p6, p7)) {
             break ;
          }else {
             i = i + Character.charCount(i2);
          }
       }
       b uob = new b();
       uob.a(p0, p1, i);
       f.a(uob, p0, i, p2, p3, p4, p5, p6, p7);
       return uob.h();
    }
    public static String b(String p0,int p1,int p2,boolean p3){
       int i = p1;
       while (true) {
          if (i >= p2) {
             return p0.substring(p1, p2);
          }
          char c = p0.charAt(i);
          int i1 = 0;
          int i2 = (c == '%')? 1: 0;
          if (c == '+' && p3) {
             i1 = 1;
          }
          if (i2 || i1) {
             break ;
          }else {
             i = i + 1;
          }
       }
       b uob = new b();
       uob.a(p0, p1, i);
       f.a(uob, p0, i, p2, p3);
       return uob.h();
    }
    public static List b(String p0){
       String str;
       ArrayList uArrayList = new ArrayList();
       for (int i = 0; i <= p0.length(); i = i1 + 1) {
          int i1 = p0.indexOf(38, i);
          if (i1 == -1) {
             i1 = p0.length();
          }
          int i2 = p0.indexOf(61, i);
          if (i2 == -1 || i2 > i1) {
             uArrayList.add(p0.substring(i, i1));
             str = null;
          }else {
             uArrayList.add(p0.substring(i, i2));
             i2 = i2 + 1;
             str = p0.substring(i2, i1);
          }
          uArrayList.add(str);
       }
       return uArrayList;
    }
    public static void b(StringBuilder p0,List p1){
       int i = p1.size();
       int i1 = 0;
       while (i1 < i) {
          String str = p1.get(i1);
          int i2 = i1 + 1;
          String str1 = p1.get(i2);
          if (i1 > 0) {
             p0 = p0+'&';
          }
          p0 = p0+str;
          if (str1 != null) {
             p0 = p0+'='+str1;
          }
          i1 = i1 + 2;
       }
       return;
    }
    public static int c(f p0){
       return p0.f;
    }
    public static f c(String p0){
       f$a uoa = new f$a();
       f uof = null;
       if (uoa.a(uof, p0) == f$a$a.a) {
          uof = uoa.b();
       }
       return uof;
    }
    public String a(){
       if ((this.c).isEmpty()) {
          return "";
       }
       int i = (this.b).length() + 3;
       f tj = this.j;
       return (this.j).substring(i, m.a(tj, i, tj.length(), ":@"));
    }
    public final List a(List p0,boolean p1){
       ArrayList uArrayList = new ArrayList(p0.size());
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          String str = iterator.next();
          str = (str != null)? f.a(str, p1): null;
          uArrayList.add(str);
       }
       return Collections.unmodifiableList(uArrayList);
    }
    public String b(){
       if ((this.d).isEmpty()) {
          return "";
       }
       return (this.j).substring(((this.j).indexOf(58, ((this.b).length() + 3)) + 1), (this.j).indexOf(64));
    }
    public List c(){
       int i = (this.j).indexOf(47, ((this.b).length() + 3));
       f tj = this.j;
       int i1 = m.a(tj, i, tj.length(), "?#");
       ArrayList uArrayList = new ArrayList();
       for (; i < i1; i = i2) {
          i = i + 1;
          int i2 = m.a(this.j, i, i1, 47);
          uArrayList.add((this.j).substring(i, i2));
       }
       return uArrayList;
    }
    public String d(){
       if (this.h == null) {
          return null;
       }
       int i = (this.j).indexOf(63) + 1;
       f tj = this.j;
       return (this.j).substring(i, m.a(tj, (i + 1), tj.length(), '#'));
    }
    public String e(){
       if (this.i == null) {
          return null;
       }
       return (this.j).substring(((this.j).indexOf(35) + 1));
    }
    public boolean equals(Object p0){
       boolean b = (p0 instanceof f && (p0.j).equals(this.j))? true: false;
       return b;
    }
    public f$a f(){
       f$a uoa = new f$a();
       uoa.a = this.b;
       uoa.b = this.a();
       uoa.c = this.b();
       uoa.d = this.e;
       f tf = (this.f != f.a(this.b))? this.f: -1;
       uoa.e = tf;
       uoa.f.clear();
       uoa.f.addAll(this.c());
       uoa.a(this.d());
       uoa.h = this.e();
       return uoa;
    }
    public int hashCode(){
       return (this.j).hashCode();
    }
    public String toString(){
       return this.j;
    }
}
