package com.kuaishou.live.common.core.component.gift.giftstore.bean.PrivilegeGiftWrapper;
import java.io.Serializable;
import java.lang.Object;
import com.kuaishou.live.common.core.component.gift.giftstore.bean.PrivilegeGift;
import com.kuaishou.live.common.core.component.gift.giftstore.bean.PrivilegeGiftInfo;
import com.kuaishou.live.external.invoke.deserializer.gift.GiftPanelItemPromptInfo;

public class PrivilegeGiftWrapper implements Serializable	// class@00131a
{
    public int giftType;
    public PrivilegeGift mGift;
    public GiftPanelItemPromptInfo mGiftPanelItemPromptInfo;
    public LiveGiftItemHint mItemHint;
    public GiftPanelItemViewData mItemViewData;
    public long mLiveVipGradeScore;
    public PrivilegeGiftInfo mPrivilegeGiftInfo;
    public int mRecoBatchSize;
    public GiftPanelItemPromptInfo mSendGiftPanelItemPromptInfo;
    public int mWealthGradeScore;
    public static final long serialVersionUID = 0x5ce55db01c36c5f3;

    public void PrivilegeGiftWrapper(){
       super();
    }
    public PrivilegeGift convertToPrivilegeGift(){
       PrivilegeGiftWrapper tmGift = this.mGift;
       PrivilegeGiftWrapper tmPrivilegeG = this.mPrivilegeGiftInfo;
       int i = (tmPrivilegeG == null)? 0: tmPrivilegeG.mMinWealthGrade;
       tmGift.mMinWealthGrade = i;
       tmGift.giftType = this.giftType;
       PrivilegeGiftWrapper tmSendGiftPa = this.mSendGiftPanelItemPromptInfo;
       tmGift.mGiftPanelItemPromptInfo = tmSendGiftPa;
       if (tmSendGiftPa == null) {
          tmGift.mGiftPanelItemPromptInfo = this.mGiftPanelItemPromptInfo;
       }else {
          PrivilegeGiftWrapper tmGiftPanelI = this.mGiftPanelItemPromptInfo;
          if (tmGiftPanelI != null) {
             tmSendGiftPa.mGiftDetailHintDescription = tmGiftPanelI.mGiftDetailHintDescription;
             tmSendGiftPa.mGiftDetailHintRuleUrl = tmGiftPanelI.mGiftDetailHintRuleUrl;
             tmSendGiftPa.mGiftDetailHintBackgroudColors = tmGiftPanelI.mGiftDetailHintBackgroudColors;
          }
       }
       tmGift.mItemViewData = this.mItemViewData;
       tmGift.mPrivilegeGiftInfo = tmPrivilegeG;
       return tmGift;
    }
}
