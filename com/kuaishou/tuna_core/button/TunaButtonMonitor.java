package com.kuaishou.tuna_core.button.TunaButtonMonitor;
import com.kuaishou.tuna_core.button.TunaButtonMonitor$mIsInSample$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import ma6.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.tuna_logger.KsLogTunaCoreTag;
import java.util.List;
import com.kuaishou.tuna_core.button.TunaButtonMonitor$submitTrackData$1;
import c15.b;
import kotlin.Result;
import fg6.a;
import com.google.gson.Gson;
import java.lang.Throwable;
import qrd.j0;
import com.kuaishou.tuna_core.button.TunaButtonMonitor$submitTrackData$2;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.tuna_core.button.TunaButtonMonitor$submitTrackData$3;
import k2b.u1;
import java.lang.Integer;
import t45.d;
import com.kuaishou.tuna_core.button.TunaButtonMonitor$b;
import java.lang.Runnable;
import crd.b;
import brd.z;

public final class TunaButtonMonitor	// class@00109b
{
    public static final p a;
    public static final TunaButtonMonitor b;

    static {
       TunaButtonMonitor.b = new TunaButtonMonitor();
       TunaButtonMonitor.a = s.c(TunaButtonMonitor$mIsInSample$2.INSTANCE);
    }
    public void TunaButtonMonitor(){
       super();
    }
    public final void a(a p0){
       String str1;
       TunaButtonMonitor tunaButtonMo = TunaButtonMonitor.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, tunaButtonMo, "3")) {
          return;
       }
       String str = "submitTrackData";
       if (p0 == null) {
          b.f(KsLogTunaCoreTag.TUNA_BUTTON.appendTag(str), TunaButtonMonitor$submitTrackData$1.INSTANCE);
          return;
       }else if(p0.mFailureReason == null){
          str1 = "SUCCESS";
       }else {
          str1 = "FAILURE";
       }
       p0.mResult = str1;
       String str2 = Result.constructor-impl(a.a.q(p0));
       Object[] objArray = null;
       if (Result.isFailure-impl(str2)) {
          str2 = objArray;
       }
       KsLogTunaCoreTag tUNA_BUTTON = KsLogTunaCoreTag.TUNA_BUTTON;
       tUNA_BUTTON.appendTag(str);
       b.f(tUNA_BUTTON, new TunaButtonMonitor$submitTrackData$2(str2));
       Boolean uBoolean = PatchProxy.apply(objArray, this, tunaButtonMo, "1");
       if (uBoolean == PatchProxyResult.class) {
          uBoolean = TunaButtonMonitor.a.getValue();
       }
       if (!uBoolean.booleanValue()) {
          tUNA_BUTTON.appendTag(str);
          b.f(tUNA_BUTTON, TunaButtonMonitor$submitTrackData$3.INSTANCE);
          return;
       }else {
          u1.R("TUNA_BUTTON_PERFORMANCE_MONITOR", str2, 10);
          return;
       }
    }
    public final void b(a p0,Integer p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TunaButtonMonitor.class, "2")) {
          return;
       }
       d.a.d(new TunaButtonMonitor$b(p1, p0));
       return;
    }
}
