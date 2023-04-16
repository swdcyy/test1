package com.kwai.feature.api.social.message.imshare.model.ShareIMInfo;
import java.io.Serializable;
import java.lang.Object;
import com.kwai.framework.model.user.User;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.common.base.Optional;
import com.kwai.feature.api.social.message.imshare.model.ShareUserInfo;
import com.yxcorp.gifshow.model.CDNUrl;
import java.lang.Integer;
import com.kwai.feature.api.social.message.imshare.model.GroupInfo;
import java.lang.Boolean;
import ekd.s0;
import com.kwai.feature.api.social.message.imshare.model.b;
import ok.h;
import com.kwai.feature.api.social.message.imshare.model.a;
import com.yxcorp.utility.TextUtils;
import java.lang.Number;

public class ShareIMInfo implements Serializable	// class@001163
{
    public GroupInfo mGroupInfo;
    public boolean mHasShown;
    public int mIconId;
    public boolean mIsFromReco;
    public boolean mIsRtcRunning;
    public boolean mLastItem;
    public String mLlsId;
    public String mLlsIdCacheFrom;
    public ShareOrderInfo mOrderInfo;
    public SharePosInfo mPosInfo;
    public int mRelationType;
    public int mShareAction;
    public int mShareActionState;
    public boolean mShowLetter;
    public boolean mShowTitle;
    public String mText;
    public String mTransactionId;
    public int mType;
    public ShareUserInfo mUserInfo;
    public static final long serialVersionUID = 0x4a2cdcf5a7c59970;

    public void ShareIMInfo(){
       super();
       this.mLlsIdCacheFrom = "unknown";
       this.mShareActionState = 1;
    }
    public static User convertToQUser(ShareIMInfo p0){
       User obj = PatchProxy.applyOneRefs(p0, null, ShareIMInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       ShareUserInfo shareUserInf = Optional.fromNullable(p0.mUserInfo).or(new ShareUserInfo());
       obj = new User(shareUserInf.mUserId, shareUserInf.mUserName, shareUserInf.mUserSex, shareUserInf.mHeadUrl, shareUserInf.mHeadUrls);
       v6.mKwaiId = shareUserInf.mUserId;
       return v6;
    }
    public static ShareIMInfo from(int p0,String p1,String p2,String p3,int p4){
       ShareIMInfo obj;
       if (PatchProxy.isSupport(ShareIMInfo.class)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),p1,p2,p3,Integer.valueOf(p4)};
          obj = PatchProxy.apply(objArray, null, ShareIMInfo.class, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new ShareIMInfo();
       obj.mType = p0;
       if (!p0) {
          ShareUserInfo shareUserInf = new ShareUserInfo();
          shareUserInf.mUserId = p1;
          shareUserInf.mUserName = p2;
          shareUserInf.mHeadUrl = p3;
          obj.mUserInfo = shareUserInf;
       }else if(p0 == 4){
          GroupInfo groupInfo = new GroupInfo();
          groupInfo.mGroupId = p1;
          groupInfo.mGroupType = p4;
          groupInfo.mGroupName = p2;
          obj.mGroupInfo = groupInfo;
       }
       return obj;
    }
    public static String lambda$getHeadUrl$0(ShareUserInfo p0){
       return p0.mHeadUrl;
    }
    public static String lambda$getHeadUrl$1(GroupInfo p0){
       return p0.mHeadUrl;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ShareIMInfo.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (!p0 instanceof ShareIMInfo) {
          return false;
       }
       ShareIMInfo tmGroupInfo = this.mGroupInfo;
       if (tmGroupInfo != null) {
          ShareIMInfo mGroupInfo = p0.mGroupInfo;
          if (mGroupInfo != null && (tmGroupInfo.mGroupId).equals(mGroupInfo.mGroupId)) {
             return b;
          }
       }
       tmGroupInfo = this.mUserInfo;
       if (tmGroupInfo != null && (p0.mUserInfo != null && (tmGroupInfo.mUserId).equals(p0.getUserInfo().mUserId))) {
          return b;
       }else if(s0.a(this.mLlsId, p0.mLlsId) && (this.mType == p0.mType && (this.mIconId == p0.mIconId && (this.mRelationType == p0.mRelationType && (s0.a(this.mText, p0.mText) && (s0.a(this.mUserInfo, p0.mUserInfo) && s0.a(this.mGroupInfo, p0.mGroupInfo))))))){
          b = false;
       }
       return b;
    }
    public int getDataType(){
       return this.mType;
    }
    public GroupInfo getGroupInfo(){
       return this.mGroupInfo;
    }
    public String getHeadUrl(){
       ShareIMInfo obj = PatchProxy.apply(null, this, ShareIMInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mType;
       if (obj == null) {
          return Optional.fromNullable(this.mUserInfo).transform(b.b).or("");
       }
       if (obj == 4) {
          return Optional.fromNullable(this.mGroupInfo).transform(a.b).or("");
       }
       return "";
    }
    public int getIconId(){
       return this.mIconId;
    }
    public String getId(){
       ShareIMInfo tmType = this.mType;
       String str = "";
       if (tmType == null) {
          tmType = this.mUserInfo;
          if (tmType != null) {
             str = tmType.mUserId;
          }
          return str;
       }else if(tmType == 4){
          tmType = this.mGroupInfo;
          if (tmType != null) {
             str = tmType.mGroupId;
          }
       }
       return str;
    }
    public String getName(){
       ShareIMInfo obj = PatchProxy.apply(null, this, ShareIMInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mType;
       String str = "";
       if (obj == null) {
          obj = this.mUserInfo;
          if (obj != null) {
             str = TextUtils.i(obj.mAliasName, obj.mUserName);
          }
          return str;
       }else if(obj == 4){
          obj = this.mGroupInfo;
          if (obj != null) {
             str = obj.mGroupName;
          }
       }
       return str;
    }
    public int getRelationType(){
       return this.mRelationType;
    }
    public int getShareAction(){
       return this.mShareAction;
    }
    public int getShareToType(){
       ShareIMInfo tmType = this.mType;
       ShareUserInfo shareUserInf = null;
       if (tmType == null) {
          tmType = this.mUserInfo;
          if (tmType != null) {
             shareUserInf = tmType.mRelationType;
          }
          return shareUserInf;
       }else if(tmType == 4){
          tmType = this.mGroupInfo;
          if (tmType != null) {
             shareUserInf = (tmType.mGroupType == 3)? 4: 6;
          }
       label_001b :
          return shareUserInf;
       }else {
          return tmType;
       }
    }
    public String getText(){
       return this.mText;
    }
    public ShareUserInfo getUserInfo(){
       return this.mUserInfo;
    }
    public int hashCode(){
       ShareIMInfo obj = PatchProxy.apply(null, this, ShareIMInfo.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mUserInfo;
       if (obj != null) {
          return (obj.mUserId).hashCode();
       }
       obj = this.mGroupInfo;
       if (obj != null) {
          return (obj.mGroupId).hashCode();
       }
       return super.hashCode();
    }
    public void setDataType(int p0){
       this.mType = p0;
    }
    public void setGroupInfo(GroupInfo p0){
       this.mGroupInfo = p0;
    }
    public void setIconId(int p0){
       this.mIconId = p0;
    }
    public void setRelationType(int p0){
       this.mRelationType = p0;
    }
    public void setShareAction(int p0){
       this.mShareAction = p0;
    }
    public void setText(String p0){
       this.mText = p0;
    }
    public void setUserInfo(ShareUserInfo p0){
       this.mUserInfo = p0;
    }
}
