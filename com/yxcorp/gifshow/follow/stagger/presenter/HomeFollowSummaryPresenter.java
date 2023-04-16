package com.yxcorp.gifshow.follow.stagger.presenter.HomeFollowSummaryPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.follow.stagger.presenter.HomeFollowSummaryPresenter$a;
import nsd.u;
import com.yxcorp.gifshow.follow.stagger.presenter.HomeFollowSummaryPresenter$mMarginRight$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.follow.stagger.presenter.HomeFollowSummaryPresenter$b;
import com.yxcorp.gifshow.follow.stagger.presenter.HomeFollowSummaryPresenter$d;
import com.yxcorp.gifshow.follow.stagger.presenter.HomeFollowSummaryPresenter$c;
import com.kuaishou.android.model.mix.CommonMeta;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import wkd.b;
import gg6.d;
import brd.t;
import t45.d;
import brd.z;
import eja.q1;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import android.view.ViewStub;
import android.view.View;
import ga5.d;
import android.widget.TextView;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.content.Context;
import com.yxcorp.gifshow.util.DateUtils;
import java.lang.StringBuilder;
import com.kwai.robust.PatchProxyResult;
import android.content.res.Resources;
import com.kwai.framework.model.user.User;
import lu7.f;
import xl8.b;
import xl8.d;
import y8c.a;
import lnc.b9;
import eja.o1;
import erd.o;
import eja.p1;
import com.yxcorp.utility.n;
import com.kwai.component.feedstaggercard.PhotoItemViewParam;
import android.view.View$OnAttachStateChangeListener;
import android.widget.ImageView;
import java.util.Objects;
import android.view.ViewGroup;
import android.view.ViewGroup$LayoutParams;
import lnc.a1;
import java.lang.Number;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import android.view.ViewGroup$MarginLayoutParams;
import com.kuaishou.android.model.mix.PhotoMeta;
import java.lang.Boolean;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.view.View$OnClickListener;
import ekd.m1;
import com.kwai.library.widget.textview.AdjustSizeTextView;

public class HomeFollowSummaryPresenter extends PresenterV2	// class@001201
{
    public ViewGroup A;
    public TextView B;
    public TextView C;
    public ViewStub D;
    public int E;
    public final p F;
    public final HomeFollowSummaryPresenter$b G;
    public boolean H;
    public boolean I;
    public final View$OnClickListener J;
    public final View$OnAttachStateChangeListener K;
    public PhotoMeta p;
    public CommonMeta q;
    public QPhoto r;
    public User s;
    public a t;
    public PhotoItemViewParam u;
    public b v;
    public AdjustSizeTextView w;
    public KwaiImageView x;
    public View y;
    public ViewStub z;
    public static final HomeFollowSummaryPresenter$a L;

    static {
       HomeFollowSummaryPresenter.L = new HomeFollowSummaryPresenter$a(null);
    }
    public void HomeFollowSummaryPresenter(){
       super();
       this.F = s.c(HomeFollowSummaryPresenter$mMarginRight$2.INSTANCE);
       this.G = new HomeFollowSummaryPresenter$b();
       this.J = new HomeFollowSummaryPresenter$d(this);
       this.K = new HomeFollowSummaryPresenter$c(this);
    }
    public static final CommonMeta P8(HomeFollowSummaryPresenter p0){
       p0 = p0.q;
       if (p0 == null) {
          a.S("mCommonMeta");
       }
       return p0;
    }
    public static final QPhoto R8(HomeFollowSummaryPresenter p0){
       p0 = p0.r;
       if (p0 == null) {
          a.S("mQPhoto");
       }
       return p0;
    }
    public void E8(){
       HomeFollowSummaryPresenter tt;
       View view1;
       HomeFollowSummaryPresenter ts;
       HomeFollowSummaryPresenter homeFollowSu = HomeFollowSummaryPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, homeFollowSu, "6")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, homeFollowSu, "8")) {
          this.X7(b.a(-565398134).c().observeOn(d.a).subscribe(new q1(this), Functions.d()));
       }
       this.V8();
       if (!PatchProxy.applyVoid(objArray, this, homeFollowSu, "10")) {
          if (!PatchProxy.applyVoid(objArray, this, homeFollowSu, "11")) {
             HomeFollowSummaryPresenter tq = this.q;
             String str = "mCommonMeta";
             if (tq == null) {
                a.S(str);
             }
             CommonMeta mCreated = tq.mCreated;
             tq = this.D;
             if (tq == null) {
                a.S("mAvatarRightSideFeedGeneralCoverLabelViewStub");
             }
             View view = d.a(tq);
             if (view == null || (!view.getVisibility() || mCreated - null <= 0)) {
                tq = this.w;
                if (tq == null) {
                   a.S("mSubject");
                }
                tq.setVisibility(8);
             }else {
                tq = this.w;
                if (tq == null) {
                   a.S("mSubject");
                }
                tq.setVisibility(0);
                tq = this.q;
                if (tq == null) {
                   a.S(str);
                }
                if (TextUtils.x(tq.mShowTime)) {
                   tq = this.q;
                   if (tq == null) {
                      a.S(str);
                   }
                   tq.mShowTime = DateUtils.w(this.getContext(), mCreated);
                }
                tq = this.w;
                if (tq == null) {
                   a.S("mSubject");
                }
                tq.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                tq = this.w;
                if (tq == null) {
                   a.S("mSubject");
                }
                HomeFollowSummaryPresenter tq1 = this.q;
                if (tq1 == null) {
                   a.S(str);
                }
                tq.setText(tq1.mShowTime);
                String str1 = "";
                str = PatchProxy.apply(objArray, this, homeFollowSu, "18");
                if (str != PatchProxyResult.class) {
                }else {
                   String str2 = "rootView";
                   if (this.s != null) {
                      view1 = this.m8();
                      a.o(view1, str2);
                      Object[] objArray1 = new Object[]{f.c(ts)};
                      ts = this.s;
                      a.m(ts);
                      str = view1.getResources().getString(R.string.arg_RES_7f100040, objArray1);
                      a.o(str, "rootView.resources.getSt¡­mUser!!\n        \)\n      \)");
                   }else {
                      view1 = this.m8();
                      a.o(view1, str2);
                      str = view1.getResources().getString(R.string.arg_RES_7f103dfd);
                      a.o(str, "rootView.resources.getString\(R.string.posts\)");
                   }
                }
                str1 = str1+str;
                tt = this.w;
                if (tt == null) {
                   a.S("mSubject");
                }
                str1 = str1+tt.getText();
                if (!PatchProxy.applyVoidOneRefs(str1, this, homeFollowSu, "17")) {
                   a.p(str1, "contentDescription");
                   tt = this.w;
                   if (tt == null) {
                      a.S("mSubject");
                   }
                   tt.setImportantForAccessibility(2);
                   tt = this.v;
                   if (tt != null) {
                      tt.d(str1);
                   }
                }
             }
             if (this.p != null) {
                this.W8();
                tq = this.p;
                tt = this.t;
                if (tt == null) {
                   a.S("mFragment");
                }
                this.X7(b9.d(tq, tt).distinctUntilChanged(o1.b).subscribe(new p1(this), Functions.d()));
             }else {
                View[] viewArray = new View[2];
                tt = this.y;
                if (tt == null) {
                   a.S("mLikeIconContainer");
                }
                viewArray[0] = tt;
                tt = this.A;
                if (tt == null) {
                   a.S("mFollowLikeCountLay");
                }
                viewArray[1] = tt;
                n.Z(8, viewArray);
             }
          }
          if (!PatchProxy.applyVoid(objArray, this, homeFollowSu, "20")) {
             homeFollowSu = this.w;
             if (homeFollowSu == null) {
                a.S("mSubject");
             }
             if (TextUtils.x(homeFollowSu.getText())) {
                homeFollowSu = this.w;
                if (homeFollowSu == null) {
                   a.S("mSubject");
                }
                HomeFollowSummaryPresenter tu = this.u;
                if (tu == null) {
                   a.S("mParam");
                }
                homeFollowSu.setCompoundDrawablePadding(tu.mEmptyTextDrawablePaddingRight);
             }else {
                homeFollowSu = this.w;
                if (homeFollowSu == null) {
                   a.S("mSubject");
                }
                homeFollowSu.setCompoundDrawablePadding(this.E);
             }
          }
       }
       homeFollowSu = this.x;
       if (homeFollowSu == null) {
          a.S("mLikeIcon");
       }
       homeFollowSu.addOnAttachStateChangeListener(this.K);
       return;
    }
    public void F8(){
       HomeFollowSummaryPresenter homeFollowSu = HomeFollowSummaryPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, homeFollowSu, "4")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, homeFollowSu, "5") && this.H == null) {
          homeFollowSu = this.G;
          HomeFollowSummaryPresenter tw = this.w;
          if (tw == null) {
             a.S("mSubject");
          }
          Objects.requireNonNull(homeFollowSu);
          if (!PatchProxy.applyVoidOneRefs(tw, homeFollowSu, HomeFollowSummaryPresenter$b.class, "1") && tw != null) {
             homeFollowSu.a = tw.getCurrentTextColor();
             homeFollowSu.b = tw.getTextSize();
          }
          homeFollowSu = this.w;
          if (homeFollowSu == null) {
             a.S("mSubject");
          }
          this.E = homeFollowSu.getCompoundDrawablePadding();
          this.H = true;
       }
       return;
    }
    public void J8(){
       HomeFollowSummaryPresenter homeFollowSu = HomeFollowSummaryPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, homeFollowSu, "7")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, homeFollowSu, "16")) {
          homeFollowSu = this.A;
          if (homeFollowSu == null) {
             a.S("mFollowLikeCountLay");
          }
          homeFollowSu.setVisibility(8);
          homeFollowSu = this.y;
          String str = "mLikeIconContainer";
          if (homeFollowSu == null) {
             a.S(str);
          }
          ViewGroup$LayoutParams layoutParams = homeFollowSu.getLayoutParams();
          layoutParams.width = a1.d(0x7f0702e8);
          HomeFollowSummaryPresenter ty = this.y;
          if (ty == null) {
             a.S(str);
          }
          ty.setLayoutParams(layoutParams);
       }
       homeFollowSu = this.x;
       if (homeFollowSu == null) {
          a.S("mLikeIcon");
       }
       homeFollowSu.removeOnAttachStateChangeListener(this.K);
       return;
    }
    public final int S8(){
       Object obj = PatchProxy.apply(null, this, HomeFollowSummaryPresenter.class, "1");
       if (obj == PatchProxyResult.class) {
          obj = this.F.getValue();
       }
       return obj.intValue();
    }
    public final void V8(){
       HomeFollowSummaryPresenter homeFollowSu = HomeFollowSummaryPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, homeFollowSu, "12")) {
          return;
       }
       HomeFollowSummaryPresenter tG = this.G;
       HomeFollowSummaryPresenter tw = this.w;
       if (tw == null) {
          a.S("mSubject");
       }
       Objects.requireNonNull(tG);
       if (!PatchProxy.applyVoidOneRefs(tw, tG, HomeFollowSummaryPresenter$b.class, "2") && tw != null) {
          tw.setTextColor(tG.a);
          tw.setTextSize(0, tG.b);
       }
       Object obj = b.a(-565398134);
       a.o(obj, "Singleton.get\(KWAccessibilityManager::class.java\)");
       if (obj.b()) {
          tG = this.w;
          if (tG == null) {
             a.S("mSubject");
          }
          Object obj1 = PatchProxy.apply(objArray, this, homeFollowSu, "9");
          int i = (obj1 != PatchProxyResult.class)? obj1.intValue(): a1.a(R.color.arg_RES_7f060bd5);
          tG.setTextColor(i);
       }
       return;
    }
    public final void W8(){
       HomeFollowSummaryPresenter tw;
       View view;
       int i2;
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       HomeFollowSummaryPresenter homeFollowSu = HomeFollowSummaryPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, homeFollowSu, "13")) {
          return;
       }
       HomeFollowSummaryPresenter tr = this.r;
       if (tr == null) {
          a.S("mQPhoto");
       }
       String str = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams";
       int i = 2;
       int i1 = 8;
       String str1 = "mFollowLikeCountLay";
       String str2 = "mAvatarRightSideFeedGeneralCoverLabelViewStub";
       if (r1.S2(tr.mEntity)) {
          tw = this.w;
          if (tw == null) {
             a.S("mSubject");
          }
          tw.setPadding(0, 0, a1.d(R.dimen.arg_RES_7f070329), 0);
          tw = this.D;
          if (tw == null) {
             a.S(str2);
          }
          view = d.a(tw);
          if (view != null && !view.getVisibility()) {
             ViewGroup$LayoutParams layoutParams = view.getLayoutParams();
             Objects.requireNonNull(layoutParams, str);
             if (layoutParams.rightMargin != this.S8()) {
                layoutParams.rightMargin = this.S8();
                view.setLayoutParams(layoutParams);
             }
          }
          View[] viewArray = new View[i];
          homeFollowSu = this.y;
          if (homeFollowSu == null) {
             a.S("mLikeIconContainer");
          }
          viewArray[0] = homeFollowSu;
          homeFollowSu = this.A;
          if (homeFollowSu == null) {
             a.S(str1);
          }
          viewArray[1] = homeFollowSu;
          n.Z(i1, viewArray);
          return;
       }else {
          tr = this.D;
          if (tr == null) {
             a.S(str2);
          }
          View view1 = d.a(tr);
          if (view1 != null && !view1.getVisibility()) {
             ViewGroup$LayoutParams layoutParams1 = view1.getLayoutParams();
             Objects.requireNonNull(layoutParams1, str);
             if (layoutParams1.rightMargin != null) {
                layoutParams1.rightMargin = 0;
                view1.setLayoutParams(layoutParams1);
             }
          }
          if (!PatchProxy.applyVoid(objArray, this, homeFollowSu, "14")) {
             tr = this.p;
             String str3 = (tr != null)? TextUtils.N((long)tr.getLikeCount()): objArray;
             if (!TextUtils.x(str3)) {
                HomeFollowSummaryPresenter tp = this.p;
                tp = (tp != null && tp.mShowLikeCount == 1)? 1: 0;
                if (tp) {
                   b = true;
                label_00d8 :
                   this.I = b;
                   if (b) {
                      tp = this.A;
                      if (tp == null) {
                         a.S(str1);
                      }
                      tp.setVisibility(0);
                      tp = this.y;
                      if (tp == null) {
                         a.S("mLikeIconContainer");
                      }
                      ViewGroup$LayoutParams layoutParams2 = tp.getLayoutParams();
                      layoutParams2.width = a1.d(0x7f0702cc);
                      HomeFollowSummaryPresenter ty = this.y;
                      if (ty == null) {
                         a.S("mLikeIconContainer");
                      }
                      ty.setLayoutParams(layoutParams2);
                      a.m(str3);
                      View[] obj1 = PatchProxy.applyOneRefs(str3, this, homeFollowSu, "15");
                      if (obj1 != patchProxyRe) {
                         b = obj1.booleanValue();
                      }else {
                         Matcher matcher = Pattern.compile(".*[a-zA-Z]+.*").matcher(str3);
                         a.o(matcher, "Pattern.compile\(regex\).matcher\(likeCounts\)");
                         b = matcher.matches();
                      }
                      if (b) {
                         tp = this.B;
                         if (tp == null) {
                            a.S("mFollowLikeCountsPre");
                         }
                         tp.setVisibility(0);
                         tp = this.C;
                         if (tp == null) {
                            a.S("mFollowLikeCountsNex");
                         }
                         tp.setVisibility(i1);
                         tp = this.B;
                         if (tp == null) {
                            a.S("mFollowLikeCountsPre");
                         }
                         tp.setText(str3);
                      }else if(str3.length() <= i){
                         tp = this.B;
                         if (tp == null) {
                            a.S("mFollowLikeCountsPre");
                         }
                         tp.setVisibility(i1);
                         tp = this.C;
                         if (tp == null) {
                            a.S("mFollowLikeCountsNex");
                         }
                         tp.setVisibility(0);
                         tp = this.C;
                         if (tp == null) {
                            a.S("mFollowLikeCountsNex");
                         }
                         tp.setText(str3);
                      }else {
                         obj1 = new View[i];
                         HomeFollowSummaryPresenter tB = this.B;
                         if (tB == null) {
                            a.S("mFollowLikeCountsPre");
                         }
                         obj1[0] = tB;
                         tB = this.C;
                         if (tB == null) {
                            a.S("mFollowLikeCountsNex");
                         }
                         obj1[1] = tB;
                         n.Z(0, obj1);
                         str = str3.substring(0, (str3.length() - i));
                         a.o(str, "\(this as java.lang.Strin¡­ing\(startIndex, endIndex\)");
                         str3 = str3.substring((str3.length() - i));
                         a.o(str3, "\(this as java.lang.String\).substring\(startIndex\)");
                         HomeFollowSummaryPresenter tB1 = this.B;
                         if (tB1 == null) {
                            a.S("mFollowLikeCountsPre");
                         }
                         tB1.setText(str);
                         tp = this.C;
                         if (tp == null) {
                            a.S("mFollowLikeCountsNex");
                         }
                         tp.setText(str3);
                      }
                   }
                }
             }
             b = false;
             goto label_00d8 ;
          }
          tr = this.w;
          if (tr == null) {
             a.S("mSubject");
          }
          tr.setPadding(0, 0, 0, 0);
          tr = this.y;
          if (tr == null) {
             a.S("mLikeIconContainer");
          }
          tr.setVisibility(0);
          tr = this.x;
          if (tr == null) {
             a.S("mLikeIcon");
          }
          Object obj = PatchProxy.apply(objArray, this, homeFollowSu, "19");
          if (obj != patchProxyRe) {
             i2 = obj.intValue();
          }else {
             tw = this.p;
             if (tw != null) {
                a.m(tw);
                if (tw.isLiked()) {
                   i2 = 0x7f080a09;
                }
             }
             tw = this.u;
             if (tw == null) {
                a.S("mParam");
             }
             i2 = tw.mLikeIconNormalResId;
          }
          tr.setImageResource(i2);
          tw = this.x;
          if (tw == null) {
             a.S("mLikeIcon");
          }
          tw.setOnClickListener(this.J);
          return;
       }
    }
    public void doBindView(View p0){
       View view;
       if (PatchProxy.applyVoidOneRefs(p0, this, HomeFollowSummaryPresenter.class, "3")) {
          return;
       }
       a.p(p0, "view");
       view = m1.f(p0, R.id.subject_avatars_stub);
       a.o(view, "ViewBindUtils.bindWidget¡­.id.subject_avatars_stub\)");
       this.z = view;
       view = m1.f(p0, R.id.follow_like_icon);
       a.o(view, "ViewBindUtils.bindWidget¡­w, R.id.follow_like_icon\)");
       this.x = view;
       view = m1.f(p0, R.id.follow_like_icon_container);
       a.o(view, "ViewBindUtils.bindWidget¡­llow_like_icon_container\)");
       this.y = view;
       view = m1.f(p0, R.id.subject);
       a.o(view, "ViewBindUtils.bindWidget\(view, R.id.subject\)");
       this.w = view;
       view = m1.f(p0, R.id.follow_bottom_part_v1_like_counts_lay);
       a.o(view, "ViewBindUtils.bindWidget¡­_part_v1_like_counts_lay\)");
       this.A = view;
       view = m1.f(p0, R.id.follow_bottom_part_v1_like_counts_pre);
       a.o(view, "ViewBindUtils.bindWidget¡­_part_v1_like_counts_pre\)");
       this.B = view;
       p0 = m1.f(p0, R.id.follow_bottom_part_v1_like_counts_nex);
       a.o(p0, "ViewBindUtils.bindWidget¡­_part_v1_like_counts_nex\)");
       this.C = p0;
       p0 = m1.f(this.m8(), R.id.avatar_right_side_feed_general_cover_label_view_stub);
       a.o(p0, "ViewBindUtils.bindWidget¡­al_cover_label_view_stub\)");
       this.D = p0;
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, HomeFollowSummaryPresenter.class, "2")) {
          return;
       }
       Object obj = this.q8(QPhoto.class);
       a.o(obj, "inject\(QPhoto::class.java\)");
       this.r = obj;
       this.p = this.s8(PhotoMeta.class);
       obj = this.q8(CommonMeta.class);
       a.o(obj, "inject\(CommonMeta::class.java\)");
       this.q = obj;
       this.s = this.s8(User.class);
       obj = this.r8("FRAGMENT");
       a.o(obj, "inject\(AccessIds.FRAGMENT\)");
       this.t = obj;
       obj = this.r8("FEED_ITEM_VIEW_PARAM");
       a.o(obj, "inject\(AccessIds.FEED_ITEM_VIEW_PARAM\)");
       this.u = obj;
       this.v = this.t8("accessible_content");
       return;
    }
}
