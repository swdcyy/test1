package com.kwai.user.base.db.dao.UserSimpleInfoDao$Properties;
import org.greenrobot.greendao.Property;
import java.lang.String;
import java.lang.Class;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.Object;

public class UserSimpleInfoDao$Properties	// class@001983
{
    public static final Property MAccountCancelled;
    public static final Property MAccountPanel;
    public static final Property MAvatarPendantUrls;
    public static final Property MBlockedByOwner;
    public static final Property MBottomNavItems;
    public static final Property MDenyMessageFlag;
    public static final Property MDisableSendImage;
    public static final Property MExpireTimestamp;
    public static final Property MGender;
    public static final Property MHeadUrl;
    public static final Property MHeadUrls;
    public static final Property MId;
    public static final Property MIsBlocked;
    public static final Property MIsFollowRequesting;
    public static final Property MLogParams;
    public static final Property MMsgCountLeft;
    public static final Property MName;
    public static final Property MNameAbbr;
    public static final Property MNamePY;
    public static final Property MOfficialAccountType;
    public static final Property MPresetPanel;
    public static final Property MProfilePageInfo;
    public static final Property MRelationType;
    public static final Property MReplacePresetPanel;
    public static final Property MSubBiz;
    public static final Property MSubbizExtra;
    public static final Property MTag;
    public static final Property MTagStyle;
    public static final Property MTargetUserType;
    public static final Property MType;
    public static final Property MUserMoodInfo;
    public static final Property MUserPendant;
    public static final Property MUserSettingOption;
    public static final Property MUserVerifiedDetail;
    public static final Property MWhatsUpButton;

    static {
       Property property = new Property(0, String.class, "mHeadUrls", false, "M_HEAD_URLS");
       UserSimpleInfoDao$Properties.MHeadUrls = v6;
       Class tYPE = Integer.TYPE;
       Property property1 = new Property(1, tYPE, "mDenyMessageFlag", false, "M_DENY_MESSAGE_FLAG");
       UserSimpleInfoDao$Properties.MDenyMessageFlag = property;
       Property property2 = new Property(2, String.class, "mGender", false, "M_GENDER");
       UserSimpleInfoDao$Properties.MGender = property;
       property1 = new Property(3, String.class, "mHeadUrl", false, "M_HEAD_URL");
       UserSimpleInfoDao$Properties.MHeadUrl = property;
       property2 = new Property(4, String.class, "mId", true, "M_ID");
       UserSimpleInfoDao$Properties.MId = property;
       property1 = new Property(5, String.class, "mSubBiz", false, "M_SUB_BIZ");
       UserSimpleInfoDao$Properties.MSubBiz = property;
       property2 = new Property(6, tYPE, "mType", false, "M_TYPE");
       UserSimpleInfoDao$Properties.MType = property;
       property1 = new Property(7, String.class, "mSubbizExtra", false, "M_SUBBIZ_EXTRA");
       UserSimpleInfoDao$Properties.MSubbizExtra = property;
       property2 = new Property(8, String.class, "mName", false, "M_NAME");
       UserSimpleInfoDao$Properties.MName = property;
       Class tYPE1 = Boolean.TYPE;
       property1 = new Property(9, tYPE1, "mDisableSendImage", false, "M_DISABLE_SEND_IMAGE");
       UserSimpleInfoDao$Properties.MDisableSendImage = property;
       property2 = new Property(10, tYPE1, "mIsBlocked", false, "M_IS_BLOCKED");
       UserSimpleInfoDao$Properties.MIsBlocked = property;
       property2 = new Property(11, tYPE, "mRelationType", false, "M_RELATION_TYPE");
       UserSimpleInfoDao$Properties.MRelationType = property;
       property2 = new Property(12, tYPE1, "mIsFollowRequesting", false, "M_IS_FOLLOW_REQUESTING");
       UserSimpleInfoDao$Properties.MIsFollowRequesting = property;
       property1 = new Property(13, String.class, "mUserSettingOption", false, "M_USER_SETTING_OPTION");
       UserSimpleInfoDao$Properties.MUserSettingOption = property;
       property2 = new Property(14, String.class, "mNamePY", false, "M_NAME_PY");
       UserSimpleInfoDao$Properties.MNamePY = property;
       property1 = new Property(15, String.class, "mNameAbbr", false, "M_NAME_ABBR");
       UserSimpleInfoDao$Properties.MNameAbbr = property;
       property2 = new Property(16, String.class, "mAvatarPendantUrls", false, "M_AVATAR_PENDANT_URLS");
       UserSimpleInfoDao$Properties.MAvatarPendantUrls = property;
       property1 = new Property(17, String.class, "mUserVerifiedDetail", false, "M_USER_VERIFIED_DETAIL");
       UserSimpleInfoDao$Properties.MUserVerifiedDetail = property;
       property2 = new Property(18, String.class, "mProfilePageInfo", false, "M_PROFILE_PAGE_INFO");
       UserSimpleInfoDao$Properties.MProfilePageInfo = property;
       property2 = new Property(19, tYPE, "mOfficialAccountType", false, "M_OFFICIAL_ACCOUNT_TYPE");
       UserSimpleInfoDao$Properties.MOfficialAccountType = property;
       property2 = new Property(20, tYPE1, "mAccountCancelled", false, "M_ACCOUNT_CANCELLED");
       UserSimpleInfoDao$Properties.MAccountCancelled = property;
       property2 = new Property(21, tYPE, "mTargetUserType", false, "M_TARGET_USER_TYPE");
       UserSimpleInfoDao$Properties.MTargetUserType = property;
       property1 = new Property(22, String.class, "mTag", false, "M_TAG");
       UserSimpleInfoDao$Properties.MTag = property;
       property2 = new Property(23, tYPE1, "mReplacePresetPanel", false, "M_REPLACE_PRESET_PANEL");
       UserSimpleInfoDao$Properties.MReplacePresetPanel = property;
       property1 = new Property(24, String.class, "mPresetPanel", false, "M_PRESET_PANEL");
       UserSimpleInfoDao$Properties.MPresetPanel = property;
       property2 = new Property(25, String.class, "mAccountPanel", false, "M_ACCOUNT_PANEL");
       UserSimpleInfoDao$Properties.MAccountPanel = property;
       property1 = new Property(26, String.class, "mBottomNavItems", false, "M_BOTTOM_NAV_ITEMS");
       UserSimpleInfoDao$Properties.MBottomNavItems = property;
       property2 = new Property(27, String.class, "mUserMoodInfo", false, "M_USER_MOOD_INFO");
       UserSimpleInfoDao$Properties.MUserMoodInfo = property;
       property1 = new Property(28, String.class, "mTagStyle", false, "M_TAG_STYLE");
       UserSimpleInfoDao$Properties.MTagStyle = property;
       property2 = new Property(29, tYPE, "mMsgCountLeft", false, "M_MSG_COUNT_LEFT");
       UserSimpleInfoDao$Properties.MMsgCountLeft = property;
       property1 = new Property(30, String.class, "mUserPendant", false, "M_USER_PENDANT");
       UserSimpleInfoDao$Properties.MUserPendant = property;
       property2 = new Property(31, String.class, "mLogParams", false, "M_LOG_PARAMS");
       UserSimpleInfoDao$Properties.MLogParams = property;
       property1 = new Property(32, Long.TYPE, "mExpireTimestamp", false, "M_EXPIRE_TIMESTAMP");
       UserSimpleInfoDao$Properties.MExpireTimestamp = property;
       property2 = new Property(33, String.class, "mWhatsUpButton", false, "M_WHATS_UP_BUTTON");
       UserSimpleInfoDao$Properties.MWhatsUpButton = property;
       property2 = new Property(34, tYPE1, "mBlockedByOwner", false, "M_BLOCKED_BY_OWNER");
       UserSimpleInfoDao$Properties.MBlockedByOwner = property;
    }
    public void UserSimpleInfoDao$Properties(){
       super();
    }
}