package com.google.android.material.navigation.NavigationView;
import com.google.android.material.internal.ScrimInsetsFrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import ck.g;
import ck.f;
import ll8.c$b;
import w0.x;
import ck.k;
import android.graphics.drawable.Drawable;
import android.view.View;
import a2.i0;
import android.content.res.ColorStateList;
import com.google.android.material.navigation.NavigationView$a;
import androidx.appcompat.view.menu.e$a;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.k;
import android.widget.FrameLayout;
import a2.u0;
import android.util.TypedValue;
import android.content.res.Resources$Theme;
import r0.a;
import android.view.MenuInflater;
import android.view.Menu;
import android.view.MenuItem;
import androidx.appcompat.view.menu.h;
import u0.g;
import android.view.View$MeasureSpec;
import java.lang.Math;
import android.os.Parcelable;
import com.google.android.material.navigation.NavigationView$SavedState;
import androidx.customview.view.AbsSavedState;
import android.os.Bundle;
import java.lang.IllegalArgumentException;
import java.lang.String;
import androidx.core.content.ContextCompat;
import android.content.res.Resources;
import cw9.c;
import com.google.android.material.navigation.NavigationView$b;

public class NavigationView extends ScrimInsetsFrameLayout	// class@0016a9
{
    public final f e;
    public final g f;
    public NavigationView$b g;
    public final int h;
    public MenuInflater i;
    public static final int[] j;
    public static final int[] k;

    static {
       int[] ointArray = new int[]{0x10100a0};
       NavigationView.j = ointArray;
       int[] ointArray1 = new int[]{-16842910};
       NavigationView.k = ointArray1;
    }
    public void NavigationView(Context p0){
       super(p0, null);
    }
    public void NavigationView(Context p0,AttributeSet p1){
       super(p0, p1, 0x7f04063d);
    }
    public void NavigationView(Context p0,AttributeSet p1,int p2){
       int i2;
       super(p0, p1, p2);
       g og = new g();
       this.f = og;
       f uof = new f(p0);
       this.e = uof;
       int[] ointArray = new int[0];
       x ox = k.i(p0, p1, c$b.G3, p2, R.style.arg_RES_7f1104be, ointArray);
       i0.v0(this, ox.g(0));
       p2 = 3;
       if (ox.s(p2)) {
          i0.A0(this, (float)ox.f(p2, 0));
       }
       p2 = 1;
       i0.B0(this, ox.a(p2, 0));
       this.h = ox.f(2, 0);
       int i = 8;
       ColorStateList uColorStateL = (ox.s(i))? ox.c(i): this.b(0x1010038);
       int i1 = 9;
       if (ox.s(i1)) {
          i1 = ox.n(i1, 0);
          i2 = 1;
       }else {
          i1 = 0;
          i2 = 0;
       }
       ColorStateList uColorStateL1 = null;
       int i3 = 10;
       if (ox.s(i3)) {
          uColorStateL1 = ox.c(i3);
       }
       if (!i2 && uColorStateL1 == null) {
          uColorStateL1 = this.b(0x1010036);
       }
       Drawable uDrawable = ox.g(5);
       int i4 = 6;
       if (ox.s(i4)) {
          og.y(ox.f(i4, 0));
       }
       i4 = ox.f(7, 0);
       uof.V(new NavigationView$a(this));
       og.w(p2);
       og.k(p0, uof);
       og.A(uColorStateL);
       if (i2) {
          og.B(i1);
       }
       og.C(uColorStateL1);
       og.x(uDrawable);
       og.z(i4);
       uof.b(og);
       this.addView(og.m(this));
       int i5 = 11;
       if (ox.s(i5)) {
          this.d(ox.n(i5, 0));
       }
       i5 = 4;
       if (ox.s(i5)) {
          this.c(ox.n(i5, 0));
       }
       ox.w();
       return;
    }
    public void a(u0 p0){
       this.f.i(p0);
    }
    public final ColorStateList b(int p0){
       int[] k;
       TypedValue typedValue = new TypedValue();
       ColorStateList uColorStateL = null;
       if (!this.getContext().getTheme().resolveAttribute(p0, typedValue, true)) {
          return uColorStateL;
       }
       ColorStateList uColorStateL1 = a.c(this.getContext(), typedValue.resourceId);
       if (!this.getContext().getTheme().resolveAttribute(0x7f04021c, typedValue, true)) {
          return uColorStateL;
       }
       int defaultColor = uColorStateL1.getDefaultColor();
       int[][] ointArray = new int[][3]{k,NavigationView.j,FrameLayout.EMPTY_STATE_SET};
       k = NavigationView.k;
       int[] ointArray1 = new int[]{uColorStateL1.getColorForState(k, defaultColor),typedValue.data,defaultColor};
       return new ColorStateList(ointArray, ointArray1);
    }
    public View c(int p0){
       return this.f.u(p0);
    }
    public void d(int p0){
       this.f.D(true);
       this.getMenuInflater().inflate(p0, this.e);
       this.f.D(false);
       this.f.e(false);
    }
    public MenuItem getCheckedItem(){
       return this.f.n();
    }
    public int getHeaderCount(){
       return this.f.o();
    }
    public Drawable getItemBackground(){
       return this.f.p();
    }
    public int getItemHorizontalPadding(){
       return this.f.q();
    }
    public int getItemIconPadding(){
       return this.f.r();
    }
    public ColorStateList getItemIconTintList(){
       return this.f.t();
    }
    public ColorStateList getItemTextColor(){
       return this.f.s();
    }
    public Menu getMenu(){
       return this.e;
    }
    public final MenuInflater getMenuInflater(){
       if (this.i == null) {
          this.i = new g(this.getContext());
       }
       return this.i;
    }
    public void onMeasure(int p0,int p1){
       int mode = View$MeasureSpec.getMode(p0);
       if (mode != Integer.MIN_VALUE) {
          if (!mode) {
             p0 = View$MeasureSpec.makeMeasureSpec(this.h, 0x40000000);
          }
       }else {
          p0 = View$MeasureSpec.makeMeasureSpec(Math.min(View$MeasureSpec.getSize(p0), this.h), 0x40000000);
       }
       super.onMeasure(p0, p1);
       return;
    }
    public void onRestoreInstanceState(Parcelable p0){
       if (!p0 instanceof NavigationView$SavedState) {
          super.onRestoreInstanceState(p0);
          return;
       }else {
          super.onRestoreInstanceState(p0.a());
          this.e.S(p0.d);
          return;
       }
    }
    public Parcelable onSaveInstanceState(){
       NavigationView$SavedState savedState = new NavigationView$SavedState(super.onSaveInstanceState());
       Bundle uBundle = new Bundle();
       savedState.d = uBundle;
       this.e.U(uBundle);
       return savedState;
    }
    public void setCheckedItem(int p0){
       MenuItem menuItem = this.e.findItem(p0);
       if (menuItem != null) {
          this.f.v(menuItem);
       }
       return;
    }
    public void setCheckedItem(MenuItem p0){
       p0 = this.e.findItem(p0.getItemId());
       if (p0 == null) {
          throw new IllegalArgumentException("Called setCheckedItem\(MenuItem\) with an item that is not in the current menu.");
       }
       this.f.v(p0);
       return;
    }
    public void setItemBackground(Drawable p0){
       this.f.x(p0);
    }
    public void setItemBackgroundResource(int p0){
       this.setItemBackground(ContextCompat.getDrawable(this.getContext(), p0));
    }
    public void setItemHorizontalPadding(int p0){
       this.f.y(p0);
    }
    public void setItemHorizontalPaddingResource(int p0){
       this.f.y(c.b(this.getResources(), p0));
    }
    public void setItemIconPadding(int p0){
       this.f.z(p0);
    }
    public void setItemIconPaddingResource(int p0){
       this.f.z(c.b(this.getResources(), p0));
    }
    public void setItemIconTintList(ColorStateList p0){
       this.f.A(p0);
    }
    public void setItemTextAppearance(int p0){
       this.f.B(p0);
    }
    public void setItemTextColor(ColorStateList p0){
       this.f.C(p0);
    }
    public void setNavigationItemSelectedListener(NavigationView$b p0){
       this.g = p0;
    }
}
