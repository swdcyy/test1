package com.yxcorp.gifshow.detail.common.rightactionbar.playerpanel.SlidePlayerPanelManager$showAccessibilityPanel$$inlined$apply$lambda$1;
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

public final class SlidePlayerPanelManager$showAccessibilityPanel$$inlined$apply$lambda$1 extends Lambda implements l	// class@0014ea
{
    public final SlidePlayerPanelManager this$0;

    public void SlidePlayerPanelManager$showAccessibilityPanel$$inlined$apply$lambda$1(SlidePlayerPanelManager p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(DialogInterface p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, SlidePlayerPanelManager$showAccessibilityPanel$$inlined$apply$lambda$1.class, "1")) {
          return;
       }
       a.p(p0, "it");
       SlidePlayerPanelManager$showAccessibilityPanel$$inlined$apply$lambda$1 tthis$0 = this.this$0;
       Objects.requireNonNull(tthis$0);
       if (!PatchProxy.applyVoid(null, tthis$0, SlidePlayerPanelManager.class, "40")) {
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.photoPackage = w1.f(tthis$0.r.a().getEntity());
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "ASSIST_FUNCTION_POPUP";
          u1.C0("", tthis$0.p, 10, uElementPack, uContentPack);
          uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "ASSIST_FUNCTION_BUTTON";
          HashMap hashMap = new HashMap();
          hashMap.put("button_name", tthis$0.a());
          uElementPack.params = a.a.q(hashMap);
          u1.C0("", tthis$0.p, 6, uElementPack, uContentPack);
       }
       PatchProxy.onMethodExit(SlidePlayerPanelManager$showAccessibilityPanel$$inlined$apply$lambda$1.class, "1");
       return;
    }
}
