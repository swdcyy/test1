package com.yxcorp.gifshow.profile.presenter.profile.header.head.avatar.ProfileHeaderStatusPresenter$g;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.profile.status.log.KsLogProfileStatusTag;
import java.util.List;
import v2c.e;
import v2c.g;

public final class ProfileHeaderStatusPresenter$g implements g	// class@0014d8
{
    public static final ProfileHeaderStatusPresenter$g b;

    static {
       ProfileHeaderStatusPresenter$g.b = new ProfileHeaderStatusPresenter$g();
    }
    public void ProfileHeaderStatusPresenter$g(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfileHeaderStatusPresenter$g.class, "1")) {
       }else {
          g.d(KsLogProfileStatusTag.STATUS_PUBLISH.appendTag("ProfileHeaderStatusPresenter"), "get plugin error", p0);
       }
       return;
    }
}
