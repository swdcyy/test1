package com.kuaishou.gifshow.kuaishan.mediascene.picture.MediaSceneImageCropActivity;
import com.yxcorp.gifshow.albumwrapper.ImageCropGifshowActivity;
import com.kuaishou.gifshow.kuaishan.mediascene.picture.MediaSceneImageCropActivity$a;
import android.content.res.Resources;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.app.Activity;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import android.os.Bundle;
import android.content.Intent;
import com.yxcorp.gifshow.image.KwaiZoomImageView;
import kxa.c$a;

public final class MediaSceneImageCropActivity extends ImageCropGifshowActivity	// class@001a88
{
    public int b1;
    public final MediaSceneImageCropActivity$a c1;

    public void MediaSceneImageCropActivity(){
       super();
       this.c1 = new MediaSceneImageCropActivity$a(this);
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, MediaSceneImageCropActivity.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MediaSceneImageCropActivity.class, "1")) {
          return;
       }
       super.onCreate(p0);
       int intExtra = this.getIntent().getIntExtra("margin_side", -1);
       if (intExtra != -1) {
          this.b1 = intExtra;
       }
       this.z3().setBoundsProvider(this.c1);
       return;
    }
    public int x3(){
       return 0x7f0d0eeb;
    }
}
