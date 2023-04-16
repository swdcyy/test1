package com.loc.bs;
import java.lang.Object;
import java.lang.ref.WeakReference;
import android.content.Context;
import com.loc.cj;
import com.loc.bs$a;
import com.loc.ck;
import com.loc.cl;
import com.loc.bn;
import com.loc.bt;
import com.loc.al;
import java.lang.String;
import com.loc.aw;
import java.util.Random;
import java.lang.StringBuilder;
import java.lang.Integer;
import java.lang.System;
import java.lang.Long;
import com.loc.bo;
import java.lang.Throwable;
import com.loc.an;
import com.loc.br;
import java.util.List;
import java.lang.Math;
import com.loc.bi;
import java.util.Collection;

public class bs	// class@0013a9
{
    public static boolean a = false;
    public static int b;
    public static int c;
    public static WeakReference d;
    public static int e;

    public void bs(){
       super();
    }
    public static WeakReference a(){
       return bs.d;
    }
    public static void a(Context p0){
       cj.a().b(new bs$a(p0, bs$a.c));
    }
    public static void a(Context p0,byte[] p1){
       bn uobn = bt.a(bs.d);
       bt.a(p0, uobn, al.h, 1000, 0x4b000, "2");
       if (uobn.e == null) {
          uobn.e = new aw();
       }
       bo.a(Integer.toString(new Random().nextInt(100))+Long.toString(System.nanoTime()), p1, uobn);
       return;
    }
    public static synchronized void a(br p0,Context p1){
       _monitor_enter(bs.class);
       cj.a().b(new bs$a(p1, bs$a.a, p0));
       _monitor_exit(bs.class);
    }
    public static synchronized void a(List p0,Context p1){
       _monitor_enter(bs.class);
       if (p0 == null || !p0.size()) {
          _monitor_exit(bs.class);
          return;
       }else {
          cj.a().b(new bs$a(p1, bs$a.b, p0));
          _monitor_exit(bs.class);
          return;
       }
    }
    public static synchronized void a(boolean p0,int p1){
       _monitor_enter(bs.class);
       bs.a = p0;
       bs.e = Math.max(0, p1);
       _monitor_exit(bs.class);
    }
    public static int b(){
       return bs.c;
    }
    public static synchronized void b(List p0,Context p1){
       _monitor_enter(bs.class);
       List list = bi.b();
       if (list != null && list.size() > 0) {
          p0.addAll(list);
       }
       bs.a(p0, p1);
       _monitor_exit(bs.class);
       return;
    }
    public static int c(){
       return bs.e;
    }
}
