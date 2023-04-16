package com.yxcorp.gifshow.reminder.news.data.NewsEntranceResponse;
import java.io.Serializable;
import java.lang.Object;

public class NewsEntranceResponse implements Serializable	// class@001af0
{
    public String mExtraInfo;
    public boolean mHasLogShown;
    public long mLlsid;
    public List mPhotos;
    public RichTextMeta mRecoTextInfo;
    public boolean mShowUserHeads;
    public static final long serialVersionUID = 0x3edde5653f505fa9;

    public void NewsEntranceResponse(){
       super();
       this.mExtraInfo = "";
    }
}
