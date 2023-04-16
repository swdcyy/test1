package com.kuaishou.live.core.show.profilecard.statistics.LiveAnchorStatisticInfo;
import java.io.Serializable;
import java.lang.Object;

public class LiveAnchorStatisticInfo implements Serializable	// class@000df2
{
    public int mFansCount;
    public int mFansGroupMemberCount;
    public int mTotalLikeCount;
    public int mTotalReceivedGiftCount;
    public static final long serialVersionUID = 0xc592ef43e88db02d;

    public void LiveAnchorStatisticInfo(){
       super();
       this.mTotalLikeCount = -1;
       this.mFansCount = -1;
       this.mFansGroupMemberCount = -1;
       this.mTotalReceivedGiftCount = -1;
    }
    public void LiveAnchorStatisticInfo(LiveAnchorStatisticInfo p0){
       super();
       int i = -1;
       this.mTotalLikeCount = i;
       this.mFansCount = i;
       this.mFansGroupMemberCount = i;
       this.mTotalReceivedGiftCount = i;
       if (p0 != null) {
          this.mTotalLikeCount = p0.mTotalLikeCount;
          this.mFansCount = p0.mFansCount;
          this.mFansGroupMemberCount = p0.mFansGroupMemberCount;
          this.mTotalReceivedGiftCount = p0.mTotalReceivedGiftCount;
       }
       return;
    }
}
