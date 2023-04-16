package com.kuaishou.commercial.splash.v3.view.SplashV3Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import yx.j0;
import android.content.res.Resources;
import com.kwai.robust.PatchProxyResult;
import android.view.ContextThemeWrapper;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import android.os.Bundle;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.e;
import androidx.fragment.app.Fragment;
import com.kuaishou.commercial.splash.v3.view.SplashFragment;
import wkd.b;
import tjc.c;
import java.lang.StringBuilder;
import java.lang.Exception;

public class SplashV3Activity extends GifshowActivity	// class@001629
{

    public void SplashV3Activity(){
       super();
    }
    public boolean X2(){
       return true;
    }
    public void finish(){
       if (PatchProxy.applyVoid(null, this, SplashV3Activity.class, "3")) {
          return;
       }
       super.finish();
       this.overridePendingTransition(0, 0);
       Object[] objArray = new Object[0];
       j0.f("SplashV3Activity", "SplashV3Activity finish >>>", objArray);
       return;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, SplashV3Activity.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public boolean isCustomImmersiveMode(){
       return true;
    }
    public void onCreate(Bundle p0){
       e uoe;
       if (PatchProxy.applyVoidOneRefs(p0, this, SplashV3Activity.class, "1")) {
          return;
       }
       super.onCreate(p0);
       Object[] objArray = new Object[0];
       j0.f("SplashV3Activity", "SplashV3Activity onCreate >>>", objArray);
       try{
          objArray = 0x7f0d0038;
          this.setContentView(objArray);
          uoe = this.getSupportFragmentManager().beginTransaction();
          uoe.v(R.id.splash_content_container, SplashFragment.ch(2));
          uoe.m();
          return;
       }catch(java.lang.Exception e0){
          c uoc = b.a(-1608526086);
          Object[] objArray1 = new Object[uoe];
          j0.c(v1, "setContentView failed by: "+e0.getMessage()+",splash state = "+uoc.getState(), objArray1);
          if (uoc.getState() == 3) {
             uoc.a0();
          }
          this.finish();
          return;
       }
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, SplashV3Activity.class, "2")) {
          return;
       }
       super.onDestroy();
       Object[] objArray = new Object[0];
       j0.f("SplashV3Activity", "SplashV3Activity onDestroy >>>", objArray);
       return;
    }
}
