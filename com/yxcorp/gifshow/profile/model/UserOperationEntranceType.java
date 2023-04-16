package com.yxcorp.gifshow.profile.model.UserOperationEntranceType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public final class UserOperationEntranceType extends Enum	// class@0013bf
{
    public final String mEntranceType;
    public static final UserOperationEntranceType[] $VALUES;
    public static final UserOperationEntranceType ALIAS;
    public static final UserOperationEntranceType BLOCK;
    public static final UserOperationEntranceType CHAT;
    public static final UserOperationEntranceType CREATOR_CENTER;
    public static final UserOperationEntranceType DEFAULT;
    public static final UserOperationEntranceType FAVORITE_FOLLOW;
    public static final UserOperationEntranceType FRIEND_REMOVED;
    public static final UserOperationEntranceType FRIEND_REVERSE_REMOVED;
    public static final UserOperationEntranceType INTIMATE_RELATION;
    public static final UserOperationEntranceType MISS_U;
    public static final UserOperationEntranceType PRIVACY_SETTING;
    public static final UserOperationEntranceType QR_CODE;
    public static final UserOperationEntranceType REPORT;
    public static final UserOperationEntranceType SET_BACKGROUND;
    public static final UserOperationEntranceType SHARE;
    public static final UserOperationEntranceType UN_BLOCK;

    static {
       UserOperationEntranceType userOperatio = new UserOperationEntranceType("DEFAULT", 0, "default");
       UserOperationEntranceType.DEFAULT = userOperatio;
       UserOperationEntranceType userOperatio1 = new UserOperationEntranceType("PRIVACY_SETTING", 1, "privacySetting");
       UserOperationEntranceType.PRIVACY_SETTING = userOperatio1;
       UserOperationEntranceType userOperatio2 = new UserOperationEntranceType("QR_CODE", 2, "qrCode");
       UserOperationEntranceType.QR_CODE = userOperatio2;
       UserOperationEntranceType userOperatio3 = new UserOperationEntranceType("MISS_U", 3, "missU");
       UserOperationEntranceType.MISS_U = userOperatio3;
       UserOperationEntranceType userOperatio4 = new UserOperationEntranceType("CHAT", 4, "chat");
       UserOperationEntranceType.CHAT = userOperatio4;
       UserOperationEntranceType userOperatio5 = new UserOperationEntranceType("SHARE", 5, "shareProfile");
       UserOperationEntranceType.SHARE = userOperatio5;
       UserOperationEntranceType userOperatio6 = new UserOperationEntranceType("ALIAS", 6, "alias");
       UserOperationEntranceType.ALIAS = userOperatio6;
       UserOperationEntranceType userOperatio7 = new UserOperationEntranceType("FAVORITE_FOLLOW", 7, "favoriteFollow");
       UserOperationEntranceType.FAVORITE_FOLLOW = userOperatio7;
       UserOperationEntranceType userOperatio8 = new UserOperationEntranceType("FRIEND_REMOVED", 8, "removed");
       UserOperationEntranceType.FRIEND_REMOVED = userOperatio8;
       UserOperationEntranceType userOperatio9 = new UserOperationEntranceType("FRIEND_REVERSE_REMOVED", 9, "reverseRemoved");
       UserOperationEntranceType.FRIEND_REVERSE_REMOVED = userOperatio9;
       UserOperationEntranceType userOperatio10 = new UserOperationEntranceType("REPORT", 10, "report");
       UserOperationEntranceType.REPORT = userOperatio10;
       UserOperationEntranceType userOperatio11 = new UserOperationEntranceType("BLOCK", 11, "block");
       UserOperationEntranceType.BLOCK = userOperatio11;
       UserOperationEntranceType userOperatio12 = new UserOperationEntranceType("UN_BLOCK", 12, "unblock");
       UserOperationEntranceType.UN_BLOCK = userOperatio12;
       UserOperationEntranceType userOperatio13 = userOperatio12;
       UserOperationEntranceType userOperatio14 = new UserOperationEntranceType("CREATOR_CENTER", 13, "creatorCenter");
       UserOperationEntranceType.CREATOR_CENTER = userOperatio14;
       UserOperationEntranceType userOperatio15 = userOperatio14;
       userOperatio12 = new UserOperationEntranceType("INTIMATE_RELATION", 14, "intimateRelation");
       UserOperationEntranceType.INTIMATE_RELATION = userOperatio12;
       UserOperationEntranceType userOperatio16 = userOperatio12;
       userOperatio14 = new UserOperationEntranceType("SET_BACKGROUND", 15, "settingBackground");
       UserOperationEntranceType.SET_BACKGROUND = userOperatio14;
       UserOperationEntranceType[] userOperatio17 = new UserOperationEntranceType[16];
       userOperatio17[0] = userOperatio;
       userOperatio17[1] = userOperatio1;
       userOperatio17[2] = userOperatio2;
       userOperatio17[3] = userOperatio3;
       userOperatio17[4] = userOperatio4;
       userOperatio17[5] = userOperatio5;
       userOperatio17[6] = userOperatio6;
       userOperatio17[7] = userOperatio7;
       userOperatio17[8] = userOperatio8;
       userOperatio17[9] = userOperatio9;
       userOperatio17[10] = userOperatio10;
       userOperatio17[11] = userOperatio11;
       userOperatio17[12] = userOperatio13;
       userOperatio17[13] = userOperatio15;
       userOperatio17[14] = userOperatio16;
       userOperatio17[15] = userOperatio14;
       UserOperationEntranceType.$VALUES = userOperatio17;
    }
    public void UserOperationEntranceType(String p0,int p1,String p2){
       super(p0, p1);
       this.mEntranceType = p2;
    }
    public static UserOperationEntranceType of(String p0){
       object oobject;
       UserOperationEntranceType[] obj = PatchProxy.applyOneRefs(p0, null, UserOperationEntranceType.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = UserOperationEntranceType.values();
       int len = obj.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return UserOperationEntranceType.DEFAULT;
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
    public static UserOperationEntranceType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, UserOperationEntranceType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(UserOperationEntranceType.class, p0);
    }
    public static UserOperationEntranceType[] values(){
       Object obj = PatchProxy.apply(null, null, UserOperationEntranceType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return UserOperationEntranceType.$VALUES.clone();
    }
    public String value(){
       return this.mEntranceType;
    }
}
