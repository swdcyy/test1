package com.yxcorp.plugin.setting.activity.FontScaleSettingsActivity;
import com.yxcorp.gifshow.activity.SingleFragmentActivity;
import com.yxcorp.plugin.setting.activity.FontScaleSettingsActivity$a;
import nsd.u;
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
import androidx.fragment.app.Fragment;
import com.yxcorp.plugin.setting.fontscale.FontScaleSettingsFragment;

public class FontScaleSettingsActivity extends SingleFragmentActivity	// class@000808
{
    public HashMap y;
    public static final FontScaleSettingsActivity$a z;

    static {
       FontScaleSettingsActivity.z = new FontScaleSettingsActivity$a(null);
    }
    public void FontScaleSettingsActivity(){
       super();
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, FontScaleSettingsActivity.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FontScaleSettingsActivity.class, "1")) {
          return;
       }
       super.onCreate(p0);
       w9.a(this);
       return;
    }
    public Fragment u3(){
       FontScaleSettingsFragment uFontScaleSe = PatchProxy.apply(null, this, FontScaleSettingsActivity.class, "2");
       if (uFontScaleSe != PatchProxyResult.class) {
       }else {
          uFontScaleSe = new FontScaleSettingsFragment();
       }
       return uFontScaleSe;
    }
}
