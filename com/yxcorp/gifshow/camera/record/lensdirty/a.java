package com.yxcorp.gifshow.camera.record.lensdirty.a;
import com.kwai.video.westeros.veplugin.VEPlugin$OnDirtyLensDetectionListener;
import com.yxcorp.gifshow.camera.record.lensdirty.DirtyLensController;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Float;
import java.lang.String;
import com.yxcorp.gifshow.camera.record.lensdirty.b;
import java.lang.Runnable;
import ekd.k1;

public final class a implements VEPlugin$OnDirtyLensDetectionListener	// class@000e14
{
    public final DirtyLensController a;

    public void a(DirtyLensController p0){
       this.a = p0;
    }
    public final void onDirtyDetectionResult(boolean p0,float p1){
       a ta = this.a;
       Objects.requireNonNull(ta);
       DirtyLensController uDirtyLensCo = DirtyLensController.class;
       if (!PatchProxy.isSupport(uDirtyLensCo) || !PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Float.valueOf(p1), ta, uDirtyLensCo, "7")) {
          k1.o(new b(ta, p0, p1));
       }
       return;
    }
}
