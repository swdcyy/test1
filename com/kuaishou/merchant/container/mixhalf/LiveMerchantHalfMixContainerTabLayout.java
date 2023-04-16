package com.kuaishou.merchant.container.mixhalf.LiveMerchantHalfMixContainerTabLayout;
import com.yxcorp.widget.selector.view.SelectShapeConstraintLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.String;
import android.graphics.Color;
import java.util.ArrayList;
import android.view.ViewGroup;
import com.yxcorp.utility.n;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kuaishou.merchant.container.mixhalf.bean.LiveMerchantHalfMixContainerTabParams;
import java.util.List;
import com.kuaishou.merchant.container.mixhalf.bean.LiveMerchantHalfMixContainerTabParams$PageInfo;
import ot3.y0;
import java.lang.Boolean;
import com.kuaishou.merchant.container.mixhalf.LiveMerchantHalfMixContainerTabLayout$b;
import android.view.View;
import com.kuaishou.merchant.container.mixhalf.LiveMerchantHalfMixContainerTabLayout$a;
import com.kuaishou.merchant.container.mixhalf.bean.LiveMerchantHalfMixContainerTabParams$TabStyles;
import com.kuaishou.merchant.log.biz.MerchantCommonLogBiz;
import p74.a;
import o74.a;
import androidx.constraintlayout.widget.a;
import android.widget.TextView;
import java.lang.CharSequence;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.Drawable;
import a2.i0;
import eu3.d;
import android.view.View$OnClickListener;
import android.widget.Space;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import android.widget.ImageView;
import f3.h;
import lnc.ia;
import java.lang.Throwable;
import android.widget.LinearLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.graphics.Typeface;
import android.text.TextUtils$TruncateAt;
import lnc.a1;
import androidx.transition.e;
import androidx.constraintlayout.widget.ConstraintLayout;

public class LiveMerchantHalfMixContainerTabLayout extends SelectShapeConstraintLayout	// class@001641
{
    public LiveMerchantHalfMixContainerTabParams C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public List J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public LiveMerchantHalfMixContainerTabLayout$a P;

    public void LiveMerchantHalfMixContainerTabLayout(Context p0){
       super(p0, null);
    }
    public void LiveMerchantHalfMixContainerTabLayout(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveMerchantHalfMixContainerTabLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.D = -1;
       this.E = Color.parseColor("#ff333333");
       this.F = -1;
       this.G = Color.parseColor("#FFE0E0E0");
       this.H = 15;
       this.I = 17;
       this.J = new ArrayList();
       this.K = n.c(this.getContext(), 40.00f);
       this.L = 0;
       this.M = n.c(this.getContext(), 16.00f);
       this.N = n.c(this.getContext(), 0x3f800000);
       this.O = n.c(this.getContext(), 48.00f);
    }
    public final int M(int p0){
       if (PatchProxy.isSupport(LiveMerchantHalfMixContainerTabLayout.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, LiveMerchantHalfMixContainerTabLayout.class, "14");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return y0.a(this.F, this.C.mContainers.get(p0).mSelectedBackgroundColor, "LiveMerchantHalfMixContainerTabLayout : getSelectBackgroundColor");
    }
    public final boolean N(int p0){
       boolean b = (!p0)? true: false;
       return b;
    }
    public final boolean O(int p0){
       if (PatchProxy.isSupport(LiveMerchantHalfMixContainerTabLayout.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, LiveMerchantHalfMixContainerTabLayout.class, "9");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       int i = 1;
       if (p0 != (this.C.mContainers.size() - i)) {
          i = false;
       }
       return i;
    }
    public void P(int p0){
       if (PatchProxy.isSupport(LiveMerchantHalfMixContainerTabLayout.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveMerchantHalfMixContainerTabLayout.class, "3")) {
          return;
       }
       if (p0 == this.D) {
          return;
       }
       int i = 0;
       if (!PatchProxy.applyVoid(null, this, LiveMerchantHalfMixContainerTabLayout.class, "18")) {
          int i1 = 0;
          while (i1 < this.J.size()) {
             if (LiveMerchantHalfMixContainerTabLayout$b.a(this.J.get(i1).b)) {
                this.findViewById(this.J.get(i1).b).setVisibility(8);
             }
             if (LiveMerchantHalfMixContainerTabLayout$b.a(this.J.get(i1).h)) {
                this.findViewById(this.J.get(i1).h).setVisibility(i);
             }
             i1 = i1 + 1;
          }
       }
       if (LiveMerchantHalfMixContainerTabLayout$b.a(this.J.get(p0).b)) {
          this.findViewById(this.J.get(p0).b).setVisibility(i);
       }
       if (this.N(p0)) {
          if (LiveMerchantHalfMixContainerTabLayout$b.a(this.J.get(p0).h)) {
             this.findViewById(this.J.get(p0).h).setVisibility(8);
          }
       }else if(this.O(p0)){
          i = p0 - 1;
          if (LiveMerchantHalfMixContainerTabLayout$b.a(this.J.get(i).h)) {
             this.findViewById(this.J.get(i).h).setVisibility(8);
          }
       }else if(LiveMerchantHalfMixContainerTabLayout$b.a(this.J.get(p0).h)){
          this.findViewById(this.J.get(p0).h).setVisibility(8);
       }
       i = p0 - 1;
       if (LiveMerchantHalfMixContainerTabLayout$b.a(this.J.get(i).h)) {
          this.findViewById(this.J.get(i).h).setVisibility(8);
       }
       this.D = p0;
       LiveMerchantHalfMixContainerTabLayout tP = this.P;
       if (tP != null) {
          tP.a(p0);
       }
       return;
    }
    public final int getDividerColor(){
       Object obj = PatchProxy.apply(null, this, LiveMerchantHalfMixContainerTabLayout.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return y0.a(this.G, this.C.mTabStyles.mDividerColor, "LiveMerchantHalfMixContainerTabLayout : getDividerColor");
    }
    public final int getUnSelectedBackgroundColor(){
       Object obj = PatchProxy.apply(null, this, LiveMerchantHalfMixContainerTabLayout.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return y0.a(this.F, this.C.mTabStyles.mUnselectedBackgroundColor, "LiveMerchantHalfMixContainerTabLayout : getUnSelectedBackgroundColor");
    }
    public final int getUnSelectedTabTextColor(){
       Object obj = PatchProxy.apply(null, this, LiveMerchantHalfMixContainerTabLayout.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return y0.a(this.E, this.C.mTabStyles.mUnselectedTitleColor, "LiveMerchantHalfMixContainerTabLayout : getUnSelectedTabTextColor");
    }
    public void setOnTabSelectListener(LiveMerchantHalfMixContainerTabLayout$a p0){
       this.P = p0;
    }
    public void setTabParams(LiveMerchantHalfMixContainerTabParams p0){
       int i3;
       LinearLayout linearLayout1;
       LinearLayout linearLayout2;
       int i5;
       TextView textView1;
       float[] obj2;
       float f;
       int i10;
       float f1;
       Space space;
       View view;
       LiveMerchantHalfMixContainerTabParams liveMerchant = this;
       LinearLayout obj = p0;
       if (PatchProxy.applyVoidOneRefs(obj, liveMerchant, LiveMerchantHalfMixContainerTabLayout.class, "1")) {
          return;
       }
       liveMerchant.C = obj;
       if (!LiveMerchantHalfMixContainerTabParams.isTabParamsValid(p0)) {
          a.g(MerchantCommonLogBiz.MIX_RN_H5_CONTAINER, "LiveMerchantHalfMixContainerTabLayout", "illegal input params ");
          return;
       }else {
          Object[] objArray = null;
          int i = 0;
          if (!PatchProxy.applyVoid(objArray, liveMerchant, LiveMerchantHalfMixContainerTabLayout.class, "5")) {
             if (!PatchProxy.applyVoid(objArray, liveMerchant, LiveMerchantHalfMixContainerTabLayout.class, "4")) {
                liveMerchant.J.clear();
                liveMerchant.D = -1;
                this.removeAllViews();
             }
             for (i5 = 0; i5 < liveMerchant.C.mContainers.size(); i5 = i5 + 1) {
                liveMerchant.J.add(new LiveMerchantHalfMixContainerTabLayout$b());
             }
          }
          if (!PatchProxy.applyVoid(objArray, liveMerchant, LiveMerchantHalfMixContainerTabLayout.class, "2")) {
             a uoa = new a();
             String str = 0x3f800000;
             int i1 = 17;
             LinearLayout linearLayout = null;
             int i2 = 1;
             if (PatchProxy.applyVoidOneRefs(uoa, liveMerchant, LiveMerchantHalfMixContainerTabLayout.class, "6")) {
                i1 = true;
             }else {
                i5 = 0;
                while (i5 < liveMerchant.C.mContainers.size()) {
                   if (PatchProxy.isSupport(LiveMerchantHalfMixContainerTabLayout.class)) {
                      textView1 = PatchProxy.applyOneRefs(Integer.valueOf(i5), liveMerchant, LiveMerchantHalfMixContainerTabLayout.class, "8");
                      if (textView1 != PatchProxyResult.class) {
                      label_00a5 :
                         obj2 = textView1;
                         liveMerchant.addView(obj2);
                         uoa.P(liveMerchant.J.get(i5).a, str);
                         uoa.q(liveMerchant.J.get(i5).a, liveMerchant.L);
                         uoa.n(liveMerchant.J.get(i5).a, liveMerchant.K);
                         uoa.m(liveMerchant.J.get(i5).a, 4, 0, 4, 0);
                         obj2.setOnClickListener(new d(liveMerchant, i5));
                         i5 = i5 + 1;
                         i2 = 1;
                         linearLayout = 0;
                         i1 = 17;
                      }
                   }
                   textView1 = new TextView(this.getContext());
                   textView1.setTextSize((float)liveMerchant.H);
                   textView1.setGravity(i1);
                   textView1.setText(liveMerchant.C.mContainers.get(i5).mActivityTitle);
                   textView1.setTextColor(this.getUnSelectedTabTextColor());
                   textView1.setMaxLines(i2);
                   textView1.setSingleLine(i2);
                   GradientDrawable gradientDraw = new GradientDrawable();
                   int i6 = n.c(this.getContext(), 16.00f);
                   int i7 = 6;
                   int i8 = 5;
                   int i9 = 3;
                   i3 = 8;
                   if (liveMerchant.N(i5)) {
                      obj2 = new float[i3];
                      f = (float)i6;
                      obj2[i] = f;
                      obj2[i2] = f;
                      obj2[2] = linearLayout;
                      obj2[i9] = linearLayout;
                      obj2[4] = linearLayout;
                      obj2[i8] = linearLayout;
                      obj2[i7] = linearLayout;
                      obj2[7] = linearLayout;
                      gradientDraw.setCornerRadii(obj2);
                   }else if(liveMerchant.O(i5)){
                      obj2 = new float[i3];
                      obj2[i] = linearLayout;
                      obj2[i2] = linearLayout;
                      f = (float)i6;
                      obj2[2] = f;
                      obj2[i9] = f;
                      obj2[4] = linearLayout;
                      obj2[i8] = linearLayout;
                      obj2[i7] = linearLayout;
                      obj2[7] = linearLayout;
                      gradientDraw.setCornerRadii(obj2);
                   }
                   gradientDraw.setColor(this.getUnSelectedBackgroundColor());
                   textView1.setBackground(gradientDraw);
                   liveMerchant.J.get(i5).a = i0.l();
                   textView1.setId(liveMerchant.J.get(i5).a);
                   goto label_00a5 ;
                }
                i1 = 1;
                i5 = 0;
                while (i5 < liveMerchant.C.mContainers.size()) {
                   if (liveMerchant.N(i5)) {
                      uoa.m(liveMerchant.J.get(i5).a, 1, 0, 1, 0);
                      i10 = i5 + 1;
                      uoa.m(liveMerchant.J.get(i5).a, 2, liveMerchant.J.get(i10).a, 1, 0);
                   }else if(liveMerchant.O(i5)){
                      uoa.m(liveMerchant.J.get(i5).a, 2, 0, 2, 0);
                      i10 = i5 - 1;
                      uoa.m(liveMerchant.J.get(i5).a, 1, liveMerchant.J.get(i10).a, 2, 0);
                   }else {
                      int i11 = i5 + 1;
                      uoa.m(liveMerchant.J.get(i5).a, 2, liveMerchant.J.get(i11).a, 1, 0);
                      i10 = i5 - 1;
                      uoa.m(liveMerchant.J.get(i5).a, 1, liveMerchant.J.get(i10).a, 2, null);
                   }
                   if (!PatchProxy.isSupport(LiveMerchantHalfMixContainerTabLayout.class) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(i5), uoa, liveMerchant, LiveMerchantHalfMixContainerTabLayout.class, "12")) {
                      float f2 = 12.00f;
                      if (!liveMerchant.O(i5)) {
                         space = new Space(this.getContext());
                         liveMerchant.J.get(i5).g = i0.l();
                         space.setId(liveMerchant.J.get(i5).g);
                         uoa.n(space.getId(), i1);
                         uoa.q(space.getId(), i1);
                         f1 = 12.00f;
                         uoa.m(space.getId(), 1, liveMerchant.J.get(i5).a, 2, n.c(this.getContext(), f2));
                         liveMerchant.addView(space);
                      }else {
                         f1 = 12.00f;
                      }
                      if (!liveMerchant.N(i5)) {
                         space = new Space(this.getContext());
                         liveMerchant.J.get(i5).f = i0.l();
                         space.setId(liveMerchant.J.get(i5).f);
                         uoa.n(space.getId(), i1);
                         uoa.q(space.getId(), i1);
                         uoa.m(space.getId(), 2, liveMerchant.J.get(i5).a, 1, n.c(this.getContext(), f1));
                         liveMerchant.addView(space);
                      }
                   }
                   i5 = i5 + 1;
                   f1 = 0x3f800000;
                }
                i5 = 0;
                i3 = liveMerchant.C.mContainers.size() - i1;
                while (i5 < i3) {
                   if (PatchProxy.isSupport(LiveMerchantHalfMixContainerTabLayout.class)) {
                      view = PatchProxy.applyOneRefs(Integer.valueOf(i5), liveMerchant, LiveMerchantHalfMixContainerTabLayout.class, "7");
                      if (view != PatchProxyResult.class) {
                      label_038c :
                         liveMerchant.addView(view);
                         uoa.q(view.getId(), liveMerchant.N);
                         uoa.n(view.getId(), liveMerchant.M);
                         uoa.m(view.getId(), 1, liveMerchant.J.get(i5).a, 2, 0);
                         a uoa1 = uoa;
                         uoa1.m(view.getId(), 3, liveMerchant.J.get(i5).a, 3, 0);
                         uoa1.m(view.getId(), 4, liveMerchant.J.get(i5).a, 4, null);
                         i5 = i5 + 1;
                      }
                   }
                   view = new View(this.getContext());
                   view.setBackgroundColor(this.getDividerColor());
                   liveMerchant.J.get(i5).h = i0.l();
                   view.setId(liveMerchant.J.get(i5).h);
                   goto label_038c ;
                }
             }
             if (!PatchProxy.applyVoidOneRefs(uoa, liveMerchant, LiveMerchantHalfMixContainerTabLayout.class, "10")) {
                i3 = 0;
                while (i3 < liveMerchant.C.mContainers.size()) {
                   if (PatchProxy.isSupport(LiveMerchantHalfMixContainerTabLayout.class)) {
                      obj = PatchProxy.applyTwoRefs(Integer.valueOf(i3), uoa, liveMerchant, LiveMerchantHalfMixContainerTabLayout.class, "11");
                      if (obj != PatchProxyResult.class) {
                         linearLayout = null;
                      label_063b :
                         liveMerchant.addView(obj);
                         i3 = i3 + 1;
                         i = 0;
                      }
                   }
                   liveMerchant.J.get(i3).b = i0.l();
                   linearLayout = new LinearLayout(this.getContext());
                   linearLayout.setId(liveMerchant.J.get(i3).b);
                   linearLayout.setOrientation(i);
                   uoa.n(linearLayout.getId(), liveMerchant.O);
                   uoa.q(linearLayout.getId(), i);
                   if (liveMerchant.N(i3)) {
                      linearLayout1 = linearLayout;
                      uoa.m(linearLayout.getId(), 1, 0, 1, 0);
                      uoa.m(linearLayout1.getId(), 2, liveMerchant.J.get(i3).g, 2, null);
                   }else {
                      linearLayout1 = linearLayout;
                      if (liveMerchant.O(i3)) {
                         uoa.m(linearLayout1.getId(), 2, 0, 2, 0);
                         uoa.m(linearLayout1.getId(), 1, liveMerchant.J.get(i3).f, 1, null);
                      }else {
                         uoa.m(linearLayout1.getId(), 1, liveMerchant.J.get(i3).f, 1, 0);
                         uoa.m(linearLayout1.getId(), 2, liveMerchant.J.get(i3).g, 2, null);
                      }
                   }
                   uoa.m(linearLayout1.getId(), 4, 0, 4, 0);
                   AppCompatImageView uAppCompatIm = new AppCompatImageView(this.getContext());
                   liveMerchant.J.get(i3).c = i0.l();
                   uAppCompatIm.setId(liveMerchant.J.get(i3).c);
                   h oh = (liveMerchant.N(i3))? ia.c(R.drawable.arg_RES_7f081376, liveMerchant.M(i3)): ia.c(R.drawable.arg_RES_7f081377, liveMerchant.M(i3));
                label_052f :
                   int i4 = -2;
                   if (oh != null) {
                      uAppCompatIm.setImageDrawable(oh);
                      linearLayout2 = linearLayout1;
                      linearLayout2.addView(uAppCompatIm, new LinearLayout$LayoutParams(i4, -1));
                   }else {
                      linearLayout2 = linearLayout1;
                   }
                   TextView textView = new TextView(this.getContext());
                   liveMerchant.J.get(i3).d = i0.l();
                   textView.setId(liveMerchant.J.get(i3).d);
                   LinearLayout$LayoutParams layoutParams = new LinearLayout$LayoutParams(i, -1);
                   layoutParams.weight = 0x3f800000;
                   textView.setGravity(17);
                   if (PatchProxy.isSupport(LiveMerchantHalfMixContainerTabLayout.class)) {
                      AppCompatImageView obj1 = PatchProxy.applyOneRefs(Integer.valueOf(i3), liveMerchant, LiveMerchantHalfMixContainerTabLayout.class, "13");
                      if (obj1 != PatchProxyResult.class) {
                         i = obj1.intValue();
                      label_05a5 :
                         textView.setTextColor(i);
                         textView.setBackgroundColor(liveMerchant.M(i3));
                         textView.setTextSize((float)liveMerchant.I);
                         textView.setText(liveMerchant.C.mContainers.get(i3).mActivityTitle);
                         textView.setSingleLine(i1);
                         textView.setMaxLines(i1);
                         textView.setTypeface(Typeface.DEFAULT_BOLD);
                         textView.setEllipsize(TextUtils$TruncateAt.END);
                         textView.setShadowLayer(0x3f800000, 0, 0x3f800000, a1.a(R.color.arg_RES_7f0619a0));
                         linearLayout2.addView(textView, layoutParams);
                         obj1 = new AppCompatImageView(this.getContext());
                         liveMerchant.J.get(i3).e = i0.l();
                         obj1.setId(liveMerchant.J.get(i3).e);
                         oh = (liveMerchant.O(i3))? ia.c(R.drawable.arg_RES_7f081378, liveMerchant.M(i3)): ia.c(R.drawable.arg_RES_7f081379, liveMerchant.M(i3));
                      label_062d :
                         if (oh != null) {
                            obj1.setImageDrawable(oh);
                            linearLayout2.addView(obj1, new LinearLayout$LayoutParams(i4, -1));
                         }
                         obj = linearLayout2;
                         goto label_063b ;
                      }
                   }
                   i = y0.a(liveMerchant.E, liveMerchant.C.mContainers.get(i3).mSelectedTitleColor, "LiveMerchantHalfMixContainerTabLayout : getSelectTabTextColor");
                   goto label_05a5 ;
                }
             }
             e.a(this);
             uoa.b(liveMerchant);
          }
          return;
       }
    }
}
