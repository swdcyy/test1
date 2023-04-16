package com.ta.utdid2.a.a.b;
import java.lang.Object;
import java.lang.String;
import com.ta.utdid2.a.a.b$b;
import com.ta.utdid2.a.a.b$a;
import java.lang.System;
import java.lang.IllegalArgumentException;
import com.ta.utdid2.a.a.b$c;
import java.lang.AssertionError;

public class b	// class@000cbf
{
    public static final boolean a = true;

    public void b(){
       super();
    }
    public static byte[] decode(String p0,int p1){
       return b.decode(p0.getBytes(), p1);
    }
    public static byte[] decode(byte[] p0,int p1){
       return b.decode(p0, 0, p0.length, p1);
    }
    public static byte[] decode(byte[] p0,int p1,int p2,int p3){
       byte[] uobyteArray = new byte[((p2 * 3) / 4)];
       b$b uob = new b$b(p3, uobyteArray);
       if (!uob.a(p0, p1, p2, true)) {
          throw new IllegalArgumentException("bad base-64");
       }
       b$a a = uob.a;
       b$a a1 = uob.a;
       if (a == a1.length) {
          return a1;
       }
       byte[] uobyteArray1 = new byte[a];
       System.arraycopy(a1, 0, uobyteArray1, 0, a);
       return uobyteArray1;
    }
    public static byte[] encode(byte[] p0,int p1){
       return b.encode(p0, 0, p0.length, p1);
    }
    public static byte[] encode(byte[] p0,int p1,int p2,int p3){
       int i1;
       b$c uoc = new b$c(p3, null);
       p3 = (p2 / 3) * 4;
       int i = 2;
       if (uoc.b != null) {
          if ((p2 % 3) > 0) {
             p3 = p3 + 4;
          }
       }else {
          i1 = p2 % 3;
          if (i1 != 1) {
             if (i1 == i) {
                p3 = p3 + 3;
             }
          }else {
             p3 = p3 + 2;
          }
       }
       if (uoc.c != null && p2 > 0) {
          i1 = ((p2 - 1) / 57) + 1;
          if (uoc.d == null) {
             i = 1;
          }
          p3 = p3 + (i1 * i);
       }
       byte[] uobyteArray = new byte[p3];
       uoc.a = uobyteArray;
       uoc.a(p0, p1, p2, 1);
       if (b.a || uoc.a == p3) {
          return uoc.a;
       }else {
          throw new AssertionError();
       }
    }
    public static String encodeToString(byte[] p0,int p1){
       try{
          return new String(b.encode(p0, p1), "US-ASCII");
       }catch(java.io.UnsupportedEncodingException e1){
          throw new AssertionError(e1);
       }
    }
}
