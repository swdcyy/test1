package com.yxcorp.gifshow.profile.presenter.profile.header.template.ProfileTemplateCardGroupPresenter$d;
import erd.g;
import com.yxcorp.gifshow.profile.presenter.profile.header.template.ProfileTemplateCardGroupPresenter;
import java.lang.Object;
import com.yxcorp.gifshow.model.response.UserProfileResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import x3c.c;
import com.yxcorp.gifshow.profile.model.ProfileTemplateCardInfo;
import com.yxcorp.gifshow.profile.model.response.UserProfileResponseMeta;
import java.util.Collection;
import com.kwai.framework.model.user.User;
import com.kwai.framework.model.user.UserProfile;
import z5c.d3;
import x3c.b;
import java.lang.Boolean;
import android.view.View;
import android.view.ViewStub;
import androidx.recyclerview.widget.RecyclerView;
import android.view.ViewGroup;
import a3c.e;
import z5c.r2;
import z5c.s1;
import lnc.a1;
import z5c.k0;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import com.kwai.library.widget.recyclerview.layoutmanager.NpaLinearLayoutManager;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView$l;
import k17.b;
import androidx.recyclerview.widget.RecyclerView$n;
import qrd.l1;
import com.yxcorp.gifshow.profile.adapter.ProfileTemplateCardAdapter;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import z5c.c3;
import y8c.g;
import t3c.f;
import java.util.List;
import g9c.a;
import androidx.recyclerview.widget.RecyclerView$Adapter;

public final class ProfileTemplateCardGroupPresenter$d implements g	// class@00153c
{
    public final ProfileTemplateCardGroupPresenter b;

    public void ProfileTemplateCardGroupPresenter$d(ProfileTemplateCardGroupPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       boolean b1;
       l1 a;
       boolean b2;
       Object obj = this;
       ProfileTemplateCardGroupPresenter obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, ProfileTemplateCardGroupPresenter$d.class, "1")) {
       }else {
          a.p(obj1, "userProfileResponse");
          ProfileTemplateCardGroupPresenter$d b = obj.b;
          Objects.requireNonNull(b);
          ProfileTemplateCardGroupPresenter profileTempl = ProfileTemplateCardGroupPresenter.class;
          PatchProxyResult patchProxyRe = PatchProxyResult.class;
          if (!PatchProxy.applyVoidOneRefs(obj1, b, profileTempl, "7")) {
             ProfileTemplateCardGroupPresenter profileTempl1 = null;
             String str = "2";
             UserProfileResponseMeta userProfileR = PatchProxy.applyOneRefs(obj1, profileTempl1, c.class, str);
             if (userProfileR != patchProxyRe) {
             }else {
                a.p(obj1, "$this$mProfileTemplateCardInfo");
                userProfileR = c.d(obj1);
                userProfileR = (userProfileR != null)? userProfileR.mProfileTemplateCardInfo: profileTempl1;
             }
             ProfileTemplateCardInfo mProfileTemp = (userProfileR != null)? userProfileR.mProfileTemplateCards: profileTempl1;
             ProfileTemplateCardGroupPresenter profileTempl2 = 1;
             ProfileTemplateCardGroupPresenter profileTempl3 = (mProfileTemp == null || mProfileTemp.isEmpty())? 1: null;
             if (!profileTempl3) {
                profileTempl3 = b.r;
                if (profileTempl3 == null) {
                   a.S("mUser");
                }
                if (!d3.d(profileTempl3, obj1.mUserProfile)) {
                   UserProfileResponse mUserProfile = obj1.mUserProfile;
                   if (mUserProfile == null || mUserProfile.mIsolated != profileTempl2) {
                      View obj2 = PatchProxy.applyOneRefs(obj1, profileTempl1, b.class, "9");
                      if (obj2 != patchProxyRe) {
                         b1 = obj2.booleanValue();
                      }else {
                         UserProfileResponseMeta userProfileR1 = c.d(obj1);
                         if (userProfileR1 != null) {
                            userProfileR1 = userProfileR1.mProfileTemplateCardInfo;
                            if (userProfileR1 != null && userProfileR1.mEnableMiddleCardManagement == profileTempl2) {
                               b1 = true;
                            }
                         }
                         b1 = false;
                      }
                      if (b1) {
                         profileTempl3 = b.r;
                         if (profileTempl3 == null) {
                            a.S("mUser");
                         }
                         if (d3.a(profileTempl3)) {
                            b1 = true;
                         label_00ac :
                            b.y = b1;
                            UserProfileResponse mUserProfile1 = obj1.mUserProfile;
                            a.o(mUserProfile1, "userProfileResponse.mUserProfile");
                            if (!PatchProxy.applyVoidTwoRefs(mProfileTemp, mUserProfile1, b, profileTempl, "8")) {
                               if (b.v == null) {
                                  profileTempl3 = b.s;
                                  if (profileTempl3 == null) {
                                     a.S("mTemplateCardsStub");
                                  }
                                  obj2 = profileTempl3.inflate();
                                  if (!obj2 instanceof RecyclerView) {
                                     obj2 = profileTempl1;
                                  }
                                  if (obj2 != null) {
                                     obj2.setVisibility(0);
                                     int paddingTop = obj2.getPaddingTop();
                                     int i = 0x7f070253;
                                     int i1 = 0x7f0702ab;
                                     if (e.a(b.t)) {
                                        b.A = 10.00f;
                                        b.B = i1;
                                        b.C = i;
                                     }else {
                                        Object obj3 = PatchProxy.applyOneRefs(mUserProfile1, b, profileTempl, "10");
                                        if (obj3 != patchProxyRe) {
                                           b2 = obj3.booleanValue();
                                        }else {
                                           profileTempl = b.r;
                                           if (profileTempl == null) {
                                              a.S("mUser");
                                           }
                                           if (r2.a(profileTempl, mUserProfile1)) {
                                              profileTempl = b.r;
                                              if (profileTempl == null) {
                                                 a.S("mUser");
                                              }
                                              Object obj4 = PatchProxy.applyTwoRefs(profileTempl, mUserProfile1, profileTempl1, r2.class, str);
                                              if (obj4 != patchProxyRe) {
                                                 b2 = obj4.booleanValue();
                                              }else {
                                                 a.p(profileTempl, "user");
                                                 a.p(mUserProfile1, "userProfile");
                                                 b2 = (!d3.d(profileTempl, mUserProfile1) && !s1.c(mUserProfile1))? true: false;
                                              }
                                              if (b2) {
                                                 b2 = false;
                                              }
                                           }
                                           b2 = true;
                                        }
                                        if (b2) {
                                           paddingTop = a1.d(0x7f0702e3);
                                        }
                                        b.A = 12.00f;
                                        b.B = i1;
                                        b.C = i;
                                        if (k0.j()) {
                                           ViewGroup$LayoutParams layoutParams = obj2.getLayoutParams();
                                           if (!layoutParams instanceof ViewGroup$MarginLayoutParams) {
                                              layoutParams = profileTempl1;
                                           }
                                           if (layoutParams != null) {
                                              layoutParams.topMargin = a1.d(0x7f07025d);
                                              obj2.setLayoutParams(layoutParams);
                                           }
                                        }
                                     }
                                     obj2.setLayoutManager(new NpaLinearLayoutManager(obj2.getContext(), 0, 0));
                                     obj2.setItemAnimator(profileTempl1);
                                     obj2.setPadding(0, paddingTop, a1.d(b.B), a1.d(b.C));
                                     obj2.addItemDecoration(new b(0, a1.d(b.z), a1.d(b.z), a1.e(b.A)));
                                     a = l1.a;
                                  }else {
                                     obj2 = profileTempl1;
                                  }
                                  b.v = obj2;
                               }
                               obj1 = b.w;
                               if (obj1 == null || obj1.w == profileTempl2) {
                                  profileTempl = b.r;
                                  if (profileTempl == null) {
                                     a.S("mUser");
                                  }
                                  String id = profileTempl.getId();
                                  a.o(id, "mUser.id");
                                  ProfileTemplateCardGroupPresenter u = b.u;
                                  profileTempl = b.p;
                                  if (profileTempl == null) {
                                     a.S("mFragment");
                                  }
                                  ProfileTemplateCardAdapter profileTempl4 = new ProfileTemplateCardAdapter(id, u, profileTempl, b.t, b.y);
                                  b.w = obj1;
                                  ProfileTemplateCardGroupPresenter v = b.v;
                                  profileTempl2 = b.u;
                                  ProfileTemplateCardGroupPresenter r = b.r;
                                  if (r == null) {
                                     a.S("mUser");
                                  }
                                  c3 uoc3 = new c3(v, obj1, profileTempl2, r.getId());
                                  b.x = profileTempl;
                                  profileTempl.d();
                               }
                               obj1 = b.v;
                               if (obj1 != null) {
                                  profileTempl = b.w;
                                  if (profileTempl != null) {
                                     profileTempl.W0(mProfileTemp);
                                     profileTempl.k0();
                                     profileTempl1 = profileTempl;
                                  }
                                  obj1.setAdapter(profileTempl1);
                               }
                               obj1 = b.v;
                               if (obj1 != null) {
                                  obj1.setVisibility(0);
                               }
                               obj1 = b.x;
                               if (obj1 != null) {
                                  obj1.c();
                               }
                            }
                         }
                      }
                      b1 = false;
                      goto label_00ac ;
                   }
                }
             }
          label_022c :
             obj1 = b.v;
             if (obj1 != null) {
                obj1.setVisibility(8);
             }
          }
       }
       return;
    }
}
