package com.google.android.material.bottomnavigation.BottomNavigationView;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import com.google.android.material.bottomnavigation.BottomNavigationPresenter;
import uj.a;
import com.google.android.material.bottomnavigation.BottomNavigationMenuView;
import android.widget.FrameLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.e;
import ll8.c$b;
import w0.x;
import ck.k;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import cw9.c;
import android.view.View;
import a2.i0;
import com.google.android.material.bottomnavigation.BottomNavigationView$a;
import androidx.appcompat.view.menu.e$a;
import android.view.MenuInflater;
import android.view.Menu;
import android.graphics.drawable.Drawable;
import u0.g;
import android.os.Parcelable;
import com.google.android.material.bottomnavigation.BottomNavigationView$SavedState;
import androidx.customview.view.AbsSavedState;
import android.os.Bundle;
import com.google.android.material.bottomnavigation.BottomNavigationView$b;
import com.google.android.material.bottomnavigation.BottomNavigationView$c;
import android.view.MenuItem;

public class BottomNavigationView extends FrameLayout	// class@001650
{
    public final e b;
    public final BottomNavigationMenuView c;
    public final BottomNavigationPresenter d;
    public MenuInflater e;
    public BottomNavigationView$c f;
    public BottomNavigationView$b g;

    public void BottomNavigationView(Context p0){
       super(p0, null);
    }
    public void BottomNavigationView(Context p0,AttributeSet p1){
       super(p0, p1, 0x7f040169);
    }
    public void BottomNavigationView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       BottomNavigationPresenter uBottomNavig = new BottomNavigationPresenter();
       this.d = uBottomNavig;
       a uoa = new a(p0);
       this.b = uoa;
       BottomNavigationMenuView uBottomNavig1 = new BottomNavigationMenuView(p0);
       this.c = uBottomNavig1;
       FrameLayout$LayoutParams layoutParams = new FrameLayout$LayoutParams(-2, -2);
       layoutParams.gravity = 17;
       uBottomNavig1.setLayoutParams(layoutParams);
       uBottomNavig.d(uBottomNavig1);
       uBottomNavig.i(1);
       uBottomNavig1.setPresenter(uBottomNavig);
       uoa.b(uBottomNavig);
       uBottomNavig.k(this.getContext(), uoa);
       x ox = k.i(p0, p1, c$b.C, p2, R.style.arg_RES_7f1104ba, new int[2]{6,5});
       int i = 4;
       if (ox.s(i)) {
          uBottomNavig1.setIconTintList(ox.c(i));
       }else {
          uBottomNavig1.setIconTintList(uBottomNavig1.b(0x1010038));
       }
       this.setItemIconSize(ox.f(3, c.b(this.getResources(), R.dimen.arg_RES_7f0701a2)));
       i = 6;
       if (ox.s(i)) {
          this.setItemTextAppearanceInactive(ox.n(i, 0));
       }
       i = 5;
       if (ox.s(i)) {
          this.setItemTextAppearanceActive(ox.n(i, 0));
       }
       i = 7;
       if (ox.s(i)) {
          this.setItemTextColor(ox.c(i));
       }
       if (ox.s(0)) {
          i0.A0(this, (float)ox.f(0, 0));
       }
       this.setLabelVisibilityMode(ox.l(8, -1));
       this.setItemHorizontalTranslationEnabled(ox.a(2, 1));
       uBottomNavig1.setItemBackgroundRes(ox.n(1, 0));
       i = 9;
       if (ox.s(i)) {
          this.a(ox.n(i, 0));
       }
       ox.w();
       this.addView(uBottomNavig1, layoutParams);
       uoa.V(new BottomNavigationView$a(this));
       return;
    }
    public void a(int p0){
       this.d.n(true);
       this.getMenuInflater().inflate(p0, this.b);
       this.d.n(false);
       this.d.e(true);
    }
    public Drawable getItemBackground(){
       return this.c.getItemBackground();
    }
    public int getItemBackgroundResource(){
       return this.c.getItemBackgroundRes();
    }
    public int getItemIconSize(){
       return this.c.getItemIconSize();
    }
    public ColorStateList getItemIconTintList(){
       return this.c.getIconTintList();
    }
    public int getItemTextAppearanceActive(){
       return this.c.getItemTextAppearanceActive();
    }
    public int getItemTextAppearanceInactive(){
       return this.c.getItemTextAppearanceInactive();
    }
    public ColorStateList getItemTextColor(){
       return this.c.getItemTextColor();
    }
    public int getLabelVisibilityMode(){
       return this.c.getLabelVisibilityMode();
    }
    public int getMaxItemCount(){
       return 5;
    }
    public Menu getMenu(){
       return this.b;
    }
    public final MenuInflater getMenuInflater(){
       if (this.e == null) {
          this.e = new g(this.getContext());
       }
       return this.e;
    }
    public int getSelectedItemId(){
       return this.c.getSelectedItemId();
    }
    public void onRestoreInstanceState(Parcelable p0){
       if (!p0 instanceof BottomNavigationView$SavedState) {
          super.onRestoreInstanceState(p0);
          return;
       }else {
          super.onRestoreInstanceState(p0.a());
          this.b.S(p0.d);
          return;
       }
    }
    public Parcelable onSaveInstanceState(){
       BottomNavigationView$SavedState savedState = new BottomNavigationView$SavedState(super.onSaveInstanceState());
       Bundle uBundle = new Bundle();
       savedState.d = uBundle;
       this.b.U(uBundle);
       return savedState;
    }
    public void setItemBackground(Drawable p0){
       this.c.setItemBackground(p0);
    }
    public void setItemBackgroundResource(int p0){
       this.c.setItemBackgroundRes(p0);
    }
    public void setItemHorizontalTranslationEnabled(boolean p0){
       if (this.c.c() != p0) {
          this.c.setItemHorizontalTranslationEnabled(p0);
          this.d.e(false);
       }
       return;
    }
    public void setItemIconSize(int p0){
       this.c.setItemIconSize(p0);
    }
    public void setItemIconSizeRes(int p0){
       this.setItemIconSize(c.b(this.getResources(), p0));
    }
    public void setItemIconTintList(ColorStateList p0){
       this.c.setIconTintList(p0);
    }
    public void setItemTextAppearanceActive(int p0){
       this.c.setItemTextAppearanceActive(p0);
    }
    public void setItemTextAppearanceInactive(int p0){
       this.c.setItemTextAppearanceInactive(p0);
    }
    public void setItemTextColor(ColorStateList p0){
       this.c.setItemTextColor(p0);
    }
    public void setLabelVisibilityMode(int p0){
       if (this.c.getLabelVisibilityMode() != p0) {
          this.c.setLabelVisibilityMode(p0);
          this.d.e(false);
       }
       return;
    }
    public void setOnNavigationItemReselectedListener(BottomNavigationView$b p0){
       this.g = p0;
    }
    public void setOnNavigationItemSelectedListener(BottomNavigationView$c p0){
       this.f = p0;
    }
    public void setSelectedItemId(int p0){
       MenuItem menuItem = this.b.findItem(p0);
       if (menuItem != null && !this.b.O(menuItem, this.d, 0)) {
          menuItem.setChecked(true);
       }
       return;
    }
}
