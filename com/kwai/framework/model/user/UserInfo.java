package com.kwai.framework.model.user.UserInfo;
import java.io.Serializable;
import java.lang.Object;
import com.kwai.framework.model.user.ProfilePageInfo;
import com.yxcorp.gifshow.model.CDNUrl;
import com.kwai.framework.model.user.UserExtraInfo;
import com.kuaishou.socket.nano.UserInfos$UserInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import java.util.ArrayList;
import com.kwai.framework.model.user.UserExtraInfo$RoleInfo;
import com.kuaishou.socket.nano.UserInfos$RoleInfo;
import java.util.List;
import java.lang.Integer;
import com.kwai.framework.model.user.User;
import qa6.c;
import java.lang.Number;
import java.lang.Long;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import java.util.Collection;
import ekd.q;
import com.kwai.framework.model.user.UserVerifiedDetail;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.StringBuilder;

public class UserInfo implements Serializable	// class@00175f
{
    public boolean isVerified;
    public CDNUrl[] mAvatarPendants;
    public boolean mBanDisallowAppeal;
    public String mBanReason;
    public String mBanText;
    public int mBanType;
    public CDNUrl[] mBigHeadUrls;
    public UserCertificationTag mCertificationTag;
    public boolean mDefaultHead;
    public ProfileDynamicPendant mDynamicPendant;
    public String mEncryptUid;
    public String mEncryptedUserId;
    public UserExtraInfo mExtraInfo;
    public boolean mFrozen;
    public String mHeadUrl;
    public CDNUrl[] mHeadUrls;
    public String mId;
    public boolean mIsConvertFromProto;
    public String mKwaiId;
    public String mName;
    public OpenFriendName mOpenFriendName;
    public int mPendantType;
    public String mProfileBgUrl;
    public CDNUrl[] mProfileBgUrls;
    public ProfilePageInfo mProfilePageInfo;
    public String mSex;
    public boolean mShowed;
    public String mText;
    public boolean mUserBanned;
    public boolean mUserCanceled;
    public UserVerifiedDetail mVerifiedDetail;
    public String mVerifiedUrl;
    public boolean mVisitorBeFollowed;
    public static final long serialVersionUID = 0x5500b3712485d3c0;

    public void UserInfo(){
       super();
       this.mProfilePageInfo = new ProfilePageInfo();
       CDNUrl[] uCDNUrlArray = new CDNUrl[0];
       this.mHeadUrls = uCDNUrlArray;
       uCDNUrlArray = new CDNUrl[0];
       this.mProfileBgUrls = uCDNUrlArray;
       this.mExtraInfo = new UserExtraInfo();
       CDNUrl[] uCDNUrlArray1 = new CDNUrl[0];
       this.mBigHeadUrls = uCDNUrlArray1;
    }
    public static UserInfo convertFromProto(UserInfos$UserInfo p0){
       UserInfo obj = PatchProxy.applyOneRefs(p0, null, UserInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new UserInfo();
       obj.mId = String.valueOf(p0.userId);
       obj.mName = p0.userName;
       obj.isVerified = p0.verified;
       obj.mSex = p0.userGender;
       obj.mText = p0.userText;
       obj.mEncryptedUserId = p0.eUid;
       obj.mEncryptUid = p0.encryptUid;
       UserInfos$UserInfo headUrls = p0.headUrls;
       int i = 0;
       if (headUrls != null) {
          CDNUrl[] uCDNUrlArray = new CDNUrl[headUrls.length];
          obj.mHeadUrls = uCDNUrlArray;
          int len = headUrls.length;
          int i2 = 0;
          for (int i1 = 0; i1 < len; i1 = i1 + 1) {
             object oobject = headUrls[i1];
             obj.mHeadUrls[i2] = new CDNUrl(oobject.cdn, oobject.url, oobject.ip, oobject.urlPattern);
             i2 = i2 + 1;
          }
       }
       if (obj.mExtraInfo == null) {
          obj.mExtraInfo = new UserExtraInfo();
       }
       if (p0.roleInfos != null) {
          obj.mExtraInfo.mRoleInfos = new ArrayList();
          p0 = p0.roleInfos;
          int len1 = p0.length;
          for (; i < len1; i = i + 1) {
             UserExtraInfo$RoleInfo roleInfo = new UserExtraInfo$RoleInfo();
             roleInfo.mRoleType = p0[i].roleType;
             obj.mExtraInfo.mRoleInfos.add(roleInfo);
          }
       }
       obj.mIsConvertFromProto = true;
       return obj;
    }
    public static UserInfo convertFromProto(UserInfos$UserInfo p0,int p1){
       if (PatchProxy.isSupport(UserInfo.class)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, UserInfo.class, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       UserInfo userInfo = UserInfo.convertFromProto(p0);
       if (userInfo.mExtraInfo == null) {
          userInfo.mExtraInfo = new UserExtraInfo();
       }
       userInfo.mExtraInfo.mAssistantType = p1;
       return userInfo;
    }
    public static UserInfo convertFromProtoSafely(UserInfos$UserInfo p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, UserInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return null;
       }
       return UserInfo.convertFromProto(p0);
    }
    public static UserInfo convertFromQUser(User p0){
       UserInfo obj = PatchProxy.applyOneRefs(p0, null, UserInfo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new UserInfo();
       obj.mId = p0.mId;
       obj.mName = p0.mName;
       obj.mSex = p0.mSex;
       obj.mHeadUrl = p0.mAvatar;
       obj.mHeadUrls = p0.mAvatars;
       obj.mAvatarPendants = p0.mPendants;
       obj.mPendantType = p0.mPendantType;
       obj.mOpenFriendName = p0.mOpenFriendName;
       p0 = p0.mExtraInfo;
       if (p0 != null) {
          obj.mExtraInfo = p0;
       }
       return obj;
    }
    public static UserInfos$UserInfo convertToProto(UserInfo p0){
       UserInfo mHeadUrls;
       int i;
       UserInfos$PicUrl[] picUrlArray;
       int i1;
       object oobject;
       UserInfos$PicUrl picUrl;
       UserInfos$RoleInfo[] roleInfoArra;
       UserInfos$RoleInfo roleInfo;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = null;
       UserInfos$UserInfo obj1 = PatchProxy.applyOneRefs(p0, obj, UserInfo.class, "3");
       if (obj1 != patchProxyRe) {
          return obj1;
       }
       obj1 = new UserInfos$UserInfo();
       UserInfo mId = p0.mId;
       obj = PatchProxy.applyOneRefs(mId, obj, c.class, "1");
       long l = (obj != patchProxyRe)? obj.longValue(): Long.parseLong(mId);
    }
    public static User convertToQUser(UserInfo p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, UserInfo.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       User user = new User(p0.mId, p0.mName, p0.mSex, p0.mHeadUrl, p0.mHeadUrls);
       obj.mKwaiId = p0.mKwaiId;
       obj.mPendants = p0.mAvatarPendants;
       obj.mPendantType = p0.mPendantType;
       obj.mProfilePageInfo = p0.mProfilePageInfo;
       obj.mOpenFriendName = p0.mOpenFriendName;
       p0 = p0.mExtraInfo;
       if (p0 != null) {
          obj.mExtraInfo = p0;
       }
       return obj;
    }
    public int getAssistantType(){
       UserInfo tmExtraInfo = this.mExtraInfo;
       int i = (tmExtraInfo == null)? 0: tmExtraInfo.mAssistantType;
       return i;
    }
    public boolean isBlueVType(){
       UserInfo tmVerifiedDe = this.mVerifiedDetail;
       boolean b = (tmVerifiedDe != null && tmVerifiedDe.mIconType == 2)? true: false;
       return b;
    }
    public boolean isBlueVerifiedType(){
       boolean b;
       UserInfo tmVerifiedDe = this.mVerifiedDetail;
       if (tmVerifiedDe != null) {
          UserVerifiedDetail mType = tmVerifiedDe.mType;
          if (mType == 2 || mType == 3) {
             b = true;
          label_000f :
             return b;
          }
       }
       b = false;
       goto label_000f ;
    }
    public boolean isFemale(){
       Object obj = PatchProxy.apply(null, this, UserInfo.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return ("F").equals(this.mSex);
    }
    public boolean isLiving(){
       UserInfo tmExtraInfo = this.mExtraInfo;
       boolean b = (tmExtraInfo != null && tmExtraInfo.mIsLiving != null)? true: false;
       return b;
    }
    public boolean isMale(){
       Object obj = PatchProxy.apply(null, this, UserInfo.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return ("M").equals(this.mSex);
    }
    public boolean isUserBanned(){
       Object obj = PatchProxy.apply(null, this, UserInfo.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!TextUtils.x(this.mBanText) || this.mUserBanned != null)? true: false;
       return b;
    }
    public boolean isWatching(){
       UserInfo tmExtraInfo = this.mExtraInfo;
       boolean b = (tmExtraInfo != null && tmExtraInfo.mIsWatching != null)? true: false;
       return b;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, UserInfo.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return " mName: "+this.mName;
    }
}
