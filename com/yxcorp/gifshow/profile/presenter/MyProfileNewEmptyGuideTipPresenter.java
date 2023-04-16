package com.yxcorp.gifshow.profile.presenter.MyProfileNewEmptyGuideTipPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import kotlin.LazyThreadSafetyMode;
import com.yxcorp.gifshow.profile.presenter.MyProfileNewEmptyGuideTipPresenter$mEmptyGuideBackgroundColor$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.profile.presenter.MyProfileNewEmptyGuideTipPresenter$mPageListObserver$2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.profile.presenter.MyProfileNewEmptyGuideTipPresenter$mPageListObserver$2$a;
import qvb.q;
import qvb.a;
import com.kwai.feature.api.social.profile.model.ProfileParam;
import com.yxcorp.gifshow.model.response.UserProfileResponse;
import java.util.List;
import x3c.c;
import java.util.Collection;
import com.yxcorp.gifshow.profile.util.ProfilePostEmptyCardUtils;
import qvb.n0;
import com.yxcorp.gifshow.model.response.ProfileFeedResponse;
import com.kwai.feature.api.social.profile.model.ProfilePostGuideConfig;
import com.kwai.feature.api.social.profile.model.ProfilePostEmptyGuide;
import com.yxcorp.gifshow.profile.model.ProfileEmptyPhotoGuideInfo;
import fx5.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import m3c.a;
import com.yxcorp.gifshow.profile.helper.guide.EmptyGuideType;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.graphics.drawable.ColorDrawable;
import java.lang.Integer;
import com.yxcorp.gifshow.util.rx.RxBus;
import yqb.a;
import com.yxcorp.gifshow.profile.presenter.MyProfileNewEmptyGuideTipPresenter$a;
import lkd.b;
import l3c.a0;
import com.yxcorp.gifshow.profile.presenter.MyProfileNewEmptyGuideTipPresenter$b;
import java.lang.Runnable;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.yxcorp.gifshow.profile.presenter.MyProfileNewEmptyGuideTipPresenter$c;
import com.yxcorp.gifshow.profile.kslog.KsLogProfileTag;
import v2c.e;
import v2c.g;
import com.yxcorp.gifshow.profile.http.l;
import y8c.t;

public final class MyProfileNewEmptyGuideTipPresenter extends PresenterV2	// class@00141c
{
    public l p;
    public a0 q;
    public ProfileParam r;
    public BaseFragment s;
    public RecyclerFragment t;
    public Integer u;
    public a v;
    public final p w;
    public final p x;

    public void MyProfileNewEmptyGuideTipPresenter(){
       super();
       LazyThreadSafetyMode nONE = LazyThreadSafetyMode.NONE;
       this.w = s.b(nONE, MyProfileNewEmptyGuideTipPresenter$mEmptyGuideBackgroundColor$2.INSTANCE);
       this.x = s.b(nONE, new MyProfileNewEmptyGuideTipPresenter$mPageListObserver$2(this));
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, MyProfileNewEmptyGuideTipPresenter.class, "14")) {
          return;
       }
       MyProfileNewEmptyGuideTipPresenter tp = this.p;
       if (tp == null) {
          a.S("mPageList");
       }
       tp.h(this.S8());
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, MyProfileNewEmptyGuideTipPresenter.class, "15")) {
          return;
       }
       MyProfileNewEmptyGuideTipPresenter tp = this.p;
       if (tp == null) {
          a.S("mPageList");
       }
       tp.f(this.S8());
       return;
    }
    public final void P8(){
       MyProfileNewEmptyGuideTipPresenter tt;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, MyProfileNewEmptyGuideTipPresenter.class, "16")) {
          return;
       }
       MyProfileNewEmptyGuideTipPresenter tp = this.p;
       String str = "mPageList";
       if (tp == null) {
          a.S(str);
       }
       if (!tp.isEmpty()) {
          this.V8();
          return;
       }else {
          tp = this.r;
          String str1 = "mParam";
          if (tp == null) {
             a.S(str1);
          }
          ProfileParam mUserProfile = tp.mUserProfileResponse;
          List list = (mUserProfile != null)? c.a(mUserProfile): objArray;
          boolean b = true;
          ProfilePostEmptyCardUtils profilePostE = (list == null || list.isEmpty())? 1: null;
          if (!profilePostE) {
             return;
          }else if(ProfilePostEmptyCardUtils.e.d()){
             return;
          }else {
             tp = this.p;
             if (tp == null) {
                a.S(str);
             }
             ProfileFeedResponse profileFeedR = tp.L0();
             if (profileFeedR != null) {
                ProfilePostGuideConfig postGuideCon = profileFeedR.getPostGuideConfig();
                if (postGuideCon != null) {
                   postGuideCon = postGuideCon.mEmptyGuide;
                label_0064 :
                   ProfilePostEmptyGuide c = (postGuideCon != null)? postGuideCon.c: objArray;
                   if (c == null) {
                      tp = this.r;
                      if (tp == null) {
                         a.S(str1);
                      }
                      mUserProfile = tp.mUserProfileResponse;
                      if (mUserProfile != null) {
                         objArray = c.b(mUserProfile);
                      }
                      if (objArray != null) {
                         this.W8();
                      }
                      return;
                   }else {
                      MyProfileNewEmptyGuideTipPresenter tv = this.v;
                      String str2 = "mFragment";
                      if (tv == null) {
                         c = postGuideCon.c;
                         tt = this.s;
                         if (tt == null) {
                            a.S("mBaseFragment");
                         }
                         MyProfileNewEmptyGuideTipPresenter tt2 = this.t;
                         if (tt2 == null) {
                            a.S(str2);
                         }
                         MyProfileNewEmptyGuideTipPresenter tr = this.r;
                         if (tr == null) {
                            a.S(str1);
                         }
                         tv = EmptyGuideType.fromContent(c, tt, tt2, tr);
                         if (tv != null) {
                            this.v = tv;
                         }else {
                            tv = objArray;
                         }
                      }
                      if (tv == null) {
                         this.W8();
                         return;
                      }else {
                         View view = tv.c(postGuideCon);
                         if (view == null) {
                            this.W8();
                            return;
                         }else if(this.u == null){
                            tt = this.t;
                            if (tt == null) {
                               a.S(str2);
                            }
                            RecyclerView recyclerView = tt.h0();
                            a.o(recyclerView, "mFragment.recyclerView");
                            Drawable background = recyclerView.getBackground();
                            if (!background instanceof ColorDrawable) {
                               background = objArray;
                            }
                            if (background != null) {
                               objArray = Integer.valueOf(background.getColor());
                            }
                            this.u = objArray;
                         }
                         RxBus.f.b(new a(b));
                         view.setVisibility(4);
                         MyProfileNewEmptyGuideTipPresenter tt1 = this.t;
                         if (tt1 == null) {
                            a.S(str2);
                         }
                         tt1.h0().setBackgroundColor(this.R8());
                         tt1 = this.q;
                         if (tt1 == null) {
                            a.S("mTipsHelper");
                         }
                         tt1.D(new MyProfileNewEmptyGuideTipPresenter$a(view));
                         tt1 = this.q;
                         if (tt1 == null) {
                            a.S("mTipsHelper");
                         }
                         tt1.i();
                         view.post(new MyProfileNewEmptyGuideTipPresenter$b(view, tv, postGuideCon));
                         return;
                      }
                   }
                }
             }
             Object[] objArray1 = objArray;
             goto label_0064 ;
          }
       }
    }
    public final int R8(){
       Object obj = PatchProxy.apply(null, this, MyProfileNewEmptyGuideTipPresenter.class, "12");
       if (obj == PatchProxyResult.class) {
          obj = this.w.getValue();
       }
       return obj.intValue();
    }
    public final MyProfileNewEmptyGuideTipPresenter$mPageListObserver$2$a S8(){
       Object obj = PatchProxy.apply(null, this, MyProfileNewEmptyGuideTipPresenter.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.x.getValue();
    }
    public final void V8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, MyProfileNewEmptyGuideTipPresenter.class, "18")) {
          return;
       }
       MyProfileNewEmptyGuideTipPresenter tu = this.u;
       if (tu != null) {
          int i = this.R8();
          if (tu == null || tu.intValue() != i) {
             tu = this.u;
             MyProfileNewEmptyGuideTipPresenter tt = this.t;
             if (tt == null) {
                a.S("mFragment");
             }
             RecyclerView recyclerView = tt.h0();
             a.o(recyclerView, "mFragment.recyclerView");
             Drawable background = recyclerView.getBackground();
             if (!background instanceof ColorDrawable) {
                background = objArray;
             }
             if (background != null) {
                objArray = Integer.valueOf(background.getColor());
             }
             if (a.g(tu, objArray) ^ 0x01) {
                tu = this.t;
                if (tu == null) {
                   a.S("mFragment");
                }
                MyProfileNewEmptyGuideTipPresenter tu1 = this.u;
                a.m(tu1);
                tu.h0().setBackgroundColor(tu1.intValue());
             }
          }
       }
       return;
    }
    public final void W8(){
       if (PatchProxy.applyVoid(null, this, MyProfileNewEmptyGuideTipPresenter.class, "17")) {
          return;
       }
       this.V8();
       MyProfileNewEmptyGuideTipPresenter tq = this.q;
       String str = "mTipsHelper";
       if (tq == null) {
          a.S(str);
       }
       tq.D(MyProfileNewEmptyGuideTipPresenter$c.a);
       tq = this.q;
       if (tq == null) {
          a.S(str);
       }
       tq.i();
       g.e(KsLogProfileTag.PHOTO_EMPTY_VIEW_GUIDE.appendTag("MyProfileEmptyGuideTip"), "no guide info ");
       RxBus.f.b(new a(false));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, MyProfileNewEmptyGuideTipPresenter.class, "1")) {
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
       obj = this.r8("PROFILE_FRAGMENT");
       a.o(obj, "inject\(ProfileCommonAccessIds.PROFILE_FRAGMENT\)");
       this.s = obj;
       obj = this.r8("FRAGMENT");
       a.o(obj, "inject\(AccessIds.FRAGMENT\)");
       this.t = obj;
       return;
    }
}
