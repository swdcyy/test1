package com.yxcorp.gifshow.profile.model.UserMiddleButtonType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public final class UserMiddleButtonType extends Enum	// class@0013b7
{
    public final String mEntranceType;
    public static final UserMiddleButtonType[] $VALUES;
    public static final UserMiddleButtonType CHAT;
    public static final UserMiddleButtonType DEFAULT;

    static {
       UserMiddleButtonType userMiddleBu = new UserMiddleButtonType("DEFAULT", 0, "default");
       UserMiddleButtonType.DEFAULT = userMiddleBu;
       UserMiddleButtonType userMiddleBu1 = new UserMiddleButtonType("CHAT", 1, "chat");
       UserMiddleButtonType.CHAT = userMiddleBu1;
       UserMiddleButtonType[] userMiddleBu2 = new UserMiddleButtonType[]{userMiddleBu,userMiddleBu1};
       UserMiddleButtonType.$VALUES = userMiddleBu2;
    }
    public void UserMiddleButtonType(String p0,int p1,String p2){
       super(p0, p1);
       this.mEntranceType = p2;
    }
    public static UserMiddleButtonType of(String p0){
       object oobject;
       UserMiddleButtonType[] obj = PatchProxy.applyOneRefs(p0, null, UserMiddleButtonType.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = UserMiddleButtonType.values();
       int len = obj.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return UserMiddleButtonType.DEFAULT;
          }
          oobject = obj[i];
          if (TextUtils.n(oobject.value(), p0)) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return oobject;
    }
    public static UserMiddleButtonType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, UserMiddleButtonType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(UserMiddleButtonType.class, p0);
    }
    public static UserMiddleButtonType[] values(){
       Object obj = PatchProxy.apply(null, null, UserMiddleButtonType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return UserMiddleButtonType.$VALUES.clone();
    }
    public String value(){
       return this.mEntranceType;
    }
}
