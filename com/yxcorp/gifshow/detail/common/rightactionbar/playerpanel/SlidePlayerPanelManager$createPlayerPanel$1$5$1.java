package com.yxcorp.gifshow.detail.common.rightactionbar.playerpanel.SlidePlayerPanelManager$createPlayerPanel$1$5$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.detail.common.rightactionbar.playerpanel.SlidePlayerPanelManager$createPlayerPanel$1$5;
import k3a.j;
import java.lang.Object;
import android.view.View;
import msd.l;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.detail.common.rightactionbar.playerpanel.SlidePlayerPanelManager$createPlayerPanel$1;
import com.yxcorp.gifshow.detail.common.rightactionbar.playerpanel.SlidePlayerPanelManager;
import com.yxcorp.gifshow.detail.common.rightactionbar.playerpanel.SlidePlayerPanelManager$createPlayerPanel$1$5$1$a;
import crd.b;
import ok.h;
import lnc.b9;
import java.util.Objects;
import com.yxcorp.gifshow.entity.QPhoto;
import sz9.u;
import xy5.j;
import com.kwai.framework.model.user.QCurrentUser;
import tkd.b;
import tkd.d;
import ou5.b;
import com.kwai.feature.api.social.login.model.LoginParams$a;
import lnc.a1;
import com.kwai.feature.api.social.login.model.LoginParams;
import sz9.l;
import android.content.Context;
import n3d.a;

public final class SlidePlayerPanelManager$createPlayerPanel$1$5$1 extends Lambda implements p	// class@0014e5
{
    public final j $this_collectDislike;
    public final SlidePlayerPanelManager$createPlayerPanel$1$5 this$0;

    public void SlidePlayerPanelManager$createPlayerPanel$1$5$1(SlidePlayerPanelManager$createPlayerPanel$1$5 p0,j p1){
       this.this$0 = p0;
       this.$this_collectDislike = p1;
       super(2);
    }
    public Object invoke(Object p0,Object p1){
       this.invoke(p0, p1);
       return l1.a;
    }
    public final void invoke(View p0,l p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SlidePlayerPanelManager$createPlayerPanel$1$5$1.class, "1")) {
          return;
       }
       a.p(p0, "<anonymous parameter 0>");
       a.p(p1, "setIsCollected");
       SlidePlayerPanelManager$createPlayerPanel$1 this$0 = this.this$0.this$0.this$0;
       this$0.e = b9.c(this$0.e, new SlidePlayerPanelManager$createPlayerPanel$1$5$1$a(this, p1));
       this$0 = this.this$0.this$0.this$0;
       Objects.requireNonNull(this$0);
       if (!PatchProxy.applyVoid(null, this$0, SlidePlayerPanelManager.class, "14")) {
          this$0.m.k("PLAYER_PANEL", (this$0.r.a().isCollected() ^ 0x01));
          QCurrentUser mE = QCurrentUser.ME;
          a.o(mE, "QCurrentUser.ME");
          if (!mE.isLogined()) {
             LoginParams$a uoa = new LoginParams$a();
             uoa.d(a1.p(R.string.arg_RES_7f103078));
             d.a(-1712118428).x00(this$0.o, 0, uoa.a(), new l(this$0));
          }else {
             this$0.d();
          }
       }
       return;
    }
}
