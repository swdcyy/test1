package com.yxcorp.gifshow.commoninsertcard.entity.CommonInsertCardFeedMeta;
import java.io.Serializable;
import java.lang.Object;

public class CommonInsertCardFeedMeta implements Serializable	// class@00119f
{
    public String mCardBgImageUrl;
    public CommonInsertCardFeedMeta$CardData mCardData;
    public int mCardType;
    public CommonInsertCardFeedMeta$CommonConfigInfo mCommonConfigInfo;
    public String mFeedId;
    public int mMetaStyle;
    public CommonInsertCardFeedMeta$RnConfigInfo mRnConfigInfo;
    public CommonInsertCardFeedMeta$TkConfigInfo mTkConfigInfo;
    public static final long serialVersionUID = 0xe1d17f6ccb2ca489;

    public void CommonInsertCardFeedMeta(){
       super();
       this.mMetaStyle = 1;
       this.mCardType = 0;
    }
}
