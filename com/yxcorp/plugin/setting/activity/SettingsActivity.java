package com.yxcorp.plugin.setting.activity.SettingsActivity;
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
import android.content.Intent;
import java.lang.Integer;
import android.os.Bundle;
import com.yxcorp.gifshow.widget.SwipeLayout;
import lnc.w9;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import com.yxcorp.plugin.setting.stencil.SettingItemListStencilFragment;
import androidx.fragment.app.e;
import com.yxcorp.plugin.setting.stencil.config.SettingPage;
import java.lang.Boolean;
import java.util.Objects;
import com.yxcorp.plugin.setting.stencil.SettingItemListStencilFragment$a;
import kotlin.jvm.internal.a;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import yfd.d$a;
import java.lang.Runnable;
import java.util.concurrent.Future;
import t45.c;

public class SettingsActivity extends GifshowActivity	// class@000817
{
    public final String y;
    public BaseFragment z;
    public static final int A;

    public void SettingsActivity(){
       super();
       this.y = "settingListFragment";
    }
    public int f(){
       SettingsActivity obj = PatchProxy.apply(null, this, SettingsActivity.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.z;
       int i = (obj != null)? obj.f(): 0;
       return i;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, SettingsActivity.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public String getUrl(){
       return "ks://settings";
    }
    public void onActivityResult(int p0,int p1,Intent p2){
       if (PatchProxy.isSupport(SettingsActivity.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, SettingsActivity.class, "6")) {
          return;
       }
       super.onActivityResult(p0, p1, p2);
       if (p1 == 0x2710) {
          this.finish();
       }
       return;
    }
    public void onCreate(Bundle p0){
       SettingItemListStencilFragment settingItemL;
       SettingsActivity settingsActi = SettingsActivity.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, settingsActi, "3")) {
          return;
       }
       super.onCreate(p0);
       w9.a(this);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, settingsActi, "4")) {
          Fragment uFragment = this.getSupportFragmentManager().findFragmentByTag("settingListFragment");
          if (uFragment instanceof SettingItemListStencilFragment) {
             this.z = uFragment;
          }else if(uFragment != null){
             this.getSupportFragmentManager().beginTransaction().u(uFragment).o();
          }
          SettingPage sETTING = SettingPage.SETTING;
          SettingsActivity settingsActi1 = 1;
          PatchProxyResult patchProxyRe = PatchProxyResult.class;
          if (PatchProxy.isSupport(SettingItemListStencilFragment.class)) {
             objArray = PatchProxy.applyTwoRefs(sETTING, Boolean.TRUE, objArray, SettingItemListStencilFragment.class, "16");
             if (objArray != patchProxyRe) {
             }else {
             label_005f :
                SettingItemListStencilFragment$a r = SettingItemListStencilFragment.r;
                Objects.requireNonNull(r);
                if (PatchProxy.isSupport(SettingItemListStencilFragment$a.class)) {
                   Object obj = PatchProxy.applyTwoRefs(sETTING, Boolean.TRUE, r, SettingItemListStencilFragment$a.class, "2");
                   if (obj != patchProxyRe) {
                      settingItemL = obj;
                   }
                }
                a.p(sETTING, "page");
                SettingItemListStencilFragment settingItemL1 = new SettingItemListStencilFragment();
                if (PatchProxy.isSupport(SettingItemListStencilFragment$a.class)) {
                   r = PatchProxy.applyTwoRefs(sETTING, Boolean.TRUE, r, SettingItemListStencilFragment$a.class, "1");
                   if (r != patchProxyRe) {
                   label_00a9 :
                      settingItemL1.setArguments(r);
                      settingItemL = settingItemL1;
                   }
                }
                a.p(sETTING, "page");
                r = new Bundle();
                SerializableHook.putSerializable(r, "PARAMS_SETTING_PAGE", sETTING);
                r.putBoolean("PARAMS_SHOW_DIVIDER", settingsActi1);
                goto label_00a9 ;
             }
          }else {
             goto label_005f ;
          }
          this.z = objArray;
          e uoe = this.getSupportFragmentManager().beginTransaction();
          uoe.w(0x1020002, this.z, "settingListFragment");
          uoe.m();
       }
       c.k(new d$a());
       return;
    }
}
