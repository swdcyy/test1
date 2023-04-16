package com.kuaishou.tuna_profile_header.ProfilePhoneLabelPresenter$mProfileRoleTagInterceptor$1;
import t2c.d;
import com.kuaishou.tuna_profile_header.ProfilePhoneLabelPresenter;
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
import com.kuaishou.tuna_profile_header.ProfilePhoneLabelPresenter$mProfileRoleTagInterceptor$1$clickTag$$inlined$let$lambda$1;
import java.util.Objects;
import n15.h;
import java.io.Serializable;
import msd.l;
import com.kwai.framework.model.tuna.button.TunaButtonModel;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.tuna_core.button.TunaButton;
import com.kuaishou.tuna_core.button.TunaButton$Companion;
import t2c.d$a;
import t2c.c;

public final class ProfilePhoneLabelPresenter$mProfileRoleTagInterceptor$1 implements d	// class@001176
{
    public final ProfilePhoneLabelPresenter a;

    public void ProfilePhoneLabelPresenter$mProfileRoleTagInterceptor$1(ProfilePhoneLabelPresenter p0){
       this.a = p0;
       super();
    }
    public boolean a(TagLabel p0,int p1){
       ProfilePhoneLabelPresenter obj;
       h oh;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       ProfilePhoneLabelPresenter$mProfileRoleTagInterceptor$1 omProfileRol = ProfilePhoneLabelPresenter$mProfileRoleTagInterceptor$1.class;
       if (PatchProxy.isSupport(omProfileRol)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, omProfileRol, "1");
          if (obj != patchProxyRe) {
             return obj.booleanValue();
          }
       }
       a.p(p0, "tagLabel");
       if (TextUtils.n(p0.mLabelType, "role_adbusinesscall")) {
          p0 = p0.mExtraInfo;
          if (p0 != null) {
             try{
                obj = this.a.p;
                ProfilePhoneLabelPresenter$mProfileRoleTagInterceptor$1$clickTag$$inlined$let$lambda$1 omProfileRol1 = new ProfilePhoneLabelPresenter$mProfileRoleTagInterceptor$1$clickTag$$inlined$let$lambda$1(this);
                Objects.requireNonNull(obj);
                oh = PatchProxy.applyTwoRefs(p0, omProfileRol1, obj, h.class, "2");
                if (oh != patchProxyRe) {
                }else {
                   a.p(p0, "jsonStr");
                   a.p(omProfileRol1, "jsonDecoder");
                   if (a.g(obj.b, p0) ^ 0x01) {
                      obj.a = omProfileRol1.invoke(p0);
                      obj.b = p0;
                   }
                   oh = obj.a;
                }
             }catch(java.lang.Exception e0){
             }
             if (oh != null) {
                Activity activity = this.a.getActivity();
                if (activity != null) {
                   TunaButton.a.c(activity, oh);
                }
             }
          }
       }
       return false;
    }
    public String b(TagLabel p0,int p1,d$a p2){
       return c.a(this, p0, p1, p2);
    }
}
