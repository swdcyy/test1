package com.yxcorp.plugin.setting.activity.AtMeTabPrivateWorksSettingActivity;
import com.yxcorp.gifshow.activity.SingleFragmentActivity;
import com.yxcorp.plugin.setting.activity.AtMeTabPrivateWorksSettingActivity$a;
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
import com.yxcorp.plugin.setting.fragment.AtTabPrivateWorksSettingFragment;
import java.util.Objects;
import com.yxcorp.plugin.setting.fragment.AtTabPrivateWorksSettingFragment$a;

public final class AtMeTabPrivateWorksSettingActivity extends SingleFragmentActivity	// class@0007fd
{
    public HashMap y;
    public static final AtMeTabPrivateWorksSettingActivity$a z;

    static {
       AtMeTabPrivateWorksSettingActivity.z = new AtMeTabPrivateWorksSettingActivity$a(null);
    }
    public void AtMeTabPrivateWorksSettingActivity(){
       super();
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, AtMeTabPrivateWorksSettingActivity.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AtMeTabPrivateWorksSettingActivity.class, "1")) {
          return;
       }
       super.onCreate(p0);
       w9.a(this);
       return;
    }
    public Fragment u3(){
       AtTabPrivateWorksSettingFragment$a obj = PatchProxy.apply(null, this, AtMeTabPrivateWorksSettingActivity.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = AtTabPrivateWorksSettingFragment.p;
       Objects.requireNonNull(obj);
       AtTabPrivateWorksSettingFragment uAtTabPrivat = PatchProxy.apply(null, obj, AtTabPrivateWorksSettingFragment$a.class, "1");
       if (uAtTabPrivat != PatchProxyResult.class) {
       }else {
          uAtTabPrivat = new AtTabPrivateWorksSettingFragment();
       }
       return uAtTabPrivat;
    }
}
