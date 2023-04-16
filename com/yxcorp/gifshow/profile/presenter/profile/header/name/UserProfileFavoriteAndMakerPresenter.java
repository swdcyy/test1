package com.yxcorp.gifshow.profile.presenter.profile.header.name.UserProfileFavoriteAndMakerPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.profile.presenter.profile.header.name.UserProfileFavoriteAndMakerPresenter$mExpendTouchSize$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.profile.presenter.profile.header.name.UserProfileFavoriteAndMakerPresenter$mFollowListener$2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import s1c.j1;
import s3c.b;
import java.util.Set;
import brd.t;
import j5c.c;
import com.yxcorp.gifshow.profile.presenter.profile.header.name.UserProfileFavoriteAndMakerPresenter$a;
import z5c.l0;
import erd.g;
import crd.b;
import xl8.d;
import y8c.a;
import lnc.b9;
import com.yxcorp.gifshow.profile.presenter.profile.header.name.UserProfileFavoriteAndMakerPresenter$b;
import xl8.b;
import com.yxcorp.gifshow.profile.presenter.profile.header.name.UserProfileFavoriteAndMakerPresenter$c;
import com.kwai.library.widget.popup.common.c;
import qrd.l1;
import z5c.u;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.framework.model.user.User;
import im8.f;
import java.lang.Boolean;
import z5c.y1;
import k2b.f3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import z5c.b0;
import k2b.e0;
import com.kwai.framework.model.user.UserProfile;
import z5c.d3;
import android.view.View;
import com.kwai.framework.model.user.User$FollowStatus;
import u3c.h;
import com.yxcorp.gifshow.profile.model.UserProfileMeta;
import u3c.i;
import com.kwai.framework.model.user.IntimateTag;
import z5c.f3;
import com.yxcorp.gifshow.profile.presenter.profile.header.name.UserProfileFavoriteAndMakerPresenter$d;
import android.view.View$OnClickListener;
import lnc.i3;
import java.lang.Integer;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.image.callercontext.a$a;
import com.yxcorp.image.callercontext.a;
import com.yxcorp.image.callercontext.ImageSource;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.widget.TextView;
import java.lang.CharSequence;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewStub;
import com.yxcorp.gifshow.profile.presenter.profile.header.name.UserProfileFavoriteAndMakerPresenter$e;
import a3c.e;
import lnc.a1;
import z5c.g3;
import z5c.h3;
import ekd.p1;
import lu7.f;
import z5c.r2;
import r4c.w;
import z5c.k1;
import ekd.m1;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public final class UserProfileFavoriteAndMakerPresenter extends PresenterV2	// class@0014ef
{
    public b A;
    public int B;
    public a C;
    public boolean D;
    public final p E;
    public boolean F;
    public boolean G;
    public final p H;
    public ViewStub p;
    public View q;
    public ViewStub r;
    public View s;
    public ViewStub t;
    public View u;
    public BaseFragment v;
    public j1 w;
    public User x;
    public f y;
    public c z;

    public void UserProfileFavoriteAndMakerPresenter(){
       super();
       this.B = 5;
       this.E = s.c(UserProfileFavoriteAndMakerPresenter$mExpendTouchSize$2.INSTANCE);
       this.H = s.c(new UserProfileFavoriteAndMakerPresenter$mFollowListener$2(this));
    }
    public void E8(){
       g a;
       if (PatchProxy.applyVoid(null, this, UserProfileFavoriteAndMakerPresenter.class, "17")) {
          return;
       }
       UserProfileFavoriteAndMakerPresenter tw = this.w;
       if (tw == null) {
          a.S("mCallerContext");
       }
       tw.b.add(this.R8());
       tw = this.z;
       if (tw == null) {
          a.S("mLoadState");
       }
       a = l0.a;
       this.X7(tw.e().subscribe(new UserProfileFavoriteAndMakerPresenter$a(this), a));
       tw = this.x;
       if (tw == null) {
          a.S("mUser");
       }
       UserProfileFavoriteAndMakerPresenter tv = this.v;
       if (tv == null) {
          a.S("mFragment");
       }
       this.X7(b9.d(tw, tv).subscribe(new UserProfileFavoriteAndMakerPresenter$b(this), a));
       tw = this.A;
       if (tw == null) {
          a.S("mNameObservableData");
       }
       this.X7(tw.observable().subscribe(new UserProfileFavoriteAndMakerPresenter$c(this), a));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, UserProfileFavoriteAndMakerPresenter.class, "26")) {
          return;
       }
       u.c(this.C);
       UserProfileFavoriteAndMakerPresenter tw = this.w;
       if (tw == null) {
          a.S("mCallerContext");
       }
       tw.b.remove(this.R8());
       return;
    }
    public final int P8(){
       Object obj = PatchProxy.apply(null, this, UserProfileFavoriteAndMakerPresenter.class, "13");
       if (obj == PatchProxyResult.class) {
          obj = this.E.getValue();
       }
       return obj.intValue();
    }
    public final b R8(){
       Object obj = PatchProxy.apply(null, this, UserProfileFavoriteAndMakerPresenter.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.H.getValue();
    }
    public final b S8(){
       UserProfileFavoriteAndMakerPresenter obj = PatchProxy.apply(null, this, UserProfileFavoriteAndMakerPresenter.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.A;
       if (obj == null) {
          a.S("mNameObservableData");
       }
       return obj;
    }
    public final User V8(){
       UserProfileFavoriteAndMakerPresenter obj = PatchProxy.apply(null, this, UserProfileFavoriteAndMakerPresenter.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.x;
       if (obj == null) {
          a.S("mUser");
       }
       return obj;
    }
    public final f W8(){
       UserProfileFavoriteAndMakerPresenter obj = PatchProxy.apply(null, this, UserProfileFavoriteAndMakerPresenter.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.y;
       if (obj == null) {
          a.S("mUserProfileRef");
       }
       return obj;
    }
    public final void X8(boolean p0){
       UserProfileFavoriteAndMakerPresenter userProfileF = UserProfileFavoriteAndMakerPresenter.class;
       if (PatchProxy.isSupport(userProfileF) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, userProfileF, "18")) {
          return;
       }
       if (this.D == null && p0) {
          userProfileF = this.v;
          if (userProfileF == null) {
             a.S("mFragment");
          }
          UserProfileFavoriteAndMakerPresenter tx = this.x;
          if (tx == null) {
             a.S("mUser");
          }
          if (!PatchProxy.applyVoidTwoRefs(userProfileF, tx, null, y1.class, "71")) {
             f3 uof3 = f3.i(0x7679);
             uof3.b(b0.g(tx.getId()));
             uof3.h(userProfileF);
          }
       }
    label_004d :
       this.D = p0;
       return;
    }
    public final void Y8(boolean p0){
       UserProfileFavoriteAndMakerPresenter tq;
       View view;
       int i3;
       UserProfileFavoriteAndMakerPresenter userProfileF = UserProfileFavoriteAndMakerPresenter.class;
       if (PatchProxy.isSupport(userProfileF) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, userProfileF, "19")) {
          return;
       }
       userProfileF = this.x;
       String str = "mUser";
       if (userProfileF == null) {
          a.S(str);
       }
       UserProfileFavoriteAndMakerPresenter ty = this.y;
       String str1 = "mUserProfileRef";
       if (ty == null) {
          a.S(str1);
       }
       int i = 8;
       if (d3.d(userProfileF, ty.get())) {
          tq = this.q;
          if (tq != null) {
             tq.setVisibility(i);
          }
          tq = this.s;
          if (tq != null) {
             tq.setVisibility(i);
          }
          return;
       }else {
          userProfileF = this.x;
          if (userProfileF == null) {
             a.S(str);
          }
          ViewGroup$LayoutParams layoutParams = null;
          if (userProfileF.getFollowStatus() != User$FollowStatus.FOLLOWING) {
             userProfileF = this.y;
             if (userProfileF == null) {
                a.S(str1);
             }
             UserProfile userProfile = userProfileF.get();
             if (!PatchProxy.applyVoidTwoRefs(userProfile, layoutParams, layoutParams, h.class, "26") && userProfile != null) {
                UserProfileMeta userProfileM = i.c(userProfile);
                if (userProfileM != null) {
                   userProfileM.mIntimateTag = layoutParams;
                }
             }
          }
       label_0076 :
          userProfileF = this.y;
          if (userProfileF == null) {
             a.S(str1);
          }
          IntimateTag intimateTag = h.h(userProfileF.get());
          int i1 = 0;
          if (intimateTag != null) {
             tq = this.q;
             if (tq != null) {
                tq.setVisibility(i);
             }
             if (this.s == null) {
                tq = this.r;
                if (tq == null) {
                   a.S("mIntimateTagViewStub");
                }
                view = f3.a(tq);
                view.setOnClickListener(new UserProfileFavoriteAndMakerPresenter$d(this));
                this.s = view;
                f3 uof3 = f3.j("RELATIONSHIP_ICON");
                i3 oi3 = i3.f();
                UserProfileFavoriteAndMakerPresenter ty1 = this.y;
                if (ty1 == null) {
                   a.S(str1);
                }
                oi3.c("icon_type", Integer.valueOf(h.g(ty1.get())));
                uof3.m(oi3.e());
                ty = this.x;
                if (ty == null) {
                   a.S(str);
                }
                uof3.b(b0.g(ty.getId()));
                UserProfileFavoriteAndMakerPresenter tv = this.v;
                if (tv == null) {
                   a.S("mFragment");
                }
                uof3.h(tv);
             }
             IntimateTag icons = intimateTag.icons;
             if (icons != null) {
                int i2 = (!icons.length)? 1: 0;
                if ((i2 ^ 1) == 1) {
                   tq = this.s;
                   if (tq != null) {
                      KwaiImageView kwaiImageVie = tq.findViewById(R.id.intimate_tag_icon);
                      if (kwaiImageVie != null) {
                         a$a uoa = a.d();
                         uoa.b(":ks-features:ft-social:profile");
                         uoa.d(ImageSource.ICON);
                         kwaiImageVie.M(intimateTag.icons[i1], uoa.a());
                      }
                   }
                }
             }
          label_012d :
             tq = this.s;
             if (tq != null) {
                TextView textView = tq.findViewById(R.id.initmate_tag_level_tv);
                if (textView != null) {
                   textView.setText(String.valueOf(intimateTag.level));
                   ViewGroup$LayoutParams layoutParams1 = textView.getLayoutParams();
                   if (layoutParams1 instanceof ViewGroup$MarginLayoutParams) {
                      layoutParams = layoutParams1;
                   }
                   if (layoutParams != null) {
                      if (intimateTag.level == 1) {
                         i1 = -1;
                      }
                      layoutParams.leftMargin = i1;
                      textView.setLayoutParams(layoutParams);
                   }
                }
             }
             return;
          }else {
             userProfileF = this.s;
             if (userProfileF != null) {
                userProfileF.setVisibility(i);
             }
             if (!p0) {
                tq = this.q;
                if (tq != null) {
                   tq.setVisibility(i);
                }
                return;
             }else if(this.q == null){
                tq = this.p;
                if (tq == null) {
                   a.S("mFavoriteViewStub");
                }
                view = tq.inflate();
                view.setOnClickListener(new UserProfileFavoriteAndMakerPresenter$e(this));
                this.q = view;
             }
             tq = this.q;
             if (tq != null) {
                tq.setVisibility(i1);
             }
             tq = this.q;
             if (tq != null) {
                i3 = 0x7f070295;
                if (!e.a(this.B)) {
                   g3.c(tq, a1.d(i3), a1.d(i3));
                }else {
                   h3.b(tq, a1.d(i3), a1.d(i3));
                }
                p1.c(tq, this.P8(), this.P8(), this.P8(), this.P8());
             }
             return;
          }
       }
    }
    public final void Z8(CharSequence p0){
       UserProfileFavoriteAndMakerPresenter tu;
       boolean b;
       l1 a;
       UserProfileFavoriteAndMakerPresenter userProfileF = UserProfileFavoriteAndMakerPresenter.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, userProfileF, "22")) {
          return;
       }
       UserProfileFavoriteAndMakerPresenter tx = this.x;
       String str = "mUser";
       if (tx == null) {
          a.S(str);
       }
       UserProfileFavoriteAndMakerPresenter ty = this.y;
       String str1 = "mUserProfileRef";
       if (ty == null) {
          a.S(str1);
       }
       int i = 8;
       if (!d3.d(tx, ty.get())) {
          tx = this.x;
          if (tx == null) {
             a.S(str);
          }
          User$FollowStatus fOLLOWING = User$FollowStatus.FOLLOWING;
          if (tx.mFollowStatus == fOLLOWING) {
             tx = this.x;
             if (tx == null) {
                a.S(str);
             }
             if (a.g(tx.getName(), p0)) {
                tu = this.x;
                if (tu == null) {
                   a.S(str);
                }
                if (!f.i(tu)) {
                   Object[] objArray = null;
                   Object obj = PatchProxy.apply(objArray, this, userProfileF, "23");
                   if (obj != PatchProxyResult.class) {
                      b = obj.booleanValue();
                   }else {
                      tx = this.x;
                      if (tx == null) {
                         a.S(str);
                      }
                      UserProfileFavoriteAndMakerPresenter ty1 = this.y;
                      if (ty1 == null) {
                         a.S(str1);
                      }
                      Object obj1 = ty1.get();
                      a.o(obj1, "mUserProfileRef.get\(\)");
                      if (r2.a(tx, obj1)) {
                         tx = this.x;
                         if (tx == null) {
                            a.S(str);
                         }
                         if (tx.getFollowStatus() == fOLLOWING) {
                         label_00af :
                            b = true;
                         }
                      }
                      tx = this.x;
                      if (tx == null) {
                         a.S(str);
                      }
                      if (tx.mVisitorBeFollowed != null) {
                         tx = this.x;
                         if (tx == null) {
                            a.S(str);
                         }
                         if (tx.getFollowStatus() == fOLLOWING) {
                            goto label_00af ;
                         }
                      }
                      b = false;
                   }
                   if (b) {
                      tx = this.x;
                      if (tx == null) {
                         a.S(str);
                      }
                      if (!PatchProxy.applyVoidOneRefs(tx, this, userProfileF, "24")) {
                         if (this.u == null) {
                            userProfileF = this.B;
                            String str2 = "mAliasMarkViewStub";
                            if (userProfileF != 4) {
                               int i1 = 0x7f0d164f;
                               if (userProfileF != 5) {
                                  userProfileF = this.t;
                                  if (userProfileF == null) {
                                     a.S(str2);
                                  }
                                  userProfileF.setLayoutResource(i1);
                               }else {
                                  userProfileF = this.t;
                                  if (userProfileF == null) {
                                     a.S(str2);
                                  }
                                  userProfileF.setLayoutResource(i1);
                               }
                            }else {
                               userProfileF = this.t;
                               if (userProfileF == null) {
                                  a.S(str2);
                               }
                               userProfileF.setLayoutResource(R.layout.arg_RES_7f0d1650);
                            }
                            userProfileF = this.t;
                            if (userProfileF == null) {
                               a.S(str2);
                            }
                            View view = userProfileF.inflate();
                            if (view != null) {
                               view.setOnClickListener(new w(view, this, tx));
                               p1.c(view, this.P8(), this.P8(), this.P8(), this.P8());
                               a = l1.a;
                            }else {
                               view = objArray;
                            }
                            this.u = view;
                         }
                         if (this.F != null || this.G != null) {
                            userProfileF = this.v;
                            if (userProfileF == null) {
                               a.S("mFragment");
                            }
                            y1.k(userProfileF, tx, 3, "text");
                            this.F = false;
                            this.G = false;
                         }
                         userProfileF = this.u;
                         if (userProfileF != null) {
                            if (e.a(this.B)) {
                               k1.c(userProfileF, a1.d(R.dimen.arg_RES_7f0702b8));
                            }else if(!userProfileF instanceof TextView){
                               objArray = userProfileF;
                            }
                            if (objArray != null) {
                               g3.e(objArray, 11);
                            }
                         }
                         tu = this.u;
                         if (tu != null) {
                            tu.setVisibility(false);
                         }
                      }
                   }else {
                      tu = this.u;
                      if (tu != null) {
                         tu.setVisibility(i);
                      }
                   }
                }else {
                label_0178 :
                   tu = this.u;
                   if (tu != null) {
                      tu.setVisibility(i);
                   }
                }
             }else {
                goto label_0178 ;
             }
          label_017f :
             return;
          }
       }
       tu = this.u;
       if (tu != null) {
          tu.setVisibility(i);
       }
       return;
    }
    public void doBindView(View p0){
       View view;
       if (PatchProxy.applyVoidOneRefs(p0, this, UserProfileFavoriteAndMakerPresenter.class, "15")) {
          return;
       }
       a.p(p0, "view");
       view = m1.f(p0, R.id.favorite_follow_stub);
       a.o(view, "ViewBindUtils.bindWidget¡­.id.favorite_follow_stub\)");
       this.p = view;
       view = m1.f(p0, R.id.intimate_tag_view_stub);
       a.o(view, "ViewBindUtils.bindWidget¡­d.intimate_tag_view_stub\)");
       this.r = view;
       p0 = m1.f(p0, R.id.user_alias_mark);
       a.o(p0, "ViewBindUtils.bindWidget¡­ew, R.id.user_alias_mark\)");
       this.t = p0;
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, UserProfileFavoriteAndMakerPresenter.class, "16")) {
          return;
       }
       f obj = this.r8("PROFILE_FRAGMENT");
       a.o(obj, "inject\(ProfileCommonAccessIds.PROFILE_FRAGMENT\)");
       this.v = obj;
       obj = this.q8(j1.class);
       a.o(obj, "inject\(UserProfileCallerContext::class.java\)");
       this.w = obj;
       obj = this.q8(User.class);
       a.o(obj, "inject\(User::class.java\)");
       this.x = obj;
       obj = this.x8("DATA_USER_PROFILE");
       a.o(obj, "injectRef\(SocialAccessIds.DATA_USER_PROFILE\)");
       this.y = obj;
       UserProfileFavoriteAndMakerPresenter obj1 = this.r8("PROFILE_LOAD_STATE");
       a.o(obj1, "inject\(ProfileCommonAccessIds.PROFILE_LOAD_STATE\)");
       this.z = obj1;
       obj1 = this.w;
       if (obj1 == null) {
          a.S("mCallerContext");
       }
       j1 j = obj1.j;
       a.o(j, "mCallerContext.mNameObservableData");
       this.A = j;
       Object obj2 = this.r8("PROFILE_STYLE");
       a.o(obj2, "inject\(ProfileCommonAccessIds.PROFILE_STYLE\)");
       this.B = obj2.intValue();
       return;
    }
}
