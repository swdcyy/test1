package com.yxcorp.gifshow.profile.presenter.profile.header.template.ProfileTemplateCardGroupPresenter$c;
import erd.r;
import java.lang.Object;
import com.yxcorp.gifshow.model.response.UserProfileResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.profile.util.a;
import com.yxcorp.gifshow.profile.util.a$a;

public final class ProfileTemplateCardGroupPresenter$c implements r	// class@00153b
{
    public static final ProfileTemplateCardGroupPresenter$c b;

    static {
       ProfileTemplateCardGroupPresenter$c.b = new ProfileTemplateCardGroupPresenter$c();
    }
    public void ProfileTemplateCardGroupPresenter$c(){
       super();
    }
    public boolean test(Object p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, ProfileTemplateCardGroupPresenter$c.class, "1");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          a.p(p0, "response");
          b = a.e.c(p0) ^ 0x01;
       }
       return b;
    }
}
