package com.kuaishou.live.common.core.component.gift.giftstore.bean.PrivilegeGift;
import l33.b;
import com.yxcorp.gifshow.models.Gift;
import l33.c;
import l33.a;
import java.lang.String;
import com.kuaishou.live.external.invoke.deserializer.gift.GiftPanelItemViewData;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.utility.TextUtils;
import java.util.List;
import com.kuaishou.live.common.core.component.gift.giftstore.bean.PrivilegeGiftInfo;

public class PrivilegeGift extends Gift implements b	// class@001318
{
    public int giftType;
    public String mExpireTip;
    public GiftPanelItemPromptInfo mGiftPanelItemPromptInfo;
    public GiftPanelItemViewData mItemViewData;
    public int mMinWealthGrade;
    public PrivilegeGiftInfo mPrivilegeGiftInfo;
    public static final long serialVersionUID = 0x1696b81ca2cb524c;

    public void PrivilegeGift(){
       super();
    }
    public boolean canSendPrivilegeGift(int p0){
       boolean b = (p0 >= this.mMinWealthGrade)? true: false;
       return b;
    }
    public int getCount(){
       return 0;
    }
    public c getDateLimitedGiftUIConfig(int p0){
       return a.a(this, p0);
    }
    public String getDescription(){
       PrivilegeGift tmItemViewDa = this.mItemViewData;
       String str = (tmItemViewDa == null)? "": tmItemViewDa.mDescription;
       return str;
    }
    public String getExpireTip(){
       Object obj = PatchProxy.apply(null, this, PrivilegeGift.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return TextUtils.k(this.mExpireTip);
    }
    public List getImageUrls(){
       return this.mImageUrl;
    }
    public float getLeftExpireTime(){
       PrivilegeGift tmPrivilegeG = this.mPrivilegeGiftInfo;
       float f = (tmPrivilegeG == null)? 0xbf800000: (float)tmPrivilegeG.mGiftActivityExpireTime;
       return f;
    }
    public List getLeftTopTagUrls(){
       return a.b(this);
    }
    public String getName(){
       return this.mName;
    }
    public GiftPanelItemViewData getPanelItemViewData(){
       return this.mItemViewData;
    }
    public boolean isCountLimited(){
       return false;
    }
    public boolean isExpiredSoon(){
       return a.c(this);
    }
    public boolean shouldIgnoreEmptyTag(){
       return a.d(this);
    }
}
