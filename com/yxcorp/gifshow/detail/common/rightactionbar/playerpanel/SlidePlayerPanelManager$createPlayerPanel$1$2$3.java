package com.yxcorp.gifshow.detail.common.rightactionbar.playerpanel.SlidePlayerPanelManager$createPlayerPanel$1$2$3;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.detail.common.rightactionbar.playerpanel.SlidePlayerPanelManager$createPlayerPanel$1$2;
import java.lang.Object;
import k3a.a;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.detail.common.rightactionbar.playerpanel.SlidePlayerPanelManager$createPlayerPanel$1;
import com.yxcorp.gifshow.detail.common.rightactionbar.playerpanel.SlidePlayerPanelManager;
import sz9.u;
import j3a.a;
import i3a.b;
import lnc.a1;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.detail.common.rightactionbar.playerpanel.SlidePlayerPanelManager$createPlayerPanel$1$2$3$1;
import msd.p;

public final class SlidePlayerPanelManager$createPlayerPanel$1$2$3 extends Lambda implements l	// class@0014d8
{
    public final SlidePlayerPanelManager$createPlayerPanel$1$2 this$0;

    public void SlidePlayerPanelManager$createPlayerPanel$1$2$3(SlidePlayerPanelManager$createPlayerPanel$1$2 p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(a p0){
       String str;
       if (PatchProxy.applyVoidOneRefs(p0, this, SlidePlayerPanelManager$createPlayerPanel$1$2$3.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       p0.e(this.this$0.this$0.this$0.r.b());
       int b = true;
       p0.n(b);
       if (a.g(b.d(), "original")) {
          str = a1.p(R.string.arg_RES_7f103ca7);
          a.o(str, "CommonUtil.string\(R.stri¡­ayer_panel_accessibility\)");
       }else {
          str = this.this$0.this$0.this$0.a();
       }
       p0.p(str);
       SlidePlayerPanelManager$createPlayerPanel$1 this$0 = this.this$0.this$0.this$0;
       Objects.requireNonNull(this$0);
       Object obj = PatchProxy.apply(null, this$0, SlidePlayerPanelManager.class, "26");
       b = (obj != PatchProxyResult.class)? obj.booleanValue(): b ^ a.g(b.d(), "original");
       p0.m(b);
       p0.l(new SlidePlayerPanelManager$createPlayerPanel$1$2$3$1(this, p0));
       return;
    }
}
