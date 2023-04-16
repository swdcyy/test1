package com.yxcorp.gifshow.performance.monitor.artti.ArtTiMonitorInitModule;
import com.yxcorp.gifshow.performance.monitor.PerformanceBaseInitModule;
import com.yxcorp.gifshow.performance.monitor.artti.ArtTiMonitorInitModule$a;
import nsd.u;
import b76.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import o56.a;
import android.content.Context;
import com.yxcorp.utility.SystemUtil;
import java.lang.StringBuilder;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.performance.monitor.artti.ArtTiMonitorInitModule$b;
import com.yxcorp.utility.Log;
import android.os.Build$VERSION;
import com.yxcorp.utility.AbiUtil;
import kg7.a$a;
import kg7.a;
import yf7.f;
import yf7.k;
import com.kwai.performance.stability.artti.monitor.JvmtiHelper;
import com.kwai.performance.stability.crash.monitor.util.AnrWithJvmtiHelper;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.sdk.switchconfig.a;
import fg6.a;
import com.google.gson.Gson;
import com.kwai.performance.stability.crash.monitor.anr.config.AnrMonitorConfigAdv$JvmtiControl;
import com.kwai.performance.stability.crash.monitor.anr.b$d;

public final class ArtTiMonitorInitModule extends PerformanceBaseInitModule	// class@000e52
{
    public ArtTiMonitorInitModule$b q;
    public boolean r;
    public static final ArtTiMonitorInitModule$a s;

    static {
       ArtTiMonitorInitModule.s = new ArtTiMonitorInitModule$a(null);
    }
    public void ArtTiMonitorInitModule(){
       super();
    }
    public void k0(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ArtTiMonitorInitModule.class, "1")) {
          return;
       }
       if (this.r != null) {
          return;
       }
       this.r = true;
       if (!SystemUtil.L(a.B)) {
          return;
       }
       if (!this.o0()) {
          return;
       }
       StringBuilder str = "config received: alloc : ";
       ArtTiMonitorInitModule tq = this.q;
       if (tq == null) {
          a.S("sFeaturesCtlConfig");
       }
       str = str+(tq.a() / 0x100000)+"\(MB\), gc: ";
       tq = this.q;
       if (tq == null) {
          a.S("sFeaturesCtlConfig");
       }
       str = str+tq.c()+"\(ms\), "+"load length: ";
       tq = this.q;
       if (tq == null) {
          a.S("sFeaturesCtlConfig");
       }
       str = str+(tq.b() / 0x100000)+"\(MB\), stack "+"depth: ";
       tq = this.q;
       if (tq == null) {
          a.S("sFeaturesCtlConfig");
       }
       str = str+tq.e()+", enableOtherBizSupport: ";
       tq = this.q;
       if (tq == null) {
          a.S("sFeaturesCtlConfig");
       }
       Log.g("ArtTiMonitorInitModule", str+tq.d());
       int sDK_INT = Build$VERSION.SDK_INT;
       if (sDK_INT >= 26 && (sDK_INT <= 30 && AbiUtil.b())) {
          a$a uoa = new a$a();
          tq = this.q;
          if (tq == null) {
             a.S("sFeaturesCtlConfig");
          }
          uoa.i(tq.e());
          tq = this.q;
          if (tq == null) {
             a.S("sFeaturesCtlConfig");
          }
          uoa.g(tq.c());
          tq = this.q;
          if (tq == null) {
             a.S("sFeaturesCtlConfig");
          }
          uoa.e(tq.a());
          tq = this.q;
          if (tq == null) {
             a.S("sFeaturesCtlConfig");
          }
          uoa.f(tq.b());
          uoa.h(SystemUtil.I());
          tq = this.q;
          if (tq == null) {
             a.S("sFeaturesCtlConfig");
          }
          uoa.d(tq.d());
          uoa.b(false);
          uoa.c(false);
          k.a(uoa.a());
          JvmtiHelper.ensureAgentLoad();
          if (JvmtiHelper.isJDWPEnable() && !SystemUtil.I()) {
             JvmtiHelper.disableJdwp();
          }
          AnrWithJvmtiHelper.c();
       }
    label_0125 :
       return;
    }
    public final boolean o0(){
       ArtTiMonitorInitModule$b uob = ArtTiMonitorInitModule$b.class;
       Object[] objArray = null;
       String obj = PatchProxy.apply(objArray, this, ArtTiMonitorInitModule.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = a.t().c("tiMonitorJsonStrRetType", objArray);
       if (obj != null) {
          ArtTiMonitorInitModule$b uob1 = a.a.h(obj, uob);
          if (uob1 != null) {
          label_003d :
             this.q = uob1;
             ArtTiMonitorInitModule tq = this.q;
             if (tq == null) {
                a.S("sFeaturesCtlConfig");
             }
             boolean b = false;
             if (tq.disableAllFunctions != null) {
                return b;
             }else {
                AnrMonitorConfigAdv$JvmtiControl c = AnrWithJvmtiHelper.c;
                if (c != null) {
                   objArray = c.backupJvmtiConfig;
                   if (objArray == null) {
                      objArray = b$d.a.q(AnrWithJvmtiHelper.c);
                   }
                }
                if (objArray != null) {
                   uob = a.a.h(objArray, uob);
                   a.o(uob, "extraConfig.let {Gsons.K¡­esCtlConfig::class.java\)}");
                   this.q = uob;
                }
                ArtTiMonitorInitModule tq1 = this.q;
                if (tq1 == null) {
                   a.S("sFeaturesCtlConfig");
                }
                if (tq1.overheadTest > null) {
                   return true;
                }else {
                   tq1 = this.q;
                   if (tq1 == null) {
                      a.S("sFeaturesCtlConfig");
                   }
                   if (tq1.a() <= 0) {
                      tq1 = this.q;
                      if (tq1 == null) {
                         a.S("sFeaturesCtlConfig");
                      }
                      if (tq1.b() <= 0) {
                         tq1 = this.q;
                         if (tq1 == null) {
                            a.S("sFeaturesCtlConfig");
                         }
                         if (tq1.c() <= 0) {
                         label_00a5 :
                            return b;
                         }
                      }
                   }
                label_00a4 :
                   b = true;
                   goto label_00a5 ;
                }
             }
          }
       }
       ArtTiMonitorInitModule$b uob2 = new ArtTiMonitorInitModule$b(0, 0, 0, 0, 0, false, false, 127, null);
       goto label_003d ;
    }
}
