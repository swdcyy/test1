package com.kuaishou.recruit.model.banner.RecruitBannerInfo;
import java.io.Serializable;
import java.lang.Object;
import java.util.ArrayList;

public class RecruitBannerInfo implements Serializable	// class@000edf
{
    public String mFeedId;
    public List mRecruitBannerImageInfos;
    public static final long serialVersionUID = 0x36fe1179adeefe30;

    public void RecruitBannerInfo(){
       super();
       this.mRecruitBannerImageInfos = new ArrayList();
    }
}
