package com.yxcorp.gifshow.profile.presenter.MyProfileEmptyGuideTipPresenter$b;
import java.lang.Runnable;
import com.yxcorp.gifshow.profile.presenter.MyProfileEmptyGuideTipPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.kwai.feature.api.social.profile.model.ProfileParam;
import com.kwai.framework.model.user.User;
import z5c.y1;
import k2b.f3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import z5c.b0;
import k2b.e0;

public final class MyProfileEmptyGuideTipPresenter$b implements Runnable	// class@001408
{
    public final MyProfileEmptyGuideTipPresenter b;

    public void MyProfileEmptyGuideTipPresenter$b(MyProfileEmptyGuideTipPresenter p0){
       this.b = p0;
       super();
    }
    public final void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoidWithListener(objArray, this, MyProfileEmptyGuideTipPresenter$b.class, "1")) {
          return;
       }
       RecyclerFragment recyclerFrag = this.b.X8();
       User mId = this.b.a9().mUser.mId;
       if (!PatchProxy.applyVoidTwoRefs(recyclerFrag, mId, objArray, y1.class, "127")) {
          f3 uof3 = f3.l("3690315", "CLOSE_BUTTON");
          uof3.b(b0.g(mId));
          uof3.h(recyclerFrag);
       }
       PatchProxy.onMethodExit(MyProfileEmptyGuideTipPresenter$b.class, "1");
       return;
    }
}
