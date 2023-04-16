package gh9.c;
import erd.g;
import gh9.b;
import com.yxcorp.gifshow.camera.record.CameraActivity;
import java.lang.Object;
import gh9.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.activity.GifshowActivity;

public final class c implements g	// class@002491
{
    public final b b;
    public final CameraActivity c;

    public void c(b p0,CameraActivity p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
       }else {
          a.p(p0, "event");
          c tb = this.b;
          tb.m = p0.a;
          tb.n = true;
          if (this.c.b3()) {
             this.b.f();
          }
          p0.n = false;
       }
       return;
    }
}
