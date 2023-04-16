package com.alipay.sdk.app.H5AuthActivity;
import com.alipay.sdk.app.H5PayActivity;
import com.alipay.sdk.app.AuthTask;
import java.lang.Object;
import android.content.res.Resources;
import android.app.Activity;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;

public class H5AuthActivity extends H5PayActivity	// class@000e8d
{

    public void H5AuthActivity(){
       super();
    }
    public void a(){
       Object c = AuthTask.c;
       _monitor_enter(c);
       try{
          c.notify();
          _monitor_exit(e0);
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public Resources getResources(){
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
}
