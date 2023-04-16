package com.yxcorp.gifshow.detail.common.rightactionbar.playerpanel.SlidePlayerPanelManager$createPlayerPanel$1$2;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.detail.common.rightactionbar.playerpanel.SlidePlayerPanelManager$createPlayerPanel$1;
import java.lang.Object;
import k3a.c;
import qrd.l1;
import i3a.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.detail.common.rightactionbar.playerpanel.SlidePlayerPanelManager$createPlayerPanel$1$2$1;
import com.yxcorp.gifshow.detail.player.panel.ToolkitKt$soundEffect$1;
import com.yxcorp.gifshow.detail.common.rightactionbar.playerpanel.SlidePlayerPanelManager$createPlayerPanel$1$2$2;
import com.yxcorp.gifshow.detail.player.panel.ToolkitKt$saveTraffic$1;
import com.yxcorp.gifshow.detail.common.rightactionbar.playerpanel.SlidePlayerPanelManager$createPlayerPanel$1$2$3;
import com.yxcorp.gifshow.detail.player.panel.ToolkitKt$accessibility$1;
import com.yxcorp.gifshow.detail.common.rightactionbar.playerpanel.SlidePlayerPanelManager$createPlayerPanel$1$2$4;
import com.yxcorp.gifshow.detail.player.panel.ToolkitKt$smallWindow$1;
import com.yxcorp.gifshow.detail.common.rightactionbar.playerpanel.SlidePlayerPanelManager$createPlayerPanel$1$2$5;
import com.yxcorp.gifshow.detail.player.panel.ToolkitKt$mirror$1;
import java.util.List;
import j3a.a;
import com.yxcorp.gifshow.detail.common.rightactionbar.playerpanel.SlidePlayerPanelManager$createPlayerPanel$1$2$6;
import com.yxcorp.gifshow.detail.common.rightactionbar.playerpanel.SlidePlayerPanelManager;

public final class SlidePlayerPanelManager$createPlayerPanel$1$2 extends Lambda implements l	// class@0014de
{
    public final SlidePlayerPanelManager$createPlayerPanel$1 this$0;

    public void SlidePlayerPanelManager$createPlayerPanel$1$2(SlidePlayerPanelManager$createPlayerPanel$1 p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(c p0){
       c uoc = c.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, SlidePlayerPanelManager$createPlayerPanel$1$2.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       SlidePlayerPanelManager$createPlayerPanel$1$2$1 uocreatePlay = new SlidePlayerPanelManager$createPlayerPanel$1$2$1(this);
       if (!PatchProxy.applyVoidTwoRefs(p0, uocreatePlay, null, uoc, "8")) {
          a.p(p0, "$this$soundEffect");
          a.p(uocreatePlay, "init");
          c.a(p0, new ToolkitKt$soundEffect$1(uocreatePlay));
       }
       SlidePlayerPanelManager$createPlayerPanel$1$2$2 uocreatePlay1 = new SlidePlayerPanelManager$createPlayerPanel$1$2$2(this);
       if (!PatchProxy.applyVoidTwoRefs(p0, uocreatePlay1, null, uoc, "7")) {
          a.p(p0, "$this$saveTraffic");
          a.p(uocreatePlay1, "init");
          c.a(p0, new ToolkitKt$saveTraffic$1(p0, uocreatePlay1));
       }
       SlidePlayerPanelManager$createPlayerPanel$1$2$3 uocreatePlay2 = new SlidePlayerPanelManager$createPlayerPanel$1$2$3(this);
       if (!PatchProxy.applyVoidTwoRefs(p0, uocreatePlay2, null, uoc, "6")) {
          a.p(p0, "$this$accessibility");
          a.p(uocreatePlay2, "init");
          c.a(p0, new ToolkitKt$accessibility$1(p0, uocreatePlay2));
       }
       SlidePlayerPanelManager$createPlayerPanel$1$2$4 uocreatePlay3 = new SlidePlayerPanelManager$createPlayerPanel$1$2$4(this);
       if (!PatchProxy.applyVoidTwoRefs(p0, uocreatePlay3, null, uoc, "9")) {
          a.p(p0, "$this$smallWindow");
          a.p(uocreatePlay3, "init");
          c.a(p0, new ToolkitKt$smallWindow$1(uocreatePlay3));
       }
       SlidePlayerPanelManager$createPlayerPanel$1$2$5 uocreatePlay4 = new SlidePlayerPanelManager$createPlayerPanel$1$2$5(this);
       if (!PatchProxy.applyVoidTwoRefs(p0, uocreatePlay4, null, uoc, "5")) {
          a.p(p0, "$this$mirror");
          a.p(uocreatePlay4, "init");
          c.a(p0, new ToolkitKt$mirror$1(p0, uocreatePlay4));
       }
       boolean b = (p0.h().size() > 0)? true: false;
       p0.e(b);
       p0.g = new SlidePlayerPanelManager$createPlayerPanel$1$2$6(this.this$0.this$0);
       return;
    }
}
