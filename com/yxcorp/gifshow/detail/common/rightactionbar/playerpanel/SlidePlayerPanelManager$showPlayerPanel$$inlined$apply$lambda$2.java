package com.yxcorp.gifshow.detail.common.rightactionbar.playerpanel.SlidePlayerPanelManager$showPlayerPanel$$inlined$apply$lambda$2;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.detail.common.rightactionbar.playerpanel.SlidePlayerPanelManager;
import java.lang.Object;
import android.content.DialogInterface;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.yxcorp.gifshow.entity.QPhoto;
import sz9.u;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import k2b.e0;
import k2b.u1;
import fg6.a;
import java.util.HashMap;
import com.google.gson.Gson;

public final class SlidePlayerPanelManager$showPlayerPanel$$inlined$apply$lambda$2 extends Lambda implements l	// class@0014ec
{
    public final SlidePlayerPanelManager this$0;

    public void SlidePlayerPanelManager$showPlayerPanel$$inlined$apply$lambda$2(SlidePlayerPanelManager p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(DialogInterface p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, SlidePlayerPanelManager$showPlayerPanel$$inlined$apply$lambda$2.class, "1")) {
          return;
       }
       a.p(p0, "it");
       SlidePlayerPanelManager$showPlayerPanel$$inlined$apply$lambda$2 tthis$0 = this.this$0;
       Objects.requireNonNull(tthis$0);
       if (!PatchProxy.applyVoid(null, tthis$0, SlidePlayerPanelManager.class, "35")) {
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.photoPackage = w1.f(tthis$0.r.a().getEntity());
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "PLAYER_PANEL_POPUP";
          u1.C0("", tthis$0.p, 10, uElementPack, uContentPack);
          uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "PLAYER_PANEL_FUNCTION_BUTTON";
          uElementPack.params = a.a.q(tthis$0.g());
          u1.C0("", tthis$0.p, 6, uElementPack, uContentPack);
       }
       PatchProxy.onMethodExit(SlidePlayerPanelManager$showPlayerPanel$$inlined$apply$lambda$2.class, "1");
       return;
    }
}
