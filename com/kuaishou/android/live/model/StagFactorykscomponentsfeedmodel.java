package com.kuaishou.android.live.model.StagFactorykscomponentsfeedmodel;
import zk.j;
import java.lang.Object;
import com.google.gson.Gson;
import el.a;
import com.google.gson.TypeAdapter;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.live.model.VoicePartyMeta;
import com.kuaishou.android.live.model.VoicePartyMeta$TypeAdapter;
import com.kuaishou.android.live.model.QLivePlayConfig;
import com.kuaishou.android.live.model.QLivePlayConfig$TypeAdapter;
import com.kuaishou.android.live.model.LiveStreamModel$WinterOlympicSimpleLive;
import com.kuaishou.android.live.model.LiveStreamModel$WinterOlympicSimpleLive$TypeAdapter;
import com.kuaishou.android.live.model.LiveStreamModel$WishRoom;
import com.kuaishou.android.live.model.LiveStreamModel$WishRoom$TypeAdapter;
import com.kuaishou.android.live.model.LiveStreamModel$QuizLive;
import com.kuaishou.android.live.model.LiveStreamModel$QuizLive$TypeAdapter;
import com.kuaishou.android.live.model.LiveStreamModel$UserCountConfig;
import com.kuaishou.android.live.model.LiveStreamModel$UserCountConfig$TypeAdapter;
import com.kuaishou.android.live.model.LiveStreamModel$SpecialLive;
import com.kuaishou.android.live.model.LiveStreamModel$SpecialLive$TypeAdapter;
import com.kuaishou.android.live.model.LiveStreamModel;
import com.kuaishou.android.live.model.LiveStreamModel$TypeAdapter;
import com.kuaishou.android.live.model.LiveStreamFeedRecruitCardInfoV2;
import com.kuaishou.android.live.model.LiveStreamFeedRecruitCardInfoV2$TypeAdapter;
import com.kuaishou.android.live.model.LiveStreamFeedRecruitCardInfo;
import com.kuaishou.android.live.model.LiveStreamFeedRecruitCardInfo$TypeAdapter;
import com.kuaishou.android.live.model.LiveStreamFeedPlusNearByInfo;
import com.kuaishou.android.live.model.LiveStreamFeedPlusNearByInfo$TypeAdapter;
import com.kuaishou.android.live.model.LiveFeedFunctionShieldSwitchInfo;
import com.kuaishou.android.live.model.LiveFeedFunctionShieldSwitchInfo$TypeAdapter;

public final class StagFactorykscomponentsfeedmodel implements j	// class@000836
{

    public void StagFactorykscomponentsfeedmodel(){
       super();
    }
    public TypeAdapter a(Gson p0,a p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, StagFactorykscomponentsfeedmodel.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Class rawType = p1.getRawType();
       if (rawType == VoicePartyMeta.class) {
          return new VoicePartyMeta$TypeAdapter(p0);
       }
       if (rawType == QLivePlayConfig.class) {
          return new QLivePlayConfig$TypeAdapter(p0);
       }
       if (rawType == LiveStreamModel$WinterOlympicSimpleLive.class) {
          return new LiveStreamModel$WinterOlympicSimpleLive$TypeAdapter(p0);
       }
       if (rawType == LiveStreamModel$WishRoom.class) {
          return new LiveStreamModel$WishRoom$TypeAdapter(p0);
       }
       if (rawType == LiveStreamModel$QuizLive.class) {
          return new LiveStreamModel$QuizLive$TypeAdapter(p0);
       }
       if (rawType == LiveStreamModel$UserCountConfig.class) {
          return new LiveStreamModel$UserCountConfig$TypeAdapter(p0);
       }
       if (rawType == LiveStreamModel$SpecialLive.class) {
          return new LiveStreamModel$SpecialLive$TypeAdapter(p0);
       }
       if (rawType == LiveStreamModel.class) {
          return new LiveStreamModel$TypeAdapter(p0);
       }
       if (rawType == LiveStreamFeedRecruitCardInfoV2.class) {
          return new LiveStreamFeedRecruitCardInfoV2$TypeAdapter(p0);
       }
       if (rawType == LiveStreamFeedRecruitCardInfo.class) {
          return new LiveStreamFeedRecruitCardInfo$TypeAdapter(p0);
       }
       if (rawType == LiveStreamFeedPlusNearByInfo.class) {
          return new LiveStreamFeedPlusNearByInfo$TypeAdapter(p0);
       }
       if (rawType == LiveFeedFunctionShieldSwitchInfo.class) {
          return new LiveFeedFunctionShieldSwitchInfo$TypeAdapter(p0);
       }
       return null;
    }
}
