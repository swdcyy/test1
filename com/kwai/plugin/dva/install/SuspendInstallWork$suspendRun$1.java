package com.kwai.plugin.dva.install.SuspendInstallWork$suspendRun$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import com.kwai.plugin.dva.install.SuspendInstallWork;
import asd.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class SuspendInstallWork$suspendRun$1 extends ContinuationImpl	// class@00134f
{
    public long J$0;
    public long J$1;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public Object result;
    public final SuspendInstallWork this$0;

    public void SuspendInstallWork$suspendRun$1(SuspendInstallWork p0,c p1){
       this.this$0 = p0;
       super(p1);
    }
    public final Object invokeSuspend(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SuspendInstallWork$suspendRun$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.result = p0;
       this.label = this.label | Integer.MIN_VALUE;
       return this.this$0.g(this);
    }
}
