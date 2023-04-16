package com.kuaishou.tuna_profile_header.ProfilePhoneLabelPresenter$mProfileRoleTagInterceptor$1$clickTag$$inlined$let$lambda$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.tuna_profile_header.ProfilePhoneLabelPresenter$mProfileRoleTagInterceptor$1;
import java.lang.String;
import com.kwai.framework.model.tuna.button.TunaButtonModel;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import fg6.a;
import com.kwai.framework.model.tuna.button.PhoneInfoModel;
import com.google.gson.Gson;
import com.kuaishou.tuna_profile_header.ProfilePhoneLabelPresenter;
import com.kwai.framework.model.user.User;

public final class ProfilePhoneLabelPresenter$mProfileRoleTagInterceptor$1$clickTag$$inlined$let$lambda$1 extends Lambda implements l	// class@001175
{
    public final ProfilePhoneLabelPresenter$mProfileRoleTagInterceptor$1 this$0;

    public void ProfilePhoneLabelPresenter$mProfileRoleTagInterceptor$1$clickTag$$inlined$let$lambda$1(ProfilePhoneLabelPresenter$mProfileRoleTagInterceptor$1 p0){
       this.this$0 = p0;
       super(1);
    }
    public final TunaButtonModel invoke(String p0){
       ProfilePhoneLabelPresenter obj = PatchProxy.applyOneRefsWithListener(p0, this, ProfilePhoneLabelPresenter$mProfileRoleTagInterceptor$1$clickTag$$inlined$let$lambda$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "jsonStr");
       PhoneInfoModel phoneInfoMod = a.a.h(p0, PhoneInfoModel.class);
       obj = this.this$0.a.r;
       User mId = (obj != null)? obj.mId: null;
       phoneInfoMod.mUserId = mId;
       TunaButtonModel tunaButtonMo = TunaButtonModel.simplePhoneInfo(phoneInfoMod);
       a.o(tunaButtonMo, "TunaButtonModel.simplePhoneInfo\(tagModel\)");
       PatchProxy.onMethodExit(ProfilePhoneLabelPresenter$mProfileRoleTagInterceptor$1$clickTag$$inlined$let$lambda$1.class, "1");
       return tunaButtonMo;
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
}
