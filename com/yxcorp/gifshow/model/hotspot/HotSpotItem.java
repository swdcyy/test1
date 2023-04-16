package com.yxcorp.gifshow.model.hotspot.HotSpotItem;
import java.io.Serializable;
import java.lang.Object;

public class HotSpotItem implements Serializable	// class@001ef6
{
    public boolean isItemShowed;
    public String mAuthorName;
    public CDNUrl[] mCoverUrl;
    public int mHotWordType;
    public HotSpotItem$IconInfo mIconInfo;
    public String mKeyWord;
    public String mLinkUrl;
    public String mLiveStreamId;
    public int mNormalIndex;
    public String mPhotoId;
    public int mPosition;
    public String mRecoReason;
    public String mServerExpTag;
    public String mShowCount;
    public String mTime;
    public Long mWordId;
    public static final long serialVersionUID = 0x12d22a7e43ea3493;

    public void HotSpotItem(){
       super();
       this.mNormalIndex = -1;
    }
}
