package com.loc.ew;
import com.loc.ep;
import android.content.Context;
import java.lang.String;
import android.os.Handler;
import com.loc.dy;
import java.lang.Object;
import com.loc.em;

public final class ew extends ep	// class@00141e
{

    public void ew(Context p0,String p1,Handler p2){
       super(p0, p1, p2);
    }
    public static String a(dy p0){
       if (p0 == null) {
          return "";
       }
       return p0.a();
    }
    public static void a(dy p0,long p1){
       if (p0 != null) {
          p0.f = p1;
       }
       return;
    }
    public static int b(dy p0){
       if (p0 == null) {
          return -113;
       }
       return p0.c;
    }
    public static long c(dy p0){
       if (p0 == null) {
          return 0;
       }
       return p0.f;
    }
    public final void a(Object p0,long p1){
       ew.a(p0, p1);
    }
    public final long b(){
       return (long)em.e;
    }
    public final String b(Object p0){
       return ew.a(p0);
    }
    public final int c(Object p0){
       return ew.b(p0);
    }
    public final long c(){
       return (long)em.f;
    }
    public final long d(Object p0){
       return ew.c(p0);
    }
}
