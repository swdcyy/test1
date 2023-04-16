package com.kwai.framework.model.user.StagFactorykskernelsframeworkmodel;
import zk.j;
import java.lang.Object;
import com.google.gson.Gson;
import el.a;
import com.google.gson.TypeAdapter;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.model.user.ProfileDynamicPendant;
import com.kwai.framework.model.user.ProfileDynamicPendant$TypeAdapter;
import com.kwai.framework.model.user.UserVerifiedDetail;
import com.kwai.framework.model.user.UserVerifiedDetail$TypeAdapter;
import com.kwai.framework.model.user.UserStatus;
import com.kwai.framework.model.user.UserStatus$TypeAdapter;
import com.kwai.framework.model.user.UserProfileMissUInfo;
import com.kwai.framework.model.user.UserProfileMissUInfo$TypeAdapter;
import com.kwai.framework.model.user.UserOwnerCount;
import com.kwai.framework.model.user.UserOwnerCount$TypeAdapter;
import com.kwai.framework.model.user.UserInfo;
import com.kwai.framework.model.user.UserInfo$TypeAdapter;
import com.kwai.framework.model.user.UserHeadIcon;
import com.kwai.framework.model.user.UserHeadIcon$TypeAdapter;
import com.kwai.framework.model.user.UserExtraInfo$RoleInfo;
import com.kwai.framework.model.user.UserExtraInfo$RoleInfo$TypeAdapter;
import com.kwai.framework.model.user.UserExtraInfo$Truncate;
import com.kwai.framework.model.user.UserExtraInfo$Truncate$TypeAdapter;
import com.kwai.framework.model.user.UserExtraInfo$TextColor;
import com.kwai.framework.model.user.UserExtraInfo$TextColor$TypeAdapter;
import com.kwai.framework.model.user.UserExtraInfo$UserInfoExposed;
import com.kwai.framework.model.user.UserExtraInfo$UserInfoExposed$TypeAdapter;
import com.kwai.framework.model.user.UserExtraInfo$LiveUserInfo;
import com.kwai.framework.model.user.UserExtraInfo$LiveUserInfo$TypeAdapter;
import com.kwai.framework.model.user.UserExtraInfo;
import com.kwai.framework.model.user.UserExtraInfo$TypeAdapter;
import com.kwai.framework.model.user.UserCommonPoint;
import com.kwai.framework.model.user.UserCommonPoint$TypeAdapter;
import com.kwai.framework.model.user.User;
import com.kwai.framework.model.user.User$TypeAdapter;
import com.kwai.framework.model.user.Status;
import com.kwai.framework.model.user.Status$TypeAdapter;
import com.kwai.framework.model.user.RichTextMeta$Param;
import com.kwai.framework.model.user.RichTextMeta$Param$TypeAdapter;
import com.kwai.framework.model.user.RichTextMeta;
import com.kwai.framework.model.user.RichTextMeta$TypeAdapter;
import com.kwai.framework.model.user.QUserContactName;
import com.kwai.framework.model.user.QUserContactName$TypeAdapter;
import com.kwai.framework.model.user.ProfileTabModel$AdBusinessTabInfo;
import com.kwai.framework.model.user.ProfileTabModel$AdBusinessTabInfo$TypeAdapter;
import com.kwai.framework.model.user.ProfileTabModel;
import com.kwai.framework.model.user.ProfileTabModel$TypeAdapter;
import com.kwai.framework.model.user.NewRecommendStyleInfo;
import com.kwai.framework.model.user.NewRecommendStyleInfo$TypeAdapter;

public final class StagFactorykskernelsframeworkmodel implements j	// class@00172a
{

    public void StagFactorykskernelsframeworkmodel(){
       super();
    }
    public TypeAdapter a(Gson p0,a p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, StagFactorykskernelsframeworkmodel.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Class rawType = p1.getRawType();
       if (rawType == ProfileDynamicPendant.class) {
          return new ProfileDynamicPendant$TypeAdapter(p0);
       }
       if (rawType == UserVerifiedDetail.class) {
          return new UserVerifiedDetail$TypeAdapter(p0);
       }
       if (rawType == UserStatus.class) {
          return new UserStatus$TypeAdapter(p0);
       }
       if (rawType == UserProfileMissUInfo.class) {
          return new UserProfileMissUInfo$TypeAdapter(p0);
       }
       if (rawType == UserOwnerCount.class) {
          return new UserOwnerCount$TypeAdapter(p0);
       }
       if (rawType == UserInfo.class) {
          return new UserInfo$TypeAdapter(p0);
       }
       if (rawType == UserHeadIcon.class) {
          return new UserHeadIcon$TypeAdapter(p0);
       }
       if (rawType == UserExtraInfo$RoleInfo.class) {
          return new UserExtraInfo$RoleInfo$TypeAdapter(p0);
       }
       if (rawType == UserExtraInfo$Truncate.class) {
          return new UserExtraInfo$Truncate$TypeAdapter(p0);
       }
       if (rawType == UserExtraInfo$TextColor.class) {
          return new UserExtraInfo$TextColor$TypeAdapter(p0);
       }
       if (rawType == UserExtraInfo$UserInfoExposed.class) {
          return new UserExtraInfo$UserInfoExposed$TypeAdapter(p0);
       }
       if (rawType == UserExtraInfo$LiveUserInfo.class) {
          return new UserExtraInfo$LiveUserInfo$TypeAdapter(p0);
       }
       if (rawType == UserExtraInfo.class) {
          return new UserExtraInfo$TypeAdapter(p0);
       }
       if (rawType == UserCommonPoint.class) {
          return new UserCommonPoint$TypeAdapter(p0);
       }
       if (rawType == User.class) {
          return new User$TypeAdapter(p0);
       }
       if (rawType == Status.class) {
          return new Status$TypeAdapter(p0);
       }
       if (rawType == RichTextMeta$Param.class) {
          return new RichTextMeta$Param$TypeAdapter(p0);
       }
       if (rawType == RichTextMeta.class) {
          return new RichTextMeta$TypeAdapter(p0);
       }
       if (rawType == QUserContactName.class) {
          return new QUserContactName$TypeAdapter(p0);
       }
       if (rawType == ProfileTabModel$AdBusinessTabInfo.class) {
          return new ProfileTabModel$AdBusinessTabInfo$TypeAdapter(p0);
       }
       if (rawType == ProfileTabModel.class) {
          return new ProfileTabModel$TypeAdapter(p0);
       }
       if (rawType == NewRecommendStyleInfo.class) {
          return new NewRecommendStyleInfo$TypeAdapter(p0);
       }
       return null;
    }
}
