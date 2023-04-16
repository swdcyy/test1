package com.yxcorp.gifshow.camera.record.photo.multitake.MultiTakePictureController$j;
import erd.g;
import com.yxcorp.gifshow.camera.record.photo.multitake.MultiTakePictureController;
import java.lang.Object;
import jg9.e;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class MultiTakePictureController$j implements g	// class@000ed6
{
    public final MultiTakePictureController b;

    public void MultiTakePictureController$j(MultiTakePictureController p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MultiTakePictureController$j.class, "1")) {
       }else {
          p0 = this.b;
          if (p0.v != null) {
             MultiTakePictureController.t2(p0, false, 1, null);
             MultiTakePictureController.z2(this.b, false, 1, null);
          }
       }
       return;
    }
}
