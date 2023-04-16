package com.yxcorp.gifshow.model.response.CommentReportParams;
import java.io.Serializable;
import java.lang.Object;

public class CommentReportParams implements Serializable	// class@001f28
{
    public long mCommentRelativeTime;
    public int mPlayCnt;

    public void CommentReportParams(int p0,long p1){
       super();
       this.mPlayCnt = p0;
       this.mCommentRelativeTime = p1;
    }
}
