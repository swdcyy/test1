package com.kuaishou.live.common.core.basic.widget.LiveWishListItemView;
import com.yxcorp.widget.selector.view.SelectShapeFrameLayout;
import lnc.a1;
import android.content.Context;
import com.kuaishou.live.common.core.basic.widget.LiveWishListStyle;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.widget.TextView;
import android.text.TextPaint;
import java.lang.CharSequence;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import android.widget.FrameLayout;
import com.kuaishou.live.common.core.basic.widget.LiveWishListProgressBar;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kuaishou.live.common.core.component.multipk.render.view.LiveKwaiCDNImageView;
import android.graphics.Typeface;
import ekd.d0;
import ya1.n0;
import java.lang.Boolean;
import com.kuaishou.live.common.core.basic.widget.LiveWishListItemView$a;
import java.lang.Enum;
import android.widget.ImageView;
import com.yxcorp.gifshow.widget.cdn.KwaiCDNImageView;
import android.graphics.Bitmap;
import cm1.a;
import java.lang.StringBuilder;
import android.app.Activity;
import com.yxcorp.utility.n;
import pq1.g;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import va1.l0;
import d61.f0;

public class LiveWishListItemView extends SelectShapeFrameLayout	// class@000f2c
{
    public LiveWishListProgressBar c;
    public KwaiImageView d;
    public TextView e;
    public FrameLayout f;
    public LiveKwaiCDNImageView g;
    public TextView h;
    public n0 i;
    public g j;
    public LiveWishListStyle k;
    public static final int l;
    public static final int m;

    static {
       LiveWishListItemView.l = a1.d(0x7f07042c);
       LiveWishListItemView.m = a1.e(14.00f);
    }
    public void LiveWishListItemView(Context p0){
       super(p0);
       this.k = LiveWishListStyle.GIFT;
       this.c(p0);
    }
    public void LiveWishListItemView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.k = LiveWishListStyle.GIFT;
       this.c(p0);
    }
    public void LiveWishListItemView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.k = LiveWishListStyle.GIFT;
       this.c(p0);
    }
    public final int b(int p0){
       if (PatchProxy.isSupport(LiveWishListItemView.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, LiveWishListItemView.class, "6");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       this.e.setTextSize(0, (float)p0);
       return (int)this.e.getPaint().measureText(this.e.getText().toString());
    }
    public final void c(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveWishListItemView.class, "1")) {
          return;
       }
       a.c(p0, R.layout.arg_RES_7f0d0e8e, this);
       this.c = this.findViewById(0x7f0a2874);
       this.d = this.findViewById(0x7f0a286c);
       this.e = this.findViewById(0x7f0a286b);
       this.f = this.findViewById(0x7f0a2877);
       this.g = this.findViewById(0x7f0a2875);
       TextView textView = this.findViewById(R.id.live_wish_list_rank_score);
       this.h = textView;
       textView.setTypeface(d0.a("fonts/AvenirNext-BoldItalic.ttf", p0));
       return;
    }
    public void d(n0 p0,boolean p1){
       ViewGroup$MarginLayoutParams layoutParams;
       Bitmap obj;
       if (PatchProxy.isSupport(LiveWishListItemView.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, LiveWishListItemView.class, "3")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       int i = LiveWishListItemView$a.a[this.k.ordinal()];
       StringBuilder str = 8;
       String str1 = 2;
       if (i != 1) {
          if (i == str1 && !PatchProxy.applyVoidOneRefs(p0, this, LiveWishListItemView.class, "9")) {
             this.i = p0;
             this.f.setVisibility(0);
             this.d.setVisibility(str);
             if (p0.b() == 1) {
                this.g.n0(R.string.arg_RES_7f1025c0);
             }else {
                this.g.n0(R.string.arg_RES_7f1025c2);
             }
             this.h.setText(String.valueOf(p0.b()));
          }
       }else if(PatchProxy.applyVoidOneRefs(p0, this, LiveWishListItemView.class, "8")){
          this.i = p0;
          this.f.setVisibility(str);
          this.d.setVisibility(0);
          obj = a.b(p0.a());
          if (obj != null) {
             this.d.setImageBitmap(obj);
          }
       }
       this.e.setText(p0.d+"/"+p0.c);
       if (p1 && (PatchProxy.applyVoid(null, this, LiveWishListItemView.class, "12") || (this.j != null && this.e != null))) {
          LiveWishListItemView tj = this.j;
          int i1 = n.k(n.d(this)) / tj.a;
          if (((((tj.d() + this.j.e()) + this.j.f()) + this.j.g()) + this.b(this.j.c())) <= (((i1 - (this.j.b() * 2)) - a1.e(6.00f)) - this.j.a())) {
             layoutParams = this.e.getLayoutParams();
             layoutParams.width = -2;
             this.e.setLayoutParams(layoutParams);
             this.e.setTextSize(0, (float)this.j.c());
             this.e.requestLayout();
             this.e.invalidate();
          }else {
             ViewGroup$MarginLayoutParams layoutParams1 = this.e.getLayoutParams();
             i1 = ((((((i1 - (this.j.b() * 2)) - a1.e(6.00f)) - this.j.a()) - this.j.d()) - this.j.e()) - this.j.f()) - this.j.g();
             layoutParams1.width = -2;
             this.e.setLayoutParams(layoutParams1);
             if (PatchProxy.isSupport(LiveWishListItemView.class)) {
                obj = PatchProxy.applyOneRefs(Integer.valueOf(i1), this, LiveWishListItemView.class, "7");
                if (obj != PatchProxyResult.class) {
                   i1 = obj.intValue();
                }else {
                label_0198 :
                   tj = this.j;
                   if (tj == null) {
                      i1 = 0;
                   }else {
                      i = tj.c();
                      while (i > 1 && this.b(i) >= i1) {
                         i = i - 1;
                      }
                      i1 = i;
                   }
                }
             }else {
                goto label_0198 ;
             }
             this.e.setTextSize(0, (float)i1);
             this.e.requestLayout();
             this.e.invalidate();
          }
          this.e.setGravity(17);
          layoutParams = this.getLayoutParams();
          layoutParams.width = -2;
          this.setLayoutParams(layoutParams);
       }
    label_01d0 :
       n0 e = p0.e;
       p0 = p0.f;
       if (!PatchProxy.applyVoidTwoRefs(e, p0, this, LiveWishListItemView.class, "5") && this.i != null) {
          this.c.setRadius(LiveWishListItemView.l);
          this.c.setCustomProgressColor(l0.i(e));
          this.c.setCustomBackGroundColor(l0.i(p0));
          this.c.setMax((int)this.i.a);
          this.c.setProgress((int)this.i.b);
       }
       return;
    }
    public int getCurrentWidthPx(){
       LiveWishListItemView obj = PatchProxy.apply(null, this, LiveWishListItemView.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.j;
       if (obj == null || this.i == null) {
          return 0;
       }
       return ((((obj.d() + this.j.e()) + this.j.f()) + this.j.g()) + this.b(this.j.c()));
    }
    public void setWishListParam(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveWishListItemView.class, "2")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       this.j = p0;
       ViewGroup$MarginLayoutParams layoutParams = this.d.getLayoutParams();
       layoutParams.height = p0.e();
       layoutParams.width = p0.e();
       layoutParams.leftMargin = p0.d();
       this.d.setLayoutParams(layoutParams);
       this.f.setLayoutParams(layoutParams);
       layoutParams = this.e.getLayoutParams();
       layoutParams.leftMargin = p0.f();
       layoutParams.rightMargin = p0.g();
       this.e.setLayoutParams(layoutParams);
       this.e.setTextSize(0, (float)p0.c());
       f0.i(this.e, this.getContext());
       ViewGroup$LayoutParams layoutParams1 = this.getLayoutParams();
       if (layoutParams1 != null) {
          layoutParams1.height = this.j.e;
          this.setLayoutParams(layoutParams1);
       }
       return;
    }
    public void setWishListStyle(LiveWishListStyle p0){
       this.k = p0;
    }
}
