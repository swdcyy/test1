package com.kuaishou.tuna_profile_header.ProfileLinkRoleLabelPresenter$mProfileRoleTagInterceptor$1;
import t2c.d;
import com.kuaishou.tuna_profile_header.ProfileLinkRoleLabelPresenter;
import java.lang.Object;
import com.yxcorp.gifshow.profile.common.model.TagLabel;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.framework.model.user.AdBusinessInfo$ProfileLinkModel;
import java.util.Objects;
import n15.h;
import java.io.Serializable;
import fg6.a;
import com.google.gson.Gson;
import com.kuaishou.tuna_logger.KsLogTunaProfileTag;
import java.util.List;
import com.kuaishou.tuna_profile_header.ProfileLinkRoleLabelPresenter$mProfileRoleTagInterceptor$1$clickTag$1;
import msd.a;
import c15.b;
import com.kuaishou.client.log.content.packages.nano.ClientContent$CustomV2;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.tuna_core.button.TunaButton;
import com.kwai.framework.model.tuna.button.TunaButtonModel;
import com.kuaishou.tuna_core.button.TunaButton$Companion;
import g05.b;
import com.kuaishou.tuna_profile_header.ProfileLinkRoleLabelPresenter$mProfileRoleTagInterceptor$1$$special$$inlined$let$lambda$1;
import msd.l;
import g05.b$a;
import t2c.d$a;

public final class ProfileLinkRoleLabelPresenter$mProfileRoleTagInterceptor$1 implements d	// class@001172
{
    public final ProfileLinkRoleLabelPresenter a;

    public void ProfileLinkRoleLabelPresenter$mProfileRoleTagInterceptor$1(ProfileLinkRoleLabelPresenter p0){
       this.a = p0;
       super();
    }
    public boolean a(TagLabel p0,int p1){
       TagLabel obj;
       h oh;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       ProfileLinkRoleLabelPresenter$mProfileRoleTagInterceptor$1 omProfileRol = ProfileLinkRoleLabelPresenter$mProfileRoleTagInterceptor$1.class;
       String str = "1";
       if (PatchProxy.isSupport(omProfileRol)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, omProfileRol, str);
          if (obj != patchProxyRe) {
             return obj.booleanValue();
          }
       }
       a.p(p0, "tagLabel");
       if (TextUtils.n(p0.mLabelType, "role_adbusinesslink")) {
          obj = p0.mExtraInfo;
          if (obj != null) {
             try{
                ProfileLinkRoleLabelPresenter q = this.a.q;
                Objects.requireNonNull(q);
                oh = PatchProxy.applyTwoRefs(obj, AdBusinessInfo$ProfileLinkModel.class, q, h.class, str);
                if (oh != patchProxyRe) {
                }else {
                   a.p(obj, "jsonStr");
                   a.p(AdBusinessInfo$ProfileLinkModel.class, "clazz");
                   if (a.g(q.b, obj) ^ true) {
                      q.a = a.a.h(obj, AdBusinessInfo$ProfileLinkModel.class);
                      q.b = obj;
                   }
                   oh = q.a;
                }
             }catch(java.lang.Exception e0){
             }
          }else {
             oh = null;
          }
          if (oh == null) {
             b.d(KsLogTunaProfileTag.PROFILE_HEADER.appendTag("ProfileLinkRoleLabelPresenter"), new ProfileLinkRoleLabelPresenter$mProfileRoleTagInterceptor$1$clickTag$1(p0));
             return false;
          }else {
             ClientContent$CustomV2 uCustomV2 = new ClientContent$CustomV2();
             uCustomV2.index = String.valueOf(p1);
             uCustomV2.conversionId = oh.mId;
             Activity activity = this.a.getActivity();
             if (activity != null) {
                AdBusinessInfo$ProfileLinkModel mAction = oh.mAction;
                if (mAction != null) {
                   TunaButton.a.c(activity, mAction);
                   b.a.a("CLICK_BUSINESS_PROFILE_LINK", new ProfileLinkRoleLabelPresenter$mProfileRoleTagInterceptor$1$$special$$inlined$let$lambda$1(activity, oh, uCustomV2));
                }
             }
             return true;
          }
       }else {
          return false;
       }
    }
    public String b(TagLabel p0,int p1,d$a p2){
       if (PatchProxy.isSupport(ProfileLinkRoleLabelPresenter$mProfileRoleTagInterceptor$1.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, this, ProfileLinkRoleLabelPresenter$mProfileRoleTagInterceptor$1.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "tagLabel");
       a.p(p2, "changeCallback");
       return null;
    }
}
