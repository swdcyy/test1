package com.yxcorp.gifshow.apm.OnlineSystraceManagerImpl$beginTrace$traceResult$1$b;
import erd.g;
import com.yxcorp.gifshow.apm.OnlineSystraceManagerImpl$beginTrace$traceResult$1;
import java.io.File;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import wkd.b;
import com.yxcorp.gifshow.OnlineSystraceManager;
import com.yxcorp.gifshow.OnlineSystraceManager$KeepPushPerformanceModel;
import j89.k;
import kotlin.jvm.internal.a;

public final class OnlineSystraceManagerImpl$beginTrace$traceResult$1$b implements g	// class@001b8e
{
    public final OnlineSystraceManagerImpl$beginTrace$traceResult$1 b;
    public final File c;

    public void OnlineSystraceManagerImpl$beginTrace$traceResult$1$b(OnlineSystraceManagerImpl$beginTrace$traceResult$1 p0,File p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, OnlineSystraceManagerImpl$beginTrace$traceResult$1$b.class, "1")) {
       }else {
          this.c.getAbsolutePath();
          if (this.b.$source == 2) {
             OnlineSystraceManager$KeepPushPerformanceModel keepPushPerf = this.b.this$0.a();
             a.m(keepPushPerf);
             b.a(-2022051331).j(keepPushPerf.mTaskID, this.b.$logUUID, 4, null);
          }
       }
       return;
    }
}
