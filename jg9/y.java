package jg9.y;
import erd.g;
import com.yxcorp.gifshow.camera.record.photo.multitake.MultiTakePictrueItem;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import o56.c;
import o56.a;
import kotlin.jvm.internal.a;
import j8c.a;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.util.PostUtils;
import io.reactivex.subjects.SingleSubject;
import java.lang.Double;

public final class y implements g	// class@002ac2
{
    public final MultiTakePictrueItem b;

    public void y(MultiTakePictrueItem p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, y.class, "1")) {
       }else {
          c uoc = a.a();
          a.o(uoc, "AppEnv.get\(\)");
          if (uoc.c()) {
             Object[] objArray = new Object[0];
             a.D().w("MultiTakePictureItem", "score error: "+this.b.c()+": "+p0, objArray);
          }
          PostUtils.D("MultiTakePictureItem", "score error: "+p0, p0);
          this.b.e().onSuccess(Double.valueOf(Double.MIN_VALUE));
       }
       return;
    }
}
