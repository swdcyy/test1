package com.yxcorp.gifshow.homepage.menu.e$a;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.homepage.menu.e;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import xl8.b;
import java.lang.Boolean;
import java.util.Objects;
import com.yxcorp.gifshow.homepage.menu.a;
import com.yxcorp.gifshow.homepage.menu.g;
import lnc.a1;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$KsOrderInfoPackage;
import k2b.u1;
import qta.u0;
import msd.a;
import com.kwai.framework.kgi.sdk.Kgi;
import com.yxcorp.gifshow.m;
import ai5.m;
import java.lang.Integer;
import tra.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import k2b.e0;
import nc5.i;
import com.yxcorp.gifshow.plugin.impl.setting.SettingPluginHelper;
import com.yxcorp.gifshow.plugin.impl.setting.SettingPluginHelper$startSettingsActivity$$inlined$let$lambda$1;
import android.content.Context;

public class e$a extends m	// class@001776
{
    public final e c;

    public void e$a(e p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, e$a.class, str)) {
          return;
       }
       if (!this.c.r.a().booleanValue()) {
          return;
       }
       e$a tc = this.c;
       Objects.requireNonNull(tc);
       e uoe = e.class;
       if (!PatchProxy.applyVoid(null, tc, uoe, "9")) {
          tc.p.a();
          tc.q.a(10);
          e q = tc.q;
          String str1 = a1.p(R.string.arg_RES_7f10471b);
          boolean b = (!tc.v.getVisibility())? true: false;
          Objects.requireNonNull(q);
          g og = g.class;
          if (!PatchProxy.isSupport(og) || !PatchProxy.applyVoidTwoRefs(str1, Boolean.valueOf(b), q, og, "30")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "MENU_BUTTON";
             uElementPack.params = q.d("4", str1, b, 0, "home").e();
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             uContentPack.ksOrderInfoPackage = q.c("S-353926C9D720", "S-E1C2660BCCF6", b);
             u1.u(true, uElementPack, uContentPack);
             Kgi.c(new u0(uContentPack, uElementPack));
          }
          q = tc.v;
          if (!PatchProxy.applyVoidOneRefs(q, null, m.class, "10")) {
             m.g(true, q);
          }
          int i = m.a();
          if (!PatchProxy.isSupport(uoe) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), tc, uoe, "11")) {
             SharedPreferences a = a.a;
             SharedPreferences$Editor uEditor = a.edit();
             uEditor.putInt("LatestVersionPromptedInDrawer", i);
             g.a(uEditor);
             SharedPreferences$Editor uEditor1 = a.edit();
             uEditor1.putInt("LatestVersionPromptedInSideMenu", i);
             g.a(uEditor1);
             i.b(1103, tc.getActivity());
          }
          Activity activity = tc.getActivity();
          if (!PatchProxy.applyVoidOneRefs(activity, null, SettingPluginHelper.class, str) && activity != null) {
             SettingPluginHelper.a.a(activity, new SettingPluginHelper$startSettingsActivity$$inlined$let$lambda$1(activity));
          }
       }
    label_0100 :
       return;
    }
}
