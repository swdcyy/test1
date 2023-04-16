package g2a.a;
import vxb.b;
import java.lang.Object;
import com.kwai.framework.init.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.detail.network.feedback.init.NetworkDetectorInitModule;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Boolean;
import com.yxcorp.gifshow.detail.network.feedback.log.a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.detail.network.feedback.NetworkFeedbackFragment;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import k2b.u1;

public class a implements b	// class@0023a1
{

    public void a(){
       super();
    }
    public a A30(){
       Object obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new NetworkDetectorInitModule();
    }
    public void W4(BaseFeed p0,boolean p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uoa, "5")) {
          return;
       }
       a.c(p0, p1);
       return;
    }
    public void Z10(GifshowActivity p0,QPhoto p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "4")) {
          return;
       }
       NetworkFeedbackFragment.Ih(p0, p1);
       return;
    }
    public boolean isAvailable(){
       return true;
    }
    public void lE(BaseFeed p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       a.e(p0);
       return;
    }
    public void oB(BaseFeed p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "3")) {
          return;
       }
       if (!PatchProxy.applyVoidOneRefs(p0, null, a.class, "4")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.name = "FIND_PLAY_FEEDBACK";
          uElementPack.action2 = "FIND_PLAY_FEEDBACK";
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          if (p0 != null) {
             uContentPack.photoPackage = w1.f(p0);
          }
          u1.u(6, uElementPack, uContentPack);
       }
       return;
    }
    public void ou(GifshowActivity p0,QPhoto p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "7")) {
          return;
       }
       NetworkFeedbackFragment.Ih(p0, p1);
       return;
    }
    public void tW(BaseFeed p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "6")) {
          return;
       }
       a.d(p0);
       return;
    }
}
