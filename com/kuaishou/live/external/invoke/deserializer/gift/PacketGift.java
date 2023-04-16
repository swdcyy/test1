package com.kuaishou.live.external.invoke.deserializer.gift.PacketGift;
import l33.b;
import com.yxcorp.gifshow.models.Gift;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import l33.c;
import java.lang.Integer;
import l33.d;
import lnc.a1;
import java.util.List;
import com.kuaishou.live.external.invoke.deserializer.gift.GiftPanelItemViewData;

public class PacketGift extends Gift implements b	// class@0008c1
{
    public int mCount;
    public String mDescription;
    public CDNUrl[] mDynamicGiftIconUrls;
    public long mExpireTime;
    public String mExpireTip;
    public boolean mExpiredSoon;
    public String mItemId;
    public GiftPanelItemPromptInfo mItemPromptInfo;
    public int mItemType;
    public float mLeftExpireTime;
    public long mLiveVipGradeScore;
    public List mTopLeftIconUrls;
    public static final long serialVersionUID = 0x556d67d81163aa63;

    public void PacketGift(){
       super();
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PacketGift.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0 instanceof PacketGift && (p0.mItemId).equals(this.mItemId))? true: false;
       return b;
    }
    public int getCount(){
       return this.mCount;
    }
    public c getDateLimitedGiftUIConfig(int p0){
       if (PatchProxy.isSupport(PacketGift.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, PacketGift.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (d.a(this.mItemType)) {
          float f = (p0 <= 0)? 0x3f000000: 0x3f800000;
          return new c(a1.e(10.00f), a1.e(4.00f), f);
       }else {
          return new c();
       }
    }
    public String getDescription(){
       return this.mDescription;
    }
    public String getExpireTip(){
       return this.mExpireTip;
    }
    public List getImageUrls(){
       return this.mImageUrl;
    }
    public float getLeftExpireTime(){
       return this.mLeftExpireTime;
    }
    public List getLeftTopTagUrls(){
       return this.mTopLeftIconUrls;
    }
    public String getName(){
       return this.mName;
    }
    public GiftPanelItemViewData getPanelItemViewData(){
       return null;
    }
    public boolean hasEnoughCountToComboSend(){
       boolean b = true;
       if (this.mCount > b) {
       }else {
          b = false;
       }
       return b;
    }
    public boolean isCountLimited(){
       return true;
    }
    public boolean isExpiredSoon(){
       return this.mExpiredSoon;
    }
    public boolean shouldIgnoreEmptyTag(){
       Object obj = PatchProxy.apply(null, this, PacketGift.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return d.a(this.mItemType);
    }
}
