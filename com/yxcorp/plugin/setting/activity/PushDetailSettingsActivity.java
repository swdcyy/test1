package com.yxcorp.plugin.setting.activity.PushDetailSettingsActivity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.google.gson.internal.LinkedTreeMap;
import com.yxcorp.gifshow.model.SwitchItem;
import n3d.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.Intent;
import android.content.Context;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import android.app.Activity;
import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import android.os.Bundle;
import com.yxcorp.gifshow.widget.SwipeLayout;
import lnc.w9;
import java.util.Map;
import java.lang.Exception;
import com.yxcorp.plugin.setting.fragment.SettingListFragment;
import java.util.ArrayList;
import pgd.x;
import java.util.List;
import xgc.l;
import xgc.m;
import com.yxcorp.plugin.setting.helper.PushOptionSelectGroup;
import java.util.Collection;
import java.lang.Iterable;
import trd.u;
import java.util.Iterator;
import com.yxcorp.gifshow.model.SelectOption;
import com.yxcorp.plugin.setting.entries.holder.r0;
import kotlin.Pair;
import qrd.r0;
import com.yxcorp.plugin.setting.entries.holder.p0;
import kotlin.collections.CollectionsKt__CollectionsKt;
import wgc.c;
import xgc.g;
import xgc.g$a;
import xgc.a;
import xgc.b;
import com.yxcorp.gifshow.settings.holder.EntryListFragment;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.e;
import androidx.fragment.app.Fragment;

public class PushDetailSettingsActivity extends GifshowActivity	// class@00080f
{
    public BaseFragment A;
    public SwitchItem y;
    public Map z;

    public void PushDetailSettingsActivity(){
       super();
    }
    public static void u3(GifshowActivity p0,LinkedTreeMap p1,SwitchItem p2,a p3){
       if (PatchProxy.applyVoidFourRefsWithListener(p0, p1, p2, p3, null, PushDetailSettingsActivity.class, "1")) {
          return;
       }
       Intent intent = new Intent(p0, PushDetailSettingsActivity.class);
       SerializableHook.putExtra(intent, "option_map", p1);
       SerializableHook.putExtra(intent, "selected_item", p2);
       p0.t1(intent, 4, p3);
       PatchProxy.onMethodExit(PushDetailSettingsActivity.class, "1");
       return;
    }
    public int f(){
       PushDetailSettingsActivity obj = PatchProxy.apply(null, this, PushDetailSettingsActivity.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.A;
       int i = (obj != null)? obj.f(): 0;
       return i;
    }
    public void finish(){
       if (PatchProxy.applyVoid(null, this, PushDetailSettingsActivity.class, "3")) {
          return;
       }
       Intent intent = new Intent();
       PushDetailSettingsActivity ty = this.y;
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
       Object obj = PatchProxy.apply(null, this, PushDetailSettingsActivity.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public String getUrl(){
       PushDetailSettingsActivity obj = PatchProxy.apply(null, this, PushDetailSettingsActivity.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.A;
       String url = (obj != null)? obj.getUrl(): "";
       return url;
    }
    public void onCreate(Bundle p0){
       PatchProxyResult patchProxyRe;
       SettingListFragment settingListF;
       e uoe;
       ArrayList uArrayList;
       x ox;
       x ox1;
       ArrayList uArrayList1;
       PushDetailSettingsActivity y;
       SwitchItem mTitle;
       SwitchItem mInnerInnerD;
       l ol;
       ArrayList uArrayList2;
       Iterator iterator;
       SwitchItem switchItem1;
       SelectOption mType;
       Pair pair;
       p0 op0;
       Iterator iterator1;
       int i;
       c obj;
       int i1;
       SwitchItem switchItem2;
       int i2;
       x b;
       SwitchItem obj1;
       g$a uoa;
       String str1;
       a obj2;
       m om;
       SwitchItem switchItem = this;
       PushDetailSettingsActivity pushDetailSe = PushDetailSettingsActivity.class;
       String str = "2";
       if (PatchProxy.applyVoidOneRefs(p0, switchItem, pushDetailSe, str)) {
          return;
       }
       super.onCreate(p0);
       w9.a(this);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, switchItem, pushDetailSe, "4") && this.getIntent() != null) {
          try{
             switchItem.y = SerializableHook.getSerializableExtra(this.getIntent(), "selected_item");
             switchItem.z = SerializableHook.getSerializableExtra(this.getIntent(), "option_map");
          }catch(java.lang.Exception e0){
             e0.printStackTrace();
          }
       }
    }
}
