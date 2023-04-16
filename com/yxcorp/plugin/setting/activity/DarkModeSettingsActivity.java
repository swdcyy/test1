package com.yxcorp.plugin.setting.activity.DarkModeSettingsActivity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.plugin.setting.activity.DarkModeSettingsActivity$a;
import nsd.u;
import java.util.ArrayList;
import com.yxcorp.plugin.setting.activity.DarkModeSettingsActivity$b;
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
import android.os.Bundle;
import com.yxcorp.gifshow.widget.SwipeLayout;
import lnc.w9;
import zf6.k;
import lnc.a1;
import kotlin.jvm.internal.a;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import com.yxcorp.gifshow.model.SelectOption;
import qrd.l1;
import wgc.o;
import xgc.i;
import jgd.v;
import com.yxcorp.gifshow.settings.holder.EntryListFragment;
import java.util.List;

public class DarkModeSettingsActivity extends GifshowActivity	// class@000804
{
    public String A;
    public final o B;
    public HashMap C;
    public BaseFragment y;
    public final ArrayList z;
    public static final DarkModeSettingsActivity$a D;

    static {
       DarkModeSettingsActivity.D = new DarkModeSettingsActivity$a(null);
    }
    public void DarkModeSettingsActivity(){
       super();
       this.z = new ArrayList();
       this.A = "";
       this.B = new DarkModeSettingsActivity$b(this);
    }
    public int M(){
       return 1;
    }
    public int f(){
       DarkModeSettingsActivity obj = PatchProxy.apply(null, this, DarkModeSettingsActivity.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.y;
       int i = (obj != null)? obj.f(): 0;
       return i;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, DarkModeSettingsActivity.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public String getUrl(){
       String url;
       DarkModeSettingsActivity obj = PatchProxy.apply(null, this, DarkModeSettingsActivity.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.y;
       if (obj != null) {
          url = obj.getUrl();
          if (url != null) {
          label_001d :
             return url;
          }
       }
       url = "";
       goto label_001d ;
    }
    public String o(){
       return "DARK_MODE_SETTINGS";
    }
    public void onCreate(Bundle p0){
       String str;
       DarkModeSettingsActivity uDarkModeSet = DarkModeSettingsActivity.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uDarkModeSet, "1")) {
          return;
       }
       super.onCreate(p0);
       w9.a(this);
       int i = 0x7f1009c5;
       int i1 = 0x7f1009c4;
       if (k.d()) {
          str = a1.p(i);
          a.o(str, "CommonUtil.string\(R.string.dark_mode_setting_open\)");
       }else {
          str = a1.p(i1);
          a.o(str, "CommonUtil.string\(R.stri¡­.dark_mode_setting_close\)");
       }
       this.A = str;
       Fragment uFragment = this.getSupportFragmentManager().findFragmentById(0x1020002);
       if (uFragment != null) {
          this.getSupportFragmentManager().beginTransaction().u(uFragment).o();
       }
       EntryListFragment uEntryListFr = PatchProxy.apply(null, this, uDarkModeSet, "3");
       if (uEntryListFr != PatchProxyResult.class) {
       }else {
          this.z.clear();
          SelectOption selectOption = new SelectOption();
          selectOption.mName = this.getString(i);
          selectOption.mValue = 1;
          this.z.add(v.a(selectOption, k.d(), this.B));
          selectOption = new SelectOption();
          selectOption.mName = this.getString(i1);
          selectOption.mValue = 2;
          this.z.add(v.a(selectOption, (1 ^ k.d()), this.B));
          uEntryListFr = new EntryListFragment();
          uEntryListFr.fh(this.getString(R.string.arg_RES_7f1009b6));
          uEntryListFr.dh(this.z);
       }
       e uoe = this.getSupportFragmentManager().beginTransaction();
       uoe.v(0x1020002, uEntryListFr);
       uoe.m();
       this.y = uEntryListFr;
       return;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, DarkModeSettingsActivity.class, "2")) {
          return;
       }
       super.onDestroy();
       this.z.clear();
       return;
    }
}
