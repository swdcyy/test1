package com.yxcorp.gifshow.performance.monitor.gc.GcManageInitModule$beginTheSelectedGcSuppressionTask$1;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import com.yxcorp.gifshow.performance.monitor.gc.GcManageInitModule;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.CallableReference;
import java.util.Objects;
import k2b.u1;

public final class GcManageInitModule$beginTheSelectedGcSuppressionTask$1 extends FunctionReferenceImpl implements l	// class@000e78
{

    public void GcManageInitModule$beginTheSelectedGcSuppressionTask$1(GcManageInitModule p0){
       super(1, p0, GcManageInitModule.class, "logErrors", "logErrors\(Ljava/lang/String;\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GcManageInitModule$beginTheSelectedGcSuppressionTask$1.class, "1")) {
          return;
       }
       CallableReference treceiver = this.receiver;
       Objects.requireNonNull(treceiver);
       if (!PatchProxy.applyVoidOneRefs(p0, treceiver, GcManageInitModule.class, "7")) {
          if (p0 == null) {
             p0 = "None";
          }
          u1.R("gc_suppress_err", p0, 19);
       }
       return;
    }
}
