package com.kuaishou.live.merchant.hourlytrank.model.LiveMerchantHourlyRankResponse$RankInfo;
import java.io.Serializable;
import it5.b;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Collections;
import java.util.ArrayList;
import ekd.j;
import java.lang.Iterable;
import brd.t;
import com.kuaishou.live.merchant.hourlytrank.model.a;
import erd.r;
import hg3.a;
import erd.g;
import crd.b;
import com.kwai.framework.model.user.UserInfo;
import it5.a;

public class LiveMerchantHourlyRankResponse$RankInfo implements Serializable, b	// class@000cd1
{
    public String mHeadPendantUrl;
    public String mLiveStreamId;
    public String mRank;
    public LiveMerchantHourlyRankResponse$RankTag[] mRankTags;
    public String mRankValue;
    public int mRankingChange;
    public UserInfo mUserInfo;
    public static final long serialVersionUID = 0xf69fbd1eb754b502;

    public void LiveMerchantHourlyRankResponse$RankInfo(){
       super();
    }
    public String getLiveStreamId(){
       return this.mLiveStreamId;
    }
    public List getRankTag(){
       ArrayList obj = PatchProxy.apply(null, this, LiveMerchantHourlyRankResponse$RankInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.mRankTags == null) {
          return Collections.emptyList();
       }
       obj = new ArrayList();
       t.fromIterable(j.a(this.mRankTags)).filter(a.b).subscribe(new a(obj));
       return obj;
    }
    public int getRankingChangeType(){
       return this.mRankingChange;
    }
    public UserInfo getUserInfo(){
       LiveMerchantHourlyRankResponse$RankInfo obj = PatchProxy.apply(null, this, LiveMerchantHourlyRankResponse$RankInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mUserInfo;
       if (obj == null) {
          UserInfo userInfo = new UserInfo();
       }
       return obj;
    }
    public boolean isFollowing(){
       return a.a(this);
    }
    public boolean isPkButtonValid(){
       return a.b(this);
    }
}
