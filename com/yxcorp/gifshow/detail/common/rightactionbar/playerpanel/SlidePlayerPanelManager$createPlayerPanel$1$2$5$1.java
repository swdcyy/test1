package com.yxcorp.gifshow.detail.common.rightactionbar.playerpanel.SlidePlayerPanelManager$createPlayerPanel$1$2$5$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.detail.common.rightactionbar.playerpanel.SlidePlayerPanelManager$createPlayerPanel$1$2$5;
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
import java.util.Objects;
import com.yxcorp.gifshow.detail.common.rightactionbar.playerpanel.SlidePlayerPanelManager;
import com.yxcorp.gifshow.entity.QPhoto;
import sz9.u;
import sz9.x;
import sz9.w;
import sz9.t;
import kotlin.Pair;
import qrd.r0;
import java.util.HashMap;
import trd.t0;
import lnc.a1;

public final class SlidePlayerPanelManager$createPlayerPanel$1$2$5$1 extends Lambda implements p	// class@0014db
{
    public final a $this_mirror;
    public final SlidePlayerPanelManager$createPlayerPanel$1$2$5 this$0;

    public void SlidePlayerPanelManager$createPlayerPanel$1$2$5$1(SlidePlayerPanelManager$createPlayerPanel$1$2$5 p0,a p1){
       this.this$0 = p0;
       this.$this_mirror = p1;
       super(2);
    }
    public Object invoke(Object p0,Object p1){
       this.invoke(p0, p1.booleanValue());
       return l1.a;
    }
    public final void invoke(View p0,boolean p1){
       String str1;
       if (PatchProxy.isSupport(SlidePlayerPanelManager$createPlayerPanel$1$2$5$1.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, SlidePlayerPanelManager$createPlayerPanel$1$2$5$1.class, "1")) {
          return;
       }
       a.p(p0, "<anonymous parameter 0>");
       SlidePlayerPanelManager$createPlayerPanel$1 this$0 = this.this$0.this$0.this$0.this$0;
       Objects.requireNonNull(this$0);
       SlidePlayerPanelManager slidePlayerP = SlidePlayerPanelManager.class;
       String str = "mirror";
       if (!PatchProxy.isSupport(slidePlayerP) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p1), this$0, slidePlayerP, "19")) {
          x ox = this$0.j.p0(this$0.r.a());
          x ox1 = this$0.j.o0();
          if (p1) {
             ox.a(str);
          }else {
             ox.c(str);
             ox1.c(str);
          }
          t.b(ox1, ox);
          this$0.n(ox1);
       }
       Pair[] pairArray = new Pair[]{r0.a(str, t.d(p1)),r0.a("show_or_hide", t.c(this.$this_mirror.h()))};
       this.this$0.this$0.this$0.this$0.j(t0.M(pairArray));
       if (p1) {
          str1 = a1.p(R.string.arg_RES_7f103cbe);
          a.o(str1, "CommonUtil.string\(R.stri¡­anel_element_mirror_tips\)");
          this.this$0.this$0.this$0.this$0.l(str1);
       }else {
          str1 = a1.p(R.string.arg_RES_7f103cbc);
          a.o(str1, "CommonUtil.string\(R.stri¡­lement_mirror_close_tips\)");
          this.this$0.this$0.this$0.this$0.l(str1);
       }
       return;
    }
}
