package com.yxcorp.gifshow.like.resource.PhotoLikeIconConfig;
import com.kwai.component.bifrost.BifrostFeatureActivityEntry;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import r85.b;

public class PhotoLikeIconConfig extends BifrostFeatureActivityEntry	// class@001a5b
{
    public BifrostZipResourceEntry mPhotoLikeIcon;

    public void PhotoLikeIconConfig(){
       super();
    }
    public static void register(){
       if (PatchProxy.applyVoid(null, null, PhotoLikeIconConfig.class, "1")) {
          return;
       }
       b.a("PHOTO_LIKE_ICON", PhotoLikeIconConfig.class);
       return;
    }
}
