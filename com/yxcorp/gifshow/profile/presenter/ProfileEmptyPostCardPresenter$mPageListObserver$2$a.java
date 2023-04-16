package com.yxcorp.gifshow.profile.presenter.ProfileEmptyPostCardPresenter$mPageListObserver$2$a;
import qvb.q;
import com.yxcorp.gifshow.profile.presenter.ProfileEmptyPostCardPresenter$mPageListObserver$2;
import java.lang.Object;
import java.lang.Throwable;
import qvb.p;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.yxcorp.gifshow.profile.util.ProfilePostEmptyCardUtils;
import z5c.l3;
import com.kwai.feature.api.social.profile.model.ProfileParam;
import com.yxcorp.gifshow.profile.presenter.ProfileEmptyPostCardPresenter;
import com.yxcorp.gifshow.model.response.UserProfileResponse;
import java.lang.ref.WeakReference;
import nsd.u;

public final class ProfileEmptyPostCardPresenter$mPageListObserver$2$a implements q	// class@00143a
{
    public final ProfileEmptyPostCardPresenter$mPageListObserver$2 b;

    public void ProfileEmptyPostCardPresenter$mPageListObserver$2$a(ProfileEmptyPostCardPresenter$mPageListObserver$2 p0){
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
       ProfileEmptyPostCardPresenter$mPageListObserver$2$a omPageListOb = ProfileEmptyPostCardPresenter$mPageListObserver$2$a.class;
       if (PatchProxy.isSupport(omPageListOb) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, omPageListOb, "2")) {
          return;
       }
       ProfilePostEmptyCardUtils.e.i("ProfileEmptyPostCardPresenter", "PAGE_LIST_DATA_MODIFIED");
       ProfileEmptyPostCardPresenter$mPageListObserver$2 this$0 = this.b.this$0;
       l3 ol3 = new l3(1, this$0.R8().mUserProfileResponse, null, false, false, 28, null);
       this$0.V8(v8);
       return;
    }
    public void v2(boolean p0,boolean p1){
       ProfileEmptyPostCardPresenter$mPageListObserver$2$a omPageListOb = ProfileEmptyPostCardPresenter$mPageListObserver$2$a.class;
       if (PatchProxy.isSupport(omPageListOb) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, omPageListOb, "1")) {
          return;
       }
       ProfilePostEmptyCardUtils.e.i("ProfileEmptyPostCardPresenter", "PAGE_LIST_FINISH_LOADING");
       ProfileEmptyPostCardPresenter$mPageListObserver$2 this$0 = this.b.this$0;
       l3 ol3 = new l3(0, this$0.R8().mUserProfileResponse, null, false, false, 28, null);
       this$0.V8("ProfileEmptyPostCardPresenter");
       return;
    }
}
