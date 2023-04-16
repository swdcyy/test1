package com.yxcorp.gifshow.ad.download.intercept.AdDownloadService;
import java.lang.Runnable;
import android.net.VpnService;
import android.os.Handler;
import android.os.Looper;
import p29.a;
import p29.d;
import p29.g;
import java.lang.String;
import android.net.VpnService$Builder;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.net.InetAddress;
import java.lang.Thread;
import android.os.ParcelFileDescriptor;
import p29.f;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;
import android.util.SparseArray;
import p29.e;
import java.lang.Short;
import java.lang.System;
import p29.c;
import p29.j;
import java.lang.Boolean;
import java.lang.Number;
import java.io.FileOutputStream;
import com.yxcorp.gifshow.ad.download.intercept.InterceptConfig;
import java.util.Iterator;
import java.util.List;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.lang.Throwable;
import java.lang.RuntimeException;
import android.app.Service;
import yx.j0;
import com.yxcorp.gifshow.ad.download.intercept.AdDownloadService$VpnReceiver;
import android.content.IntentFilter;
import android.content.Context;
import android.content.BroadcastReceiver;
import android.content.Intent;
import com.kwai.performance.component.manager.receiver.UniversalReceiver;
import com.kwai.framework.activitycontext.ActivityContext;
import androidx.core.app.NotificationCompat$Builder;
import android.content.res.Resources;
import java.lang.CharSequence;
import android.app.PendingIntent;
import android.app.Application;
import o56.a;
import android.app.Notification;
import s7.b;
import android.os.SystemClock;
import java.lang.StringBuilder;

public class AdDownloadService extends VpnService implements Runnable	// class@001757
{
    public final byte[] b;
    public final d c;
    public final g d;
    public boolean e;
    public Thread f;
    public ParcelFileDescriptor g;
    public FileOutputStream h;
    public final Handler i;
    public final Runnable j;
    public AdDownloadService$VpnReceiver k;
    public Notification l;
    public int m;
    public long n;

    public void AdDownloadService(){
       super();
       this.e = false;
       this.i = new Handler(Looper.getMainLooper());
       this.j = new a(this);
       this.n = 0;
       byte[] uobyteArray = new byte[2048];
       this.b = uobyteArray;
       this.c = new d(uobyteArray, false);
       this.d = new g(uobyteArray, 20);
    }
    public final void a(String p0,VpnService$Builder p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, AdDownloadService.class, "8")) {
          return;
       }
       try{
          int i = 0;
          if (p0.equals("0.0.0.0")) {
             p1.addRoute(p0, i);
             return;
          }else {
             InetAddress[] allByName = InetAddress.getAllByName(p0);
             if (allByName != null && allByName.length > 0) {
                int len = allByName.length;
                for (; i < len; i = i + 1) {
                   p1.addRoute(allByName[i], 32);
                }
             }
             return;
          }
       }catch(java.net.UnknownHostException e0){
       }
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, AdDownloadService.class, "11")) {
          return;
       }
       boolean b = false;
       try{
          this.e(b);
          AdDownloadService tf = this.f;
          if (tf != null) {
             tf.interrupt();
          }
          try{
             if (!PatchProxy.applyVoid(null, this, AdDownloadService.class, "10")) {
                tf = this.g;
                if (tf != null) {
                   tf.close();
                   this.g = null;
                }
                this.h = null;
             }
          }catch(java.lang.Exception e0){
          }
          this.stopSelf();
          return;
       }catch(java.lang.SecurityException e0){
       }
    }
    public final void c(d p0,int p1){
       e uoe;
       int s1;
       SparseArray obj3;
       int i1;
       g obj5;
       Object obj = this;
       Object obj1 = p0;
       g og = g.class;
       f uof = f.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(AdDownloadService.class) && PatchProxy.applyVoidTwoRefs(obj1, Integer.valueOf(p1), obj, AdDownloadService.class, "6")) {
          return;
       }
       if (p0.d() == 6) {
          AdDownloadService d = obj.d;
          d.b = p0.c();
          int s = d.e();
          Object obj2 = null;
          if (PatchProxy.isSupport(uof)) {
             uoe = PatchProxy.applyOneRefs(Integer.valueOf(s), obj2, uof, "1");
             if (uoe != patchProxyRe) {
             label_0050 :
                if (uoe != null && (uoe.a != p0.b() || uoe.b != d.a())) {
                   int i = p0.b();
                   s1 = d.a();
                   if (PatchProxy.isSupport(uof)) {
                      obj3 = PatchProxy.applyThreeRefs(Integer.valueOf(s), Integer.valueOf(i), Short.valueOf(s1), null, f.class, "4");
                      if (obj3 != patchProxyRe) {
                         uoe = obj3;
                      }
                   }
                   obj3 = f.a;
                   if (obj3.size() > 64 && !PatchProxy.applyVoid(obj2, obj2, uof, "3")) {
                      long l1 = System.nanoTime();
                      i1 = obj3.size();
                      i1 = i1 - 1;
                      while (i1 >= 0) {
                         obj3 = f.a;
                         long l2 = l1 - obj3.valueAt(i1).f;
                         if (l2 - 0xdf8475800 > 0) {
                            obj3.removeAt(i1);
                         }
                      }
                   }
                   e uoe1 = new e();
                   uoe1.f = System.nanoTime();
                   uoe1.a = i;
                   uoe1.b = s1;
                   if (uoe1.c == null) {
                      uoe1.c = c.c(i);
                   }
                   f.a.put(s, uoe1);
                   uoe = uoe1;
                }
                uoe.f = System.nanoTime();
                s1 = 1;
                uoe.e = uoe.e + s1;
                i1 = p0.a() - d.c();
                int i2 = 2;
                if (uoe.e == i2 && !i1) {
                   return;
                }else if(j.f()){
                   if ((d.b() & i2) == i2) {
                      obj1.h(p0.b());
                      obj1.g(p0.e());
                      d.j(d.a());
                      d.h((short)s);
                      if (!PatchProxy.applyVoid(obj2, d, og, "5")) {
                         d.i(18);
                      }
                      d.f((d.d() + s1));
                   }else {
                      int i3 = 4;
                      if ((d.b() & i3) == i3) {
                         return;
                      }else {
                         int i4 = d.b + d.c();
                         obj1.h(p0.b());
                         obj1.g(p0.e());
                         d.j(d.a());
                         d.h((short)s);
                         d.i(16);
                         d.f((d.d() + s1));
                         obj5 = d.a;
                         if (obj5[i4] != 22 && obj5[i4] != 21) {
                            s1 = 0;
                         }
                         if (s1) {
                            obj5[(i4 + 1)] = 3;
                            obj5[(i4 + 2)] = i3;
                            obj5[(i4 + 5)] = 2;
                         }else {
                            byte[] bytes = ("#HTTP/1.1 503 Service Unavailable").getBytes();
                            System.arraycopy(bytes, 0, d.a, i4, bytes.length);
                         }
                      }
                   }
                   c uoc = c.class;
                   obj2 = null;
                   Object obj4 = PatchProxy.applyTwoRefs(obj1, d, obj2, uoc, "5");
                   if (obj4 != patchProxyRe) {
                      obj4.booleanValue();
                   }else {
                      obj5 = PatchProxy.applyOneRefs(obj1, obj2, uoc, "4");
                      if (obj5 != patchProxyRe) {
                         obj5.booleanValue();
                      }else {
                         obj5 = PatchProxy.apply(obj2, obj1, d.class, "9");
                         if (obj5 != patchProxyRe) {
                            obj5.shortValue();
                         }else {
                            c.e(obj1.a, (obj1.b + 10));
                         }
                         obj1.f(0);
                         obj1.f(c.a(0, obj1.a, obj1.b, p0.c()));
                      }
                      s = p0.a();
                      if (s >= 0) {
                         long l = (c.b(obj1.a, (obj1.b + 12), 8) + (long)(p0.d() & 0x00ff)) + (long)s;
                         Object obj6 = PatchProxy.apply(null, d, og, "6");
                         if (obj6 != patchProxyRe) {
                            obj6.shortValue();
                         }else {
                            c.e(d.a, (d.b + 16));
                         }
                         d.g(0);
                         d.g(c.a(l, d.a, d.b, s));
                      }
                   }
                   obj.h.write(obj1.a, obj1.b, p1);
                   uoe.d = uoe.d + i1;
                }
             }
          }
          uoe = f.a.get(s);
          goto label_0050 ;
       }
       return;
    }
    public final void d(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, AdDownloadService.class, "5")) {
          return;
       }
       ParcelFileDescriptor parcelFileDe = PatchProxy.apply(objArray, this, AdDownloadService.class, "7");
       if (parcelFileDe != PatchProxyResult.class) {
       }else {
          VpnService$Builder uBuilder = new VpnService$Builder(this);
          uBuilder.setMtu(2048);
          uBuilder.addAddress("10.8.0.2", 32);
          InterceptConfig interceptCon = j.c();
          if (interceptCon != null) {
             if (interceptCon.isLegal()) {
                InterceptConfig hostList = interceptCon.hostList;
                if (hostList != null) {
                   Iterator iterator = hostList.iterator();
                   while (iterator.hasNext()) {
                      this.a(iterator.next(), uBuilder);
                   }
                }
                interceptCon = interceptCon.applicationList;
                if (interceptCon != null) {
                   Iterator iterator1 = interceptCon.iterator();
                   while (iterator1.hasNext()) {
                      uBuilder.addAllowedApplication(iterator1.next());
                   }
                }
                uBuilder.setSession("AdDownloadService");
                parcelFileDe = uBuilder.establish();
             }else {
                throw new RuntimeException("Config is illegal");
             }
          }else {
             throw new RuntimeException("Rom not supported");
          }
       }
       this.g = parcelFileDe;
       this.h = new FileOutputStream(this.g.getFileDescriptor());
       FileInputStream uFileInputSt = new FileInputStream(this.g.getFileDescriptor());
       AdDownloadService uAdDownloadS = null;
       while (uAdDownloadS != -1 && this.e != null) {
          uAdDownloadS = uFileInputSt.read(this.b);
          while (uAdDownloadS > 0 && this.e != null) {
             this.c(this.c, uAdDownloadS);
          }
          Thread.sleep(100);
       }
       uFileInputSt.close();
       return;
    }
    public void e(boolean p0){
       this.e = p0;
    }
    public void onCreate(){
       if (PatchProxy.applyVoid(null, this, AdDownloadService.class, "1")) {
          return;
       }
       super.onCreate();
       Object[] objArray = new Object[0];
       j0.f("AdDownloadService", "VPNService created.", objArray);
       Thread thread = new Thread(this, "VPNServiceThread");
       this.f = thread;
       thread.start();
       this.e(true);
       this.k = new AdDownloadService$VpnReceiver(this);
       IntentFilter intentFilter = new IntentFilter();
       intentFilter.addAction("ACTION_DISCONNECT");
       intentFilter.addAction("ACTION_BACK_TO_FRONT");
       UniversalReceiver.e(this.getApplicationContext(), this.k, intentFilter);
       return;
    }
    public void onDestroy(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, AdDownloadService.class, "2")) {
          return;
       }
       this.stopForeground(true);
       super.onDestroy();
       AdDownloadService ti = this.i;
       try{
          ti.removeCallbacksAndMessages(objArray);
          if (this.k != null) {
             UniversalReceiver.f(this.getApplicationContext(), this.k);
          }
          Object[] objArray1 = new Object[0];
          j0.f("AdDownloadService", "VPNService destroyed.", objArray1);
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public int onStartCommand(Intent p0,int p1,int p2){
       Object[] obj;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(AdDownloadService.class)) {
          obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, AdDownloadService.class, "3");
          if (obj != patchProxyRe) {
             return obj.intValue();
          }
       }
       if (!PatchProxy.applyVoidOneRefs(p0, this, AdDownloadService.class, "4") && (!ActivityContext.g().h() || (p0 != null && p0.getBooleanExtra("from_background", 0)))) {
          int i = 0x289c;
          if (this.l == null) {
             NotificationCompat$Builder uBuilder = new NotificationCompat$Builder(this.getApplicationContext(), "download_channel").setSmallIcon(R.drawable.kwai_icon).setContentTitle(this.getResources().getString(R.string.arg_RES_7f1039ef)).setContentText(this.getResources().getString(R.string.arg_RES_7f1039ee)).setAutoCancel(true).setOngoing(0);
             PendingIntent pendingInten = PatchProxy.apply(null, this, AdDownloadService.class, "12");
             if (pendingInten != patchProxyRe) {
             }else {
                Intent intent = new Intent();
                intent.setAction("ACTION_BACK_TO_FRONT");
                pendingInten = PendingIntent.getBroadcast(a.b(), i, intent, 0x8000000);
             }
             this.l = uBuilder.setContentIntent(pendingInten).build();
          }
          b.i(this, i, this.l);
          Object[] objArray = new Object[0];
          j0.l("AdDownloadService", "startForegroundService", objArray);
       }
    label_00bf :
       if (p0 == null || ("ACTION_DISCONNECT").equals(p0.getAction())) {
          this.b();
          return 2;
       }else if(("ACTION_CONNECT").equals(p0.getAction())){
          long longExtra = p0.getLongExtra("autoStopMs", 0);
          if ((SystemClock.elapsedRealtime() + longExtra) - this.n > 0) {
             this.i.removeCallbacks(this.j);
             this.i.postDelayed(this.j, longExtra);
             this.n = SystemClock.elapsedRealtime() + longExtra;
             this.m = p0.getIntExtra("token", 0);
             obj = new Object[0];
             j0.c("AdDownloadService", "AutoStopTime refreshed. token: "+this.m+", autoStopMs: "+longExtra, obj);
          }
       }
       return super.onStartCommand(p0, p1, p2);
    }
    public void run(){
       Object[] objArray;
       if (PatchProxy.applyVoid(null, this, AdDownloadService.class, "9")) {
          return;
       }
       int i = 0;
       try{
          if (!j.f()) {
             this.b();
             objArray = new Object[i];
             j0.f("AdDownloadService", "VpnService terminated", objArray);
             return;
          }else {
             Object[] objArray1 = new Object[i];
             j0.f("AdDownloadService", "VPNService work thread is Running...", objArray1);
             while (this.e != null) {
                this.d();
             }
             this.b();
             objArray = new Object[i];
             j0.f("AdDownloadService", "VpnService terminated", objArray);
          }
       }catch(java.lang.InterruptedException e0){
          this.b();
          objArray = new Object[i];
          j0.f("AdDownloadService", e0, objArray);
       }catch(java.lang.Exception e3){
          j0.b("AdDownloadService", "VpnService run catch an exception.", e3);
          this.b();
          objArray = new Object[i];
          j0.f("AdDownloadService", "VpnService terminated", objArray);
       }
       return;
    }
}
