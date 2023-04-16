package com.yxcorp.gifshow.profile.model.UserStateExtBuilder$Priority;
import java.lang.Enum;
import com.yxcorp.gifshow.profile.model.UserStateExtBuilder$Priority$1;
import java.lang.String;
import com.yxcorp.gifshow.profile.model.UserStateExtBuilder$Priority$2;
import com.yxcorp.gifshow.profile.model.UserStateExtBuilder$Priority$3;
import com.yxcorp.gifshow.profile.model.UserStateExtBuilder$Priority$4;
import com.yxcorp.gifshow.profile.model.UserStateExtBuilder$Priority$5;
import com.yxcorp.gifshow.profile.model.UserStateExtBuilder$Priority$6;
import com.yxcorp.gifshow.profile.model.UserStateExtBuilder$Priority$7;
import com.yxcorp.gifshow.profile.model.UserStateExtBuilder$a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.model.user.User;
import com.kwai.framework.model.user.UserProfile;

public abstract class UserStateExtBuilder$Priority extends Enum	// class@0013d2
{
    public static final UserStateExtBuilder$Priority[] $VALUES;
    public static final UserStateExtBuilder$Priority ACCOUNT_ABANDON;
    public static final UserStateExtBuilder$Priority BANNED;
    public static final UserStateExtBuilder$Priority BLACKED;
    public static final UserStateExtBuilder$Priority BLACKED_BY_OWNER;
    public static final UserStateExtBuilder$Priority FROZEN;
    public static final UserStateExtBuilder$Priority NORMAL;
    public static final UserStateExtBuilder$Priority PRIVACY;

    static {
       UserStateExtBuilder$Priority$1 priority$1 = new UserStateExtBuilder$Priority$1("NORMAL", 0);
       UserStateExtBuilder$Priority.NORMAL = priority$1;
       UserStateExtBuilder$Priority$2 priority$2 = new UserStateExtBuilder$Priority$2("PRIVACY", 1);
       UserStateExtBuilder$Priority.PRIVACY = priority$2;
       UserStateExtBuilder$Priority$3 priority$3 = new UserStateExtBuilder$Priority$3("BLACKED_BY_OWNER", 2);
       UserStateExtBuilder$Priority.BLACKED_BY_OWNER = priority$3;
       UserStateExtBuilder$Priority$4 priority$4 = new UserStateExtBuilder$Priority$4("BLACKED", 3);
       UserStateExtBuilder$Priority.BLACKED = priority$4;
       UserStateExtBuilder$Priority$5 priority$5 = new UserStateExtBuilder$Priority$5("BANNED", 4);
       UserStateExtBuilder$Priority.BANNED = priority$5;
       UserStateExtBuilder$Priority$6 priority$6 = new UserStateExtBuilder$Priority$6("FROZEN", 5);
       UserStateExtBuilder$Priority.FROZEN = priority$6;
       UserStateExtBuilder$Priority$7 priority$7 = new UserStateExtBuilder$Priority$7("ACCOUNT_ABANDON", 6);
       UserStateExtBuilder$Priority.ACCOUNT_ABANDON = priority$7;
       UserStateExtBuilder$Priority[] priorityArra = new UserStateExtBuilder$Priority[]{priority$1,priority$2,priority$3,priority$4,priority$5,priority$6,priority$7};
       UserStateExtBuilder$Priority.$VALUES = priorityArra;
    }
    public void UserStateExtBuilder$Priority(String p0,int p1){
       super(p0, p1);
    }
    public void UserStateExtBuilder$Priority(String p0,int p1,UserStateExtBuilder$a p2){
       super(p0, p1);
    }
    public static UserStateExtBuilder$Priority valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, UserStateExtBuilder$Priority.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(UserStateExtBuilder$Priority.class, p0);
    }
    public static UserStateExtBuilder$Priority[] values(){
       Object obj = PatchProxy.apply(null, null, UserStateExtBuilder$Priority.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return UserStateExtBuilder$Priority.$VALUES.clone();
    }
    public abstract boolean checked(User p0,UserProfile p1);
}
