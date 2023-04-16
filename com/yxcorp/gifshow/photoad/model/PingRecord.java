package com.yxcorp.gifshow.photoad.model.PingRecord;
import java.io.Serializable;
import java.lang.Object;
import java.util.ArrayList;

public class PingRecord implements Serializable	// class@000f9f
{
    public String mAuthorId;
    public String mFeedId;
    public int mImeiSource;
    public Long mLlsid;
    public String mMediaAppId;
    public int mOaidSource;
    public Long mPageId;
    public Long mPosId;
    public Long mSubPageId;
    public int mType;
    public List mUrls;

    public void PingRecord(){
       super();
       this.mUrls = new ArrayList();
    }
}
