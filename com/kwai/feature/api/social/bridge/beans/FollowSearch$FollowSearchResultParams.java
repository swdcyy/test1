package com.kwai.feature.api.social.bridge.beans.FollowSearch$FollowSearchResultParams;
import java.io.Serializable;
import com.kwai.framework.model.user.User;
import java.lang.Object;

public class FollowSearch$FollowSearchResultParams implements Serializable	// class@001085
{
    public int mResult;
    public User[] mUsers;
    public static final long serialVersionUID = 0xaf6b0db77603bac1;

    public void FollowSearch$FollowSearchResultParams(int p0,User[] p1){
       super();
       this.mResult = p0;
       this.mUsers = p1;
    }
}
