package com.google.android.material.chip.ChipGroup;
import com.google.android.material.internal.FlowLayout;
import android.content.Context;
import android.util.AttributeSet;
import com.google.android.material.chip.ChipGroup$b;
import com.google.android.material.chip.ChipGroup$a;
import com.google.android.material.chip.ChipGroup$d;
import ll8.c$b;
import android.content.res.TypedArray;
import ck.k;
import android.view.ViewGroup$OnHierarchyChangeListener;
import android.view.ViewGroup;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import com.google.android.material.chip.Chip;
import android.widget.CheckBox;
import com.google.android.material.chip.ChipGroup$LayoutParams;
import com.google.android.material.chip.ChipGroup$c;
import android.content.res.Resources;
import cw9.c;
import android.graphics.drawable.Drawable;
import java.lang.UnsupportedOperationException;
import java.lang.String;

public class ChipGroup extends FlowLayout	// class@001675
{
    public int e;
    public int f;
    public boolean g;
    public ChipGroup$c h;
    public final ChipGroup$b i;
    public ChipGroup$d j;
    public int k;
    public boolean l;

    public void ChipGroup(Context p0){
       super(p0, null);
    }
    public void ChipGroup(Context p0,AttributeSet p1){
       super(p0, p1, 0x7f0401c5);
    }
    public void ChipGroup(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.i = new ChipGroup$b(this, null);
       this.j = new ChipGroup$d(this, null);
       this.k = -1;
       this.l = false;
       int[] ointArray = new int[false];
       TypedArray typedArray = k.h(p0, p1, c$b.K, p2, R.style.arg_RES_7f1104d7, ointArray);
       int dimensionPix = typedArray.getDimensionPixelOffset(1, false);
       this.setChipSpacingHorizontal(typedArray.getDimensionPixelOffset(2, dimensionPix));
       this.setChipSpacingVertical(typedArray.getDimensionPixelOffset(3, dimensionPix));
       this.setSingleLine(typedArray.getBoolean(4, false));
       this.setSingleSelection(typedArray.getBoolean(5, false));
       dimensionPix = typedArray.getResourceId(false, -1);
       if (dimensionPix != -1) {
          this.k = dimensionPix;
       }
       typedArray.recycle();
       super.setOnHierarchyChangeListener(this.j);
       return;
    }
    public void addView(View p0,int p1,ViewGroup$LayoutParams p2){
       if (p0 instanceof Chip) {
          CheckBox uCheckBox = p0;
          if (uCheckBox.isChecked()) {
             ChipGroup tk = this.k;
             if (tk != -1 && this.g != null) {
                this.e(tk, false);
             }
             this.setCheckedId(uCheckBox.getId());
          }
       }
       super.addView(p0, p1, p2);
       return;
    }
    public boolean checkLayoutParams(ViewGroup$LayoutParams p0){
       boolean b = (super.checkLayoutParams(p0) && p0 instanceof ChipGroup$LayoutParams)? true: false;
       return b;
    }
    public void d(){
       this.l = true;
       boolean b = false;
       int i = 0;
       while (i < this.getChildCount()) {
          View childAt = this.getChildAt(i);
          if (childAt instanceof Chip) {
             childAt.setChecked(b);
          }
          i = i + 1;
       }
       this.l = b;
       this.setCheckedId(-1);
       return;
    }
    public void e(int p0,boolean p1){
       View view = this.findViewById(p0);
       if (view instanceof Chip) {
          this.l = true;
          view.setChecked(p1);
          this.l = false;
       }
       return;
    }
    public ViewGroup$LayoutParams generateDefaultLayoutParams(){
       return new ChipGroup$LayoutParams(-2, -2);
    }
    public ViewGroup$LayoutParams generateLayoutParams(AttributeSet p0){
       return new ChipGroup$LayoutParams(this.getContext(), p0);
    }
    public ViewGroup$LayoutParams generateLayoutParams(ViewGroup$LayoutParams p0){
       return new ChipGroup$LayoutParams(p0);
    }
    public int getCheckedChipId(){
       ChipGroup tk = (this.g != null)? this.k: -1;
       return tk;
    }
    public int getChipSpacingHorizontal(){
       return this.e;
    }
    public int getChipSpacingVertical(){
       return this.f;
    }
    public void onFinishInflate(){
       super.onFinishInflate();
       ChipGroup tk = this.k;
       if (tk != -1) {
          this.e(tk, true);
          this.setCheckedId(this.k);
       }
       return;
    }
    public void setCheckedId(int p0){
       this.k = p0;
       ChipGroup th = this.h;
       if (th != null && this.g != null) {
          th.a(this, p0);
       }
       return;
    }
    public void setChipSpacing(int p0){
       this.setChipSpacingHorizontal(p0);
       this.setChipSpacingVertical(p0);
    }
    public void setChipSpacingHorizontal(int p0){
       if (this.e != p0) {
          this.e = p0;
          this.setItemSpacing(p0);
          this.requestLayout();
       }
       return;
    }
    public void setChipSpacingHorizontalResource(int p0){
       this.setChipSpacingHorizontal(c.a(this.getResources(), p0));
    }
    public void setChipSpacingResource(int p0){
       this.setChipSpacing(c.a(this.getResources(), p0));
    }
    public void setChipSpacingVertical(int p0){
       if (this.f != p0) {
          this.f = p0;
          this.setLineSpacing(p0);
          this.requestLayout();
       }
       return;
    }
    public void setChipSpacingVerticalResource(int p0){
       this.setChipSpacingVertical(c.a(this.getResources(), p0));
    }
    public void setDividerDrawableHorizontal(Drawable p0){
       throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }
    public void setDividerDrawableVertical(Drawable p0){
       throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }
    public void setFlexWrap(int p0){
       throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }
    public void setOnCheckedChangeListener(ChipGroup$c p0){
       this.h = p0;
    }
    public void setOnHierarchyChangeListener(ViewGroup$OnHierarchyChangeListener p0){
       this.j.b = p0;
    }
    public void setShowDividerHorizontal(int p0){
       throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }
    public void setShowDividerVertical(int p0){
       throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }
    public void setSingleLine(int p0){
       this.setSingleLine(this.getResources().getBoolean(p0));
    }
    public void setSingleSelection(int p0){
       this.setSingleSelection(this.getResources().getBoolean(p0));
    }
    public void setSingleSelection(boolean p0){
       if (this.g != p0) {
          this.g = p0;
          this.d();
       }
       return;
    }
}
