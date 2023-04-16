package com.kuaishou.live.common.core.basic.config.LiveCommonConfigResponse;
import java.io.Serializable;
import java.lang.Object;
import com.kuaishou.live.common.core.basic.config.LiveCommonConfigResponse$FollowAuthorFeedConfig;
import com.kuaishou.live.common.core.basic.config.LiveCommonConfigResponse$WishListConfig;
import com.kuaishou.live.common.core.basic.config.LiveCommonConfigResponse$AssistantConfig;
import com.kuaishou.live.common.core.basic.config.LiveCommonConfigResponse$BottomItemConfig;
import com.kuaishou.live.common.core.basic.config.LiveCommonConfigResponse$FansTopConfig;
import com.kuaishou.live.common.core.basic.config.LiveCommonConfigResponse$ShopConfig;
import com.kuaishou.live.common.core.basic.config.LiveCommonConfigResponse$LiveArrowRedPacketConfig;

public class LiveCommonConfigResponse implements Serializable	// class@000e93
{
    public LiveCommonConfigResponse$AssistantConfig mAssistantConfig;
    public LiveCommonConfigResponse$BottomItemConfig mBottomItemConfig;
    public boolean mDisableAudienceGiftDisplayExtend;
    public boolean mDisableAuthorGiftDisplayExtend;
    public LiveCommonConfigResponse$FansTopConfig mFansTop;
    public LiveCommonConfigResponse$FollowAuthorFeedConfig mFollowAutorFeedConfig;
    public LiveCommonConfigResponse$GiftConfig mGiftConfig;
    public String mLiveAdaptiveConfig;
    public LiveCommonConfigResponse$LiveArrowRedPacketConfig mLiveArrowRedPacketConfig;
    public LiveCommonConfigResponse$MagicFaceConfig mMagicFaceConfig;
    public LiveCommonConfigResponse$LivePkCommonConfig mPkCommonConfig;
    public LiveCommonConfigResponse$PushOriginConfig mPushOriginConfig;
    public LiveCommonConfigResponse$ShopConfig mShopConfig;
    public LiveCommonConfigResponse$WishListConfig mWishListConfig;
    public static final long serialVersionUID = 0x441a52208701b038;

    public void LiveCommonConfigResponse(){
       super();
       this.mFollowAutorFeedConfig = new LiveCommonConfigResponse$FollowAuthorFeedConfig();
       this.mWishListConfig = new LiveCommonConfigResponse$WishListConfig();
       this.mAssistantConfig = new LiveCommonConfigResponse$AssistantConfig();
       this.mBottomItemConfig = new LiveCommonConfigResponse$BottomItemConfig();
       this.mFansTop = new LiveCommonConfigResponse$FansTopConfig();
       this.mShopConfig = new LiveCommonConfigResponse$ShopConfig();
       this.mLiveArrowRedPacketConfig = new LiveCommonConfigResponse$LiveArrowRedPacketConfig();
    }
}
