package com.yxcorp.gifshow.camera.record.assistant.AssistantModeController$l;
import java.lang.Runnable;
import com.yxcorp.gifshow.camera.record.assistant.AssistantModeController;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import j8c.a;
import q87.c;
import com.yxcorp.gifshow.camera.record.assistant.a;
import ec9.j;
import cc9.e;
import com.yxcorp.gifshow.camera.record.assistant.utils.AssistantUtils;
import com.yxcorp.gifshow.camera.record.base.d;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.camera.record.base.b;
import com.yxcorp.gifshow.camera.record.assistant.model.AssistantResponse;
import nsd.u;
import sa6.a;

public final class AssistantModeController$l implements Runnable	// class@001cf1
{
    public final AssistantModeController b;

    public void AssistantModeController$l(AssistantModeController p0){
       this.b = p0;
       super();
    }
    public final void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, AssistantModeController$l.class, "1")) {
          return;
       }
       boolean b = false;
       if (!AssistantModeController.i2(this.b, b, 1, objArray)) {
          return;
       }
       if (this.b.r2()) {
          objArray = new Object[b];
          a.D().w("CameraAssist", "handle detect action start when silentDetectRunnable run", objArray);
          d d = this.b.d;
          a.o(d, "mCallerContext");
          e uoe = new e(AssistantUtils.d.m(d), 1, false, null, 12, null);
          this.b.o2().g().w0(v8);
       }
       return;
    }
}
