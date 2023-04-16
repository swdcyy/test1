package com.yxcorp.gifshow.relation.user.model.UserListMode;
import java.lang.Enum;
import com.yxcorp.gifshow.relation.user.model.UserListMode$1;
import java.lang.String;
import com.yxcorp.gifshow.relation.user.model.UserListMode$2;
import com.yxcorp.gifshow.relation.user.model.UserListMode$3;
import com.yxcorp.gifshow.relation.user.model.UserListMode$4;
import com.yxcorp.gifshow.relation.user.model.UserListMode$5;
import com.yxcorp.gifshow.relation.user.model.UserListMode$6;
import com.yxcorp.gifshow.relation.user.model.UserListMode$7;
import com.yxcorp.gifshow.relation.user.model.UserListMode$8;
import com.yxcorp.gifshow.relation.user.model.UserListMode$9;
import com.yxcorp.gifshow.relation.user.model.UserListMode$10;
import com.yxcorp.gifshow.relation.user.model.UserListMode$11;
import com.yxcorp.gifshow.relation.user.model.UserListMode$12;
import com.yxcorp.gifshow.relation.user.model.UserListMode$13;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.activity.GifshowActivity;
import brd.t;

public abstract class UserListMode extends Enum	// class@001a4f
{
    public final String mUriPath;
    public static final UserListMode[] $VALUES;
    public static final UserListMode FOLLOWER;
    public static final UserListMode FOLLOWER_IN_GROUP;
    public static final UserListMode FOLLOWING;
    public static final UserListMode FOLLOWING_IN_GROUP;
    public static final UserListMode FRIEND;
    public static final UserListMode FRIEND_FOLLOWERS;
    public static final UserListMode FRIEND_IN_GROUP;
    public static final UserListMode MISSU_USERS;
    public static final UserListMode NOTICE_USERS;
    public static final UserListMode PHOTO_DETAIL_SAME_RELATION;
    public static final UserListMode PHOTO_LIKE_USERS;
    public static final UserListMode SAME_FOLLOWERS;
    public static final UserListMode SAME_RELATION;

    static {
       UserListMode$1 u1 = new UserListMode$1("FOLLOWER", 0, "follower");
       UserListMode.FOLLOWER = u1;
       UserListMode$2 u2 = new UserListMode$2("FOLLOWING", 1, "following");
       UserListMode.FOLLOWING = u2;
       UserListMode$3 u3 = new UserListMode$3("FRIEND", 2, "friend");
       UserListMode.FRIEND = u3;
       UserListMode$4 u4 = new UserListMode$4("PHOTO_LIKE_USERS", 3, "liker");
       UserListMode.PHOTO_LIKE_USERS = u4;
       UserListMode$5 u5 = new UserListMode$5("FRIEND_FOLLOWERS", 4, "friend_followers");
       UserListMode.FRIEND_FOLLOWERS = u5;
       UserListMode$6 u6 = new UserListMode$6("NOTICE_USERS", 5, "notice");
       UserListMode.NOTICE_USERS = u6;
       UserListMode$7 u7 = new UserListMode$7("MISSU_USERS", 6, "missu");
       UserListMode.MISSU_USERS = u7;
       UserListMode$8 u8 = new UserListMode$8("SAME_FOLLOWERS", 7, "same_followers");
       UserListMode.SAME_FOLLOWERS = u8;
       UserListMode$9 u9 = new UserListMode$9("SAME_RELATION", 8, "relation");
       UserListMode.SAME_RELATION = u9;
       UserListMode$10 u10 = new UserListMode$10("PHOTO_DETAIL_SAME_RELATION", 9, "feed_relation_list");
       UserListMode.PHOTO_DETAIL_SAME_RELATION = u10;
       UserListMode$11 u11 = new UserListMode$11("FOLLOWING_IN_GROUP", 10, "following_in_group");
       UserListMode.FOLLOWING_IN_GROUP = u11;
       UserListMode$12 u12 = new UserListMode$12("FRIEND_IN_GROUP", 11, "friend_in_group");
       UserListMode.FRIEND_IN_GROUP = u12;
       UserListMode$13 u13 = new UserListMode$13("FOLLOWER_IN_GROUP", 12, "follower_in_group");
       UserListMode.FOLLOWER_IN_GROUP = u13;
       UserListMode[] userListMode = new UserListMode[13];
       userListMode[0] = u1;
       userListMode[1] = u2;
       userListMode[2] = u3;
       userListMode[3] = u4;
       userListMode[4] = u5;
       userListMode[5] = u6;
       userListMode[6] = u7;
       userListMode[7] = u8;
       userListMode[8] = u9;
       userListMode[9] = u10;
       userListMode[10] = u11;
       userListMode[11] = u12;
       userListMode[12] = u13;
       UserListMode.$VALUES = userListMode;
    }
    public void UserListMode(String p0,int p1,String p2){
       super(p0, p1);
       this.mUriPath = p2;
    }
    public void UserListMode(String p0,int p1,String p2,UserListMode$1 p3){
       super(p0, p1, p2);
    }
    public static UserListMode valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, UserListMode.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(UserListMode.class, p0);
    }
    public static UserListMode[] values(){
       Object obj = PatchProxy.apply(null, null, UserListMode.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return UserListMode.$VALUES.clone();
    }
    public abstract t createFragment(GifshowActivity p0);
}
