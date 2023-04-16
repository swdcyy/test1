package com.yxcorp.gifshow.ad.detail.presenter.side.BaseFeatureFollowPresenter$b;
import n3d.a;
import com.yxcorp.gifshow.ad.detail.presenter.side.BaseFeatureFollowPresenter;
import java.lang.Object;
import android.content.Intent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.framework.model.user.QCurrentUser;
import kotlin.jvm.internal.a;

public final class BaseFeatureFollowPresenter$b implements a	// class@00168a
{
    public final BaseFeatureFollowPresenter b;

    public void BaseFeatureFollowPresenter$b(BaseFeatureFollowPresenter p0){
       this.b = p0;
       super();
    }
    public final void onActivityCallback(int p0,int p1,Intent p2){
       if (PatchProxy.isSupport2(BaseFeatureFollowPresenter$b.class, "1") && PatchProxy.applyVoidThreeRefsWithListener(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, BaseFeatureFollowPresenter$b.class, "1")) {
          return;
       }
       QCurrentUser qCurrentUser = QCurrentUser.me();
       a.o(qCurrentUser, "QCurrentUser.me\(\)");
       if (qCurrentUser.isLogined()) {
          this.b.V8();
          this.b.R8();
       }
       PatchProxy.onMethodExit(BaseFeatureFollowPresenter$b.class, "1");
       return;
    }
}
