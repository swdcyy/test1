package com.yxcorp.gifshow.comment.config.CommentStartupCommonPojo;
import java.io.Serializable;
import java.lang.Object;

public class CommentStartupCommonPojo implements Serializable	// class@0010ac
{
    public boolean mEnableCommentShowUpload;
    public boolean mEnableShowGodComment;
    public int mFoldupCommentThreshold;
    public int mGodCommentShowType;
    public RecommendGodComment mOneClickRecommendGodComment;
    public static final long serialVersionUID = 0xcfe190be6ca89d41;

    public void CommentStartupCommonPojo(){
       super();
       this.mFoldupCommentThreshold = -1;
    }
}
