package com.kuaishou.live.core.voiceparty.playway.video.camera.CameraRequestApi$b;
import erd.g;
import msd.l;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.Result;
import kotlin.jvm.internal.a;
import qrd.j0;

public final class CameraRequestApi$b implements g	// class@0018cd
{
    public final l b;

    public void CameraRequestApi$b(l p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CameraRequestApi$b.class, "1")) {
       }else {
          a.o(p0, "it");
          this.b.invoke(Result.box-impl(Result.constructor-impl(j0.a(p0))));
       }
       return;
    }
}
