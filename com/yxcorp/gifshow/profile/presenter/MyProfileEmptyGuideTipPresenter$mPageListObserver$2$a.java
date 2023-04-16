package com.yxcorp.gifshow.profile.presenter.MyProfileEmptyGuideTipPresenter$mPageListObserver$2$a;
import qvb.q;
import com.yxcorp.gifshow.profile.presenter.MyProfileEmptyGuideTipPresenter$mPageListObserver$2;
import java.lang.Object;
import java.lang.Throwable;
import qvb.p;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.yxcorp.gifshow.profile.presenter.MyProfileEmptyGuideTipPresenter;
import com.yxcorp.gifshow.profile.util.ProfilePostEmptyCardUtils;
import java.lang.StringBuilder;
import z5c.l3;
import com.kwai.feature.api.social.profile.model.ProfileParam;
import com.yxcorp.gifshow.model.response.UserProfileResponse;
import java.lang.ref.WeakReference;
import nsd.u;

public final class MyProfileEmptyGuideTipPresenter$mPageListObserver$2$a implements q	// class@001412
{
    public final MyProfileEmptyGuideTipPresenter$mPageListObserver$2 b;

    public void MyProfileEmptyGuideTipPresenter$mPageListObserver$2$a(MyProfileEmptyGuideTipPresenter$mPageListObserver$2 p0){
       this.b = p0;
       super();
    }
    public void M1(boolean p0,Throwable p1){
       p.a(this, p0, p1);
    }
    public void Z1(boolean p0,boolean p1){
       p.d(this, p0, p1);
    }
    public boolean rg(){
       return p.e(this);
    }
    public void t5(boolean p0){
       MyProfileEmptyGuideTipPresenter$mPageListObserver$2$a omPageListOb = MyProfileEmptyGuideTipPresenter$mPageListObserver$2$a.class;
       if (PatchProxy.isSupport(omPageListOb) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, omPageListOb, "2")) {
          return;
       }
       p0 = this.b.this$0.S8();
       ProfilePostEmptyCardUtils.e.i("MyProfileEmptyGuideTipPresenter", "onPageListDataModified, isShowSuccess: "+p0);
       if (!p0) {
          MyProfileEmptyGuideTipPresenter$mPageListObserver$2 this$0 = this.b.this$0;
          l3 ol3 = new l3(1, this$0.a9().mUserProfileResponse, null, false, false, 28, null);
          this$0.e9(v8);
       }
       return;
    }
    public void v2(boolean p0,boolean p1){
       MyProfileEmptyGuideTipPresenter$mPageListObserver$2$a omPageListOb = MyProfileEmptyGuideTipPresenter$mPageListObserver$2$a.class;
       if (PatchProxy.isSupport(omPageListOb) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, omPageListOb, "1")) {
          return;
       }
       p0 = this.b.this$0.S8();
       ProfilePostEmptyCardUtils.e.i("MyProfileEmptyGuideTipPresenter", "onFinishLoading, isShowSuccess: "+p0);
       if (!p0) {
          MyProfileEmptyGuideTipPresenter$mPageListObserver$2 this$0 = this.b.this$0;
          l3 ol3 = new l3(0, this$0.a9().mUserProfileResponse, null, false, false, 28, null);
          this$0.e9(ProfilePostEmptyCardUtils.e);
       }
       return;
    }
}
