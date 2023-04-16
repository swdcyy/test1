package jg9.a;
import erd.g;
import com.yxcorp.gifshow.camera.record.photo.multitake.BaseMultiTakePictureController;
import java.lang.Object;
import zq8.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import e17.i$b;
import e17.i;
import lnc.a1;
import java.lang.CharSequence;

public final class a implements g	// class@002a82
{
    public final BaseMultiTakePictureController b;

    public void a(BaseMultiTakePictureController p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
       }else {
          a.p(p0, "permission");
          this.b.p2(p0.b, false, false);
          if (p0.b == null) {
             p0 = i.m();
             p0.y(a1.p(R.string.arg_RES_7f100404));
             this.b.o = i.z(p0);
          }
       }
       return;
    }
}
