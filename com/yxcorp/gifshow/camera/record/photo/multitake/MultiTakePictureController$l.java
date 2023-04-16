package com.yxcorp.gifshow.camera.record.photo.multitake.MultiTakePictureController$l;
import erd.g;
import com.yxcorp.gifshow.camera.record.photo.multitake.MultiTakePictureController;
import java.lang.Object;
import ig9.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class MultiTakePictureController$l implements g	// class@000ed8
{
    public final MultiTakePictureController b;

    public void MultiTakePictureController$l(MultiTakePictureController p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MultiTakePictureController$l.class, "1")) {
       }else if(p0.a == null){
          p0 = this.b;
          if (p0.v != null) {
             MultiTakePictureController.t2(p0, false, 1, null);
             MultiTakePictureController.z2(this.b, false, 1, null);
          }
       }
       return;
    }
}
