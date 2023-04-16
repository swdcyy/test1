package com.yxcorp.plugin.setting.activity.PushSettingsActivity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import android.app.Activity;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import com.yxcorp.plugin.setting.fragment.SettingListFragment;
import android.os.Bundle;
import com.yxcorp.gifshow.widget.SwipeLayout;
import lnc.w9;
import com.yxcorp.plugin.setting.fragment.PushSettingsListFragment;
import java.util.ArrayList;
import java.util.List;
import com.yxcorp.gifshow.settings.holder.EntryListFragment;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.e;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import androidx.fragment.app.KwaiDialogFragment;
import wkd.b;
import com.yxcorp.gifshow.retrofit.service.KwaiApiService;
import brd.t;
import cjd.e;
import erd.o;
import com.yxcorp.plugin.setting.activity.PushSettingsActivity$a;
import com.yxcorp.plugin.setting.activity.PushSettingsActivity$b;
import erd.g;
import crd.b;
import java.lang.Boolean;
import com.yxcorp.gifshow.model.response.PushStatusResponse;
import yfd.d;
import android.content.Context;
import lnc.m5;
import jgd.v;
import xgc.f;
import xgc.f$a;
import lnc.a1;
import jgd.m;
import com.kwai.library.widget.button.SlipSwitchButton$b;
import com.yxcorp.plugin.setting.helper.j;
import tgd.k;
import ml8.c;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import com.yxcorp.gifshow.model.SwitchItem;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import xgc.m;
import com.yxcorp.gifshow.model.SelectOption;
import com.yxcorp.plugin.setting.entries.holder.r0;
import com.yxcorp.plugin.setting.entries.holder.p0;
import java.util.Map;
import k2b.e0;
import nc5.i;

public class PushSettingsActivity extends GifshowActivity	// class@000812
{
    public ProgressFragment A;
    public boolean B;
    public PushSettingsListFragment y;
    public PushStatusResponse z;

    public void PushSettingsActivity(){
       super();
    }
    public int f(){
       PushSettingsActivity obj = PatchProxy.apply(null, this, PushSettingsActivity.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.y;
       int i = (obj != null)? obj.f(): 0;
       return i;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, PushSettingsActivity.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public String getUrl(){
       PushSettingsActivity obj = PatchProxy.apply(null, this, PushSettingsActivity.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.y;
       String url = (obj != null)? obj.getUrl(): "";
       return url;
    }
    public void onCreate(Bundle p0){
       PushSettingsActivity pushSettings = PushSettingsActivity.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, pushSettings, "1")) {
          return;
       }
       super.onCreate(p0);
       w9.a(this);
       this.B = true;
       if (!PatchProxy.applyVoid(null, this, pushSettings, "2")) {
          PushSettingsListFragment pushSettings1 = new PushSettingsListFragment();
          this.y = pushSettings1;
          pushSettings1.dh(new ArrayList()).eh(R.string.arg_RES_7f104072);
          e uoe = this.getSupportFragmentManager().beginTransaction();
          uoe.v(0x1020002, this.y);
          uoe.m();
       }
       ProgressFragment progressFrag = new ProgressFragment();
       this.A = progressFrag;
       progressFrag.Ih(R.string.arg_RES_7f103667);
       this.A.show(this.getSupportFragmentManager(), "loading");
       this.u3();
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, PushSettingsActivity.class, "4")) {
          return;
       }
       super.onResume();
       if (this.B == null) {
          this.v3(false);
       }
       this.B = false;
       return;
    }
    public void u3(){
       if (PatchProxy.applyVoid(null, this, PushSettingsActivity.class, "5")) {
          return;
       }
       b.a(0x330163e).getPushSwitchStatus().map(new e()).subscribe(new PushSettingsActivity$a(this), new PushSettingsActivity$b(this));
       return;
    }
    public void v3(boolean p0){
       PushSettingsListFragment this;
       PushSettingsListFragment pushSettings = this;
       PushSettingsActivity pushSettings1 = PushSettingsActivity.class;
       if (PatchProxy.isSupport(pushSettings1) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), pushSettings, pushSettings1, "3")) {
          return;
       }
       pushSettings1 = pushSettings.z;
       Object obj = null;
       PushStatusResponse pushStatusRe = (pushSettings1 != null)? pushSettings1.mSwitchItemList: obj;
       PushStatusResponse pushStatusRe1 = (pushSettings1 != null)? pushSettings1.optionMaps: obj;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(d.class)) {
          this = PatchProxy.applyFourRefs(this, pushStatusRe, pushStatusRe1, Boolean.valueOf(p0), null, d.class, "4");
          if (this != patchProxyRe) {
          label_012d :
             pushSettings.y = this;
             e uoe = this.getSupportFragmentManager().beginTransaction();
             uoe.v(0x1020002, pushSettings.y);
             uoe.m();
             return;
          }
       }
       super();
       ArrayList uArrayList = new ArrayList();
       if (!m5.b(this)) {
          f uof = PatchProxy.applyOneRefs(pushSettings, obj, v.class, "5");
          if (uof != patchProxyRe) {
          }else {
             f$a uoa = new f$a().c(0, a1.p(R.string.arg_RES_7f104073), null, a1.p(R.string.arg_RES_7f104075), 0);
             m om = new m(pushSettings);
             String str = "4";
             f$a obj1 = PatchProxy.applyOneRefs(pushSettings, om, m.class, str);
             om = (obj1 != patchProxyRe)? obj1: new j(pushSettings);
             uoa.d(om);
             uoa.b(true);
             k ok = new k();
             obj1 = f$a.class;
             obj = PatchProxy.applyOneRefsWithListener(ok, uoa, obj1, str);
             if (obj != patchProxyRe) {
                uoa = obj;
             }else {
                uoa.a.l.add(ok);
                PatchProxy.onMethodExit(obj1, str);
             }
             uof = uoa.a();
          }
          uArrayList.add(uof);
       }
       PushSettingsActivity pushSettings2 = null;
       if (!q.f(pushStatusRe)) {
          Iterator iterator = pushStatusRe.iterator();
          SwitchItem switchItem = 1;
          while (iterator.hasNext()) {
             SwitchItem switchItem1 = iterator.next();
             if (switchItem1 != null) {
                if (switchItem1.mGroupId != switchItem && TextUtils.x(switchItem1.mDescription)) {
                   uArrayList.add(new m());
                }
                switchItem = switchItem1.mGroupId;
                if (("binary").equals(switchItem1.mSelectedOption.mType)) {
                   uArrayList.add(new r0(pushSettings, switchItem1));
                }else {
                   uArrayList.add(new p0(pushSettings, switchItem1, pushStatusRe1));
                   if (!switchItem1.mId - 15) {
                      pushSettings2 = 1;
                   }
                }
             }
          }
       }
       if (p0 && !pushSettings2) {
          i.b(1006, pushSettings);
       }
       this.dh(uArrayList);
       this.eh(R.string.arg_RES_7f104072);
       goto label_012d ;
    }
}
