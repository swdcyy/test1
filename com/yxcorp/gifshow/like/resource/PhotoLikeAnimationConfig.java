package com.yxcorp.gifshow.like.resource.PhotoLikeAnimationConfig;
import com.kwai.component.bifrost.BifrostFeatureActivityEntry;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import r85.b;

public class PhotoLikeAnimationConfig extends BifrostFeatureActivityEntry	// class@001a5a
{
    public BifrostZipResourceEntry mPhotoLikeAnimation;

    public void PhotoLikeAnimationConfig(){
       super();
    }
    public static void register(){
       if (PatchProxy.applyVoid(null, null, PhotoLikeAnimationConfig.class, "1")) {
          return;
       }
       b.a("PHOTO_LIKE_ANIMATION", PhotoLikeAnimationConfig.class);
       return;
    }
}
