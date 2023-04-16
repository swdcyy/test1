package com.yxcorp.gifshow.profile.fragment.PhotoFragmentItemType$PHOTO;
import com.yxcorp.gifshow.profile.fragment.PhotoFragmentItemType;
import java.lang.String;
import nsd.u;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import s1c.r0;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import y2c.o;
import com.yxcorp.gifshow.profile.presenter.ProfilePhotoAbnormalPresenter;
import com.yxcorp.gifshow.profile.presenter.profile.u;
import com.yxcorp.gifshow.profile.presenter.MyProfileNewEmptyGuideTipPresenter;
import com.yxcorp.gifshow.profile.presenter.MyProfileEmptyGuideTipPresenter;
import com.yxcorp.gifshow.profile.presenter.profile.w;
import y2c.a;
import z5c.k0;
import com.yxcorp.gifshow.profile.presenter.MyProfilePhotoEmptyUpdatePresenter;
import j4c.y;
import com.yxcorp.gifshow.profile.util.ProfilePostEmptyCardUtils;
import com.yxcorp.gifshow.profile.presenter.ProfileEmptyPostCardPresenter;
import com.yxcorp.gifshow.profile.presenter.profile.e0;
import x99.o;
import com.yxcorp.gifshow.profile.presenter.profile.header.recommend.UserProfilePhotoEmptyPymkTipsPresenter;
import qvb.i;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.profile.http.l;
import com.kwai.framework.model.user.User;
import s1c.a;
import gu7.b;
import lnc.a1;

public final class PhotoFragmentItemType$PHOTO extends PhotoFragmentItemType	// class@00130c
{

    public void PhotoFragmentItemType$PHOTO(String p0,int p1){
       super(p0, p1, null);
    }
    public void addMyPresenter(PresenterV2 p0,r0 p1){
       if (PatchProxy.applyVoidTwoRefsWithListener(p0, p1, this, PhotoFragmentItemType$PHOTO.class, "4")) {
          return;
       }
       a.p(p0, "presenter");
       a.p(p1, "profilePageParam");
       p0.U7(new o());
       p0.U7(new ProfilePhotoAbnormalPresenter());
       p0.U7(new u());
       p0.U7(new MyProfileNewEmptyGuideTipPresenter());
       p0.U7(new MyProfileEmptyGuideTipPresenter());
       p0.U7(new w(p1));
       p0.U7(new a());
       if (k0.c()) {
          p0.U7(new MyProfilePhotoEmptyUpdatePresenter());
       }
       p0.U7(new y());
       if (ProfilePostEmptyCardUtils.e.d()) {
          p0.U7(new ProfileEmptyPostCardPresenter());
       }
       PatchProxy.onMethodExit(PhotoFragmentItemType$PHOTO.class, "4");
       return;
    }
    public void addOnceBindPresenter(PresenterV2 p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, PhotoFragmentItemType$PHOTO.class, "3")) {
          return;
       }
       a.p(p0, "presenter");
       p0.U7(new e0());
       p0.U7(new o());
       PatchProxy.onMethodExit(PhotoFragmentItemType$PHOTO.class, "3");
       return;
    }
    public void addUserPresenter(PresenterV2 p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, PhotoFragmentItemType$PHOTO.class, "5")) {
          return;
       }
       a.p(p0, "presenter");
       p0.U7(new o());
       p0.U7(new ProfilePhotoAbnormalPresenter());
       if (k0.c()) {
          p0.U7(new UserProfilePhotoEmptyPymkTipsPresenter());
       }
       PatchProxy.onMethodExit(PhotoFragmentItemType$PHOTO.class, "5");
       return;
    }
    public i createPageList(String p0,r0 p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, PhotoFragmentItemType$PHOTO.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p1, "profilePageParam");
       r0 b = p1.b;
       a.o(b, "profilePageParam.mUser");
       String id = b.getId();
       p1 = p1.e;
       a l = (p1 != null)? p1.l: 0;
       l ol = new l(id, false, p0, true, l);
       return obj;
    }
    public String getTabName(){
       String obj = PatchProxy.apply(null, this, PhotoFragmentItemType$PHOTO.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a1.p(R.string.arg_RES_7f103fd4);
       a.o(obj, "CommonUtil.string\(R.string.profile_tab_posts\)");
       return obj;
    }
}
