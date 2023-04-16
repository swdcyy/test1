package com.yxcorp.plugin.setting.activity.LanguageSettingsActivity;
import com.yxcorp.gifshow.activity.SingleFragmentActivity;
import com.yxcorp.plugin.setting.activity.d;
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
import com.kwai.feature.platform.misc.multilang.DynamicMultiLang;
import com.kwai.feature.platform.misc.multilang.DynamicMultiLang$b;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.util.ArrayList;
import androidx.fragment.app.Fragment;
import com.yxcorp.plugin.setting.fragment.SettingListFragment;
import com.yxcorp.gifshow.model.SelectOption;
import ra6.a;
import wgc.o;
import xgc.i;
import jgd.v;
import o56.a;
import android.app.Application;
import com.yxcorp.gifshow.settings.holder.EntryListFragment;
import java.util.List;

public class LanguageSettingsActivity extends SingleFragmentActivity	// class@00080c
{
    public o A;
    public SettingListFragment y;
    public ArrayList z;
    public static final int B;

    public void LanguageSettingsActivity(){
       super();
       this.A = new d(this);
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, LanguageSettingsActivity.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public String getUrl(){
       return null;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LanguageSettingsActivity.class, "4")) {
          return;
       }
       super.onCreate(p0);
       DynamicMultiLang d = DynamicMultiLang.d;
       DynamicMultiLang$b uob = d.b();
       if (uob != null && d.a()) {
          uob.a();
       }
       return;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, LanguageSettingsActivity.class, "5")) {
          return;
       }
       super.onDestroy();
       this.z.clear();
       return;
    }
    public Fragment u3(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LanguageSettingsActivity languageSett = LanguageSettingsActivity.class;
       Object[] objArray = null;
       LanguageSettingsActivity obj = PatchProxy.apply(objArray, this, languageSett, "3");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = PatchProxy.apply(objArray, this, languageSett, "6");
       if (obj != patchProxyRe) {
       }else {
          this.z = new ArrayList();
          if (!PatchProxy.applyVoid(objArray, this, languageSett, "7")) {
             SelectOption selectOption = new SelectOption();
             selectOption.mName = this.getString(0x7f1046e8);
             int i = 1;
             selectOption.mValue = i;
             boolean b = (i == a.d())? true: false;
             this.z.add(v.a(selectOption, b, this.A));
             selectOption = new SelectOption();
             selectOption.mName = a.B.getString(0x7f1046e9);
             b = 2;
             selectOption.mValue = b;
             LanguageSettingsActivity tz = this.z;
             b = (b == a.d())? true: false;
             tz.add(v.a(selectOption, b, this.A));
             selectOption = new SelectOption();
             selectOption.mName = a.B.getString(0x7f1046e6);
             b = 3;
             selectOption.mValue = b;
             tz = this.z;
             if (b != a.d()) {
                i = false;
             }
             tz.add(v.a(selectOption, i, this.A));
          }
          SettingListFragment settingListF = new SettingListFragment();
          this.y = settingListF;
          settingListF.fh(this.getString(R.string.arg_RES_7f1046e7));
          this.y.dh(this.z);
          obj = this.y;
       }
       return obj;
    }
    public boolean y3(){
       return true;
    }
}
