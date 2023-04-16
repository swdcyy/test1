package com.kuaishou.live.audience.component.follow.LiveAudienceFollowCardUser;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;

public class LiveAudienceFollowCardUser implements Serializable	// class@000ac0
{
    public String mDescription;
    public boolean mIsFollowed;
    public boolean mIsPrivacyUser;
    public String mUserId;
    public UserInfo mUserInfo;
    public static final long serialVersionUID = 0x71c9ab2d20b74ba3;

    public void LiveAudienceFollowCardUser(String p0){
       super();
       this.mUserId = p0;
    }
}
