package com.kuaishou.live.common.core.component.gift.giftstore.api.PrivilegeGiftListResponse;
import java.io.Serializable;
import la6.b;
import java.lang.Object;
import java.util.ArrayList;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.util.Iterator;
import com.kuaishou.live.common.core.component.gift.giftstore.bean.PrivilegeGiftWrapper;
import com.kuaishou.live.common.core.component.gift.giftstore.bean.PrivilegeGift;
import com.yxcorp.gifshow.models.Gift;
import com.kuaishou.live.common.core.component.gift.giftstore.bean.GiftPanelItem;
import rm1.f;
import com.kuaishou.live.common.core.component.gift.giftstore.bean.PrivilegeGiftInfo;
import java.util.Date;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.util.DateUtils;
import lnc.a1;

public class PrivilegeGiftListResponse implements Serializable, b	// class@00130f
{
    public String mGiftToken;
    public List mGiftWrappers;
    public static final long serialVersionUID = 0x5eb7f05c293253fb;

    public void PrivilegeGiftListResponse(){
       super();
       this.mGiftWrappers = new ArrayList();
    }
    public List getItems(){
       return this.mGiftWrappers;
    }
    public List getPrivilegeGiftPanelItems(long p0){
       ArrayList obj;
       if (PatchProxy.isSupport(PrivilegeGiftListResponse.class)) {
          obj = PatchProxy.applyOneRefs(Long.valueOf(p0), this, PrivilegeGiftListResponse.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new ArrayList();
       Iterator iterator = this.getItems().iterator();
       while (iterator.hasNext()) {
          PrivilegeGiftWrapper privilegeGif = iterator.next();
          this.setActivityGiftExpireTipIfNecessary(privilegeGif, p0);
          GiftPanelItem giftPanelIte = f.j(privilegeGif.convertToPrivilegeGift());
          giftPanelIte.mWealthGradeScore = (long)privilegeGif.mWealthGradeScore;
          giftPanelIte.mLiveVipGradeScore = privilegeGif.mLiveVipGradeScore;
          if (privilegeGif.mGift != null) {
             giftPanelIte.mItemHint = privilegeGif.mItemHint;
          }
          obj.add(giftPanelIte);
       }
       return obj;
    }
    public List getPrivilegeGifts(){
       ArrayList obj = PatchProxy.apply(null, this, PrivilegeGiftListResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       Iterator iterator = this.getItems().iterator();
       while (iterator.hasNext()) {
          obj.add(iterator.next().convertToPrivilegeGift());
       }
       return obj;
    }
    public boolean hasMore(){
       return false;
    }
    public final void setActivityGiftExpireTipIfNecessary(PrivilegeGiftWrapper p0,long p1){
       if (PatchProxy.isSupport(PrivilegeGiftListResponse.class) && PatchProxy.applyVoidTwoRefs(p0, Long.valueOf(p1), this, PrivilegeGiftListResponse.class, "3")) {
          return;
       }
       if (p0 != null && p0.giftType == 5) {
          PrivilegeGiftWrapper mPrivilegeGi = p0.mPrivilegeGiftInfo;
          if (mPrivilegeGi != null && mPrivilegeGi.mGiftActivityStatus != 2) {
             Date uDate = new Date((long)p0.mGift.getLeftExpireTime());
             p0.mGift.mExpireTip = DateUtils.t(uDate.getTime())+a1.p(0x7f102283);
             long l = uDate.getTime() - p1;
             p0 = p0.mPrivilegeGiftInfo;
             p1 = (l < 0)? -1: l / 0x36ee80;
             p0.mGiftActivityExpireTime = p1;
          }
       }
       return;
    }
}
