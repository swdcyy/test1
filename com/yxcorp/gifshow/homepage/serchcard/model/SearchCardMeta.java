package com.yxcorp.gifshow.homepage.serchcard.model.SearchCardMeta;
import java.io.Serializable;
import java.lang.Object;

public class SearchCardMeta implements Serializable	// class@001805
{
    public int mDisplayLimit;
    public String mFromPhotoId;
    public boolean mHasShown;
    public CDNUrl[] mIconUrls;
    public QPhoto mQPhoto;
    public String mRecallPhotoId;
    public List mRelateSearchWordList;
    public String mTitle;
    public String mUssid;
    public static final long serialVersionUID = 0xeaa962c249372b69;

    public void SearchCardMeta(){
       super();
    }
}
