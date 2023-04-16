package com.yxcorp.gifshow.camera.record.photo.multitake.MultiTakePictureController$m;
import erd.g;
import com.yxcorp.gifshow.camera.record.photo.multitake.MultiTakePictureController;
import java.lang.Object;
import ed9.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import oc9.d0;
import j8c.a;
import q87.c;
import com.yxcorp.gifshow.camera.record.photo.multitake.MultiTakePictureController$onAlbumBtnClick$1;
import com.yxcorp.gifshow.camera.record.photo.multitake.MultiTakePictureController$onAlbumBtnClick$2;
import com.yxcorp.gifshow.camera.record.photo.multitake.MultiTakePictureController$onAlbumBtnClick$3;
import msd.l;
import msd.a;

public final class MultiTakePictureController$m implements g	// class@000ed9
{
    public final MultiTakePictureController b;

    public void MultiTakePictureController$m(MultiTakePictureController p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MultiTakePictureController$m.class, "1")) {
       }else {
          p0 = this.b;
          if (p0.v != null && !p0.f2()) {
             p0 = this.b;
             if (p0.C == null && !PatchProxy.applyVoid(null, p0, MultiTakePictureController.class, "26")) {
                Object[] objArray = new Object[0];
                a.D().w(MultiTakePictureController.U, "onAlbumBtnClick", objArray);
                p0.D2(new MultiTakePictureController$onAlbumBtnClick$1(p0), new MultiTakePictureController$onAlbumBtnClick$2(p0), new MultiTakePictureController$onAlbumBtnClick$3(p0));
             }
          }
       }
       return;
    }
}
