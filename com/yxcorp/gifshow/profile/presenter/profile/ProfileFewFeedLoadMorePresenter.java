package com.yxcorp.gifshow.profile.presenter.profile.ProfileFewFeedLoadMorePresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.profile.presenter.profile.ProfileFewFeedLoadMorePresenter$a;
import nsd.u;
import com.yxcorp.gifshow.profile.presenter.profile.ProfileFewFeedLoadMorePresenter$mObserver$2;
import msd.a;
import qrd.p;
import qrd.s;
import qvb.f;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.feature.api.social.profile.model.ProfileParam;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.profile.presenter.profile.ProfileFewFeedLoadMorePresenter$mObserver$2$a;
import qvb.q;
import qvb.a;
import crd.b;
import lnc.b9;
import com.kwai.robust.PatchProxyResult;

public final class ProfileFewFeedLoadMorePresenter extends PresenterV2	// class@001457
{
    public final p p;
    public b q;
    public f r;
    public ProfileParam s;
    public static final ProfileFewFeedLoadMorePresenter$a t;

    static {
       ProfileFewFeedLoadMorePresenter.t = new ProfileFewFeedLoadMorePresenter$a(null);
    }
    public void ProfileFewFeedLoadMorePresenter(){
       super();
       this.p = s.c(new ProfileFewFeedLoadMorePresenter$mObserver$2(this));
    }
    public static final f P8(ProfileFewFeedLoadMorePresenter p0){
       p0 = p0.r;
       if (p0 == null) {
          a.S("mPageList");
       }
       return p0;
    }
    public static final ProfileParam R8(ProfileFewFeedLoadMorePresenter p0){
       p0 = p0.s;
       if (p0 == null) {
          a.S("mParam");
       }
       return p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, ProfileFewFeedLoadMorePresenter.class, "3")) {
          return;
       }
       ProfileFewFeedLoadMorePresenter tr = this.r;
       if (tr == null) {
          a.S("mPageList");
       }
       tr.h(this.S8());
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, ProfileFewFeedLoadMorePresenter.class, "4")) {
          return;
       }
       ProfileFewFeedLoadMorePresenter tr = this.r;
       if (tr == null) {
          a.S("mPageList");
       }
       tr.f(this.S8());
       b9.a(this.q);
       return;
    }
    public final ProfileFewFeedLoadMorePresenter$mObserver$2$a S8(){
       Object obj = PatchProxy.apply(null, this, ProfileFewFeedLoadMorePresenter.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.p.getValue();
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, ProfileFewFeedLoadMorePresenter.class, "2")) {
          return;
       }
       Object obj = this.r8("PAGE_LIST");
       a.o(obj, "inject\(PageAccessIds.PAGE_LIST\)");
       this.r = obj;
       obj = this.q8(ProfileParam.class);
       a.o(obj, "inject\(ProfileParam::class.java\)");
       this.s = obj;
       return;
    }
}
