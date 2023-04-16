package com.yxcorp.gifshow.profile.model.response.UserProfileResponseMeta;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import fa6.c;
import com.yxcorp.gifshow.model.response.UserProfileResponse;
import fa6.e;
import fa6.b;

public class UserProfileResponseMeta implements Serializable	// class@0013f1
{
    public ActivityUserIconModel mActivityUserIconMode;
    public ProfileDialogInfo mDialogInfo;
    public List mProfileEmptyUserGuideInfoList;
    public ProfileEmptyPhotoGuideInfo mProfileNoPhotoGuideInfo;
    public List mProfilePostRecoTipList;
    public ProfileTemplateCardInfo mProfileTemplateCardInfo;
    public ProfileTips mProfileTips;
    public ProfileTotalPhotoLikeInfo mProfileTotalPhotoLikeInfo;
    public boolean mShowTorchIcon;
    public UserProfileLog mUserProfileLog;
    public static final long serialVersionUID = 0x6fd5989d74db31a6;

    public void UserProfileResponseMeta(){
       super();
    }
    public static void register(){
       if (PatchProxy.applyVoid(null, null, UserProfileResponseMeta.class, "1")) {
          return;
       }
       e uoe = new e(UserProfileResponseMeta.class, "", "userProfileResponseMeta");
       uoe.a(null);
       c.a.e(UserProfileResponse.class, uoe);
       return;
    }
}
