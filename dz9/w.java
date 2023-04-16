package dz9.w;
import mf5.w0;
import dz9.w$a;
import nsd.u;
import v6a.m0;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import le5.a;
import java.util.Objects;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.kwai.feature.api.feed.detail.router.DetailCommonParam;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.framework.model.user.QCurrentUser;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.util.o;
import lnc.e2;
import kf5.g;
import com.yxcorp.utility.Log;
import xx9.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import android.app.Activity;
import com.yxcorp.gifshow.entity.QPreInfo;

public final class w extends w0	// class@002027
{
    public final GifshowActivity C;
    public final BaseFragment D;
    public final QPhoto E;
    public final QPreInfo F;
    public final m0 G;
    public static final w$a H;

    static {
       w.H = new w$a(null);
    }
    public void w(m0 p0){
       a a;
       a.p(p0, "callerContext");
       super("recreation");
       this.G = p0;
       a = p0.a;
       Objects.requireNonNull(a, "null cannot be cast to non-null type com.yxcorp.gifshow.activity.GifshowActivity");
       this.C = a;
       this.D = p0.b;
       a c = p0.c;
       this.E = c.mPhoto;
       this.F = c.mDetailCommonParam.mPreInfo;
       this.L(R.drawable.arg_RES_7f080b0d);
       this.T(R.string.arg_RES_7f10404d);
       this.H(true);
    }
    public boolean E(){
       QCurrentUser obj = PatchProxy.apply(null, this, w.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = QCurrentUser.ME;
       a.o(obj, "QCurrentUser.ME");
       boolean b = (obj.isLogined() && (o.k(this.E) && e2.d()))? true: false;
       return b;
    }
    public void d(w0 p0,g p1){
       w ow = w.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ow, "2")) {
          return;
       }
       a.p(p0, "item");
       a.p(p1, "panel");
       p1.a();
       if (!PatchProxy.applyVoid(null, this, ow, "3")) {
          Log.g("OperationRecreation", "startVideoRecreation");
          m0 r = this.G.r;
          boolean b = (r != null)? r.c(): false;
          o.n(this.D, this.E, b);
          o.o(this.C, this.E, this.F);
       }
       return;
    }
    public void onShow(){
    }
}
