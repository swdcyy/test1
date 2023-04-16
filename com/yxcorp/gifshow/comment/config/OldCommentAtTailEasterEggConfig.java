package com.yxcorp.gifshow.comment.config.OldCommentAtTailEasterEggConfig;
import java.io.Serializable;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.comment.config.CommentAtTailEasterEggConfig;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import com.kwai.component.bifrost.res.BifrostImageResourceEntry;
import com.kwai.component.bifrost.res.BifrostCommonResourceEntry;
import java.util.Set;
import java.util.Collections;
import java.util.Collection;

public class OldCommentAtTailEasterEggConfig implements Serializable	// class@0010ad
{
    public List mEasterEggImageUrls;
    public boolean mEnable;
    public long mEndTime;
    public long mStartTime;

    public void OldCommentAtTailEasterEggConfig(){
       super();
    }
    public CommentAtTailEasterEggConfig build(QPhoto p0){
       CommentAtTailEasterEggConfig obj = PatchProxy.applyOneRefs(p0, this, OldCommentAtTailEasterEggConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new CommentAtTailEasterEggConfig();
       obj.mOldEndTime = this.mEndTime;
       obj.mIsFromOldData = true;
       obj.mEnable = this.mEnable;
       obj.mPhoto = p0;
       obj.mOldStartTime = this.mStartTime;
       obj.mEasterEggImageUrls = new ArrayList();
       OldCommentAtTailEasterEggConfig tmEasterEggI = this.mEasterEggImageUrls;
       if (tmEasterEggI != null) {
          Iterator iterator = tmEasterEggI.iterator();
          while (iterator.hasNext()) {
             BifrostImageResourceEntry uBifrostImag = new BifrostImageResourceEntry();
             uBifrostImag.mEnableWarmup = true;
             uBifrostImag.mUrls = new ArrayList(Collections.singleton(iterator.next()));
             uBifrostImag.mType = 2;
             obj.mEasterEggImageUrls.add(uBifrostImag);
          }
       }
       return obj;
    }
}
