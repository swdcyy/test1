package com.kuaishou.live.core.show.conditionredpacket.model.LiveConditionRedPacketLotteryResultResponse;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.conditionredpacket.model.LiveConditionRedPacketLotteryResultResponse$LiveConditionRedPacketLotteryResult;
import com.kuaishou.protobuf.livestream.nano.SCLiveConditionRedPackOpened;
import java.util.ArrayList;
import java.util.List;
import com.kuaishou.live.core.show.conditionredpacket.model.LiveConditionRedPacketLotteryResultResponse$LiveConditionRedPacketLuckyUser;
import com.kuaishou.protobuf.livestream.nano.DisplayWinnerUser;
import com.kuaishou.socket.nano.UserInfos$UserInfo;
import com.kwai.framework.model.user.UserInfo;

public class LiveConditionRedPacketLotteryResultResponse implements Serializable	// class@000ab5
{
    public GrabRedPacketResponse$RedPacketResultPageGiftSendButton mGiftSendButtonInfo;
    public LiveConditionRedPacketLotteryResultResponse$LiveConditionRedPacketLotteryResult mLotteryResult;
    public static final long serialVersionUID = 0x9a44912cc491aadf;

    public void LiveConditionRedPacketLotteryResultResponse(){
       super();
    }
    public void update(LiveConditionRedPacketLotteryResultResponse p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveConditionRedPacketLotteryResultResponse.class, "1")) {
          return;
       }
       LiveConditionRedPacketLotteryResultResponse tmLotteryRes = this.mLotteryResult;
       if (tmLotteryRes != null) {
          p0 = p0.mLotteryResult;
          if (p0 != null) {
             tmLotteryRes.update(p0);
          }
       }else {
          this.mLotteryResult = p0.mLotteryResult;
       }
       return;
    }
    public void updateFromOpenedSignal(SCLiveConditionRedPackOpened p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveConditionRedPacketLotteryResultResponse.class, "2")) {
          return;
       }
       LiveConditionRedPacketLotteryResultResponse tmLotteryRes = this.mLotteryResult;
       if (tmLotteryRes != null && p0 != null) {
          tmLotteryRes.mDisplayMaxWinnerCountMessage = p0.displayMaxWinnerCountMessage;
          tmLotteryRes.mRedPacketCountDescription = p0.displayWinnerCount;
          SCLiveConditionRedPackOpened displayWinne = p0.displayWinnerUser;
          if (displayWinne != null && displayWinne.length > 0) {
             LiveConditionRedPacketLotteryResultResponse$LiveConditionRedPacketLotteryResult mLuckyUsers = tmLotteryRes.mLuckyUsers;
             if (mLuckyUsers == null) {
                tmLotteryRes.mLuckyUsers = new ArrayList();
             }else {
                mLuckyUsers.clear();
             }
             p0 = p0.displayWinnerUser;
             int len = p0.length;
             for (int i = 0; i < len; i = i + 1) {
                object oobject = p0[i];
                LiveConditionRedPacketLotteryResultResponse$LiveConditionRedPacketLuckyUser liveConditio = new LiveConditionRedPacketLotteryResultResponse$LiveConditionRedPacketLuckyUser();
                liveConditio.mAwardValue = oobject.winKsCoin;
                liveConditio.mUserInfo = UserInfo.convertFromProto(oobject.userInfo);
                liveConditio.mExtraInfo = oobject.extraInfo;
                this.mLotteryResult.mLuckyUsers.add(liveConditio);
             }
          }
       }
       return;
    }
}
