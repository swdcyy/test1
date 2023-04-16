package com.yxcorp.gifshow.focusdialog.FocusDialogActivity;
import com.yxcorp.gifshow.gepush.GePushActivity;
import android.content.res.Resources;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;

public final class FocusDialogActivity extends GePushActivity	// class@00100e
{

    public void FocusDialogActivity(){
       super();
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, FocusDialogActivity.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
}
