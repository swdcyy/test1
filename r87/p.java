package r87.p;
import r87.w$a;
import android.os.Handler$Callback;
import r87.y;
import r87.q;
import r87.g;
import java.lang.String;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.LinkedBlockingQueue;
import r87.w;
import android.os.HandlerThread;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import r87.p$a;
import r87.m;
import java.util.LinkedList;
import java.lang.Thread;
import java.lang.Object;
import android.os.Message;
import r87.d;
import r87.z$a;
import android.os.Bundle;
import q87.d;
import java.io.File;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.BlockingQueue;
import java.io.FileOutputStream;
import java.io.Closeable;
import b97.a;
import java.io.IOException;
import r87.z;
import r87.b;
import java.lang.Long;
import s87.c;
import java.util.HashMap;
import java.lang.System;
import java.util.Map;

public class p extends y implements w$a, Handler$Callback	// class@002328
{
    public final w c;
    public HandlerThread d;
    public Handler e;
    public p$a f;
    public LinkedList g;
    public final ReentrantLock h;
    public final BlockingQueue i;
    public long j;
    public boolean k;
    public g l;
    public q m;
    public b n;
    public boolean o;
    public boolean p;

    public void p(q p0,g p1,String p2,int p3){
       super(p0.d);
       this.h = new ReentrantLock();
       this.i = new LinkedBlockingQueue();
       this.k = false;
       this.o = true;
       this.p = false;
       this.m = p0;
       this.l = p1;
       this.c = new w(p3, p2, this, p0.a);
       HandlerThread handlerThrea = new HandlerThread("ObiwanMMAPTracer");
       this.d = handlerThrea;
       handlerThrea.start();
       if (this.d.isAlive()) {
          this.e = new Handler(this.d.getLooper(), this);
       }
       this.j = SystemClock.elapsedRealtime();
       this.g();
       if (this.m.a == null) {
          this.f = new p$a(this);
          this.g = m.a().b();
          this.f.start();
       }
       return;
    }
    public void a(byte[] p0){
       if (p0 != null && p0.length) {
          p te = this.e;
          if (te == null) {
             return;
          }else {
             this.e.sendMessage(Message.obtain(te, 12, p0));
          }
       }
       return;
    }
    public void b(d p0,z$a p1){
       if (p1 != null && p1.b != null) {
          p te = this.e;
          if (te != null) {
             Message message = Message.obtain(te, 10, p1);
             if (p0 != null) {
                Bundle uBundle = (p0.b - -1 && (p0.c - -1 && p0.a - -1))? 1: null;
                if (uBundle) {
                   uBundle = new Bundle();
                   uBundle.putLong("start", p0.a);
                   uBundle.putLong("duration", p0.b);
                   uBundle.putLong("count", p0.c);
                   message.setData(uBundle);
                }
             }
             this.e.sendMessage(message);
          }
       }
       return;
    }
    public void c(d p0){
       p tm = this.m;
       if (tm.a != null) {
          this.c.e(p0);
          if (this.o != null) {
             this.l.h();
             this.o = false;
          }
       }else if(tm.b != null){
          tm = this.e;
          if (tm == null) {
             return;
          }else {
             this.e.sendMessage(Message.obtain(tm, 14, p0));
          }
       }else {
          this.e(p0);
       }
       return;
    }
    public final void e(d p0){
       try{
          if (this.h.tryLock(100, TimeUnit.MILLISECONDS)) {
             this.g.add(p0);
             if (this.g.size() >= 100) {
                this.i.offer(this.g);
                this.g = m.a().b();
             }
             this.h.unlock();
          }else {
             this.c.e(p0);
          }
          return;
       }catch(java.lang.InterruptedException e0){
       }
    }
    public final void f(byte[] p0,int p1){
       FileOutputStream uFileOutputS;
       int i = 0;
       try{
          File uFile = this.l.h();
          try{
             uFileOutputS = new FileOutputStream(uFile, true);
             this.i(uFileOutputS, p0, p1);
             a.a(uFileOutputS);
          label_0025 :
             return;
          }catch(java.io.IOException e5){
             Closeable uCloseable = uFileOutputS;
          }
          e5.printStackTrace();
          if (!i) {
             return;
          }
          a.a(i);
          goto label_0025 ;
       }catch(java.io.IOException e5){
          goto label_001d ;
       }
    }
    public final void g(){
       p te = this.e;
       if (te == null) {
          return;
       }
       te.sendEmptyMessageDelayed(11, 0x3a98);
       return;
    }
    public final void h(z$a p0){
       if (p0 != null) {
          z$a a = p0.a;
          if (a != null) {
             z$a b = p0.b;
             if (b != null) {
                this.f(a, b);
                w j = this.c.j;
                z b1 = j.b;
                _monitor_enter(b1);
                if (j.b.size() >= 10) {
                   _monitor_exit(b1);
                }else {
                   j.b.add(p0);
                   _monitor_exit(b1);
                }
                return;
             }
          }
       }
       return;
    }
    public boolean handleMessage(Message p0){
       p op1;
       g c;
       p op = null;
       switch (p0.what){
           case 10:
             this.j = SystemClock.elapsedRealtime();
             this.h(p0.obj);
             Bundle data = p0.getData();
             if (data == null || (!data.isEmpty() && p0.obj != null)) {
                Long obj = data.get("duration");
                Object obj1 = data.get("count");
                c obj2 = data.get("start");
                if (obj == null || (obj1 != null && obj2 != null)) {
                   Long longx = obj.longValue();
                   obj = obj1.longValue();
                   long l = obj2.longValue();
                   if (longx - op > 0 && (obj - op <= 0 || (l - op > 0 && p0.obj instanceof z$a))) {
                      obj2 = c.b();
                      long l1 = longx / obj;
                      op = this.j;
                      long l2 = (long)p0.obj.b;
                      if (obj2.e(obj2.c)) {
                         HashMap hashMap = new HashMap();
                         hashMap.put("is_success", String.valueOf(true));
                         hashMap.put("avg_wait_cost_us", String.valueOf(l1));
                         hashMap.put("logcat_count", String.valueOf(obj));
                         hashMap.put("flush_cost_ms", String.valueOf((SystemClock.elapsedRealtime() - op)));
                         hashMap.put("memory_size_byte", String.valueOf(l2));
                         hashMap.put("total_cost_ms", String.valueOf((System.currentTimeMillis() - l)));
                         obj2.d("obiwan_add_logcat_cost", hashMap);
                      }
                   }
                }
             }
             break;
           case 11:
             op1 = ((SystemClock.elapsedRealtime() - this.j) - 0x3a98 >= 0)? 1: null;
             if (op1) {
                this.h(this.c.c());
             }
             this.g();
             break;
           case 12:
             p0 = p0.obj;
             if (!p0 instanceof byte[] || (p0 != null && p0.length)) {
                this.f(p0, p0.length);
             }
             break;
           case 13:
             this.h(p0.obj);
             op1 = this.l;
             _monitor_enter(op1);
             c = op1.c;
             if (c == null || !c.exists()) {
                _monitor_exit(op1);
             }else {
                c = op1.d;
                if (c != null && (c.exists() && op1.d.length() - op > 0)) {
                   op1.e(op1.d);
                   op1.d();
                }
                _monitor_exit(op1);
             }
             op1 = this.n;
             if (op1 != null) {
                op1.a();
             }
             break;
           case 14:
             p0 = p0.obj;
             if (p0 instanceof d) {
                this.e(p0);
             }
             break;
           default:
       }
    label_014b :
       return true;
    }
    public void i(FileOutputStream p0,byte[] p1,int p2){
       p0.write(p1, 0, p2);
    }
}
