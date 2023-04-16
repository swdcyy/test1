package com.yxcorp.gifshow.performance.monitor.block.BlockMonitorInitModule;
import com.yxcorp.gifshow.performance.monitor.PerformanceBaseInitModule;
import com.yxcorp.gifshow.performance.monitor.block.BlockMonitorInitModule$a;
import nsd.u;
import b76.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import o56.d;
import com.kwai.sdk.switchconfig.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.utility.SystemUtil;
import java.util.Random;
import com.kwai.performance.fluency.block.monitor.BlockMonitorConfig$Builder;
import com.yxcorp.gifshow.performance.monitor.block.BlockMonitorInitModule$beginTTIBlockMonitor$blockConfig$1;
import msd.a;
import com.kwai.performance.fluency.block.monitor.BlockMonitorConfig;
import yf7.f;
import yf7.k;
import com.kwai.performance.fluency.block.monitor.BlockMonitor;
import nwb.a;
import com.kwai.performance.fluency.block.monitor.BlockMonitor$a;
import android.os.Handler;
import ekd.s1;
import nwb.b;
import java.lang.Runnable;
import oe6.b;
import com.yxcorp.gifshow.performance.monitor.block.BlockMonitorInitModule$beginReportBlockMonitor$blockConfig$1;
import com.yxcorp.gifshow.performance.monitor.block.BlockMonitorInitModule$beginReportBlockMonitor$1;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import k2b.u1;
import com.yxcorp.gifshow.performance.monitor.block.BlockMonitorInitModule$beginBlockMonitor$blockConfig$1;
import com.yxcorp.gifshow.performance.monitor.block.BlockMonitorInitModule$beginBlockMonitor$1;

public final class BlockMonitorInitModule extends PerformanceBaseInitModule	// class@000e61
{
    public static final BlockMonitorInitModule$a q;

    static {
       BlockMonitorInitModule.q = new BlockMonitorInitModule$a(null);
    }
    public void BlockMonitorInitModule(){
       super();
    }
    public void n(){
    }
    public void n0(a p0){
       boolean b1;
       BlockMonitorConfig$Builder uBuilder;
       BlockMonitor iNSTANCE;
       if (PatchProxy.applyVoidOneRefs(p0, this, BlockMonitorInitModule.class, "1")) {
          return;
       }
       a.p(p0, "event");
       if (!d.i) {
          return;
       }
       boolean b = false;
       int i = 1;
       Object[] objArray = null;
       if (!a.t().d("FluencyBlockRate", b)) {
          p0 = PatchProxy.apply(objArray, this, BlockMonitorInitModule.class, "2");
          if (p0 != PatchProxyResult.class) {
             b1 = p0.booleanValue();
          }else if(SystemUtil.J() && new Random().nextFloat() - 0x3dcccccd < 0){
             b1 = true;
          }else {
             b1 = false;
          }
          if (b1) {
          label_012a :
             if (!PatchProxy.applyVoid(objArray, this, BlockMonitorInitModule.class, "3")) {
                uBuilder = new BlockMonitorConfig$Builder();
                uBuilder.b(b.d());
                uBuilder.d(b.E());
                uBuilder.c(BlockMonitorInitModule$beginBlockMonitor$blockConfig$1.INSTANCE);
                k.a(uBuilder.a());
                iNSTANCE = BlockMonitor.INSTANCE;
                iNSTANCE.addOnBlockListener(new BlockMonitorInitModule$beginBlockMonitor$1());
                BlockMonitor.startSection$default(iNSTANCE, objArray, i, objArray);
             }
          }else if(a.t().d("TTIBlockMonitorOpen", b)){
             if (!PatchProxy.applyVoid(objArray, this, BlockMonitorInitModule.class, "4")) {
                uBuilder = new BlockMonitorConfig$Builder();
                uBuilder.b(a.t().b("TTIBlockTimeThreshold", 80));
                uBuilder.d(a.t().b("TTIStackSampleInterval", 80));
                uBuilder.c(BlockMonitorInitModule$beginTTIBlockMonitor$blockConfig$1.INSTANCE);
                k.a(uBuilder.a());
                iNSTANCE = BlockMonitor.INSTANCE;
                iNSTANCE.addOnBlockListener(new a());
                iNSTANCE.startSection("TTI");
                s1.c().postDelayed(b.b, ((long)a.t().a("TTIMonitorTime", 30) * 1000));
             }
          }else if(a.t().d("ReportStackTrace", b)){
             if (!PatchProxy.applyVoid(objArray, this, BlockMonitorInitModule.class, "5")) {
                uBuilder = new BlockMonitorConfig$Builder();
                uBuilder.b(b.d());
                uBuilder.d(b.E());
                uBuilder.c = b;
                uBuilder.c(BlockMonitorInitModule$beginReportBlockMonitor$blockConfig$1.INSTANCE);
                k.a(uBuilder.a());
                iNSTANCE = BlockMonitor.INSTANCE;
                iNSTANCE.addOnBlockListener(new BlockMonitorInitModule$beginReportBlockMonitor$1());
                iNSTANCE.startSection("BLOCK");
             }
             JsonObject jsonObject = new JsonObject();
             jsonObject.H("reportStackTrace", Boolean.FALSE);
             jsonObject.H("blockSwitchOpen", Boolean.TRUE);
             u1.R("blockEvent", jsonObject.toString(), 19);
          }
       }else {
          goto label_012a ;
       }
    label_0161 :
       return;
    }
}
