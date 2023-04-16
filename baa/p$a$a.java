package baa.p$a$a;
import dd.b;
import baa.e;
import brd.v;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import kb.c;
import java.lang.Exception;
import java.lang.Throwable;
import brd.g;
import com.facebook.imagepipeline.request.ImageRequest;
import java.lang.Boolean;
import baa.p;

public final class p$a$a extends b	// class@00043f
{
    public final e a;
    public final v b;

    public void p$a$a(e p0,v p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void onRequestCancellation(String p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, p$a$a.class, "3")) {
          return;
       }
       a.p(p0, "requestId");
       c uoc = this.a.a();
       if (uoc != null) {
          uoc.close();
       }
       this.b.onError(new Exception("Cancelled"));
       PatchProxy.onMethodExit(p$a$a.class, "3");
       return;
    }
    public void onRequestFailure(ImageRequest p0,String p1,Throwable p2,boolean p3){
       if (PatchProxy.isSupport2(p$a$a.class, "2") && PatchProxy.applyVoidFourRefsWithListener(p0, p1, p2, Boolean.valueOf(p3), this, p$a$a.class, "2")) {
          return;
       }
       a.p(p0, "request");
       a.p(p1, "requestId");
       a.p(p2, "throwable");
       c uoc = this.a.a();
       if (uoc != null) {
          uoc.close();
       }
       this.b.onError(p2);
       PatchProxy.onMethodExit(p$a$a.class, "2");
       return;
    }
    public void onRequestSuccess(ImageRequest p0,String p1,boolean p2){
       if (PatchProxy.isSupport2(p$a$a.class, "1") && PatchProxy.applyVoidThreeRefsWithListener(p0, p1, Boolean.valueOf(p2), this, p$a$a.class, "1")) {
          return;
       }
       a.p(p0, "request");
       a.p(p1, "requestId");
       c uoc = this.a.a();
       if (uoc != null) {
          uoc.close();
       }
       p$a$a tb = this.b;
       a.o(tb, "emitter");
       p.a(tb);
       PatchProxy.onMethodExit(p$a$a.class, "1");
       return;
    }
}
