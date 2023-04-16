package com.kuaishou.live.common.core.component.follow.cache.LiveMyFollowingUsersResponse;
import java.io.Serializable;
import java.lang.Object;

public class LiveMyFollowingUsersResponse implements Serializable	// class@001102
{
    public int mCacheExpireDurationMs;
    public List mFollowingUserIds;
    public List mMutualUserIds;
    public static final long serialVersionUID = 0x1c0aa68f2306ff39;

    public void LiveMyFollowingUsersResponse(){
       super();
    }
}
