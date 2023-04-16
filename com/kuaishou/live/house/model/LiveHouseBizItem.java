package com.kuaishou.live.house.model.LiveHouseBizItem;
import java.io.Serializable;
import java.lang.Object;

public class LiveHouseBizItem implements Serializable	// class@001d0f
{
    public TunaButtonModel mActionUrl;
    public JsonElement mBizConfig;
    public int mBizId;
    public String mBizType;
    public String mButtonText;
    public String mDesc;
    public CDNUrl[] mIcons;
    public boolean mIsChecked;
    public boolean mIsDynamicIcon;
    public int mItemStyle;
    public int[] mLiveTypesArray;
    public int mLoopCount;
    public CDNUrl[] mSlideIcons;
    public String mSlideTitle;
    public String mTipContent;
    public String mTitle;
    public static final long serialVersionUID = 0x28de4e5213ce2;

    public void LiveHouseBizItem(){
       super();
    }
}
