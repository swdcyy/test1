package m2a.g;
import mf5.w0;
import android.app.Activity;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import java.lang.String;
import m2a.g$a;
import msd.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.entity.QPhoto;
import kf5.g;
import com.yxcorp.gifshow.detail.ocrtext.OcrFragment;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;

public class g extends w0	// class@002f07
{
    public final Activity C;
    public BaseFragment D;
    public final QPhoto E;

    public void g(Activity p0,BaseFragment p1,PhotoDetailParam p2){
       super("atlasText");
       this.D = p1;
       this.C = p0;
       this.E = p2.mPhoto;
       this.L(R.drawable.arg_RES_7f080b08);
       this.T(R.string.arg_RES_7f100ef6);
       this.O(new g$a(this, p2));
    }
    public boolean E(){
       Object obj = PatchProxy.apply(null, this, g.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.E.hasAtlasText();
    }
    public void d(w0 p0,g p1){
       g og = g.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, og, "3")) {
          return;
       }
       OcrFragment.Jh(this.E).Kh(this.D);
       p1.a();
       if (!PatchProxy.applyVoid(null, this, og, "4")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "PLAYER_PANEL_ENTRANCE_BUTTON";
          i3 oi3 = i3.f();
          oi3.d("button_type", "TEXT_EXTRACTION");
          uElementPack.params = oi3.e();
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.photoPackage = w1.f(this.E.mEntity);
          u1.M("", this.D, 0, uElementPack, uContentPack, null);
       }
       return;
    }
    public void onShow(){
       g og = g.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, og, "2")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, og, "5")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "PLAYER_PANEL_ENTRANCE_BUTTON";
          i3 oi3 = i3.f();
          oi3.d("button_type", "TEXT_EXTRACTION");
          uElementPack.params = oi3.e();
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.photoPackage = w1.f(this.E.mEntity);
          u1.D0("", this.D, 0, uElementPack, uContentPack, null);
       }
       return;
    }
}
