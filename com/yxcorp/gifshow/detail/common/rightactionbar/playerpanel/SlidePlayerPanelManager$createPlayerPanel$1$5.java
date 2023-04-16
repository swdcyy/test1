package com.yxcorp.gifshow.detail.common.rightactionbar.playerpanel.SlidePlayerPanelManager$createPlayerPanel$1$5;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.detail.common.rightactionbar.playerpanel.SlidePlayerPanelManager$createPlayerPanel$1;
import java.lang.Object;
import k3a.j;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.detail.common.rightactionbar.playerpanel.SlidePlayerPanelManager;
import sz9.u;
import j3a.a;
import com.yxcorp.gifshow.detail.common.rightactionbar.playerpanel.SlidePlayerPanelManager$createPlayerPanel$1$5$1;
import com.yxcorp.gifshow.detail.common.rightactionbar.playerpanel.SlidePlayerPanelManager$createPlayerPanel$1$5$2;

public final class SlidePlayerPanelManager$createPlayerPanel$1$5 extends Lambda implements l	// class@0014e7
{
    public final SlidePlayerPanelManager$createPlayerPanel$1 this$0;

    public void SlidePlayerPanelManager$createPlayerPanel$1$5(SlidePlayerPanelManager$createPlayerPanel$1 p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(j p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SlidePlayerPanelManager$createPlayerPanel$1$5.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       int i = 1;
       if (!(a.g(this.this$0.$type, "VIDEO_SETTING") ^ i) || !this.this$0.this$0.r.d()) {
          i = false;
       }
       p0.e(i);
       p0.g(this.this$0.this$0.r.c());
       p0.f = new SlidePlayerPanelManager$createPlayerPanel$1$5$1(this, p0);
       p0.g = new SlidePlayerPanelManager$createPlayerPanel$1$5$2(this);
       return;
    }
}
