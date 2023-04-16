package dz9.c;
import mf5.w0;
import v6a.m0;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePageConfig;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import le5.a;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import sz9.u;
import com.yxcorp.gifshow.detail.player.panel.config.SlidePlayerPanelConfig;
import com.yxcorp.gifshow.detail.player.panel.config.PlayerPanelConfigHelper;
import com.yxcorp.gifshow.entity.QPhoto;
import ez9.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import le5.f;
import ez9.d;
import kf5.g;
import com.yxcorp.gifshow.util.rx.RxBus;
import bz9.a;
import androidx.fragment.app.Fragment;
import ez9.b;
import kotlin.Pair;
import qrd.r0;
import java.util.HashMap;
import trd.t0;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public final class c extends w0	// class@00200b
{
    public final BaseFragment C;
    public final QPhoto D;
    public final u E;
    public final c F;
    public final m0 G;
    public final SlidePageConfig H;

    public void c(m0 p0,SlidePageConfig p1){
       a.p(p0, "callerContext");
       a.p(p1, "pageConfig");
       super("accessibility");
       this.G = p0;
       this.H = p1;
       this.C = p0.b;
       PhotoDetailParam mPhoto = p0.c.mPhoto;
       this.D = mPhoto;
       a.o(mPhoto, "mPhoto");
       u ou = new u(PlayerPanelConfigHelper.a(), mPhoto);
       this.E = ou;
       this.F = new c(ou, p1);
       this.T(R.string.arg_RES_7f100f23);
       this.L(R.drawable.arg_RES_7f080aee);
       this.H(true);
    }
    public boolean E(){
       boolean b;
       Object obj = PatchProxy.apply(null, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (f.j()) {
          c tD = this.D;
          a.o(tD, "mPhoto");
          if (d.a.a(tD, this.G)) {
             b = true;
          label_002e :
             return b;
          }
       }
       b = false;
       goto label_002e ;
    }
    public void d(w0 p0,g p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c.class, "2")) {
          return;
       }
       a.p(p0, "item");
       a.p(p1, "panel");
       p1.a();
       c tD = this.D;
       a.o(tD, "mPhoto");
       String photoId = tD.getPhotoId();
       a.o(photoId, "mPhoto.photoId");
       RxBus.f.b(new a(photoId, this.C.hashCode()));
       c tD1 = this.D;
       a.o(tD1, "mPhoto");
       tD = this.C;
       a.o(tD, "mFragment");
       Pair[] pairArray = new Pair[]{r0.a("assist_function_button", this.F.a())};
       b.a.c(tD1, tD, t0.M(pairArray));
       return;
    }
    public void onShow(){
       if (PatchProxy.applyVoid(null, this, c.class, "3")) {
          return;
       }
       c tD = this.D;
       a.o(tD, "mPhoto");
       c tC = this.C;
       a.o(tC, "mFragment");
       this.F.c(tD, tC, this.F.b());
       return;
    }
}
