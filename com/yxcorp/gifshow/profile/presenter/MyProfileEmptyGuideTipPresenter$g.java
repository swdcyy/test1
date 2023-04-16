package com.yxcorp.gifshow.profile.presenter.MyProfileEmptyGuideTipPresenter$g;
import erd.g;
import com.yxcorp.gifshow.profile.presenter.MyProfileEmptyGuideTipPresenter;
import java.lang.Object;
import com.yxcorp.gifshow.model.response.UserProfileResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.profile.util.ProfilePostEmptyCardUtils;
import java.lang.StringBuilder;
import z5c.l3;
import java.lang.ref.WeakReference;
import nsd.u;

public final class MyProfileEmptyGuideTipPresenter$g implements g	// class@00140d
{
    public final MyProfileEmptyGuideTipPresenter b;

    public void MyProfileEmptyGuideTipPresenter$g(MyProfileEmptyGuideTipPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       Object obj = p0;
       if (PatchProxy.applyVoidOneRefs(obj, this, MyProfileEmptyGuideTipPresenter$g.class, "1")) {
       }else {
          a.o(obj, "it");
          boolean b = this.b.k9(obj);
          ProfilePostEmptyCardUtils.e.i("MyProfileEmptyGuideTipPresenter", "updateGuideData, isShowSuccess: "+b);
          if (!b) {
             l3 ol3 = new l3(2, obj, null, false, false, 28, null);
             this.b.e9(v8);
          }
       }
       return;
    }
}
