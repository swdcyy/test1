package com.yxcorp.login.userlogin.activity.AccountSecurityActivity;
import com.yxcorp.gifshow.activity.SingleFragmentActivity;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.content.Intent;
import android.app.Activity;
import ekd.j0;
import com.kwai.robust.PatchProxyResult;
import android.net.Uri;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import android.os.Bundle;
import com.yxcorp.gifshow.util.rx.RxBus;
import eda.n;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import brd.t;
import x1d.a;
import erd.g;
import crd.b;
import lnc.b9;
import androidx.fragment.app.Fragment;
import com.yxcorp.login.userlogin.fragment.AccountSecurityFragment;

public class AccountSecurityActivity extends SingleFragmentActivity	// class@001aff
{
    public b y;
    public static final int z;

    public void AccountSecurityActivity(){
       super();
    }
    public int M(){
       return 1;
    }
    public void finish(){
       if (PatchProxy.applyVoid(null, this, AccountSecurityActivity.class, "2")) {
          return;
       }
       super.finish();
       if (j0.b(this.getIntent(), "finish_anim_mode", 0) == 1) {
          this.overridePendingTransition(R.anim.arg_RES_7f0100f3, 0x7f01010d);
       }else {
          this.overridePendingTransition(0, R.anim.arg_RES_7f010112);
       }
       return;
    }
    public int getPage(){
       return 157;
    }
    public String getPageParams(){
       Intent obj = PatchProxy.apply(null, this, AccountSecurityActivity.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.getIntent();
       String str = "";
       String str1 = (obj == null || obj.getData() == null)? str: "source="+obj.getData().getQueryParameter("source");
       if (!TextUtils.x(str1)) {
          StringBuilder str2 = "";
          str2 = (!TextUtils.x(str))? str2+"&"+str1: str2+str1;
          str = str2;
       }
       return str;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, AccountSecurityActivity.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public String getUrl(){
       return "ks://account_security";
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AccountSecurityActivity.class, "5")) {
          return;
       }
       super.onCreate(p0);
       this.y = RxBus.f.g(n.class, RxBus$ThreadMode.MAIN).subscribe(new a(this));
       return;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, AccountSecurityActivity.class, "6")) {
          return;
       }
       super.onDestroy();
       b9.a(this.y);
       return;
    }
    public Fragment u3(){
       Object obj = PatchProxy.apply(null, this, AccountSecurityActivity.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new AccountSecurityFragment();
    }
}
