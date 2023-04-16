package com.yxcorp.gifshow.detail.common.rightactionbar.playerpanel.SlidePlayerPanelManager$createPlayerPanel$1$5$2;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.detail.common.rightactionbar.playerpanel.SlidePlayerPanelManager$createPlayerPanel$1$5;
import java.lang.Object;
import android.view.View;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.detail.common.rightactionbar.playerpanel.SlidePlayerPanelManager$createPlayerPanel$1;
import com.yxcorp.gifshow.detail.common.rightactionbar.playerpanel.SlidePlayerPanelManager;
import java.util.Objects;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.yxcorp.gifshow.entity.QPhoto;
import sz9.u;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;
import com.kwai.component.photo.reduce.d;

public final class SlidePlayerPanelManager$createPlayerPanel$1$5$2 extends Lambda implements l	// class@0014e6
{
    public final SlidePlayerPanelManager$createPlayerPanel$1$5 this$0;

    public void SlidePlayerPanelManager$createPlayerPanel$1$5$2(SlidePlayerPanelManager$createPlayerPanel$1$5 p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SlidePlayerPanelManager$createPlayerPanel$1$5$2.class, "1")) {
          return;
       }
       a.p(p0, "<anonymous parameter 0>");
       this.this$0.this$0.this$0.e();
       SlidePlayerPanelManager$createPlayerPanel$1 this$0 = this.this$0.this$0.this$0;
       Objects.requireNonNull(this$0);
       if (!PatchProxy.applyVoid(null, this$0, SlidePlayerPanelManager.class, "44")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.type = 18;
          uElementPack.action2 = "NO_INTEREST_BTN_IN_LONG_PRESS_MASK";
          i3 oi3 = i3.f();
          oi3.d("source", "PLAYER_PANEL");
          uElementPack.params = oi3.e();
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.photoPackage = w1.f(this$0.r.a().getEntity());
          u1.M("", this$0.t, 1, uElementPack, uContentPack, null);
       }
       SlidePlayerPanelManager n = this.this$0.this$0.this$0.n;
       if (n != null) {
          n.b(0, null, null);
       }
       return;
    }
}
