package c.t.m.g.cz;
import c.t.m.g.ce;
import java.lang.Object;
import java.util.concurrent.LinkedBlockingQueue;
import java.lang.String;
import c.t.m.g.dn;
import c.t.m.g.ed;
import com.tencent.map.geolocation.util.SoUtils;
import c.t.m.g.cs;
import c.t.m.g.cz$a;
import android.os.SystemClock;
import java.util.Locale;
import java.lang.Long;
import android.os.Handler;
import java.util.concurrent.ExecutorService;
import c.t.m.g.cz$1;
import java.lang.Runnable;
import c.t.m.g.ek;
import java.lang.CharSequence;
import android.text.TextUtils;
import c.t.m.g.ej;
import java.lang.Throwable;
import android.os.Message;
import java.lang.StringBuilder;
import android.util.Pair;
import c.t.m.g.dh;
import java.util.Iterator;
import java.lang.System;
import android.os.Bundle;
import android.os.Looper;
import java.lang.Thread;
import c.t.m.g.cf;

public class cz	// class@000c34
{
    public final LinkedBlockingQueue a;
    public final ce b;
    public long c;
    public long d;
    public long e;
    public long f;
    public boolean g;
    public boolean h;
    public Handler i;
    public static cz j;

    public void cz(ce p0){
       super();
       this.b = p0;
       this.a = new LinkedBlockingQueue(3);
    }
    public static cz a(ce p0){
       if (cz.j == null) {
          _monitor_enter(cz.class);
          if (cz.j == null) {
             cz.j = new cz(p0);
          }
          _monitor_exit(cz.class);
       }
       return cz.j;
    }
    public static LinkedBlockingQueue a(cz p0){
       return p0.a;
    }
    public static void b(cz p0){
       p0.c();
    }
    public final String a(byte[] p0,int p1){
       boolean b = dn.a();
       try{
          if (ed.a) {
             ed.a("hh", "obfuscate fun_o");
          }
          if (!b && (p0 == null || SoUtils.fun_o(p0, 1) < 0)) {
             return cs.a(1, p1, 0);
          }else {
             return cs.a(1, p1, 1);
          }
       }catch(java.lang.UnsatisfiedLinkError e0){
          return null;
       }
    }
    public void a(){
       if (this.g == null) {
          return;
       }
       boolean b = false;
       this.g = b;
       this.a.clear();
       this.a.offer(cz$a.d);
       this.i = null;
       if (this.f - null) {
          Object[] objArray = new Object[]{Long.valueOf(((SystemClock.elapsedRealtime() - this.f) / 1000)),Long.valueOf(this.d),Long.valueOf(this.e),Long.valueOf(this.c)};
          String str = String.format(Locale.ENGLISH, "shutdown: duration=%ds, sent=%dB, recv=%dB, reqCount=%d", objArray);
          if (ed.a) {
             ed.a("TxRequestSender", str);
          }
       }
       this.b();
       return;
    }
    public void a(Handler p0,boolean p1){
       if (this.g != null) {
          return;
       }
       this.g = true;
       this.i = p0;
       this.h = p1;
       this.b.i().execute(new cz$1(this));
       this.f = SystemClock.elapsedRealtime();
       return;
    }
    public final void a(cz$a p0,String p1){
       this.c = this.c + 1;
       this.d = this.d + (long)cz$a.a(p0).length;
       byte[] uobyteArray = ek.a(p1.getBytes("UTF-8"));
       cz te = this.e;
       int len = (uobyteArray != null)? uobyteArray.length: 0;
       this.e = te + (long)len;
       return;
    }
    public void a(String p0){
       if (TextUtils.isEmpty(p0)) {
          return;
       }
       byte[] uobyteArray = ej.b(p0.getBytes("UTF-8"));
       String str = "hh";
       if (ed.a) {
          ed.a(str, "postWifisRequest fun_o");
       }
       SoUtils.fun_o(uobyteArray, 2);
       if (ed.a) {
          ed.a(str, "postWifisRequest fun_d");
       }
       cz$a uoa = new cz$a(3, uobyteArray, "https://ue.indoorloc.map.qq.com/?wl", null);
       uoa.b = p0;
       this.a(uoa);
       return;
    }
    public final void a(String p0,cz$a p1,Message p2){
       if (ed.a) {
          ed.b("TxRequestSender", "handleResponse");
       }
       if (true == cz$a.b(p1)) {
          if (ed.a) {
             ed.b("TxRequestSender", "handleResponse result: "+p0);
          }
          p2.obj = Pair.create(p0, p1);
          p2.what = 4999;
          p2.sendToTarget();
       }
       return;
    }
    public void a(String p0,dh p1,int p2){
       if (ed.a) {
          ed.b("TxRequestSender", p0);
       }
       byte[] uobyteArray = ek.a(p0.getBytes("GBK"));
       String str = this.a(uobyteArray, p2);
       if (ed.a) {
          ed.b("TxRequestSender", "postLocationRequest url = "+str);
       }
       cz$a uoa = new cz$a(1, uobyteArray, str, p1);
       uoa.b = p0;
       this.a(uoa);
       return;
    }
    public final boolean a(cz$a p0){
       String str;
       boolean b = (cz$a.a(p0) != null)? this.a.offer(p0): false;
       if (!b) {
          this.a.clear();
          this.a.offer(p0);
          if (cz$a.b(p0) == 2) {
             str = "List";
          }else if(cz$a.b(p0) == 3){
             str = "Wifis";
          }else {
             str = "Location";
          }
          if (ed.a) {
             ed.b("TxRequestSender", "post"+str+"Request: failed to add request,because the queue has full,so we delete the first");
          }
       }
       return b;
    }
    public final void b(){
       this.c = 0;
       this.d = 0;
       this.e = 0;
       this.f = 0;
    }
    public final void b(cz$a p0){
       boolean b;
       cz$a.d(p0);
       Iterator iterator = this.a.iterator();
       while (true) {
          if (iterator.hasNext()) {
             if (cz$a.b(iterator.next()) == cz$a.b(p0)) {
                b = true;
             }
          }else {
             b = false;
          }
          if (cz$a.e(p0) > 0 && !b) {
             if (ed.a) {
                ed.a("TxRequestSender", "retryIfNeed: times="+cz$a.e(p0));
             }
             this.a.offer(p0);
             break ;
          }
          break ;
       }
       return;
    }
    public final void c(){
       long l1;
       cz uocz = this;
       cz a = uocz.a;
       String str = null;
       while (true) {
          if (uocz.g == null) {
             return;
          }
          int i = 0;
          try{
             long l = a.take();
             try{
                if (cz$a.d == l) {
                   if (ed.a) {
                      ed.a("TxRequestSender", "run: state=[shutdown]");
                      break ;
                   }
                   break ;
                }else {
                   l1 = System.currentTimeMillis();
                   try{
                      Bundle uBundle = uocz.b.a(cz$a.c(l), cz$a.a(l), true);
                      str = uBundle.getString("result");
                      long l3 = System.currentTimeMillis() - l1;
                      ed.a("cost:"+l3+",result:"+str);
                      if (str == null) {
                         str = "";
                      }
                      uocz.a(l, str);
                      cz i3 = uocz.i;
                      l.c = l1;
                      if (uocz.h == null && (uocz.g != null && (i3 != null && i3.getLooper().getThread().isAlive()))) {
                         Message message = i3.obtainMessage();
                         message.arg1 = (int)l3;
                         uocz.a(str, l, message);
                      }
                   label_0089 :
                      if (cz$a.b(l) == 1 && !uocz.b.h().m() - i) {
                         uocz.b.h().c(l3);
                         uocz.b.h().i(uBundle.getString("req_key"));
                      }
                      Object obj = l;
                   }catch(java.io.IOException e0){
                   }
                   cz$a uoa = l;
                }
             }catch(java.lang.InterruptedException e0){
                int i2 = l;
             }catch(java.io.IOException e0){
                l1 = i;
                goto label_00bf ;
             }
          }catch(java.lang.InterruptedException e0){
          }catch(java.io.IOException e0){
             l1 = i;
          }
          long l2 = System.currentTimeMillis() - l1;
          if (ed.a) {
             ed.a("TxRequestSender", "cost:"+l2+",run: io error", e0);
          }
          uocz.b(str);
          if (ed.a) {
             ed.b("TxRequestSender", "Send timeout");
          }
          cz i1 = uocz.i;
          Looper looper = (i1 == null)? null: i1.getLooper();
          if (looper != null && looper.getThread().isAlive()) {
             i1.sendEmptyMessageDelayed(4998, i);
             goto label_0009 ;
          }else {
             goto label_0009 ;
          }
       }
       return;
    }
}
