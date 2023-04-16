package com.kwai.nearby.local.speed.HomeLocalSpeedUpInitModule;
import com.kwai.framework.init.HomeCreateInitModule;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.init.CoreInitModule;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import android.app.Activity;
import wkd.b;
import com.kwai.nearby.local.speed.a;
import java.util.Objects;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;
import java.util.Map$Entry;
import crd.b;
import android.os.Handler;
import com.kwai.nearby.local.speed.QueueCaller;
import java.util.Queue;
import mrb.a;
import q87.c;
import urb.a;
import b76.a;
import com.kwai.nearby.local.speed.d;
import java.lang.Runnable;
import com.kwai.framework.init.e;
import com.yxcorp.gifshow.nearby.common.helper.LocalConfigKeyHelper;
import qrd.p;
import java.lang.Boolean;
import com.kwai.framework.exceptionhandler.constant.CrashProtectorConstants$CrashType;
import p66.a;
import yz6.u;
import gd7.i;
import com.kwai.nearby.local.speed.c;
import android.os.Bundle;
import com.kwai.nearby.local.speed.e;
import com.kwai.nearby.local.speed.b;

public class HomeLocalSpeedUpInitModule extends HomeCreateInitModule	// class@000fdf
{
    public static final int q;

    public void HomeLocalSpeedUpInitModule(){
       super();
    }
    public int f0(){
       return 15;
    }
    public List g(){
       Class[] obj = PatchProxy.apply(null, this, HomeLocalSpeedUpInitModule.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Class[]{CoreInitModule.class};
       return Lists.e(obj);
    }
    public void j0(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HomeLocalSpeedUpInitModule.class, "3")) {
          return;
       }
       a uoa = b.a(-1360575218);
       Objects.requireNonNull(uoa);
       if (!PatchProxy.applyVoid(null, uoa, a.class, "30")) {
          uoa.m = true;
          uoa.l = true;
          uoa.k = false;
          uoa.i = false;
          Iterator iterator = uoa.a.entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             if (uEntry != null && uEntry.getValue() != null) {
                uEntry.getValue().clear();
             }
          }
          uoa.a.clear();
          uoa.b.clear();
          uoa.f = null;
          a d = uoa.d;
          if (d != null && !d.isDisposed()) {
             uoa.d.dispose();
          }
          d = uoa.e;
          if (d != null && !d.isDisposed()) {
             uoa.e.dispose();
          }
          d = uoa.q;
          if (d != null && !d.isDisposed()) {
             uoa.q.dispose();
          }
          uoa.r.removeCallbacksAndMessages(null);
          uoa = uoa.s;
          Objects.requireNonNull(uoa);
          if (!PatchProxy.applyVoid(null, uoa, QueueCaller.class, "7")) {
             uoa.b = null;
             uoa.e = false;
             uoa.d.clear();
             uoa.a.removeCallbacksAndMessages(null);
          }
          Object[] objArray = new Object[false];
          a.C().y("HomeLocalAsyncFactory", "local_async_clear", objArray);
       }
       uoa = a.a();
       uoa.a = false;
       uoa.b = null;
       uoa.c = null;
       return;
    }
    public void k0(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HomeLocalSpeedUpInitModule.class, "5")) {
          return;
       }
       e.d(d.b, "localLife_preLoad_bundle");
       Object[] objArray = null;
       Boolean uBoolean = PatchProxy.apply(objArray, objArray, LocalConfigKeyHelper.class, "30");
       if (uBoolean == PatchProxyResult.class) {
          uBoolean = LocalConfigKeyHelper.D.getValue();
       }
       if (uBoolean.booleanValue()) {
          int i = 0;
          if (PatchProxy.applyVoid(objArray, this, HomeLocalSpeedUpInitModule.class, "6") || (!a.a(CrashProtectorConstants$CrashType.BAIDU_MAP) && !u.c())) {
             Object[] objArray1 = new Object[i];
             a.C().y("MapResPreLoad", "Start PreloadMapSDK", objArray1);
             e.g(new i(this), "LocalMapSDKPreLoad");
          }
       label_0062 :
          if (!PatchProxy.applyVoid(objArray, this, HomeLocalSpeedUpInitModule.class, "7")) {
             objArray = new Object[i];
             a.C().y("MapResPreLoad", "Start PreloadMapRes", objArray);
             e.g(c.b, "LocalMapSDKPreLoad");
          }
       }
       return;
    }
    public void l0(Activity p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, HomeLocalSpeedUpInitModule.class, "1")) {
          return;
       }
       if (!PatchProxy.applyVoid(null, this, HomeLocalSpeedUpInitModule.class, "2")) {
          int i = -1360575218;
          if (b.a(i).m != null) {
             b.a(i).r.postDelayed(e.b, 5000);
          }else {
             e.f(b.b, "HomeLocalSpeedUpInitModule", true, false);
          }
       }
       return;
    }
    public void n(){
    }
}
