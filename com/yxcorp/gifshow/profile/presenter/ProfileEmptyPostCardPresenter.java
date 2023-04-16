package com.yxcorp.gifshow.profile.presenter.ProfileEmptyPostCardPresenter;
import n3c.l;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.profile.presenter.ProfileEmptyPostCardPresenter$a;
import nsd.u;
import kotlin.LazyThreadSafetyMode;
import com.yxcorp.gifshow.profile.presenter.ProfileEmptyPostCardPresenter$mPageListObserver$2;
import msd.a;
import qrd.p;
import qrd.s;
import n3c.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.profile.util.ProfilePostEmptyCardUtils;
import java.lang.StringBuilder;
import brd.t;
import j5c.c;
import com.yxcorp.gifshow.profile.presenter.ProfileEmptyPostCardPresenter$b;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import com.yxcorp.gifshow.profile.common.event.RxPageBus$ThreadMode;
import com.yxcorp.gifshow.profile.common.event.RxPageBus;
import com.yxcorp.gifshow.profile.presenter.ProfileEmptyPostCardPresenter$c;
import com.yxcorp.gifshow.profile.presenter.ProfileEmptyPostCardPresenter$d;
import qvb.q;
import qvb.a;
import com.yxcorp.gifshow.profile.presenter.ProfileEmptyPostCardPresenter$e;
import z5c.l3;
import java.lang.ref.WeakReference;
import com.kwai.robust.PatchProxyResult;
import com.kwai.feature.api.social.profile.model.ProfileParam;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.profile.helper.postcard.DefaultCardProcessor;
import l3c.a0;
import java.util.Objects;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.yxcorp.gifshow.model.response.UserProfileResponse;
import com.yxcorp.gifshow.profile.model.ProfileEmptyPhotoGuideInfo;
import x3c.c;
import com.yxcorp.gifshow.profile.model.ProfileEmptyPhotoGuideInfo$PostCardGuideInfo;
import n3c.m;
import n3c.c;
import n3c.a;
import com.yxcorp.gifshow.profile.http.l;
import y8c.t;

public final class ProfileEmptyPostCardPresenter extends PresenterV2 implements l	// class@00143c
{
    public l p;
    public t q;
    public ProfileParam r;
    public c s;
    public BaseFragment t;
    public RxPageBus u;
    public RecyclerFragment v;
    public b w;
    public int x;
    public boolean y;
    public final p z;
    public static final ProfileEmptyPostCardPresenter$a A;

    static {
       ProfileEmptyPostCardPresenter.A = new ProfileEmptyPostCardPresenter$a(null);
    }
    public void ProfileEmptyPostCardPresenter(){
       super();
       this.z = s.b(LazyThreadSafetyMode.NONE, new ProfileEmptyPostCardPresenter$mPageListObserver$2(this));
    }
    public void B4(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfileEmptyPostCardPresenter.class, "23")) {
          return;
       }
       if (a.g(this.w, p0)) {
          return;
       }
       ProfilePostEmptyCardUtils.e.i("ProfileEmptyPostCardPresenter", "setProcessor: "+p0+", oldProcessor: "+this.w);
       ProfileEmptyPostCardPresenter tw = this.w;
       if (tw != null) {
          tw.e();
       }
       this.w = p0;
       return;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, ProfileEmptyPostCardPresenter.class, "17")) {
          return;
       }
       this.y = false;
       this.x = 0;
       ProfileEmptyPostCardPresenter ts = this.s;
       String str = "mLoadState";
       if (ts == null) {
          a.S(str);
       }
       this.X7(ts.b().subscribe(new ProfileEmptyPostCardPresenter$b(this), Functions.d()));
       String str1 = "mRxPageBus";
       if (ProfilePostEmptyCardUtils.e.e()) {
          ts = this.u;
          if (ts == null) {
             a.S(str1);
          }
          this.X7(ts.g("PROFILE_USER_INFO_CARD_SHOW_POST_CARD", RxPageBus$ThreadMode.MAIN, true).subscribe(new ProfileEmptyPostCardPresenter$c(this), Functions.d()));
       }else {
          ts = this.s;
          if (ts == null) {
             a.S(str);
          }
          this.X7(ts.d().subscribe(new ProfileEmptyPostCardPresenter$d(this), Functions.d()));
          ts = this.p;
          if (ts == null) {
             a.S("mPageList");
          }
          ts.h(this.P8());
       }
       ts = this.u;
       if (ts == null) {
          a.S(str1);
       }
       this.X7(ts.g("PROFILE_POST_DEFAULT_CARD_SHOW", RxPageBus$ThreadMode.MAIN, true).subscribe(new ProfileEmptyPostCardPresenter$e(this), Functions.d()));
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, ProfileEmptyPostCardPresenter.class, "19")) {
          return;
       }
       this.B4(null);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, ProfileEmptyPostCardPresenter.class, "18")) {
          return;
       }
       ProfileEmptyPostCardPresenter tp = this.p;
       if (tp == null) {
          a.S("mPageList");
       }
       tp.f(this.P8());
       return;
    }
    public void L6(l3 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfileEmptyPostCardPresenter.class, "22")) {
          return;
       }
       a.p(p0, "event");
       ProfilePostEmptyCardUtils e = ProfilePostEmptyCardUtils.e;
       String str = "ProfileEmptyPostCardPresenter";
       if (e.f()) {
          e.i(str, "showUserInfoCardIfNeed");
          p0.d(new WeakReference(this));
          ProfileEmptyPostCardPresenter tu = this.u;
          if (tu == null) {
             a.S("mRxPageBus");
          }
          tu.b("PROFILE_POST_CARD_SHOW_USER_INFO_CARD", "MAIN_KEY", p0);
       }else {
          e.i(str, "showDefaultCard");
          this.S8(p0);
       }
       return;
    }
    public final q P8(){
       Object obj = PatchProxy.apply(null, this, ProfileEmptyPostCardPresenter.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.z.getValue();
    }
    public final ProfileParam R8(){
       ProfileEmptyPostCardPresenter obj = PatchProxy.apply(null, this, ProfileEmptyPostCardPresenter.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.r;
       if (obj == null) {
          a.S("mParam");
       }
       return obj;
    }
    public final void S8(l3 p0){
       ProfileEmptyPostCardPresenter tw;
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfileEmptyPostCardPresenter.class, "20")) {
          return;
       }
       ProfilePostEmptyCardUtils e = ProfilePostEmptyCardUtils.e;
       e.i("ProfileEmptyPostCardPresenter", "tryShowDefaultGuide, "+p0+", status: "+this.x);
       ProfileEmptyPostCardPresenter tp = this.p;
       if (tp == null) {
          a.S("mPageList");
       }
       if (tp.getCount() > 0) {
          this.B4(null);
          return;
       }else {
          String str = "mFragment";
          int i = 2;
          ProfileEmptyPostCardPresenter profileEmpty = 1;
          if (p0.a() == i) {
             tp = this.w;
             if (tp == null || tp.h(p0) != profileEmpty) {
                tp = this.v;
                if (tp == null) {
                   a.S(str);
                }
                if (tp.K0()) {
                label_006e :
                   if (p0.a() == i && (this.w == null && !p0.c())) {
                      if (this.y == null) {
                         e.i("ProfileEmptyPostCardPresenter", "directly return, USER_PROFILE_RESPONSE_REFRESH\(empty processor\)");
                         return;
                      }else {
                         e.i("ProfileEmptyPostCardPresenter", "isCanChangeCardOnRefresh = true, refresh");
                      }
                   }
                   this.y = false;
                   if (!p0.a() && this.x == profileEmpty) {
                      tp = this.w;
                      if (tp != null && tp.h(p0) == profileEmpty) {
                         tw = this.w;
                         if (tw != null) {
                            tw.m();
                         }
                         e.i("ProfileEmptyPostCardPresenter", "directly return, PAGE_LIST_FINISH_LOADING");
                         return;
                      }
                   }
                   tp = this.w;
                   if (tp instanceof DefaultCardProcessor && (tp != null && tp.h(p0) == profileEmpty)) {
                      e.i("ProfileEmptyPostCardPresenter", "tryShowDefaultGuide, isSameProcessor, processor: "+this.w);
                      tw = this.w;
                      if (tw != null) {
                         tw.a();
                      }
                      return;
                   }else {
                      tp = this.q;
                      String str1 = "mTipsHelper";
                      if (tp == null) {
                         a.S(str1);
                      }
                      if (tp instanceof a0) {
                         profileEmpty = this.q;
                         if (profileEmpty == null) {
                            a.S(str1);
                         }
                         Objects.requireNonNull(profileEmpty, "null cannot be cast to non-null type com.yxcorp.gifshow.profile.helper.ProfileTipsHelper");
                         ProfileEmptyPostCardPresenter tv = this.v;
                         if (tv == null) {
                            a.S(str);
                         }
                         ProfileEmptyPostCardPresenter tt = this.t;
                         if (tt == null) {
                            a.S("mBaseFragment");
                         }
                         ProfileEmptyPostCardPresenter tu = this.u;
                         if (tu == null) {
                            a.S("mRxPageBus");
                         }
                         DefaultCardProcessor uDefaultCard = new DefaultCardProcessor(profileEmpty, tv, tt, tu);
                         e.i("ProfileEmptyPostCardPresenter", "tryShowDefaultGuide, showDefaultProcessor: "+uDefaultCard);
                         uDefaultCard.n(p0);
                         this.B4(uDefaultCard);
                      }
                      return;
                   }
                }
             }
             if (!p0.c()) {
                e.i("ProfileEmptyPostCardPresenter", "directly return, USER_PROFILE_RESPONSE_REFRESH");
                return;
             }else {
                goto label_006e ;
             }
          }else {
             goto label_006e ;
          }
       }
    }
    public final void V8(l3 p0){
       ProfileEmptyPostCardPresenter tw;
       ProfileEmptyPostCardPresenter tt;
       ProfileEmptyPostCardPresenter tu;
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfileEmptyPostCardPresenter.class, "21")) {
          return;
       }
       a.p(p0, "event");
       ProfilePostEmptyCardUtils e = ProfilePostEmptyCardUtils.e;
       e.i("ProfileEmptyPostCardPresenter", "tryShowGuide, "+p0+", status: "+this.x);
       p0.d(new WeakReference(this));
       ProfileEmptyPostCardPresenter tp = this.p;
       if (tp == null) {
          a.S("mPageList");
       }
       if (tp.getCount() > 0) {
          e.i("ProfileEmptyPostCardPresenter", "skip reason: count > 0");
          this.L6(p0);
          return;
       }else {
          ProfileEmptyPostCardPresenter profileEmpty = 2;
          String str = "mFragment";
          boolean b = true;
          if (p0.a() == profileEmpty) {
             tp = this.w;
             if (tp == null || tp.h(p0) != b) {
                tp = this.v;
                if (tp == null) {
                   a.S(str);
                }
                if (tp.K0()) {
                label_0079 :
                   if (p0.a() == profileEmpty) {
                      tp = this.y;
                      if (tp == null && this.w == null) {
                         e.i("ProfileEmptyPostCardPresenter", "directly return, USER_PROFILE_RESPONSE_REFRESH\(empty processor\)");
                         this.L6(p0);
                         return;
                      }else if(tp != null){
                         p0.d = b;
                         e.i("ProfileEmptyPostCardPresenter", "isCanChangeCardOnRefresh = true, refresh");
                      }
                   }
                   boolean b1 = false;
                   this.y = b1;
                   if (!p0.a() && this.x == b) {
                      profileEmpty = this.w;
                      if (profileEmpty != null && profileEmpty.h(p0) == b) {
                         tw = this.w;
                         if (tw != null) {
                            tw.m();
                         }
                         this.y = b;
                         e.i("ProfileEmptyPostCardPresenter", "directly return, PAGE_LIST_FINISH_LOADING");
                         return;
                      }
                   }
                   profileEmpty = this.w;
                   if (profileEmpty != null && profileEmpty.h(p0) == b) {
                      e.i("ProfileEmptyPostCardPresenter", "tryShowGuide, isSameProcessor, processor: "+this.w);
                      tw = this.w;
                      if (tw != null) {
                         tw.a();
                      }
                      return;
                   }else if(e.c() || p0.b() == null){
                      e.i("ProfileEmptyPostCardPresenter", "skip reason: responseIsEmpty or userClosedPostCard");
                      this.L6(p0);
                      return;
                   }else {
                      ProfileEmptyPhotoGuideInfo profileEmpty1 = c.b(p0.b());
                      a uoa = null;
                      ProfileEmptyPhotoGuideInfo mPostGuideIn = (profileEmpty1 != null)? profileEmpty1.mPostGuideInfos: uoa;
                      ProfileEmptyPostCardPresenter tq = this.q;
                      if (tq == null) {
                         a.S("mTipsHelper");
                      }
                      if (!tq instanceof a0) {
                         tq = uoa;
                      }
                      if (profileEmpty1 != null && (mPostGuideIn != null && tq != null)) {
                         ProfileEmptyPhotoGuideInfo$PostCardGuideInfo mGuideType = mPostGuideIn.mGuideType;
                         if (mGuideType != null) {
                            if (mGuideType == b) {
                               profileEmpty = this.v;
                               if (profileEmpty == null) {
                                  a.S(str);
                               }
                               tt = this.t;
                               if (tt == null) {
                                  a.S("mBaseFragment");
                               }
                               tu = this.u;
                               if (tu == null) {
                                  a.S("mRxPageBus");
                               }
                               uoa = new m(tq, profileEmpty, tt, tu);
                            }
                         }else {
                            profileEmpty = this.v;
                            if (profileEmpty == null) {
                               a.S(str);
                            }
                            tt = this.t;
                            if (tt == null) {
                               a.S("mBaseFragment");
                            }
                            tu = this.u;
                            if (tu == null) {
                               a.S("mRxPageBus");
                            }
                            uoa = new c(tq, profileEmpty, tt, tu);
                         }
                         if (uoa != null) {
                            b1 = uoa.n(p0);
                         }
                         if (b1) {
                            e.i("ProfileEmptyPostCardPresenter", "show guide success, processor: "+uoa);
                            this.B4(uoa);
                         }else {
                            e.i("ProfileEmptyPostCardPresenter", "show guide failed, skip");
                            this.L6(p0);
                         }
                         return;
                      }else {
                         e.i("ProfileEmptyPostCardPresenter", "show guide failed, skip");
                         this.L6(p0);
                         return;
                      }
                   }
                }
             }
             e.i("ProfileEmptyPostCardPresenter", "directly return, USER_PROFILE_RESPONSE_REFRESH");
             return;
          }else {
             goto label_0079 ;
          }
       }
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, ProfileEmptyPostCardPresenter.class, "16")) {
          return;
       }
       Object obj = this.r8("PAGE_LIST");
       a.o(obj, "inject\(AccessIds.PAGE_LIST\)");
       this.p = obj;
       obj = this.q8(t.class);
       a.o(obj, "inject\(TipsHelper::class.java\)");
       this.q = obj;
       obj = this.q8(ProfileParam.class);
       a.o(obj, "inject\(ProfileParam::class.java\)");
       this.r = obj;
       obj = this.r8("PROFILE_LOAD_STATE");
       a.o(obj, "inject\(ProfileCommonAccessIds.PROFILE_LOAD_STATE\)");
       this.s = obj;
       obj = this.r8("PROFILE_FRAGMENT");
       a.o(obj, "inject\(ProfileCommonAccessIds.PROFILE_FRAGMENT\)");
       this.t = obj;
       obj = this.r8("PROFILE_PAGE_RXBUS");
       a.o(obj, "inject\(ProfileCommonAccessIds.PROFILE_PAGE_RXBUS\)");
       this.u = obj;
       obj = this.r8("FRAGMENT");
       a.o(obj, "inject\(AccessIds.FRAGMENT\)");
       this.v = obj;
       return;
    }
}
