package com.vivo.push.b;
import android.content.ServiceConnection;
import java.lang.Object;
import java.util.HashMap;
import android.content.Context;
import java.lang.String;
import java.util.concurrent.atomic.AtomicInteger;
import android.os.Handler;
import android.os.Looper;
import com.vivo.push.c;
import android.os.Handler$Callback;
import com.vivo.push.util.t;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.vivo.push.util.z;
import java.lang.StringBuilder;
import com.vivo.push.util.p;
import java.util.Map;
import android.os.Bundle;
import java.lang.InterruptedException;
import com.vivo.vms.IPCCallback;
import com.vivo.vms.IPCInvoke;
import java.lang.Throwable;
import android.content.Intent;
import com.kwai.plugin.dva.feature.core.hook.a;
import java.lang.Exception;
import android.content.ComponentName;
import android.os.IBinder;
import com.vivo.vms.IPCInvoke$Stub;

public final class b implements ServiceConnection	// class@00104a
{
    public boolean c;
    public String d;
    public Context e;
    public AtomicInteger f;
    public IPCInvoke g;
    public Object h;
    public String i;
    public Handler j;
    public static final Object a;
    public static Map b;

    static {
       b.a = new Object();
       b.b = new HashMap();
    }
    public void b(Context p0,String p1){
       super();
       this.d = null;
       this.h = new Object();
       this.j = null;
       this.e = p0;
       this.i = p1;
       int i = 1;
       this.f = new AtomicInteger(i);
       this.j = new Handler(Looper.getMainLooper(), new c(this));
       p1 = t.b(p0);
       this.d = p1;
       if (TextUtils.isEmpty(p1) || TextUtils.isEmpty(this.i)) {
          p.c(this.e, "init error : push pkgname is "+this.d+" ; action is "+this.i);
          this.c = false;
          return;
       }else if(z.a(p0, this.d) - 1260 >= 0){
          i = false;
       }
       this.c = i;
       this.b();
       return;
    }
    public static b a(Context p0,String p1){
       b uob = b.b.get(p1);
       if (uob == null) {
          Object a = b.a;
          _monitor_enter(a);
          uob = b.b.get(p1);
          if (uob == null) {
             uob = new b(p0, p1);
             b.b.put(p1, uob);
          }
          _monitor_exit(a);
       }
       return uob;
    }
    public static AtomicInteger a(b p0){
       return p0.f;
    }
    public static void b(b p0){
       p0.a(1);
    }
    public static void c(b p0){
       p0.f();
    }
    public final void a(int p0){
       this.f.set(p0);
    }
    public final boolean a(){
       String str = t.b(this.e);
       this.d = str;
       boolean b = false;
       if (TextUtils.isEmpty(str)) {
          p.c(this.e, "push pkgname is null");
          return b;
       }else if(z.a(this.e, this.d) - 1260 >= 0){
          b = true;
       }
       this.c = b;
       return b;
    }
    public final boolean a(Bundle p0){
       this.b();
       if (this.f.get() == 2) {
          b th = this.h;
          _monitor_enter(th);
          try{
             this.h.wait(2000);
          }catch(java.lang.InterruptedException e2){
             e2.printStackTrace();
          }
          _monitor_exit(th);
       }
       boolean b = true;
       try{
          int i = this.f.get();
          if (i == 4) {
             this.j.removeMessages(2);
             this.j.sendEmptyMessageDelayed(2, 0x7530);
             this.g.asyncCall(p0, null);
             return b;
          }else {
             p.d("AidlManager", ("invoke error : connect status = ").concat(String.valueOf(i)));
          }
       }catch(java.lang.Exception e7){
          p.a("AidlManager", "invoke error ", e7);
          int i1 = this.f.get();
          p.d("AidlManager", ("Enter disconnect, Connection Status: ").concat(String.valueOf(i1)));
          if (i1 != 2) {
             if (i1 != 3) {
                if (i1 == 4) {
                   this.a(b);
                   this.f();
                }
             }else {
                this.a(b);
             }
          }else {
             this.e();
             this.a(b);
          }
       }
       return false;
    }
    public final void b(){
       int i = this.f.get();
       p.d("AidlManager", ("Enter connect, Connection Status: ").concat(String.valueOf(i)));
       if (i != 4 && (i != 2 && (i == 3 || (i != 5 && this.c != null)))) {
          this.a(2);
          if (!this.c()) {
             this.a(1);
             p.a("AidlManager", "bind core service fail");
             return;
          }else {
             this.d();
          }
       }
    label_003c :
       return;
    }
    public final boolean c(){
       Intent intent = new Intent(this.i);
       b td = this.d;
       try{
          intent.setPackage(td);
          return a.a(this.e, intent, this, 1);
       }catch(java.lang.Exception e0){
          p.a("AidlManager", "bind core error", e0);
          return false;
       }
    }
    public final void d(){
       this.j.removeMessages(1);
       this.j.sendEmptyMessageDelayed(1, 3000);
    }
    public final void e(){
       this.j.removeMessages(1);
    }
    public final void f(){
       try{
          this.e.unbindService(this);
          return;
       }catch(java.lang.Exception e0){
          p.a("AidlManager", "On unBindServiceException:"+e0.getMessage());
          return;
       }
    }
    public final void onBindingDied(ComponentName p0){
       p.b("AidlManager", ("onBindingDied : ").concat(String.valueOf(p0)));
    }
    public final void onServiceConnected(ComponentName p0,IBinder p1){
       this.e();
       this.g = IPCInvoke$Stub.asInterface(p1);
       if (this.g == null) {
          p.d("AidlManager", "onServiceConnected error : aidl must not be null.");
          this.f();
          this.f.set(1);
          return;
       }else if(this.f.get() == 2){
          this.a(4);
       }else if(this.f.get() != 4){
          this.f();
       }
       b th = this.h;
       _monitor_enter(th);
       this.h.notifyAll();
       _monitor_exit(th);
       return;
    }
    public final void onServiceDisconnected(ComponentName p0){
       this.g = null;
       this.a(1);
    }
}
