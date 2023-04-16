package com.kwai.live.gzone.comments.LiveGzoneHistoryCommentsResponse;
import java.io.Serializable;
import java.lang.Object;
import java.util.ArrayList;

public class LiveGzoneHistoryCommentsResponse implements Serializable	// class@000ca7
{
    public List mComments;
    public long mFansCount;
    public static final long serialVersionUID = 0xf34c0d904b3bd655;

    public void LiveGzoneHistoryCommentsResponse(){
       super();
       this.mComments = new ArrayList();
    }
}
