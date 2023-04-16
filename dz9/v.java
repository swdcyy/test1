package dz9.v;
import mf5.w0;
import v6a.m0;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import le5.a;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import le5.f;
import ez9.d;
import com.yxcorp.gifshow.entity.QPhoto;
import kf5.g;
import sz9.h;
import qrd.l1;
import io.reactivex.subjects.PublishSubject;

public final class v extends w0	// class@002025
{
    public final QPhoto C;
    public final m0 D;

    public void v(m0 p0){
       a.p(p0, "callerContext");
       super("player_setting");
       this.D = p0;
       this.C = p0.c.mPhoto;
       this.T(R.string.arg_RES_7f105061);
       this.L(R.drawable.arg_RES_7f080b25);
       this.H(true);
    }
    public boolean E(){
       boolean b;
       Object obj = PatchProxy.apply(null, this, v.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!f.j()) {
          v tC = this.C;
          a.o(tC, "photo");
          if (d.a.a(tC, this.D)) {
             b = true;
          label_002e :
             return b;
          }
       }
       b = false;
       goto label_002e ;
    }
    public void d(w0 p0,g p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, v.class, "2")) {
          return;
       }
       a.p(p0, "item");
       a.p(p1, "panel");
       p1.a();
       m0 x = this.D.X;
       h oh = new h();
       String str = "VIDEO_SETTING";
       if (!PatchProxy.applyVoidOneRefs(str, oh, h.class, "1")) {
          a.p(str, "<set-?>");
          oh.a = str;
       }
       x.onNext(oh);
       return;
    }
    public void onShow(){
    }
}
