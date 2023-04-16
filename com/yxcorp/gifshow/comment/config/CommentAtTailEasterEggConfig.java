package com.yxcorp.gifshow.comment.config.CommentAtTailEasterEggConfig;
import com.kwai.component.bifrost.BifrostFeatureActivityEntry;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import r85.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.android.model.mix.PhotoMeta;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.mix.FeedSwitchesInfo;
import yb6.d;

public class CommentAtTailEasterEggConfig extends BifrostFeatureActivityEntry	// class@0010a6
{
    public List mEasterEggImageUrls;
    public boolean mEnable;
    public boolean mIsFromOldData;
    public long mOldEndTime;
    public long mOldStartTime;
    public QPhoto mPhoto;

    public void CommentAtTailEasterEggConfig(){
       super();
    }
    public static void register(){
       if (PatchProxy.applyVoid(null, null, CommentAtTailEasterEggConfig.class, "1")) {
          return;
       }
       b.a("COMMENT_AT_IMAGE_TAIL", CommentAtTailEasterEggConfig.class);
       return;
    }
    public boolean isEffective(){
       CommentAtTailEasterEggConfig obj = PatchProxy.apply(null, this, CommentAtTailEasterEggConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.mIsFromOldData != null) {
          obj = this.mPhoto;
          if (obj != null) {
             boolean b = false;
             if (obj.getPhotoMeta() != null && (this.mPhoto.getPhotoMeta().mFeedSwitches != null && this.mPhoto.getPhotoMeta().mFeedSwitches.mDisable61ActivityAnimation != null)) {
                return b;
             }else if(this.mEnable == null){
                return b;
             }else {
                long l = d.a();
                if (this.mOldStartTime - l <= 0 && l - this.mOldEndTime <= 0) {
                   b = true;
                }
                return b;
             }
          }
       }
       return super.isEffective();
    }
}
