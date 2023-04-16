package com.kuaishou.live.core.basic.model.LiveStartInfoResponse;
import java.io.Serializable;
import java.lang.Object;

public class LiveStartInfoResponse implements Serializable	// class@000886
{
    public String mAnchorBuyPushTip;
    public String mAudioLiveTitle;
    public String mCode;
    public LiveSimpleTopicInfo mLiveTopicInfo;
    public LiveMerchantConfirmTextInfo mMerchantConfirmTextInfo;
    public LiveMerchantForbiddenResponse mMerchantForbiddenWhenChatResponse;
    public LiveMerchantForbiddenResponse mMerchantForbiddenWhenPkResponse;
    public int mResult;
    public int mThirdPartyGuideType;
    public String mTitle;
    public String mVoicePartyTitle;

    public void LiveStartInfoResponse(){
       super();
    }
}
