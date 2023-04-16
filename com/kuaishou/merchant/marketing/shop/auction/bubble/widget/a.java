package com.kuaishou.merchant.marketing.shop.auction.bubble.widget.a;
import com.kuaishou.merchant.marketing.shop.auction.bubble.widget.AbstractAuctionBubble;
import android.content.Context;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lnc.a1;
import android.widget.ImageView;
import java.lang.StringBuilder;
import java.lang.Integer;
import java.lang.CharSequence;
import android.widget.TextView;
import z84.e;
import com.kuaishou.merchant.marketing.shop.auction.bubble.widget.a$e;
import e17.i;
import z84.d;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import z84.i;
import java.lang.Runnable;
import z84.k;
import com.lsjwzh.widget.text.FastTextView;
import crd.b;
import lnc.b9;
import android.util.Property;
import android.animation.ObjectAnimator;
import android.animation.AnimatorSet;
import android.animation.Animator;
import z84.l;
import android.animation.Animator$AnimatorListener;
import java.lang.Long;
import com.kwai.robust.PatchProxyResult;
import android.widget.FrameLayout;
import xm4.a;
import android.text.SpannableStringBuilder;
import java.util.List;
import java.util.Objects;
import com.kuaishou.merchant.marketing.shop.auction.bubble.widget.a$d;
import java.util.Collection;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import java.lang.Boolean;
import android.widget.LinearLayout;
import com.kuaishou.merchant.api.core.model.Commodity;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.view.View$OnClickListener;
import android.widget.TextSwitcher;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.widget.selector.view.SelectShapeView;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.recycler.widget.KwaiStaggeredGridLayoutManager;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import android.view.animation.LayoutAnimationController;
import android.view.animation.AnimationUtils;
import z84.c;
import g94.b;
import z84.j;
import com.yxcorp.widget.selector.view.SelectShapeLinearLayout;
import com.kuaishou.merchant.marketing.shop.auction.bubble.widget.a$a;
import f14.g;
import android.animation.PropertyValuesHolder;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.animation.TimeInterpolator;
import com.kuaishou.merchant.marketing.shop.auction.bubble.widget.AbstractAuctionBubble$AuctionSuspendStatus;
import java.lang.Number;
import com.yxcorp.utility.f;
import brd.t;
import z84.g;
import erd.g;

public class a extends AbstractAuctionBubble	// class@001b90
{
    public TextView M;
    public TextView N;
    public KwaiImageView O;
    public ImageView P;
    public ImageView Q;
    public TextView R;
    public RecyclerView S;
    public a$d T;
    public TextView U;
    public AnimatorSet U0;
    public TextView V;
    public SelectShapeLinearLayout V0;
    public TextView W;
    public ImageView W0;
    public SelectShapeView X;
    public TextView X0;
    public TextSwitcher Y;
    public b Y0;
    public AnimatorSet Z;
    public b Z0;
    public boolean a1;
    public int b1;
    public String c1;

    public void a(Context p0){
       super(p0);
       this.a1 = false;
       this.b1 = 10;
    }
    public void D(){
       if (PatchProxy.applyVoid(null, this, a.class, "12")) {
          return;
       }
       String str = a1.p(R.string.arg_RES_7f100260);
       this.W0.setBackgroundResource(R.drawable.arg_RES_7f080e5e);
       Object[] objArray = new Object[]{Integer.valueOf(this.b1)};
       this.X0.setText(String.format(str+"\(%1$s\)", objArray));
       this.n0(new e(this, str));
       i.e(R.style.arg_RES_7f11066a, a1.p(R.string.arg_RES_7f100269), 0);
       return;
    }
    public void E(){
       if (PatchProxy.applyVoid(null, this, a.class, "11")) {
          return;
       }
       String str = a1.p(R.string.arg_RES_7f10025f);
       this.W0.setBackgroundResource(R.drawable.arg_RES_7f080e5d);
       Object[] objArray = new Object[]{Integer.valueOf(this.b1)};
       this.X0.setText(String.format(str+"\(%1$s\)", objArray));
       this.n0(new d(this, str));
       i.e(R.style.arg_RES_7f11066a, a1.p(R.string.arg_RES_7f10026a), 0);
       return;
    }
    public void J(){
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "29")) {
          return;
       }
       this.N.setText(a1.p(R.string.arg_RES_7f10026c));
       this.q.setVisibility(8);
       this.S.setVisibility(0);
       if (!PatchProxy.applyVoid(objArray, this, uoa, "33") && this.w != 2) {
          this.W.animate().alpha(0).setDuration(200).withEndAction(new i(this)).start();
          this.R.animate().alpha(0).setDuration(200).withEndAction(new k(this)).start();
       }
       return;
    }
    public void K(){
       if (PatchProxy.applyVoid(null, this, a.class, "31")) {
          return;
       }
       if (this.w == 3) {
          return;
       }
       this.p.setTextColor(a1.a(R.color.arg_RES_7f061dfb));
       this.P.setImageResource(R.drawable.arg_RES_7f08012a);
       return;
    }
    public void L(){
       if (PatchProxy.applyVoid(null, this, a.class, "9")) {
          return;
       }
       this.W0.setVisibility(8);
       this.X0.setTextColor(R.color.arg_RES_7f061d77);
       this.X0.setTextSize(1, 10.00f);
       this.X0.setText(a1.p(R.string.arg_RES_7f100268)+"\n"+a1.p(R.string.arg_RES_7f1002a4));
       return;
    }
    public void M(){
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "32")) {
          return;
       }
       b9.a(this.G);
       if (!PatchProxy.applyVoid(objArray, this, uoa, "35")) {
          ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(this.S, View.ALPHA, new float[2]{0x3f800000,0});
          ObjectAnimator objectAnimat1 = ObjectAnimator.ofFloat(this.X, View.ALPHA, new float[2]{0x3f800000,0});
          ObjectAnimator objectAnimat2 = ObjectAnimator.ofFloat(this.U, View.ALPHA, new float[2]{0x3f800000,0});
          ObjectAnimator objectAnimat3 = ObjectAnimator.ofFloat(this.V, View.ALPHA, new float[2]{0x3f800000,0});
          ObjectAnimator objectAnimat4 = ObjectAnimator.ofFloat(this.q, View.ALPHA, new float[2]{0,0x3f800000});
          if (this.U0 == null) {
             this.U0 = new AnimatorSet();
          }
          this.U0.cancel();
          Animator[] uAnimatorArr = new Animator[]{objectAnimat,objectAnimat1,objectAnimat2,objectAnimat3,objectAnimat4};
          this.U0.playTogether(uAnimatorArr);
          this.U0.setDuration(200);
          this.U0.removeAllListeners();
          this.U0.addListener(new l(this));
          this.U0.start();
       }
       return;
    }
    public void N(){
       if (PatchProxy.applyVoid(null, this, a.class, "28")) {
          return;
       }
       this.N.setText(a1.p(R.string.arg_RES_7f10029d));
       this.W.setVisibility(0);
       this.R.setVisibility(0);
       this.S.setVisibility(8);
       this.U.setVisibility(8);
       this.X.setVisibility(8);
       this.V.setVisibility(8);
       this.q.setVisibility(8);
       return;
    }
    public void O(long p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uoa, "8")) {
          return;
       }
       super.O(p0);
       this.i0(this.k0());
       return;
    }
    public View P(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.c(p0, 0x7f0d012c, new FrameLayout(p0), false);
    }
    public void Q(){
       if (PatchProxy.applyVoid(null, this, a.class, "30")) {
          return;
       }
       this.p.setTextColor(a1.a(R.color.arg_RES_7f061d77));
       this.P.setImageResource(R.drawable.arg_RES_7f080129);
       return;
    }
    public void T(CharSequence p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "19")) {
          return;
       }
       SpannableStringBuilder spannableStr = new SpannableStringBuilder();
       spannableStr.append(p0);
       this.M.setText(spannableStr.append(p1));
       return;
    }
    public void U(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "24")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       a tT = this.T;
       Objects.requireNonNull(tT);
       if (!PatchProxy.applyVoidOneRefs(p0, tT, a$d.class, "1")) {
          tT.e.clear();
          tT.e.addAll(p0);
          tT.k0();
          tT.g.S.scheduleLayoutAnimation();
       }
       return;
    }
    public void V(boolean p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "2")) {
          return;
       }
       uoa = this.V0;
       int i = (p0)? 0: 8;
       uoa.setVisibility(i);
       return;
    }
    public void W(Commodity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "18")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       this.c1 = p0.mId;
       this.O.P(p0.mImageUrls);
       return;
    }
    public void Z(View$OnClickListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "23")) {
          return;
       }
       this.u.setOnClickListener(p0);
       return;
    }
    public void d0(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "21")) {
          return;
       }
       this.Y.setText(p0);
       return;
    }
    public void doBindView(View p0){
       a uoa = a.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoa, "5")) {
          return;
       }
       this.M = m1.f(p0, 0x7f0a029f);
       this.N = m1.f(p0, 0x7f0a02ca);
       this.O = m1.f(p0, 0x7f0a029e);
       this.W = m1.f(p0, 0x7f0a02be);
       this.P = m1.f(p0, 0x7f0a09a1);
       this.X = m1.f(p0, 0x7f0a02d2);
       this.R = m1.f(p0, 0x7f0a02c2);
       this.S = m1.f(p0, 0x7f0a0292);
       Context context = p0.getContext();
       if (!PatchProxy.applyVoidOneRefs(context, this, uoa, "16")) {
          this.S.setLayoutManager(new KwaiStaggeredGridLayoutManager(1, 1));
          this.S.setLayoutAnimation(AnimationUtils.loadLayoutAnimation(context, R.anim.arg_RES_7f01006e));
          a$d uod = new a$d(this);
          this.T = uod;
          this.S.setAdapter(uod);
       }
       this.U = m1.f(p0, 0x7f0a02d5);
       this.V = m1.f(p0, 0x7f0a02b7);
       this.R.setOnClickListener(new c(this));
       TextSwitcher textSwitcher = m1.f(p0, R.id.auction_start_price);
       this.Y = textSwitcher;
       b.a(textSwitcher, 12, 40);
       this.v.setVisibility(8);
       ImageView imageView = m1.f(p0, R.id.auction_left_card_bg);
       this.Q = imageView;
       imageView.post(new j(this));
       this.V0 = m1.f(p0, 0x7f0a4431);
       this.W0 = m1.f(p0, 0x7f0a0973);
       this.X0 = m1.f(p0, 0x7f0a0974);
       this.V0.setOnClickListener(new a$a(this));
       return;
    }
    public int e(){
       return 12;
    }
    public Animator g(){
       ObjectAnimator obj = PatchProxy.apply(null, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.l0();
       PropertyValuesHolder[] propertyValu = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.SCALE_X, new float[2]{0x3f800000,0}),PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[2]{0x3f800000,0})};
       obj = ObjectAnimator.ofPropertyValuesHolder(this.b, propertyValu);
       obj.setInterpolator(new AccelerateDecelerateInterpolator());
       obj.setDuration(500);
       return obj;
    }
    public final void i0(boolean p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "14")) {
          return;
       }
       if (!this.V0.getVisibility() && this.j0() != p0) {
          this.V0.setTag(R.id.auction_suspend_btn_status, Boolean.valueOf(p0));
          uoa = this.V0;
          float f = (p0)? 0x3f800000: 0x3f000000;
          uoa.setAlpha(f);
       }
       return;
    }
    public Animator j(){
       ObjectAnimator obj = PatchProxy.apply(null, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.l0();
       PropertyValuesHolder[] propertyValu = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.SCALE_X, new float[2]{0,0x3f800000}),PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[2]{0,0x3f800000})};
       obj = ObjectAnimator.ofPropertyValuesHolder(this.b, propertyValu);
       obj.setInterpolator(new AccelerateDecelerateInterpolator());
       obj.setDuration(500);
       return obj;
    }
    public final boolean j0(){
       Object obj = PatchProxy.apply(null, this, a.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.V0.getTag(R.id.auction_suspend_btn_status);
       if (obj instanceof Boolean) {
          return obj.booleanValue();
       }
       return true;
    }
    public final boolean k0(){
       Object obj = PatchProxy.apply(null, this, a.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.a1 != null) {
          return false;
       }
       if (this.H() == AbstractAuctionBubble$AuctionSuspendStatus.RESUME) {
          return (this.I() ^ 1);
       }
       return 1;
    }
    public final void l0(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a.class, "17")) {
          return;
       }
       this.f().setPivotX(0);
       View view = this.f();
       Object obj = PatchProxy.apply(objArray, this, AbstractAuctionBubble.class, "2");
       int i = (obj != PatchProxyResult.class)? obj.intValue(): a1.d(R.dimen.arg_RES_7f070291);
       view.setPivotY((float)i);
       return;
    }
    public void m0(View$OnClickListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "25")) {
          return;
       }
       this.V.setOnClickListener(p0);
       return;
    }
    public final void n0(a$e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "13")) {
          return;
       }
       b9.a(this.Z0);
       this.Z0 = f.d().b((long)(this.b1 * 1000), 1000).subscribe(new g(this, p0));
       return;
    }
    public void v(){
       if (PatchProxy.applyVoid(null, this, a.class, "20")) {
          return;
       }
       super.v();
       b9.a(this.Z0);
       a tW = this.W;
       if (tW != null) {
          tW.animate().cancel();
       }
       tW = this.R;
       if (tW != null) {
          tW.animate().cancel();
       }
       tW = this.Z;
       if (tW != null) {
          tW.cancel();
       }
       tW = this.U;
       if (tW != null) {
          tW.animate().cancel();
       }
       tW = this.V;
       if (tW != null) {
          tW.animate().cancel();
       }
       tW = this.U0;
       if (tW != null) {
          tW.cancel();
       }
       return;
    }
}
