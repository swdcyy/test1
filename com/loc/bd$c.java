package com.loc.bd$c;
import com.loc.bd;
import java.lang.String;
import java.lang.Object;
import com.loc.bd$a;
import java.io.IOException;
import java.lang.StringBuilder;
import java.util.Arrays;
import java.lang.Long;
import java.io.File;

public final class bd$c	// class@001389
{
    public final bd a;
    public final String b;
    public final long[] c;
    public boolean d;
    public bd$a e;
    public long f;

    public void bd$c(bd p0,String p1){
       this.a = p0;
       super();
       this.b = p1;
       long[] olongArray = new long[bd.f(p0)];
       this.c = olongArray;
    }
    public void bd$c(bd p0,String p1,byte p2){
       super(p0, p1);
    }
    public static long a(bd$c p0,long p1){
       p0.f = p1;
       return p1;
    }
    public static bd$a a(bd$c p0,bd$a p1){
       p0.e = p1;
       return p1;
    }
    public static IOException a(String[] p0){
       throw new IOException("unexpected journal line: "+Arrays.toString(p0));
    }
    public static void a(bd$c p0,String[] p1){
       if (p1.length != bd.f(p0.a)) {
          throw bd$c.a(p1);
       }
       try{
          for (int i = 0; i < p1.length; i = i + 1) {
             p0.c[i] = Long.parseLong(p1[i]);
          }
          return;
       }catch(java.lang.NumberFormatException e0){
          throw bd$c.a(p1);
       }
    }
    public static boolean a(bd$c p0){
       p0.d = true;
       return true;
    }
    public static bd$a b(bd$c p0){
       return p0.e;
    }
    public static long[] c(bd$c p0){
       return p0.c;
    }
    public static String d(bd$c p0){
       return p0.b;
    }
    public static boolean e(bd$c p0){
       return p0.d;
    }
    public static long f(bd$c p0){
       return p0.f;
    }
    public final File a(int p0){
       return new File(bd.g(this.a), this.b+"."+p0);
    }
    public final String a(){
       StringBuilder str = "";
       bd$c tc = this.c;
       int len = tc.length;
       for (int i = 0; i < len; i = i + 1) {
          str = str+' '+tc[i];
       }
       return str;
    }
    public final File b(int p0){
       return new File(bd.g(this.a), this.b+"."+p0+".tmp");
    }
}
