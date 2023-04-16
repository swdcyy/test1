package com.kwai.feature.component.photofeatures.reward.model.response.RewardPanelInfoResponse$PanelInfo;
import java.lang.Object;
import com.kwai.feature.component.photofeatures.reward.model.response.RewardPanelInfoResponse$KsCoinLevel;
import java.lang.Boolean;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Iterable;
import brd.t;
import com.kwai.feature.component.photofeatures.reward.model.response.a;
import erd.o;
import brd.a0;

public class RewardPanelInfoResponse$PanelInfo	// class@001250
{
    public String mButtonChargeText;
    public String mButtonRewardAgainText;
    public String mButtonText;
    public RewardPanelInfoResponse$CustomLevelInfo mCustomLevelInfo;
    public long mKsCoinBalance;
    public List mKsCoinLevels;
    public long mMaxAmount;
    public String mMessageConfirm;
    public long mMinAmount;
    public String mRewardText;
    public List mRewarders;

    public void RewardPanelInfoResponse$PanelInfo(){
       super();
       this.mMinAmount = 1;
       this.mMaxAmount = 666;
    }
    public static Boolean lambda$hasGiftNumOptions$0(RewardPanelInfoResponse$KsCoinLevel p0){
       return Boolean.valueOf(p0.mGiftNumOptions.isEmpty());
    }
    public boolean hasGiftNumOptions(){
       Object obj = PatchProxy.apply(null, this, RewardPanelInfoResponse$PanelInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (t.fromIterable(this.mKsCoinLevels).map(a.b).contains(Boolean.TRUE).e().booleanValue() ^ 0x01);
    }
}
