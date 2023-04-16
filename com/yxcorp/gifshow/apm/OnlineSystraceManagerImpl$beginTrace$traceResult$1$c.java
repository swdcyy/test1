package com.yxcorp.gifshow.apm.OnlineSystraceManagerImpl$beginTrace$traceResult$1$c;
import erd.g;
import com.yxcorp.gifshow.apm.OnlineSystraceManagerImpl$beginTrace$traceResult$1;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.util.Log;
import wkd.b;
import com.yxcorp.gifshow.OnlineSystraceManager;
import com.yxcorp.gifshow.OnlineSystraceManager$KeepPushPerformanceModel;
import j89.k;
import kotlin.jvm.internal.a;
import qrd.i;

public final class OnlineSystraceManagerImpl$beginTrace$traceResult$1$c implements g	// class@001b8f
{
    public final OnlineSystraceManagerImpl$beginTrace$traceResult$1 b;

    public void OnlineSystraceManagerImpl$beginTrace$traceResult$1$c(OnlineSystraceManagerImpl$beginTrace$traceResult$1 p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, OnlineSystraceManagerImpl$beginTrace$traceResult$1$c.class, "1")) {
       }else {
          Log.getStackTraceString(p0);
          if (this.b.$source == 2) {
             OnlineSystraceManager onlineSystra = b.a(-2022051331);
             OnlineSystraceManager$KeepPushPerformanceModel keepPushPerf = this.b.this$0.a();
             a.m(keepPushPerf);
             keepPushPerf = keepPushPerf.mTaskID;
             OnlineSystraceManagerImpl$beginTrace$traceResult$1 $logUUID = this.b.$logUUID;
             p0 = (p0 != null)? i.i(p0): null;
             onlineSystra.j(keepPushPerf, $logUUID, 4, p0);
          }
       }
       return;
    }
}
