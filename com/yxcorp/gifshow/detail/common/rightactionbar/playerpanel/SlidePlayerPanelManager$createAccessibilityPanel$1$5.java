package com.yxcorp.gifshow.detail.common.rightactionbar.playerpanel.SlidePlayerPanelManager$createAccessibilityPanel$1$5;
import msd.l;
import kotlin.jvm.internal.Lambda;
import i3a.a;
import com.yxcorp.gifshow.detail.common.rightactionbar.playerpanel.SlidePlayerPanelManager$createAccessibilityPanel$1$1;
import java.lang.Object;
import com.yxcorp.gifshow.detail.player.panel.elements.TextElement;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import i3a.b;
import com.yxcorp.gifshow.detail.common.rightactionbar.playerpanel.SlidePlayerPanelManager$createAccessibilityPanel$1$5$1;
import msd.p;

public final class SlidePlayerPanelManager$createAccessibilityPanel$1$5 extends Lambda implements l	// class@0014ce
{
    public final SlidePlayerPanelManager$createAccessibilityPanel$1$1 $notifyAccessibility$1;
    public final a $this_accessibilityPanel;

    public void SlidePlayerPanelManager$createAccessibilityPanel$1$5(a p0,SlidePlayerPanelManager$createAccessibilityPanel$1$1 p1){
       this.$this_accessibilityPanel = p0;
       this.$notifyAccessibility$1 = p1;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(TextElement p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SlidePlayerPanelManager$createAccessibilityPanel$1$5.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       p0.k(a.g(b.d(), "ysopsia_blue"));
       p0.h(new SlidePlayerPanelManager$createAccessibilityPanel$1$5$1(this, p0));
       return;
    }
}