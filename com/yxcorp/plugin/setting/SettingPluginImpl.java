package com.yxcorp.plugin.setting.SettingPluginImpl;
import qyb.b;
import java.lang.Object;
import android.app.Activity;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.plugin.setting.activity.GeneralSettingsActivity;
import android.content.Intent;
import rkd.b;
import com.yxcorp.plugin.setting.activity.GeneralSettingsActivityTablet;
import android.content.Context;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.library.widget.button.SlipSwitchButton;
import erd.g;
import java.lang.Boolean;
import com.yxcorp.plugin.setting.helper.j;
import com.google.gson.internal.LinkedTreeMap;
import com.yxcorp.gifshow.model.SwitchItem;
import n3d.a;
import com.yxcorp.plugin.setting.activity.PushDetailSettingsActivity;
import com.yxcorp.plugin.setting.activity.PrivateSettingsActivity;
import com.yxcorp.plugin.setting.activity.PrivateSettingsActivityTablet;
import com.yxcorp.plugin.setting.stencil.d;
import com.yxcorp.plugin.setting.stencil.config.SettingPage;
import java.util.Objects;
import mrd.a;
import com.yxcorp.plugin.setting.activity.SettingsActivity;
import com.yxcorp.plugin.setting.activity.SettingsActivityTablet;
import com.yxcorp.plugin.setting.activity.PushSilenceSettingActivity;
import com.yxcorp.plugin.setting.utils.b;
import qyb.a;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import kzc.d;
import com.yxcorp.gifshow.widget.popup.KwaiDialogOption;
import u07.t$a;
import ki5.b;
import java.lang.CharSequence;
import ghd.n;
import u07.u;
import u07.a;
import ghd.t;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import com.kwai.library.widget.popup.common.c$b;
import ghd.s;
import com.kwai.library.widget.popup.common.c;
import java.util.Set;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.plugin.setting.SettingPluginImpl$1;
import a17.b$b;
import a17.b$a;
import ghd.u;

public class SettingPluginImpl implements b	// class@0007f6
{

    public void SettingPluginImpl(){
       super();
    }
    public void Bk(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SettingPluginImpl.class, "3")) {
          return;
       }
       GeneralSettingsActivity generalSetti = GeneralSettingsActivity.class;
       if (!PatchProxy.applyVoidOneRefs(p0, null, generalSetti, "1")) {
          if (b.g()) {
             generalSetti = GeneralSettingsActivityTablet.class;
          }
          p0.startActivity(new Intent(p0, generalSetti));
       }
       return;
    }
    public void Ht(GifshowActivity p0,SlipSwitchButton p1,String p2,boolean p3,g p4){
       if (PatchProxy.isSupport2(SettingPluginImpl.class, "10")) {
          Object[] objArray = new Object[]{p0,p1,p2,Boolean.valueOf(p3),p4};
          if (PatchProxy.applyVoid(objArray, this, SettingPluginImpl.class, "10")) {
             return;
          }
       }
       new j(p0).l(p1, p2, p3, p4);
       PatchProxy.onMethodExit(SettingPluginImpl.class, "10");
       return;
    }
    public void PE(GifshowActivity p0,LinkedTreeMap p1,SwitchItem p2,a p3){
       if (PatchProxy.applyVoidFourRefsWithListener(p0, p1, p2, p3, this, SettingPluginImpl.class, "12")) {
          return;
       }
       PushDetailSettingsActivity.u3(p0, p1, p2, p3);
       PatchProxy.onMethodExit(SettingPluginImpl.class, "12");
       return;
    }
    public void Ss(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SettingPluginImpl.class, "2")) {
          return;
       }
       PrivateSettingsActivity privateSetti = PrivateSettingsActivity.class;
       if (!PatchProxy.applyVoidOneRefs(p0, null, privateSetti, "1")) {
          if (b.g()) {
             privateSetti = PrivateSettingsActivityTablet.class;
          }
          p0.startActivity(new Intent(p0, privateSetti));
       }
       return;
    }
    public void Tt(Activity p0){
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, SettingPluginImpl.class, str)) {
          return;
       }
       d uod = d.b();
       SettingPage sETTING = SettingPage.SETTING;
       Objects.requireNonNull(uod);
       if (!PatchProxy.applyVoidOneRefs(sETTING, uod, d.class, str)) {
          uod.c(sETTING);
       }
       SettingsActivity settingsActi = SettingsActivity.class;
       if (!PatchProxy.applyVoidOneRefs(p0, null, settingsActi, str)) {
          if (b.g()) {
             settingsActi = SettingsActivityTablet.class;
          }
          p0.startActivity(new Intent(p0, settingsActi));
       }
       return;
    }
    public void Ua(GifshowActivity p0,SwitchItem p1,a p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, SettingPluginImpl.class, "11")) {
          return;
       }
       PushSilenceSettingActivity.x3(p0, p1, p2);
       return;
    }
    public void Y8(GifshowActivity p0,g p1,g p2){
       if (PatchProxy.applyVoidThreeRefsWithListener(p0, p1, p2, this, SettingPluginImpl.class, "5")) {
          return;
       }
       b.d(p0, p1, p2);
       PatchProxy.onMethodExit(SettingPluginImpl.class, "5");
       return;
    }
    public void aX(GifshowActivity p0,a p1,PopupInterface$h p2){
       if (PatchProxy.applyVoidThreeRefsWithListener(p0, p1, p2, this, SettingPluginImpl.class, "8")) {
          return;
       }
       if (!PatchProxy.applyVoidThreeRefsWithListener(p0, p1, p2, null, b.class, "1")) {
          b.c(p0, null, p1, p2);
          PatchProxy.onMethodExit(b.class, "1");
       }
       PatchProxy.onMethodExit(SettingPluginImpl.class, "8");
       return;
    }
    public void fU(GifshowActivity p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SettingPluginImpl.class, "9")) {
          return;
       }
       b.b(1, p1);
       return;
    }
    public boolean isAvailable(){
       return true;
    }
    public void kH(GifshowActivity p0,PopupInterface$h p1){
       if (PatchProxy.applyVoidTwoRefsWithListener(p0, p1, this, SettingPluginImpl.class, "7")) {
          return;
       }
       d obj = null;
       if (!PatchProxy.applyVoidTwoRefsWithListener(p0, p1, obj, b.class, "9")) {
          b.b(1, obj);
          obj = new d(p0);
          obj.b1(KwaiDialogOption.e);
          obj.B0(R.drawable.arg_RES_7f081f86);
          obj.X0(b.b().c(R.string.arg_RES_7f100f91));
          obj.S0(R.string.arg_RES_7f10019b);
          obj.s0(new n(p0));
          t$a uoa = a.b(obj);
          uoa.V0(1);
          uoa.L(new t(R.layout.arg_RES_7f0d0478, p0));
          uoa.Y(new s(p0, p1));
          PatchProxy.onMethodExit(b.class, "9");
       }
       PatchProxy.onMethodExit(SettingPluginImpl.class, "7");
       return;
    }
    public Set o60(){
       Object obj = PatchProxy.apply(null, this, SettingPluginImpl.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new SettingPluginImpl$1(this);
    }
    public void q7(Activity p0,g p1,g p2,b$b p3,b$a p4){
       SettingPluginImpl settingPlugi = SettingPluginImpl.class;
       if (PatchProxy.isSupport(settingPlugi)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, this, settingPlugi, "13")) {
             return;
          }
       }
       u.b(p0, p1, p2, p3, p4);
       return;
    }
    public void tC(GifshowActivity p0,PopupInterface$h p1){
       if (PatchProxy.applyVoidTwoRefsWithListener(p0, p1, this, SettingPluginImpl.class, "6")) {
          return;
       }
       if (!PatchProxy.applyVoidTwoRefsWithListener(p0, p1, null, b.class, "7")) {
          b.c(p0, p1, null, null);
          PatchProxy.onMethodExit(b.class, "7");
       }
       PatchProxy.onMethodExit(SettingPluginImpl.class, "6");
       return;
    }
}
