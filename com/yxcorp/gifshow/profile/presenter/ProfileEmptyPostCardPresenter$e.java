package com.yxcorp.gifshow.profile.presenter.ProfileEmptyPostCardPresenter$e;
import erd.g;
import com.yxcorp.gifshow.profile.presenter.ProfileEmptyPostCardPresenter;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import z5c.l3;

public final class ProfileEmptyPostCardPresenter$e implements g	// class@001439
{
    public final ProfileEmptyPostCardPresenter b;

    public void ProfileEmptyPostCardPresenter$e(ProfileEmptyPostCardPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfileEmptyPostCardPresenter$e.class, "1")) {
       }else {
          l3 ol3 = null;
          p0 = (p0 != null)? p0.get("MAIN_KEY"): ol3;
          if (p0 instanceof l3) {
             ol3 = p0;
          }
          if (ol3 != null) {
             this.b.S8(ol3);
          }
       }
       return;
    }
}
