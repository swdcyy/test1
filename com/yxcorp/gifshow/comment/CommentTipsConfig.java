package com.yxcorp.gifshow.comment.CommentTipsConfig;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class CommentTipsConfig	// class@001097
{
    public boolean mDisableEmptyCommentGuide;
    public int mEmptyRes;
    public int mEmptySubTextResId;
    public int mEmptyTextResId;
    public float mEmptyViewTranslationY;
    public boolean mEnableFirstLoading;
    public boolean mForceTipsCenter;

    public void CommentTipsConfig(){
       super();
       this.mForceTipsCenter = true;
       this.mEmptyRes = 0;
       this.mEnableFirstLoading = true;
    }
    public CommentTipsConfig copy(){
       CommentTipsConfig obj = PatchProxy.apply(null, this, CommentTipsConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new CommentTipsConfig();
       obj.mForceTipsCenter = this.mForceTipsCenter;
       obj.mEmptyRes = this.mEmptyRes;
       obj.mEmptyTextResId = this.mEmptyTextResId;
       obj.mEmptySubTextResId = this.mEmptySubTextResId;
       obj.mDisableEmptyCommentGuide = this.mDisableEmptyCommentGuide;
       obj.mEmptyViewTranslationY = this.mEmptyViewTranslationY;
       return obj;
    }
}
