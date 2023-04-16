package com.kuaishou.tuna_profile_header.ProfilePhoneLabelPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.tuna_profile_header.ProfilePhoneLabelPresenter$a;
import nsd.u;
import n15.h;
import com.kuaishou.tuna_profile_header.ProfilePhoneLabelPresenter$mProfileRoleTagInterceptor$1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.List;
import com.kwai.framework.model.user.User;

public final class ProfilePhoneLabelPresenter extends PresenterV2	// class@001177
{
    public final h p;
    public List q;
    public User r;
    public final d s;
    public static final ProfilePhoneLabelPresenter$a t;

    static {
       ProfilePhoneLabelPresenter.t = new ProfilePhoneLabelPresenter$a(null);
    }
    public void ProfilePhoneLabelPresenter(){
       super();
       this.p = new h();
       this.s = new ProfilePhoneLabelPresenter$mProfileRoleTagInterceptor$1(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, ProfilePhoneLabelPresenter.class, "4")) {
          return;
       }
       ProfilePhoneLabelPresenter tq = this.q;
       if (tq == null) {
          a.S("mProfileRoleTagInterceptors");
       }
       tq.add(this.s);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, ProfilePhoneLabelPresenter.class, "5")) {
          return;
       }
       ProfilePhoneLabelPresenter tq = this.q;
       if (tq == null) {
          a.S("mProfileRoleTagInterceptors");
       }
       tq.remove(this.s);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, ProfilePhoneLabelPresenter.class, "1")) {
          return;
       }
       Object obj = this.r8("PROFILE_ROLE_TAG_INTERCEPTOR");
       a.o(obj, "inject\(ProfileCommonAcce¡­ILE_ROLE_TAG_INTERCEPTOR\)");
       this.q = obj;
       this.r = this.s8(User.class);
       return;
    }
}
