package com.kwai.user.base.chat.target.bean.UserSimpleInfo;
import com.kwai.user.base.chat.target.bean.BehaviorPublisherAndSyncable;
import java.lang.String;
import java.util.List;
import com.kwai.framework.model.user.UserSettingOption;
import com.kwai.framework.model.user.UserVerifiedDetail;
import com.kwai.framework.model.user.ProfilePageInfo;
import java.util.ArrayList;
import com.kwai.user.base.chat.target.bean.UserMoodInfo;
import com.kwai.user.base.chat.target.bean.TagStyle;
import com.kwai.user.base.chat.target.bean.UserPendant;
import java.util.Map;
import com.kwai.user.base.chat.target.bean.WhatsUpButton;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.model.CDNUrl;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.StringBuilder;
import ab.d;
import ekd.s0;
import yl8.b;
import ekd.f0;

public class UserSimpleInfo extends BehaviorPublisherAndSyncable	// class@00197f
{
    public boolean mAccountCancelled;
    public List mAccountPanel;
    public String mAlias;
    public List mAvatarPendantUrls;
    public boolean mBlockedByOwner;
    public List mBottomNavItems;
    public int mDenyMessageFlag;
    public boolean mDisableSendImage;
    public long mExpireTimestamp;
    public String mGender;
    public String mHeadUrl;
    public List mHeadUrls;
    public String mId;
    public boolean mIsBlocked;
    public boolean mIsFollowRequesting;
    public Map mLogParams;
    public int mMsgCountLeft;
    public String mName;
    public String mNameAbbr;
    public String mNamePY;
    public int mOfficialAccountType;
    public List mPresetPanel;
    public ProfilePageInfo mProfilePageInfo;
    public int mRelationType;
    public boolean mReplacePresetPanel;
    public String mSubBiz;
    public String mSubbizExtra;
    public String mTag;
    public TagStyle mTagStyle;
    public int mTargetUserType;
    public int mType;
    public UserMoodInfo mUserMoodInfo;
    public UserPendant mUserPendant;
    public UserSettingOption mUserSettingOption;
    public UserVerifiedDetail mUserVerifiedDetail;
    public WhatsUpButton mWhatsUpButton;
    public static final UserSimpleInfo EMPTY_USER;
    public static final long serialVersionUID;

    static {
       UserSimpleInfo.EMPTY_USER = new UserSimpleInfo("0", 0, "empty");
    }
    public void UserSimpleInfo(){
       super();
       this.mMsgCountLeft = -1;
       this.mExpireTimestamp = 0;
    }
    public void UserSimpleInfo(UserSimpleInfo p0){
       UserSimpleInfo userSimpleIn = p0;
       super(userSimpleIn.mHeadUrls, userSimpleIn.mDenyMessageFlag, userSimpleIn.mGender, userSimpleIn.mHeadUrl, userSimpleIn.mId, userSimpleIn.mSubBiz, userSimpleIn.mType, userSimpleIn.mSubbizExtra, userSimpleIn.mName, userSimpleIn.mDisableSendImage, userSimpleIn.mIsBlocked, userSimpleIn.mRelationType, userSimpleIn.mIsFollowRequesting, userSimpleIn.mUserSettingOption, userSimpleIn.mNamePY, userSimpleIn.mNameAbbr, userSimpleIn.mAvatarPendantUrls, userSimpleIn.mUserVerifiedDetail, userSimpleIn.mProfilePageInfo, userSimpleIn.mOfficialAccountType);
    }
    public void UserSimpleInfo(String p0,int p1,String p2){
       super();
       this.mMsgCountLeft = -1;
       this.mExpireTimestamp = 0;
       if (p2 == null) {
          p2 = "0";
       }
       this.mId = p2;
       this.mName = p2;
       this.mType = p1;
       this.mSubBiz = p0;
       this.mHeadUrl = "";
       this.mHeadUrls = new ArrayList();
       this.mTargetUserType = -1;
       return;
    }
    public void UserSimpleInfo(List p0,int p1,String p2,String p3,String p4,String p5,int p6,String p7,String p8,boolean p9,boolean p10,int p11,boolean p12,UserSettingOption p13,String p14,String p15,List p16,UserVerifiedDetail p17,ProfilePageInfo p18,int p19){
       int i = this;
       super();
       i.mMsgCountLeft = -1;
       i.mExpireTimestamp = 0;
       i.mHeadUrls = p0;
       i.mDenyMessageFlag = p1;
       i.mGender = p2;
       i.mHeadUrl = p3;
       i.mId = p4;
       i.mSubBiz = p5;
       i.mType = p6;
       i.mSubbizExtra = p7;
       i.mName = p8;
       i.mDisableSendImage = p9;
       i.mIsBlocked = p10;
       i.mRelationType = p11;
       i.mIsFollowRequesting = p12;
       i.mUserSettingOption = p13;
       i.mNamePY = p14;
       i.mNameAbbr = p15;
       i.mAvatarPendantUrls = p16;
       i.mUserVerifiedDetail = p17;
       i.mProfilePageInfo = p18;
       i.mOfficialAccountType = p19;
    }
    public void UserSimpleInfo(List p0,int p1,String p2,String p3,String p4,String p5,int p6,String p7,String p8,boolean p9,boolean p10,int p11,boolean p12,UserSettingOption p13,String p14,String p15,List p16,UserVerifiedDetail p17,ProfilePageInfo p18,int p19,boolean p20,int p21,String p22,boolean p23,List p24,List p25,List p26,UserMoodInfo p27,TagStyle p28,int p29,UserPendant p30,Map p31,long p32,WhatsUpButton p33,boolean p34){
       int i = this;
       super();
       i.mMsgCountLeft = -1;
       i.mExpireTimestamp = 0;
       i.mHeadUrls = p0;
       i.mDenyMessageFlag = p1;
       i.mGender = p2;
       i.mHeadUrl = p3;
       i.mId = p4;
       i.mSubBiz = p5;
       i.mType = p6;
       i.mSubbizExtra = p7;
       i.mName = p8;
       i.mDisableSendImage = p9;
       i.mIsBlocked = p10;
       i.mRelationType = p11;
       i.mIsFollowRequesting = p12;
       i.mUserSettingOption = p13;
       i.mNamePY = p14;
       i.mNameAbbr = p15;
       i.mAvatarPendantUrls = p16;
       i.mUserVerifiedDetail = p17;
       i.mProfilePageInfo = p18;
       i.mOfficialAccountType = p19;
       i.mAccountCancelled = p20;
       i.mTargetUserType = p21;
       i.mTag = p22;
       i.mReplacePresetPanel = p23;
       i.mPresetPanel = p24;
       i.mAccountPanel = p25;
       i.mBottomNavItems = p26;
       i.mUserMoodInfo = p27;
       i.mTagStyle = p28;
       i.mMsgCountLeft = p29;
       i.mUserPendant = p30;
       i.mLogParams = p31;
       i.mExpireTimestamp = p32;
       i.mWhatsUpButton = p33;
       i.mBlockedByOwner = p34;
    }
    public final boolean arePendantEqual(List p0,List p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, UserSimpleInfo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 == p1) {
          return true;
       }
       if (p0 == null || (p1 == null || p0.size() != p1.size())) {
          return false;
       }
       int i = 0;
       while (true) {
          if (i >= p0.size()) {
             return true;
          }
          if (!TextUtils.n(p0.get(i).mUrl, p1.get(i).mUrl)) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return false;
    }
    public String getBizId(){
       Object obj = PatchProxy.apply(null, this, UserSimpleInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mSubBiz+"-"+this.mType+"-"+this.mId;
    }
    public boolean getMAccountCancelled(){
       return this.mAccountCancelled;
    }
    public List getMAccountPanel(){
       return this.mAccountPanel;
    }
    public List getMAvatarPendantUrls(){
       return this.mAvatarPendantUrls;
    }
    public boolean getMBlockedByOwner(){
       return this.mBlockedByOwner;
    }
    public List getMBottomNavItems(){
       return this.mBottomNavItems;
    }
    public int getMDenyMessageFlag(){
       return this.mDenyMessageFlag;
    }
    public boolean getMDisableSendImage(){
       return this.mDisableSendImage;
    }
    public long getMExpireTimestamp(){
       return this.mExpireTimestamp;
    }
    public String getMGender(){
       return this.mGender;
    }
    public String getMHeadUrl(){
       return this.mHeadUrl;
    }
    public List getMHeadUrls(){
       return this.mHeadUrls;
    }
    public String getMId(){
       return this.mId;
    }
    public boolean getMIsBlocked(){
       return this.mIsBlocked;
    }
    public boolean getMIsFollowRequesting(){
       return this.mIsFollowRequesting;
    }
    public Map getMLogParams(){
       return this.mLogParams;
    }
    public int getMMsgCountLeft(){
       return this.mMsgCountLeft;
    }
    public String getMName(){
       return this.mName;
    }
    public String getMNameAbbr(){
       return this.mNameAbbr;
    }
    public String getMNamePY(){
       return this.mNamePY;
    }
    public int getMOfficialAccountType(){
       return this.mOfficialAccountType;
    }
    public List getMPresetPanel(){
       return this.mPresetPanel;
    }
    public ProfilePageInfo getMProfilePageInfo(){
       return this.mProfilePageInfo;
    }
    public int getMRelationType(){
       return this.mRelationType;
    }
    public boolean getMReplacePresetPanel(){
       return this.mReplacePresetPanel;
    }
    public String getMSubBiz(){
       return this.mSubBiz;
    }
    public String getMSubbizExtra(){
       return this.mSubbizExtra;
    }
    public String getMTag(){
       return this.mTag;
    }
    public TagStyle getMTagStyle(){
       return this.mTagStyle;
    }
    public int getMTargetUserType(){
       return this.mTargetUserType;
    }
    public int getMType(){
       return this.mType;
    }
    public UserMoodInfo getMUserMoodInfo(){
       return this.mUserMoodInfo;
    }
    public UserPendant getMUserPendant(){
       return this.mUserPendant;
    }
    public UserSettingOption getMUserSettingOption(){
       return this.mUserSettingOption;
    }
    public UserVerifiedDetail getMUserVerifiedDetail(){
       return this.mUserVerifiedDetail;
    }
    public WhatsUpButton getMWhatsUpButton(){
       return this.mWhatsUpButton;
    }
    public String getSubBiz(){
       return this.mSubBiz;
    }
    public String getSubbizExtra(){
       return this.mSubbizExtra;
    }
    public int getType(){
       return this.mType;
    }
    public boolean isPrivate(){
       UserSimpleInfo tmUserSettin = this.mUserSettingOption;
       boolean b = (tmUserSettin != null && tmUserSettin.isPrivacyUser != null)? true: false;
       return b;
    }
    public boolean isUserMsgable(){
       boolean b = (this.mDenyMessageFlag == null)? true: false;
       return b;
    }
    public void setMAccountCancelled(boolean p0){
       this.mAccountCancelled = p0;
    }
    public void setMAccountPanel(List p0){
       this.mAccountPanel = p0;
    }
    public void setMAvatarPendantUrls(List p0){
       this.mAvatarPendantUrls = p0;
    }
    public void setMBlockedByOwner(boolean p0){
       this.mBlockedByOwner = p0;
    }
    public void setMBottomNavItems(List p0){
       this.mBottomNavItems = p0;
    }
    public void setMDenyMessageFlag(int p0){
       this.mDenyMessageFlag = p0;
    }
    public void setMDisableSendImage(boolean p0){
       this.mDisableSendImage = p0;
    }
    public void setMExpireTimestamp(long p0){
       this.mExpireTimestamp = p0;
    }
    public void setMGender(String p0){
       this.mGender = p0;
    }
    public void setMHeadUrl(String p0){
       this.mHeadUrl = p0;
    }
    public void setMHeadUrls(List p0){
       this.mHeadUrls = p0;
    }
    public void setMId(String p0){
       this.mId = p0;
    }
    public void setMIsBlocked(boolean p0){
       this.mIsBlocked = p0;
    }
    public void setMIsFollowRequesting(boolean p0){
       this.mIsFollowRequesting = p0;
    }
    public void setMLogParams(Map p0){
       this.mLogParams = p0;
    }
    public void setMMsgCountLeft(int p0){
       this.mMsgCountLeft = p0;
    }
    public void setMName(String p0){
       this.mName = p0;
    }
    public void setMNameAbbr(String p0){
       this.mNameAbbr = p0;
    }
    public void setMNamePY(String p0){
       this.mNamePY = p0;
    }
    public void setMOfficialAccountType(int p0){
       this.mOfficialAccountType = p0;
    }
    public void setMPresetPanel(List p0){
       this.mPresetPanel = p0;
    }
    public void setMProfilePageInfo(ProfilePageInfo p0){
       this.mProfilePageInfo = p0;
    }
    public void setMRelationType(int p0){
       this.mRelationType = p0;
    }
    public void setMReplacePresetPanel(boolean p0){
       this.mReplacePresetPanel = p0;
    }
    public void setMSubBiz(String p0){
       this.mSubBiz = p0;
    }
    public void setMSubbizExtra(String p0){
       this.mSubbizExtra = p0;
    }
    public void setMTag(String p0){
       this.mTag = p0;
    }
    public void setMTagStyle(TagStyle p0){
       this.mTagStyle = p0;
    }
    public void setMTargetUserType(int p0){
       this.mTargetUserType = p0;
    }
    public void setMType(int p0){
       this.mType = p0;
    }
    public void setMUserMoodInfo(UserMoodInfo p0){
       this.mUserMoodInfo = p0;
    }
    public void setMUserPendant(UserPendant p0){
       this.mUserPendant = p0;
    }
    public void setMUserSettingOption(UserSettingOption p0){
       this.mUserSettingOption = p0;
    }
    public void setMUserVerifiedDetail(UserVerifiedDetail p0){
       this.mUserVerifiedDetail = p0;
    }
    public void setMWhatsUpButton(WhatsUpButton p0){
       this.mWhatsUpButton = p0;
    }
    public void setSubBiz(String p0){
       this.mSubBiz = p0;
    }
    public void setSubbizExtra(String p0){
       this.mSubbizExtra = p0;
    }
    public void setType(int p0){
       this.mType = p0;
    }
    public void sync(UserSimpleInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, UserSimpleInfo.class, "3")) {
          return;
       }
       UserSimpleInfo userSimpleIn = null;
       UserSimpleInfo userSimpleIn1 = 1;
       if (!TextUtils.n(this.mHeadUrl, p0.mHeadUrl)) {
          this.mHeadUrl = p0.mHeadUrl;
          this.mHeadUrls = p0.mHeadUrls;
          userSimpleIn = 1;
       }
       UserSimpleInfo mDenyMessage = p0.mDenyMessageFlag;
       if (this.mDenyMessageFlag != mDenyMessage) {
          this.mDenyMessageFlag = mDenyMessage;
          userSimpleIn = 1;
       }
       if (!TextUtils.n(this.mGender, p0.mGender)) {
          this.mGender = p0.mGender;
          userSimpleIn = 1;
       }
       if (!TextUtils.n(this.mSubbizExtra, p0.mSubbizExtra)) {
          this.mSubbizExtra = p0.mSubbizExtra;
          userSimpleIn = 1;
       }
       if (!TextUtils.n(this.mName, p0.mName)) {
          this.mName = p0.mName;
          userSimpleIn = 1;
       }
       mDenyMessage = p0.mDisableSendImage;
       if (this.mDisableSendImage != mDenyMessage) {
          this.mDisableSendImage = mDenyMessage;
          userSimpleIn = 1;
       }
       mDenyMessage = p0.mIsBlocked;
       if (this.mIsBlocked != mDenyMessage) {
          this.mIsBlocked = mDenyMessage;
          userSimpleIn = 1;
       }
       mDenyMessage = p0.mBlockedByOwner;
       if (this.mBlockedByOwner != mDenyMessage) {
          this.mBlockedByOwner = mDenyMessage;
          userSimpleIn = 1;
       }
       mDenyMessage = p0.mRelationType;
       if (this.mRelationType != mDenyMessage) {
          this.mRelationType = mDenyMessage;
          userSimpleIn = 1;
       }
       mDenyMessage = p0.mIsFollowRequesting;
       if (this.mIsFollowRequesting != mDenyMessage) {
          this.mIsFollowRequesting = mDenyMessage;
          userSimpleIn = 1;
       }
       if (!d.a(this.mUserSettingOption, p0.mUserSettingOption)) {
          this.mUserSettingOption = p0.mUserSettingOption;
          userSimpleIn = 1;
       }
       if (!this.arePendantEqual(this.mAvatarPendantUrls, p0.mAvatarPendantUrls)) {
          this.mAvatarPendantUrls = p0.mAvatarPendantUrls;
          userSimpleIn = 1;
       }
       if (!d.a(this.mUserVerifiedDetail, p0.mUserVerifiedDetail)) {
          this.mUserVerifiedDetail = p0.mUserVerifiedDetail;
          userSimpleIn = 1;
       }
       if (!d.a(this.mProfilePageInfo, p0.mProfilePageInfo)) {
          this.mProfilePageInfo = p0.mProfilePageInfo;
          userSimpleIn = 1;
       }
       mDenyMessage = p0.mOfficialAccountType;
       if (this.mOfficialAccountType != mDenyMessage) {
          this.mOfficialAccountType = mDenyMessage;
          userSimpleIn = 1;
       }
       mDenyMessage = p0.mAccountCancelled;
       if (this.mAccountCancelled != mDenyMessage) {
          this.mAccountCancelled = mDenyMessage;
          userSimpleIn = 1;
       }
       mDenyMessage = p0.mTargetUserType;
       if (this.mTargetUserType != mDenyMessage) {
          this.mTargetUserType = mDenyMessage;
          userSimpleIn = 1;
       }
       if (!TextUtils.n(this.mTag, p0.mTag)) {
          this.mTag = p0.mTag;
          userSimpleIn = 1;
       }
       mDenyMessage = p0.mReplacePresetPanel;
       if (this.mReplacePresetPanel != mDenyMessage) {
          this.mReplacePresetPanel = mDenyMessage;
          userSimpleIn = 1;
       }
       if (!s0.a(this.mPresetPanel, p0.mPresetPanel)) {
          this.mPresetPanel = p0.mPresetPanel;
          userSimpleIn = 1;
       }
       if (!s0.a(this.mAccountPanel, p0.mAccountPanel)) {
          this.mAccountPanel = p0.mAccountPanel;
          userSimpleIn = 1;
       }
       if (!s0.a(this.mBottomNavItems, p0.mBottomNavItems)) {
          this.mBottomNavItems = p0.mBottomNavItems;
          userSimpleIn = 1;
       }
       if (!d.a(this.mUserMoodInfo, p0.mUserMoodInfo)) {
          this.mUserMoodInfo = p0.mUserMoodInfo;
          userSimpleIn = 1;
       }
       if (!d.a(this.mTagStyle, p0.mTagStyle)) {
          this.mTagStyle = p0.mTagStyle;
          userSimpleIn = 1;
       }
       mDenyMessage = p0.mMsgCountLeft;
       if (this.mMsgCountLeft != mDenyMessage) {
          this.mMsgCountLeft = mDenyMessage;
          userSimpleIn = 1;
       }
       if (!s0.a(this.mUserPendant, p0.mUserPendant)) {
          this.mUserPendant = p0.mUserPendant;
          userSimpleIn = 1;
       }
       if (!s0.a(this.mLogParams, p0.mLogParams)) {
          this.mLogParams = p0.mLogParams;
          userSimpleIn = 1;
       }
       if (!TextUtils.n(this.mAlias, p0.mAlias)) {
          this.mAlias = p0.mAlias;
          userSimpleIn = 1;
       }
       if (!d.a(this.mWhatsUpButton, p0.mWhatsUpButton)) {
          this.mWhatsUpButton = p0.mWhatsUpButton;
       }else {
          userSimpleIn1 = userSimpleIn;
       }
       this.mExpireTimestamp = p0.mExpireTimestamp;
       if (userSimpleIn1 != null) {
          this.notifyChanged(this);
       }
       return;
    }
    public void sync(b p0){
       this.sync(p0);
    }
    public void updateNamePY(){
       if (PatchProxy.applyVoid(null, this, UserSimpleInfo.class, "1")) {
          return;
       }
       if (!TextUtils.x(this.mName)) {
          this.mNamePY = f0.d(this.mName);
          this.mNameAbbr = f0.e(this.mName);
       }
       return;
    }
}
