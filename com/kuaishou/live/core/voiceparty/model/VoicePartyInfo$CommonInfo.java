package com.kuaishou.live.core.voiceparty.model.VoicePartyInfo$CommonInfo;
import java.io.Serializable;
import java.lang.Object;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$VoicePartyCommonInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$VoicePartyChannelInfo;
import com.kuaishou.android.live.model.VoicePartyChannel;
import java.util.List;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import lnc.e0;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$DynamicBackground;
import com.kuaishou.live.core.voiceparty.model.VoicePartyInfo$CommonInfo$DynamicBackground;

public class VoicePartyInfo$CommonInfo implements Serializable	// class@0017b2
{
    public String mAbParams;
    public int mAboardMicType;
    public List mBackgroundUrlList;
    public String mCaption;
    public VoicePartyChannel mChannel;
    public VoicePartyInfo$CommonInfo$DynamicBackground mDynamicBackground;
    public boolean mEnableAutoInvitation;
    public boolean mFansFreeAboard;
    public int mGiftCommission;
    public String mGiftCommissionText;
    public boolean mIsOpenEnterRoomTips;
    public String mTopic;
    public static final long serialVersionUID = 0x1517592d8db76634;

    public void VoicePartyInfo$CommonInfo(){
       super();
    }
    public LiveStreamMessages$VoicePartyCommonInfo toProto(){
       VoicePartyInfo$CommonInfo tmChannel;
       LiveStreamMessages$VoicePartyCommonInfo obj = PatchProxy.apply(null, this, VoicePartyInfo$CommonInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new LiveStreamMessages$VoicePartyCommonInfo();
       obj.topic = this.mTopic;
       obj.caption = this.mCaption;
       obj.aboardType = this.mAboardMicType;
       obj.abParams = this.mAbParams;
       obj.isFansFreeAboard = this.mFansFreeAboard;
       if (this.mChannel != null) {
          LiveStreamMessages$VoicePartyChannelInfo voicePartyCh = new LiveStreamMessages$VoicePartyChannelInfo();
          obj.channelInfo = voicePartyCh;
          tmChannel = this.mChannel;
          voicePartyCh.channelId = (long)tmChannel.id;
          voicePartyCh.name = tmChannel.mName;
          voicePartyCh.startColor = tmChannel.mStartColor;
          voicePartyCh.endColor = tmChannel.mEndColor;
       }
       VoicePartyInfo$CommonInfo tmBackground = this.mBackgroundUrlList;
       if (tmBackground != null) {
          obj.backgroundPicUrl = e0.j(tmBackground);
       }
       if (this.mDynamicBackground != null) {
          LiveStreamMessages$DynamicBackground uDynamicBack = new LiveStreamMessages$DynamicBackground();
          obj.dynamicBackground = uDynamicBack;
          tmChannel = this.mDynamicBackground;
          uDynamicBack.md5 = tmChannel.mDynamicBackgroundResMd5;
          uDynamicBack.dynamicBackgroundResType = tmChannel.mDynamicBackgroundResType;
          uDynamicBack.dynamicBackgroundResUrl = e0.j(tmChannel.mDynamicBackgroundResUrls);
       }
       return obj;
    }
}
