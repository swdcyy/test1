package com.kuaishou.live.locallife.model.LiveLocalLifeBizItem;
import java.io.Serializable;
import java.lang.Object;

public class LiveLocalLifeBizItem implements Serializable	// class@000c2a
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
    public static final long serialVersionUID = 0xfbb95ba718e62b8;

    public void LiveLocalLifeBizItem(){
       super();
    }
}
