package f72.v$a;
import ha5.c;
import com.facebook.imagepipeline.request.ImageRequest;
import java.lang.String;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import com.yxcorp.gifshow.util.rx.RxBus;
import fa5.b;
import fa5.c;

public class v$a extends c	// class@0028dc
{
    public final boolean a;

    public void v$a(boolean p0){
       super();
       this.a = p0;
    }
    public void onRequestFailure(ImageRequest p0,String p1,Throwable p2,boolean p3){
       if (PatchProxy.isSupport(v$a.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Boolean.valueOf(p3), this, v$a.class, "2")) {
          return;
       }
       super.onRequestFailure(p0, p1, p2, p3);
       if (this.a != null) {
          RxBus.f.b(new b());
       }
       return;
    }
    public void onRequestSuccess(ImageRequest p0,String p1,boolean p2){
       if (PatchProxy.isSupport(v$a.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, v$a.class, "1")) {
          return;
       }
       super.onRequestSuccess(p0, p1, p2);
       if (this.a != null) {
          RxBus.f.b(new c());
       }
       return;
    }
}
