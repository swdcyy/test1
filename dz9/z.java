package dz9.z;
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
import com.yxcorp.gifshow.detail.slidev2.experiment.NasaExperimentUtils;
import com.yxcorp.gifshow.entity.QPhoto;
import elb.f0;
import kf5.g;
import dz5.e;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;

public final class z extends w0	// class@00202a
{
    public final GifshowActivity C;
    public final QPhoto D;
    public final BaseFragment E;
    public final m0 F;

    public void z(m0 p0){
       a a;
       a.p(p0, "callerContext");
       super("reward");
       this.F = p0;
       a = p0.a;
       Objects.requireNonNull(a, "null cannot be cast to non-null type com.yxcorp.gifshow.activity.GifshowActivity");
       this.C = a;
       this.D = p0.c.mPhoto;
       this.E = p0.b;
       this.L(R.drawable.arg_RES_7f08055c);
       this.T(R.string.arg_RES_7f100126);
    }
    public boolean E(){
       boolean b;
       z obj = PatchProxy.apply(null, this, z.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (NasaExperimentUtils.u() && f0.a(this.D)) {
          obj = this.D;
          a.o(obj, "mPhoto");
          if (!obj.isMine()) {
             b = true;
          label_0032 :
             return b;
          }
       }
       b = false;
       goto label_0032 ;
    }
    public void d(w0 p0,g p1){
       z oz = z.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, oz, "1")) {
          return;
       }
       a.p(p0, "item");
       a.p(p1, "panel");
       e.d(this.D, this.C, "PLAYER_PANEL_SHARE_POPUP");
       p1.a();
       if (!PatchProxy.applyVoid(null, this, oz, "4")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "FAVOR_AUTHOR_BTN";
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.photoPackage = w1.f(this.D.mEntity);
          u1.M("", this.E, 1, uElementPack, uContentPack, null);
       }
       return;
    }
    public void onShow(){
       z oz = z.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oz, "3")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, oz, "5")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "FAVOR_AUTHOR_BTN";
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.photoPackage = w1.f(this.D.mEntity);
          u1.D0("", this.E, 0, uElementPack, uContentPack, null);
       }
       return;
    }
}
