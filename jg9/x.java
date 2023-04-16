package jg9.x;
import erd.g;
import com.yxcorp.gifshow.camera.record.photo.multitake.MultiTakePictrueItem;
import java.lang.Object;
import java.lang.Double;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import o56.c;
import o56.a;
import kotlin.jvm.internal.a;
import j8c.a;
import java.lang.StringBuilder;
import q87.c;
import xf6.g;
import io.reactivex.subjects.SingleSubject;

public final class x implements g	// class@002ac0
{
    public final MultiTakePictrueItem b;

    public void x(MultiTakePictrueItem p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, x.class, "1")) {
       }else {
          c uoc = a.a();
          a.o(uoc, "AppEnv.get\(\)");
          int i = 0;
          String str = ": ";
          String str1 = "score success: ";
          if (uoc.c()) {
             Object[] objArray = new Object[i];
             a.D().w("MultiTakePictureItem", str1+this.b.c()+str+p0, objArray);
          }
          Object[] objArray1 = new Object[i];
          a.D().w("MultiTakePictureItem", str1+this.b.c()+str+p0, objArray1);
          uoc = a.a();
          a.o(uoc, "AppEnv.get\(\)");
          if (uoc.c() && g.h1()) {
             this.b.e().onSuccess(Double.valueOf(Double.MIN_VALUE));
          }else {
             this.b.e().onSuccess(p0);
          }
       }
       return;
    }
}
