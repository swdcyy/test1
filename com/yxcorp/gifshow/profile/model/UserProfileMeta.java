package com.yxcorp.gifshow.profile.model.UserProfileMeta;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import fa6.c;
import com.kwai.framework.model.user.UserProfile;
import fa6.e;
import fa6.b;

public class UserProfileMeta implements Serializable	// class@0013ca
{
    public ProfileAccountInfo mAccountInfo;
    public ProfileAvatarLiveInfo mAvatarLiveInfo;
    public ProfileBannedInfo mBannedInfo;
    public UserProfileBgMedia mBgMedia;
    public List mCommercialCooperationLabel;
    public Commodity mCommodity;
    public CommonRoleLabel mCommonRoleLabel;
    public boolean mDisplayProfileIntegrityDynamicEffect;
    public boolean mEnableIntimateEntranceIntensify;
    public Boolean mEnableIntimateRelation;
    public boolean mEnableUploadUserBgVideo;
    public Hometown mHometown;
    public IntimateRelationGroup mIntimateRelationGroup;
    public int mIntimateRelationLabel;
    public IntimateRelationUsers mIntimateRelationUsers;
    public IntimateTag mIntimateTag;
    public IpLocation mIpLocation;
    public boolean mIsDefaultBackground;
    public KnockedInfo mKnockedInfo;
    public ProfileTemplateCard mLiveInfo;
    public String mMcnOrganization;
    public McnOrganizationDetail mMcnOrganizationDetail;
    public UserProfileMissUInfo mMissUInfo;
    public UserOperationEntranceGroup[] mOperationEntranceGroups;
    public ProfileEmptyTabInfo mProfileEmptyTabInfo;
    public ProfileTemplateCardInfo mProfileTemplateCardInfo;
    public String mRefreshSource;
    public int mSelectedTabId;
    public boolean mShowCreatorCenterRedDot;
    public boolean mShowDataAssistantEntrance;
    public List mTabList;
    public List mUserMiddleButtons;
    public static final long serialVersionUID = 0x3aa8d8eab8943305;

    public void UserProfileMeta(){
       super();
    }
    public static void register(){
       if (PatchProxy.applyVoid(null, null, UserProfileMeta.class, "1")) {
          return;
       }
       e uoe = new e(UserProfileMeta.class, "", "userProfileMeta");
       uoe.a(null);
       c.a.e(UserProfile.class, uoe);
       return;
    }
}
