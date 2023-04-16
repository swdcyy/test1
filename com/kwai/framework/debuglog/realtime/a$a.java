package com.kwai.framework.debuglog.realtime.a$a;
import r87.b;
import java.lang.String;
import q87.d;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.logger.KwaiLog;
import java.util.Map;
import q87.f;
import com.kwai.robust.PatchProxyResult;
import g66.b;
import java.lang.Boolean;
import java.lang.StringBuilder;
import android.app.Application;
import o56.a;
import android.content.Context;
import android.content.SharedPreferences;
import oe6.o;
import java.lang.Long;
import com.kwai.framework.debuglog.realtime.a;
import com.kwai.framework.debuglog.realtime.RealTimeLogConfig;
import java.lang.System;
import g66.a;
import java.util.Timer;
import com.kwai.logger.upload.internal.s;
import com.kwai.logger.upload.model.UploadError$Error;
import t87.c;
import c97.d;
import h97.g;
import brd.t;
import u87.r;
import com.kwai.logger.upload.internal.p;
import u87.s;
import erd.g;
import crd.b;

public class a$a implements b	// class@001519
{
    public int a;
    public final String b;
    public final d c;

    public void a$a(String p0,d p1){
       this.b = p0;
       this.c = p1;
       super();
       this.a = 0;
    }
    public void a(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a$a.class, "1")) {
          return;
       }
       int i = 1;
       int i1 = this.a + i;
       this.a = i1;
       int i2 = 0;
       Object[] objArray1 = new Object[i2];
       KwaiLog.m("KwaiRealTimeLogger", "finishFlushLog", String.valueOf(i1), objArray1);
       if (this.a == f.a().size()) {
          a$a tb = this.b;
          PatchProxyResult patchProxyRe = PatchProxyResult.class;
          b uob = b.class;
          b uob1 = PatchProxy.applyOneRefs(tb, objArray, uob, "1");
          if (uob1 != patchProxyRe) {
          }else if(b.b == null){
             b.b = new b();
          }
          b.b.a = tb;
          Object obj = PatchProxy.applyOneRefs(tb, objArray, uob, "2");
          if (obj != patchProxyRe) {
             i = obj.booleanValue();
          }else if(("SCREENSHOT").equals(tb)){
             long l = Long.valueOf(o.c(a.b(), "kwai_logger_sp", i2).getLong("TRIGGER_TYPE"+tb, -1)).longValue();
             long l1 = 0;
             if (l - l1 <= 0 || (a.a.screenshotInterval - l1 > 0 && (System.currentTimeMillis() - l) - (a.a.screenshotInterval * 1000) < 0)) {
                i = false;
             }
          }
          if (i) {
             uob1 = b.b;
          }else {
             uob1 = objArray;
          }
          if (uob1 != null) {
             Object[] objArray2 = new Object[i2];
             KwaiLog.m("KwaiRealTimeLogger", "start upload", this.b, objArray2);
             a uoa = a.class;
             _monitor_enter(uoa);
             if (PatchProxy.applyVoid(objArray, objArray, uoa, "2")) {
                _monitor_exit(uoa);
             }else if(a.c != null){
                Object[] objArray3 = new Object[i2];
                KwaiLog.m("KwaiRealTimeLogger", "RealTimeLogTimer", "cancelTimer", objArray3);
                a.c.cancel();
                a.c = objArray;
             }
             _monitor_exit(uoa);
             a$a tb1 = this.b;
             d d = this.c.d;
             if (!s.d()) {
                UploadError$Error nOT_INIT = UploadError$Error.NOT_INIT;
                i = nOT_INIT.getErrCode();
                s.e(uob1, i, nOT_INIT.getErrMsg());
             }else {
                p op = new p(d, "REALTIME_LOG_RETRIEVE", tb1, uob1);
                r.b(tb1, d.a().b().getUserId(), d.a().b().P(), "REALTIME_LOG_RETRIEVE").subscribe(i, new s(uob1));
             }
          }else {
             Object[] objArray4 = new Object[i2];
             KwaiLog.m("KwaiRealTimeLogger", "listener null ", this.b, objArray4);
          }
       }
       return;
    }
}
