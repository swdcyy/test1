package com.yxcorp.gifshow.follow.slide.detail.data.PymiSwipeLivePanelData$UserInfo;
import java.io.Serializable;
import java.lang.Object;
import com.kwai.framework.model.user.ProfilePageInfo;

public final class PymiSwipeLivePanelData$UserInfo implements Serializable	// class@001103
{
    public String avatar;
    public FeedUserAvatarInfo avatarInfo;
    public CDNUrl[] avatars;
    public ProfilePageInfo profilePageInfo;
    public int relationType;
    public String sex;
    public String userId;
    public String userName;
    public boolean verified;
    public boolean visitorBeFollowed;

    public void PymiSwipeLivePanelData$UserInfo(){
       super();
       this.profilePageInfo = new ProfilePageInfo();
       this.userId = "";
    }
}
