package com.kuaishou.tuna_profile_header.ProfileLinkRoleLabelPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.tuna_profile_header.ProfileLinkRoleLabelPresenter$a;
import nsd.u;
import n15.h;
import com.kuaishou.tuna_profile_header.ProfileLinkRoleLabelPresenter$mProfileRoleTagInterceptor$1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.List;

public final class ProfileLinkRoleLabelPresenter extends PresenterV2	// class@001173
{
    public List p;
    public final h q;
    public final d r;
    public static final ProfileLinkRoleLabelPresenter$a s;

    static {
       ProfileLinkRoleLabelPresenter.s = new ProfileLinkRoleLabelPresenter$a(null);
    }
    public void ProfileLinkRoleLabelPresenter(){
       super();
       this.q = new h();
       this.r = new ProfileLinkRoleLabelPresenter$mProfileRoleTagInterceptor$1(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, ProfileLinkRoleLabelPresenter.class, "4")) {
          return;
       }
       ProfileLinkRoleLabelPresenter tp = this.p;
       if (tp == null) {
          a.S("mProfileRoleTagInterceptors");
       }
       tp.add(this.r);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, ProfileLinkRoleLabelPresenter.class, "5")) {
          return;
       }
       ProfileLinkRoleLabelPresenter tp = this.p;
       if (tp == null) {
          a.S("mProfileRoleTagInterceptors");
       }
       tp.remove(this.r);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, ProfileLinkRoleLabelPresenter.class, "1")) {
          return;
       }
       Object obj = this.r8("PROFILE_ROLE_TAG_INTERCEPTOR");
       a.o(obj, "inject\(ProfileCommonAcce¡­ILE_ROLE_TAG_INTERCEPTOR\)");
       this.p = obj;
       return;
    }
}
