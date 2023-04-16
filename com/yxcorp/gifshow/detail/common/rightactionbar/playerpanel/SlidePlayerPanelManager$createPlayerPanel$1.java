package com.yxcorp.gifshow.detail.common.rightactionbar.playerpanel.SlidePlayerPanelManager$createPlayerPanel$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.detail.common.rightactionbar.playerpanel.SlidePlayerPanelManager;
import java.lang.String;
import java.lang.Object;
import i3a.a;
import qrd.l1;
import i3a.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.detail.common.rightactionbar.playerpanel.SlidePlayerPanelManager$createPlayerPanel$1$1;
import k3a.h;
import lnc.a1;
import j3a.a;
import com.yxcorp.gifshow.detail.common.rightactionbar.playerpanel.SlidePlayerPanelManager$createPlayerPanel$1$2;
import k3a.c;
import androidx.fragment.app.FragmentActivity;
import com.yxcorp.gifshow.detail.player.panel.ToolkitKt$actionElementGroup$1;
import com.yxcorp.gifshow.detail.common.rightactionbar.playerpanel.SlidePlayerPanelManager$createPlayerPanel$1$3;
import k3a.o;
import com.yxcorp.gifshow.detail.player.panel.ToolkitKt$quality$1;
import com.yxcorp.gifshow.detail.player.panel.ToolkitKt$quality$2;
import com.yxcorp.gifshow.detail.common.rightactionbar.playerpanel.SlidePlayerPanelManager$createPlayerPanel$1$4;
import k3a.u;
import com.yxcorp.gifshow.detail.player.panel.ToolkitKt$speed$1;
import com.yxcorp.gifshow.detail.player.panel.ToolkitKt$speed$2;
import com.yxcorp.gifshow.detail.common.rightactionbar.playerpanel.SlidePlayerPanelManager$createPlayerPanel$1$5;
import k3a.j;
import com.yxcorp.gifshow.detail.player.panel.ToolkitKt$collectDislike$1;
import com.yxcorp.gifshow.detail.player.panel.ToolkitKt$collectDislike$2;

public final class SlidePlayerPanelManager$createPlayerPanel$1 extends Lambda implements l	// class@0014e8
{
    public final String $type;
    public final SlidePlayerPanelManager this$0;

    public void SlidePlayerPanelManager$createPlayerPanel$1(SlidePlayerPanelManager p0,String p1){
       this.this$0 = p0;
       this.$type = p1;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(a p0){
       String str1;
       c uoc = c.class;
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, SlidePlayerPanelManager$createPlayerPanel$1.class, str)) {
          return;
       }
       a.p(p0, "$receiver");
       SlidePlayerPanelManager$createPlayerPanel$1$1 iNSTANCE = SlidePlayerPanelManager$createPlayerPanel$1$1.INSTANCE;
       if (!PatchProxy.applyVoidTwoRefs(p0, iNSTANCE, null, uoc, "3")) {
          a.p(p0, "$this$collapsedTips");
          a.p(iNSTANCE, "init");
          h oh = new h();
          iNSTANCE.invoke(oh);
          oh.e = a1.d(0x7f070334);
          oh.f = a1.d(0x7f070356);
          if (oh.b()) {
             p0.a(oh);
          }
       }
       a h = p0.h;
       SlidePlayerPanelManager$createPlayerPanel$1$2 uocreatePlay = new SlidePlayerPanelManager$createPlayerPanel$1$2(this);
       if (!PatchProxy.applyVoidThreeRefs(p0, h, uocreatePlay, null, c.class, "4")) {
          a.p(p0, "$this$actionElementGroup");
          a.p(h, "activity");
          a.p(uocreatePlay, "init");
          c uoc1 = new c(h);
          uocreatePlay.invoke(uoc1);
          if (uoc1.b()) {
             p0.a(uoc1);
             c.b(p0, ToolkitKt$actionElementGroup$1.INSTANCE);
          }
       }
       SlidePlayerPanelManager$createPlayerPanel$1$3 uocreatePlay1 = new SlidePlayerPanelManager$createPlayerPanel$1$3(this);
       if (!PatchProxy.applyVoidTwoRefs(p0, uocreatePlay1, null, uoc, "10")) {
          a.p(p0, "$this$quality");
          a.p(uocreatePlay1, "init");
          o oo = new o();
          str1 = a1.p(R.string.arg_RES_7f103cca);
          a.o(str1, "CommonUtil.string\(R.string.player_panel_quality\)");
          if (!PatchProxy.applyVoidOneRefs(str1, oo, o.class, str)) {
             a.p(str1, "<set-?>");
             oo.e = str1;
          }
          uocreatePlay1.invoke(oo);
          if (oo.b()) {
             c.c(p0, ToolkitKt$quality$1.INSTANCE);
             p0.a(oo);
             c.c(p0, ToolkitKt$quality$2.INSTANCE);
          }
       }
       SlidePlayerPanelManager$createPlayerPanel$1$4 uocreatePlay2 = new SlidePlayerPanelManager$createPlayerPanel$1$4(this);
       if (!PatchProxy.applyVoidTwoRefs(p0, uocreatePlay2, null, uoc, "11")) {
          a.p(p0, "$this$speed");
          a.p(uocreatePlay2, "init");
          u ou = new u();
          str1 = a1.p(R.string.arg_RES_7f103cc2);
          a.o(str1, "CommonUtil.string\(R.stri¡­anel_element_speed_title\)");
          if (!PatchProxy.applyVoidOneRefs(str1, ou, u.class, str)) {
             a.p(str1, "<set-?>");
             ou.e = str1;
          }
          uocreatePlay2.invoke(ou);
          if (ou.b()) {
             c.c(p0, ToolkitKt$speed$1.INSTANCE);
             p0.a(ou);
             c.c(p0, ToolkitKt$speed$2.INSTANCE);
          }
       }
       SlidePlayerPanelManager$createPlayerPanel$1$5 uocreatePlay3 = new SlidePlayerPanelManager$createPlayerPanel$1$5(this);
       if (!PatchProxy.applyVoidTwoRefs(p0, uocreatePlay3, null, uoc, "12")) {
          a.p(p0, "$this$collectDislike");
          a.p(uocreatePlay3, "init");
          j oj = new j();
          uocreatePlay3.invoke(oj);
          if (oj.b()) {
             c.b(p0, ToolkitKt$collectDislike$1.INSTANCE);
             p0.a(oj);
             c.c(p0, ToolkitKt$collectDislike$2.INSTANCE);
          }
       }
       return;
    }
}
