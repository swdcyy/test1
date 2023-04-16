package com.kuaishou.live.common.core.basic.config.StagFactoryksfeaturesftlivelivefeatureslivecommon;
import zk.j;
import java.lang.Object;
import com.google.gson.Gson;
import el.a;
import com.google.gson.TypeAdapter;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.common.core.basic.config.LiveCommonConfigResponse$MagicFaceConfig;
import com.kuaishou.live.common.core.basic.config.LiveCommonConfigResponse$MagicFaceConfig$TypeAdapter;
import com.kuaishou.live.common.core.basic.config.LiveCommonConfigResponse$GiftConfig;
import com.kuaishou.live.common.core.basic.config.LiveCommonConfigResponse$GiftConfig$TypeAdapter;
import com.kuaishou.live.common.core.basic.config.LiveCommonConfigResponse$LiveArrowRedPacketConfig;
import com.kuaishou.live.common.core.basic.config.LiveCommonConfigResponse$LiveArrowRedPacketConfig$TypeAdapter;
import com.kuaishou.live.common.core.basic.config.LiveCommonConfigResponse$LivePkCommonConfig;
import com.kuaishou.live.common.core.basic.config.LiveCommonConfigResponse$LivePkCommonConfig$TypeAdapter;
import com.kuaishou.live.common.core.basic.config.LiveCommonConfigResponse$ShopConfig;
import com.kuaishou.live.common.core.basic.config.LiveCommonConfigResponse$ShopConfig$TypeAdapter;
import com.kuaishou.live.common.core.basic.config.LiveCommonConfigResponse$FansTopConfig;
import com.kuaishou.live.common.core.basic.config.LiveCommonConfigResponse$FansTopConfig$TypeAdapter;
import com.kuaishou.live.common.core.basic.config.LiveCommonConfigResponse$WishListConfig;
import com.kuaishou.live.common.core.basic.config.LiveCommonConfigResponse$WishListConfig$TypeAdapter;
import com.kuaishou.live.common.core.basic.config.LiveCommonConfigResponse$PushOriginConfig;
import com.kuaishou.live.common.core.basic.config.LiveCommonConfigResponse$PushOriginConfig$TypeAdapter;
import com.kuaishou.live.common.core.basic.config.LiveCommonConfigResponse$BottomItemConfig;
import com.kuaishou.live.common.core.basic.config.LiveCommonConfigResponse$BottomItemConfig$TypeAdapter;
import com.kuaishou.live.common.core.basic.config.LiveCommonConfigResponse$AssistantConfig;
import com.kuaishou.live.common.core.basic.config.LiveCommonConfigResponse$AssistantConfig$TypeAdapter;
import com.kuaishou.live.common.core.basic.config.LiveCommonConfigResponse$FollowAuthorFeedConfig;
import com.kuaishou.live.common.core.basic.config.LiveCommonConfigResponse$FollowAuthorFeedConfig$TypeAdapter;
import com.kuaishou.live.common.core.basic.config.LiveCommonConfigResponse;
import com.kuaishou.live.common.core.basic.config.LiveCommonConfigResponse$TypeAdapter;

public final class StagFactoryksfeaturesftlivelivefeatureslivecommon implements j	// class@000e94
{

    public void StagFactoryksfeaturesftlivelivefeatureslivecommon(){
       super();
    }
    public TypeAdapter a(Gson p0,a p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, StagFactoryksfeaturesftlivelivefeatureslivecommon.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Class rawType = p1.getRawType();
       if (rawType == LiveCommonConfigResponse$MagicFaceConfig.class) {
          return new LiveCommonConfigResponse$MagicFaceConfig$TypeAdapter(p0);
       }
       if (rawType == LiveCommonConfigResponse$GiftConfig.class) {
          return new LiveCommonConfigResponse$GiftConfig$TypeAdapter(p0);
       }
       if (rawType == LiveCommonConfigResponse$LiveArrowRedPacketConfig.class) {
          return new LiveCommonConfigResponse$LiveArrowRedPacketConfig$TypeAdapter(p0);
       }
       if (rawType == LiveCommonConfigResponse$LivePkCommonConfig.class) {
          return new LiveCommonConfigResponse$LivePkCommonConfig$TypeAdapter(p0);
       }
       if (rawType == LiveCommonConfigResponse$ShopConfig.class) {
          return new LiveCommonConfigResponse$ShopConfig$TypeAdapter(p0);
       }
       if (rawType == LiveCommonConfigResponse$FansTopConfig.class) {
          return new LiveCommonConfigResponse$FansTopConfig$TypeAdapter(p0);
       }
       if (rawType == LiveCommonConfigResponse$WishListConfig.class) {
          return new LiveCommonConfigResponse$WishListConfig$TypeAdapter(p0);
       }
       if (rawType == LiveCommonConfigResponse$PushOriginConfig.class) {
          return new LiveCommonConfigResponse$PushOriginConfig$TypeAdapter(p0);
       }
       if (rawType == LiveCommonConfigResponse$BottomItemConfig.class) {
          return new LiveCommonConfigResponse$BottomItemConfig$TypeAdapter(p0);
       }
       if (rawType == LiveCommonConfigResponse$AssistantConfig.class) {
          return new LiveCommonConfigResponse$AssistantConfig$TypeAdapter(p0);
       }
       if (rawType == LiveCommonConfigResponse$FollowAuthorFeedConfig.class) {
          return new LiveCommonConfigResponse$FollowAuthorFeedConfig$TypeAdapter(p0);
       }
       if (rawType == LiveCommonConfigResponse.class) {
          return new LiveCommonConfigResponse$TypeAdapter(p0);
       }
       return null;
    }
}
