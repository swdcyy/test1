package com.yxcorp.gifshow.widget.LiveCoverIconView;
import com.yxcorp.widget.selector.view.SelectShapeConstraintLayout;
import lnc.a1;
import android.content.Context;
import android.util.AttributeSet;
import com.yxcorp.gifshow.widget.LiveCoverIconView$IconStyle;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;
import android.graphics.Typeface;
import ll8.c$b;
import android.content.res.TypedArray;
import java.lang.Enum;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import android.view.ViewGroup$LayoutParams;
import android.widget.ImageView;
import com.yxcorp.gifshow.model.CDNUrl;
import android.graphics.drawable.Drawable;
import brd.a0;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import tyc.p2;
import io.reactivex.i;
import com.kuaishou.android.live.model.LiveCoverWidgetModel;
import com.yxcorp.gifshow.widget.LiveCoverIconView$f;
import com.yxcorp.gifshow.widget.LiveCoverIconView$e;
import com.yxcorp.gifshow.widget.LiveCoverIconView$a;
import com.kuaishou.android.live.model.LiveCoverWidgetModel$TextInfo;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import ekd.j;
import android.graphics.Color;
import com.kuaishou.android.live.model.LiveCoverWidgetModel$ReasonTextInfo;
import ekd.d0;
import bld.b;
import com.yxcorp.widget.KwaiRadiusStyles;
import bld.c;
import com.yxcorp.widget.selector.drawable.DrawableCreator$Gradient;
import androidx.core.graphics.drawable.a;
import com.yxcorp.gifshow.widget.LiveCoverIconView$c;
import com.yxcorp.gifshow.widget.LiveCoverIconView$LayoutStyle;
import android.view.ViewGroup$MarginLayoutParams;
import com.yxcorp.gifshow.widget.LiveCoverIconView$b;

public class LiveCoverIconView extends SelectShapeConstraintLayout	// class@00187c
{
    public LiveCoverIconView$IconStyle C;
    public final View D;
    public final KwaiImageView E;
    public final KwaiImageView F;
    public final KwaiImageView G;
    public final TextView H;
    public final View I;
    public final TextView J;
    public final KwaiImageView K;
    public LiveCoverIconView$c L;
    public b M;
    public final Typeface N;
    public static final int O;
    public static final int P;
    public static final int Q;
    public static final int R;
    public static final int S;

    static {
       LiveCoverIconView.O = a1.e(2.00f);
       LiveCoverIconView.P = a1.e(4.00f);
       LiveCoverIconView.Q = a1.a(0x7f06060a);
       LiveCoverIconView.R = a1.a(0x7f06060a);
       LiveCoverIconView.S = a1.e(4.00f);
    }
    public void LiveCoverIconView(Context p0){
       super(p0, null);
    }
    public void LiveCoverIconView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveCoverIconView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       LiveCoverIconView$IconStyle dOUBLE_COL = LiveCoverIconView$IconStyle.DOUBLE_COL;
       this.C = dOUBLE_COL;
       a.k(this, R.layout.arg_RES_7f0d0ada, true);
       this.D = m1.f(this, 0x7f0d0adb);
       this.E = m1.f(this, 0x7f0a1bce);
       this.F = m1.f(this, 0x7f0a1bcf);
       this.G = m1.f(this, 0x7f0a1bcc);
       this.H = m1.f(this, 0x7f0a1bd1);
       this.I = m1.f(this, 0x7f0a1bcd);
       TextView textView = m1.f(this, R.id.live_cover_icon_second_text);
       this.J = textView;
       this.N = textView.getTypeface();
       this.K = m1.f(this, 0x7f0a1bd6);
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.t2);
       if (typedArray != null) {
          this.C = LiveCoverIconView$IconStyle.valueOf(typedArray.getInt(0, dOUBLE_COL.ordinal()));
          typedArray.recycle();
       }
       return;
    }
    public static void M(KwaiImageView p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(LiveCoverIconView.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), null, LiveCoverIconView.class, "25")) {
          return;
       }
       if (p1 > 0 && (p3 > 0 && p2 > 0)) {
          ViewGroup$LayoutParams layoutParams = p0.getLayoutParams();
          layoutParams.width = (int)((float)(p1 * p2) / (float)p3);
          p0.setLayoutParams(layoutParams);
       }
    label_0036 :
       return;
    }
    public static a0 T(KwaiImageView p0,int p1,CDNUrl[] p2,Drawable p3){
       if (PatchProxy.isSupport(LiveCoverIconView.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, Integer.valueOf(p1), p2, p3, null, LiveCoverIconView.class, "23");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return LiveCoverIconView.U(p0, p1, p2, p3, false);
    }
    public static a0 U(KwaiImageView p0,int p1,CDNUrl[] p2,Drawable p3,boolean p4){
       Object obj;
       if (PatchProxy.isSupport(LiveCoverIconView.class)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),p2,p3,Boolean.valueOf(p4)};
          obj = PatchProxy.apply(objArray, null, LiveCoverIconView.class, "22");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       p2 op2 = new p2(p3, p0, p1, p2, p4);
       return a0.k(obj);
    }
    public void N(LiveCoverWidgetModel p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveCoverIconView.class, "1")) {
          return;
       }
       this.O(p0, null);
       return;
    }
    public void O(LiveCoverWidgetModel p0,LiveCoverIconView$f p1){
       LiveCoverIconView$e uoe;
       LiveCoverIconView$e uoe1;
       LiveCoverWidgetModel mReasonTextI;
       b uob;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveCoverIconView.class, "2")) {
          return;
       }
       try{
          LiveCoverIconView$a uoa = null;
          if (p0 == null) {
             uoe = new LiveCoverIconView$e(this, uoa);
          }else {
             LiveCoverWidgetModel mTextInfo = p0.mTextInfo;
             if (mTextInfo == null || TextUtils.x(mTextInfo.mContent)) {
                if (!j.h(p0.mImageUrls)) {
                   uoe1 = new LiveCoverIconView$e(this, uoa);
                   uoe1.d(p0.mImageUrls);
                }else {
                   uoe = this.Q();
                }
             }else {
                uoe1 = PatchProxy.applyOneRefs(p0, this, LiveCoverIconView.class, "3");
                if (uoe1 != PatchProxyResult.class) {
                }else {
                   uoe1 = new LiveCoverIconView$e(this, uoa);
                   if (p0.mLiveIconType != 22) {
                      if (!j.h(p0.mImageUrls)) {
                         uoe1.g(this.getDefaultLeftIconDrawable());
                         uoe1.k(p0.mImageUrls);
                      }else {
                         uoe1.f(this.getDefaultLeftIconDrawable());
                      }
                   }
                   int i = 2;
                   if (p0.mTextInfo.mLanguageType == i) {
                      uoe1.r(12.00f);
                   }
                   if (!TextUtils.x(p0.mTextInfo.mTextColor)) {
                      try{
                         uoe1.o(Color.parseColor(p0.mTextInfo.mTextColor));
                      }catch(java.lang.Exception e0){
                      }
                   }
                }
             }
          label_0168 :
             uoe = uoe1;
          }
       }catch(java.lang.Exception e0){
       }
       uoe.l(new LiveCoverIconView$a(this, p1));
       uoe.a();
       return;
    }
    public final Drawable P(int p0){
       Drawable obj;
       if (PatchProxy.isSupport(LiveCoverIconView.class)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, LiveCoverIconView.class, "14");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = a1.f(R.drawable.arg_RES_7f0811b0);
       if (p0) {
          a.n(obj, p0);
       }
       return obj;
    }
    public LiveCoverIconView$e Q(){
       Object[] objArray = null;
       LiveCoverIconView$e obj = PatchProxy.apply(objArray, this, LiveCoverIconView.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new LiveCoverIconView$e(this, objArray);
       obj.p(a1.p(R.string.arg_RES_7f102d02));
       obj.f(this.getDefaultLeftIconDrawable());
       obj.c(this.getIconBackgroundFactory().create());
       return obj;
    }
    public final void R(KwaiImageView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveCoverIconView.class, "21")) {
          return;
       }
       p0.setImageDrawable(null);
       p0.setVisibility(8);
       return;
    }
    public final boolean S(LiveCoverIconView$LayoutStyle p0){
       boolean b = (p0 == LiveCoverIconView$LayoutStyle.ICON_TEXT_ICON_LAYOUT)? true: false;
       return b;
    }
    public final void V(){
       if (PatchProxy.applyVoid(null, this, LiveCoverIconView.class, "16")) {
          return;
       }
       ViewGroup$LayoutParams layoutParams = this.G.getLayoutParams();
       layoutParams.width = -2;
       this.G.setLayoutParams(layoutParams);
       return;
    }
    public final void W(LiveCoverIconView$e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveCoverIconView.class, "17")) {
          return;
       }
       ViewGroup$MarginLayoutParams layoutParams = this.E.getLayoutParams();
       layoutParams.leftMargin = p0.e;
       layoutParams.rightMargin = p0.f;
       layoutParams.width = -2;
       layoutParams.height = p0.i;
       this.E.setLayoutParams(layoutParams);
       return;
    }
    public void X(){
       if (PatchProxy.applyVoid(null, this, LiveCoverIconView.class, "5")) {
          return;
       }
       LiveCoverIconView$e uoe = this.Y();
       uoe.p(a1.p(R.string.arg_RES_7f1020a8));
       uoe.f(this.P(LiveCoverIconView.R));
       uoe.c(this.getIconBackgroundFactory().create());
       uoe.a();
       return;
    }
    public LiveCoverIconView$e Y(){
       Object obj = PatchProxy.apply(null, this, LiveCoverIconView.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveCoverIconView$e(this, null);
    }
    public final Drawable getDefaultLeftIconDrawable(){
       LiveCoverIconView obj = PatchProxy.apply(null, this, LiveCoverIconView.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.C;
       if (obj == LiveCoverIconView$IconStyle.SINGLE_COL) {
          return null;
       }
       return this.P(obj.mLeftIconColor);
    }
    public LiveCoverIconView$c getIconBackgroundFactory(){
       Object obj = PatchProxy.apply(null, this, LiveCoverIconView.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.L == null) {
          this.L = new LiveCoverIconView$b(this.C.mBackgroundColor);
       }
       return this.L;
    }
}
