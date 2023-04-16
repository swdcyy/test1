package com.yxcorp.gifshow.model.response.AddCommentResponse;
import java.io.Serializable;
import java.lang.Object;

public class AddCommentResponse implements Serializable	// class@001f17
{
    public List attachmentList;
    public String mContent;
    public long mCreated;
    public CommentSendVideoEggEntry mEggEntry;
    public EmotionInfo mEmotionInfo;
    public String mId;
    public static final long serialVersionUID = 0x62fb5fd17c532437;

    public void AddCommentResponse(){
       super();
    }
}
