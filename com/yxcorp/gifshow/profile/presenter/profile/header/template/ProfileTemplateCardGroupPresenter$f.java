package com.yxcorp.gifshow.profile.presenter.profile.header.template.ProfileTemplateCardGroupPresenter$f;
import erd.g;
import com.yxcorp.gifshow.profile.presenter.profile.header.template.ProfileTemplateCardGroupPresenter;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import t3c.f;

public final class ProfileTemplateCardGroupPresenter$f implements g	// class@00153e
{
    public final ProfileTemplateCardGroupPresenter b;

    public void ProfileTemplateCardGroupPresenter$f(ProfileTemplateCardGroupPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfileTemplateCardGroupPresenter$f.class, "1")) {
       }else {
          p0 = this.b.x;
          if (p0 != null) {
             p0.f();
          }
       }
       return;
    }
}
