package com.yxcorp.login.bind.AccountRiskCheckActivity;
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
import com.yxcorp.gifshow.widget.SwipeLayout;
import lnc.w9;
import androidx.fragment.app.Fragment;
import com.yxcorp.login.userlogin.fragment.AccountRiskCheckFragment;
import android.content.Intent;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.yxcorp.login.userlogin.fragment.AccountRiskCheckFragment$a;

public final class AccountRiskCheckActivity extends SingleFragmentActivity	// class@001a3c
{

    public void AccountRiskCheckActivity(){
       super();
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, AccountRiskCheckActivity.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public String getUrl(){
       return "ks://login/risk_check";
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AccountRiskCheckActivity.class, "1")) {
          return;
       }
       super.onCreate(p0);
       w9.a(this);
       return;
    }
    public Fragment u3(){
       AccountRiskCheckFragment$a obj = PatchProxy.apply(null, this, AccountRiskCheckActivity.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = AccountRiskCheckFragment.l;
       Intent intent = this.getIntent();
       a.o(intent, "intent");
       Bundle extras = intent.getExtras();
       Objects.requireNonNull(obj);
       AccountRiskCheckFragment uAccountRisk = PatchProxy.applyOneRefs(extras, obj, AccountRiskCheckFragment$a.class, "1");
       if (uAccountRisk != PatchProxyResult.class) {
       }else {
          uAccountRisk = new AccountRiskCheckFragment();
          uAccountRisk.setArguments(extras);
       }
       return uAccountRisk;
    }
}
