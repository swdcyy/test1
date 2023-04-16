package com.yxcorp.gifshow.profile.common.model.UserProfileCommonMeta;
import java.io.Serializable;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import fa6.c;
import com.kwai.framework.model.user.UserProfile;
import fa6.e;
import fa6.b;

public class UserProfileCommonMeta implements Serializable	// class@0012e1
{
    public AdBusinessInfo mAdBusinessInfo;
    public boolean mCanGuestShowMomentNews;
    public List mCollectTabs;
    public boolean mIsDefaultName;
    public ProfilePendant mProfilePendant;
    public ProfileStatusInfo mProfileStatusInfo;
    public UserCollectCount mUserCollectCount;
    public static final long serialVersionUID = 0xf1b582f1bca333b0;

    public void UserProfileCommonMeta(){
       super();
       this.mCollectTabs = new ArrayList();
       this.mCanGuestShowMomentNews = true;
    }
    public static void register(){
       if (PatchProxy.applyVoid(null, null, UserProfileCommonMeta.class, "1")) {
          return;
       }
       e uoe = new e(UserProfileCommonMeta.class, "", "userProfileCommonMeta");
       uoe.a(null);
       c.a.e(UserProfile.class, uoe);
       return;
    }
}
