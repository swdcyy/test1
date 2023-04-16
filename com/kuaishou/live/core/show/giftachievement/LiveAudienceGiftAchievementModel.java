package com.kuaishou.live.core.show.giftachievement.LiveAudienceGiftAchievementModel;
import java.io.Serializable;
import java.lang.Object;
import com.kuaishou.livestream.message.nano.LiveGiftAchievementGift;
import com.kuaishou.live.core.show.giftachievement.LiveAudienceGiftAchievementModel$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.protobuf.livestream.nano.LiveCdnNodeView;
import com.yxcorp.gifshow.model.CDNUrl;
import d61.j;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.lang.Integer;
import com.kuaishou.livestream.message.nano.SCLiveGiftAchievementUpdateNotice;
import com.kuaishou.live.core.show.giftachievement.LiveAudienceGiftAchievementModel$LiveAudienceGiftAchievement;
import com.kuaishou.livestream.message.nano.LiveGiftAchievement;

public class LiveAudienceGiftAchievementModel implements Serializable	// class@000bba
{
    public List mAchievementList;
    public String mAchievementWallUrl;
    public long mCurrentWeek;
    public static final long serialVersionUID = 0x21481cc06c590e31;

    public void LiveAudienceGiftAchievementModel(){
       super();
    }
    public static LiveAudienceGiftAchievementModel$a covertFromLiveGiftAchievement(LiveGiftAchievementGift p0){
       LiveAudienceGiftAchievementModel$a obj = PatchProxy.applyOneRefs(p0, null, LiveAudienceGiftAchievementModel.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new LiveAudienceGiftAchievementModel$a();
       obj.mGiftIcon = Arrays.asList(j.c(p0.giftIcon));
       obj.mGiftId = p0.giftId;
       obj.mGiftName = p0.giftName;
       obj.mIsLightOn = p0.lightOn;
       obj.mRequiredCount = (long)p0.requiredCount;
       obj.mRequiredCountDisplay = p0.requiredCountDisplay;
       obj.mSentCount = (long)p0.sentCount;
       obj.mSentCountDisplay = p0.sentCountDisplay;
       ArrayList uArrayList = new ArrayList();
       p0 = p0.relationGiftIds;
       int len = p0.length;
       for (int i = 0; i < len; i = i + 1) {
          uArrayList.add(Integer.valueOf(p0[i]));
       }
       obj.mRelationGiftIds = uArrayList;
       return obj;
    }
    public static LiveAudienceGiftAchievementModel covertFromSCNotice(SCLiveGiftAchievementUpdateNotice p0){
       LiveAudienceGiftAchievementModel obj = PatchProxy.applyOneRefs(p0, null, LiveAudienceGiftAchievementModel.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new LiveAudienceGiftAchievementModel();
       obj.mAchievementWallUrl = p0.achievementWallUrl;
       obj.mCurrentWeek = p0.weekNo;
       ArrayList uArrayList = new ArrayList();
       p0 = p0.achievements;
       int len = p0.length;
       for (int i = 0; i < len; i = i + 1) {
          object oobject = p0[i];
          LiveAudienceGiftAchievementModel$LiveAudienceGiftAchievement liveAudience = new LiveAudienceGiftAchievementModel$LiveAudienceGiftAchievement();
          liveAudience.mAchievementId = oobject.achievementId;
          liveAudience.mOrder = oobject.order;
          liveAudience.mAchievementName = oobject.name;
          liveAudience.mDescriptionText = oobject.displayText;
          liveAudience.mIsLightOn = oobject.lightOn;
          liveAudience.mIconUrl = Arrays.asList(j.c(oobject.icon));
          ArrayList uArrayList1 = new ArrayList();
          LiveGiftAchievement gifts = oobject.gifts;
          int len1 = gifts.length;
          for (int i1 = 0; i1 < len1; i1 = i1 + 1) {
             uArrayList1.add(LiveAudienceGiftAchievementModel.covertFromLiveGiftAchievement(gifts[i1]));
          }
          liveAudience.mGiftInfoList = uArrayList1;
          uArrayList.add(liveAudience);
       }
       obj.mAchievementList = uArrayList;
       return obj;
    }
}
