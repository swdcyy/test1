package com.yxcorp.login.userlogin.activity.KwaiAppLoginActivity;
import com.yxcorp.login.userlogin.activity.LoginActivity;
import android.content.res.Resources;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.app.Activity;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import androidx.fragment.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import com.yxcorp.login.userlogin.fragment.KwaiAppLoginV2Fragment;

public class KwaiAppLoginActivity extends LoginActivity	// class@001b05
{
    public Bundle A;
    public KwaiAppLoginV2Fragment z;

    public void KwaiAppLoginActivity(){
       super();
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, KwaiAppLoginActivity.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public Fragment u3(){
       Bundle obj = PatchProxy.apply(null, this, KwaiAppLoginActivity.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (this.getIntent().getExtras() != null)? this.getIntent().getExtras(): new Bundle();
       this.A = obj;
       if (this.z == null) {
          this.z = new KwaiAppLoginV2Fragment();
       }
       this.z.setArguments(this.A);
       return this.z;
    }
}
