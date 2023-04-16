package com.kuaishou.live.core.voiceparty.playway.video.camera.CameraRequestApi$openCameraAsAnchor$1$b;
import erd.g;
import com.kuaishou.live.core.voiceparty.playway.video.camera.CameraRequestApi$openCameraAsAnchor$1;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.Result;
import kotlin.jvm.internal.a;
import qrd.j0;
import msd.l;

public final class CameraRequestApi$openCameraAsAnchor$1$b implements g	// class@0018d3
{
    public final CameraRequestApi$openCameraAsAnchor$1 b;

    public void CameraRequestApi$openCameraAsAnchor$1$b(CameraRequestApi$openCameraAsAnchor$1 p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CameraRequestApi$openCameraAsAnchor$1$b.class, "1")) {
       }else {
          a.o(p0, "throwable");
          this.b.$callback.invoke(Result.box-impl(Result.constructor-impl(j0.a(p0))));
       }
       return;
    }
}
