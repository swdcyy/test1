package com.tencent.connect.auth.b;
import java.lang.Object;
import java.util.HashMap;
import com.tencent.connect.auth.b$a;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.Math;
import java.lang.StringBuffer;

public class b	// class@000e2c
{
    public HashMap b;
    public final String c;
    public static b a;
    public static final boolean d;
    public static int e;

    public void b(){
       super();
       this.b = new HashMap();
       this.c = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    }
    public static b a(){
       if (b.a == null) {
          b.a = new b();
       }
       return b.a;
    }
    public static int b(){
       int i = b.e + 1;
       b.e = i;
       return i;
    }
    public String a(b$a p0){
       int i = b.b();
       this.b.put(i, p0);
       return i;
    }
    public String c(){
       int i = (int)Math.ceil(((Math.random() * 20.00f) + 3.00f));
       char[] uocharArray = ("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789").toCharArray();
       int len = uocharArray.length;
       StringBuffer str = "";
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          double d = Math.random() * (double)len;
          str = str+uocharArray[(int)d];
       }
       return str;
    }
}
