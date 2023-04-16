package com.kwai.framework.initmodule.FoundationInfoInitModule;
import com.kwai.framework.init.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import c76.b;
import o56.a;
import com.kwai.framework.deviceid.i;
import java.lang.StringBuilder;
import ekd.a0;
import km8.b;
import android.content.SharedPreferences;
import o56.d;
import android.content.SharedPreferences$Editor;
import oe6.g;
import e66.c;
import java.lang.Throwable;
import q87.c;
import android.app.Application;
import android.content.Context;
import com.kwai.framework.deviceid.h;
import oe6.a;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.System;
import oe6.c;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;

public class FoundationInfoInitModule extends a	// class@000b72
{

    public void FoundationInfoInitModule(){
       super();
    }
    public boolean C(){
       return true;
    }
    public boolean H7(){
       Object obj = PatchProxy.apply(null, this, FoundationInfoInitModule.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (b.b() ^ 0x01);
    }
    public int f0(){
       return 21;
    }
    public final void l0(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, FoundationInfoInitModule.class, "3")) {
          return;
       }
       a.h = a.g;
       a.a = i.f();
       _monitor_enter(i.class);
       _monitor_exit(i.class);
       a.g = i.e;
       if (!PatchProxy.applyVoid(objArray, objArray, FoundationInfoInitModule.class, "5")) {
          a.i = a0.c(a.a+"kwai.com");
       }
       if (!PatchProxy.applyVoid(objArray, objArray, FoundationInfoInitModule.class, "4")) {
          SharedPreferences sharedPrefer = b.c("gifshow", 0);
          boolean booleanx = sharedPrefer.getBoolean("first_launch_app", true);
          d.j = booleanx;
          if (booleanx) {
             g.a(sharedPrefer.edit().putBoolean("first_launch_app", 0));
          }
       }
       return;
    }
    public void n(){
       if (PatchProxy.applyVoid(null, this, FoundationInfoInitModule.class, "1")) {
          return;
       }
       Application uApplication = a.b();
       if (!PatchProxy.applyVoidOneRefs(uApplication, this, FoundationInfoInitModule.class, "2")) {
          a.b = i.e();
          if (h.b(uApplication)) {
             h.a(uApplication);
          }else {
             a.f = i.h();
             this.l0();
          }
          if (TextUtils.isEmpty(a.s())) {
             SharedPreferences$Editor uEditor = c.a.edit();
             uEditor.putLong("new_device_install_app_time", System.currentTimeMillis());
             g.a(uEditor);
          }
       }
    label_0060 :
       return;
    }
}
