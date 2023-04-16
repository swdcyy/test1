package com.yxcorp.gifshow.profile.presenter.MyProfileOverduePhotoTipPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.profile.presenter.MyProfileOverduePhotoTipPresenter$a;
import nsd.u;
import com.yxcorp.gifshow.profile.presenter.MyProfileOverduePhotoTipPresenter$mIdleHandler$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.profile.presenter.MyProfileOverduePhotoTipPresenter$mPageListObserver$2;
import com.yxcorp.gifshow.profile.tab.DynamicTabHostFragment;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import qvb.q;
import qvb.a;
import android.os.MessageQueue$IdleHandler;
import z5c.n2;
import com.kwai.feature.api.social.profile.model.ProfileParam;
import com.kwai.framework.model.user.User;
import com.kwai.framework.model.user.UserProfile;
import z5c.d3;
import com.yxcorp.gifshow.profile.kslog.KsLogProfileTag;
import java.util.List;
import v2c.e;
import v2c.g;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.model.response.UserProfileResponse;
import com.yxcorp.gifshow.profile.model.ProfileTips;
import x3c.c;
import java.lang.StringBuilder;
import s1c.o;
import android.content.Context;
import i2b.a;
import ekd.m1;
import android.widget.TextView;
import z5c.k0;
import z5c.g3;
import i4c.a0;
import android.view.View$OnClickListener;
import android.widget.ImageView;
import lnc.a1;
import i4c.b0;
import g9c.d;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import z5c.y1;
import k2b.f3;
import k2b.e0;
import android.view.ViewParent;
import android.view.ViewGroup;
import com.yxcorp.gifshow.profile.http.l;

public final class MyProfileOverduePhotoTipPresenter extends PresenterV2	// class@001423
{
    public DynamicTabHostFragment p;
    public RecyclerFragment q;
    public l r;
    public ProfileParam s;
    public View t;
    public final p u;
    public final p v;
    public static final MyProfileOverduePhotoTipPresenter$a w;

    static {
       MyProfileOverduePhotoTipPresenter.w = new MyProfileOverduePhotoTipPresenter$a(null);
    }
    public void MyProfileOverduePhotoTipPresenter(){
       super();
       this.u = s.c(new MyProfileOverduePhotoTipPresenter$mIdleHandler$2(this));
       this.v = s.c(new MyProfileOverduePhotoTipPresenter$mPageListObserver$2(this));
    }
    public static final DynamicTabHostFragment P8(MyProfileOverduePhotoTipPresenter p0){
       p0 = p0.p;
       if (p0 == null) {
          a.S("mBaseFragment");
       }
       return p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, MyProfileOverduePhotoTipPresenter.class, "5")) {
          return;
       }
       MyProfileOverduePhotoTipPresenter tr = this.r;
       if (tr == null) {
          a.S("mPageList");
       }
       tr.h(this.V8());
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, MyProfileOverduePhotoTipPresenter.class, "6")) {
          return;
       }
       MyProfileOverduePhotoTipPresenter tr = this.r;
       if (tr == null) {
          a.S("mPageList");
       }
       tr.f(this.V8());
       MessageQueue$IdleHandler idleHandler = this.S8();
       if (idleHandler != null) {
          n2.a(idleHandler);
       }
       return;
    }
    public final void R8(){
       boolean b;
       MyProfileOverduePhotoTipPresenter myProfileOve = MyProfileOverduePhotoTipPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, myProfileOve, "7")) {
          return;
       }
       MyProfileOverduePhotoTipPresenter ts = this.s;
       String str = "mParam";
       if (ts == null) {
          a.S(str);
       }
       ProfileParam mUser = ts.mUser;
       MyProfileOverduePhotoTipPresenter ts1 = this.s;
       if (ts1 == null) {
          a.S(str);
       }
       String str1 = "MyProfileOverduePhotoTipPresenter";
       if (d3.c(mUser, ts1.mUserProfile)) {
          g.e(KsLogProfileTag.OVERDUE_PHOTO_TIP.appendTag(str1), "abnormal user");
          myProfileOve = this.t;
          if (myProfileOve != null) {
             this.W8(myProfileOve);
          }
          return;
       }else {
          ts = this.s;
          if (ts == null) {
             a.S(str);
          }
          if (ts.mUserProfileResponse == null) {
             g.e(KsLogProfileTag.OVERDUE_PHOTO_TIP.appendTag(str1), "userProfileResponse is null");
             return;
          }else {
             View obj = PatchProxy.apply(objArray, this, myProfileOve, "11");
             if (obj != PatchProxyResult.class) {
                b = obj.booleanValue();
             }else {
                ts = this.s;
                if (ts == null) {
                   a.S(str);
                }
                mUser = ts.mUserProfileResponse;
                if (mUser != null) {
                   ProfileTips profileTips = c.c(mUser);
                   if (profileTips != null) {
                      b = profileTips.getMEnablePhotoExpirationTip();
                   label_007b :
                      KsLogProfileTag oVERDUE_PHOT = KsLogProfileTag.OVERDUE_PHOTO_TIP;
                      oVERDUE_PHOT.appendTag(str1);
                      KsLogProfileTag ksLogProfile = oVERDUE_PHOT;
                      g.e(ksLogProfile, "showTips: "+b);
                      if (b && !o.b()) {
                         b = true;
                      }else {
                         b = false;
                      }
                   }
                }
                b = false;
                goto label_007b ;
             }
             if (!b) {
                myProfileOve = this.t;
                if (myProfileOve != null) {
                   this.W8(myProfileOve);
                }
                return;
             }else if(PatchProxy.applyVoid(objArray, this, myProfileOve, "8") || this.t != null){
                obj = a.a(this.getContext(), R.layout.arg_RES_7f0d124f);
                this.t = obj;
                TextView textView = m1.f(obj, R.id.title);
                if (textView != null && k0.t()) {
                   g3.e(textView, 14);
                }
                textView = m1.f(this.t, R.id.action_btn);
                if (textView != null) {
                   if (k0.t()) {
                      g3.e(textView, 12);
                   }
                   textView.setOnClickListener(new a0(this));
                }
                ImageView imageView = m1.f(this.t, R.id.close_btn);
                if (imageView != null) {
                   if (k0.t()) {
                      g3.c(imageView, a1.d(R.dimen.arg_RES_7f070295), a1.d(R.dimen.arg_RES_7f070295));
                   }
                   imageView.setOnClickListener(new b0(this));
                }
                ts = this.q;
                if (ts == null) {
                   a.S("mProfilePhotoFragment");
                }
                d uod = ts.ia();
                if (uod != null) {
                   MyProfileOverduePhotoTipPresenter tp = this.p;
                   if (tp == null) {
                      a.S("mBaseFragment");
                   }
                   if (!PatchProxy.applyVoidOneRefs(tp, objArray, y1.class, "102")) {
                      f3.j("AGING_HINT_POPUP").h(tp);
                   }
                   tp = this.t;
                   a.m(tp);
                   if (!PatchProxy.applyVoidTwoRefs(uod, tp, this, myProfileOve, "9")) {
                      if (uod.U0(tp)) {
                         uod.m1(tp);
                      }
                      if (!uod.U0(tp)) {
                         if (!PatchProxy.applyVoidOneRefs(tp, this, myProfileOve, "10")) {
                            ViewParent parent = tp.getParent();
                            if (parent instanceof ViewGroup) {
                               objArray = parent;
                            }
                            if (objArray != null) {
                               objArray.removeView(tp);
                            }
                         }
                         uod.P0(tp);
                      }
                   }
                }
             }
          label_018c :
             return;
          }
       }
    }
    public final MessageQueue$IdleHandler S8(){
       Object obj = PatchProxy.apply(null, this, MyProfileOverduePhotoTipPresenter.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.u.getValue();
    }
    public final q V8(){
       Object obj = PatchProxy.apply(null, this, MyProfileOverduePhotoTipPresenter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.v.getValue();
    }
    public final void W8(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MyProfileOverduePhotoTipPresenter.class, "12")) {
          return;
       }
       MyProfileOverduePhotoTipPresenter tq = this.q;
       if (tq == null) {
          a.S("mProfilePhotoFragment");
       }
       d uod = tq.ia();
       if (uod != null && uod.U0(p0)) {
          uod.m1(p0);
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, MyProfileOverduePhotoTipPresenter.class, "4")) {
          return;
       }
       Object obj = this.r8("FRAGMENT");
       a.o(obj, "inject\(AccessIds.FRAGMENT\)");
       this.q = obj;
       obj = this.r8("PROFILE_FRAGMENT");
       a.o(obj, "inject\(ProfileCommonAccessIds.PROFILE_FRAGMENT\)");
       this.p = obj;
       obj = this.r8("PAGE_LIST");
       a.o(obj, "inject\(PageAccessIds.PAGE_LIST\)");
       this.r = obj;
       obj = this.q8(ProfileParam.class);
       a.o(obj, "inject\(ProfileParam::class.java\)");
       this.s = obj;
       return;
    }
}
