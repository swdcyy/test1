package com.kuaishou.android.model.feed.LiveCoverAnnex;
import java.io.Serializable;
import java.lang.Object;
import java.util.HashMap;

public class LiveCoverAnnex implements Serializable	// class@000b03
{
    public String mAction;
    public int mActionType;
    public int mCardType;
    public List mComments;
    public String mCommodityCount;
    public String mCommodityId;
    public String mCommodityImage;
    public String mCommodityPrice;
    public int mCommodityShowType;
    public String mCommodityTitle;
    public String mEntityId;
    public String mExpTag;
    public Map mExtraInfo;
    public List mIconUrls;
    public String mJumpUrl;
    public List mLiveInfos;
    public String mTitle;
    public int mType;
    public static final long serialVersionUID = 0x8078cfa4c235542e;

    public void LiveCoverAnnex(){
       super();
       this.mExtraInfo = new HashMap();
    }
}
