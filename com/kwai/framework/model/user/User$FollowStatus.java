package com.kwai.framework.model.user.User$FollowStatus;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class User$FollowStatus extends Enum	// class@001731
{
    public static final User$FollowStatus[] $VALUES;
    public static final User$FollowStatus FOLLOWING;
    public static final User$FollowStatus FOLLOW_REQUESTING;
    public static final User$FollowStatus UNFOLLOW;

    static {
       User$FollowStatus uFollowStatu = new User$FollowStatus("FOLLOWING", 0);
       User$FollowStatus.FOLLOWING = uFollowStatu;
       User$FollowStatus uFollowStatu1 = new User$FollowStatus("FOLLOW_REQUESTING", 1);
       User$FollowStatus.FOLLOW_REQUESTING = uFollowStatu1;
       User$FollowStatus uFollowStatu2 = new User$FollowStatus("UNFOLLOW", 2);
       User$FollowStatus.UNFOLLOW = uFollowStatu2;
       User$FollowStatus[] uFollowStatu3 = new User$FollowStatus[]{uFollowStatu,uFollowStatu1,uFollowStatu2};
       User$FollowStatus.$VALUES = uFollowStatu3;
    }
    public void User$FollowStatus(String p0,int p1){
       super(p0, p1);
    }
    public static User$FollowStatus valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, User$FollowStatus.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(User$FollowStatus.class, p0);
    }
    public static User$FollowStatus[] values(){
       Object obj = PatchProxy.apply(null, null, User$FollowStatus.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return User$FollowStatus.$VALUES.clone();
    }
}
