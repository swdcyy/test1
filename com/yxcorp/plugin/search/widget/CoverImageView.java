package com.yxcorp.plugin.search.widget.CoverImageView;
import android.widget.RelativeLayout;
import android.content.Context;
import nfd.t0;
import lnc.a1;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ll8.c$b;
import android.content.res.TypedArray;
import k06.a;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.Drawable;
import com.facebook.drawee.generic.RoundingParams;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.RelativeLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.widget.ImageView;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import yb.a;
import android.view.View;
import android.view.ViewStub;
import com.yxcorp.widget.selector.view.SelectShapeView;
import androidx.core.content.ContextCompat;
import android.graphics.drawable.GradientDrawable$Orientation;
import com.yxcorp.gifshow.widget.LiveCoverIconView;
import android.view.ViewGroup;
import android.widget.TextView;
import android.text.TextUtils$TruncateAt;
import com.yxcorp.plugin.search.entity.template.aggregate.CoverExtInfo;
import java.lang.Boolean;
import com.yxcorp.plugin.search.entity.template.aggregate.TemplateIcon;
import nfd.c3;
import java.util.List;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.yxcorp.gifshow.model.CDNUrl;
import com.kwai.robust.PatchProxyResult;
import nfd.o3;
import java.lang.Integer;
import android.view.View$MeasureSpec;

public class CoverImageView extends RelativeLayout	// class@0007c0
{
    public KwaiImageView b;
    public ViewStub c;
    public SelectShapeView d;
    public RelativeLayout e;
    public LiveCoverIconView f;
    public KwaiImageView g;
    public KwaiImageView h;
    public TextView i;
    public KwaiImageView j;
    public TextView k;
    public int l;
    public boolean m;
    public int n;
    public float o;
    public int p;
    public int q;
    public int r;
    public int s;

    public void CoverImageView(Context p0){
       super(p0);
       this.p = t0.c;
       this.q = t0.i;
       this.r = t0.f;
       this.s = a1.e(12.00f);
       this.a(p0, null);
    }
    public void CoverImageView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.p = t0.c;
       this.q = t0.i;
       this.r = t0.f;
       this.s = a1.e(12.00f);
       this.a(p0, p1);
    }
    public void CoverImageView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.p = t0.c;
       this.q = t0.i;
       this.r = t0.f;
       this.s = a1.e(12.00f);
       this.a(p0, p1);
    }
    public final void a(Context p0,AttributeSet p1){
       float f = this;
       Object obj = p0;
       int[] obj1 = p1;
       if (PatchProxy.applyVoidTwoRefs(obj, obj1, f, CoverImageView.class, "1")) {
          return;
       }
       int i = 3;
       int i1 = 2;
       float f1 = 0;
       if (obj1 != null) {
          TypedArray typedArray = obj.obtainStyledAttributes(obj1, c$b.g0);
          f.o = typedArray.getFloat(0, f1);
          f.n = typedArray.getDimensionPixelSize(i, f.s);
          f.l = typedArray.getDimensionPixelSize(i1, f.r);
          f.m = typedArray.getBoolean(1, 0);
          typedArray.recycle();
       }
       a uoa = new a();
       uoa.f((float)t0.e);
       uoa.m(a1.e(0x3f000000));
       f.setBackground(uoa.h(obj, R.color.arg_RES_7f0616dd).a());
       f.setPadding(a1.e(0x3f000000), a1.e(0x3f000000), a1.e(0x3f000000), a1.e(0x3f000000));
       RoundingParams roundingPara = new RoundingParams();
       float f2 = (float)a1.e(4.00f);
       roundingPara.n(f2);
       f.b = new KwaiImageView(obj);
       f.b.setLayoutParams(new RelativeLayout$LayoutParams(-1, -1));
       f.b.setId(R.id.player_cover);
       f.b.getHierarchy().L(roundingPara);
       f.addView(f.b);
       f.c = new ViewStub(obj);
       f.c.setLayoutParams(new RelativeLayout$LayoutParams(-1, -2));
       f.c.setInflatedId(R.id.play_view_container);
       f.c.setId(R.id.play_view_stub);
       f.addView(f.c);
       if (obj1 != null) {
          f.d = new SelectShapeView(obj, obj1);
          f.d.setLayoutParams(new RelativeLayout$LayoutParams(-1, -1));
          f.addView(f.d);
       }
       f.e = new RelativeLayout(obj);
       obj1 = new int[i1];
       obj1[0] = ContextCompat.getColor(obj, 0x7f0619aa);
       obj1[1] = ContextCompat.getColor(obj, 0x7f061994);
       GradientDrawable gradientDraw = new GradientDrawable(GradientDrawable$Orientation.BOTTOM_TOP, obj1);
       gradientDraw.setGradientType(0);
       gradientDraw.setUseLevel(1);
       float[] uofloatArray = new float[]{f1,f1,f1,f1,f2,f2,f2,f2};
       gradientDraw.setCornerRadii(uofloatArray);
       f.e.setBackground(gradientDraw);
       RelativeLayout$LayoutParams layoutParams = new RelativeLayout$LayoutParams(-1, a1.e(64.00f));
       int i2 = 12;
       layoutParams.addRule(i2, -1);
       f.e.setLayoutParams(layoutParams);
       f.e.setVisibility(8);
       f.addView(f.e);
       RelativeLayout relativeLayo = new RelativeLayout(obj);
       RelativeLayout$LayoutParams layoutParams1 = new RelativeLayout$LayoutParams(-1, a1.e(36.00f));
       layoutParams1.addRule(i2, -1);
       relativeLayo.setLayoutParams(layoutParams1);
       f.f = new LiveCoverIconView(obj);
       RelativeLayout$LayoutParams layoutParams2 = new RelativeLayout$LayoutParams(-2, t0.q);
       layoutParams2.addRule(9);
       CoverImageView q = f.q;
       layoutParams2.leftMargin = q;
       layoutParams2.topMargin = q;
       f.f.setLayoutParams(layoutParams2);
       f.addView(f.f);
       f.g = new KwaiImageView(obj);
       layoutParams2 = new RelativeLayout$LayoutParams(a1.e(20.00f), a1.e(20.00f));
       layoutParams2.addRule(11, -1);
       q = f.r;
       layoutParams2.topMargin = q;
       layoutParams2.rightMargin = q;
       f.g.setLayoutParams(layoutParams2);
       f.addView(f.g);
       TextView textView = new TextView(obj);
       f.k = textView;
       textView.setId(R.id.bottom_right_text);
       layoutParams2 = new RelativeLayout$LayoutParams(-2, -2);
       layoutParams2.addRule(11);
       layoutParams2.addRule(15, -1);
       layoutParams2.rightMargin = f.q;
       layoutParams2.bottomMargin = t0.i;
       layoutParams2.addRule(i2);
       f.k.setLayoutParams(layoutParams2);
       f.k.setIncludeFontPadding(0);
       f.k.setEllipsize(TextUtils$TruncateAt.END);
       f.k.setTextSize(1, 12.00f);
       f.k.setTextColor(ContextCompat.getColor(obj, R.color.arg_RES_7f061e52));
       f.k.setSingleLine();
       relativeLayo.addView(f.k);
       KwaiImageView kwaiImageVie = new KwaiImageView(obj);
       f.j = kwaiImageVie;
       kwaiImageVie.setId(R.id.bottom_right_icon);
       layoutParams2 = new RelativeLayout$LayoutParams(f.s, f.s);
       layoutParams2.addRule(0, R.id.bottom_right_text);
       layoutParams2.addRule(15, -1);
       layoutParams2.rightMargin = f.p;
       layoutParams2.bottomMargin = t0.k;
       layoutParams2.addRule(i2);
       f.j.setLayoutParams(layoutParams2);
       relativeLayo.addView(f.j);
       f.h = new KwaiImageView(obj);
       if (f.m != null) {
          RoundingParams roundingPara1 = new RoundingParams();
          roundingPara1.q(1);
          f.h.getHierarchy().L(roundingPara1);
       }
       f.h.setId(R.id.bottom_left_icon);
       RelativeLayout$LayoutParams layoutParams3 = new RelativeLayout$LayoutParams(f.n, f.n);
       layoutParams3.addRule(i1, R.id.bottom_view);
       layoutParams3.addRule(15, -1);
       layoutParams3.leftMargin = f.l;
       f.h.setLayoutParams(layoutParams3);
       relativeLayo.addView(f.h);
       f.i = new TextView(obj);
       layoutParams3 = new RelativeLayout$LayoutParams(-2, -2);
       layoutParams3.addRule(0, R.id.bottom_right_icon);
       layoutParams3.addRule(1, R.id.bottom_left_icon);
       layoutParams3.addRule(15, -1);
       layoutParams3.leftMargin = f.p;
       layoutParams3.rightMargin = f.q;
       f.i.setLayoutParams(layoutParams3);
       f.i.setIncludeFontPadding(0);
       f.i.setEllipsize(TextUtils$TruncateAt.END);
       f.i.setTextSize(1, 12.00f);
       f.i.setTextColor(ContextCompat.getColor(obj, R.color.arg_RES_7f061e52));
       f.i.setSingleLine();
       relativeLayo.addView(f.i);
       f.i.setVisibility(8);
       f.e.addView(relativeLayo);
       return;
    }
    public final void b(CoverExtInfo p0,boolean p1){
       RelativeLayout$LayoutParams layoutParams;
       RelativeLayout$LayoutParams layoutParams1;
       if (PatchProxy.isSupport(CoverImageView.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, CoverImageView.class, "12")) {
          return;
       }
       c3.b(this.h, this.i, p0.mBottomLeftIcon);
       c3.b(this.j, this.k, p0.mBottomRightIcon);
       int i = 8;
       if (p0.mBottomIconPriority == null) {
          this.k.setVisibility(i);
          this.i.setVisibility(0);
          CoverImageView uCoverImageV = 0x7f0a04ac;
          i = 1;
          int i1 = -1;
          Object[] objArray = null;
          if (p1) {
             if (!PatchProxy.applyVoid(objArray, this, CoverImageView.class, "9")) {
                if (this.h.getVisibility()) {
                   layoutParams = this.i.getLayoutParams();
                   layoutParams.addRule(9, i1);
                   layoutParams.leftMargin = this.r;
                   this.i.setLayoutParams(layoutParams);
                }else {
                   layoutParams1 = this.h.getLayoutParams();
                   layoutParams1.removeRule(9);
                   layoutParams1.addRule(12);
                   layoutParams1.bottomMargin = t0.h;
                   int k = t0.k;
                   layoutParams1.height = k;
                   layoutParams1.width = k;
                   this.h.setLayoutParams(layoutParams1);
                   layoutParams1 = this.i.getLayoutParams();
                   layoutParams1.removeRule(9);
                   layoutParams1.addRule(0, R.id.bottom_right_icon);
                   layoutParams1.addRule(i, uCoverImageV);
                   layoutParams1.addRule(12);
                   layoutParams1.leftMargin = this.p;
                   layoutParams1.rightMargin = this.q;
                   layoutParams1.bottomMargin = this.r;
                   this.i.setTextSize(0, (float)k);
                   this.i.setLayoutParams(layoutParams1);
                }
             }
          }else if(PatchProxy.applyVoid(objArray, this, CoverImageView.class, "10")){
             if (this.h.getVisibility()) {
                layoutParams = this.i.getLayoutParams();
                layoutParams.addRule(9, i1);
                layoutParams.leftMargin = this.q;
                this.i.setLayoutParams(layoutParams);
             }else {
                layoutParams1 = this.h.getLayoutParams();
                layoutParams1.removeRule(9);
                layoutParams1.addRule(15, i1);
                this.h.setLayoutParams(layoutParams1);
                layoutParams1 = this.i.getLayoutParams();
                layoutParams1.removeRule(9);
                layoutParams1.addRule(0, R.id.bottom_right_icon);
                layoutParams1.addRule(i, uCoverImageV);
                layoutParams1.addRule(15, i1);
                layoutParams1.leftMargin = this.p;
                layoutParams1.rightMargin = this.q;
                this.i.setTextSize(0, (float)t0.m);
                this.i.setLayoutParams(layoutParams1);
             }
          }
       }else {
          this.i.setVisibility(i);
          this.k.setVisibility(0);
       }
       return;
    }
    public void c(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CoverImageView.class, "5")) {
          return;
       }
       this.b.P(p0);
       return;
    }
    public boolean d(String p0,CDNUrl[] p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, CoverImageView.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return o3.O(this.b, p0, p1);
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(CoverImageView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, CoverImageView.class, "2")) {
          return;
       }
       super.onMeasure(p0, p1);
       p0 = this.getMeasuredWidth();
       if (this.o && this.getMeasuredWidth()) {
          float f = (float)p0;
          CoverImageView to = this.o;
          this.setMeasuredDimension(p0, (int)(f / to));
          super.onMeasure(View$MeasureSpec.makeMeasureSpec(p0, 0x40000000), View$MeasureSpec.makeMeasureSpec((int)(f / to), 0x40000000));
       }
       return;
    }
    public void setWidthHeightRatio(float p0){
       if (p0 > 0) {
          this.o = p0;
       }
       return;
    }
}
