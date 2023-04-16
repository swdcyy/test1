package com.yxcorp.gifshow.activity.share.widget.RandomCoinDialog;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import ml8.d;
import u07.t;
import com.yxcorp.gifshow.activity.share.widget.RandomCoinDialog$b;
import nsd.u;
import android.app.Activity;
import dnc.v1;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import u07.t$a;
import com.yxcorp.gifshow.activity.share.widget.RandomCoinDialog$mNumAddUpAnim$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.activity.share.widget.RandomCoinDialog$mBackgroundAnim$2;
import com.yxcorp.gifshow.activity.share.widget.RandomCoinDialog$mCritScaleAnim$2;
import com.kwai.library.widget.popup.common.c$b;
import com.yxcorp.gifshow.activity.share.widget.RandomCoinDialog$a;
import com.kwai.library.widget.popup.common.PopupInterface$b;
import com.yxcorp.gifshow.widget.shimmer.ShimmerFrameLayout;
import com.kwai.library.widget.popup.common.c;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import i2b.a;
import java.util.Objects;
import android.widget.FrameLayout;
import java.lang.CharSequence;
import android.widget.TextView;
import android.content.Context;
import lnc.a1;
import android.graphics.Typeface;
import ekd.d0;
import o07.n;
import ekd.m1;
import android.widget.Button;
import android.widget.ImageView;
import com.airbnb.lottie.LottieAnimationView;
import com.yxcorp.gifshow.activity.share.widget.RandomCoinDialog$c;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.activity.share.widget.RandomCoinDialog$d;

public final class RandomCoinDialog extends t implements PopupInterface$f, d	// class@0014a6
{
    public View A;
    public final p B;
    public final p C;
    public final p D;
    public final v1 E;
    public ShimmerFrameLayout r;
    public TextView s;
    public TextView t;
    public TextView u;
    public TextView v;
    public Button w;
    public ImageView x;
    public LottieAnimationView y;
    public LottieAnimationView z;
    public static final RandomCoinDialog$b F;

    static {
       RandomCoinDialog.F = new RandomCoinDialog$b(null);
    }
    public void RandomCoinDialog(Activity p0,v1 p1){
       a.p(p0, "activity");
       a.p(p1, "params");
       super(new t$a(p0));
       this.E = p1;
       this.B = s.c(new RandomCoinDialog$mNumAddUpAnim$2(this));
       this.C = s.c(new RandomCoinDialog$mBackgroundAnim$2(this));
       this.D = s.c(new RandomCoinDialog$mCritScaleAnim$2(this));
       this.b0().A(false);
       this.b0().L(this);
       this.b0().G(new RandomCoinDialog$a(this));
    }
    public static final ShimmerFrameLayout e0(RandomCoinDialog p0){
       p0 = p0.r;
       if (p0 == null) {
          a.S("mCoinContainer");
       }
       return p0;
    }
    public View a(c p0,LayoutInflater p1,ViewGroup p2,Bundle p3){
       p3 = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, RandomCoinDialog.class, "5");
       if (p3 != PatchProxyResult.class) {
          return p3;
       }
       a.p(p0, "popup");
       a.p(p1, "inflater");
       a.p(p2, "container");
       boolean b = false;
       View view = a.g(p1, R.layout.arg_RES_7f0d0309, p2, b);
       this.doBindView(view);
       RandomCoinDialog tr = this.r;
       if (tr == null) {
          a.S("mCoinContainer");
       }
       Objects.requireNonNull(tr);
       if (!PatchProxy.applyVoid(null, tr, ShimmerFrameLayout.class, "7")) {
          tr.c();
          tr.d = b;
          tr.invalidate();
       }
       tr = this.s;
       if (tr == null) {
          a.S("mTvTitle");
       }
       tr.setText(this.E.a);
       tr = this.t;
       if (tr == null) {
          a.S("mTvSubTitle");
       }
       tr.setText(this.E.b);
       tr = this.u;
       String str = "mTvPlaceholder";
       if (tr == null) {
          a.S(str);
       }
       tr.setText(String.valueOf(this.E.a()));
       Typeface typeface = d0.a("alte-din.ttf", a1.c());
       if (typeface != null) {
          RandomCoinDialog tu = this.u;
          if (tu == null) {
             a.S(str);
          }
          tu.setTypeface(typeface);
          RandomCoinDialog tv = this.v;
          if (tv == null) {
             a.S("mTvCoinNum");
          }
          tv.setTypeface(typeface);
       }
       a.o(view, "rootView");
       return view;
    }
    public void b(c p0){
       n.a(this, p0);
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RandomCoinDialog.class, "1")) {
          return;
       }
       View view = m1.f(p0, R.id.coin_container);
       a.o(view, "bindWidget\(rootView, R.id.coin_container\)");
       this.r = view;
       view = m1.f(p0, R.id.title);
       a.o(view, "bindWidget\(rootView, R.id.title\)");
       this.s = view;
       view = m1.f(p0, R.id.sub_title);
       a.o(view, "bindWidget\(rootView, R.id.sub_title\)");
       this.t = view;
       view = m1.f(p0, R.id.tv_placeholder);
       a.o(view, "bindWidget\(rootView, R.id.tv_placeholder\)");
       this.u = view;
       view = m1.f(p0, R.id.tv_coin_num);
       a.o(view, "bindWidget\(rootView, R.id.tv_coin_num\)");
       this.v = view;
       view = m1.f(p0, R.id.positive);
       a.o(view, "bindWidget\(rootView, R.id.positive\)");
       this.w = view;
       view = m1.f(p0, R.id.close);
       a.o(view, "bindWidget\(rootView, R.id.close\)");
       this.x = view;
       view = m1.f(p0, R.id.lottie_coin);
       a.o(view, "bindWidget\(rootView, R.id.lottie_coin\)");
       this.y = view;
       view = m1.f(p0, R.id.lottie_firework);
       a.o(view, "bindWidget\(rootView, R.id.lottie_firework\)");
       this.z = view;
       p0 = m1.f(p0, R.id.bg_light);
       a.o(p0, "bindWidget\(rootView, R.id.bg_light\)");
       this.A = p0;
       RandomCoinDialog tw = this.w;
       if (tw == null) {
          a.S("mBtnPositive");
       }
       tw.setOnClickListener(new RandomCoinDialog$c(this));
       tw = this.x;
       if (tw == null) {
          a.S("mIvClose");
       }
       tw.setOnClickListener(new RandomCoinDialog$d(this));
       return;
    }
}
