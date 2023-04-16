package com.yxcorp.gifshow.detail.common.rightactionbar.playerpanel.SlidePlayerPanelManager$createPlayerPanel$1$2$6;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import com.yxcorp.gifshow.detail.common.rightactionbar.playerpanel.SlidePlayerPanelManager;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import java.util.HashMap;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import kotlin.jvm.internal.CallableReference;
import java.util.Objects;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import fg6.a;
import com.google.gson.Gson;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.yxcorp.gifshow.entity.QPhoto;
import sz9.u;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import k2b.e0;
import k2b.u1;

public final class SlidePlayerPanelManager$createPlayerPanel$1$2$6 extends FunctionReferenceImpl implements l	// class@0014dd
{

    public void SlidePlayerPanelManager$createPlayerPanel$1$2$6(SlidePlayerPanelManager p0){
       super(1, p0, SlidePlayerPanelManager.class, "logElementGroupShow", "logElementGroupShow\(Ljava/util/HashMap;\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(HashMap p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SlidePlayerPanelManager$createPlayerPanel$1$2$6.class, "1")) {
          return;
       }
       a.p(p0, "p1");
       CallableReference treceiver = this.receiver;
       Objects.requireNonNull(treceiver);
       if (!PatchProxy.applyVoidOneRefs(p0, treceiver, SlidePlayerPanelManager.class, "42")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "PLAYER_PANEL_FUNCTION_STATUS_BUTTON";
          uElementPack.params = a.a.q(p0);
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.photoPackage = w1.f(treceiver.r.a().getEntity());
          u1.L("", treceiver.p, 1, uElementPack, uContentPack);
       }
       return;
    }
}
