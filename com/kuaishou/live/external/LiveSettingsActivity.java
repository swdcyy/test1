package com.kuaishou.live.external.LiveSettingsActivity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.util.ArrayList;
import g33.v;
import com.kuaishou.live.external.LiveSettingsActivity$a;
import android.content.res.Resources;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.ContextThemeWrapper;
import android.app.Activity;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import android.os.Bundle;
import com.yxcorp.gifshow.widget.SwipeLayout;
import lnc.w9;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import lnc.i9;
import oe6.e;
import org.greenrobot.eventbus.a;
import java.lang.Runnable;
import ekd.k1;
import m56.g;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.e;
import androidx.fragment.app.Fragment;
import com.kuaishou.live.external.a;
import tkd.b;
import tkd.d;
import os5.l;
import us5.a;
import com.kuaishou.live.core.show.floatingwindow.z;
import xgc.f$a;
import com.kuaishou.live.external.u;
import com.kwai.library.widget.button.SlipSwitchButton$b;
import xgc.f;
import android.content.SharedPreferences;
import com.kuaishou.live.external.v;
import java.lang.System;
import g33.s;
import java.lang.Boolean;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ShowEvent;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import k2b.u1;
import h33.a0;
import h33.b0;
import xgc.c$a;
import lnc.a1;
import g33.x;
import android.view.View$OnClickListener;
import xgc.c;
import wk2.s;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import xgc.l;
import com.yxcorp.gifshow.model.SelectOption;
import wgc.o;
import xgc.i;
import xgc.d;
import com.yxcorp.gifshow.settings.holder.EntryListFragment;
import java.util.List;

public class LiveSettingsActivity extends GifshowActivity	// class@001b6a
{
    public ArrayList A;
    public o B;
    public Runnable C;
    public boolean y;
    public EntryListFragment z;
    public static int D = 10080;

    public void LiveSettingsActivity(){
       super();
       this.y = false;
       this.A = new ArrayList();
       this.B = new v(this);
       this.C = new LiveSettingsActivity$a(this);
    }
    public int M(){
       return 1;
    }
    public int getPage(){
       return 304;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, LiveSettingsActivity.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public String getUrl(){
       return "ks://live_settings";
    }
    public String o(){
       return "LIVE_SETTINGS";
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveSettingsActivity.class, "2")) {
          return;
       }
       super.onCreate(p0);
       w9.a(this);
       if (!i9.a(a.a().a())) {
          e.i0(false);
       }
       this.u3();
       a.d().p(this);
       return;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, LiveSettingsActivity.class, "3")) {
          return;
       }
       super.onDestroy();
       this.A.clear();
       a.d().t(this);
       k1.m(this.C);
       return;
    }
    public void onEventMainThread(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveSettingsActivity.class, "10")) {
          return;
       }
       k1.r(this.C, 800);
       return;
    }
    public void u3(){
       boolean d;
       boolean i1;
       LiveSettingsActivity liveSettings = LiveSettingsActivity.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, liveSettings, "4")) {
          return;
       }
       if (this.z != null) {
          this.getSupportFragmentManager().beginTransaction().p(this.z).m();
       }
       this.A.clear();
       this.A.add(new a(this));
       a uoa = d.a(-1492894991).H60();
       if (z.e() && !PatchProxy.applyVoid(objArray, this, liveSettings, "5")) {
          f$a uoa4 = new f$a().c(0, this.getString(R.string.arg_RES_7f102201), null, null, R.drawable.arg_RES_7f081084);
          uoa4.d(new u(this));
          this.A.add(uoa4.e(e.s()).a());
       }
       int i = 0;
       if (!uoa.f() && !PatchProxy.applyVoid(objArray, this, liveSettings, "9")) {
          f$a uoa3 = new f$a().c(0, this.getString(R.string.arg_RES_7f102ca1), null, null, R.drawable.arg_RES_7f081084);
          uoa3.d(v.a);
          this.A.add(uoa3.e(e.a.getBoolean("live_play_follow_user_photo_feed_notice_setting_switch", i)).a());
       }
       if (!uoa.d() && !PatchProxy.applyVoid(objArray, this, liveSettings, "7")) {
          i1 = (e.t() && System.currentTimeMillis() - e.H() > 0)? true: false;
          f$a uoa2 = new f$a().c(0, this.getString(R.string.arg_RES_7f102d3f), null, null, R.drawable.arg_RES_7f081084);
          uoa2.d(new s(this));
          f uof = uoa2.e(i1).a();
          if (!PatchProxy.isSupport(liveSettings) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(i1), this, liveSettings, "13")) {
             ClientEvent$ShowEvent showEvent = new ClientEvent$ShowEvent();
             ClientEvent$ElementPackage uElementPack1 = new ClientEvent$ElementPackage();
             uElementPack1.action = 0x761f;
             uElementPack1.name = "CLICK_CHEST_SET";
             uElementPack1.status = i1 ^ 1;
             showEvent.elementPackage = uElementPack1;
             u1.g0(showEvent);
          }
          this.A.add(uof);
       }
       this.A.add(new a0(this));
       this.A.add(new b0(this));
       if (!uoa.e() && !PatchProxy.applyVoid(objArray, this, liveSettings, "8")) {
          c$a uoa1 = new c$a().c(0, a1.p(R.string.arg_RES_7f102bc5), null, null, R.drawable.arg_RES_7f081084);
          x ox = new x(this);
          ox.b = this;
          uoa1.d(ox);
          this.A.add(uoa1.a());
          String str = this.o();
          if (!PatchProxy.applyVoidOneRefs(str, objArray, s.class, "1")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "APPOINTMENT_LIST_ENTRY";
             ClientEvent$UrlPackage urlPackage = new ClientEvent$UrlPackage();
             urlPackage.page2 = str;
             u1.y0(urlPackage, 3, uElementPack, objArray);
          }
       }
       if (!uoa.a() && !PatchProxy.applyVoid(objArray, this, liveSettings, "6")) {
          this.A.add(new l(this.getString(R.string.arg_RES_7f101e95)));
          SelectOption selectOption = new SelectOption();
          selectOption.mName = this.getString(0x7f1046eb);
          d = LiveSettingsActivity.D;
          selectOption.mValue = d;
          d = (!(long)d - e.F())? true: false;
          this.A.add(d.a(selectOption, d, this.B));
          selectOption = new SelectOption();
          Object[] objArray1 = new Object[]{"15"};
          i1 = 0x7f1046ed;
          selectOption.mName = a.a().a().getString(i1, objArray1);
          selectOption.mValue = 15;
          LiveSettingsActivity tA = this.A;
          d = (!(long)15 - e.F())? true: false;
          tA.add(d.a(selectOption, d, this.B));
          selectOption = new SelectOption();
          objArray1 = new Object[]{"30"};
          selectOption.mName = a.a().a().getString(i1, objArray1);
          selectOption.mValue = 30;
          tA = this.A;
          d = (!(long)30 - e.F())? true: false;
          tA.add(d.a(selectOption, d, this.B));
          selectOption = new SelectOption();
          objArray1 = new Object[]{"45"};
          selectOption.mName = a.a().a().getString(i1, objArray1);
          selectOption.mValue = 45;
          tA = this.A;
          d = (!(long)45 - e.F())? true: false;
          tA.add(d.a(selectOption, d, this.B));
          selectOption = new SelectOption();
          objArray1 = new Object[]{"60"};
          selectOption.mName = a.a().a().getString(i1, objArray1);
          selectOption.mValue = 60;
          tA = this.A;
          d = (!(long)60 - e.F())? true: false;
          tA.add(d.a(selectOption, d, this.B));
          selectOption = new SelectOption();
          selectOption.mName = this.getString(0x7f1046ec);
          selectOption.mValue = i;
          LiveSettingsActivity tA1 = this.A;
          if (!(long)i - e.F()) {
             i = true;
          }
          tA1.add(d.a(selectOption, i, this.B));
       }
       EntryListFragment uEntryListFr = new EntryListFragment();
       this.z = uEntryListFr;
       uEntryListFr.eh(R.string.arg_RES_7f1046ea);
       this.z.dh(this.A);
       e uoe = this.getSupportFragmentManager().beginTransaction();
       uoe.v(0x1020002, this.z);
       uoe.m();
       return;
    }
}
