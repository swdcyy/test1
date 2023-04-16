package com.kuaishou.live.core.show.conditionredpacket.model.LiveConditionRedPacketLotteryResultResponse$LiveConditionRedPacketLuckyUser;
import java.io.Serializable;
import java.lang.Object;
import com.kuaishou.live.core.show.conditionredpacket.model.LiveConditionRedPacketLotteryResultResponse$LiveConditionRedPacketLuckyUserExtraInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import android.text.TextUtils;
import fg6.a;
import com.google.gson.Gson;

public class LiveConditionRedPacketLotteryResultResponse$LiveConditionRedPacketLuckyUser implements Serializable	// class@000ab3
{
    public int mAwardValue;
    public String mExtraInfo;
    public UserInfo mUserInfo;
    public static final long serialVersionUID = 0x8a685ed72786feb0;

    public void LiveConditionRedPacketLotteryResultResponse$LiveConditionRedPacketLuckyUser(){
       super();
    }
    public LiveConditionRedPacketLotteryResultResponse$LiveConditionRedPacketLuckyUserExtraInfo getExtraInfo(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, LiveConditionRedPacketLotteryResultResponse$LiveConditionRedPacketLuckyUser.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.isEmpty(this.mExtraInfo)) {
          return objArray;
       }
       return a.a.h(this.mExtraInfo, LiveConditionRedPacketLotteryResultResponse$LiveConditionRedPacketLuckyUserExtraInfo.class);
    }
}
