package com.yxcorp.gifshow.message.notification.outapp.IMClickPushButtonActivity;
import android.app.Activity;
import android.content.res.Resources;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.ContextThemeWrapper;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import android.os.Bundle;
import o56.a;
import android.content.Intent;
import android.content.Context;
import com.yxcorp.gifshow.message.notification.outapp.a;

public class IMClickPushButtonActivity extends Activity	// class@001d7f
{

    public void IMClickPushButtonActivity(){
       super();
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, IMClickPushButtonActivity.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, IMClickPushButtonActivity.class, "1")) {
          return;
       }
       super.onCreate(p0);
       a.b(a.B, this.getIntent());
       this.finish();
       return;
    }
}
