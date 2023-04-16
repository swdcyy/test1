package com.yxcorp.gifshow.detail.plc.test.PlcDebugRequestDetailActivity;
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
import android.os.Bundle;

public class PlcDebugRequestDetailActivity extends GifshowActivity	// class@00169c
{

    public void PlcDebugRequestDetailActivity(){
       super();
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, PlcDebugRequestDetailActivity.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PlcDebugRequestDetailActivity.class, "1")) {
          return;
       }
       super.onCreate(p0);
       this.setContentView(R.layout.arg_RES_7f0d0035);
       return;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, PlcDebugRequestDetailActivity.class, "2")) {
          return;
       }
       super.onDestroy();
       return;
    }
}
