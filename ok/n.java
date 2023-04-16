package ok.n;
import java.lang.String;
import java.lang.Object;
import java.lang.Integer;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.Long;
import java.lang.IndexOutOfBoundsException;
import java.util.Objects;
import java.lang.NullPointerException;
import java.lang.IllegalStateException;
import java.lang.CharSequence;

public final class n	// class@00204b
{

    public static String a(int p0,int p1,String p2){
       int i = 1;
       if (p0 < 0) {
          Object[] objArray = new Object[]{p2,Integer.valueOf(p0)};
          return n.s("%s \(%s\) must not be negative", objArray);
       }else if(p1 >= 0){
          Object[] objArray1 = new Object[]{p2,Integer.valueOf(p0),Integer.valueOf(p1)};
          return n.s("%s \(%s\) must not be greater than size \(%s\)", objArray1);
       }else {
          throw new IllegalArgumentException("negative size: "+p1);
       }
    }
    public static void b(boolean p0){
       if (p0) {
          return;
       }
       throw new IllegalArgumentException();
    }
    public static void c(boolean p0,Object p1){
       if (p0) {
          return;
       }
       throw new IllegalArgumentException(String.valueOf(p1));
    }
    public static void d(boolean p0,String p1,int p2){
       if (p0) {
          return;
       }
       Object[] objArray = new Object[]{Integer.valueOf(p2)};
       throw new IllegalArgumentException(n.s(p1, objArray));
    }
    public static void e(boolean p0,String p1,long p2){
       if (p0) {
          return;
       }
       Object[] objArray = new Object[]{Long.valueOf(p2)};
       throw new IllegalArgumentException(n.s(p1, objArray));
    }
    public static void f(boolean p0,String p1,long p2,Object p3){
       if (p0) {
          return;
       }
       Object[] objArray = new Object[]{Long.valueOf(p2),p3};
       throw new IllegalArgumentException(n.s(p1, objArray));
    }
    public static void g(boolean p0,String p1,Object p2){
       if (p0) {
          return;
       }
       Object[] objArray = new Object[]{p2};
       throw new IllegalArgumentException(n.s(p1, objArray));
    }
    public static void h(boolean p0,String p1,Object p2,Object p3){
       if (p0) {
          return;
       }
       Object[] objArray = new Object[]{p2,p3};
       throw new IllegalArgumentException(n.s(p1, objArray));
    }
    public static int i(int p0,int p1){
       String str;
       if (p0 >= 0 && p0 < p1) {
          return p0;
       }
       int i = 1;
       if (p0 >= 0) {
          if (p1 >= 0) {
             Object[] objArray = new Object[]{"index",Integer.valueOf(p0),Integer.valueOf(p1)};
             str = n.s("%s \(%s\) must be less than size \(%s\)", objArray);
          }else {
             throw new IllegalArgumentException("negative size: "+p1);
          }
       }else {
          Object[] objArray1 = new Object[]{"index",Integer.valueOf(p0)};
          str = n.s("%s \(%s\) must not be negative", objArray1);
       }
       throw new IndexOutOfBoundsException(str);
    }
    public static Object j(Object p0){
       Objects.requireNonNull(p0);
       return p0;
    }
    public static Object k(Object p0,Object p1){
       if (p0 != null) {
          return p0;
       }
       throw new NullPointerException(String.valueOf(p1));
    }
    public static int l(int p0,int p1){
       if (p0 >= 0 && p0 <= p1) {
          return p0;
       }
       throw new IndexOutOfBoundsException(n.a(p0, p1, "index"));
    }
    public static void m(int p0,int p1,int p2){
       String str;
       if (p0 < 0 || (p1 >= p0 && p1 <= p2)) {
          return;
       }
       if (p0 >= 0 && p0 <= p2) {
          if (p1 < 0 || p1 > p2) {
             str = n.a(p1, p2, "end index");
          }else {
             Object[] objArray = new Object[]{Integer.valueOf(p1),Integer.valueOf(p0)};
             str = n.s("end index \(%s\) must not be less than start index \(%s\)", objArray);
          }
       }else {
          str = n.a(p0, p2, "start index");
       }
       throw new IndexOutOfBoundsException(str);
    }
    public static void n(boolean p0){
       if (p0) {
          return;
       }
       throw new IllegalStateException();
    }
    public static void o(boolean p0,Object p1){
       if (p0) {
          return;
       }
       throw new IllegalStateException(String.valueOf(p1));
    }
    public static void p(boolean p0,String p1,int p2){
       if (p0) {
          return;
       }
       Object[] objArray = new Object[]{Integer.valueOf(p2)};
       throw new IllegalStateException(n.s(p1, objArray));
    }
    public static void q(boolean p0,String p1,long p2){
       if (p0) {
          return;
       }
       Object[] objArray = new Object[]{Long.valueOf(p2)};
       throw new IllegalStateException(n.s(p1, objArray));
    }
    public static void r(boolean p0,String p1,Object p2){
       if (p0) {
          return;
       }
       Object[] objArray = new Object[]{p2};
       throw new IllegalStateException(n.s(p1, objArray));
    }
    public static String s(String p0,Object[] p1){
       p0 = String.valueOf(p0);
       int i = 0;
       if (p1 == null) {
          p1 = new Object[]{"\(Object[]\)null"};
       }
       StringBuilder str = new StringBuilder((p0.length() + (p1.length * 16)));
       int i1 = 0;
       for (; i < p1.length; i = i4) {
          int i2 = p0.indexOf("%s", i1);
          if (i2 == -1) {
             break ;
          }
          i1 = i + 1;
          str = str+p0+p1[i];
          i = i2 + 2;
          int i4 = i1;
          i1 = i;
       }
       str = str+p0;
       if (i < p1.length) {
          str = str+" ["+p1[i];
          for (int i3 = i + 1; i3 < p1.length; i3 = i) {
             i = i3 + 1;
             str = str+", "+p1[i3];
          }
          str = str+']';
       }
       return str;
    }
}
