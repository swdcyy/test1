package com.yxcorp.gifshow.profile.model.UserProfileBgMedia$AuthorInfo;
import java.io.Serializable;
import java.lang.Object;
import com.kwai.framework.model.user.ProfilePageInfo;

public class UserProfileBgMedia$AuthorInfo implements Serializable	// class@0013c0
{
    public String mAvatar;
    public CDNUrl[] mAvatars;
    public UserProfileBgMedia$ExtraInfo mExtra;
    public boolean mFollowing;
    public String mId;
    public String mName;
    public ProfilePageInfo mProfilePageInfo;
    public String mSex;
    public boolean mVisitorBeFollowed;
    public static final long serialVersionUID = 0x87c0fab454880cd1;

    public void UserProfileBgMedia$AuthorInfo(){
       super();
       this.mProfilePageInfo = new ProfilePageInfo();
       this.mId = "";
    }
}
