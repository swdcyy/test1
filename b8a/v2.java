package b8a.v2;
import s4a.b;
import com.yxcorp.gifshow.detail.slidev2.presenter.SlidePlaySwitchNextNebulaFollowGuidePresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import uw9.o;
import q87.c;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import java.util.Objects;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import k2b.u1;

public final class v2 implements b	// class@00040e
{
    public final SlidePlaySwitchNextNebulaFollowGuidePresenter a;

    public void v2(SlidePlaySwitchNextNebulaFollowGuidePresenter p0){
       this.a = p0;
       super();
    }
    public final void b(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, v2.class, "1")) {
          return;
       }
       Object[] objArray1 = new Object[0];
       o.C().w("FollowRecoGuidePresenter", "clickGuidePop", objArray1);
       SlidePlaySwitchNextNebulaFollowGuidePresenter.R8(this.a).Y(true);
       v2 ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(objArray, ta, SlidePlaySwitchNextNebulaFollowGuidePresenter.class, "12")) {
          ClickMetaData uClickMetaDa = new ClickMetaData();
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "FOLLOW_TEXT_POPUP";
          i3 oi3 = i3.f();
          oi3.d("text", ta.W8());
          uElementPack.params = oi3.e();
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          SlidePlaySwitchNextNebulaFollowGuidePresenter t = ta.t;
          if (t == null) {
             a.S("mPhoto");
          }
          uContentPack.photoPackage = w1.f(t.mEntity);
          uClickMetaDa.setElementPackage(uElementPack);
          uClickMetaDa.setContentPackage(uContentPack);
          u1.B(uClickMetaDa);
       }
       return;
    }
}
