package com.yxcorp.plugin.setting.activity.f;
import com.kwai.library.widget.button.SlipSwitchButton$b;
import com.yxcorp.plugin.setting.activity.PushSilenceSettingActivity;
import java.lang.Object;
import com.kwai.library.widget.button.SlipSwitchButton;
import java.util.Objects;
import wnc.a;
import e17.i;
import wkd.b;
import com.yxcorp.gifshow.retrofit.service.KwaiApiService;
import brd.t;
import java.util.concurrent.TimeUnit;
import zfd.m;
import com.yxcorp.plugin.setting.activity.g;
import erd.g;
import crd.b;

public final class f implements SlipSwitchButton$b	// class@000822
{
    public final PushSilenceSettingActivity a;

    public void f(PushSilenceSettingActivity p0){
       this.a = p0;
    }
    public final void a(SlipSwitchButton p0,boolean p1){
       f ta = this.a;
       Objects.requireNonNull(ta);
       if (!a.a()) {
          PushSilenceSettingActivity j = ta.J;
          if (p1 != j) {
             ta.z.setSwitch(j);
             i.a(R.style.arg_RES_7f110668, 0x7f1038e7);
          }
       }else {
          KwaiApiService kwaiApiServi = b.a(0x330163e);
          long l = 15;
          long l1 = (p1)? 7: 6;
          kwaiApiServi.updatePushSwitchStatus(l, l1).throttleFirst(500, TimeUnit.MILLISECONDS).subscribe(new m(ta, p1), new g(ta));
       }
       return;
    }
}
