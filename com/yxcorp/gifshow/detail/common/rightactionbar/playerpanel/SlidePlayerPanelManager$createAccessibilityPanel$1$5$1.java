package com.yxcorp.gifshow.detail.common.rightactionbar.playerpanel.SlidePlayerPanelManager$createAccessibilityPanel$1$5$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.detail.common.rightactionbar.playerpanel.SlidePlayerPanelManager$createAccessibilityPanel$1$5;
import com.yxcorp.gifshow.detail.player.panel.elements.TextElement;
import java.lang.Object;
import android.view.View;
import java.lang.Boolean;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import kotlin.jvm.internal.a;
import i3a.b;
import i3a.a;
import com.yxcorp.gifshow.detail.common.rightactionbar.playerpanel.SlidePlayerPanelManager$createAccessibilityPanel$1$1;

public final class SlidePlayerPanelManager$createAccessibilityPanel$1$5$1 extends Lambda implements p	// class@0014cd
{
    public final TextElement $this_blueYellow;
    public final SlidePlayerPanelManager$createAccessibilityPanel$1$5 this$0;

    public void SlidePlayerPanelManager$createAccessibilityPanel$1$5$1(SlidePlayerPanelManager$createAccessibilityPanel$1$5 p0,TextElement p1){
       this.this$0 = p0;
       this.$this_blueYellow = p1;
       super(2);
    }
    public Object invoke(Object p0,Object p1){
       this.invoke(p0, p1.booleanValue());
       return l1.a;
    }
    public final void invoke(View p0,boolean p1){
       if (PatchProxy.isSupport(SlidePlayerPanelManager$createAccessibilityPanel$1$5$1.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, SlidePlayerPanelManager$createAccessibilityPanel$1$5$1.class, "1")) {
          return;
       }
       a.p(p0, "<anonymous parameter 0>");
       if (!this.$this_blueYellow.g()) {
          b.m("ysopsia_blue");
          this.this$0.$this_accessibilityPanel.b();
          this.$this_blueYellow.k(true);
          this.this$0.$notifyAccessibility$1.invoke();
       }
       return;
    }
}