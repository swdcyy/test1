package com.yxcorp.gifshow.homepage.presenter.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.component.feedstaggercard.model.CardStyle;
import com.yxcorp.gifshow.homepage.presenter.g$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import android.app.Activity;
import com.yxcorp.utility.n;
import lnc.d2;
import android.view.View$OnLayoutChangeListener;
import android.view.ViewTreeObserver;
import com.yxcorp.gifshow.homepage.presenter.g$b;
import android.view.ViewTreeObserver$OnPreDrawListener;
import com.kwai.component.homepage_interface.channel.model.ChannelTemplateMeta;
import android.graphics.drawable.GradientDrawable$Orientation;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.Drawable;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.widget.ImageView;
import android.net.Uri;
import com.yxcorp.gifshow.homepage.presenter.g$c;
import ub.b;
import com.facebook.imagepipeline.request.ImageRequest;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.widget.TextView;
import android.text.TextPaint;
import com.kwai.component.homepage_interface.channel.model.ChannelTemplateCoverInfo;
import ekd.j;
import com.yxcorp.gifshow.homepage.presenter.g$d;
import com.yxcorp.gifshow.model.CDNUrl;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import bd.f;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import lnc.a1;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.content.Context;
import android.graphics.Typeface;
import ekd.d0;
import yta.q;
import android.view.View$OnClickListener;
import com.kwai.framework.model.feed.BaseFeed;

public class g extends PresenterV2	// class@0017c9
{
    public float A;
    public final boolean B;
    public f C;
    public CardStyle D;
    public View$OnLayoutChangeListener E;
    public BaseFeed p;
    public ChannelTemplateMeta q;
    public View r;
    public KwaiImageView s;
    public TextView t;
    public TextView u;
    public View v;
    public TextView w;
    public KwaiImageView x;
    public View y;
    public float z;

    public void g(boolean p0,CardStyle p1){
       super();
       this.E = new g$a(this);
       this.B = p0;
       float f = (p0)? 161.00f: 148.00f;
       this.z = f;
       float f1 = (p0)? 12.00f: 49.00f;
       this.A = f1;
       this.D = p1;
       return;
    }
    public void E8(){
       GradientDrawable gradientDraw;
       g og = g.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, og, "3")) {
          return;
       }
       int measuredWidt = this.r.getMeasuredWidth();
       if (d2.h(n.k(this.getActivity()), n.j(this.getActivity()))) {
          this.r.addOnLayoutChangeListener(this.E);
       }
       if (measuredWidt > 0) {
          this.R8(measuredWidt);
       }else {
          this.r.getViewTreeObserver().addOnPreDrawListener(new g$b(this));
       }
       g tr = this.r;
       g tq = this.q;
       ChannelTemplateMeta mBgStartColo = tq.mBgStartColor;
       ChannelTemplateMeta mBgEndColor = tq.mBgEndColor;
       GradientDrawable$Orientation tOP_BOTTOM = GradientDrawable$Orientation.TOP_BOTTOM;
       if (PatchProxy.isSupport(og)) {
          gradientDraw = PatchProxy.applyThreeRefs(Integer.valueOf(mBgStartColo), Integer.valueOf(mBgEndColor), tOP_BOTTOM, this, g.class, "8");
          if (gradientDraw != PatchProxyResult.class) {
          label_007a :
             tr.setBackground(gradientDraw);
             if (TextUtils.x(this.q.mMarkIconUrl)) {
                this.s.setVisibility(8);
                this.C = objArray;
             }else {
                this.s.setVisibility(0);
                this.s.B(Uri.parse(this.q.mMarkIconUrl), 0, 0, new g$c(this));
             }
             if (TextUtils.x(this.q.mTitle)) {
                this.t.setVisibility(8);
             }else {
                this.t.setVisibility(0);
                this.t.setText(this.q.mTitle);
                this.t.setTextColor(this.q.mTitleColor);
             }
             this.t.getPaint().setFakeBoldText(true);
             if (TextUtils.x(this.q.mSecondaryTitle)) {
                this.u.setVisibility(8);
             }else {
                this.u.setVisibility(0);
                this.u.setText(this.q.mSecondaryTitle);
                this.u.setTextColor(this.q.mSecondaryTitleColor);
             }
             ChannelTemplateMeta mMainCoverIn = this.q.mMainCoverInfo;
             if (mMainCoverIn != null && !j.h(mMainCoverIn.mCoverUrl)) {
                this.x.a0(this.q.mMainCoverInfo.mCoverUrl, new g$d(this));
             }
             if (TextUtils.x(this.q.mContent)) {
                View[] viewArray = new View[true];
                viewArray[0] = this.w;
                n.Z(8, viewArray);
             }else {
                og = this.w;
                if (og != null) {
                   og.setVisibility(0);
                   this.w.setText(this.q.mContent);
                }
             }
             return;
          }
       }
       int[] ointArray = new int[]{mBgStartColo,mBgEndColor};
       gradientDraw = new GradientDrawable(tOP_BOTTOM, ointArray);
       goto label_007a ;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, g.class, "4")) {
          return;
       }
       this.r.removeOnLayoutChangeListener(this.E);
       this.C = null;
       return;
    }
    public void P8(int p0){
       g og = g.class;
       if (PatchProxy.isSupport(og) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, og, "5")) {
          return;
       }
       if (this.C != null && !this.s.getVisibility()) {
          p0 = (int)(((float)p0 * 15.00f) / 201.00f);
          int i = (int)(((float)p0 * 16.00f) / 15.00f);
          ViewGroup$MarginLayoutParams layoutParams = this.s.getLayoutParams();
          layoutParams.leftMargin = p0;
          layoutParams.rightMargin = p0;
          layoutParams.topMargin = i;
          layoutParams.height = i;
          g tD = this.D;
          if (tD != null && CardStyle.isV4Bottom(tD.mBottomType)) {
             layoutParams.height = i + 12;
          }
          layoutParams.width = (int)(((double)(layoutParams.height * this.C.getWidth()) * 0x3ff0000000000000) / (double)this.C.getHeight());
          this.s.setLayoutParams(layoutParams);
       }
       return;
    }
    public void R8(int p0){
       int i5;
       g og = this;
       int i = p0;
       g og1 = g.class;
       if (PatchProxy.isSupport(og1) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, og1, "6")) {
          return;
       }
       float f = (float)i;
       float f1 = 201.00f;
       int i1 = (int)((f * 15.00f) / f1);
       float f2 = (float)i1;
       int i2 = (int)((16.00f * f2) / 15.00f);
       ConstraintLayout$LayoutParams layoutParams = og.t.getLayoutParams();
       layoutParams.topMargin = i2 / 2;
       layoutParams.u = i2;
       layoutParams.leftMargin = i1;
       layoutParams.rightMargin = i1;
       og.t.setLayoutParams(layoutParams);
       og.t.setTextSize((float)(int)((20.00f * f) / (float)a1.e(f1)));
       ViewGroup$MarginLayoutParams layoutParams1 = og.u.getLayoutParams();
       int i3 = i2 / 4;
       layoutParams1.topMargin = i3;
       layoutParams1.leftMargin = i1;
       layoutParams1.rightMargin = i1;
       og.u.setLayoutParams(layoutParams1);
       og.u.setTextSize((float)(int)((f * 12.00f) / (float)a1.e(f1)));
       int i4 = i - (i1 * 2);
       g v = og.v;
       if (v != null) {
          g a = og.A;
          i5 = (int)(((float)i4 * a) / 171.00f);
          layoutParams1 = v.getLayoutParams();
          layoutParams1.width = (int)(((float)i5 * og.z) / a);
          layoutParams1.height = i5;
          i5 = (og.B != null)? i2: i3;
          layoutParams1.topMargin = i5;
          layoutParams1.leftMargin = i1;
          layoutParams1.rightMargin = i1;
          og.v.setLayoutParams(layoutParams1);
       }
       v = og.w;
       if (v != null) {
          float f3 = (float)i4;
          i4 = (int)((48.00f * f3) / 171.00f);
          i5 = (int)((24.00f * f2) / 15.00f);
          layoutParams1 = v.getLayoutParams();
          layoutParams1.height = i4;
          layoutParams1.bottomMargin = i5;
          og.w.setLayoutParams(layoutParams1);
          layoutParams1 = og.x.getLayoutParams();
          layoutParams1.bottomMargin = (!og.w.getVisibility())? i5 + (i4 / 2): i5 - 12;
          layoutParams1.leftMargin = i1;
          layoutParams1.rightMargin = i1;
          og.x.setLayoutParams(layoutParams1);
          if (!PatchProxy.isSupport(og1) || !PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(i2), Integer.valueOf(i1), this, g.class, "7")) {
             g y = og.y;
             if (y != null) {
                int i6 = (int)((f3 * og.A) / 171.00f);
                if (og.B == null) {
                   i2 = (i3 + i6) - i1;
                }
                ViewGroup$MarginLayoutParams layoutParams2 = y.getLayoutParams();
                layoutParams2.topMargin = i2;
                layoutParams2.bottomMargin = (int)((f2 * 33.00f) / 15.00f);
                og.y.setLayoutParams(layoutParams2);
             }
          }
       }
    label_0133 :
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "2")) {
          return;
       }
       this.r = m1.f(p0, 0x7f0a36a4);
       this.s = m1.f(p0, 0x7f0a2a83);
       this.v = m1.f(p0, 0x7f0a09db);
       this.t = m1.f(p0, 0x7f0a2a5b);
       TextView textView = m1.f(p0, R.id.sub_title_view);
       this.u = textView;
       textView.getPaint().setFakeBoldText(true);
       this.x = m1.f(p0, 0x7f0a3105);
       textView = m1.f(p0, R.id.reason_view);
       this.w = textView;
       if (textView != null) {
          textView.setTypeface(d0.a("alte-din.ttf", this.getContext()));
       }
       this.y = m1.f(p0, 0x7f0a3d93);
       this.r.setOnClickListener(new q(this));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, g.class, "1")) {
          return;
       }
       this.p = this.q8(BaseFeed.class);
       this.q = this.q8(ChannelTemplateMeta.class);
       return;
    }
}
