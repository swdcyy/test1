package com.yxcorp.gifshow.profile.presenter.profile.ProfileFewFeedLoadMorePresenter$mObserver$2$a;
import qvb.q;
import com.yxcorp.gifshow.profile.presenter.profile.ProfileFewFeedLoadMorePresenter$mObserver$2;
import java.lang.Object;
import java.lang.Throwable;
import qvb.p;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.yxcorp.gifshow.profile.presenter.profile.ProfileFewFeedLoadMorePresenter;
import qvb.f;
import qvb.a;
import qvb.n0;
import com.kwai.feature.api.social.profile.model.ProfileParam;
import com.kwai.framework.model.user.User;
import com.kwai.framework.model.user.UserProfile;
import z5c.d3;
import crd.b;
import lnc.b9;
import java.util.concurrent.TimeUnit;
import t45.d;
import brd.z;
import brd.t;
import com.yxcorp.gifshow.profile.presenter.profile.ProfileFewFeedLoadMorePresenter$mObserver$2$a$a;
import z5c.l0;
import erd.g;

public final class ProfileFewFeedLoadMorePresenter$mObserver$2$a implements q	// class@001455
{
    public final ProfileFewFeedLoadMorePresenter$mObserver$2 b;

    public void ProfileFewFeedLoadMorePresenter$mObserver$2$a(ProfileFewFeedLoadMorePresenter$mObserver$2 p0){
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
       p.c(this, p0);
    }
    public void v2(boolean p0,boolean p1){
       ProfileFewFeedLoadMorePresenter$mObserver$2$a omObserver$2 = ProfileFewFeedLoadMorePresenter$mObserver$2$a.class;
       if (PatchProxy.isSupport(omObserver$2) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, omObserver$2, "1")) {
          return;
       }
       if (ProfileFewFeedLoadMorePresenter.P8(this.b.this$0).getCount() < 12 && (ProfileFewFeedLoadMorePresenter.P8(this.b.this$0).hasMore() && !d3.d(ProfileFewFeedLoadMorePresenter.R8(this.b.this$0).mUser, ProfileFewFeedLoadMorePresenter.R8(this.b.this$0).mUserProfile))) {
          b9.a(this.b.this$0.q);
          p0.q = t.timer(200, TimeUnit.MILLISECONDS, d.c).observeOn(d.a).subscribe(new ProfileFewFeedLoadMorePresenter$mObserver$2$a$a(this), l0.a);
       }
    label_007b :
       return;
    }
}
