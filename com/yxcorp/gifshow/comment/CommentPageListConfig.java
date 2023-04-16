package com.yxcorp.gifshow.comment.CommentPageListConfig;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class CommentPageListConfig	// class@001091
{
    public int mCommentPanelType;
    public boolean mEnableCommentEmotion;
    public boolean mEnableFirstPageNoNetOpt;
    public boolean mEnableFoldComment;
    public boolean mEnableLimitFirstRequestMinDuration;
    public boolean mEnableSinkComment;
    public boolean mEnableSubBrowseMode;
    public boolean mEnableUserInfoInComment;
    public int mHotCommentType;

    public void CommentPageListConfig(){
       super();
       this.mHotCommentType = 0;
       this.mCommentPanelType = 1;
    }
    public CommentPageListConfig copy(){
       CommentPageListConfig obj = PatchProxy.apply(null, this, CommentPageListConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new CommentPageListConfig();
       obj.mHotCommentType = this.mHotCommentType;
       obj.mEnableCommentEmotion = this.mEnableCommentEmotion;
       obj.mEnableFoldComment = this.mEnableFoldComment;
       obj.mEnableUserInfoInComment = this.mEnableUserInfoInComment;
       obj.mEnableLimitFirstRequestMinDuration = this.mEnableLimitFirstRequestMinDuration;
       obj.mEnableSinkComment = this.mEnableSinkComment;
       obj.mEnableFirstPageNoNetOpt = this.mEnableFirstPageNoNetOpt;
       obj.mEnableSubBrowseMode = this.mEnableSubBrowseMode;
       return obj;
    }
    public CommentPageListConfig enableCommentEmotion(){
       this.mEnableCommentEmotion = true;
       return this;
    }
    public CommentPageListConfig enableFirstPageNoNetOpt(){
       this.mEnableFirstPageNoNetOpt = true;
       return this;
    }
    public CommentPageListConfig enableFoldComment(){
       this.mEnableFoldComment = true;
       return this;
    }
    public void enableLimitFirstRequestMinDuration(){
       this.mEnableLimitFirstRequestMinDuration = true;
    }
    public CommentPageListConfig enableSinkComment(){
       this.mEnableSinkComment = true;
       return this;
    }
    public CommentPageListConfig enableUserInfoInComment(){
       this.mEnableUserInfoInComment = true;
       return this;
    }
    public CommentPageListConfig setCommentPanelType(int p0){
       this.mCommentPanelType = p0;
       return this;
    }
    public CommentPageListConfig setHotCommentType(int p0){
       this.mHotCommentType = p0;
       return this;
    }
}
