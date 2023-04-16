package com.yxcorp.gifshow.ad.detail.presenter.side.BaseFeatureFollowPresenter$c;
import erd.g;
import com.yxcorp.gifshow.ad.detail.presenter.side.BaseFeatureFollowPresenter;
import java.lang.Object;
import vq4.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import vq4.d;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.user.User;
import lnc.o5;

public final class BaseFeatureFollowPresenter$c implements g	// class@00168b
{
    public final int b;
    public final BaseFeatureFollowPresenter c;

    public void BaseFeatureFollowPresenter$c(int p0,BaseFeatureFollowPresenter p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, BaseFeatureFollowPresenter$c.class, "1")) {
       }else {
          a.p(p0, "clientAdLog");
          p0.F.p0 = this.b;
          User user = this.c.getPhoto().getUser();
          a.o(user, "getPhoto\(\).user");
          p0.V = o5.c(user.getId());
          PatchProxy.onMethodExit(BaseFeatureFollowPresenter$c.class, "1");
       }
       return;
    }
}
