package ie0.e$a;
import dd.b;
import ie0.e;
import brd.v;
import com.facebook.imagepipeline.request.ImageRequest;
import java.lang.String;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import kotlin.jvm.internal.a;
import ce0.b;
import java.lang.StringBuilder;
import brd.g;

public final class e$a extends b	// class@0028a3
{
    public final e a;
    public final v b;

    public void e$a(e p0,v p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void onRequestFailure(ImageRequest p0,String p1,Throwable p2,boolean p3){
       if (PatchProxy.isSupport(e$a.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Boolean.valueOf(p3), this, e$a.class, "2")) {
          return;
       }
       a.p(p0, "request");
       a.p(p1, "requestId");
       a.p(p2, "throwable");
       b.C().v("PendantCore", "‘§º”‘ÿ ß∞‹:"+this.a.c, p2);
       this.b.onNext(Boolean.TRUE);
       this.b.onComplete();
       return;
    }
    public void onRequestSuccess(ImageRequest p0,String p1,boolean p2){
       if (PatchProxy.isSupport(e$a.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, e$a.class, "1")) {
          return;
       }
       a.p(p0, "request");
       a.p(p1, "requestId");
       this.b.onNext(Boolean.TRUE);
       this.b.onComplete();
       return;
    }
}
