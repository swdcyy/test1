package com.yxcorp.gifshow.profile.presenter.profile.header.template.ProfileTemplateCardItemPresenter$b;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.profile.presenter.profile.header.template.ProfileTemplateCardItemPresenter;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.model.ProfileTemplateCard;
import com.yxcorp.gifshow.model.ProfileTemplateCard$ProfileCardRedDot;
import k2b.e0;
import z5c.y1;
import z5c.b3;
import dx5.h$a;
import java.util.Iterator;
import java.util.List;
import dx5.h;
import com.yxcorp.gifshow.profile.kslog.KsLogProfileTag;
import v2c.e;
import java.lang.StringBuilder;
import v2c.g;
import qrd.l1;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import js6.a;
import android.net.Uri;
import ekd.x0;
import android.content.Context;
import xh7.b;
import qh7.b;
import qh7.a;

public final class ProfileTemplateCardItemPresenter$b extends m	// class@001543
{
    public final ProfileTemplateCardItemPresenter c;

    public void ProfileTemplateCardItemPresenter$b(ProfileTemplateCardItemPresenter p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       List a;
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfileTemplateCardItemPresenter$b.class, "1")) {
          return;
       }
       ProfileTemplateCardItemPresenter$b tc = this.c;
       Objects.requireNonNull(tc);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, tc, ProfileTemplateCardItemPresenter.class, "6")) {
          Activity activity = tc.getActivity();
          if (!activity instanceof GifshowActivity) {
             activity = objArray;
          }
          if (activity != null) {
             ProfileTemplateCardItemPresenter w = tc.w;
             if (w == null) {
                a.S("mRedDotView");
             }
             w.setVisibility(8);
             w = tc.r;
             if (w == null) {
                a.S("mCard");
             }
             ProfileTemplateCard mProfileCard = w.mProfileCardRedDot;
             if (mProfileCard != null) {
                mProfileCard.mShow = false;
             }
             ProfileTemplateCardItemPresenter p = tc.p;
             if (p == null) {
                a.S("mBaseFragment");
             }
             ProfileTemplateCardItemPresenter r = tc.r;
             if (r == null) {
                a.S("mCard");
             }
             ProfileTemplateCardItemPresenter z = tc.z;
             if (z == null) {
                a.S("mUserId");
             }
             y1.X(p, r, z, tc.B, 3);
             b3 b = b3.b;
             w = tc.z;
             if (w == null) {
                a.S("mUserId");
             }
             ProfileTemplateCardItemPresenter r1 = tc.r;
             if (r1 == null) {
                a.S("mCard");
             }
             h$a uoa = tc.X8();
             Objects.requireNonNull(b);
             if (!PatchProxy.applyVoidFourRefs(activity, w, r1, uoa, b, b3.class, "4")) {
                a.p(activity, "activity");
                a.p(w, "uid");
                a.p(r1, "profileTemplateCard");
                a = b3.a;
                a.o(a, "mInterceptors");
                _monitor_enter(a);
                Iterator iterator = a.iterator();
                while (true) {
                   if (iterator.hasNext()) {
                      h oh = iterator.next();
                      if (oh != null && oh.e3(r1.mBizType)) {
                         g.e(KsLogProfileTag.COMMON_TEMPLATE_CARD.appendTag("ProfileTemplateCardHelper"), "interceptor onTemplateCardClick : "+oh.getClass().getSimpleName());
                         oh.d3(activity, w, r1, uoa);
                         _monitor_exit(a);
                         break ;
                      }
                   }else {
                      _monitor_exit(a);
                      if (!TextUtils.x(r1.mLinkUrl)) {
                         a.b.SN(x0.f(r1.mLinkUrl));
                         a.b(b.j(activity, r1.mLinkUrl), objArray);
                         break ;
                      }
                   }
                }
             }
          }
       }
       return;
    }
}
