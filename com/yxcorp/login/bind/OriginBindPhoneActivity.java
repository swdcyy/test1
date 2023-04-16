package com.yxcorp.login.bind.OriginBindPhoneActivity;
import com.yxcorp.gifshow.activity.SingleFragmentActivity;
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
import c1d.j;
import android.content.Intent;
import com.kwai.feature.api.social.login.model.BindPhoneParams;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.login.bind.OriginBindPhoneActivity$a;
import com.yxcorp.gifshow.widget.SwipeLayout$b;
import com.yxcorp.gifshow.widget.SwipeLayout;
import lnc.w9;
import androidx.fragment.app.Fragment;
import com.yxcorp.login.bind.fragment.OriginBindPhoneFragment;

public class OriginBindPhoneActivity extends SingleFragmentActivity	// class@001a43
{
    public j A;
    public BindPhoneParams y;
    public boolean z;

    public void OriginBindPhoneActivity(){
       super();
    }
    public int M(){
       return 1;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, OriginBindPhoneActivity.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, OriginBindPhoneActivity.class, "1")) {
          return;
       }
       super.onCreate(p0);
       j oj = new j(this.getIntent());
       this.A = oj;
       BindPhoneParams uBindPhonePa = oj.a();
       this.y = uBindPhonePa;
       if (uBindPhonePa == null || TextUtils.x(uBindPhonePa.mForceBindTips)) {
          w9.b(this, new OriginBindPhoneActivity$a(this));
       }
       return;
    }
    public Fragment u3(){
       Object obj = PatchProxy.apply(null, this, OriginBindPhoneActivity.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new OriginBindPhoneFragment();
    }
}
