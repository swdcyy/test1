package com.yxcorp.gifshow.detail.common.rightactionbar.playerpanel.SlidePlayerPanelManager$createAccessibilityPanel$1$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.detail.common.rightactionbar.playerpanel.SlidePlayerPanelManager$createAccessibilityPanel$1;
import i3a.a;
import java.lang.Object;
import qrd.l1;
import com.yxcorp.gifshow.detail.common.rightactionbar.playerpanel.SlidePlayerPanelManager;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.yxcorp.gifshow.detail.player.panel.ui.PhotoPlayerPanelFragment;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import sz9.x;
import sz9.w;
import i3a.b;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.entity.QPhoto;
import sz9.u;
import sz9.t;
import lnc.a1;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import fg6.a;
import java.util.HashMap;
import com.google.gson.Gson;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import k2b.e0;
import k2b.u1;

public final class SlidePlayerPanelManager$createAccessibilityPanel$1$1 extends Lambda implements a	// class@0014c6
{
    public final a $this_accessibilityPanel;
    public final SlidePlayerPanelManager$createAccessibilityPanel$1 this$0;

    public void SlidePlayerPanelManager$createAccessibilityPanel$1$1(SlidePlayerPanelManager$createAccessibilityPanel$1 p0,a p1){
       this.this$0 = p0;
       this.$this_accessibilityPanel = p1;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       a a;
       PhotoPlayerPanelFragment b;
       SlidePlayerPanelManager slidePlayerP = SlidePlayerPanelManager.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, SlidePlayerPanelManager$createAccessibilityPanel$1$1.class, "1")) {
          return;
       }
       SlidePlayerPanelManager$createAccessibilityPanel$1$1 t$this_acces = this.$this_accessibilityPanel;
       Objects.requireNonNull(t$this_acces);
       if (!PatchProxy.applyVoid(objArray, t$this_acces, a.class, "6")) {
          a = t$this_acces.a;
          if (a != null) {
             b = a.B;
             if (b != null) {
                b.k0();
             }
          }
       }
       SlidePlayerPanelManager$createAccessibilityPanel$1 this$0 = this.this$0.this$0;
       Objects.requireNonNull(this$0);
       if (!PatchProxy.applyVoid(objArray, this$0, slidePlayerP, "20")) {
          x ox = this$0.j.o0();
          ox.b();
          if (a.g(b.d(), "original") ^ 1) {
             String str = b.d();
             a.o(str, "PlayerPanelHelper.getRecordAccessibilityMode\(\)");
             ox.a(str);
          }
          t.b(ox, this$0.j.p0(this$0.r.a()));
          this$0.m(ox);
          String str1 = b.d();
          if (str1 != null) {
             int i = str1.hashCode();
             if (i != -1990637964) {
                if (i != 0x55635842) {
                   if (i == 0x570086c9 && str1.equals("ysopsia_blue")) {
                      str1 = a1.p(R.string.arg_RES_7f103cac);
                      a.o(str1, "CommonUtil.string\(R.stri¡­el_accessibility_take_on\)");
                      this$0.l(str1);
                   }
                }else if(str1.equals("ysopsia_red")){
                   str1 = a1.p(R.string.arg_RES_7f103cac);
                   a.o(str1, "CommonUtil.string\(R.stri¡­el_accessibility_take_on\)");
                   this$0.l(str1);
                }
             }else if(str1.equals("ysopsia_green")){
                str1 = a1.p(R.string.arg_RES_7f103cac);
                a.o(str1, "CommonUtil.string\(R.stri¡­el_accessibility_take_on\)");
                this$0.l(str1);
             }
          }
       }
    label_00c7 :
       this$0 = this.this$0.this$0;
       Objects.requireNonNull(this$0);
       if (!PatchProxy.applyVoid(objArray, this$0, slidePlayerP, "43")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "ASSIST_FUNCTION_BUTTON";
          HashMap hashMap = new HashMap();
          hashMap.put("button_name", this$0.a());
          uElementPack.params = a.a.q(hashMap);
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.photoPackage = w1.f(this$0.r.a().getEntity());
          u1.L("", this$0.p, 1, uElementPack, uContentPack);
       }
       return;
    }
}
