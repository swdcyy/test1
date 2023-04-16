package com.yxcorp.login.userlogin.activity.HistoryOneKeyLoginActivity;
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
import com.yxcorp.login.userlogin.fragment.HistoryOneKeyLoginV2Fragment;

public class HistoryOneKeyLoginActivity extends LoginActivity	// class@001b04
{
    public Bundle A;
    public HistoryOneKeyLoginV2Fragment z;

    public void HistoryOneKeyLoginActivity(){
       super();
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, HistoryOneKeyLoginActivity.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public Fragment u3(){
       Bundle obj = PatchProxy.apply(null, this, HistoryOneKeyLoginActivity.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (this.getIntent().getExtras() != null)? this.getIntent().getExtras(): new Bundle();
       this.A = obj;
       if (this.z == null) {
          this.z = new HistoryOneKeyLoginV2Fragment();
       }
       this.z.setArguments(this.A);
       return this.z;
    }
}
