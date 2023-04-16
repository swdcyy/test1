package com.kuaishou.live.external.invoke.deserializer.gift.GiftPanelItemViewData;
import java.io.Serializable;
import java.lang.Object;

public class GiftPanelItemViewData implements Serializable	// class@001b79
{
    public String mDescription;
    public String mDynamicCornerBackgroundColor;
    public long mDynamicCornerCoolDownMillis;
    public long mDynamicCornerExpireMillis;
    public String mDynamicCornerShortText;
    public String mDynamicCornerText;
    public CDNUrl[] mDynamicGiftIconUrls;
    public long mExpireTimeMs;
    public String mName;
    public List mPicUrls;
    public List mRightIconUrl;
    public GiftPanelItemRightPictureInfo mRightPictureInfo;
    public static final long serialVersionUID = 0x142985c3a0d5dd8;

    public void GiftPanelItemViewData(){
       super();
       this.mDynamicCornerCoolDownMillis = 0x927c0;
    }
}
