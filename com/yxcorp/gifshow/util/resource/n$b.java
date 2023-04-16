package com.yxcorp.gifshow.util.resource.n$b;
import com.yxcorp.download.k;
import coc.a;
import java.lang.String;
import boc.b;
import com.yxcorp.gifshow.util.resource.d;
import t16.a;
import com.yxcorp.download.DownloadTask;
import com.yxcorp.gifshow.util.resource.n;
import qfc.a;
import java.lang.StringBuilder;
import java.lang.Object;
import q87.c;
import android.os.SystemClock;
import java.util.Map;
import java.lang.Long;
import java.lang.Exception;
import com.yxcorp.gifshow.util.resource.p;
import boc.y;
import java.lang.Runnable;
import java.util.concurrent.Future;
import t45.c;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public class n$b extends k	// class@000cf3
{
    public final a c;
    public final String d;
    public final b e;
    public final String f;
    public final d g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final a k;

    public void n$b(a p0,String p1,b p2,String p3,d p4,boolean p5,boolean p6,boolean p7,a p8){
       this.c = p0;
       this.d = p1;
       this.e = p2;
       this.f = p3;
       this.g = p4;
       this.h = p5;
       this.i = p6;
       this.j = p7;
       this.k = p8;
       super();
    }
    public void b(DownloadTask p0){
       n.f(this.e);
       this.c.b(1002, "cancel");
    }
    public void c(DownloadTask p0){
       long l;
       a uoa = a.C();
       String str = "download success "+this.f;
       int i = 0;
       Object[] objArray = new Object[i];
       String str1 = "resourcemanager";
       try{
          uoa.y(str1, str, objArray);
          l = SystemClock.elapsedRealtime() - n.a.get(this.e).longValue();
       }catch(java.lang.Exception e0){
          e0.printStackTrace();
          l = 0;
       }
       Object[] objArray1 = new Object[]{"cost",Long.valueOf(l),"url",this.d};
       p.onEvent(this.e.getEventUrl(), "download_success", objArray1);
       this.c.e();
       y oy = new y(p0, this.e, this.d, this.h, this.i, this.j, this.k, this.c);
       c.k(l);
       return;
    }
    public void e(DownloadTask p0,Throwable p1){
       long l;
       n$b uob = this;
       Throwable throwable = p1;
       a uoa = a.C();
       String str = "resourcemanager";
       String str1 = "download fail "+uob.f;
       try{
          uoa.x(str, str1, throwable);
          l = SystemClock.elapsedRealtime() - n.a.get(uob.e).longValue();
       }catch(java.lang.Exception e0){
          e0.printStackTrace();
          l = 0;
       }
       Object[] objArray = new Object[]{"cost",Long.valueOf(l),"url",uob.d,"reason",p1.getClass().getName()+":"+p1.getMessage()};
       int i = 0;
       int i1 = 1;
       int i2 = 2;
       int i3 = 4;
       p.onEvent(uob.e.getEventUrl(), "download_fail", objArray);
       if (uob.g.b()) {
          uob.c.d();
          n.v(uob.g, uob.e, uob.h, uob.i, uob.j, uob.k, uob.c);
       }else {
          String str2 = n.r(uob.e);
          boolean b = TextUtils.x(str2);
          if (!TextUtils.x(str2)) {
             uob.c.d();
             n$b e = uob.e;
             _monitor_enter(n.class);
             Object[] objArray1 = new Object[i3];
             objArray1[i] = "current";
             objArray1[i1] = uob.d;
             objArray1[i2] = "next";
             objArray1[3] = str2;
             p.onEvent(e.getEventUrl(), "switch_cdn", objArray1);
             n.v(new d(str2), e, null, uob.i, uob.j, uob.k, uob.c);
             objArray = new Object[i];
             a.C().y("resourcemanager", "try next cdn", objArray);
             _monitor_exit(n.class);
          }
          if (b) {
             uob.c.b(1001, p1.toString());
             n.g(uob.e, throwable);
          }
       }
       return;
    }
    public void k(DownloadTask p0,long p1,long p2){
       n.h(this.e, ((float)p1 / (float)p2));
    }
    public void o(DownloadTask p0){
       this.c.c(this.d);
       n.b.put(this.e, Long.valueOf(SystemClock.elapsedRealtime()));
       n.a.put(this.e, Long.valueOf(SystemClock.elapsedRealtime()));
    }
}
