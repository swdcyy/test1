package com.kwai.feature.post.api.encode.d;
import com.yxcorp.gifshow.media.model.WatermarkEncodeConfig;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.lang.Object;
import com.kwai.feature.post.api.encode.d$a;
import com.kwai.feature.post.api.encode.d$b;
import android.content.Context;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import rq.a;
import java.lang.System;
import lnc.p3;
import java.lang.String;
import q87.c;
import java.util.HashMap;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import android.view.Display;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;
import android.os.Build$VERSION;
import cw9.c;
import java.lang.Boolean;
import v16.b;
import com.kwai.feature.post.api.encode.EncodeApiServiceManager;
import u16.d;
import com.yxcorp.utility.SystemUtil;
import ekd.w;
import u16.e;
import brd.t;
import cjd.e;
import erd.o;
import v16.c;
import t45.d;
import brd.z;
import com.kwai.feature.post.api.encode.a;
import erd.g;
import com.kwai.feature.post.api.encode.b;
import com.kwai.feature.post.api.encode.c;
import crd.b;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.StringBuilder;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.os.Bundle;
import com.kwai.robust.PatchProxyResult;
import u16.c;
import java.lang.Runnable;
import java.util.concurrent.Executor;

public class d	// class@001317
{
    public static WatermarkEncodeConfig a;
    public static final Executor b;

    static {
       d.a = new WatermarkEncodeConfig();
       d.b = Executors.newSingleThreadExecutor();
    }
    public void d(){
       super();
    }
    public void d(d$a p0){
       super();
    }
    public static d a(){
       return d$b.a;
    }
    public static void c(boolean p0,Context p1,RequestTiming p2){
       int i = 0;
       String str = "EncodeApiHelper";
       if ((System.currentTimeMillis() - a.k()) - 0x5265c00 <= 0 && p0) {
          Object[] objArray = new Object[i];
          p3.D().w(str, "initEncodeParamsIfNeeded use cache", objArray);
          return;
       }else {
          HashMap hashMap = new HashMap();
          DisplayMetrics uDisplayMetr = new DisplayMetrics();
          try{
             int i1 = 0;
             String str1 = "window";
             Context uContext = p1;
             try{
                Display defaultDispl = uContext.getSystemService(str1).getDefaultDisplay();
             label_0045 :
                if (i1 == null) {
                   return;
                }
                int sDK_INT = Build$VERSION.SDK_INT;
                c.d(i1, uDisplayMetr);
                long l = 20;
                t ot = (b.a() == null)? EncodeApiServiceManager.b.a().b(uDisplayMetr.widthPixels, uDisplayMetr.heightPixels, sDK_INT, (SystemUtil.t() >> l), (SystemUtil.s(p1) >> l), w.a(), (int)w.b(), (SystemUtil.v() >> l), (SystemUtil.u() >> l), 0, SystemUtil.A(), e.a(), p2).map(new e()): EncodeApiServiceManager.b.a().a(uDisplayMetr.widthPixels, uDisplayMetr.heightPixels, sDK_INT, (SystemUtil.t() >> l), (SystemUtil.s(p1) >> l), w.a(), (int)w.b(), (SystemUtil.v() >> l), (SystemUtil.u() >> l), b.a().booleanValue(), b.j(), b.e(), b.f(), 0, SystemUtil.A(), e.a(), p2).map(new e());
                c uoc = new c(b.a(), b.j(), b.e(), b.f(), 0);
                d.d(v11);
                ot.observeOn(d.c).doOnNext(a.b).observeOn(d.a).subscribe(b.b, c.b);
                Iterator iterator = hashMap.entrySet().iterator();
                while (iterator.hasNext()) {
                   Map$Entry uEntry = iterator.next();
                   Object[] objArray1 = new Object[i];
                   p3.D().y("EncodeConfig", uEntry.getKey()+" "+uEntry.getValue(), objArray1);
                }
                return;
             }catch(java.lang.Exception e0){
             }
             PostUtils.D(str, "initEncodeParamsIfNeeded\(\)  cant get window service ", e0);
             goto label_0045 ;
          }catch(java.lang.Exception e0){
             int i2 = p1;
             goto label_0040 ;
          }
       }
    }
    public static void d(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, d.class, "2")) {
          return;
       }
       Iterator iterator = p0.a().keySet().iterator();
       while (iterator.hasNext()) {
          String str = iterator.next();
          if (p0.a().get(str) != null) {
             String str1 = PatchProxy.applyOneRefs(str, null, c.class, "1");
             if (str1 != PatchProxyResult.class) {
             }else {
                str1 = "camera_compatibility_test_result/"+str;
             }
             PostUtils.x(str1, p0.a().get(str).toString());
          }
       }
       return;
    }
    public void b(Context p0,boolean p1,RequestTiming p2){
       if (PatchProxy.isSupport(d.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), p2, this, d.class, "1")) {
          return;
       }
       d.b.execute(new c(p1, p0, p2));
       return;
    }
}
