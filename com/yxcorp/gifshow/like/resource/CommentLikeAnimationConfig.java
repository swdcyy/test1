package com.yxcorp.gifshow.like.resource.CommentLikeAnimationConfig;
import com.kwai.component.bifrost.BifrostFeatureActivityEntry;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import r85.b;

public class CommentLikeAnimationConfig extends BifrostFeatureActivityEntry	// class@001a56
{
    public BifrostZipResourceEntry mCommentLikeResource;

    public void CommentLikeAnimationConfig(){
       super();
    }
    public static void register(){
       if (PatchProxy.applyVoid(null, null, CommentLikeAnimationConfig.class, "1")) {
          return;
       }
       b.a("COMMENT_LIKE_ANIMATION", CommentLikeAnimationConfig.class);
       return;
    }
}
