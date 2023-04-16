package com.yxcorp.gifshow.detail.common.rightactionbar.playerpanel.SlidePlayerPanelManager$showSmallWindowPanel$2;
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
import fg6.a;
import i3a.b;
import sz9.t;
import kotlin.Pair;
import qrd.r0;
import java.util.Map;
import trd.s0;
import com.google.gson.Gson;
import k2b.e0;
import k2b.u1;

public final class SlidePlayerPanelManager$showSmallWindowPanel$2 extends Lambda implements l	// class@0014ee
{
    public final SlidePlayerPanelManager this$0;

    public void SlidePlayerPanelManager$showSmallWindowPanel$2(SlidePlayerPanelManager p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(DialogInterface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SlidePlayerPanelManager$showSmallWindowPanel$2.class, "1")) {
          return;
       }
       a.p(p0, "it");
       SlidePlayerPanelManager$showSmallWindowPanel$2 tthis$0 = this.this$0;
       Objects.requireNonNull(tthis$0);
       if (!PatchProxy.applyVoid(null, tthis$0, SlidePlayerPanelManager.class, "36")) {
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.photoPackage = w1.f(tthis$0.r.a().getEntity());
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "SMALL_WINDOW_PLAY_SECOND_POPUP";
          uElementPack.params = a.a.q(s0.k(r0.a("small_window_play", t.d(b.j()))));
          u1.C0("", tthis$0.p, 10, uElementPack, uContentPack);
       }
       return;
    }
}
