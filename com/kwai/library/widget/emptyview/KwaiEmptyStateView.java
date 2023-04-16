package com.kwai.library.widget.emptyview.KwaiEmptyStateView;
import i17.b;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import com.kwai.library.widget.emptyview.KwaiEmptyStateInit;
import android.view.View$OnClickListener;
import pz6.a;
import ll8.c$b;
import android.content.res.TypedArray;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import android.text.TextPaint;
import java.lang.String;
import android.content.res.Resources;
import cw9.c;
import j17.b;
import j17.a;
import java.lang.CharSequence;
import android.text.TextUtils;
import lnc.a1;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView$a;
import i17.a;
import android.view.ViewGroup$MarginLayoutParams;
import android.graphics.drawable.Drawable;
import android.content.res.Configuration;
import pd6.b;
import android.content.res.ColorStateList;

public class KwaiEmptyStateView extends FrameLayout implements b	// class@000936
{
    public final int b;
    public final int c;
    public final View$OnClickListener d;
    public CharSequence e;
    public CharSequence f;
    public CharSequence g;
    public boolean h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public final int p;
    public ImageView q;
    public TextView r;
    public TextView s;
    public TextView t;
    public TextView u;
    public int v;
    public int w;

    public void KwaiEmptyStateView(Context p0){
       super(p0, null);
    }
    public void KwaiEmptyStateView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void KwaiEmptyStateView(Context p0,AttributeSet p1,int p2){
       a a;
       String str;
       int i1;
       super(p0, p1, p2);
       this.b = 0x7f0606be;
       this.c = 0x7f081051;
       View$OnClickListener networkResol = KwaiEmptyStateInit.INSTANCE.getNetworkResolveClickListener();
       this.d = networkResol;
       boolean b = false;
       this.h = b;
       this.i = b;
       this.j = a.a().c;
       this.k = a.a().d;
       this.l = a.a().o;
       this.m = a.a().b;
       this.n = a.a().s;
       this.p = 0x7f062123;
       this.w = 1;
       a uoa = a.a();
       a = uoa.a;
       if (a == -1) {
       }else {
          TypedArray typedArray1 = p0.obtainStyledAttributes(a, c$b.J1);
          uoa.b = typedArray1.getResourceId(1, uoa.b);
          if (typedArray1.hasValue(3)) {
             uoa.c = typedArray1.getResourceId(3, uoa.c);
          }else if(typedArray1.hasValue(17)){
             uoa.c = typedArray1.getResourceId(17, uoa.c);
          }
          uoa.d = typedArray1.getResourceId(11, uoa.d);
          typedArray1.recycle();
       }
       LayoutInflater.from(this.getContext()).inflate(R.layout.arg_RES_7f0d1717, this);
       this.setLayoutParams(new ViewGroup$LayoutParams(-1, -1));
       this.q = this.findViewById(0x7f0a1527);
       this.r = this.findViewById(0x7f0a4177);
       this.s = this.findViewById(0x7f0a35e0);
       this.t = this.findViewById(0x7f0a41f1);
       this.u = this.findViewById(0x7f0a417a);
       this.r.getPaint().setFakeBoldText(1);
       this.s.getPaint().setFakeBoldText(1);
       this.m(networkResol);
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.J1, p2, b);
       this.i = typedArray.getResourceId(10, b);
       this.f = typedArray.getString(9);
       this.g = typedArray.getString(8);
       this.v = typedArray.getInt(7, b);
       this.j = typedArray.getResourceId(3, a.a().c);
       if (typedArray.hasValue(17)) {
          this.j = typedArray.getResourceId(17, a.a().c);
       }
       this.l = typedArray.getResourceId(b, a.a().o);
       this.m = typedArray.getResourceId(1, a.a().b);
       this.k(typedArray.getDimensionPixelSize(6, c.b(this.getResources(), a.a().f)), typedArray.getDimensionPixelSize(5, c.b(this.getResources(), a.a().f)));
       this.setIconMarginBottom(typedArray.getDimensionPixelSize(22, c.b(this.getResources(), a.a().h)));
       this.setTitleMarginHor(typedArray.getDimensionPixelSize(19, c.b(this.getResources(), a.a().i)));
       this.setTitleSize((float)typedArray.getDimensionPixelSize(21, c.b(this.getResources(), a.a().j)));
       b.a(typedArray.getResourceId(18, a.a().r), this.r);
       this.setTitleMaxLines(typedArray.getInt(20, a.a().n));
       this.o = typedArray.getDimensionPixelSize(14, c.b(this.getResources(), a.a().k));
       b.a(typedArray.getResourceId(12, a.a().t), this.u);
       this.setMessageSize((float)typedArray.getDimensionPixelSize(13, c.b(this.getResources(), a.a().l)));
       this.k = typedArray.getResourceId(11, a.a().d);
       p2 = 2;
       this.setButtonTopMargin(typedArray.getDimensionPixelSize(p2, c.b(this.getResources(), a.a().m)));
       this.n = typedArray.getResourceId(4, a.a().s);
       this.t.setTextColor(a.a(this.getContext(), typedArray.getResourceId(15, a.a().e)));
       b.a(typedArray.getResourceId(16, a.a().u), this.t);
       typedArray.recycle();
       KwaiEmptyStateView tv = this.v;
       if (tv != null) {
          Context uContext = 0x7f100d2d;
          int i = 0x7f0805f4;
          if (tv != 1) {
             if (tv != p2) {
                if (tv != 3) {
                   if (tv != 4) {
                      if (tv == 5) {
                      label_02d9 :
                         tv = this.i;
                         if (tv != null) {
                            i = tv;
                         }
                         this.i = i;
                         str = (TextUtils.isEmpty(this.f))? a1.p(R.string.arg_RES_7f100d25): this.f;
                         this.f = str;
                         str = (TextUtils.isEmpty(this.g))? this.getResources().getString(uContext): this.g;
                         this.g = str;
                      }
                   }else {
                      tv = this.i;
                      if (tv != null) {
                         i = tv;
                      }
                      this.i = i;
                      str = (TextUtils.isEmpty(this.f))? a1.p(R.string.arg_RES_7f100d25): this.f;
                      this.f = str;
                   }
                }else {
                   goto label_02d9 ;
                }
             }else {
                tv = this.i;
                if (tv != null) {
                   i = tv;
                }
                this.i = i;
                str = (TextUtils.isEmpty(this.f))? a1.p(R.string.arg_RES_7f100d25): this.f;
                this.f = str;
                str = (TextUtils.isEmpty(this.g))? this.getResources().getString(uContext): this.g;
                this.g = str;
             }
          }else {
             goto label_02d9 ;
          }
       }else {
          tv = this.i;
          if (tv == null) {
             i1 = 0x7f0805fc;
          }
          this.i = i1;
          str = (TextUtils.isEmpty(this.f))? a1.p(R.string.arg_RES_7f100d26): this.f;
          this.f = str;
       }
       this.d(this.v);
       this.i(this.i);
       this.h(this.f);
       this.o(this.g);
       this.setButtonStyle(this.getContext());
       this.r.setTextColor(a.a(this.getContext(), this.j));
       this.u.setTextColor(a.a(this.getContext(), this.k));
       return;
    }
    public static KwaiEmptyStateView$a e(){
       return new KwaiEmptyStateView$a();
    }
    public void a(int p0){
       TypedArray typedArray = this.getContext().obtainStyledAttributes(p0, c$b.J1);
       this.v = typedArray.getInt(7, this.v);
       this.l = typedArray.getResourceId(0, this.l);
       this.j = typedArray.getResourceId(3, this.j);
       int i = 17;
       if (typedArray.hasValue(i)) {
          this.j = typedArray.getResourceId(i, this.j);
       }
       this.m = typedArray.getResourceId(1, this.m);
       this.k(typedArray.getDimensionPixelSize(6, c.b(this.getResources(), a.a().f)), typedArray.getDimensionPixelSize(5, c.b(this.getResources(), a.a().f)));
       this.setIconMarginBottom(typedArray.getDimensionPixelSize(22, c.b(this.getResources(), a.a().h)));
       this.setTitleMarginHor(typedArray.getDimensionPixelSize(19, c.b(this.getResources(), a.a().i)));
       this.setTitleSize((float)typedArray.getDimensionPixelSize(21, c.b(this.getResources(), a.a().j)));
       b.a(typedArray.getResourceId(18, a.a().r), this.r);
       this.setTitleMaxLines(typedArray.getInt(20, a.a().n));
       this.o = typedArray.getDimensionPixelSize(14, c.b(this.getResources(), a.a().k));
       b.a(typedArray.getResourceId(12, a.a().t), this.u);
       this.setMessageSize((float)typedArray.getDimensionPixelSize(13, c.b(this.getResources(), a.a().l)));
       this.k = typedArray.getResourceId(11, a.a().d);
       this.setButtonTopMargin(typedArray.getDimensionPixelSize(2, c.b(this.getResources(), a.a().m)));
       this.n = typedArray.getResourceId(4, a.a().s);
       this.t.setTextColor(a.a(this.getContext(), typedArray.getResourceId(15, a.a().e)));
       b.a(typedArray.getResourceId(16, a.a().u), this.t);
       typedArray.recycle();
       this.d(this.v);
       this.setButtonStyle(this.getContext());
       this.r.setTextColor(a.a(this.getContext(), this.j));
       this.u.setTextColor(a.a(this.getContext(), this.k));
       return;
    }
    public void b(int p0){
       a.a(this, p0);
    }
    public final void c(){
       ViewGroup$LayoutParams layoutParams = this.u.getLayoutParams();
       if (!layoutParams instanceof ViewGroup$MarginLayoutParams) {
          return;
       }
       KwaiEmptyStateView kwaiEmptySta = null;
       KwaiEmptyStateView kwaiEmptySta1 = (!this.u.getVisibility() && !this.r.getVisibility())? 1: null;
       if (kwaiEmptySta1) {
          kwaiEmptySta = this.o;
       }
       layoutParams.topMargin = kwaiEmptySta;
       this.u.setLayoutParams(layoutParams);
       return;
    }
    public KwaiEmptyStateView d(int p0){
       this.v = p0;
       if (p0) {
          if (p0 != 1) {
             if (p0 != 2) {
                if (p0 != 3) {
                   if (p0 != 4) {
                      if (p0 == 5) {
                         this.q.setVisibility(8);
                         this.s.setVisibility(0);
                         this.t.setVisibility(0);
                      }
                   }else {
                   label_003d :
                      this.s.setVisibility(8);
                      this.t.setVisibility(8);
                   }
                }
             }else {
                this.s.setVisibility(0);
                this.t.setVisibility(8);
             }
          }
          this.s.setVisibility(0);
          this.t.setVisibility(0);
       }else {
          goto label_003d ;
       }
       return this;
    }
    public KwaiEmptyStateView f(){
       this.q.setVisibility(8);
       return this;
    }
    public KwaiEmptyStateView g(int p0){
       this.h(this.getResources().getString(p0));
       return this;
    }
    public TextView getEmptyDesc(){
       return this.r;
    }
    public TextView getTitleText(){
       return this.r;
    }
    public final int getUiModeFlag(){
       KwaiEmptyStateView tw = this.w;
       if (tw == 2) {
          return 16;
       }
       if (tw == 3) {
          return 32;
       }
       return 16;
    }
    public KwaiEmptyStateView h(CharSequence p0){
       this.f = p0;
       if (!TextUtils.isEmpty(p0)) {
          this.r.setText(this.f);
          this.r.setVisibility(0);
          this.c();
       }else {
          this.r.setVisibility(8);
       }
       return this;
    }
    public KwaiEmptyStateView i(int p0){
       boolean b = false;
       this.h = b;
       this.i = p0;
       if (p0) {
          this.q.setImageResource(p0);
          this.q.setVisibility(b);
       }else {
          this.q.setVisibility(8);
       }
       return this;
    }
    public KwaiEmptyStateView j(Drawable p0){
       this.h = true;
       if (p0 != null) {
          this.q.setImageDrawable(p0);
          this.q.setVisibility(0);
       }else {
          this.q.setVisibility(8);
       }
       return this;
    }
    public final void k(int p0,int p1){
       ViewGroup$LayoutParams layoutParams = this.q.getLayoutParams();
       layoutParams.width = p0;
       layoutParams.height = p1;
       this.q.setLayoutParams(layoutParams);
    }
    public KwaiEmptyStateView l(CharSequence p0){
       if (!TextUtils.isEmpty(p0)) {
          this.t.setText(p0);
          this.t.setVisibility(0);
       }else {
          this.t.setVisibility(8);
       }
       return this;
    }
    public KwaiEmptyStateView m(View$OnClickListener p0){
       this.t.setOnClickListener(p0);
       return this;
    }
    public KwaiEmptyStateView n(int p0){
       this.o(this.getResources().getString(p0));
       return this;
    }
    public KwaiEmptyStateView o(CharSequence p0){
       this.g = p0;
       if (!TextUtils.isEmpty(p0)) {
          this.s.setText(this.g);
          this.s.setVisibility(0);
       }else {
          this.s.setVisibility(8);
       }
       return this;
    }
    public KwaiEmptyStateView p(View$OnClickListener p0){
       if (p0 == null) {
          this.s.setVisibility(8);
       }else {
          this.s.setOnClickListener(p0);
          this.s.setVisibility(0);
       }
       return this;
    }
    public KwaiEmptyStateView q(int p0){
       if (p0 == 1) {
          return this;
       }
       this.w = p0;
       Configuration uConfigurati = new Configuration(this.getContext().getResources().getConfiguration());
       uConfigurati.uiMode = this.getUiModeFlag();
       Context uContext = b.a(this.getContext(), uConfigurati);
       if (uContext.getResources() == null) {
          return this;
       }
       KwaiEmptyStateView ti = this.i;
       if (ti > null && this.h == null) {
          this.q.setImageDrawable(a.e(uContext, ti));
       }
       this.r.setTextColor(a.a(uContext, this.j));
       this.u.setTextColor(a.a(uContext, this.k));
       this.setButtonStyle(uContext);
       this.t.setTextColor(a.a(uContext, this.p));
       return this;
    }
    public void setButtonStyle(Context p0){
       KwaiEmptyStateView tn = this.n;
       KwaiEmptyStateView kwaiEmptySta = -1;
       if (tn != kwaiEmptySta) {
          KwaiEmptyStateView ts = this.s;
          if (tn != kwaiEmptySta) {
             TypedArray typedArray = ts.getContext().obtainStyledAttributes(tn, c$b.F1);
             int intx = typedArray.getInt(2, 17);
             int layoutDimens = typedArray.getLayoutDimension(5, -2);
             int layoutDimens1 = typedArray.getLayoutDimension(4, -2);
             ts.setBackgroundResource(typedArray.getResourceId(3, 0x106000d));
             ViewGroup$LayoutParams layoutParams = ts.getLayoutParams();
             if (layoutParams == null) {
                layoutParams = new ViewGroup$LayoutParams(layoutDimens1, layoutDimens);
             }else {
                layoutParams.height = layoutDimens;
                layoutParams.width = layoutDimens1;
             }
             ts.setLayoutParams(layoutParams);
             ts.setGravity(intx);
             ts.setMaxLines(typedArray.getInt(6, Integer.MAX_VALUE));
             intx = 7;
             if (typedArray.hasValue(intx)) {
                b.a(typedArray.getResourceId(intx, kwaiEmptySta), ts);
             }else {
                intx = 0;
                if (typedArray.hasValue(intx)) {
                   ts.setTextSize(intx, (float)typedArray.getDimensionPixelSize(intx, intx));
                }
             }
             intx = 1;
             if (typedArray.hasValue(intx)) {
                ColorStateList colorStateLi = typedArray.getColorStateList(intx);
                if (colorStateLi != null) {
                   ts.setTextColor(colorStateLi);
                }else {
                   intx = typedArray.getColor(intx, kwaiEmptySta);
                   if (intx != kwaiEmptySta) {
                      ts.setTextColor(intx);
                   }
                }
             }
             typedArray.recycle();
          }
       }
       tn = this.m;
       if (tn != kwaiEmptySta) {
          this.s.setTextColor(a.a(p0, tn));
       }else if(this.n == kwaiEmptySta){
          tn = this.b;
          this.m = tn;
          this.s.setTextColor(a.a(p0, tn));
       }
       tn = this.l;
       if (tn != kwaiEmptySta) {
          this.s.setBackground(a.e(p0, tn));
       }else if(this.n == kwaiEmptySta){
          tn = this.c;
          this.l = tn;
          this.s.setBackground(a.e(p0, tn));
       }
       return;
    }
    public final void setButtonTopMargin(int p0){
       if (!this.s.getLayoutParams() instanceof ViewGroup$MarginLayoutParams) {
          return;
       }
       ViewGroup$MarginLayoutParams layoutParams = this.s.getLayoutParams();
       layoutParams.topMargin = p0;
       this.s.setLayoutParams(layoutParams);
       return;
    }
    public final void setIconMarginBottom(int p0){
       if (!this.q.getLayoutParams() instanceof ViewGroup$MarginLayoutParams) {
          return;
       }
       ViewGroup$MarginLayoutParams layoutParams = this.q.getLayoutParams();
       layoutParams.bottomMargin = p0;
       this.q.setLayoutParams(layoutParams);
       return;
    }
    public final void setMessageSize(float p0){
       this.u.setTextSize(0, p0);
    }
    public void setRetryBtnVisibility(int p0){
       this.s.setVisibility(p0);
    }
    public final void setTitleMarginHor(int p0){
       if (!this.r.getLayoutParams() instanceof ViewGroup$MarginLayoutParams) {
          return;
       }
       ViewGroup$MarginLayoutParams layoutParams = this.r.getLayoutParams();
       layoutParams.setMarginStart(p0);
       layoutParams.setMarginEnd(p0);
       this.r.setLayoutParams(layoutParams);
       return;
    }
    public final void setTitleMaxLines(int p0){
       this.r.setMaxLines(p0);
    }
    public final void setTitleSize(float p0){
       this.r.setTextSize(0, p0);
    }
}
