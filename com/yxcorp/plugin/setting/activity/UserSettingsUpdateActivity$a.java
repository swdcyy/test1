package com.yxcorp.plugin.setting.activity.UserSettingsUpdateActivity$a;
import wgc.o;
import com.yxcorp.plugin.setting.activity.UserSettingsUpdateActivity;
import java.lang.Object;
import xgc.e;
import com.yxcorp.gifshow.model.SelectOption;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import tkd.b;
import tkd.d;
import gx5.d;
import com.yxcorp.gifshow.settings.holder.SettingSelectData;
import brd.t;
import zfd.p;
import sfc.a;
import erd.g;
import crd.b;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import k2b.e0;
import sgd.a;
import java.lang.Integer;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ClickEvent;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import wkd.b;
import com.yxcorp.gifshow.log.h;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.plugin.setting.activity.UserSettingsUpdateActivity$a$a;
import com.yxcorp.plugin.setting.utils.b;
import u07.t$a;
import android.app.Activity;
import ghd.k;
import u07.u;
import ghd.a;
import com.kwai.library.widget.popup.common.c$b;
import u07.f;
import u07.t;
import com.kwai.library.widget.popup.common.c;
import com.yxcorp.gifshow.retrofit.service.KwaiApiService;
import zfd.q;
import nx5.d;
import cjd.e;
import erd.o;
import zfd.r;

public class UserSettingsUpdateActivity$a implements o	// class@00081b
{
    public final UserSettingsUpdateActivity a;

    public void UserSettingsUpdateActivity$a(UserSettingsUpdateActivity p0){
       this.a = p0;
       super();
    }
    public void a(e p0,SelectOption p1,View p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, UserSettingsUpdateActivity$a.class, "1")) {
          return;
       }
       UserSettingsUpdateActivity$a ta = this.a;
       boolean b = true;
       if (ta.A == b) {
          d uod = d.a(-1188553266);
          SettingSelectData mKey = this.a.z.mKey;
          if (p1.mValue != b) {
             b = false;
          }
          uod.jg(mKey, b).subscribe(new p(this, p0, p1, p2), new a());
       }else if(ta.B == b){
          SelectOption mValue = ta.y.mValue;
          e0 activity = ta.D.getActivity();
          SelectOption mValue1 = p1.mValue;
          if (!PatchProxy.isSupport(a.class) || !PatchProxy.applyVoidThreeRefs(Integer.valueOf(mValue), activity, Integer.valueOf(mValue1), null, a.class, "9")) {
             ClientEvent$ClickEvent uClickEvent = new ClientEvent$ClickEvent();
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uClickEvent.elementPackage = uElementPack;
             i3 oi3 = i3.f();
             oi3.d("origin_type", a.d(mValue));
             oi3.d("click_type", a.d(mValue1));
             uElementPack.params = oi3.e();
             uClickEvent.elementPackage = uElementPack;
             b.a(0x4b316083).B("3305594", uClickEvent, activity);
          }
          if (p1.mValue == b) {
             GifshowActivity activity1 = this.a.D.getActivity();
             UserSettingsUpdateActivity$a$a uoa$a = new UserSettingsUpdateActivity$a$a(this, p1, p0, p2);
             if (!PatchProxy.applyVoidTwoRefsWithListener(activity1, uoa$a, null, b.class, "10")) {
                t$a uoa = new t$a(activity1);
                uoa.W0(R.string.arg_RES_7f100fb6);
                uoa.y0(R.string.arg_RES_7f100fb7);
                uoa.S0(R.string.arg_RES_7f103a83);
                uoa.Q0(R.string.cancel);
                uoa.t0(new k(activity1));
                uoa.u0(new a(uoa$a, activity1));
                uoa.A(b);
                f.e(uoa).b0().Z();
                PatchProxy.onMethodExit(b.class, "10");
             }
          }else {
             b.a(0x330163e).changePrivateOption(this.a.z.mKey, Integer.valueOf(p1.mValue).toString()).subscribe(new q(this, p0, p1, p2), new a());
          }
       }else {
          d.a(0x47047d).n0(this.a.z.mKey, p1.mValue).map(new e()).subscribe(new r(this, p0, p1, p2), new a());
       }
       return;
    }
}
