package com.yxcorp.plugin.setting.helper.PushOptionSelectGroup;
import wgc.o;
import com.yxcorp.gifshow.model.SwitchItem;
import java.util.Map;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.plugin.setting.helper.PushOptionSelectGroup$holders$2;
import msd.a;
import qrd.p;
import qrd.s;
import xgc.e;
import com.yxcorp.gifshow.model.SelectOption;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import wkd.b;
import com.yxcorp.gifshow.retrofit.service.KwaiApiService;
import brd.t;
import cjd.e;
import erd.o;
import com.yxcorp.plugin.setting.helper.PushOptionSelectGroup$a;
import sfc.a;
import erd.g;
import crd.b;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ClickEvent;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Long;
import java.lang.Number;
import java.lang.Integer;
import k2b.u1;
import java.util.List;
import com.kwai.robust.PatchProxyResult;

public final class PushOptionSelectGroup implements o	// class@0008b3
{
    public final p a;
    public final SwitchItem b;

    public void PushOptionSelectGroup(SwitchItem p0,Map p1){
       a.p(p0, "item");
       a.p(p1, "optionMaps");
       super();
       this.b = p0;
       this.a = s.c(new PushOptionSelectGroup$holders$2(this, p1));
    }
    public void a(e p0,SelectOption p1,View p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, PushOptionSelectGroup.class, "3")) {
          return;
       }
       a.p(p0, "optionData");
       a.p(p1, "selectOption");
       a.p(p2, "view");
       b.a(0x330163e).updatePushSwitchStatus(this.b.mId, (long)p1.mValue).map(new e()).subscribe(new PushOptionSelectGroup$a(this, p0, p1), new a());
       PushOptionSelectGroup tb = this.b;
       if (!PatchProxy.applyVoidTwoRefs(tb, p1, this, PushOptionSelectGroup.class, "4") && !tb.mId - (long)27) {
          ClientEvent$ClickEvent uClickEvent = new ClientEvent$ClickEvent();
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "OLD_SETTING_BUTTON";
          i3 oi3 = i3.f();
          oi3.d("button_name", tb.mName);
          oi3.c("id", Long.valueOf(tb.mId));
          oi3.c("status", Integer.valueOf(p1.mValue));
          uElementPack.params = oi3.e();
          uClickEvent.elementPackage = uElementPack;
          u1.a0(uClickEvent);
       }
       return;
    }
    public final List b(){
       Object obj = PatchProxy.apply(null, this, PushOptionSelectGroup.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.getValue();
    }
    public final SwitchItem c(){
       return this.b;
    }
}
