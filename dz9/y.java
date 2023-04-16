package dz9.y;
import mf5.w0;
import v6a.m0;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import le5.a;
import java.util.Objects;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import le5.f;
import com.yxcorp.gifshow.entity.QPhoto;
import kf5.g;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import mxb.h0;
import vca.i;
import b06.b;

public final class y extends w0	// class@002029
{
    public final GifshowActivity C;
    public final QPhoto D;
    public final m0 E;

    public void y(m0 p0){
       a a;
       a.p(p0, "callerContext");
       super("report");
       this.E = p0;
       a = p0.a;
       Objects.requireNonNull(a, "null cannot be cast to non-null type com.yxcorp.gifshow.activity.GifshowActivity");
       this.C = a;
       this.D = p0.c.mPhoto;
       this.T(R.string.arg_RES_7f100f27);
       this.L(R.drawable.arg_RES_7f080b1e);
       this.H(true);
    }
    public boolean E(){
       boolean b;
       y obj = PatchProxy.apply(null, this, y.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (f.j()) {
          obj = this.D;
          a.o(obj, "photo");
          if (!obj.isMine()) {
             b = true;
          label_002a :
             return b;
          }
       }
       b = false;
       goto label_002a ;
    }
    public void d(w0 p0,g p1){
       y oy = y.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, oy, "2")) {
          return;
       }
       a.p(p0, "item");
       a.p(p1, "panel");
       p1.a();
       if (!PatchProxy.applyVoid(null, this, oy, "3")) {
          y tD = this.D;
          String str = "photo";
          a.o(tD, str);
          if (tD.isAd() && h0.f(k.B(this.D))) {
             str = "ad";
          }else if(i.d(this.D)){
             str = "pay_course";
          }
          b.a(this.C, this.D, true, "", str);
       }
       return;
    }
}
