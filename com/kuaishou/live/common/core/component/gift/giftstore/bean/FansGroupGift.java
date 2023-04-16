package com.kuaishou.live.common.core.component.gift.giftstore.bean.FansGroupGift;
import com.yxcorp.gifshow.models.Gift;
import com.kuaishou.live.common.core.component.gift.giftstore.bean.GiftPanelItem$LiveFansGroupInfo;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public class FansGroupGift extends Gift	// class@001310
{
    public GiftPanelItem$LiveFansGroupInfo mLiveFansGroupInfo;
    public static final long serialVersionUID = 0x1696b81ca2cb524c;

    public void FansGroupGift(){
       super();
    }
    public boolean canSendGift(int p0){
       FansGroupGift tmLiveFansGr = this.mLiveFansGroupInfo;
       boolean b = (tmLiveFansGr != null && p0 >= tmLiveFansGr.mMinFansGroupLevel)? true: false;
       return b;
    }
    public int getGiftFansGroupLevel(){
       FansGroupGift tmLiveFansGr = this.mLiveFansGroupInfo;
       int i = (tmLiveFansGr == null)? 0: tmLiveFansGr.mMinFansGroupLevel;
       return i;
    }
    public String getNotJoinTip(){
       FansGroupGift obj = PatchProxy.apply(null, this, FansGroupGift.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mLiveFansGroupInfo;
       if (obj == null || TextUtils.x(obj.mNoJoinToast)) {
          return "";
       }
       return this.mLiveFansGroupInfo.mNoJoinToast;
    }
}
