package com.kuaishou.android.model.mix.RankInfo;
import mkd.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import oe6.b;
import com.kwai.framework.model.common.Distance;
import lnc.m1;

public class RankInfo implements a	// class@000ddc
{
    public String mCity;
    public String mDetail;
    public Distance mDistance;
    public String mDistanceStr;
    public String mLikeCount;
    public String mLinkUrl;
    public int mOrder;
    public String mRankId;
    public String mRuleLinkUrl;
    public String mRuleText;
    public String mTitle;
    public int mType;
    public String mTypeName;
    public String mUpdateTime;
    public String mViewCount;

    public void RankInfo(){
       super();
    }
    public void afterDeserialize(){
       if (PatchProxy.applyVoid(null, this, RankInfo.class, "1")) {
          return;
       }
       if (this.mDistance != null) {
          this.mDistanceStr = m1.a(b.J(), (long)this.mDistance.mDistance);
       }
       return;
    }
}
