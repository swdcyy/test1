package com.yxcorp.gifshow.profile.presenter.profile.header.template.ProfileTemplateCardGroupPresenter$b;
import java.lang.Runnable;
import com.yxcorp.gifshow.profile.presenter.profile.header.template.ProfileTemplateCardGroupPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import s1c.a1;
import com.yxcorp.gifshow.profile.state.ProfileRefreshStatus;

public final class ProfileTemplateCardGroupPresenter$b implements Runnable	// class@00153a
{
    public final ProfileTemplateCardGroupPresenter b;

    public void ProfileTemplateCardGroupPresenter$b(ProfileTemplateCardGroupPresenter p0){
       this.b = p0;
       super();
    }
    public final void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ProfileTemplateCardGroupPresenter$b.class, "1")) {
          return;
       }
       ProfileTemplateCardGroupPresenter p = this.b.p;
       if (p == null) {
          a.S("mFragment");
       }
       if (p instanceof a1) {
          objArray = p;
       }
       if (objArray != null) {
          objArray.w5(ProfileRefreshStatus.PROFILE);
       }
       return;
    }
}
