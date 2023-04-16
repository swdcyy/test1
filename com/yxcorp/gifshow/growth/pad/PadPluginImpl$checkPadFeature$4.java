package com.yxcorp.gifshow.growth.pad.PadPluginImpl$checkPadFeature$4;
import msd.l;
import kotlin.jvm.internal.Lambda;
import xpa.e;
import java.lang.Object;
import java.lang.Throwable;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.util.Log;

public final class PadPluginImpl$checkPadFeature$4 extends Lambda implements l	// class@001468
{
    public final e this$0;

    public void PadPluginImpl$checkPadFeature$4(e p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PadPluginImpl$checkPadFeature$4.class, "1")) {
          return;
       }
       a.p(p0, "it");
       String stackTraceSt = Log.getStackTraceString(p0);
       a.o(stackTraceSt, "Log.getStackTraceString\(it\)");
       this.this$0.F(stackTraceSt);
       return;
    }
}
