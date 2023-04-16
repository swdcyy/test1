package com.yxcorp.gifshow.camera.record.photo.multitake.MultiTakePictureController$h;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import j8c.a;
import com.yxcorp.gifshow.camera.record.photo.multitake.MultiTakePictureController;
import com.yxcorp.gifshow.camera.record.photo.multitake.MultiTakePictureController$b;
import w46.b;

public final class MultiTakePictureController$h implements g	// class@000ed3
{
    public static final MultiTakePictureController$h b;

    static {
       MultiTakePictureController$h.b = new MultiTakePictureController$h();
    }
    public void MultiTakePictureController$h(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MultiTakePictureController$h.class, "1")) {
       }else {
          Object[] objArray = new Object[0];
          a.D().t(MultiTakePictureController.V.c(), "scale bitmap error", objArray);
       }
       return;
    }
}
