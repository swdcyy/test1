package com.kwai.library.widget.textview.LabelsView;
import android.view.View$OnClickListener;
import android.view.ViewGroup;
import android.content.Context;
import java.util.ArrayList;
import android.util.AttributeSet;
import ll8.c$b;
import android.content.res.TypedArray;
import com.kwai.library.widget.textview.LabelsView$SelectType;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import cw9.c;
import android.util.TypedValue;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import java.lang.Object;
import java.lang.Integer;
import com.kwai.library.widget.textview.LabelsView$d;
import java.util.List;
import com.kwai.library.widget.textview.LabelsView$c;
import java.lang.Math;
import android.view.View$MeasureSpec;
import android.os.Parcelable;
import android.os.Bundle;
import java.lang.String;
import java.util.Collection;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable$ConstantState;
import java.util.Iterator;
import com.kwai.library.widget.textview.LabelsView$a;
import com.kwai.library.widget.textview.d;
import h27.e;
import java.lang.CharSequence;

public class LabelsView extends ViewGroup implements View$OnClickListener	// class@000a5a
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
    public int k;
    public LabelsView$SelectType l;
    public int m;
    public ArrayList n;
    public ArrayList o;
    public ArrayList p;
    public LabelsView$c q;
    public LabelsView$d r;
    public static final int s = 2131377392;
    public static final int t = 2131377393;

    public void LabelsView(Context p0){
       super(p0);
       this.n = new ArrayList();
       this.o = new ArrayList();
       this.p = new ArrayList();
       this.b = p0;
    }
    public void LabelsView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.n = new ArrayList();
       this.o = new ArrayList();
       this.p = new ArrayList();
       this.b = p0;
       this.a(p0, p1);
    }
    public void LabelsView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.n = new ArrayList();
       this.o = new ArrayList();
       this.p = new ArrayList();
       this.b = p0;
       this.a(p0, p1);
    }
    public final void a(Context p0,AttributeSet p1){
       if (p1 != null) {
          TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.p6);
          this.l = LabelsView$SelectType.get(typedArray.getInt(9, 1));
          this.m = typedArray.getInteger(8, 0);
          this.c = typedArray.getColorStateList(1);
          this.d = typedArray.getDimension(6, (float)(int)TypedValue.applyDimension(2, 14.00f, c.c(p0.getResources())));
          this.f = typedArray.getDimensionPixelOffset(3, 0);
          this.g = typedArray.getDimensionPixelOffset(5, 0);
          this.h = typedArray.getDimensionPixelOffset(4, 0);
          this.i = typedArray.getDimensionPixelOffset(2, 0);
          this.k = typedArray.getDimensionPixelOffset(7, 0);
          this.j = typedArray.getDimensionPixelOffset(10, 0);
          this.e = this.getResources().getDrawable(typedArray.getResourceId(0, 0));
          typedArray.recycle();
       }
       return;
    }
    public final void b(){
       int childCount = this.getChildCount();
       for (int i = 0; i < childCount; i = i + 1) {
          this.c(this.getChildAt(i), false);
       }
       this.o.clear();
       return;
    }
    public final void c(TextView p0,boolean p1){
       if (p0.isSelected() != p1) {
          p0.setSelected(p1);
          if (p1) {
             this.o.add(p0.getTag(LabelsView.t));
          }else {
             this.o.remove(p0.getTag(LabelsView.t));
          }
          LabelsView tr = this.r;
          if (tr != null) {
             tr.a(p0, p0.getTag(LabelsView.s), p1, p0.getTag(LabelsView.t).intValue());
          }
       }
       return;
    }
    public List getCompulsorys(){
       return this.p;
    }
    public ColorStateList getLabelTextColor(){
       return this.c;
    }
    public float getLabelTextSize(){
       return this.d;
    }
    public List getLabels(){
       return this.n;
    }
    public int getLineMargin(){
       return this.k;
    }
    public int getMaxSelect(){
       return this.m;
    }
    public List getSelectLabelDatas(){
       ArrayList uArrayList = new ArrayList();
       int i = this.o.size();
       int i1 = 0;
       while (i1 < i) {
          Object tag = this.getChildAt(this.o.get(i1).intValue()).getTag(LabelsView.s);
          if (tag != null) {
             uArrayList.add(tag);
          }
          i1 = i1 + 1;
       }
       return uArrayList;
    }
    public List getSelectLabels(){
       return this.o;
    }
    public LabelsView$SelectType getSelectType(){
       return this.l;
    }
    public int getTextPaddingBottom(){
       return this.i;
    }
    public int getTextPaddingLeft(){
       return this.f;
    }
    public int getTextPaddingRight(){
       return this.h;
    }
    public int getTextPaddingTop(){
       return this.g;
    }
    public int getWordMargin(){
       return this.j;
    }
    public void onClick(View p0){
       LabelsView tq;
       if (p0 instanceof TextView) {
          if (this.l != LabelsView$SelectType.NONE) {
             if (p0.isSelected()) {
                if (this.l != LabelsView$SelectType.SINGLE_IRREVOCABLY && !this.p.contains(p0.getTag(LabelsView.t))) {
                   this.c(p0, false);
                }
             }else {
                tq = this.l;
                boolean b = true;
                if (tq == LabelsView$SelectType.SINGLE || tq == LabelsView$SelectType.SINGLE_IRREVOCABLY) {
                   this.b();
                   this.c(p0, b);
                }else if(tq == LabelsView$SelectType.MULTI){
                   tq = this.m;
                   if (tq <= null || tq > this.o.size()) {
                      this.c(p0, b);
                   }
                }
             }
          }
          tq = this.q;
          if (tq != null) {
             tq.a(p0, p0.getTag(LabelsView.s), p0.getTag(LabelsView.t).intValue());
          }
       }
       return;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       int paddingLeft = this.getPaddingLeft();
       p2 = this.getPaddingTop();
       p3 = p3 - p1;
       p1 = this.getChildCount();
       int i1 = 0;
       for (int i = 0; i < p1; i = i + 1) {
          View childAt = this.getChildAt(i);
          int i2 = childAt.getMeasuredWidth() + paddingLeft;
          i2 = i2 + this.getPaddingRight();
          if (p3 < i2) {
             paddingLeft = this.getPaddingLeft();
             p2 = p2 + this.k;
             p2 = p2 + i1;
             i1 = 0;
          }
          i2 = childAt.getMeasuredWidth() + paddingLeft;
          int i3 = childAt.getMeasuredHeight() + p2;
          childAt.layout(paddingLeft, p2, i2, i3);
          paddingLeft = paddingLeft + childAt.getMeasuredWidth();
          paddingLeft = paddingLeft + this.j;
          i1 = Math.max(i1, childAt.getMeasuredHeight());
       }
       return;
    }
    public void onMeasure(int p0,int p1){
       int childCount = this.getChildCount();
       int i = (View$MeasureSpec.getSize(p0) - this.getPaddingLeft()) - this.getPaddingRight();
       int i2 = 0;
       int i3 = 0;
       int i4 = 0;
       int i5 = 0;
       LabelsView labelsView = 1;
       for (int i1 = 0; i1 < childCount; i1 = i1 + 1) {
          View childAt = this.getChildAt(i1);
          this.measureChild(childAt, p0, p1);
          if (labelsView == null) {
             i5 = i5 + this.j;
          }else {
             labelsView = null;
          }
          int i6 = childAt.getMeasuredWidth() + i5;
          if (i <= i6) {
             i2 = i2 + this.k;
             i2 = i2 + i3;
             i4 = Math.max(i4, i5);
             i3 = 0;
             i5 = 0;
             labelsView = 1;
          }
          i3 = Math.max(i3, childAt.getMeasuredHeight());
          i5 = i5 + childAt.getMeasuredWidth();
       }
       i2 = i2 + i3;
       childCount = Math.max(i4, i5);
       i = View$MeasureSpec.getMode(p0);
       p0 = View$MeasureSpec.getSize(p0);
       if (i != 0x40000000) {
          childCount = (childCount + this.getPaddingLeft()) + this.getPaddingRight();
          p0 = (i == Integer.MIN_VALUE)? Math.min(childCount, p0): childCount;
       }
    label_0072 :
       p0 = Math.max(p0, this.getSuggestedMinimumWidth());
       childCount = View$MeasureSpec.getMode(p1);
       p1 = View$MeasureSpec.getSize(p1);
       if (childCount != 0x40000000) {
          i2 = (i2 + this.getPaddingTop()) + this.getPaddingBottom();
          p1 = (childCount == Integer.MIN_VALUE)? Math.min(i2, p1): i2;
       }
    label_0097 :
       this.setMeasuredDimension(p0, Math.max(p1, this.getSuggestedMinimumHeight()));
       return;
    }
    public void onRestoreInstanceState(Parcelable p0){
       int i4;
       if (p0 instanceof Bundle) {
          super.onRestoreInstanceState(p0.getParcelable("key_super_state"));
          ColorStateList parcelable = p0.getParcelable("key_text_color_state");
          if (parcelable != null) {
             this.setLabelTextColor(parcelable);
          }
          this.setLabelTextSize(p0.getFloat("key_text_size_state", this.d));
          int[] intArray = p0.getIntArray("key_padding_state");
          int i = 0;
          if (intArray != null && intArray.length == 4) {
             int i1 = intArray[i];
             int i2 = intArray[1];
             int i3 = intArray[2];
             i4 = intArray[3];
             if (this.f == i1 && (this.g == i2 && (this.h != i3 || this.i != i4))) {
                this.f = i1;
                this.g = i2;
                this.h = i3;
                this.i = i4;
                int childCount = this.getChildCount();
                for (int i5 = 0; i5 < childCount; i5 = i5 + 1) {
                   this.getChildAt(i5).setPadding(i1, i2, i3, i4);
                }
             }
          }
          this.setWordMargin(p0.getInt("key_word_margin_state", this.j));
          this.setLineMargin(p0.getInt("key_line_margin_state", this.k));
          this.setSelectType(LabelsView$SelectType.get(p0.getInt("key_select_type_state", this.l.value)));
          this.setMaxSelect(p0.getInt("key_max_select_state", this.m));
          ArrayList integerArray = p0.getIntegerArrayList("key_select_compulsory_state");
          if (integerArray != null && !integerArray.isEmpty()) {
             this.setCompulsorys(integerArray);
          }
          ArrayList integerArray1 = p0.getIntegerArrayList("key_select_labels_state");
          if (integerArray1 != null && !integerArray1.isEmpty()) {
             i4 = integerArray1.size();
             int[] ointArray = new int[i4];
             for (; i < i4; i = i + 1) {
                ointArray[i] = integerArray1.get(i).intValue();
             }
             this.setSelects(ointArray);
          }
          return;
       }else {
          super.onRestoreInstanceState(p0);
          return;
       }
    }
    public Parcelable onSaveInstanceState(){
       Bundle uBundle = new Bundle();
       uBundle.putParcelable("key_super_state", super.onSaveInstanceState());
       LabelsView tc = this.c;
       if (tc != null) {
          uBundle.putParcelable("key_text_color_state", tc);
       }
       uBundle.putFloat("key_text_size_state", this.d);
       int[] ointArray = new int[]{this.f,this.g,this.h,this.i};
       uBundle.putIntArray("key_padding_state", ointArray);
       uBundle.putInt("key_word_margin_state", this.j);
       uBundle.putInt("key_line_margin_state", this.k);
       uBundle.putInt("key_select_type_state", this.l.value);
       uBundle.putInt("key_max_select_state", this.m);
       if (!this.o.isEmpty()) {
          uBundle.putIntegerArrayList("key_select_labels_state", this.o);
       }
       if (!this.p.isEmpty()) {
          uBundle.putIntegerArrayList("key_select_compulsory_state", this.p);
       }
       return uBundle;
    }
    public void setCompulsorys(List p0){
       if (this.l == LabelsView$SelectType.MULTI && p0 != null) {
          this.p.clear();
          this.p.addAll(p0);
          this.b();
          this.setSelects(p0);
       }
       return;
    }
    public void setCompulsorys(int[] p0){
       if (this.l == LabelsView$SelectType.MULTI && p0 != null) {
          ArrayList uArrayList = new ArrayList(p0.length);
          int len = p0.length;
          for (int i = 0; i < len; i = i + 1) {
             uArrayList.add(Integer.valueOf(p0[i]));
          }
          this.setCompulsorys(uArrayList);
       }
       return;
    }
    public void setLabelBackgroundColor(int p0){
       this.setLabelBackgroundDrawable(new ColorDrawable(p0));
    }
    public void setLabelBackgroundDrawable(Drawable p0){
       this.e = p0;
       int childCount = this.getChildCount();
       for (int i = 0; i < childCount; i = i + 1) {
          this.getChildAt(i).setBackgroundDrawable(this.e.getConstantState().newDrawable());
       }
       return;
    }
    public void setLabelBackgroundResource(int p0){
       this.setLabelBackgroundDrawable(this.getResources().getDrawable(p0));
    }
    public void setLabelTextColor(int p0){
       this.setLabelTextColor(ColorStateList.valueOf(p0));
    }
    public void setLabelTextColor(ColorStateList p0){
       this.c = p0;
       int childCount = this.getChildCount();
       for (int i = 0; i < childCount; i = i + 1) {
          TextView childAt = this.getChildAt(i);
          LabelsView tc = this.c;
          if (tc == null) {
             tc = ColorStateList.valueOf(0xff000000);
          }
          childAt.setTextColor(tc);
       }
       return;
    }
    public void setLabelTextSize(float p0){
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
       ColorStateList textColor;
       ArrayList uArrayList = new ArrayList();
       if (p0 != null) {
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             uArrayList.add(new LabelsView$a(this, iterator.next()));
          }
       }
       d a = d.a;
       this.b();
       this.removeAllViews();
       this.n.clear();
       this.n.addAll(uArrayList);
       int i = uArrayList.size();
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          e uoe = uArrayList.get(i1);
          TextView textView = new TextView(this.b);
          textView.setPadding(this.f, this.g, this.h, this.i);
          textView.setTextSize(0, this.d);
          if (uoe.getTextColor() != null) {
             textColor = uoe.getTextColor();
          }else {
             textColor = this.c;
             if (textColor == null) {
                textColor = ColorStateList.valueOf(0xff000000);
             }
          }
          textView.setTextColor(textColor);
          Drawable uDrawable = (uoe.a() != null)? uoe.a().getConstantState().newDrawable(): this.e.getConstantState().newDrawable();
          textView.setBackgroundDrawable(uDrawable);
          textView.setTag(LabelsView.s, uoe);
          textView.setTag(LabelsView.t, Integer.valueOf(i1));
          if (this.l != LabelsView$SelectType.NONE) {
             textView.setOnClickListener(this);
          }
          this.addView(textView);
          textView.setText(a.a(textView, i1, uoe));
       }
       if (this.l == LabelsView$SelectType.SINGLE_IRREVOCABLY) {
          int[] ointArray = new int[]{0};
          this.setSelects(ointArray);
       }
       return;
    }
    public void setLineMargin(int p0){
       if (this.k != p0) {
          this.k = p0;
          this.requestLayout();
       }
       return;
    }
    public void setMaxSelect(int p0){
       if (this.m != p0) {
          this.m = p0;
          if (this.l == LabelsView$SelectType.MULTI) {
             this.b();
          }
       }
       return;
    }
    public void setOnLabelClickListener(LabelsView$c p0){
       this.q = p0;
    }
    public void setOnLabelSelectChangeListener(LabelsView$d p0){
       this.r = p0;
    }
    public void setSelectType(LabelsView$SelectType p0){
       if (this.l != p0) {
          this.l = p0;
          this.b();
          if (this.l == LabelsView$SelectType.SINGLE_IRREVOCABLY) {
             int[] ointArray = new int[]{0};
             this.setSelects(ointArray);
          }
          if (this.l != LabelsView$SelectType.MULTI) {
             this.p.clear();
          }
       }
       return;
    }
    public void setSelects(List p0){
       if (p0 != null) {
          int i = p0.size();
          int[] ointArray = new int[i];
          for (int i1 = 0; i1 < i; i1 = i1 + 1) {
             ointArray[i1] = p0.get(i1).intValue();
          }
          this.setSelects(ointArray);
       }
       return;
    }
    public void setSelects(int[] p0){
       if (this.l != LabelsView$SelectType.NONE) {
          ArrayList uArrayList = new ArrayList();
          int childCount = this.getChildCount();
          LabelsView tl = this.l;
          tl = (tl == LabelsView$SelectType.SINGLE || tl == LabelsView$SelectType.SINGLE_IRREVOCABLY)? 1: this.m;
          int len = p0.length;
          int i = 0;
          while (i < len) {
             int i1 = p0[i];
             if (i1 < childCount) {
                TextView childAt = this.getChildAt(i1);
                if (!uArrayList.contains(childAt)) {
                   this.c(childAt, true);
                   uArrayList.add(childAt);
                }
                if (tl > null && uArrayList.size() == tl) {
                   break ;
                }
             }
          label_0043 :
             i = i + 1;
          }
          int i2 = 0;
          while (i2 < childCount) {
             TextView childAt1 = this.getChildAt(i2);
             if (!uArrayList.contains(childAt1)) {
                this.c(childAt1, false);
             }
             i2++;
          }
       }
       return;
    }
    public void setWordMargin(int p0){
       if (this.j != p0) {
          this.j = p0;
          this.requestLayout();
       }
       return;
    }
}
