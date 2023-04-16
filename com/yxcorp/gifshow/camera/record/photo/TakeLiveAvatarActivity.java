package com.yxcorp.gifshow.camera.record.photo.TakeLiveAvatarActivity;
import com.yxcorp.gifshow.camera.record.photo.TakePictureActivity;
import android.content.res.Resources;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.app.Activity;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;

public class TakeLiveAvatarActivity extends TakePictureActivity	// class@000e9f
{

    public void TakeLiveAvatarActivity(){
       super();
    }
    public int getPage(){
       return 0;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, TakeLiveAvatarActivity.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public String getUrl(){
       return "ks://live_avatar";
    }
    public String o(){
       return "STATUS_PICTURE_TAKE";
    }
}
