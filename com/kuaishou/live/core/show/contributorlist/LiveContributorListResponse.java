package com.kuaishou.live.core.show.contributorlist.LiveContributorListResponse;
import java.io.Serializable;
import la6.b;
import java.lang.Object;
import java.util.List;
import com.kuaishou.live.core.show.contributorlist.LiveContributorListResponse$ContributorsInfo;
import java.lang.String;

public class LiveContributorListResponse implements Serializable, b	// class@000ad6
{
    public LiveContributorListResponse$ContributorsInfo mContributorsInfo;
    public static final long serialVersionUID = 0x9e8e092365aaee46;

    public void LiveContributorListResponse(){
       super();
    }
    public List getItems(){
       return this.mContributorsInfo.mContributors;
    }
    public String getRankingDescription(){
       return this.mContributorsInfo.mRankingDescription;
    }
    public String getRuleH5Url(){
       return this.mContributorsInfo.mRuleH5Url;
    }
    public boolean hasMore(){
       return false;
    }
}
