package com.yxcorp.gifshow.profile.presenter.profile.header.head.avatar.ProfileHeaderStatusPresenter$c;
import erd.g;
import com.yxcorp.gifshow.profile.presenter.profile.header.head.avatar.ProfileHeaderStatusPresenter;
import java.lang.Object;
import com.kwai.framework.model.user.UserProfile;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kwai.framework.model.user.User;
import z5c.p0;
import com.yxcorp.gifshow.profile.status.log.KsLogProfileStatusTag;
import java.util.List;
import v2c.e;
import v2c.g;
import android.view.View;
import com.yxcorp.gifshow.profile.common.model.ProfileStatusInfo;
import x2c.a;
import com.kwai.feature.api.social.profile.model.ProfileParam;
import com.kwai.framework.model.user.UserInfo;
import w5c.c;
import z5c.f3;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.view.ViewStub;
import o4c.r;
import android.view.View$OnClickListener;
import android.view.ViewGroup$LayoutParams;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import lnc.a1;
import android.view.ViewGroup$MarginLayoutParams;

public final class ProfileHeaderStatusPresenter$c implements g	// class@0014d4
{
    public final ProfileHeaderStatusPresenter b;

    public void ProfileHeaderStatusPresenter$c(ProfileHeaderStatusPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       int i1;
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfileHeaderStatusPresenter$c.class, "1")) {
       }else {
          ProfileHeaderStatusPresenter$c tb = this.b;
          a.o(p0, "userProfile");
          Objects.requireNonNull(tb);
          ProfileHeaderStatusPresenter profileHeade = ProfileHeaderStatusPresenter.class;
          if (!PatchProxy.applyVoidOneRefs(p0, tb, profileHeade, "7")) {
             ProfileHeaderStatusPresenter s = tb.s;
             if (s == null) {
                a.S("mUser");
             }
             String str = "ProfileHeaderStatusPresenter";
             if (!p0.b(s, p0, 2)) {
                g.e(KsLogProfileStatusTag.STATUS_HEADER.appendTag(str), "hide status");
                p0 = tb.A;
                if (p0 != null) {
                   p0.setVisibility(8);
                }
             }else {
                p0 = a.f(p0);
                Object[] objArray = null;
                p0 = (p0 != null)? p0.mUserStatus: objArray;
                tb.I = p0;
                if (!PatchProxy.applyVoid(objArray, tb, profileHeade, "44")) {
                   p0 = tb.t;
                   if (p0 == null) {
                      a.S("mParam");
                   }
                   p0 = p0.mUserProfile;
                   if (p0 != null) {
                      p0 = p0.mProfile;
                      if (p0 != null) {
                         if (p0.mDynamicPendant == null) {
                            p0 = p0.mAvatarPendants;
                            if (p0 != null) {
                               i1 = (!p0.length)? 1: 0;
                               if (!i1) {
                                  i1 = null;
                               label_0089 :
                                  if (i1) {
                                  label_009b :
                                     tb.k9();
                                     if (!PatchProxy.applyVoid(objArray, tb, profileHeade, "8")) {
                                        if (tb.A == null) {
                                           p0 = tb.x;
                                           if (p0 == null) {
                                              a.S("mStatusViewStub");
                                           }
                                           p0 = f3.a(p0);
                                           tb.A = p0;
                                           tb.B = m1.f(p0, 0x7f0a3258);
                                           tb.C = m1.f(tb.A, 0x7f0a0373);
                                           tb.F = m1.f(tb.A, 0x7f0a0375);
                                           p0 = m1.f(tb.A, R.id.avatar_status_click_area_view_stub);
                                           a.o(p0, "ViewBindUtils.bindWidget¡­tus_click_area_view_stub\)");
                                           tb.y = p0;
                                           p0 = tb.A;
                                           if (p0 != null) {
                                              p0.setOnClickListener(new r(tb));
                                           }
                                        }
                                        p0 = tb.A;
                                        if (p0 != null) {
                                           ViewGroup$LayoutParams layoutParams = p0.getLayoutParams();
                                           if (layoutParams instanceof ConstraintLayout$LayoutParams) {
                                              objArray = layoutParams;
                                           }
                                           if (objArray != null) {
                                              objArray.h = 0x7f0a435e;
                                              objArray.k = 0x7f0a435e;
                                              objArray.q = 0x7f0a435e;
                                              objArray.s = 0x7f0a435e;
                                              int i = a1.d(R.dimen.arg_RES_7f070268);
                                              objArray.width = i;
                                              objArray.height = i;
                                              p0.setLayoutParams(objArray);
                                              p0.setVisibility(0);
                                           }
                                        }
                                     }
                                  label_012c :
                                     tb.V8(true);
                                     tb.X8();
                                  }
                               }
                            }
                            i1 = 1;
                            goto label_0089 ;
                         }
                         g.e(KsLogProfileStatusTag.STATUS_HEADER.appendTag(str), "clearMockData for avatar pendant");
                         c.h.a();
                         goto label_009b ;
                      }else {
                         goto label_009b ;
                      }
                   }else {
                      goto label_009b ;
                   }
                }
             }
          }
       }
       return;
    }
}
