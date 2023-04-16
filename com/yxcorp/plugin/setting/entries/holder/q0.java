package com.yxcorp.plugin.setting.entries.holder.q0;
import com.kwai.library.widget.button.SlipSwitchButton$b;
import com.yxcorp.plugin.setting.entries.holder.r0;
import java.lang.Object;
import com.kwai.library.widget.button.SlipSwitchButton;
import com.yxcorp.gifshow.helper.h;
import qra.r;
import com.yxcorp.gifshow.helper.PushNotifyAuthoritySource;
import com.yxcorp.gifshow.activity.GifshowActivity;
import wkd.b;
import com.yxcorp.gifshow.retrofit.service.KwaiApiService;
import com.yxcorp.gifshow.model.SwitchItem;
import brd.t;
import cjd.e;
import erd.o;
import kgd.x1;
import sfc.a;
import erd.g;
import crd.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ClickEvent;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Long;
import java.lang.Number;
import java.lang.Integer;
import k2b.u1;
import com.yxcorp.plugin.setting.entries.holder.b;

public final class q0 implements SlipSwitchButton$b	// class@000885
{
    public final r0 a;

    public void q0(r0 p0){
       this.a = p0;
    }
    public final void a(SlipSwitchButton p0,boolean p1){
       q0 ta = this.a;
       int i = 1;
       if (ta.g == i) {
          ta.g = 0;
       }else if(!h.a()){
          ta.g = ta.g + i;
          h.e(ta.a, new r(PushNotifyAuthoritySource.Settings));
          p0.setSwitch((p1 ^ i));
       }else {
          KwaiApiService kwaiApiServi = b.a(0x330163e);
          SwitchItem mId = ta.c.mId;
          long l = (p1)? 2: 1;
          kwaiApiServi.updatePushSwitchStatus(mId, l).map(new e()).subscribe(new x1(ta, p0), new a());
          r0 c = ta.c;
          r0 or0 = r0.class;
          if (!PatchProxy.isSupport(or0) || !PatchProxy.applyVoidTwoRefs(c, Boolean.valueOf(p1), ta, or0, "3")) {
             mId = c.mId;
             if (mId - 20 >= 0 && mId - 26 <= 0) {
                ClientEvent$ClickEvent uClickEvent = new ClientEvent$ClickEvent();
                ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                uElementPack.action2 = "OLD_NOTIFICATION_SETTING_BUTTON";
                i3 oi3 = i3.f();
                oi3.d("button_name", c.mName);
                oi3.c("id", Long.valueOf(c.mId));
                if (p1) {
                   i = 2;
                }
                oi3.c("status", Integer.valueOf(i));
                uElementPack.params = oi3.e();
                uClickEvent.elementPackage = uElementPack;
                u1.a0(uClickEvent);
             }else if(mId - 29 >= 0){
                b.c(ta.c, p1);
             }
          }
       }
       return;
    }
}
