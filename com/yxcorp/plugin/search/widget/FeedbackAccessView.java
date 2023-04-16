package com.yxcorp.plugin.search.widget.FeedbackAccessView;
import ml8.d;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import android.widget.TextView;
import x6d.a;
import ufd.e;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import android.animation.ValueAnimator;
import ufd.c;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import ufd.d;
import android.view.View$OnClickListener;
import java.lang.Integer;
import e7d.a;
import com.yxcorp.plugin.search.result.SearchKeywordContext;
import add.a;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import sy5.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import k2b.e0;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$AreaPackage;
import com.yxcorp.plugin.search.entity.SearchItem;
import gbd.t;
import ekd.m1;
import k06.a;
import androidx.core.content.ContextCompat;
import nfd.t0;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.Drawable;
import java.lang.Runnable;
import java.lang.Number;
import android.view.View$MeasureSpec;
import android.animation.Animator;
import ekd.f;

public class FeedbackAccessView extends FrameLayout implements d	// class@0007c2
{
    public TextView b;
    public TextView c;
    public h d;
    public Runnable e;
    public ValueAnimator f;

    public void FeedbackAccessView(Context p0){
       super(p0);
       this.c(p0);
    }
    public void FeedbackAccessView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.c(p0);
    }
    public void FeedbackAccessView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.c(p0);
    }
    public final void a(boolean p0){
       if (PatchProxy.isSupport(FeedbackAccessView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, FeedbackAccessView.class, "11")) {
          return;
       }
       FeedbackAccessView tb = this.b;
       if (tb != null && tb.getVisibility() != 8) {
          a.p(false);
          this.f();
          if (!p0) {
             this.b.setVisibility(8);
             return;
          }else {
             this.e(false);
          }
       }
       return;
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, FeedbackAccessView.class, "6")) {
          return;
       }
       this.e = new e(this);
       return;
    }
    public final void c(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FeedbackAccessView.class, "3")) {
          return;
       }
       this.doBindView(a.d(p0, R.layout.arg_RES_7f0d144f, this, true));
       int[] ointArray = new int[]{0,this.getTipWidth()};
       ValueAnimator valueAnimato = ValueAnimator.ofInt(ointArray);
       this.f = valueAnimato;
       valueAnimato.addUpdateListener(new c(this));
       this.f.setDuration(300);
       this.c.setOnClickListener(new d(this, p0));
       this.b();
       return;
    }
    public final void d(int p0){
       SearchKeywordContext mDisplayKeyw;
       if (PatchProxy.isSupport(FeedbackAccessView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, FeedbackAccessView.class, "8")) {
          return;
       }
       String str = this.d.e();
       SearchKeywordContext searchKeywor = this.d.f();
       ClientEvent$ElementPackage uElementPack = PatchProxy.applyThreeRefs(str, "FEED_RELATED_SEARCH", searchKeywor, null, a.class, "15");
       if (uElementPack != PatchProxyResult.class) {
       }else {
          uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "FEEDBACK_FEEDBACK";
          a uoa = a.k();
          uoa.e("search_session_id", str);
          uoa.e("word_source", "FEED_RELATED_SEARCH");
          str = (TextUtils.x(searchKeywor.mDisplayKeyword))? searchKeywor.getLoggerKeyWord(): searchKeywor.mDisplayKeyword;
          uoa.e("keyword", str);
          uoa.e("tab_lv2", searchKeywor.getMinorKeywordWithPosString());
          uElementPack.params = uoa.i();
       }
       t.n(p0, this.d.d(), uElementPack, null, null);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FeedbackAccessView.class, "1")) {
          return;
       }
       this.c = m1.f(p0, 0x7f0a3e17);
       this.b = m1.f(p0, 0x7f0a0e45);
       a uoa = new a();
       uoa.i(ContextCompat.getColor(this.getContext(), R.color.arg_RES_7f060759));
       int q = t0.q;
       float f = (float)q;
       uoa.g(f, (float)q, 0, 0);
       this.b.setBackground(uoa.a());
       uoa = new a();
       uoa.i(ContextCompat.getColor(this.getContext(), R.color.arg_RES_7f060611));
       uoa.m(t0.a);
       uoa.k(ContextCompat.getColor(this.getContext(), R.color.arg_RES_7f06079c));
       uoa.f((float)t0.R);
       this.c.setBackground(uoa.a());
       return;
    }
    public final void e(boolean p0){
       if (PatchProxy.isSupport(FeedbackAccessView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, FeedbackAccessView.class, "14")) {
          return;
       }
       if (p0) {
          this.f.start();
       }else {
          this.f.reverse();
       }
       return;
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, FeedbackAccessView.class, "12")) {
          return;
       }
       FeedbackAccessView tb = this.b;
       if (tb != null) {
          FeedbackAccessView te = this.e;
          if (te != null) {
             tb.removeCallbacks(te);
             this.e = null;
          }
       }
       return;
    }
    public final int getTipWidth(){
       Object obj = PatchProxy.apply(null, this, FeedbackAccessView.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       this.b.measure(View$MeasureSpec.makeMeasureSpec(0, 0), View$MeasureSpec.makeMeasureSpec(0, 0));
       return this.b.getMeasuredWidth();
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, FeedbackAccessView.class, "2")) {
          return;
       }
       super.onDetachedFromWindow();
       f.a(this.f);
       return;
    }
}
