package com.k.tran.TranSService$a;
import ax7.b$a;
import dx7.f;
import java.lang.Object;
import java.util.Objects;
import android.app.Application;
import ax7.a;
import com.kwai.wake.sp.SubProcessSp;
import gx7.j;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import java.lang.String;
import oe6.g;
import java.lang.System;
import gx7.d;
import kotlinx.coroutines.CoroutineDispatcher;
import ftd.z0;
import com.kwai.wake.service.SubProcessService$requestControl$1;
import android.content.Context;
import asd.c;
import ftd.k0;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineStart;
import msd.p;
import ftd.z1;
import kotlinx.coroutines.a;
import gx7.k;
import com.kwai.wake.service.SubProcessService$requestConfig$1;

public final class TranSService$a extends b$a	// class@000710
{

    public void TranSService$a(){
       super();
    }
    public void e0(boolean p0){
       SubProcessSp$Companion f;
       long l1;
       SubProcessSp subProcessSp;
       k a1;
       a a2;
       boolean b = p0;
       f d = f.d;
       Objects.requireNonNull(d);
       a a = f.a;
       if (a != null) {
          Application uApplication = a.a();
          if (uApplication != null) {
             f = SubProcessSp.f;
             g.a(f.a(uApplication).a.edit().putBoolean("is_background", b));
             c uoc = null;
             long l = 0;
             if (b) {
                Objects.requireNonNull(d);
                l1 = System.currentTimeMillis();
                if (!d.c()) {
                   l = f.a(uApplication).a.getLong("last_request_control_timestamp", l);
                }
                subProcessSp = f.a(uApplication);
                if ((l1 - l) - subProcessSp.a.getLong("request_control_min_interval", subProcessSp.c) >= 0) {
                   a.f(d.b, z0.f(), null, new SubProcessService$requestControl$1(uApplication, l1, uoc), 2, null);
                }else {
                   a1 = k.a;
                   a2 = f.a;
                   if (a2 != null) {
                      uoc = a2.a();
                   }
                   a1.e(uoc, "failed", "request too frequent");
                }
             }else {
                Objects.requireNonNull(d);
                l1 = System.currentTimeMillis();
                if (!d.c()) {
                   l = f.a(uApplication).a.getLong("last_request_timestamp", l);
                }
                subProcessSp = f.a(uApplication);
                if ((l1 - l) - subProcessSp.a.getLong("request_min_interval", subProcessSp.b) >= 0) {
                   a.f(d.b, z0.f(), null, new SubProcessService$requestConfig$1(uApplication, l1, uoc), 2, null);
                }else {
                   a1 = k.a;
                   a2 = f.a;
                   if (a2 != null) {
                      uoc = a2.a();
                   }
                   a1.d(uoc, "failed", "request too frequent");
                }
             }
          }
       }
       return;
    }
}
