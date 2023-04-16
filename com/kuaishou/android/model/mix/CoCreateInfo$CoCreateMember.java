package com.kuaishou.android.model.mix.CoCreateInfo$CoCreateMember;
import java.io.Serializable;
import java.lang.Object;

public class CoCreateInfo$CoCreateMember implements Serializable	// class@000be3
{
    public long inviteStatus;
    public String mAliasName;
    public boolean mHasReportAd;
    public CDNUrl[] mHeadIconUrls;
    public boolean mIsFollowing;
    public String mRole;
    public int mRoleType;
    public long mUserId;
    public String mUserName;
    public static final long serialVersionUID = 0xa6ca468f489b0b41;

    public void CoCreateInfo$CoCreateMember(){
       super();
       this.mHasReportAd = false;
    }
}
