package com.yxcorp.gifshow.widget.KwaiActionBar;
import android.widget.RelativeLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import android.view.ViewTreeObserver;
import com.yxcorp.gifshow.widget.KwaiActionBar$c;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import ll8.c$b;
import android.content.res.TypedArray;
import java.lang.CharSequence;
import android.app.Activity;
import android.content.ContextWrapper;
import android.view.View$OnClickListener;
import android.widget.ImageView;
import android.graphics.drawable.Drawable;
import com.yxcorp.utility.SystemUtil;
import tyc.g2;
import android.text.TextUtils;
import java.lang.String;
import com.yxcorp.gifshow.widget.KwaiActionBar$a;
import com.yxcorp.gifshow.widget.KwaiActionBar$b;
import android.content.res.Resources;

public class KwaiActionBar extends RelativeLayout	// class@00186d
{
    public View b;
    public View c;
    public View d;
    public TextView e;
    public View$OnClickListener f;
    public View$OnClickListener g;
    public View$OnClickListener h;
    public boolean i;
    public boolean j;
    public boolean k;

    public void KwaiActionBar(Context p0){
       super(p0, null, 0);
    }
    public void KwaiActionBar(Context p0,AttributeSet p1){
       super(p0, p1, 0);
       this.c(p0, p1);
    }
    public void KwaiActionBar(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.k = true;
       this.c(p0, p1);
    }
    public void a(View p0){
       this.e = p0.findViewById(0x7f0a3f7b);
       this.b = p0.findViewById(0x7f0a3f6a);
       this.d = p0.findViewById(0x7f0a3643);
       this.c = p0.findViewById(0x7f0a1716);
    }
    public void b(){
       this.e.getViewTreeObserver().addOnGlobalLayoutListener(new KwaiActionBar$c(this));
    }
    public void c(Context p0,AttributeSet p1){
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.k2);
       this.f(typedArray.getBoolean(1, 1));
       this.g(typedArray.getBoolean(3, false));
       typedArray.recycle();
    }
    public KwaiActionBar d(int p0,int p1,int p2){
       return this.i(p0).m(p1).q(p2);
    }
    public KwaiActionBar e(int p0,int p1,CharSequence p2){
       return this.i(p0).m(p1).r(p2);
    }
    public KwaiActionBar f(boolean p0){
       this.i = p0;
       return this;
    }
    public KwaiActionBar g(boolean p0){
       this.j = p0;
       return this;
    }
    public Activity getActivity(){
       Context context = this.getContext();
       while (true) {
          if (context instanceof ContextWrapper) {
             if (context instanceof Activity) {
                break ;
             }else {
                context = context.getBaseContext();
             }
          }else {
             context = null;
             break ;
          }
       }
       return context;
    }
    public View getLeftButton(){
       return this.c;
    }
    public View getRightButton(){
       return this.d;
    }
    public TextView getTitleTextView(){
       return this.e;
    }
    public KwaiActionBar h(View$OnClickListener p0){
       this.j = false;
       this.g = p0;
       return this;
    }
    public KwaiActionBar i(int p0){
       KwaiActionBar tc = this.c;
       if (tc == null) {
          return this;
       }
       if (p0 > 0) {
          if (tc instanceof TextView) {
             tc.setText(p0);
          }else if(tc instanceof ImageView){
             tc.setImageResource(p0);
          }
          this.c.setVisibility(0);
       }else {
          tc.setVisibility(4);
          this.g = null;
       }
       return this;
    }
    public KwaiActionBar j(Drawable p0){
       return this.k(p0, true);
    }
    public KwaiActionBar k(Drawable p0,boolean p1){
       KwaiActionBar tc = this.c;
       if (tc != null && tc instanceof ImageView) {
          if (p0 != null) {
             tc.setImageDrawable(p0);
             if (p1) {
                this.c.setVisibility(0);
             }
          }else {
             tc.setVisibility(4);
             this.g = null;
          }
       }
       return this;
    }
    public KwaiActionBar l(View$OnClickListener p0){
       this.h = p0;
       return this;
    }
    public KwaiActionBar m(int p0){
       return this.n(p0, true);
    }
    public KwaiActionBar n(int p0,boolean p1){
       KwaiActionBar td = this.d;
       if (td == null) {
          return this;
       }
       if (p0 > 0) {
          if (td instanceof TextView) {
             td.setText(p0);
          }else if(td instanceof ImageView){
             td.setImageResource(p0);
          }
          if (p1) {
             this.d.setVisibility(0);
          }
       }else {
          td.setVisibility(4);
          this.h = null;
       }
       return this;
    }
    public KwaiActionBar o(Drawable p0){
       return this.p(p0, true);
    }
    public void onFinishInflate(){
       if (SystemUtil.O()) {
          super.onFinishInflate();
          this.a(this);
          this.b.setOnClickListener(new g2(this));
          KwaiActionBar tc = this.c;
          if (tc != null) {
             tc.setVisibility(0);
             if (TextUtils.isEmpty(this.c.getContentDescription())) {
                this.c.setContentDescription(this.getContext().getString(R.string.arg_RES_7f1051c9));
             }
             this.c.setOnClickListener(new KwaiActionBar$a(this));
          }
          tc = this.d;
          if (tc != null) {
             tc.setVisibility(0);
             this.d.setOnClickListener(new KwaiActionBar$b(this));
          }
          tc = this.e;
          if (tc != null) {
             tc.setVisibility(0);
             this.b();
          }
       }
       return;
    }
    public KwaiActionBar p(Drawable p0,boolean p1){
       KwaiActionBar td = this.d;
       if (td != null && td instanceof ImageView) {
          if (p0 != null) {
             td.setImageDrawable(p0);
             if (p1) {
                this.d.setVisibility(0);
             }
          }else {
             td.setVisibility(4);
             this.h = null;
          }
       }
       return this;
    }
    public KwaiActionBar q(int p0){
       KwaiActionBar te = this.e;
       if (te == null) {
          return this;
       }
       if (p0 > 0) {
          te.setText(p0);
          this.e.setVisibility(0);
       }else {
          te.setVisibility(4);
       }
       return this;
    }
    public KwaiActionBar r(CharSequence p0){
       if (this.e == null) {
          return this;
       }
       if (!TextUtils.isEmpty(p0)) {
          this.e.setText(p0);
          this.e.setVisibility(0);
       }else {
          this.e.setVisibility(4);
       }
       return this;
    }
    public KwaiActionBar s(int p0){
       KwaiActionBar te = this.e;
       if (te != null) {
          te.setTextColor(this.getResources().getColor(p0));
       }
       return this;
    }
    public void setEnableDynamicAdjustTitleSize(boolean p0){
       this.k = p0;
    }
    public KwaiActionBar t(int p0){
       KwaiActionBar te = this.e;
       if (te != null) {
          te.setTextColor(p0);
       }
       return this;
    }
}
