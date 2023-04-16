package com.kuaishou.live.core.show.conditionredpacket.model.LiveConditionRedPacketLotteryResultResponse$LiveConditionRedPacketLotteryResult;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;

public class LiveConditionRedPacketLotteryResultResponse$LiveConditionRedPacketLotteryResult implements Serializable	// class@000ab2
{
    public int mAwardValue;
    public String mDisplayMaxWinnerCountMessage;
    public boolean mHasParticipated;
    public boolean mIsInValidData;
    public boolean mIsLuckyUser;
    public List mLuckyUsers;
    public String mRedPacketCountDescription;
    public static final long serialVersionUID = 0x2d7129bcc86b9f5d;

    public void LiveConditionRedPacketLotteryResultResponse$LiveConditionRedPacketLotteryResult(){
       super();
       this.mIsInValidData = false;
    }
    public void update(LiveConditionRedPacketLotteryResultResponse$LiveConditionRedPacketLotteryResult p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveConditionRedPacketLotteryResultResponse$LiveConditionRedPacketLotteryResult.class, "1")) {
          return;
       }
       this.mHasParticipated = p0.mHasParticipated;
       this.mIsLuckyUser = p0.mIsLuckyUser;
       this.mAwardValue = p0.mAwardValue;
       this.mRedPacketCountDescription = p0.mRedPacketCountDescription;
       this.mDisplayMaxWinnerCountMessage = p0.mDisplayMaxWinnerCountMessage;
       LiveConditionRedPacketLotteryResultResponse$LiveConditionRedPacketLotteryResult mLuckyUsers = p0.mLuckyUsers;
       if (mLuckyUsers != null && mLuckyUsers.size() > 0) {
          mLuckyUsers = this.mLuckyUsers;
          if (mLuckyUsers == null) {
             this.mLuckyUsers = new ArrayList(p0.mLuckyUsers);
          }else {
             mLuckyUsers.clear();
             this.mLuckyUsers.addAll(p0.mLuckyUsers);
          }
       }
       return;
    }
}
