package com.yxcorp.gifshow.ad.union.AdUnionHalfFollowFragment;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.ad.union.AdUnionHalfFollowFragment$Companion;
import nsd.u;
import b9c.b0;
import b9c.w;
import b9c.a;
import b9c.c;
import com.yxcorp.gifshow.ad.union.AdUnionHalfFollowFragment$Companion$FollowStyleModel;
import com.yxcorp.gifshow.commercial.common.model.AdUnionFollowInfo;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.View;
import android.widget.TextView;
import android.widget.ImageView;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import lnc.y0;
import androidx.fragment.app.DialogFragment;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.framework.model.user.QCurrentUser;
import tkd.b;
import tkd.d;
import ou5.b;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.ad.union.AdUnionHalfFollowFragment$a;
import android.content.Context;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.entity.QPreInfo;
import n3d.a;
import n3d.d;
import jga.f$a;
import jga.f;
import com.yxcorp.gifshow.entity.helper.FollowHelper;
import com.yxcorp.gifshow.commercial.common.model.AdUnionFollowInfo$LiveInfo;
import java.lang.StringBuilder;
import f59.j;
import yx.j0;
import java.lang.CharSequence;
import android.net.Uri;
import ekd.x0;
import wkd.b;
import nf6.i;
import android.content.Intent;
import com.yxcorp.gifshow.ad.union.AdUnionHalfFollowFragment$c;
import java.lang.Runnable;
import t45.c;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import com.kwai.robust.PatchProxyResult;
import android.app.Dialog;
import android.view.Window;
import com.yxcorp.gifshow.ad.union.AdUnionHalfFollowFragment$b;
import i2b.a;
import ekd.k1;
import crd.b;
import java.util.HashMap;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import org.json.JSONObject;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.gifshow.ad.award.ui.ShineView;
import com.yxcorp.gifshow.ad.union.AdUnionShopCardView;
import tyc.p5;
import com.yxcorp.gifshow.ad.union.AdUnionHalfFollowFragment$doSetListener$1;
import msd.l;
import com.yxcorp.gifshow.ad.union.AdUnionHalfFollowFragment$doSetListener$2;
import com.yxcorp.gifshow.ad.union.AdUnionHalfFollowFragment$doSetListener$3;
import com.yxcorp.gifshow.ad.union.AdUnionHalfFollowFragment$doSetListener$4;
import com.yxcorp.gifshow.ad.union.AdUnionHalfFollowFragment$doSetListener$5;
import f59.b;
import com.yxcorp.gifshow.ad.union.AdUnionShopCardView$a;
import android.graphics.drawable.Drawable;
import zf6.j;
import com.yxcorp.utility.n;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.animation.AnimatorSet;
import android.util.Property;
import android.animation.ObjectAnimator;
import android.animation.Animator;
import com.yxcorp.gifshow.commercial.common.model.AdUnionFollowInfo$ShopInfo;
import kotlin.collections.ArraysKt___ArraysKt;
import com.yxcorp.gifshow.model.CDNUrl;
import com.facebook.drawee.view.SimpleDraweeView;
import f59.a;
import java.lang.Enum;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout;
import com.yxcorp.gifshow.util.rx.RxBus;
import wca.n;
import brd.t;
import t45.d;
import brd.z;
import f59.c;
import erd.g;

public final class AdUnionHalfFollowFragment extends BaseFragment	// class@001865
{
    public View A;
    public View B;
    public View C;
    public View D;
    public View E;
    public View F;
    public View G;
    public AdUnionShopCardView H;
    public boolean I;
    public HashMap J;
    public QPhoto j;
    public User k;
    public AdUnionFollowInfo l;
    public String m;
    public String n;
    public int o;
    public b p;
    public AdUnionHalfFollowFragment$Companion$FollowStyleModel q;
    public View r;
    public View s;
    public TextView t;
    public View u;
    public View v;
    public KwaiImageView w;
    public TextView x;
    public ImageView y;
    public ShineView z;
    public static final AdUnionHalfFollowFragment$Companion K;

    static {
       AdUnionHalfFollowFragment.K = new AdUnionHalfFollowFragment$Companion(null);
    }
    public void AdUnionHalfFollowFragment(){
       super(null, null, null, null, 15, null);
       this.o = 6;
       this.q = AdUnionHalfFollowFragment$Companion$FollowStyleModel.UNKNOWN;
    }
    public static final AdUnionFollowInfo ch(AdUnionHalfFollowFragment p0){
       p0 = p0.l;
       if (p0 == null) {
          a.S("mAdUnionFollowInfo");
       }
       return p0;
    }
    public static final View dh(AdUnionHalfFollowFragment p0){
       p0 = p0.A;
       if (p0 == null) {
          a.S("mBottomClickLayout");
       }
       return p0;
    }
    public static final TextView eh(AdUnionHalfFollowFragment p0){
       p0 = p0.x;
       if (p0 == null) {
          a.S("mClickText");
       }
       return p0;
    }
    public static final ImageView fh(AdUnionHalfFollowFragment p0){
       p0 = p0.y;
       if (p0 == null) {
          a.S("mFollowSucIcon");
       }
       return p0;
    }
    public static void lh(AdUnionHalfFollowFragment p0,int p1,int p2,int p3,boolean p4,int p5,Object p6){
       if (p5 & 0x02) {
          p2 = 0;
       }
       if (p5 & 0x04) {
          p3 = 15;
       }
       if (p5 & 0x08) {
          p4 = false;
       }
       p0.kh(p1, p2, p3, p4);
       return;
    }
    public static void mh(AdUnionHalfFollowFragment p0,int p1,int p2,int p3,boolean p4,int p5,Object p6){
       if (p5 & 0x02) {
          p2 = 0;
       }
       if (p5 & 0x04) {
          p3 = 15;
       }
       if (p5 & 0x08) {
          p4 = false;
       }
       Objects.requireNonNull(p0);
       if (!PatchProxy.isSupport(AdUnionHalfFollowFragment.class) || !PatchProxy.applyVoidFourRefs(Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), Boolean.valueOf(p4), p0, AdUnionHalfFollowFragment.class, "14")) {
          p0.kh(p1, p2, p3, p4);
          p0.gh();
       }
       return;
    }
    public final void gh(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, AdUnionHalfFollowFragment.class, "13")) {
          return;
       }
       if (!y0.o(this.getActivity())) {
          Fragment parentFragme = this.getParentFragment();
          if (parentFragme instanceof DialogFragment) {
             objArray = parentFragme;
          }
          if (objArray != null) {
             objArray.dismissAllowingStateLoss();
          }
       }
       return;
    }
    public final void hh(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, AdUnionHalfFollowFragment.class, "17")) {
          return;
       }
       FragmentActivity activity = this.getActivity();
       if (!activity instanceof GifshowActivity) {
          activity = objArray;
       }
       FragmentActivity uFragmentAct = activity;
       if (uFragmentAct != null) {
          QCurrentUser mE = QCurrentUser.ME;
          a.o(mE, "QCurrentUser.ME");
          String str = "mUser";
          if (!mE.isLogined()) {
             b uob = d.a(-1712118428);
             AdUnionHalfFollowFragment tj = this.j;
             String fullSource = (tj != null)? tj.getFullSource(): objArray;
             AdUnionHalfFollowFragment tj1 = this.j;
             if (tj1 != null) {
                objArray = tj1.mEntity;
             }
             Object[] objArray1 = objArray;
             AdUnionHalfFollowFragment tk = this.k;
             if (tk == null) {
                a.S(str);
             }
             uob.ne(uFragmentAct, fullSource, "AdHalfFollowFragment", 0, null, objArray1, tk, null, new AdUnionHalfFollowFragment$a(this)).h();
             return;
          }else {
             AdUnionHalfFollowFragment tk1 = this.k;
             if (tk1 == null) {
                a.S(str);
             }
             FollowHelper.b(new f$a(tk1, uFragmentAct.Q2()).b());
          }
       }
       return;
    }
    public final void ih(){
       if (PatchProxy.applyVoid(null, this, AdUnionHalfFollowFragment.class, "9")) {
          return;
       }
       AdUnionHalfFollowFragment tl = this.l;
       if (tl == null) {
          a.S("mAdUnionFollowInfo");
       }
       AdUnionFollowInfo mLiveInfo = tl.mLiveInfo;
       if (mLiveInfo != null) {
          AdUnionFollowInfo$LiveInfo mLiveStreamI = mLiveInfo.mLiveStreamId;
          if (mLiveStreamI != null) {
             this.jh(j.a(j.a("kwai://live/play/"+mLiveStreamI+"?sourceType=298", "serverExtData", this.n, false, 8, null), "extraInfo", this.m, false, 8, null));
          }
       }
       return;
    }
    public final void jh(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AdUnionHalfFollowFragment.class, "10")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       j0.f("AdHalfFollowFragment", "open scheme "+p0, objArray);
       if (p0 == null || !p0.length()) {
          i = 1;
       }
       if (i) {
          return;
       }else {
          Uri uri = x0.f(p0);
          if (uri != null) {
             Intent intent = b.a(0x66dce92a).a(this.getActivity(), uri);
             if (intent != null) {
                FragmentActivity activity = this.getActivity();
                if (activity != null) {
                   activity.startActivity(intent);
                }
             }
          }
          return;
       }
    }
    public final void kh(int p0,int p1,int p2,boolean p3){
       if (PatchProxy.isSupport(AdUnionHalfFollowFragment.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Boolean.valueOf(p3), this, AdUnionHalfFollowFragment.class, "15")) {
          return;
       }
       if (this.j == null) {
          Object[] objArray = new Object[0];
          j0.f("AdHalfFollowFragment", "photo is null", objArray);
          return;
       }else {
          AdUnionHalfFollowFragment$c uoc = new AdUnionHalfFollowFragment$c(this, p0, p1, p2, p3);
          c.a(v6);
          return;
       }
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, AdUnionHalfFollowFragment.class, "1");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       a.p(p0, "inflater");
       Fragment parentFragme = this.getParentFragment();
       if (!parentFragme instanceof DialogFragment) {
          parentFragme = null;
       }
       if (parentFragme != null) {
          Dialog dialog = parentFragme.getDialog();
          if (dialog != null) {
             Window window = dialog.getWindow();
             if (window != null) {
                window.clearFlags(1024);
                if (p1 != null) {
                   p1.post(new AdUnionHalfFollowFragment$b(window, p1));
                }
             }
          }
       }
       View view = a.g(p0, R.layout.arg_RES_7f0d0051, p1, false);
       a.o(view, "KwaiLayoutInflater.infla¡­layout, container, false\)");
       return view;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, AdUnionHalfFollowFragment.class, "16")) {
          return;
       }
       k1.n("AdHalfFollowFragment");
       AdUnionHalfFollowFragment tp = this.p;
       if (tp != null) {
          tp.dispose();
       }
       super.onDestroyView();
       if (!PatchProxy.applyVoid(null, this, AdUnionHalfFollowFragment.class, "19")) {
          tp = this.J;
          if (tp != null) {
             tp.clear();
          }
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       String str8;
       boolean i3;
       AdUnionHalfFollowFragment l;
       AdUnionFollowInfo mShopInfo;
       AdUnionShopCardView d;
       Boolean uBoolean;
       View view;
       QPhoto qPhoto = this;
       AdUnionHalfFollowFragment obj = p0;
       if (PatchProxy.applyVoidTwoRefs(obj, p1, qPhoto, AdUnionHalfFollowFragment.class, "2")) {
          return;
       }
       String str = "view";
       a.p(obj, str);
       super.onViewCreated(p0, p1);
       Bundle arguments = this.getArguments();
       if (arguments != null) {
          a.o(arguments, "arguments ?: return");
          Serializable serializable = SerializableHook.getSerializable(arguments, "qPhoto");
          Object[] objArray = null;
          if (!serializable instanceof QPhoto) {
             serializable = objArray;
          }
          qPhoto.j = serializable;
          serializable = SerializableHook.getSerializable(arguments, "user");
          Objects.requireNonNull(serializable, "null cannot be cast to non-null type com.kwai.framework.model.user.User");
          qPhoto.k = serializable;
          serializable = SerializableHook.getSerializable(arguments, "adUnion");
          Objects.requireNonNull(serializable, "null cannot be cast to non-null type com.yxcorp.gifshow.commercial.common.model.AdUnionFollowInfo");
          qPhoto.l = serializable;
          qPhoto.m = arguments.getString("extraInfo");
          qPhoto.n = arguments.getString("serverExtData");
          AdUnionHalfFollowFragment m = qPhoto.m;
          a.m(m);
          JSONObject jSONObject = new JSONObject(m);
          qPhoto.o = jSONObject.optInt("followStyle");
          QCurrentUser mE = QCurrentUser.ME;
          a.o(mE, "QCurrentUser.ME");
          qPhoto.I = mE.isLogined();
          String str1 = "4";
          if (!PatchProxy.applyVoidOneRefs(obj, qPhoto, AdUnionHalfFollowFragment.class, str1)) {
             view = obj.findViewById(R.id.container_outside_layout);
             a.o(view, "rootView.findViewById\(R.¡­container_outside_layout\)");
             qPhoto.C = view;
             view = obj.findViewById(R.id.container_root_layout);
             a.o(view, "rootView.findViewById\(R.id.container_root_layout\)");
             qPhoto.D = view;
             view = obj.findViewById(R.id.card_background);
             a.o(view, "rootView.findViewById\(R.id.card_background\)");
             qPhoto.E = view;
             view = obj.findViewById(R.id.close_panel);
             a.o(view, "rootView.findViewById\(R.id.close_panel\)");
             qPhoto.F = view;
             view = obj.findViewById(R.id.container_follow_layout);
             a.o(view, "rootView.findViewById\(R.¡­.container_follow_layout\)");
             qPhoto.G = view;
             view = obj.findViewById(R.id.living_text);
             a.o(view, "rootView.findViewById\(R.id.living_text\)");
             qPhoto.r = view;
             view = obj.findViewById(R.id.living_title);
             a.o(view, "rootView.findViewById\(R.id.living_title\)");
             qPhoto.t = view;
             view = obj.findViewById(R.id.living_title_container);
             a.o(view, "rootView.findViewById\(R.id.living_title_container\)");
             qPhoto.s = view;
             view = obj.findViewById(R.id.user_avatar);
             a.o(view, "rootView.findViewById\(R.id.user_avatar\)");
             qPhoto.w = view;
             view = obj.findViewById(R.id.live_tip_ring);
             a.o(view, "rootView.findViewById\(R.id.live_tip_ring\)");
             qPhoto.u = view;
             view = obj.findViewById(R.id.live_tip_ring_anim);
             a.o(view, "rootView.findViewById\(R.id.live_tip_ring_anim\)");
             qPhoto.v = view;
             view = obj.findViewById(R.id.shine_view);
             a.o(view, "rootView.findViewById\(R.id.shine_view\)");
             qPhoto.z = view;
             view = obj.findViewById(R.id.click_text);
             a.o(view, "rootView.findViewById\(R.id.click_text\)");
             qPhoto.x = view;
             view = obj.findViewById(R.id.follow_success);
             a.o(view, "rootView.findViewById\(R.id.follow_success\)");
             qPhoto.y = view;
             view = obj.findViewById(R.id.bottom_click_layout);
             a.o(view, "rootView.findViewById\(R.id.bottom_click_layout\)");
             qPhoto.A = view;
             view = obj.findViewById(R.id.bottom_button);
             a.o(view, "rootView.findViewById\(R.id.bottom_button\)");
             qPhoto.B = view;
             View view1 = obj.findViewById(R.id.shop_card);
             a.o(view1, "rootView.findViewById\(R.id.shop_card\)");
             qPhoto.H = view1;
          }
          obj = qPhoto.x;
          String str2 = "mClickText";
          if (obj == null) {
             a.S(str2);
          }
          AdUnionHalfFollowFragment x = qPhoto.x;
          if (x == null) {
             a.S(str2);
          }
          obj.setTag(new p5(x));
          obj = qPhoto.G;
          str2 = "mContainerLayout";
          if (obj == null) {
             a.S(str2);
          }
          x = qPhoto.G;
          if (x == null) {
             a.S(str2);
          }
          obj.setTag(new p5(x));
          String str3 = "5";
          String str4 = "mShopCard";
          String str5 = "mUserAvatar";
          String str6 = "mCloseView";
          if (!PatchProxy.applyVoid(objArray, qPhoto, AdUnionHalfFollowFragment.class, str3)) {
             obj = qPhoto.C;
             if (obj == null) {
                a.S("mContainerOutsideView");
             }
             y0.a(obj, new AdUnionHalfFollowFragment$doSetListener$1(qPhoto));
             obj = qPhoto.E;
             if (obj == null) {
                a.S("mCardBackgroundView");
             }
             y0.a(obj, AdUnionHalfFollowFragment$doSetListener$2.INSTANCE);
             obj = qPhoto.F;
             if (obj == null) {
                a.S(str6);
             }
             y0.a(obj, new AdUnionHalfFollowFragment$doSetListener$3(qPhoto));
             obj = qPhoto.w;
             if (obj == null) {
                a.S(str5);
             }
             y0.a(obj, new AdUnionHalfFollowFragment$doSetListener$4(qPhoto));
             obj = qPhoto.A;
             if (obj == null) {
                a.S("mBottomClickLayout");
             }
             y0.a(obj, new AdUnionHalfFollowFragment$doSetListener$5(qPhoto));
             obj = qPhoto.H;
             if (obj == null) {
                a.S(str4);
             }
             obj.setMCardClickListener(new b(qPhoto));
          }
          j oj = j.class;
          String str7 = "mAdUnionFollowInfo";
          int i = 2;
          boolean i1 = 0;
          int i2 = 1;
          if (PatchProxy.applyVoid(objArray, qPhoto, AdUnionHalfFollowFragment.class, "6")) {
             str8 = str7;
          }else {
             AdUnionHalfFollowFragment f1 = qPhoto.F;
             if (f1 == null) {
                a.S(str6);
             }
             f1.setBackground(j.j(R.drawable.arg_RES_7f080e80, i2));
             AdUnionHalfFollowFragment y = qPhoto.y;
             if (y == null) {
                a.S("mFollowSucIcon");
             }
             y.setBackground(j.j(R.drawable.arg_RES_7f080535, i));
             if (qPhoto.I != null) {
                y = qPhoto.l;
                if (y == null) {
                   a.S(str7);
                }
                if (j.c(y)) {
                   qPhoto.q = AdUnionHalfFollowFragment$Companion$FollowStyleModel.GUIDE_OPEN_LIVING;
                   if (PatchProxy.applyVoid(objArray, qPhoto, AdUnionHalfFollowFragment.class, "11")) {
                      str8 = str7;
                   }else {
                      y = qPhoto.u;
                      String str9 = "mLivingTip";
                      if (y == null) {
                         a.S(str9);
                      }
                      y.setVisibility(i1);
                      y = qPhoto.r;
                      if (y == null) {
                         a.S("mLivingView");
                      }
                      y.setVisibility(i1);
                      y = qPhoto.v;
                      if (y == null) {
                         a.S("mLivingTipAnim");
                      }
                      y.setVisibility(i1);
                      y = qPhoto.u;
                      if (y == null) {
                         a.S(str9);
                      }
                      str8 = str7;
                      y.setVisibility(i1);
                      AlphaAnimation uAlphaAnimat = new AlphaAnimation(0, 0x3f800000);
                      uAlphaAnimat.setFillAfter(i2);
                      uAlphaAnimat.setDuration(200);
                      y.startAnimation(uAlphaAnimat);
                      AdUnionHalfFollowFragment v = qPhoto.v;
                      if (v == null) {
                         a.S("mLivingTipAnim");
                      }
                      if (!PatchProxy.applyVoidOneRefs(v, null, oj, str1)) {
                         a.p(v, str);
                         AnimatorSet uAnimatorSet1 = new AnimatorSet();
                         ObjectAnimator objectAnimat2 = ObjectAnimator.ofFloat(v, View.SCALE_X, new float[2]{0x3f800000,0x3f933333});
                         objectAnimat2.setRepeatCount(-1);
                         ObjectAnimator objectAnimat3 = ObjectAnimator.ofFloat(v, View.SCALE_Y, new float[2]{0x3f800000,0x3f933333});
                         objectAnimat3.setRepeatCount(-1);
                         ObjectAnimator objectAnimat4 = ObjectAnimator.ofFloat(v, View.ALPHA, new float[2]{0x3f800000,0});
                         objectAnimat4.setRepeatCount(-1);
                         uAnimatorSet1.setDuration(500);
                         Animator[] uAnimatorArr1 = new Animator[]{objectAnimat2,objectAnimat3,objectAnimat4};
                         uAnimatorSet1.playTogether(uAnimatorArr1);
                         uAnimatorSet1.start();
                      }
                      m = qPhoto.w;
                      if (m == null) {
                         a.S(str5);
                      }
                      if (!PatchProxy.applyVoidOneRefs(m, null, oj, str3)) {
                         a.p(m, str);
                         AnimatorSet uAnimatorSet = new AnimatorSet();
                         ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(m, View.SCALE_X, new float[2]{0x3f800000,0x3f733333});
                         objectAnimat.setRepeatCount(-1);
                         objectAnimat.setRepeatMode(2);
                         ObjectAnimator objectAnimat1 = ObjectAnimator.ofFloat(m, View.SCALE_Y, new float[2]{0x3f800000,0x3f733333});
                         objectAnimat1.setRepeatCount(-1);
                         objectAnimat1.setRepeatMode(2);
                         uAnimatorSet.setDuration(500);
                         Animator[] uAnimatorArr = new Animator[]{objectAnimat,objectAnimat1};
                         uAnimatorSet.playTogether(uAnimatorArr);
                         uAnimatorSet.start();
                      }
                   }
                   obj = qPhoto.t;
                   if (obj == null) {
                      a.S("mLivingTextTitle");
                   }
                   l = qPhoto.l;
                   if (l == null) {
                      a.S(str8);
                   }
                   mShopInfo = l.mLiveInfo;
                   AdUnionFollowInfo$LiveInfo mLiveTitle = (mShopInfo != null)? mShopInfo.mLiveTitle: null;
                   obj.setText(mLiveTitle);
                }else {
                label_038b :
                   str8 = str7;
                   if (qPhoto.I != null) {
                      l = qPhoto.l;
                      if (l == null) {
                         a.S(str8);
                      }
                      AdUnionFollowInfo obj1 = PatchProxy.applyOneRefs(l, null, oj, "3");
                      if (obj1 != PatchProxyResult.class) {
                         i3 = obj1.booleanValue();
                      }else {
                         a.p(l, "adUnionFollowInfo");
                         obj1 = l.mShopInfo;
                         if (obj1 != null) {
                            AdUnionFollowInfo$ShopInfo mShopLink = obj1.mShopLink;
                            if (mShopLink != null) {
                               i1 = (mShopLink.length() > 0)? true: false;
                               uBoolean = Boolean.valueOf(i1);
                            label_03c4 :
                               i3 = y0.p(uBoolean);
                            }
                         }
                         uBoolean = null;
                         goto label_03c4 ;
                      }
                      if (i3) {
                         qPhoto.q = AdUnionHalfFollowFragment$Companion$FollowStyleModel.GUIDE_OPEN_SHOP;
                      }
                   }
                }
             }else {
                goto label_038b ;
             }
             obj = qPhoto.w;
             if (obj == null) {
                a.S(str5);
             }
             l = qPhoto.k;
             str1 = "mUser";
             if (l == null) {
                a.S(str1);
             }
             User mAvatars = l.mAvatars;
             if (mAvatars != null) {
                CDNUrl uCDNUrl = ArraysKt___ArraysKt.Ib(mAvatars);
                if (uCDNUrl != null) {
                   uCDNUrl = uCDNUrl.mUrl;
                   if (uCDNUrl != null) {
                   label_03f8 :
                      obj.setImageURI(uCDNUrl);
                   }
                }
             }
             l = qPhoto.k;
             if (l == null) {
                a.S(str1);
             }
             mAvatars = l.mAvatar;
             goto label_03f8 ;
          }
          i3 = a.a[qPhoto.q.ordinal()];
          if (i3 != 1) {
             if (i3 != 2) {
                this.gh();
             }else if(PatchProxy.applyVoid(null, qPhoto, AdUnionHalfFollowFragment.class, "8")){
                obj = qPhoto.H;
                if (obj == null) {
                   a.S(str4);
                }
                l = qPhoto.l;
                if (l == null) {
                   a.S(str8);
                }
                mShopInfo = l.mShopInfo;
                a.o(mShopInfo, "mAdUnionFollowInfo.mShopInfo");
                Objects.requireNonNull(obj);
                if (!PatchProxy.applyVoidOneRefs(mShopInfo, obj, AdUnionShopCardView.class, "3")) {
                   a.p(mShopInfo, "shopBean");
                   d = obj.d;
                   if (d == null) {
                      a.S("mShopCardTitle");
                   }
                   d.setText(mShopInfo.mShopTitle);
                   d = obj.e;
                   if (d == null) {
                      a.S("mShopCardSubTitle");
                   }
                   d.setText(mShopInfo.mShopSubTitle);
                   AdUnionShopCardView f = obj.f;
                   if (f == null) {
                      a.S("mShopCardIcon");
                   }
                   f.setImageURI(mShopInfo.mShopIconUrl);
                }
                obj = qPhoto.G;
                if (obj == null) {
                   a.S(str2);
                }
                obj.setVisibility(8);
                obj = qPhoto.D;
                if (obj == null) {
                   a.S("mContainerRootView");
                }
                obj.getLayoutParams().height = AdUnionHalfFollowFragment$Companion$FollowStyleModel.GUIDE_OPEN_SHOP.getHeight();
                obj = qPhoto.H;
                if (obj == null) {
                   a.S(str4);
                }
                obj.setVisibility(0);
                AdUnionHalfFollowFragment.lh(this, 140, 191, 16, false, 8, null);
             }
          }else if(PatchProxy.applyVoid(null, qPhoto, AdUnionHalfFollowFragment.class, "7")){
             obj = qPhoto.G;
             if (obj == null) {
                a.S(str2);
             }
             obj.getLayoutParams().height = AdUnionHalfFollowFragment$Companion$FollowStyleModel.GUIDE_OPEN_LIVING.getHeight();
             AdUnionHalfFollowFragment.lh(this, 140, 191, 17, false, 8, null);
          }
          if (!PatchProxy.applyVoid(null, qPhoto, AdUnionHalfFollowFragment.class, "3")) {
             qPhoto.p = RxBus.f.f(n.class).observeOn(d.a).subscribe(new c(qPhoto));
          }
       }
       return;
    }
}
