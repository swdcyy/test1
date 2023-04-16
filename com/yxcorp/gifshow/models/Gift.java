package com.yxcorp.gifshow.models.Gift;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Integer;
import androidx.collection.SimpleArrayMap;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public class Gift implements Serializable	// class@001247
{
    public GiftActionType mActionType;
    public List mAnimationPicUrl;
    public int mAnimationPicUrlCDNIndex;
    public String mBorderColor;
    public boolean mCanCombo;
    public boolean mDisableMockEffect;
    public boolean mDisableMockFeed;
    public boolean mDrawable;
    public String mGiftDetailHintDescriptionKey;
    public String mGiftDetailHintRuleUrl;
    public long mGiftType;
    public String mGiftTypeName;
    public int mId;
    public List mImageUrl;
    public long mMagicFaceId;
    public int mMaxBatchCount;
    public String mName;
    public int mPrice;
    public ArrayMap mPromptMessages;
    public List mSubscriptImageUrl;
    public int mVirtualPrice;
    public static final long serialVersionUID = 0x79c6eda50a4306fd;

    public void Gift(){
       super();
       this.mMaxBatchCount = 1;
    }
    public Gift cloneValue(Gift p0){
       p0.mId = this.mId;
       p0.mName = this.mName;
       p0.mImageUrl = this.mImageUrl;
       p0.mPrice = this.mPrice;
       p0.mVirtualPrice = this.mVirtualPrice;
       p0.mCanCombo = this.mCanCombo;
       p0.mActionType = this.mActionType;
       p0.mBorderColor = this.mBorderColor;
       p0.mDrawable = this.mDrawable;
       p0.mMagicFaceId = this.mMagicFaceId;
       p0.mAnimationPicUrl = this.mAnimationPicUrl;
       p0.mPromptMessages = this.mPromptMessages;
       p0.mAnimationPicUrlCDNIndex = this.mAnimationPicUrlCDNIndex;
       p0.mGiftType = this.mGiftType;
       p0.mMaxBatchCount = this.mMaxBatchCount;
       p0.mSubscriptImageUrl = this.mSubscriptImageUrl;
       p0.mGiftDetailHintDescriptionKey = this.mGiftDetailHintDescriptionKey;
       p0.mGiftDetailHintRuleUrl = this.mGiftDetailHintRuleUrl;
       return p0;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, Gift.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0 instanceof Gift && (p0.mId == this.mId && (p0.mName).equals(this.mName)))? true: false;
       return b;
    }
    public String getPromptMessage(int p0){
       Gift obj;
       String str;
       if (PatchProxy.isSupport(Gift.class)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, Gift.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = this.mPromptMessages;
       if (obj != null) {
          str = obj.get(String.valueOf(p0));
          if (!TextUtils.x(str)) {
          label_0032 :
             return str;
          }
       }
       str = "";
       goto label_0032 ;
    }
    public boolean isBroadcastGift(){
       boolean b = ((this.mGiftType & 16) > 0)? true: false;
       return b;
    }
    public boolean isCharityGift(){
       boolean b = ((this.mGiftType & 2) > 0)? true: false;
       return b;
    }
    public boolean isFaceFollowingGift(){
       boolean b = ((this.mGiftType & 0x4000) > 0)? true: false;
       return b;
    }
    public boolean isFansGroupGift(){
       boolean b = ((this.mGiftType & 512) > 0)? true: false;
       return b;
    }
    public boolean isFansTopGift(){
       boolean b = ((this.mGiftType & 0x10000) > 0)? true: false;
       return b;
    }
    public boolean isIncreaseFansGift(){
       boolean b = ((this.mGiftType & 0x400000) > 0)? true: false;
       return b;
    }
    public boolean isKCardGift(){
       boolean b = ((this.mGiftType & 256) > 0)? true: false;
       return b;
    }
    public boolean isKShellGift(){
       boolean b = ((this.mGiftType & 128) > 0)? true: false;
       return b;
    }
    public boolean isMagicBoxGift(){
       boolean b = ((this.mGiftType & 8192) > 0)? true: false;
       return b;
    }
    public boolean isMagicFaceGift(){
       boolean b = ((this.mGiftType & 4) > 0)? true: false;
       return b;
    }
    public boolean isMagicFaceIdValidate(){
       boolean b = (this.mMagicFaceId > 0)? true: false;
       return b;
    }
    public boolean isNebulaCreditGift(){
       boolean b = ((this.mGiftType & 0x200000) > 0)? true: false;
       return b;
    }
    public boolean isNegativeGift(){
       boolean b = ((this.mGiftType & 8) > 0)? true: false;
       return b;
    }
    public boolean isNormalGift(){
       boolean b = ((this.mGiftType & 1) > 0)? true: false;
       return b;
    }
    public boolean isRedPacketGift(){
       boolean b = ((this.mGiftType & 64) > 0)? true: false;
       return b;
    }
    public boolean isSpecialEffectGift(){
       boolean b = ((this.mGiftType & 32) > 0)? true: false;
       return b;
    }
    public boolean isTanksGift(){
       boolean b = ((this.mGiftType & 4096) > 0)? true: false;
       return b;
    }
    public boolean isToAudienceGift(){
       boolean b;
       if (this.mDrawable == null) {
          Gift tmGiftType = this.mGiftType;
          if (tmGiftType - 1 && (!tmGiftType - 4 || !tmGiftType - 5)) {
             b = true;
          label_001b :
             return b;
          }
       }
       b = false;
       goto label_001b ;
    }
    public boolean isWheelGift(){
       boolean b = ((this.mGiftType & 1024) > 0)? true: false;
       return b;
    }
}
