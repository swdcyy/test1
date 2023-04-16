package dz9.p;
import mf5.w0;
import v6a.m0;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePageConfig;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import le5.a;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kf5.g;
import io.reactivex.subjects.PublishSubject;

public final class p extends w0	// class@00201e
{
    public final QPhoto C;
    public final m0 D;
    public final SlidePageConfig E;

    public void p(m0 p0,SlidePageConfig p1){
       a.p(p0, "callerContext");
       a.p(p1, "pageConfig");
       super("message_locate");
       this.D = p0;
       this.E = p1;
       this.C = p0.c.mPhoto;
       this.T(R.string.arg_RES_7f1019bd);
       this.L(R.drawable.arg_RES_7f080b10);
    }
    public boolean E(){
       Object obj = PatchProxy.apply(null, this, p.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.E.R0;
    }
    public void d(w0 p0,g p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, p.class, "2")) {
          return;
       }
       a.p(p0, "item");
       a.p(p1, "panel");
       p1.a();
       if (!PatchProxy.applyVoid(null, this, p.class, "3")) {
          this.D.h0.onNext(this.C);
       }
       return;
    }
    public void onShow(){
    }
}
