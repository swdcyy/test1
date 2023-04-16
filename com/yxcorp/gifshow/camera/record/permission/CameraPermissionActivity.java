package com.yxcorp.gifshow.camera.record.permission.CameraPermissionActivity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.content.res.Resources;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.ContextThemeWrapper;
import android.app.Activity;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import com.yxcorp.gifshow.camera.record.permission.c;
import android.os.Bundle;
import android.view.Window;
import android.view.View;
import java.util.Objects;
import lnc.a1;

public class CameraPermissionActivity extends GifshowActivity	// class@000e9b
{
    public c y;

    public void CameraPermissionActivity(){
       super();
    }
    public int M(){
       return 4;
    }
    public int P2(){
       return 1;
    }
    public int getPage(){
       return 277;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, CameraPermissionActivity.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public String getUrl(){
       return "";
    }
    public boolean isCustomImmersiveMode(){
       return true;
    }
    public void onBackPressed(){
       if (PatchProxy.applyVoid(null, this, CameraPermissionActivity.class, "2")) {
          return;
       }
       this.y.a(false);
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CameraPermissionActivity.class, "1")) {
          return;
       }
       super.onCreate(p0);
       this.getWindow().setBackgroundDrawableResource(R.color.arg_RES_7f062046);
       this.setContentView(R.layout.arg_RES_7f0d0185);
       c uoc = new c(this);
       this.y = uoc;
       View decorView = this.getWindow().getDecorView();
       Objects.requireNonNull(uoc);
       if (!PatchProxy.applyVoidOneRefs(decorView, uoc, c.class, "2")) {
          uoc.doBindView(decorView);
          uoc.d(true, true);
       }
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, CameraPermissionActivity.class, "3")) {
          return;
       }
       super.onResume();
       this.getWindow().setNavigationBarColor(a1.a(R.color.arg_RES_7f0619d6));
       this.y.c();
       return;
    }
}
