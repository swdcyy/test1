package com.loc.bq;
import java.lang.Object;
import java.lang.ref.WeakReference;
import android.content.Context;
import com.loc.cj;
import com.loc.bq$a;
import com.loc.ck;
import com.loc.cl;
import com.loc.bp;

public class bq	// class@0013a6
{
    public static int a = 1000;
    public static boolean b = false;
    public static int c;
    public static int d;
    public static WeakReference e;
    public static int f;

    public void bq(){
       super();
    }
    public static WeakReference a(){
       return bq.e;
    }
    public static synchronized void a(int p0,boolean p1,int p2,int p3){
       _monitor_enter(bq.class);
       bq.a = p0;
       bq.b = p1;
       if (p2 < 10 || p2 > 100) {
          p2 = 20;
       }
       bq.c = p2;
       if ((p2 / 5) > bq.f) {
          bq.f = p2 / 5;
       }
       bq.d = p3;
       _monitor_exit(bq.class);
       return;
    }
    public static void a(Context p0){
       cj.a().b(new bq$a(p0, 2));
    }
    public static synchronized void a(bp p0,Context p1){
       _monitor_enter(bq.class);
       cj.a().b(new bq$a(p1, p0));
       _monitor_exit(bq.class);
    }
    public static int b(){
       return bq.f;
    }
}
