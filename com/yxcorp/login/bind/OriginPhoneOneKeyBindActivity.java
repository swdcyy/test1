package com.yxcorp.login.bind.OriginPhoneOneKeyBindActivity;
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
import c1d.m;
import android.content.Intent;
import java.util.Objects;
import com.kwai.feature.api.social.login.model.BindPhoneParams;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.login.bind.OriginPhoneOneKeyBindActivity$a;
import com.yxcorp.gifshow.widget.SwipeLayout$b;
import com.yxcorp.gifshow.widget.SwipeLayout;
import lnc.w9;
import androidx.fragment.app.Fragment;
import com.yxcorp.login.bind.fragment.OriginPhoneOneKeyBindFragment;

public class OriginPhoneOneKeyBindActivity extends SingleFragmentActivity	// class@001a45
{
    public BindPhoneParams y;
    public m z;

    public void OriginPhoneOneKeyBindActivity(){
       super();
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, OriginPhoneOneKeyBindActivity.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public void onCreate(Bundle p0){
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, OriginPhoneOneKeyBindActivity.class, str)) {
          return;
       }
       super.onCreate(p0);
       m om = new m(this.getIntent());
       this.z = om;
       Objects.requireNonNull(om);
       Serializable serializable = PatchProxy.apply(null, om, m.class, str);
       if (serializable != PatchProxyResult.class) {
       }else {
          serializable = SerializableHook.getSerializableExtra(om.a, "bind_phone_params");
       }
       this.y = serializable;
       if (serializable == null || TextUtils.x(serializable.mForceBindTips)) {
          w9.b(this, new OriginPhoneOneKeyBindActivity$a(this));
       }
       return;
    }
    public Fragment u3(){
       Object obj = PatchProxy.apply(null, this, OriginPhoneOneKeyBindActivity.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new OriginPhoneOneKeyBindFragment();
    }
}
