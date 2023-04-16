package com.yxcorp.gifshow.comment.utils.Labels.CommentLabelsView;
import android.view.View$OnClickListener;
import android.widget.LinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ll8.c$b;
import android.content.res.TypedArray;
import android.content.res.ColorStateList;
import lnc.a1;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import com.kuaishou.android.model.mix.QComment$Label;
import java.lang.Integer;
import com.yxcorp.gifshow.comment.utils.Labels.CommentLabelsView$a;
import android.os.Parcelable;
import android.os.Bundle;
import com.kwai.robust.PatchProxyResult;
import java.lang.Float;
import java.util.List;
import java.util.Collection;
import ekd.q;
import java.lang.Boolean;
import java.lang.Exception;
import r0.a;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.Drawable$ConstantState;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import java.lang.CharSequence;
import android.text.TextPaint;

public class CommentLabelsView extends LinearLayout implements View$OnClickListener	// class@0010ff
{
    public Context b;
    public ColorStateList c;
    public float d;
    public Drawable e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public CommentLabelsView$a k;
    public static final int l = 2131377392;
    public static final int m = 2131377393;

    public void CommentLabelsView(Context p0){
       super(p0);
       this.b = p0;
    }
    public void CommentLabelsView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.b = p0;
       this.a(p0, p1);
    }
    public void CommentLabelsView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = p0;
       this.a(p0, p1);
    }
    public final void a(Context p0,AttributeSet p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, CommentLabelsView.class, "1")) {
          return;
       }
       if (p1 != null) {
          TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.T);
          this.c = typedArray.getColorStateList(1);
          this.d = typedArray.getDimension(6, (float)a1.e(9.00f));
          this.f = typedArray.getDimensionPixelOffset(3, 0);
          this.g = typedArray.getDimensionPixelOffset(5, 0);
          this.h = typedArray.getDimensionPixelOffset(4, 0);
          this.i = typedArray.getDimensionPixelOffset(2, 0);
          this.j = typedArray.getDimensionPixelOffset(7, 0);
          this.e = this.getResources().getDrawable(typedArray.getResourceId(0, 0));
          typedArray.recycle();
       }
       this.setOrientation(0);
       return;
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CommentLabelsView.class, "10")) {
          return;
       }
       if (p0 instanceof TextView) {
          Object tag = p0.getTag(CommentLabelsView.l);
          CommentLabelsView tk = this.k;
          if (tk != null && tag instanceof QComment$Label) {
             tk.a(p0, tag, p0.getTag(CommentLabelsView.m).intValue());
          }
       }
       return;
    }
    public void onRestoreInstanceState(Parcelable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CommentLabelsView.class, "3")) {
          return;
       }
       if (p0 instanceof Bundle) {
          super.onRestoreInstanceState(p0.getParcelable("key_super_state"));
          ColorStateList parcelable = p0.getParcelable("key_text_color_state");
          if (parcelable != null) {
             this.setLabelTextColor(parcelable);
          }
          this.setLabelTextSize(p0.getFloat("key_text_size_state", this.d));
          int[] intArray = p0.getIntArray("key_padding_state");
          if (intArray != null && intArray.length == 4) {
             int i = 0;
             int i1 = intArray[i];
             int i2 = intArray[1];
             int i3 = intArray[2];
             int i4 = intArray[3];
             if (PatchProxy.isSupport(CommentLabelsView.class) && (!PatchProxy.applyVoidFourRefs(Integer.valueOf(i1), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), this, CommentLabelsView.class, "11") && (this.f == i1 && (this.g == i2 && (this.h != i3 || this.i != i4))))) {
                this.f = i1;
                this.g = i2;
                this.h = i3;
                this.i = i4;
                int childCount = this.getChildCount();
                for (; i < childCount; i = i + 1) {
                   this.getChildAt(i).setPadding(i1, i2, i3, i4);
                }
             }
          }
          this.setWordMargin(p0.getInt("key_word_margin_state", this.j));
          return;
       }else {
          super.onRestoreInstanceState(p0);
          return;
       }
    }
    public Parcelable onSaveInstanceState(){
       Bundle obj = PatchProxy.apply(null, this, CommentLabelsView.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Bundle();
       obj.putParcelable("key_super_state", super.onSaveInstanceState());
       CommentLabelsView tc = this.c;
       if (tc != null) {
          obj.putParcelable("key_text_color_state", tc);
       }
       obj.putFloat("key_text_size_state", this.d);
       int[] ointArray = new int[]{this.f,this.g,this.h,this.i};
       obj.putIntArray("key_padding_state", ointArray);
       obj.putInt("key_word_margin_state", this.j);
       return obj;
    }
    public void setLabelBackground(int p0){
       if (PatchProxy.isSupport(CommentLabelsView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, CommentLabelsView.class, "4")) {
          return;
       }
       this.e = this.getResources().getDrawable(p0);
       return;
    }
    public final void setLabelTextColor(ColorStateList p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CommentLabelsView.class, "13")) {
          return;
       }
       this.c = p0;
       int childCount = this.getChildCount();
       for (int i = 0; i < childCount; i = i + 1) {
          this.getChildAt(i).setTextColor(this.c);
       }
       return;
    }
    public void setLabelTextSize(float p0){
       if (PatchProxy.isSupport(CommentLabelsView.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, CommentLabelsView.class, "12")) {
          return;
       }
       if (this.d - p0) {
          this.d = p0;
          int childCount = this.getChildCount();
          for (int i = 0; i < childCount; i = i + 1) {
             this.getChildAt(i).setTextSize(0, p0);
          }
       }
       return;
    }
    public void setLabels(List p0){
       PatchProxyResult patchProxyRe1;
       Object obj3;
       Object obj = this;
       Object obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, CommentLabelsView.class, "5")) {
          return;
       }
       int i = 8;
       if (q.f(p0)) {
          obj.setVisibility(i);
          return;
       }else {
          obj.setVisibility(0);
          int i1 = p0.size();
          int childCount = this.getChildCount();
          Object[] objArray = null;
          while (childCount < i1) {
             if (!PatchProxy.applyVoid(objArray, obj, CommentLabelsView.class, "9")) {
                obj.addView(new TextView(obj.b), -2, -1);
             }
             childCount = childCount + 1;
          }
          int i2 = 0;
          while (i2 < i1) {
             View childAt = obj.getChildAt(i2);
             Object obj2 = obj1.get(i2);
             childCount = i1 - 1;
             boolean b = (i2 == childCount)? true: false;
             PatchProxyResult patchProxyRe = PatchProxyResult.class;
             if (PatchProxy.isSupport(CommentLabelsView.class)) {
                patchProxyRe1 = patchProxyRe;
                obj3 = obj2;
                if (PatchProxy.applyVoidFourRefs(childAt, obj2, Integer.valueOf(i2), Boolean.valueOf(b), this, CommentLabelsView.class, "6")) {
                label_013d :
                   i2 = i2 + 1;
                   patchProxyRe1 = null;
                }
             }else {
                patchProxyRe1 = patchProxyRe;
                obj3 = obj2;
             }
             View view = childAt;
             view.setVisibility(0);
             view.setGravity(17);
             view.setPadding(obj.f, obj.g, obj.h, obj.i);
             view.setTextSize(0, obj.d);
             ColorStateList uColorStateL = PatchProxy.applyOneRefs(obj3, obj, CommentLabelsView.class, "7");
             if (uColorStateL != patchProxyRe1) {
             }else {
                try{
                   QComment$Label mLabelColor = obj3.mLabelColor;
                   if (mLabelColor != null) {
                      uColorStateL = ColorStateList.valueOf(mLabelColor);
                   }
                }catch(java.lang.Exception e0){
                   e0.printStackTrace();
                }
                uColorStateL = null;
             }
             if (uColorStateL == null) {
                uColorStateL = obj.c;
                if (uColorStateL == null) {
                   uColorStateL = a.c(this.getContext(), R.color.arg_RES_7f060751);
                }
             }
             view.setTextColor(uColorStateL);
             GradientDrawable gradientDraw = PatchProxy.applyOneRefs(obj3, obj, CommentLabelsView.class, "8");
             if (gradientDraw != patchProxyRe1) {
             }else {
                gradientDraw = new GradientDrawable();
                gradientDraw.setCornerRadius((float)a1.d(R.dimen.arg_RES_7f070426));
                gradientDraw.setColor(obj3.mLabelBackgroundColor);
             }
             Drawable uDrawable = (gradientDraw != null)? gradientDraw.getConstantState().newDrawable(): obj.e.getConstantState().newDrawable();
             view.setBackground(uDrawable);
             LinearLayout$LayoutParams layoutParams = childAt.getLayoutParams();
             int i3 = (b)? 0: obj.j;
             layoutParams.rightMargin = i3;
             childAt.setLayoutParams(layoutParams);
             view.setTag(CommentLabelsView.l, obj3);
             view.setTag(CommentLabelsView.m, Integer.valueOf(i2));
             view.setOnClickListener(obj);
             view.setText(obj3.mLabelName);
             view.getPaint().setFakeBoldText(true);
             goto label_013d ;
          }
          for (; i1 < this.getChildCount(); i1 = i1 + 1) {
             obj.getChildAt(i1).setVisibility(8);
          }
          return;
       }
    }
    public void setOnLabelClickListener(CommentLabelsView$a p0){
       this.k = p0;
    }
    public void setTextColor(ColorStateList p0){
       this.c = p0;
    }
    public void setTextPaddingBottom(int p0){
       this.i = p0;
    }
    public void setTextPaddingLeft(int p0){
       this.f = p0;
    }
    public void setTextPaddingRight(int p0){
       this.h = p0;
    }
    public void setTextSize(float p0){
       this.d = p0;
    }
    public void setWordMargin(int p0){
       CommentLabelsView tj;
       if (PatchProxy.isSupport(CommentLabelsView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, CommentLabelsView.class, "14")) {
          return;
       }
       if (this.j != p0) {
          this.j = p0;
          p0 = this.getChildCount();
          for (int i = 0; i < p0; i = i + 1) {
             TextView childAt = this.getChildAt(i);
             LinearLayout$LayoutParams layoutParams = childAt.getLayoutParams();
             int i1 = p0 - 1;
             i1 = (i == i1)? 0: this.j;
             layoutParams.rightMargin = i1;
             childAt.setLayoutParams(layoutParams);
          }
       }
       return;
    }
}
