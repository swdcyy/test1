package com.yxcorp.plugin.setting.activity.UserSettingsUpdateActivity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.util.ArrayList;
import com.yxcorp.plugin.setting.activity.UserSettingsUpdateActivity$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import android.content.Intent;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import android.app.Activity;
import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import android.os.Bundle;
import com.yxcorp.gifshow.widget.SwipeLayout;
import lnc.w9;
import java.util.List;
import com.yxcorp.gifshow.settings.holder.SettingSelectData;
import e17.i;
import com.yxcorp.plugin.setting.fragment.SettingListFragment;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import xgc.l;
import xgc.m;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import com.yxcorp.gifshow.model.SelectOption;
import xgc.d;
import java.lang.Boolean;
import java.lang.Integer;
import xgc.i;
import xgc.i$a;
import wgc.o;
import com.yxcorp.gifshow.settings.holder.EntryListFragment;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.e;
import androidx.fragment.app.Fragment;
import xgc.e;
import android.view.View;
import wgc.d;

public class UserSettingsUpdateActivity extends GifshowActivity	// class@00081c
{
    public int A;
    public int B;
    public final List C;
    public BaseFragment D;
    public final o E;
    public SelectOption y;
    public SettingSelectData z;

    public void UserSettingsUpdateActivity(){
       super();
       this.C = new ArrayList();
       this.E = new UserSettingsUpdateActivity$a(this);
    }
    public int f(){
       UserSettingsUpdateActivity obj = PatchProxy.apply(null, this, UserSettingsUpdateActivity.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.D;
       int i = (obj != null)? obj.f(): 0;
       return i;
    }
    public void finish(){
       if (PatchProxy.applyVoid(null, this, UserSettingsUpdateActivity.class, "5")) {
          return;
       }
       Intent intent = new Intent();
       UserSettingsUpdateActivity ty = this.y;
       if (ty != null) {
          SerializableHook.putExtra(intent, "result_data", ty);
       }
       this.setResult(-1, intent);
       super.finish();
       return;
    }
    public int getPage(){
       return 5;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, UserSettingsUpdateActivity.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public String getUrl(){
       UserSettingsUpdateActivity obj = PatchProxy.apply(null, this, UserSettingsUpdateActivity.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.D;
       String url = (obj != null)? obj.getUrl(): "";
       return url;
    }
    public void onCreate(Bundle p0){
       UserSettingsUpdateActivity c;
       SettingListFragment settingListF;
       e uoe;
       ArrayList uArrayList;
       UserSettingsUpdateActivity z;
       SettingSelectData mSelectOptio;
       Iterator iterator;
       SelectOption selectOption;
       int i;
       boolean b;
       UserSettingsUpdateActivity e;
       int i1;
       boolean b1;
       i oi;
       i$a uoa;
       UserSettingsUpdateActivity z1;
       SettingSelectData mTitle;
       SettingSelectData settingSelec = this;
       UserSettingsUpdateActivity userSettings = UserSettingsUpdateActivity.class;
       if (PatchProxy.applyVoidOneRefs(p0, settingSelec, userSettings, "4")) {
          return;
       }
       super.onCreate(p0);
       w9.a(this);
       settingSelec.C.clear();
       UserSettingsUpdateActivity userSettings1 = null;
       if (!PatchProxy.applyVoid(null, settingSelec, userSettings, "6") && this.getIntent() != null) {
          try{
             settingSelec.z = SerializableHook.getSerializableExtra(this.getIntent(), "select_data");
             settingSelec.A = this.getIntent().getIntExtra("option_mode", userSettings1);
             settingSelec.B = this.getIntent().getIntExtra("case_mode", userSettings1);
             settingSelec.y = settingSelec.z.mSelectedOption;
          }catch(java.lang.Exception e0){
             i.a(R.style.arg_RES_7f110668, 0x7f100d6e);
             this.finish();
          }
       }
    }
    public void u3(e p0,SelectOption p1,View p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, UserSettingsUpdateActivity.class, "10")) {
          return;
       }
       if (!q.f(this.C)) {
          Iterator iterator = this.C.iterator();
          while (iterator.hasNext()) {
             i oi = iterator.next();
             oi.b().i = false;
             oi.h().f.findViewById(R.id.entry_checkout).setSelected(false);
          }
       }
       p0.i = true;
       p2.findViewById(R.id.entry_checkout).setSelected(true);
       this.y = p1;
       return;
    }
}
