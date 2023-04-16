package p1.d;
import java.util.ArrayList;
import p1.d$b;
import java.lang.Object;
import java.lang.Math;
import java.lang.System;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;
import java.lang.String;
import android.graphics.Path;
import java.lang.RuntimeException;
import java.lang.StringBuilder;
import java.lang.Throwable;
import p1.d$a;
import java.lang.Float;

public class d	// class@00289a
{

    public static void a(ArrayList p0,char p1,float[] p2){
       p0.add(new d$b(p1, p2));
    }
    public static boolean b(d$b[] p0,d$b[] p1){
       if (p0 == null || p1 == null) {
          return false;
       }
       if (p0.length != p1.length) {
          return false;
       }
       int i = 0;
       while (true) {
          if (i >= p0.length) {
             return true;
          }
          if (p0[i].a != p1[i].a || p0[i].b.length != p1[i].b.length) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return false;
    }
    public static float[] c(float[] p0,int p1,int p2){
       if (p1 > p2) {
          throw new IllegalArgumentException();
       }
       int len = p0.length;
       if (p1 < 0 || p1 > len) {
          throw new ArrayIndexOutOfBoundsException();
       }
       p2 = p2 - p1;
       len = Math.min(p2, (len - p1));
       float[] uofloatArray = new float[p2];
       System.arraycopy(p0, p1, uofloatArray, 0, len);
       return uofloatArray;
    }
    public static d$b[] d(String p0){
       if (p0 == null) {
          return null;
       }
       ArrayList uArrayList = new ArrayList();
       int i = 1;
       int i2 = 0;
       for (int i1 = 1; i1 < p0.length(); i1 = i3) {
          i1 = d.i(p0, i1);
          String str = (p0.substring(i2, i1)).trim();
          if (str.length() > 0) {
             d.a(uArrayList, str.charAt(0), d.h(str));
          }
          i2 = i1 + 1;
          int i3 = i2;
          i2 = i1;
       }
       if ((i1 - i2) == i && i2 < p0.length()) {
          float[] uofloatArray = new float[0];
          d.a(uArrayList, p0.charAt(i2), uofloatArray);
       }
       d$b[] uobArray = new d$b[uArrayList.size()];
       return uArrayList.toArray(uobArray);
    }
    public static Path e(String p0){
       Path path = new Path();
       d$b[] uobArray = d.d(p0);
       if (uobArray == null) {
          return null;
       }
       try{
          d$b.e(uobArray, path);
          return path;
       }catch(java.lang.RuntimeException e0){
          throw new RuntimeException("Error in parsing "+p0, e0);
       }
    }
    public static d$b[] f(d$b[] p0){
       if (p0 == null) {
          return null;
       }
       d$b[] uobArray = new d$b[p0.length];
       for (int i = 0; i < p0.length; i = i + 1) {
          uobArray[i] = new d$b(p0[i]);
       }
       return uobArray;
    }
    public static void g(String p0,int p1,d$a p2){
       p2.b = false;
       int i = p1;
       int i1 = 0;
       int i2 = 0;
       int i3 = 0;
       while (i < p0.length()) {
          char c = p0.charAt(i);
          if (c != ' ') {
             if (c != 'E' && c != 'e') {
                switch (c){
                    case ',':
                      break;
                    case '-':
                      if (i != p1 && !i2) {
                         p2.b = true;
                      }else {
                      label_0030 :
                         i2 = 0;
                      }
                      break;
                    case '.':
                      if (!i1) {
                         i1 = 1;
                         goto label_0030 ;
                      }else {
                         p2.b = true;
                      }
                      break;
                    default:
                      goto label_0030 ;
                }
             label_0036 :
                if (i3) {
                   break ;
                }
             }else {
                i2 = 1;
                goto label_0036 ;
             }
          }
          i2 = 0;
          i3 = 1;
          goto label_0036 ;
          i = i + 1;
       }
       p2.a = i;
       return;
    }
    public static float[] h(String p0){
       if (p0.charAt(0) == 'z' || p0.charAt(0) == 'Z') {
          float[] uofloatArray = new float[0];
          return uofloatArray;
       }else {
          try{
             float[] uofloatArray1 = new float[p0.length()];
             d$a uoa = new d$a();
             int i = p0.length();
             int i1 = 1;
             int i2 = 0;
             while (i1 < i) {
                d.g(p0, i1, uoa);
                d$a a = uoa.a;
                if (i1 < a) {
                   int i3 = i2 + 1;
                   uofloatArray1[i2] = Float.parseFloat(p0.substring(i1, a));
                   i2 = i3;
                }
                if (uoa.b != null) {
                   i1 = a;
                }else {
                   i1 = a + 1;
                }
             }
             return d.c(uofloatArray1, 0, i2);
          }catch(java.lang.NumberFormatException e0){
             throw new RuntimeException("error in parsing \""+p0+"\"", e0);
          }
       }
    }
    public static int i(String p0,int p1){
       while (true) {
          if (p1 >= p0.length()) {
             return p1;
          }
          char c = p0.charAt(p1);
          int i = c - 65;
          int i1 = c - 90;
          i = i * i1;
          if (i > 0) {
             i = c - 97;
             i1 = c - 122;
             i = i * i1;
             if (i > 0) {
             label_0023 :
                p1++;
             }
          }
          if (c != 'e' && c != 'E') {
             break ;
          }else {
             goto label_0023 ;
          }
       }
       return p1;
    }
    public static void j(d$b[] p0,d$b[] p1){
       int i = 0;
       while (i < p1.length) {
          p0[i].a = p1[i].a;
          for (int i1 = 0; i1 < p1[i].b.length; i1 = i1 + 1) {
             p0[i].b[i1] = p1[i].b[i1];
          }
          i = i + 1;
       }
       return;
    }
}
