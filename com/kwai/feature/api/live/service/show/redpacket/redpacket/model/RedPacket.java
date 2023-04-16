package com.kwai.feature.api.live.service.show.redpacket.redpacket.model.RedPacket;
import java.io.Serializable;
import java.lang.Object;
import com.kwai.feature.api.live.service.show.redpacket.redpacket.model.RedPacket$a;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$RedPackInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.socket.nano.UserInfos$UserInfo;
import com.kwai.framework.model.user.UserInfo;
import com.kwai.feature.api.live.service.show.redpacket.redpacket.model.RedPacket$CoverType;
import com.yxcorp.utility.TextUtils;
import java.lang.Boolean;
import java.lang.CharSequence;

public class RedPacket implements Serializable	// class@00101c
{
    public UserInfo mAuthorUserInfo;
    public long mCloseTime;
    public int mCoverType;
    public long mCreateTime;
    public long mCurrentTime;
    public long mDou;
    public boolean mEnableApplySkin;
    public final RedPacket$a mExtraInfo;
    public String mGlobalId;
    public String mGrabToken;
    public boolean mHasShared;
    public String mId;
    public boolean mIsFromArrowPush;
    public boolean mIsSelfSendNormalRedPacket;
    public boolean mIsUseNewStyle;
    public String mLiveStreamId;
    public long mLuckiestDelay;
    public long mMaxRequestDelayMillis;
    public boolean mNeedSendRequest;
    public long mOpenTime;
    public boolean mOpening;
    public LiveCustomRedPackSkinMessage$CustomRedPackSkinTheme mRedPackSkinTheme;
    public int mRedPackType;
    public int mRedPacketTypeFromSend;
    public static final long serialVersionUID = 0xdaf979bd13fb9ce6;

    public void RedPacket(){
       super();
       this.mExtraInfo = new RedPacket$a(this);
       this.mIsUseNewStyle = false;
       this.mRedPackSkinTheme = null;
       this.mEnableApplySkin = false;
    }
    public static RedPacket convertFromProto(LiveStreamMessages$RedPackInfo p0){
       RedPacket obj = PatchProxy.applyOneRefs(p0, null, RedPacket.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new RedPacket();
       obj.mId = p0.id;
       obj.mDou = p0.balance;
       obj.mOpenTime = p0.openTime;
       obj.mCurrentTime = p0.currentTime;
       obj.mGrabToken = p0.grabToken;
       obj.mNeedSendRequest = p0.needSendRequest;
       obj.mMaxRequestDelayMillis = p0.maxRequestDelayMillis;
       obj.mLuckiestDelay = p0.luckiestDelayMillis;
       obj.mCoverType = p0.coverType;
       obj.mCloseTime = p0.closeTime;
       obj.mRedPackType = p0.redPackType;
       obj.mGlobalId = p0.globalRedPackIdentity;
       obj.mRedPackSkinTheme = p0.customRedPackSkinTheme;
       b.Z(LiveLogTag.LIVE_RED_PACKET_SKIN, "RedPacket->convertFromProto. "+obj.getRedPacketSkinLog()+", skin="+obj.mRedPackSkinTheme);
       p0 = p0.author;
       if (p0 != null) {
          obj.mAuthorUserInfo = UserInfo.convertFromProto(p0);
       }
       return obj;
    }
    public boolean canAppendNormalRedPacket(){
       boolean b = true;
       if (this.mRedPackType != b || this.mIsSelfSendNormalRedPacket == null) {
          b = false;
       }
       return b;
    }
    public RedPacket$CoverType getCoverType(){
       Object obj = PatchProxy.apply(null, this, RedPacket.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return RedPacket$CoverType.codeValueOf(this.mCoverType);
    }
    public String getRedPacketSkinLog(){
       StringBuilder obj = PatchProxy.apply(null, this, RedPacket.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "RedPacket{mRedPacketId=\'"+TextUtils.k(this.mId)+", hashCode="+this.hashCode()+", mEnableApplySkin="+this.mEnableApplySkin+", mRedPackSkinTheme exist =";
       boolean b = (this.mRedPackSkinTheme != null)? true: false;
       return obj+b+'}';
    }
    public String getSendUserId(){
       RedPacket tmAuthorUser = this.mAuthorUserInfo;
       UserInfo mId = (tmAuthorUser != null)? tmAuthorUser.mId: "";
       return mId;
    }
    public boolean hasAlreadySnatched(){
       boolean b = (this.mExtraInfo.a - -1)? true: false;
       return b;
    }
    public boolean isEnableApplySkin(){
       return this.mEnableApplySkin;
    }
    public boolean isOpening(long p0){
       boolean b = (this.mOpening != null || this.mOpenTime - p0 <= 0)? true: false;
       return b;
    }
    public boolean isRedPacketSendGiftToAnchorEnabled(){
       RedPacket tmRedPackTyp = this.mRedPackType;
       boolean b = false;
       int i = (tmRedPackTyp == 2)? 1: 0;
       tmRedPackTyp = (tmRedPackTyp == 1)? 1: 0;
       if (i || tmRedPackTyp) {
          b = true;
       }
       return b;
    }
    public boolean isUseNewStyle(){
       return this.mIsUseNewStyle;
    }
    public void setEnableApplySkin(boolean p0,String p1){
       if (PatchProxy.isSupport(RedPacket.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, RedPacket.class, "1")) {
          return;
       }
       this.mEnableApplySkin = p0;
       b.B(LiveLogTag.LIVE_RED_PACKET_SKIN, "setEnableApplySkin, enableApplySkin = "+p0+","+this.getRedPacketSkinLog()+", from = "+p1);
       return;
    }
    public void setUseNewStyle(boolean p0){
       this.mIsUseNewStyle = p0;
    }
    public String toString(){
       StringBuilder obj = PatchProxy.apply(null, this, RedPacket.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       char c = ''';
       obj = "RedPacket{mId=\'"+TextUtils.k(this.mId)+c+", hashCode="+this.hashCode()+", mDou="+this.mDou+", mCreateTime="+this.mCreateTime+", mOpenTime="+this.mOpenTime+", mCloseTime="+this.mCloseTime+", mCurrentTime="+this.mCurrentTime+", mOpening="+this.mOpening+", mCoverType="+this.mCoverType+", mRedPackType="+this.mRedPackType+", mAuthorUserInfo=";
       RedPacket tmAuthorUser = this.mAuthorUserInfo;
       if (tmAuthorUser == null) {
          tmAuthorUser = "null";
       }
       obj = obj+tmAuthorUser+", mGrabToken=\'"+TextUtils.k(this.mGrabToken)+c+", mNeedSendRequest="+this.mNeedSendRequest+", mMaxRequestDelayMillis="+this.mMaxRequestDelayMillis+", mLuckiestDelay="+this.mLuckiestDelay+", mLiveStreamId=\'"+TextUtils.k(this.mLiveStreamId)+c+", mIsFromArrowPush="+this.mIsFromArrowPush+", mHasShared="+this.mHasShared+", mGlobalId=\'"+TextUtils.k(this.mGlobalId)+c+", mExtraInfo="+this.mExtraInfo.toString()+", mEnableApplySkin="+this.mEnableApplySkin+", mRedPackSkinTheme is null=";
       boolean b = (this.mRedPackSkinTheme == null)? true: false;
       return obj+b+'}';
    }
    public void update(RedPacket p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RedPacket.class, "4")) {
          return;
       }
       if (p0 != null) {
          if (!TextUtils.x(p0.mLiveStreamId)) {
             this.mLiveStreamId = p0.mLiveStreamId;
          }
          this.mDou = p0.mDou;
          this.mOpenTime = p0.mOpenTime;
          this.mCurrentTime = p0.mCurrentTime;
          RedPacket mCreateTime = p0.mCreateTime;
          String str = null;
          if (mCreateTime - str && !this.mCreateTime - str) {
             this.mCreateTime = mCreateTime;
          }
          this.mGrabToken = p0.mGrabToken;
          this.mNeedSendRequest = p0.mNeedSendRequest;
          this.mMaxRequestDelayMillis = p0.mMaxRequestDelayMillis;
          this.mLuckiestDelay = p0.mLuckiestDelay;
          this.mCoverType = p0.mCoverType;
          this.mOpening = p0.mOpening;
          this.mRedPackType = p0.mRedPackType;
          mCreateTime = p0.mAuthorUserInfo;
          if (mCreateTime != null) {
             this.mAuthorUserInfo = mCreateTime;
          }
          b.Z(LiveLogTag.LIVE_RED_PACKET_SKIN, "RedPacket#update, oldRedPacket = "+this.getRedPacketSkinLog()+", newRedPacket = "+p0.getRedPacketSkinLog());
          this.mRedPackSkinTheme = p0.mRedPackSkinTheme;
       }
       return;
    }
    public void updateExtraInfo(RedPacket$a p0){
       RedPacket tmExtraInfo = this.mExtraInfo;
       tmExtraInfo.a = p0.a;
       tmExtraInfo.b = p0.b;
       tmExtraInfo.c = p0.c;
       tmExtraInfo.d = p0.d;
       tmExtraInfo.e = p0.e;
       tmExtraInfo.f = p0.f;
    }
}
