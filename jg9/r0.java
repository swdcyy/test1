package jg9.r0;
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

public final class r0 implements g	// class@002aae
{
    public static final r0 b;

    static {
       r0.b = new r0();
    }
    public void r0(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, r0.class, "1")) {
       }else {
          a.D().e(MultiTakePictureController.V.c(), "sync picture error", p0);
       }
       return;
    }
}
