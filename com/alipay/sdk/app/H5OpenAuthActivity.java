package com.alipay.sdk.app.H5OpenAuthActivity;
import com.alipay.sdk.app.H5PayActivity;
import android.content.res.Resources;
import android.app.Activity;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import android.content.Intent;
import s6.a;
import s6.a$a;
import android.content.Context;
import java.lang.String;
import k6.a;
import android.net.Uri;
import java.lang.Throwable;

public class H5OpenAuthActivity extends H5PayActivity	// class@000e8e
{
    public boolean j;

    public void H5OpenAuthActivity(){
       super();
       this.j = false;
    }
    public void a(){
    }
    public Resources getResources(){
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public void onDestroy(){
       if (this.j != null) {
          a uoa = a$a.a(this.getIntent());
          if (uoa != null) {
             a.g(this, uoa, "", uoa.d);
          }
       }
       super.onDestroy();
       return;
    }
    public void startActivity(Intent p0){
       a uoa = a$a.a(p0);
       super.startActivity(p0);
       Uri data = (p0 != null)? p0.getData(): null;
       if (data != null && (data.toString()).startsWith("alipays://platformapi/startapp")) {
          this.finish();
       }
       return;
    }
}
