package com.yxcorp.gifshow.detail.common.rightactionbar.playerpanel.SlidePlayerPanelManager$createPlayerPanel$1$4;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.detail.common.rightactionbar.playerpanel.SlidePlayerPanelManager$createPlayerPanel$1;
import java.lang.Object;
import k3a.u;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import j3a.a;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.detail.common.rightactionbar.playerpanel.SlidePlayerPanelManager;
import java.util.List;
import java.lang.Number;
import p5a.e;
import de5.a;
import com.kwai.video.player.IKwaiMediaPlayer;
import com.kwai.framework.player.core.b;
import com.yxcorp.gifshow.detail.player.panel.config.SlidePlayerPanelConfig;
import com.yxcorp.gifshow.detail.player.panel.config.PlayerPanelConfigHelper;
import com.yxcorp.gifshow.detail.player.panel.config.SpeedElementConfig;
import java.util.ArrayList;
import java.lang.Iterable;
import trd.u;
import java.util.Iterator;
import com.yxcorp.gifshow.detail.player.panel.config.SpeedConfig;
import com.yxcorp.gifshow.detail.player.panel.elements.SpeedItemModel;
import kotlin.collections.CollectionsKt__CollectionsKt;
import com.yxcorp.gifshow.detail.common.rightactionbar.playerpanel.SlidePlayerPanelManager$createPlayerPanel$1$4$1;

public final class SlidePlayerPanelManager$createPlayerPanel$1$4 extends Lambda implements l	// class@0014e3
{
    public final SlidePlayerPanelManager$createPlayerPanel$1 this$0;

    public void SlidePlayerPanelManager$createPlayerPanel$1$4(SlidePlayerPanelManager$createPlayerPanel$1 p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(u p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SlidePlayerPanelManager$createPlayerPanel$1$4.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       p0.e(false);
       SlidePlayerPanelManager$createPlayerPanel$1 this$0 = this.this$0.this$0;
       Objects.requireNonNull(this$0);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       SlidePlayerPanelManager slidePlayerP = SlidePlayerPanelManager.class;
       Object[] objArray = null;
       ArrayList uArrayList = PatchProxy.apply(objArray, this$0, slidePlayerP, "24");
       if (uArrayList != patchProxyRe) {
       }else {
          SpeedConfig obj = PatchProxy.apply(objArray, this$0, slidePlayerP, "29");
          float f = 0x3f800000;
          if (obj != patchProxyRe) {
             f = obj.floatValue();
          }else {
             e player = this$0.s.getPlayer();
             if (player != null) {
                IKwaiMediaPlayer iKwaiMediaPl = player.getIKwaiMediaPlayer();
                if (iKwaiMediaPl != null) {
                   f = iKwaiMediaPl.getSpeed(f);
                }
             }
          }
          SpeedElementConfig speedElement = PlayerPanelConfigHelper.a().getSpeedElementConfig();
          if (speedElement != null) {
             List speedConfigs = speedElement.getSpeedConfigs();
             if (speedConfigs != null) {
                ArrayList uArrayList1 = new ArrayList(u.Y(speedConfigs, 10));
                Iterator iterator = speedConfigs.iterator();
                while (iterator.hasNext()) {
                   obj = iterator.next();
                   String displayName = obj.getDisplayName();
                   float speed = obj.getSpeed();
                   String speedId = obj.getSpeedId();
                   boolean b = (!f - obj.getSpeed())? true: false;
                   uArrayList1.add(new SpeedItemModel(displayName, speed, speedId, b));
                }
                uArrayList = uArrayList1;
             }
          }
          uArrayList = CollectionsKt__CollectionsKt.E();
       }
       if (!PatchProxy.applyVoidOneRefs(uArrayList, p0, u.class, "2")) {
          a.p(uArrayList, "<set-?>");
          p0.f = uArrayList;
       }
       p0.g = new SlidePlayerPanelManager$createPlayerPanel$1$4$1(this);
       return;
    }
}
