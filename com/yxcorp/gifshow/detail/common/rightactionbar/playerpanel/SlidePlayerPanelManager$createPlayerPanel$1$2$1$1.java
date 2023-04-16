package com.yxcorp.gifshow.detail.common.rightactionbar.playerpanel.SlidePlayerPanelManager$createPlayerPanel$1$2$1$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.detail.common.rightactionbar.playerpanel.SlidePlayerPanelManager$createPlayerPanel$1$2$1;
import k3a.a;
import java.lang.Object;
import android.view.View;
import java.lang.Boolean;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.detail.common.rightactionbar.playerpanel.SlidePlayerPanelManager$createPlayerPanel$1$2;
import com.yxcorp.gifshow.detail.common.rightactionbar.playerpanel.SlidePlayerPanelManager$createPlayerPanel$1;
import kotlin.Pair;
import qrd.r0;
import sz9.t;
import java.util.HashMap;
import trd.t0;
import com.yxcorp.gifshow.detail.common.rightactionbar.playerpanel.SlidePlayerPanelManager;

public final class SlidePlayerPanelManager$createPlayerPanel$1$2$1$1 extends Lambda implements p	// class@0014d3
{
    public final a $this_soundEffect;
    public final SlidePlayerPanelManager$createPlayerPanel$1$2$1 this$0;

    public void SlidePlayerPanelManager$createPlayerPanel$1$2$1$1(SlidePlayerPanelManager$createPlayerPanel$1$2$1 p0,a p1){
       this.this$0 = p0;
       this.$this_soundEffect = p1;
       super(2);
    }
    public Object invoke(Object p0,Object p1){
       this.invoke(p0, p1.booleanValue());
       return l1.a;
    }
    public final void invoke(View p0,boolean p1){
       if (PatchProxy.isSupport(SlidePlayerPanelManager$createPlayerPanel$1$2$1$1.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, SlidePlayerPanelManager$createPlayerPanel$1$2$1$1.class, "1")) {
          return;
       }
       a.p(p0, "<anonymous parameter 0>");
       Pair[] pairArray = new Pair[]{r0.a("sound_effect", "PANORAMIC_SOUND"),r0.a("sound_effect_status", t.d(p1)),r0.a("show_or_hide", t.c(this.$this_soundEffect.h()))};
       this.this$0.this$0.this$0.this$0.j(t0.M(pairArray));
       this.this$0.this$0.this$0.this$0.c(p1);
       return;
    }
}
