package m2a.j;
import mf5.w0;
import android.app.Activity;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import java.lang.String;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Object;
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

public class j extends w0	// class@002f0a
{
    public final GifshowActivity C;
    public final QPhoto D;
    public BaseFragment E;

    public void j(Activity p0,BaseFragment p1,PhotoDetailParam p2){
       super("reward");
       this.C = p0;
       this.D = p2.mPhoto;
       this.E = p1;
       this.L(R.drawable.arg_RES_7f08055c);
       this.T(R.string.arg_RES_7f100126);
    }
    public boolean E(){
       Object obj = PatchProxy.apply(null, this, j.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (NasaExperimentUtils.u() && (f0.a(this.D) && !this.D.isMine()))? true: false;
       return b;
    }
    public void d(w0 p0,g p1){
       j oj = j.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, oj, "1")) {
          return;
       }
       e.d(this.D, this.C, "PLAYER_PANEL_SHARE_POPUP");
       p1.a();
       if (!PatchProxy.applyVoid(null, this, oj, "4")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "FAVOR_AUTHOR_BTN";
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.photoPackage = w1.f(this.D.mEntity);
          u1.M("", this.E, 1, uElementPack, uContentPack, null);
       }
       return;
    }
    public void onShow(){
       j oj = j.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oj, "3")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, oj, "5")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "FAVOR_AUTHOR_BTN";
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.photoPackage = w1.f(this.D.mEntity);
          u1.D0("", this.E, 0, uElementPack, uContentPack, null);
       }
       return;
    }
}
