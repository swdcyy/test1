package com.yxcorp.gifshow.push.dialog.spring_dialog.PushV3SpringActivity;
import com.yxcorp.gifshow.push.dialog.spring_dialog.SubProcessDialogActivity;
import android.content.res.Resources;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;

public final class PushV3SpringActivity extends SubProcessDialogActivity	// class@001644
{

    public void PushV3SpringActivity(){
       super();
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, PushV3SpringActivity.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
}
