package com.kwai.framework.initmodule.ProcessBroadCastInitModel$receiver$1;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import d76.h;
import mo6.a;

public final class ProcessBroadCastInitModel$receiver$1 extends BroadcastReceiver	// class@001577
{

    public void ProcessBroadCastInitModel$receiver$1(){
       super();
    }
    public void onReceive(Context p0,Intent p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ProcessBroadCastInitModel$receiver$1.class, "1")) {
          return;
       }
       a.p(p0, "context");
       if (!PatchProxy.applyVoid(null, null, h.class, "1")) {
          a.a();
       }
       return;
    }
}
