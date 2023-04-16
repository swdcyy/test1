package com.kuaishou.merchant.marketing.shop.auction.bubble.widget.b;
import com.kuaishou.merchant.marketing.shop.auction.bubble.widget.AbstractAuctionBubble;
import android.content.Context;
import com.kuaishou.merchant.marketing.shop.auction.bubble.widget.b$a;
import java.util.ArrayList;
import android.animation.AnimatorSet;
import com.kuaishou.merchant.marketing.shop.auction.bubble.widget.b$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import bld.b;
import lnc.a1;
import com.yxcorp.widget.KwaiRadiusStyles;
import bld.c;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import android.widget.ImageView;
import com.kuaishou.merchant.marketing.shop.auction.bubble.widget.AuctionBidButton;
import java.lang.CharSequence;
import com.kuaishou.merchant.api.core.model.Commodity;
import android.view.animation.Animation;
import android.widget.ViewSwitcher;
import com.kuaishou.merchant.marketing.shop.auction.bubble.widget.b$d;
import android.view.animation.Animation$AnimationListener;
import androidx.constraintlayout.widget.Group;
import com.lsjwzh.widget.text.FastTextView;
import android.animation.ValueAnimator;
import ekd.r;
import z84.t;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.PropertyValuesHolder;
import android.util.Property;
import android.animation.ObjectAnimator;
import com.kuaishou.merchant.marketing.shop.auction.bubble.widget.b$e;
import android.animation.Animator$AnimatorListener;
import com.kuaishou.merchant.marketing.shop.auction.bubble.widget.b$f;
import android.animation.Animator;
import com.kuaishou.merchant.marketing.shop.auction.bubble.widget.b$g;
import z84.c0;
import java.lang.Runnable;
import ekd.k1;
import java.lang.Long;
import z84.x;
import android.view.View$OnClickListener;
import android.widget.FrameLayout;
import com.kwai.robust.PatchProxyResult;
import android.view.ViewGroup;
import xm4.a;
import bh.o;
import android.text.SpannableStringBuilder;
import java.util.List;
import bs3.a$a;
import g94.b;
import com.kuaishou.merchant.marketing.shop.auction.bubble.widget.AuctionBidderSwitcher;
import z84.d0;
import com.kuaishou.merchant.marketing.shop.auction.bubble.widget.b$c;
import android.view.animation.LinearInterpolator;
import android.animation.TimeInterpolator;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.widget.TextSwitcher;
import java.lang.System;
import lnc.o5;
import ekd.m1;
import com.kuaishou.merchant.feed.widget.MerchantKwaiImageView;
import u84.l;
import com.yxcorp.gifshow.image.KwaiImageView;
import z84.u;
import android.graphics.Typeface;
import ot3.p0;
import z84.v;
import z84.w;
import o56.c;
import o56.a;
import android.app.Application;
import com.yxcorp.utility.n;
import ekd.p1;
import com.yxcorp.widget.selector.view.SelectShapeTextView;
import f14.g;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.merchant.marketing.shop.auction.bubble.widget.b$j;
import java.lang.Integer;
import java.lang.Boolean;
import com.kuaishou.merchant.marketing.shop.auction.bubble.widget.b$h;
import java.lang.reflect.Type;
import el.a;
import java.util.HashMap;
import ca0.a;
import com.kwai.framework.model.user.QCurrentUser;
import android.view.View$OnLayoutChangeListener;
import com.kuaishou.merchant.marketing.shop.auction.bubble.widget.b$k;
import bs3.a$b;
import java.util.Locale;
import android.view.ViewParent;
import java.util.Objects;
import java.lang.StringBuilder;
import crd.b;
import lnc.b9;
import com.kuaishou.merchant.basic.widget.sweeping.RectSweepingButtonView;

public class b extends AbstractAuctionBubble	// class@001b9d
{
    public ObjectAnimator A1;
    public o B1;
    public final Transition$f C1;
    public final View$OnLayoutChangeListener M;
    public TextView N;
    public KwaiImageView O;
    public Group P;
    public TextView Q;
    public TextView R;
    public TextSwitcher S;
    public ViewGroup T;
    public Group U;
    public ViewGroup U0;
    public TextSwitcher V;
    public FastTextView V0;
    public ImageView W;
    public MerchantKwaiImageView W0;
    public AuctionBidderSwitcher X;
    public MerchantKwaiImageView X0;
    public TextView Y;
    public final int[] Y0;
    public ImageView Z;
    public final int[] Z0;
    public long a1;
    public long b1;
    public long c1;
    public ImageView d1;
    public TextView e1;
    public TextView f1;
    public TextView g1;
    public AuctionBidButton h1;
    public View i1;
    public SelectShapeTextView j1;
    public ImageView k1;
    public List l1;
    public Commodity m1;
    public String n1;
    public boolean o1;
    public boolean p1;
    public boolean q1;
    public boolean r1;
    public b s1;
    public b$j t1;
    public b$k u1;
    public b$l v1;
    public AnimatorSet w1;
    public AnimatorSet x1;
    public AnimatorSet y1;
    public ObjectAnimator z1;

    public void b(Context p0){
       super(p0);
       this.M = new b$a(this);
       int[] ointArray = new int[20];
       this.Y0 = ointArray;
       int[] ointArray1 = new int[20];
       this.Z0 = ointArray1;
       this.l1 = new ArrayList();
       this.r1 = true;
       this.w1 = new AnimatorSet();
       this.C1 = new b$b(this);
    }
    public void D(){
       if (PatchProxy.applyVoid(null, this, b.class, "10")) {
          return;
       }
       this.i1.setVisibility(8);
       return;
    }
    public void E(){
       int b;
       if (PatchProxy.applyVoid(null, this, b.class, "9")) {
          return;
       }
       this.i1.setVisibility(0);
       b = this.I();
       b uob = new b();
       int i = (!b)? 0x7f060161: 0x7f06016f;
       i = a1.a(i);
       int i1 = (!b)? 0x7f060150: 0x7f060169;
       uob.l(i, a1.a(i1));
       uob.j(45);
       uob.g(KwaiRadiusStyles.R12);
       this.j1.setBackground(uob.a());
       uob = this.j1;
       i = (!b)? 0x7f061d77: 0x7f061e52;
       uob.setTextColor(a1.a(i));
       uob = this.k1;
       b = (!b)? 0x7f080132: 0x7f080133;
       uob.setImageResource(b);
       return;
    }
    public void J(){
       if (PatchProxy.applyVoid(null, this, b.class, "31")) {
          return;
       }
       this.p1 = true;
       this.h1.c();
       this.R.setText(a1.p(R.string.arg_RES_7f10026c));
       b tm1 = this.m1;
       if (tm1 == null) {
          return;
       }
       if (this.m0(tm1.mId)) {
          if (this.r1 != null) {
             this.X.getInAnimation().setAnimationListener(new b$d(this));
          }
       }else {
          this.i0(a1.p(R.string.arg_RES_7f1002a5));
          this.P.setVisibility(0);
          this.U.setVisibility(8);
       }
       this.Y.setVisibility(8);
       this.X.setVisibility(0);
       this.q.setVisibility(8);
       return;
    }
    public void K(){
       if (PatchProxy.applyVoid(null, this, b.class, "33")) {
          return;
       }
       if (this.w == 3) {
          return;
       }
       int i = 2;
       int[] ointArray = new int[i];
       ointArray[0] = this.p.getCurrentTextColor();
       int i1 = 1;
       ointArray[i1] = a1.a(0x7f061e52);
       ValueAnimator valueAnimato = r.c(ointArray);
       valueAnimato.setDuration(100);
       valueAnimato.addUpdateListener(new t(this));
       if (this.z1 == null) {
          PropertyValuesHolder[] propertyValu = new PropertyValuesHolder[i1];
          propertyValu[0] = PropertyValuesHolder.ofFloat(View.ALPHA, new float[i]{0x3f800000,0});
          this.z1 = ObjectAnimator.ofPropertyValuesHolder(this.Z, propertyValu);
       }
       this.z1.cancel();
       this.z1.setDuration(100);
       this.z1.removeAllListeners();
       this.z1.addListener(new b$e(this, valueAnimato));
       if (this.A1 == null) {
          PropertyValuesHolder[] propertyValu1 = new PropertyValuesHolder[i1];
          propertyValu1[0] = PropertyValuesHolder.ofFloat(View.ALPHA, new float[i]{0,0x3f800000});
          this.A1 = ObjectAnimator.ofPropertyValuesHolder(this.Z, propertyValu1);
       }
       this.A1.cancel();
       this.A1.setDuration(100);
       this.A1.removeAllListeners();
       this.A1.addListener(new b$f(this));
       this.z1.start();
       return;
    }
    public void M(){
       if (PatchProxy.applyVoid(null, this, b.class, "36")) {
          return;
       }
       this.i1.setVisibility(8);
       int i = 2;
       ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(this.U0, View.ALPHA, new float[i]{0x3f800000,0});
       ObjectAnimator objectAnimat1 = ObjectAnimator.ofFloat(this.q, View.ALPHA, new float[i]{0,0x3f800000});
       if (this.y1 == null) {
          this.y1 = new AnimatorSet();
       }
       this.y1.cancel();
       Animator[] uAnimatorArr = new Animator[i];
       uAnimatorArr[0] = objectAnimat;
       uAnimatorArr[1] = objectAnimat1;
       this.y1.playTogether(uAnimatorArr);
       this.y1.setDuration(200);
       this.y1.removeAllListeners();
       this.y1.addListener(new b$g(this));
       this.y1.start();
       return;
    }
    public void N(){
       if (PatchProxy.applyVoid(null, this, b.class, "30")) {
          return;
       }
       this.i1.setVisibility(8);
       this.p1 = false;
       this.R.setText(a1.p(R.string.arg_RES_7f10029d));
       this.i0(a1.p(R.string.arg_RES_7f100279));
       this.P.setVisibility(false);
       this.Y.setVisibility(false);
       this.X.setVisibility(8);
       this.U.setVisibility(8);
       this.q.setVisibility(8);
       k1.s(new c0(this), this, 0x2710);
       return;
    }
    public void O(long p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uob, "16")) {
          return;
       }
       if (p0 - null <= 0) {
          this.h1.setOnClickListener(new x(this));
       }
       super.O(p0);
       return;
    }
    public View P(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.c(p0, 0x7f0d0130, new FrameLayout(p0), false);
    }
    public void Q(){
       if (PatchProxy.applyVoid(null, this, b.class, "32")) {
          return;
       }
       b tx1 = this.x1;
       if (tx1 != null) {
          tx1.cancel();
       }
       tx1 = this.B1;
       if (tx1 != null) {
          tx1.c();
       }
       this.p.setTextColor(a1.a(R.color.arg_RES_7f0619f0));
       this.Z.setImageResource(R.drawable.arg_RES_7f080123);
       this.X0.setVisibility(8);
       return;
    }
    public void T(CharSequence p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "12")) {
          return;
       }
       SpannableStringBuilder spannableStr = new SpannableStringBuilder();
       spannableStr.append(p0);
       this.N.setText(spannableStr.append(p1));
       return;
    }
    public void U(List p0){
       b uob = b.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uob, "29")) {
          return;
       }
       this.l1 = p0;
       a$a uoa = this.l0();
       if (uoa == null) {
          return;
       }
       if (!this.n0(uoa) && this.q1 != null) {
          uoa.b = b.b(uoa.b);
       }
       if (this.o0()) {
          Animator surpassedAni = this.X.getSurpassedAnimation();
          if (surpassedAni != null) {
             ObjectAnimator objectAnimat = PatchProxy.apply(null, this, uob, "48");
             if (objectAnimat != PatchProxyResult.class) {
             }else {
                PropertyValuesHolder[] propertyValu = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.ALPHA, new float[5]{0,0x3f800000,0,0x3f800000,0})};
                objectAnimat = ObjectAnimator.ofPropertyValuesHolder(this.W0, propertyValu);
                objectAnimat.setDuration(1600);
                objectAnimat.addListener(new d0(this));
             }
             b tw1 = this.w1;
             if (tw1 != null) {
                if (tw1.isRunning()) {
                   this.w1.cancel();
                }
                Animator[] uAnimatorArr = new Animator[]{objectAnimat,surpassedAni};
                this.w1.playTogether(uAnimatorArr);
                this.w1.removeAllListeners();
                this.w1.addListener(new b$c(this, uoa));
                this.w1.setInterpolator(new LinearInterpolator());
                this.w1.start();
             }
          }
       }else {
          this.X.b(uoa, this.F());
       }
       return;
    }
    public void W(Commodity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "11")) {
          return;
       }
       this.m1 = p0;
       if (p0 == null) {
          return;
       }
       this.O.P(p0.mImageUrls);
       return;
    }
    public void Z(View$OnClickListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "14")) {
          return;
       }
       if (this.o1 != null || this.q1 == null) {
          this.u.setOnClickListener(p0);
       }
       return;
    }
    public void d0(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "13")) {
          return;
       }
       this.S.setText(p0);
       this.F = p0;
       this.n1 = p0;
       b tY0 = this.Y0;
       System.arraycopy(tY0, 0, this.Z0, 0, tY0.length);
       this.q0(o5.c(p0), true);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "7")) {
          return;
       }
       this.U0 = m1.f(p0, 0x7f0a041e);
       this.Z = m1.f(p0, 0x7f0a02d3);
       MerchantKwaiImageView merchantKwai = m1.f(p0, R.id.top_right_bg_red_shadow);
       this.X0 = merchantKwai;
       merchantKwai.s0(l.b, null);
       this.N = m1.f(p0, 0x7f0a029f);
       this.O = m1.f(p0, 0x7f0a029e);
       this.P = m1.f(p0, 0x7f0a02c8);
       this.Q = m1.f(p0, 0x7f0a02c9);
       TextSwitcher textSwitcher = m1.f(p0, R.id.auction_start_price);
       this.S = textSwitcher;
       b.a(textSwitcher, 12, 40);
       this.R = m1.f(p0, 0x7f0a02ca);
       this.T = m1.f(p0, 0x7f0a02c7);
       this.U = m1.f(p0, 0x7f0a02ba);
       textSwitcher = m1.f(p0, R.id.auction_my_price);
       this.V = textSwitcher;
       b.a(textSwitcher, 8, 18);
       this.W = m1.f(p0, 0x7f0a02bc);
       TextView textView = m1.f(p0, R.id.auction_rule);
       this.Y = textView;
       textView.setOnClickListener(new u(this));
       this.X = m1.f(p0, 0x7f0a0299);
       this.d1 = m1.f(p0, 0x7f0a0422);
       textView = m1.f(p0, R.id.bid_decrease_button);
       this.e1 = textView;
       textView.setTypeface(p0.l());
       this.e1.setOnClickListener(new v(this));
       textView = m1.f(p0, R.id.bid_current_price);
       this.f1 = textView;
       textView.setTypeface(p0.l());
       textView = m1.f(p0, R.id.bid_increase_button);
       this.g1 = textView;
       textView.setTypeface(p0.l());
       this.g1.setOnClickListener(new w(this));
       int i = n.c(a.a().a(), 6.00f);
       p1.c(this.e1, i, i, i, i);
       p1.c(this.g1, i, i, i, i);
       this.h1 = m1.f(p0, 0x7f0a028b);
       this.V0 = m1.f(p0, 0x7f0a02c0);
       merchantKwai = m1.f(p0, R.id.auction_card_surpassed);
       this.W0 = merchantKwai;
       merchantKwai.s0(l.a, null);
       this.i1 = m1.f(p0, 0x7f0a3c30);
       this.j1 = m1.f(p0, 0x7f0a3c31);
       this.k1 = m1.f(p0, 0x7f0a02cc);
       return;
    }
    public int e(){
       return 13;
    }
    public Animator g(){
       ObjectAnimator obj = PatchProxy.apply(null, this, b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.r0(this.f(), this.c);
       PropertyValuesHolder[] propertyValu = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.SCALE_X, new float[2]{0x3f800000,0}),PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[2]{0x3f800000,0})};
       obj = ObjectAnimator.ofPropertyValuesHolder(this.b, propertyValu);
       obj.setInterpolator(new AccelerateDecelerateInterpolator());
       obj.setDuration(500);
       return obj;
    }
    public void g0(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "15")) {
          return;
       }
       if (this.o1 != null || this.q1 == null) {
          this.r.setText(p0);
       }else {
          this.r.setText(b.b(p0));
       }
       return;
    }
    public final void i0(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "37")) {
          return;
       }
       if (!TextUtils.n(this.h1.getText(), p0)) {
          this.h1.setText(p0);
          b tt1 = this.t1;
          if (tt1 != null) {
             tt1.a(p0);
          }
       }
       return;
    }
    public Animator j(){
       ObjectAnimator obj = PatchProxy.apply(null, this, b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.r0(this.f(), this.c);
       PropertyValuesHolder[] propertyValu = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.SCALE_X, new float[2]{0,0x3f800000}),PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[2]{0,0x3f800000})};
       obj = ObjectAnimator.ofPropertyValuesHolder(this.b, propertyValu);
       obj.setInterpolator(new AccelerateDecelerateInterpolator());
       obj.setDuration(500);
       return obj;
    }
    public AuctionBidButton j0(){
       return this.h1;
    }
    public final a$a k0(int p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uob, "44");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       uob = null;
       b tl1 = this.l1;
       if (tl1 != null && (tl1.size() > 0 && p0 < this.l1.size())) {
          uob = this.l1.get(p0);
       }
    label_0035 :
       return uob;
    }
    public final a$a l0(){
       Object obj = PatchProxy.apply(null, this, b.class, "43");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.k0(0);
    }
    public final boolean m0(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, b.class, "45");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = a.a(new b$h(this).getType());
       if (obj == null) {
          return false;
       }
       return obj.containsKey(p0);
    }
    public final boolean n0(a$a p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "47");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 == null) {
          return false;
       }
       return TextUtils.n(QCurrentUser.me().getId(), String.valueOf(p0.a));
    }
    public final boolean o0(){
       a$a obj = PatchProxy.apply(null, this, b.class, "46");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.l0();
       int i = 1;
       a$a uoa = this.k0(i);
       if (obj == null || uoa == null) {
          return false;
       }
       if (this.n0(obj) || (!this.n0(uoa) || !this.X.a())) {
          i = false;
       }
       return i;
    }
    public void p(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.f().addOnLayoutChangeListener(this.M);
       super.p();
       return;
    }
    public final void p0(boolean p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "49")) {
          return;
       }
       this.q0(o5.c(this.f1.getText().toString()), p0);
       uob = this.u1;
       if (uob != null) {
          uob.a(p0);
       }
       return;
    }
    public final void q0(long p0,boolean p1){
       AbstractAuctionBubble a;
       a$b uob1;
       int i1;
       int i2;
       long l;
       b z0;
       AbstractAuctionBubble uAbstractAuc = this;
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), Boolean.valueOf(p1), this, uob, "54")) {
          return;
       }
       if (uAbstractAuc.z == 1) {
          if (p1) {
             if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uob, "52")) {
                a = uAbstractAuc.A;
                if (a != null) {
                   uob1 = a.get(0);
                   i1 = 0;
                   while (p0 - uob1.b >= 0) {
                      i2 = uAbstractAuc.A.size() - 1;
                      if (i1 < i2) {
                         i1 = i1 + 1;
                         uob1 = uAbstractAuc.A.get(i1);
                      }else {
                         break ;
                      }
                   }
                   a$b c = uob1.c;
                   if (c != null) {
                      l = c[(uAbstractAuc.Z0[i1] % c.length)];
                      uAbstractAuc.b1 = l;
                      long l1 = p0 + l;
                      uAbstractAuc.a1 = l1;
                      if (l1 - uob1.b < 0 || i1 == (uAbstractAuc.A.size() - 1)) {
                         z0 = uAbstractAuc.Z0;
                         z0[i1] = z0[i1] + 1;
                      }else {
                         i1 = i1 + 1;
                         uob1 = uAbstractAuc.A.get(i1);
                      }
                      uob1 = uob1.c;
                      if (uob1 != null) {
                         uAbstractAuc.c1 = uob1[(uAbstractAuc.Z0[i1] % uob1.length)];
                      }
                   }
                }
             }
          }else if(PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uob, "53")){
             a = uAbstractAuc.A;
             if (a != null) {
                uob1 = a.get(0);
                i1 = 0;
                while (p0 - uob1.b >= 0) {
                   i2 = uAbstractAuc.A.size() - 1;
                   if (i1 < i2) {
                      i1 = i1 + 1;
                      uob1 = uAbstractAuc.A.get(i1);
                   }else {
                      break ;
                   }
                }
                z0 = uAbstractAuc.Z0;
                if (!z0[i1]) {
                   i1 = i1 - 1;
                   uob1 = uAbstractAuc.A.get(i1);
                }else {
                   z0[i1] = z0[i1] - 1;
                }
                uob1 = uob1.c;
                if (uob1 != null) {
                   z0 = uAbstractAuc.Z0;
                   l = uob1[(z0[i1] % uob1.length)];
                   uAbstractAuc.c1 = l;
                   uAbstractAuc.a1 = p0 - l;
                   if (!z0[i1]) {
                      i1 = i1 - 1;
                      uob1 = uAbstractAuc.A.get(i1).c;
                      if (uob1 != null) {
                         uAbstractAuc.b1 = uob1[(uAbstractAuc.Z0[i1] % uob1.length)];
                      }
                   }else {
                      uAbstractAuc.b1 = uob1[((z0[i1] - 1) % uob1.length)];
                   }
                }
             }
          }
       }else {
          long l2 = (long)uAbstractAuc.y;
          l2 = (p1)? p0 + l2: p0 - l2;
          uAbstractAuc.a1 = l2;
          a = uAbstractAuc.y;
          uAbstractAuc.b1 = (long)a;
          uAbstractAuc.c1 = (long)a;
       }
    label_014a :
       b a1 = uAbstractAuc.a1;
       b b1 = uAbstractAuc.b1;
       b c1 = uAbstractAuc.c1;
       if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidThreeRefs(Long.valueOf(a1), Long.valueOf(b1), Long.valueOf(c1), this, b.class, "51")) {
          Object[] objArray = new Object[]{Long.valueOf(a1)};
          uAbstractAuc.f1.setText(String.format(Locale.getDefault(), "%1$d", objArray));
          objArray = new Object[]{Long.valueOf(b1)};
          uAbstractAuc.e1.setText(String.format(Locale.getDefault(), "%1$d", objArray));
          objArray = new Object[]{Long.valueOf(c1)};
          uAbstractAuc.g1.setText(String.format(Locale.getDefault(), "%1$d", objArray));
          int i = 0x7f061dfb;
          uAbstractAuc.g1.setTextColor(a1.a(i));
          if (a1 - (o5.c(uAbstractAuc.n1) + b1) <= 0) {
             uAbstractAuc.d1.setImageResource(R.drawable.arg_RES_7f080128);
             uAbstractAuc.e1.setTextColor(a1.a(R.color.arg_RES_7f06180f));
             uAbstractAuc.e1.setEnabled(0);
          }else {
             uAbstractAuc.d1.setImageResource(R.drawable.arg_RES_7f080127);
             uAbstractAuc.e1.setTextColor(a1.a(i));
             uAbstractAuc.e1.setEnabled(1);
          }
       }
       return;
    }
    public void r0(View p0,View p1){
       b uob = b.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, uob, "5")) {
          return;
       }
       if (p1 != null && p1.getVisibility() != 8) {
          int i = 2;
          int[] ointArray = new int[i];
          p1.getLocationOnScreen(ointArray);
          int i1 = 0;
          if (!ointArray[i1] && !ointArray[1]) {
             return;
          }else {
             int[] ointArray1 = PatchProxy.applyOneRefs(p0, this, uob, "6");
             if (ointArray1 != PatchProxyResult.class) {
             }else {
                ointArray1 = new int[i];
                p0.getParent().getLocationOnScreen(ointArray1);
                int[] ointArray2 = new int[i];
                ointArray2[i1] = ointArray1[i1] + p0.getLeft();
                ointArray2[1] = ointArray1[1] + p0.getTop();
                ointArray1 = ointArray2;
             }
             p0.setPivotX(((float)(ointArray[i1] - ointArray1[i1]) + ((float)p1.getWidth() / 2.00f)));
             p0.setPivotY(((float)(ointArray[1] - ointArray1[1]) + ((float)p1.getHeight() / 2.00f)));
          }
       }
       return;
    }
    public void s0(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "18")) {
          return;
       }
       this.n1 = p0;
       this.S.setText(p0);
       b tY0 = this.Y0;
       System.arraycopy(tY0, 0, this.Z0, 0, tY0.length);
       this.q0(o5.c(p0), true);
       return;
    }
    public void t0(boolean p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "22")) {
          return;
       }
       this.q1 = p0;
       a$a uoa = this.l0();
       if (!this.o0() && (!this.n0(uoa) && this.q1 != null)) {
          b tX = this.X;
          Objects.requireNonNull(tX);
          if (!PatchProxy.applyVoid(null, tX, AuctionBidderSwitcher.class, "4")) {
             TextView textView = tX.getCurrentView().findViewById(R.id.auction_current_bidder_name);
             String str = textView.getText().toString();
             AuctionBidderSwitcher d = tX.d;
             if (d != null && (!d.isRunning() && !TextUtils.x(str))) {
                textView.setText(b.b(str));
             }
          }
       }
       return;
    }
    public void u0(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "19")) {
          return;
       }
       this.V.setText("гд"+p0);
       return;
    }
    public void v(){
       if (PatchProxy.applyVoid(null, this, b.class, "8")) {
          return;
       }
       super.v();
       b9.a(this.s1);
       k1.n(this);
       b tw1 = this.w1;
       if (tw1 != null) {
          tw1.removeAllListeners();
          this.w1.cancel();
       }
       tw1 = this.x1;
       if (tw1 != null) {
          tw1.removeAllListeners();
          this.x1.cancel();
       }
       tw1 = this.y1;
       if (tw1 != null) {
          tw1.removeAllListeners();
          this.y1.cancel();
       }
       tw1 = this.A1;
       if (tw1 != null) {
          tw1.removeAllListeners();
          this.A1.cancel();
       }
       tw1 = this.z1;
       if (tw1 != null) {
          tw1.removeAllListeners();
          this.z1.cancel();
       }
       tw1 = this.X;
       if (tw1 != null) {
          Objects.requireNonNull(tw1);
          if (!PatchProxy.applyVoid(null, tw1, AuctionBidderSwitcher.class, "1")) {
             k1.n(tw1);
             AuctionBidderSwitcher d = tw1.d;
             if (d != null) {
                d.removeAllListeners();
                tw1.d.cancel();
             }
          }
       }
       tw1 = this.B1;
       if (tw1 != null) {
          tw1.clear();
          this.B1 = null;
       }
       tw1 = this.h1;
       if (tw1 != null) {
          Objects.requireNonNull(tw1);
          if (!PatchProxy.applyVoid(null, tw1, AuctionBidButton.class, "7")) {
             AuctionBidButton e = tw1.e;
             if (e != null) {
                tw1.h = true;
                e.cancel();
             }
             e = tw1.b;
             if (e != null) {
                e.k();
             }
             e = tw1.g;
             if (e != null) {
                e.clear();
                tw1.g = null;
             }
             e = tw1.f;
             if (e != null) {
                e.clear();
                tw1.f = null;
             }
          }
       }
       return;
    }
    public void v0(){
       if (PatchProxy.applyVoid(null, this, b.class, "20")) {
          return;
       }
       if (this.m0(this.m1.mId)) {
          a$a uoa = this.l0();
          if (uoa == null) {
             return;
          }else if(TextUtils.n(QCurrentUser.me().getId(), String.valueOf(uoa.a))){
             this.i0(a1.p(R.string.arg_RES_7f100266));
             this.W.setImageResource(R.drawable.arg_RES_7f080131);
          }else {
             this.i0(a1.p(R.string.arg_RES_7f10026b));
             this.W.setImageResource(R.drawable.arg_RES_7f080130);
          }
       }
       return;
    }
}
