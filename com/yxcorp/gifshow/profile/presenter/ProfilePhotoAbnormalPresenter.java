package com.yxcorp.gifshow.profile.presenter.ProfilePhotoAbnormalPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.profile.presenter.ProfilePhotoAbnormalPresenter$mOnModifyPageItemsFromResponseListener$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kwai.feature.api.social.profile.model.ProfileParam;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import qvb.f$c;
import qvb.f;

public final class ProfilePhotoAbnormalPresenter extends PresenterV2	// class@00143f
{
    public ProfileParam p;
    public f q;
    public final p r;

    public void ProfilePhotoAbnormalPresenter(){
       super();
       this.r = s.c(new ProfilePhotoAbnormalPresenter$mOnModifyPageItemsFromResponseListener$2(this));
    }
    public static final ProfileParam P8(ProfilePhotoAbnormalPresenter p0){
       p0 = p0.p;
       if (p0 == null) {
          a.S("mParam");
       }
       return p0;
    }
    public void E8(){
       ProfilePhotoAbnormalPresenter profilePhoto = ProfilePhotoAbnormalPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, profilePhoto, "3")) {
          return;
       }
       ProfilePhotoAbnormalPresenter tq = this.q;
       if (tq == null) {
          a.S("mPageList");
       }
       f$c uoc = PatchProxy.apply(objArray, this, profilePhoto, "1");
       if (uoc == PatchProxyResult.class) {
          uoc = this.r.getValue();
       }
       tq.f2(uoc);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, ProfilePhotoAbnormalPresenter.class, "4")) {
          return;
       }
       ProfilePhotoAbnormalPresenter tq = this.q;
       if (tq == null) {
          a.S("mPageList");
       }
       tq.f2(null);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, ProfilePhotoAbnormalPresenter.class, "2")) {
          return;
       }
       Object obj = this.q8(ProfileParam.class);
       a.o(obj, "inject\(ProfileParam::class.java\)");
       this.p = obj;
       obj = this.r8("PAGE_LIST");
       a.o(obj, "inject\(AccessIds.PAGE_LIST\)");
       this.q = obj;
       return;
    }
}
