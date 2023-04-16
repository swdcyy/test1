package com.kuaishou.live.core.voiceparty.playway.video.camera.CameraRequestApi$d;
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

public final class CameraRequestApi$d implements g	// class@0018cf
{
    public final l b;

    public void CameraRequestApi$d(l p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CameraRequestApi$d.class, "1")) {
       }else {
          a.o(p0, "it");
          this.b.invoke(Result.box-impl(Result.constructor-impl(j0.a(p0))));
       }
       return;
    }
}
