package com.yxcorp.gifshow.widget.KwaiVerticalActionBar;
import android.widget.LinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.util.ArrayList;
import ll8.c$b;
import android.content.res.TypedArray;
import java.lang.String;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Object;
import java.util.List;
import java.util.Arrays;
import java.util.Collection;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import lnc.a1;
import android.widget.TextView;
import android.widget.ImageView;
import android.content.res.Resources;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.widget.KwaiVerticalActionBar$ActionBarItem;
import ag6.a;
import android.widget.LinearLayout$LayoutParams;
import tyc.h2;
import android.graphics.drawable.Drawable;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.a;

public class KwaiVerticalActionBar extends LinearLayout	// class@001871
{
    public final List b;
    public TextView c;
    public int d;
    public int e;
    public boolean f;
    public h2 g;

    public void KwaiVerticalActionBar(Context p0){
       super(p0, null);
    }
    public void KwaiVerticalActionBar(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void KwaiVerticalActionBar(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       ArrayList uArrayList = new ArrayList();
       this.b = uArrayList;
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.m2, p2, 0);
       this.e = typedArray.getColor(1, 0);
       int booleanx = typedArray.getBoolean(2, 0);
       this.f = booleanx;
       booleanx = (booleanx)? 0: this.a(R.color.arg_RES_7f0620ee);
       this.d = typedArray.getColor(0, booleanx);
       String str = typedArray.getString(3);
       typedArray.recycle();
       if (!TextUtils.isEmpty(str)) {
          uArrayList.addAll(Arrays.asList(str.split(",")));
       }
       LayoutInflater.from(this.getContext()).inflate(R.layout.arg_RES_7f0d1714, this);
       this.setLayoutParams(new ViewGroup$LayoutParams(-1, a1.d(R.dimen.arg_RES_7f0710ab)));
       this.setGravity(16);
       this.setOrientation(0);
       this.setBackgroundColor(this.d);
       this.setPadding(0, 0, a1.d(R.dimen.arg_RES_7f0710ae), 0);
       this.c = this.findViewById(0x7f0a4584);
       ImageView imageView = this.findViewById(R.id.widget_actionbar_back);
       booleanx = (this.f != null)? 0x7f082569: 0x7f082568;
       imageView.setImageResource(booleanx);
       KwaiVerticalActionBar tc = this.c;
       booleanx = (this.f != null)? 0x7f0620f3: 0x7f0620f2;
       tc.setTextColor(this.a(booleanx));
       return;
    }
    public final int a(int p0){
       return this.getContext().getResources().getColor(p0);
    }
    public final void b(int p0,View$OnClickListener p1){
       View view = this.findViewById(p0);
       if (view != null) {
          view.setOnClickListener(p1);
       }
       return;
    }
    public void onFinishInflate(){
       LinearLayout$LayoutParams layoutParams;
       int color;
       Drawable drawable;
       Drawable uDrawable;
       Drawable drawable1;
       super.onFinishInflate();
       int i = this.b.size();
       int i1 = 0;
       while (i1 < i) {
          KwaiVerticalActionBar kwaiVertical = 0x7f0620f2;
          int i2 = 8;
          if ((KwaiVerticalActionBar$ActionBarItem.SEARCH_EDIT.mItemStr).equals(this.b.get(i1))) {
             View view = a.c(LayoutInflater.from(this.getContext()), R.layout.arg_RES_7f0d1716, this, false);
             layoutParams = view.getLayoutParams();
             layoutParams.rightMargin = a1.d(0x7f0710ad);
             h2 oh2 = new h2(view);
             this.g = oh2;
             if (this.f != null) {
                oh2.a(this.e);
             }else {
                color = oh2.c.getContext().getResources().getColor(kwaiVertical);
                oh2.c.setBackgroundResource(R.drawable.arg_RES_7f08256f);
                oh2.b.setTextColor(color);
                drawable = ContextCompat.getDrawable(oh2.c.getContext(), R.drawable.arg_RES_7f08256c);
                if (drawable == null) {
                   oh2.a.setVisibility(i2);
                }else {
                   drawable.setAutoMirrored(true);
                   uDrawable = a.r(drawable).mutate();
                   a.n(uDrawable, color);
                   oh2.a.setImageDrawable(uDrawable);
                }
             }
             this.addView(view, layoutParams);
             LinearLayout$LayoutParams layoutParams1 = this.c.getLayoutParams();
             layoutParams1.width = -2;
             layoutParams1.weight = 0;
             this.c.setLayoutParams(layoutParams1);
          }else {
             ImageView imageView = a.c(LayoutInflater.from(this.getContext()), R.layout.arg_RES_7f0d1715, this, false);
             layoutParams = imageView.getLayoutParams();
             int i3 = i - 1;
             i3 = (i1 == i3)? 0: a1.d(R.dimen.arg_RES_7f0710ac);
             layoutParams.rightMargin = i3;
             String str = this.b.get(i1);
             KwaiVerticalActionBar$ActionBarItem cOLLECT = KwaiVerticalActionBar$ActionBarItem.COLLECT;
             if ((cOLLECT.mItemStr).equals(str)) {
                imageView.setId(R.id.widget_actionbar_collect);
                drawable1 = ContextCompat.getDrawable(this.getContext(), cOLLECT.mItemIconRes);
             }else {
                cOLLECT = KwaiVerticalActionBar$ActionBarItem.SHARE;
                if ((cOLLECT.mItemStr).equals(str)) {
                   imageView.setId(R.id.widget_actionbar_share);
                   drawable1 = ContextCompat.getDrawable(this.getContext(), cOLLECT.mItemIconRes);
                }else {
                   cOLLECT = KwaiVerticalActionBar$ActionBarItem.MORE;
                   if ((cOLLECT.mItemStr).equals(str)) {
                      imageView.setId(R.id.widget_actionbar_more);
                      drawable1 = ContextCompat.getDrawable(this.getContext(), cOLLECT.mItemIconRes);
                   }else {
                      cOLLECT = KwaiVerticalActionBar$ActionBarItem.SEARCH;
                      if ((cOLLECT.mItemStr).equals(str)) {
                         imageView.setId(R.id.widget_actionbar_search);
                         drawable1 = ContextCompat.getDrawable(this.getContext(), cOLLECT.mItemIconRes);
                      }else {
                         drawable1 = null;
                      }
                   }
                }
             }
             if (drawable1 == null) {
                imageView.setVisibility(i2);
             }else {
                imageView.setVisibility(false);
                uDrawable = a.r(drawable1).mutate();
                if (this.f != null) {
                   color = 0x7f0620f3;
                }
                a.n(uDrawable, this.a(color));
                imageView.setImageDrawable(uDrawable);
             }
             this.addView(imageView, layoutParams);
          }
          i1 = i1 + 1;
       }
       return;
    }
    public void setClickBackButton(View$OnClickListener p0){
       this.b(R.id.widget_actionbar_back, p0);
    }
    public void setClickCollectButton(View$OnClickListener p0){
       this.b(R.id.widget_actionbar_collect, p0);
    }
    public void setClickMoreButton(View$OnClickListener p0){
       this.b(R.id.widget_actionbar_search, p0);
    }
    public void setClickShareButton(View$OnClickListener p0){
       this.b(R.id.widget_actionbar_share, p0);
    }
    public void setImmersiveColor(int p0){
       KwaiVerticalActionBar tg = this.g;
       if (tg != null) {
          tg.a(p0);
       }
       return;
    }
    public void setSearchText(int p0){
       KwaiVerticalActionBar tg = this.g;
       if (tg != null) {
          tg.b.setText(p0);
       }
       return;
    }
    public void setSearchText(CharSequence p0){
       KwaiVerticalActionBar tg = this.g;
       if (tg != null) {
          tg.b.setText(p0);
       }
       return;
    }
}
