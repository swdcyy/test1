package com.yxcorp.gifshow.profile.presenter.profile.header.recommend.UserProfilePhotoEmptyPymkTipsPresenter$mPageListObserver$2$a;
import qvb.q;
import com.yxcorp.gifshow.profile.presenter.profile.header.recommend.UserProfilePhotoEmptyPymkTipsPresenter$mPageListObserver$2;
import java.lang.Object;
import java.lang.Throwable;
import qvb.p;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.yxcorp.gifshow.profile.presenter.profile.header.recommend.UserProfilePhotoEmptyPymkTipsPresenter;
import kotlin.jvm.internal.a;
import qvb.a;
import com.kwai.feature.api.social.profile.model.ProfileParam;
import java.util.Objects;
import com.kwai.framework.model.user.User;
import com.kwai.framework.model.user.UserProfile;
import z5c.d3;
import java.lang.System;
import k2b.k2;
import k2b.u1;
import crd.b;
import lnc.b9;
import wkd.b;
import i7c.a;
import java.lang.Integer;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import n7c.c;
import brd.t;
import cjd.e;
import erd.o;
import u4c.l;
import u4c.m;
import erd.g;

public final class UserProfilePhotoEmptyPymkTipsPresenter$mPageListObserver$2$a implements q	// class@00152c
{
    public final UserProfilePhotoEmptyPymkTipsPresenter$mPageListObserver$2 b;

    public void UserProfilePhotoEmptyPymkTipsPresenter$mPageListObserver$2$a(UserProfilePhotoEmptyPymkTipsPresenter$mPageListObserver$2 p0){
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
       UserProfilePhotoEmptyPymkTipsPresenter$mPageListObserver$2$a omPageListOb = UserProfilePhotoEmptyPymkTipsPresenter$mPageListObserver$2$a.class;
       if (PatchProxy.isSupport(omPageListOb) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, omPageListOb, "1")) {
          return;
       }
       if (p0) {
          UserProfilePhotoEmptyPymkTipsPresenter q = this.b.this$0.q;
          if (q == null) {
             a.S("mPageList");
          }
          if (q.isEmpty()) {
             UserProfilePhotoEmptyPymkTipsPresenter$mPageListObserver$2 this$0 = this.b.this$0;
             ProfileParam mUser = UserProfilePhotoEmptyPymkTipsPresenter.P8(this$0).mUser;
             a.o(mUser, "mParam.mUser");
             Objects.requireNonNull(this$0);
             if (!PatchProxy.applyVoidOneRefs(mUser, this$0, UserProfilePhotoEmptyPymkTipsPresenter.class, "6")) {
                UserProfilePhotoEmptyPymkTipsPresenter t = this$0.t;
                if (t == null) {
                   a.S("mParam");
                }
                ProfileParam mUser1 = t.mUser;
                UserProfilePhotoEmptyPymkTipsPresenter u = this$0.u;
                if (u == null) {
                   a.S("mUserProfile");
                }
                if (d3.d(mUser1, u)) {
                   this$0.c9();
                }else {
                   this$0.N = System.currentTimeMillis();
                   k2 ok2 = u1.n();
                   if (ok2 != null) {
                      ok2 = ok2.d;
                      if (ok2 != null) {
                      label_007d :
                         k2 ok21 = ok2;
                         a.o(ok21, "pageRecord?.mPage2 ?: \"\"");
                         b9.a(this$0.Q);
                         this$0.Q = b.a(-1302358859).g(54, null, null, null, null, Integer.valueOf(0), mUser.getId(), ok21, RequestTiming.DEFAULT, 0, c.g()).map(new e()).subscribe(new l(this$0, mUser), new m(this$0));
                      }
                   }
                   String str = "";
                   goto label_007d ;
                }
             }
          }
       }
    label_00c5 :
       return;
    }
}
