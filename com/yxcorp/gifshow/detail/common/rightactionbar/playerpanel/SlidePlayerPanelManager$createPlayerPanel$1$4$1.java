package com.yxcorp.gifshow.detail.common.rightactionbar.playerpanel.SlidePlayerPanelManager$createPlayerPanel$1$4$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.detail.common.rightactionbar.playerpanel.SlidePlayerPanelManager$createPlayerPanel$1$4;
import java.lang.Object;
import android.view.View;
import com.yxcorp.gifshow.detail.player.panel.elements.SpeedItemModel;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.detail.common.rightactionbar.playerpanel.SlidePlayerPanelManager$createPlayerPanel$1;
import kotlin.Pair;
import qrd.r0;
import java.util.HashMap;
import trd.t0;
import com.yxcorp.gifshow.detail.common.rightactionbar.playerpanel.SlidePlayerPanelManager;
import lnc.a1;
import sz9.w;

public final class SlidePlayerPanelManager$createPlayerPanel$1$4$1 extends Lambda implements p	// class@0014e2
{
    public final SlidePlayerPanelManager$createPlayerPanel$1$4 this$0;

    public void SlidePlayerPanelManager$createPlayerPanel$1$4$1(SlidePlayerPanelManager$createPlayerPanel$1$4 p0){
       this.this$0 = p0;
       super(2);
    }
    public Object invoke(Object p0,Object p1){
       this.invoke(p0, p1);
       return l1.a;
    }
    public final void invoke(View p0,SpeedItemModel p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SlidePlayerPanelManager$createPlayerPanel$1$4$1.class, "1")) {
          return;
       }
       a.p(p0, "<anonymous parameter 0>");
       a.p(p1, "model");
       Pair[] pairArray = new Pair[]{r0.a("muti_speed_option_button", p1.getDisplayName())};
       this.this$0.this$0.this$0.j(t0.M(pairArray));
       String str = a1.r(R.string.arg_RES_7f103cc1, String.valueOf(p1.getSpeed()));
       a.o(str, "CommonUtil.string\(R.stri¡­, model.speed.toString\(\)\)");
       this.this$0.this$0.this$0.l(str);
       this.this$0.this$0.this$0.j.updateSpeed(p1.getSpeed());
       return;
    }
}
