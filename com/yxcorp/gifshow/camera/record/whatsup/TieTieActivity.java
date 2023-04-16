package com.yxcorp.gifshow.camera.record.whatsup.TieTieActivity;
import com.yxcorp.gifshow.camera.record.whatsup.WhatsUpActivity;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.camera.record.whatsup.TieTieFragment;
import android.os.Bundle;
import android.content.res.Resources;
import android.app.Activity;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;

public class TieTieActivity extends WhatsUpActivity	// class@000fa1
{

    public void TieTieActivity(){
       super();
    }
    public Fragment G3(){
       TieTieFragment obj = PatchProxy.apply(null, this, TieTieActivity.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new TieTieFragment();
       this.O = obj;
       obj.setArguments(new Bundle());
       return this.O;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, TieTieActivity.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
}
