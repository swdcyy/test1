package com.yxcorp.plugin.setting.fontscale.FontScaleSettingsFragment$a;
import com.kwai.library.widget.button.SlipSwitchButton$c;
import com.yxcorp.plugin.setting.fontscale.FontScaleSettingsFragment;
import java.lang.Object;
import com.kwai.library.widget.button.SlipSwitchButton;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import mgd.a;
import kotlin.jvm.internal.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import com.yxcorp.plugin.setting.fontscale.FontScaleFollowSystemStatus;

public final class FontScaleSettingsFragment$a implements SlipSwitchButton$c	// class@0008a5
{
    public final FontScaleSettingsFragment a;

    public void FontScaleSettingsFragment$a(FontScaleSettingsFragment p0){
       this.a = p0;
       super();
    }
    public final void a(SlipSwitchButton p0,boolean p1){
       FontScaleSettingsFragment$a uoa = FontScaleSettingsFragment$a.class;
       String str = "1";
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uoa, str)) {
          return;
       }
       FontScaleSettingsFragment$a ta = this.a;
       if (p1 == ta.w) {
          return;
       }
       a uoa1 = a.class;
       if (!PatchProxy.isSupport(uoa1) || !PatchProxy.applyVoidTwoRefs(ta, Boolean.valueOf(p1), null, uoa1, str)) {
          a.p(ta, "page");
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "SYS_SET_BUTTON";
          i3 oi3 = i3.f();
          str = (p1)? "OPEN": "CLOSE";
          oi3.d("status", str);
          uElementPack.params = oi3.e();
          u1.L("", ta, 1, uElementPack, null);
       }
       ta = this.a;
       FontScaleFollowSystemStatus oPEN = (p1)? FontScaleFollowSystemStatus.OPEN: FontScaleFollowSystemStatus.CLOSE_MANUAL;
       ta.gh(oPEN);
       return;
    }
}
