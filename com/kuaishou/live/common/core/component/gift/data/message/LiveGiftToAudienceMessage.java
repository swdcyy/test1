package com.kuaishou.live.common.core.component.gift.data.message.LiveGiftToAudienceMessage;
import com.kuaishou.live.core.show.gift.GiftMessage;
import com.kuaishou.live.core.show.gift.DrawingGift;
import com.kwai.framework.model.user.UserInfo;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.basic.model.QLiveMessage;
import com.kwai.framework.model.user.QCurrentUser;
import lu7.f;
import java.lang.System;
import java.util.List;
import com.kuaishou.live.core.show.gift.DrawingGift$Point;
import java.lang.StringBuilder;
import yb6.d;
import java.lang.Long;
import rm1.l;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import o56.a;
import s00.b$b;
import s00.b;
import com.google.common.primitives.Ints;

public class LiveGiftToAudienceMessage extends GiftMessage	// class@001164
{
    public UserInfo mGiftReceiverUserInfo;
    public static final long serialVersionUID = 0xcaaf8bfffdfdc739;

    public void LiveGiftToAudienceMessage(){
       super();
    }
    public static LiveGiftToAudienceMessage createSelfToAudienceDrawingGiftMessage(DrawingGift p0,UserInfo p1,int p2){
       LiveGiftToAudienceMessage obj;
       if (PatchProxy.isSupport(LiveGiftToAudienceMessage.class)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), null, LiveGiftToAudienceMessage.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new LiveGiftToAudienceMessage();
       obj.mGiftReceiverUserInfo = p1;
       obj.mId = "";
       obj.mUser = f.p(QCurrentUser.ME);
       obj.mTime = System.currentTimeMillis();
       obj.mRank = Integer.MAX_VALUE;
       obj.mCount = 1;
       DrawingGift mPoints = p0.mPoints;
       obj.mMergeKey = "drawing_message_"+p2;
       obj.mGiftId = mPoints.get((mPoints.size() - 1)).mGiftId;
       obj.mExpireDate = d.a() + 0x413b380;
       obj.mDrawingGift = p0;
       obj.mIsDrawingGift = true;
       obj.mDisplayDuration = 3000;
       obj.mDeviceHash = GiftMessage.getDeviceHash();
       obj.mSlotPos = 2;
       return obj;
    }
    public static LiveGiftToAudienceMessage createSelfToAudienceGiftMessage(int p0,long p1,int p2,int p3,UserInfo p4){
       LiveGiftToAudienceMessage obj;
       int i = 0;
       if (PatchProxy.isSupport(LiveGiftToAudienceMessage.class)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),Long.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),p4};
          obj = PatchProxy.apply(objArray, null, LiveGiftToAudienceMessage.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new LiveGiftToAudienceMessage();
       obj.mGiftReceiverUserInfo = p4;
       obj.mGiftId = p0;
       obj.mId = "";
       obj.mCount = p2;
       obj.mTime = System.currentTimeMillis();
       obj.mUser = f.p(QCurrentUser.ME);
       obj.mRank = Integer.MAX_VALUE;
       obj.mMergeKey = "self_message-"+p3;
       obj.mExpireDate = d.a() + 0x413b380;
       obj.mDisplayDuration = 3000;
       String str = PatchProxy.apply(null, null, l.class, "5");
       if (str != PatchProxyResult.class) {
       }else if(!TextUtils.x(l.a) || TextUtils.x(a.a)){
          str = l.a;
       }else {
          str = b.b().a(Ints.f((a.a).hashCode()));
          l.a = str;
       }
       obj.mDeviceHash = str;
       obj.mSlotPos = 2;
       obj.mComboKey = p3;
       obj.mComboCount = 1;
       if (!(p1 & 64) - 64) {
          i = true;
       }
       obj.mIsOpenArrowRedPack = i;
       return obj;
    }
    public UserInfo getGiftReceiverUserInfo(){
       return this.mGiftReceiverUserInfo;
    }
}
