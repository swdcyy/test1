package jg9.c;
import erd.g;
import com.yxcorp.gifshow.camera.record.photo.multitake.BaseMultiTakePictureController;
import java.lang.Object;
import zq8.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class c implements g	// class@002a8d
{
    public final BaseMultiTakePictureController b;

    public void c(BaseMultiTakePictureController p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
       }else {
          a.p(p0, "permission");
          this.b.p2(p0.b, false, false);
       }
       return;
    }
}
