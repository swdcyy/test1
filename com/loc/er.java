package com.loc.er;
import com.loc.ep;
import android.content.Context;
import java.lang.String;
import android.os.Handler;
import com.loc.es;
import java.lang.Object;
import com.loc.em;

public final class er extends ep	// class@001416
{

    public void er(Context p0,String p1,Handler p2){
       super(p0, p1, p2);
    }
    public static String a(es p0){
       if (p0 == null) {
          return "";
       }
       return p0.b();
    }
    public static void a(es p0,long p1){
       if (p0 != null) {
          p0.t = p1;
       }
       return;
    }
    public static int b(es p0){
       if (p0 == null) {
          return 99;
       }
       return p0.s;
    }
    public static long c(es p0){
       if (p0 == null) {
          return 0;
       }
       return p0.t;
    }
    public final void a(Object p0,long p1){
       er.a(p0, p1);
    }
    public final long b(){
       return (long)em.g;
    }
    public final String b(Object p0){
       return er.a(p0);
    }
    public final int c(Object p0){
       return er.b(p0);
    }
    public final long c(){
       return (long)em.h;
    }
    public final long d(Object p0){
       return er.c(p0);
    }
}
