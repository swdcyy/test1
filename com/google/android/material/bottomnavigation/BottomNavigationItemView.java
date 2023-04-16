package com.google.android.material.bottomnavigation.BottomNavigationItemView;
import androidx.appcompat.view.menu.k$a;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import ag6.a;
import cw9.c;
import android.widget.ImageView;
import android.widget.TextView;
import a2.i0;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import androidx.appcompat.view.menu.h;
import android.graphics.drawable.Drawable;
import java.lang.CharSequence;
import android.text.TextUtils;
import w0.y;
import a2.d0;
import android.graphics.drawable.Drawable$ConstantState;
import androidx.core.graphics.drawable.a;
import android.content.res.ColorStateList;
import androidx.core.content.ContextCompat;
import androidx.core.widget.b;

public class BottomNavigationItemView extends FrameLayout implements k$a	// class@001645
{
    public final int b;
    public float c;
    public float d;
    public float e;
    public int f;
    public boolean g;
    public ImageView h;
    public final TextView i;
    public final TextView j;
    public int k;
    public h l;
    public ColorStateList m;
    public static final int[] n;

    static {
       int[] ointArray = new int[]{0x10100a0};
       BottomNavigationItemView.n = ointArray;
    }
    public void BottomNavigationItemView(Context p0){
       super(p0, null);
    }
    public void BottomNavigationItemView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void BottomNavigationItemView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.k = -1;
       a.c(LayoutInflater.from(p0), R.layout.arg_RES_7f0d0257, this, true);
       this.setBackgroundResource(R.drawable.arg_RES_7f08068a);
       this.b = c.b(this.getResources(), 0x7f0701a5);
       this.h = this.findViewById(0x7f0a130c);
       TextView textView = this.findViewById(R.id.smallLabel);
       this.i = textView;
       TextView textView1 = this.findViewById(R.id.largeLabel);
       this.j = textView1;
       i0.D0(textView, 2);
       i0.D0(textView1, 2);
       this.setFocusable(true);
       this.a(textView.getTextSize(), textView1.getTextSize());
    }
    public final void a(float p0,float p1){
       this.c = p0 - p1;
       this.d = (p1 * 0x3f800000) / p0;
       this.e = (p0 * 0x3f800000) / p1;
    }
    public final void b(View p0,int p1,int p2){
       FrameLayout$LayoutParams layoutParams = p0.getLayoutParams();
       layoutParams.topMargin = p1;
       layoutParams.gravity = p2;
       p0.setLayoutParams(layoutParams);
    }
    public final void c(View p0,float p1,float p2,int p3){
       p0.setScaleX(p1);
       p0.setScaleY(p2);
       p0.setVisibility(p3);
    }
    public boolean e(){
       return true;
    }
    public h getItemData(){
       return this.l;
    }
    public int getItemPosition(){
       return this.k;
    }
    public boolean i(){
       return false;
    }
    public void j(boolean p0,char p1){
    }
    public void k(h p0,int p1){
       this.l = p0;
       this.setCheckable(p0.isCheckable());
       this.setChecked(p0.isChecked());
       this.setEnabled(p0.isEnabled());
       this.setIcon(p0.getIcon());
       this.setTitle(p0.getTitle());
       this.setId(p0.getItemId());
       if (!TextUtils.isEmpty(p0.getContentDescription())) {
          this.setContentDescription(p0.getContentDescription());
       }
       y.a(this, p0.getTooltipText());
       int i = (p0.isVisible())? 0: 8;
       this.setVisibility(i);
       return;
    }
    public int[] onCreateDrawableState(int p0){
       p0++;
       int[] ointArray = super.onCreateDrawableState(p0);
       BottomNavigationItemView tl = this.l;
       if (tl != null && (tl.isCheckable() && this.l.isChecked())) {
          FrameLayout.mergeDrawableStates(ointArray, BottomNavigationItemView.n);
       }
    label_001d :
       return ointArray;
    }
    public void setCheckable(boolean p0){
       this.refreshDrawableState();
    }
    public void setChecked(boolean p0){
       BottomNavigationItemView tj = this.j;
       int i = 2;
       tj.setPivotX((float)(tj.getWidth() / i));
       tj = this.j;
       tj.setPivotY((float)tj.getBaseline());
       tj = this.i;
       tj.setPivotX((float)(tj.getWidth() / i));
       tj = this.i;
       tj.setPivotY((float)tj.getBaseline());
       tj = this.f;
       if (tj != -1) {
          if (tj != null) {
             if (tj != 1) {
                if (tj == i) {
                   this.b(this.h, this.b, 17);
                   this.j.setVisibility(8);
                   this.i.setVisibility(8);
                }
             }else if(p0){
                this.b(this.h, (int)((float)this.b + this.c), 49);
                this.c(this.j, 0x3f800000, 0x3f800000, 0);
                this.c(this.i, this.d, this.d, 4);
             }else {
                this.b(this.h, this.b, 49);
                this.c(this.j, this.e, this.e, 4);
                this.c(this.i, 0x3f800000, 0x3f800000, 0);
             }
          }else if(p0){
             this.b(this.h, this.b, 49);
             this.c(this.j, 0x3f800000, 0x3f800000, 0);
          }else {
             this.b(this.h, this.b, 17);
             this.c(this.j, 0x3f000000, 0x3f000000, 4);
          }
          this.i.setVisibility(4);
       }else if(this.g != null){
          if (p0) {
             this.b(this.h, this.b, 49);
             this.c(this.j, 0x3f800000, 0x3f800000, 0);
          }else {
             this.b(this.h, this.b, 17);
             this.c(this.j, 0x3f000000, 0x3f000000, 4);
          }
          this.i.setVisibility(4);
       }else if(p0){
          this.b(this.h, (int)((float)this.b + this.c), 49);
          this.c(this.j, 0x3f800000, 0x3f800000, 0);
          this.c(this.i, this.d, this.d, 4);
       }else {
          this.b(this.h, this.b, 49);
          this.c(this.j, this.e, this.e, 4);
          this.c(this.i, 0x3f800000, 0x3f800000, 0);
       }
       this.refreshDrawableState();
       this.setSelected(p0);
       return;
    }
    public void setEnabled(boolean p0){
       super.setEnabled(p0);
       this.i.setEnabled(p0);
       this.j.setEnabled(p0);
       this.h.setEnabled(p0);
       if (p0) {
          i0.K0(this, d0.b(this.getContext(), 1002));
       }else {
          i0.K0(this, null);
       }
       return;
    }
    public void setIcon(Drawable p0){
       if (p0 != null) {
          Drawable$ConstantState constantStat = p0.getConstantState();
          if (constantStat != null) {
             p0 = constantStat.newDrawable();
          }
          p0 = a.r(p0).mutate();
          a.o(p0, this.m);
       }
       this.h.setImageDrawable(p0);
       return;
    }
    public void setIconSize(int p0){
       FrameLayout$LayoutParams layoutParams = this.h.getLayoutParams();
       layoutParams.width = p0;
       layoutParams.height = p0;
       this.h.setLayoutParams(layoutParams);
    }
    public void setIconTintList(ColorStateList p0){
       this.m = p0;
       BottomNavigationItemView tl = this.l;
       if (tl != null) {
          this.setIcon(tl.getIcon());
       }
       return;
    }
    public void setItemBackground(int p0){
       Drawable uDrawable = (!p0)? null: ContextCompat.getDrawable(this.getContext(), p0);
       this.setItemBackground(uDrawable);
       return;
    }
    public void setItemBackground(Drawable p0){
       i0.v0(this, p0);
    }
    public void setItemPosition(int p0){
       this.k = p0;
    }
    public void setLabelVisibilityMode(int p0){
       if (this.f != p0) {
          this.f = p0;
          BottomNavigationItemView tl = this.l;
          int i = (tl != null)? 1: 0;
          if (i) {
             this.setChecked(tl.isChecked());
          }
       }
       return;
    }
    public void setShifting(boolean p0){
       if (this.g != p0) {
          this.g = p0;
          BottomNavigationItemView tl = this.l;
          int i = (tl != null)? 1: 0;
          if (i) {
             this.setChecked(tl.isChecked());
          }
       }
       return;
    }
    public void setTextAppearanceActive(int p0){
       b.r(this.j, p0);
       this.a(this.i.getTextSize(), this.j.getTextSize());
    }
    public void setTextAppearanceInactive(int p0){
       b.r(this.i, p0);
       this.a(this.i.getTextSize(), this.j.getTextSize());
    }
    public void setTextColor(ColorStateList p0){
       if (p0 != null) {
          this.i.setTextColor(p0);
          this.j.setTextColor(p0);
       }
       return;
    }
    public void setTitle(CharSequence p0){
       this.i.setText(p0);
       this.j.setText(p0);
       BottomNavigationItemView tl = this.l;
       if (tl == null || TextUtils.isEmpty(tl.getContentDescription())) {
          this.setContentDescription(p0);
       }
       return;
    }
}
