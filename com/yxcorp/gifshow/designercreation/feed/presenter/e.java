package com.yxcorp.gifshow.designercreation.feed.presenter.e;
import erd.g;
import com.yxcorp.gifshow.designercreation.feed.presenter.ProfileCreationScrollSizePresenter$p;
import java.lang.Object;
import u2c.d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import s1c.a;
import com.yxcorp.gifshow.designercreation.feed.presenter.ProfileCreationScrollSizePresenter;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.profile.common.event.RxPageBus;

public final class e implements g	// class@0012f9
{
    public final ProfileCreationScrollSizePresenter$p b;

    public void e(ProfileCreationScrollSizePresenter$p p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
       }else {
          a uoa = this.b.b.S8();
          a.m(uoa);
          uoa.d.b("PROFILE_SCROLL_SIZE", "MAIN_KEY", p0);
       }
       return;
    }
}
