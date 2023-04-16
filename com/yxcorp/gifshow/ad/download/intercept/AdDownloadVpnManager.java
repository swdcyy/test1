package com.yxcorp.gifshow.ad.download.intercept.AdDownloadVpnManager;
import java.lang.Object;
import android.os.Handler;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.os.Looper;
import android.app.Activity;
import com.yxcorp.gifshow.photoad.model.AdDataWrapper;
import androidx.fragment.app.FragmentActivity;
import java.lang.ref.WeakReference;
import com.yxcorp.gifshow.ad.download.intercept.AdDownloadVpnManager$VpnFragment;
import androidx.fragment.app.c;
import androidx.fragment.app.e;
import androidx.fragment.app.Fragment;
import java.lang.Integer;
import java.lang.Long;
import android.app.Application;
import o56.a;
import android.content.Context;
import android.content.Intent;
import android.net.VpnService;
import com.kwai.framework.activitycontext.ActivityContext;
import com.yxcorp.gifshow.ad.download.intercept.AdDownloadService;
import android.os.Build$VERSION;
import android.content.ComponentName;
import com.kwai.plugin.dva.feature.core.hook.a;
import java.lang.StringBuilder;
import yx.j0;
import com.kwai.framework.model.feed.BaseFeed;
import p29.j;
import java.lang.System;
import com.yxcorp.gifshow.ad.download.intercept.b;
import java.lang.Runnable;
import mxb.j0;
import mxb.i0;
import com.yxcorp.gifshow.ad.download.intercept.a;
import erd.g;

public class AdDownloadVpnManager	// class@00175b
{
    public static AdDownloadVpnManager$b a;
    public static boolean b;
    public static boolean c;
    public static WeakReference d;
    public static Handler e;
    public static long f;

    public void AdDownloadVpnManager(){
       super();
    }
    public static Handler a(){
       Object obj = PatchProxy.apply(null, null, AdDownloadVpnManager.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (AdDownloadVpnManager.e == null) {
          AdDownloadVpnManager.e = new Handler(Looper.getMainLooper());
       }
       return AdDownloadVpnManager.e;
    }
    public static void b(Activity p0,String p1,AdDataWrapper p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, AdDownloadVpnManager.class, "5")) {
          return;
       }
       if (AdDownloadVpnManager.b || (p0 instanceof FragmentActivity && !AdDownloadVpnManager.c)) {
          AdDownloadVpnManager.c = true;
          AdDownloadVpnManager.d = new WeakReference(p0);
          Object obj = PatchProxy.applyOneRefs(p0, null, AdDownloadVpnManager.class, "6");
          if (obj != PatchProxyResult.class) {
          }else {
             obj = new AdDownloadVpnManager$VpnFragment();
             e uoe = p0.getSupportFragmentManager().beginTransaction();
             uoe.h(obj, "AdVpnServiceFragment");
             uoe.m();
          }
          obj.b = p0;
          obj.c = p1;
          obj.d = p2;
       }
    label_0053 :
       return;
    }
    public static void c(int p0,long p1){
       AdDownloadVpnManager uAdDownloadV = AdDownloadVpnManager.class;
       if (PatchProxy.isSupport(uAdDownloadV) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Long.valueOf(p1), null, uAdDownloadV, "1")) {
          return;
       }
       boolean b = ActivityContext.g().h();
       if (VpnService.prepare(a.b()) == null) {
          Intent intent = new Intent(a.b(), AdDownloadService.class);
          intent.setAction("ACTION_CONNECT");
          intent.putExtra("autoStopMs", p1);
          intent.putExtra("token", p0);
          if (Build$VERSION.SDK_INT < 26) {
             a.e(a.b(), intent);
          }else {
             String str = "from_background";
             if (b) {
                try{
                   a.e(a.b(), intent);
                }catch(java.lang.Exception e0){
                   e0.putExtra(str, true);
                   a.d(a.b(), e0);
                }
             }else {
                intent.putExtra(str, true);
                a.d(a.b(), intent);
             }
          }
       }else {
          Object[] objArray = new Object[0];
          j0.l("AdDownloadService", "StartService invoked but Not Executed. token: "+p0+", isAppOnForeground: "+b+", permission: false", objArray);
       }
       return;
    }
    public static void d(Activity p0,BaseFeed p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, AdDownloadVpnManager.class, "3")) {
          return;
       }
       if (!p0 instanceof FragmentActivity) {
          return;
       }
       AdDownloadVpnManager.d = new WeakReference(p0);
       Intent intent = new Intent(p0, AdDownloadService.class);
       intent.setAction("ACTION_CONNECT");
       intent.putExtra("token", 4132);
       intent.putExtra("autoStopMs", 0x1d4c0);
       a.e(p0, intent);
       AdDownloadVpnManager.b = true;
       AdDownloadVpnManager.f = System.currentTimeMillis();
       AdDownloadVpnManager.a().post(b.b);
       i0.a().e(655, p1).d(a.b).a();
       return;
    }
    public static void e(int p0){
       AdDownloadVpnManager uAdDownloadV = AdDownloadVpnManager.class;
       if (PatchProxy.isSupport(uAdDownloadV) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), null, uAdDownloadV, "2")) {
          return;
       }
       Intent intent = new Intent();
       intent.setAction("ACTION_DISCONNECT");
       intent.putExtra("token", p0);
       a.b().sendBroadcast(intent);
       Object[] objArray = new Object[0];
       j0.f("AdDownloadService", "stopService invoked. ", objArray);
       return;
    }
}
