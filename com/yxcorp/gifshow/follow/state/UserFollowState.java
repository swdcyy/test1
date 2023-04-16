package com.yxcorp.gifshow.follow.state.UserFollowState;
import java.lang.Enum;
import com.yxcorp.gifshow.follow.state.UserFollowState$1;
import java.lang.String;
import com.yxcorp.gifshow.follow.state.UserFollowState$2;
import com.yxcorp.gifshow.follow.state.UserFollowState$3;
import com.yxcorp.gifshow.follow.state.UserFollowState$4;
import com.yxcorp.gifshow.follow.state.UserFollowState$5;
import com.yxcorp.gifshow.follow.state.UserFollowState$6;
import com.yxcorp.gifshow.follow.state.UserFollowState$7;
import com.yxcorp.gifshow.follow.state.UserFollowState$8;
import com.yxcorp.gifshow.follow.state.UserFollowState$9;
import com.yxcorp.gifshow.follow.state.UserFollowState$10;
import com.yxcorp.gifshow.follow.state.UserFollowState$11;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public abstract class UserFollowState extends Enum	// class@00125d
{
    public static final UserFollowState[] $VALUES;
    public static final UserFollowState CLAP;
    public static final UserFollowState FOLLOW;
    public static final UserFollowState FOLLOWED;
    public static final UserFollowState FOLLOWED_EACH_OTHER;
    public static final UserFollowState FOLLOW_FAN;
    public static final UserFollowState FOLLOW_FAN_PRIVATE;
    public static final UserFollowState FOLLOW_PRIVATE;
    public static final UserFollowState FOLLOW_REQUESTING;
    public static final UserFollowState ME;
    public static final UserFollowState NONE;
    public static final UserFollowState SEND_MESSAGE;

    static {
       UserFollowState$1 u1 = new UserFollowState$1("NONE", 0);
       UserFollowState.NONE = u1;
       UserFollowState$2 u2 = new UserFollowState$2("FOLLOW", 1);
       UserFollowState.FOLLOW = u2;
       UserFollowState$3 u3 = new UserFollowState$3("FOLLOW_PRIVATE", 2);
       UserFollowState.FOLLOW_PRIVATE = u3;
       UserFollowState$4 u4 = new UserFollowState$4("FOLLOWED", 3);
       UserFollowState.FOLLOWED = u4;
       UserFollowState$5 u5 = new UserFollowState$5("FOLLOW_REQUESTING", 4);
       UserFollowState.FOLLOW_REQUESTING = u5;
       UserFollowState$6 u6 = new UserFollowState$6("FOLLOW_FAN", 5);
       UserFollowState.FOLLOW_FAN = u6;
       UserFollowState$7 u7 = new UserFollowState$7("FOLLOW_FAN_PRIVATE", 6);
       UserFollowState.FOLLOW_FAN_PRIVATE = u7;
       UserFollowState$8 u8 = new UserFollowState$8("FOLLOWED_EACH_OTHER", 7);
       UserFollowState.FOLLOWED_EACH_OTHER = u8;
       UserFollowState$9 u9 = new UserFollowState$9("ME", 8);
       UserFollowState.ME = u9;
       UserFollowState$10 u10 = new UserFollowState$10("SEND_MESSAGE", 9);
       UserFollowState.SEND_MESSAGE = u10;
       UserFollowState$11 u11 = new UserFollowState$11("CLAP", 10);
       UserFollowState.CLAP = u11;
       UserFollowState[] userFollowSt = new UserFollowState[11];
       userFollowSt[0] = u1;
       userFollowSt[1] = u2;
       userFollowSt[2] = u3;
       userFollowSt[3] = u4;
       userFollowSt[4] = u5;
       userFollowSt[5] = u6;
       userFollowSt[6] = u7;
       userFollowSt[7] = u8;
       userFollowSt[8] = u9;
       userFollowSt[9] = u10;
       userFollowSt[10] = u11;
       UserFollowState.$VALUES = userFollowSt;
    }
    public void UserFollowState(String p0,int p1){
       super(p0, p1);
    }
    public void UserFollowState(String p0,int p1,UserFollowState$1 p2){
       super(p0, p1);
    }
    public static UserFollowState valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, UserFollowState.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(UserFollowState.class, p0);
    }
    public static UserFollowState[] values(){
       Object obj = PatchProxy.apply(null, null, UserFollowState.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return UserFollowState.$VALUES.clone();
    }
    public abstract String getText();
}
