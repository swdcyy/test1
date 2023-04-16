package jg9.g0;
import erd.o;
import com.yxcorp.gifshow.camera.record.photo.multitake.MultiTakePictrueItem;
import java.lang.Object;
import java.lang.Double;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.camera.record.photo.multitake.MultiTakePictureController$c;
import kotlin.jvm.internal.a;
import nsd.u;

public final class g0 implements o	// class@002a98
{
    public final MultiTakePictrueItem b;

    public void g0(MultiTakePictrueItem p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       MultiTakePictureController$c uoc = PatchProxy.applyOneRefs(p0, this, g0.class, "1");
       if (uoc != PatchProxyResult.class) {
       }else {
          a.p(p0, "score");
          g0 tb = this.b;
          a.o(tb, "item");
          MultiTakePictureController$c uoc1 = new MultiTakePictureController$c(tb, p0.doubleValue(), 0, 4, null);
       }
       return uoc;
    }
}
