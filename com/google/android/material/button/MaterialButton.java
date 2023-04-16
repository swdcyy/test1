package com.google.android.material.button.MaterialButton;
import androidx.appcompat.widget.AppCompatButton;
import android.content.Context;
import android.util.AttributeSet;
import ll8.c$b;
import android.content.res.TypedArray;
import ck.k;
import android.graphics.PorterDuff$Mode;
import ck.l;
import android.widget.Button;
import android.content.res.ColorStateList;
import ek.a;
import android.graphics.drawable.Drawable;
import wj.b;
import android.view.View;
import a2.i0;
import androidx.core.graphics.drawable.a;
import android.widget.TextView;
import androidx.core.widget.b;
import android.graphics.Canvas;
import android.os.Build$VERSION;
import android.text.TextPaint;
import java.lang.CharSequence;
import java.lang.String;
import android.graphics.Paint;
import r0.a;
import android.content.res.Resources;
import cw9.c;
import java.lang.IllegalArgumentException;

public class MaterialButton extends AppCompatButton	// class@00166a
{
    public final b d;
    public int e;
    public PorterDuff$Mode f;
    public ColorStateList g;
    public Drawable h;
    public int i;
    public int j;
    public int k;

    public void MaterialButton(Context p0){
       super(p0, null);
    }
    public void MaterialButton(Context p0,AttributeSet p1){
       super(p0, p1, 0x7f0405f8);
    }
    public void MaterialButton(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       int[] ointArray = new int[0];
       TypedArray typedArray = k.h(p0, p1, c$b.f3, p2, R.style.arg_RES_7f1104c8, ointArray);
       this.e = typedArray.getDimensionPixelSize(9, 0);
       this.f = l.b(typedArray.getInt(12, -1), PorterDuff$Mode.SRC_IN);
       this.g = a.a(this.getContext(), typedArray, 11);
       this.h = a.b(this.getContext(), typedArray, 7);
       this.k = typedArray.getInteger(8, 1);
       this.i = typedArray.getDimensionPixelSize(10, 0);
       b uob = new b(this);
       this.d = uob;
       uob.j(typedArray);
       typedArray.recycle();
       this.setCompoundDrawablePadding(this.e);
       this.c();
    }
    public final boolean a(){
       boolean b = true;
       if (i0.B(this) == b) {
       }else {
          b = false;
       }
       return b;
    }
    public final boolean b(){
       MaterialButton td = this.d;
       boolean b = (td != null && !td.i())? true: false;
       return b;
    }
    public final void c(){
       MaterialButton th = this.h;
       if (th != null) {
          Drawable uDrawable = th.mutate();
          this.h = uDrawable;
          a.o(uDrawable, this.g);
          th = this.f;
          if (th != null) {
             a.p(this.h, th);
          }
          th = this.i;
          if (th == null) {
             int intrinsicWid = this.h.getIntrinsicWidth();
          }
          MaterialButton ti = this.i;
          if (ti == null) {
             ti = this.h.getIntrinsicHeight();
          }
          MaterialButton tj = this.j;
          this.h.setBounds(tj, 0, (th + tj), ti);
       }
       b.l(this, this.h, null, null, null);
       return;
    }
    public ColorStateList getBackgroundTintList(){
       return this.getSupportBackgroundTintList();
    }
    public PorterDuff$Mode getBackgroundTintMode(){
       return this.getSupportBackgroundTintMode();
    }
    public int getCornerRadius(){
       int i = (this.b())? this.d.c(): 0;
       return i;
    }
    public Drawable getIcon(){
       return this.h;
    }
    public int getIconGravity(){
       return this.k;
    }
    public int getIconPadding(){
       return this.e;
    }
    public int getIconSize(){
       return this.i;
    }
    public ColorStateList getIconTint(){
       return this.g;
    }
    public PorterDuff$Mode getIconTintMode(){
       return this.f;
    }
    public ColorStateList getRippleColor(){
       ColorStateList uColorStateL = (this.b())? this.d.d(): null;
       return uColorStateL;
    }
    public ColorStateList getStrokeColor(){
       ColorStateList uColorStateL = (this.b())? this.d.e(): null;
       return uColorStateL;
    }
    public int getStrokeWidth(){
       int i = (this.b())? this.d.f(): 0;
       return i;
    }
    public ColorStateList getSupportBackgroundTintList(){
       if (this.b()) {
          return this.d.g();
       }
       return super.getSupportBackgroundTintList();
    }
    public PorterDuff$Mode getSupportBackgroundTintMode(){
       if (this.b()) {
          return this.d.h();
       }
       return super.getSupportBackgroundTintMode();
    }
    public void onDraw(Canvas p0){
       super.onDraw(p0);
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       super.onLayout(p0, p1, p2, p3, p4);
       if (Build$VERSION.SDK_INT == 21) {
          MaterialButton td = this.d;
          if (td != null) {
             td.u((p4 - p2), (p3 - p1));
          }
       }
       return;
    }
    public void onMeasure(int p0,int p1){
       super.onMeasure(p0, p1);
       if (this.h != null && this.k == 2) {
          p0 = (int)this.getPaint().measureText(this.getText().toString());
          MaterialButton ti = this.i;
          if (ti == null) {
             ti = this.h.getIntrinsicWidth();
          }
          int i = (((((this.getMeasuredWidth() - p0) - i0.G(this)) - ti) - this.e) - i0.H(this)) / 2;
          if (this.a()) {
             i = - i;
          }
          if (this.j != i) {
             this.j = i;
             this.c();
          }
       }
    label_004c :
       return;
    }
    public void setBackground(Drawable p0){
       this.setBackgroundDrawable(p0);
    }
    public void setBackgroundColor(int p0){
       if (this.b()) {
          this.d.k(p0);
       }else {
          super.setBackgroundColor(p0);
       }
       return;
    }
    public void setBackgroundDrawable(Drawable p0){
       if (this.b()) {
          if (p0 != this.getBackground()) {
             this.d.l();
             super.setBackgroundDrawable(p0);
          }else {
             this.getBackground().setState(p0.getState());
          }
       }else {
          super.setBackgroundDrawable(p0);
       }
       return;
    }
    public void setBackgroundResource(int p0){
       Drawable uDrawable = (p0)? a.d(this.getContext(), p0): null;
       this.setBackgroundDrawable(uDrawable);
       return;
    }
    public void setBackgroundTintList(ColorStateList p0){
       this.setSupportBackgroundTintList(p0);
    }
    public void setBackgroundTintMode(PorterDuff$Mode p0){
       this.setSupportBackgroundTintMode(p0);
    }
    public void setCornerRadius(int p0){
       if (this.b()) {
          this.d.m(p0);
       }
       return;
    }
    public void setCornerRadiusResource(int p0){
       if (this.b()) {
          this.setCornerRadius(c.b(this.getResources(), p0));
       }
       return;
    }
    public void setIcon(Drawable p0){
       if (this.h != p0) {
          this.h = p0;
          this.c();
       }
       return;
    }
    public void setIconGravity(int p0){
       this.k = p0;
    }
    public void setIconPadding(int p0){
       if (this.e != p0) {
          this.e = p0;
          this.setCompoundDrawablePadding(p0);
       }
       return;
    }
    public void setIconResource(int p0){
       Drawable uDrawable = (p0)? a.d(this.getContext(), p0): null;
       this.setIcon(uDrawable);
       return;
    }
    public void setIconSize(int p0){
       if (p0 < 0) {
          throw new IllegalArgumentException("iconSize cannot be less than 0");
       }
       if (this.i != p0) {
          this.i = p0;
          this.c();
       }
       return;
    }
    public void setIconTint(ColorStateList p0){
       if (this.g != p0) {
          this.g = p0;
          this.c();
       }
       return;
    }
    public void setIconTintMode(PorterDuff$Mode p0){
       if (this.f != p0) {
          this.f = p0;
          this.c();
       }
       return;
    }
    public void setIconTintResource(int p0){
       this.setIconTint(a.c(this.getContext(), p0));
    }
    public void setInternalBackground(Drawable p0){
       super.setBackgroundDrawable(p0);
    }
    public void setRippleColor(ColorStateList p0){
       if (this.b()) {
          this.d.n(p0);
       }
       return;
    }
    public void setRippleColorResource(int p0){
       if (this.b()) {
          this.setRippleColor(a.c(this.getContext(), p0));
       }
       return;
    }
    public void setStrokeColor(ColorStateList p0){
       if (this.b()) {
          this.d.o(p0);
       }
       return;
    }
    public void setStrokeColorResource(int p0){
       if (this.b()) {
          this.setStrokeColor(a.c(this.getContext(), p0));
       }
       return;
    }
    public void setStrokeWidth(int p0){
       if (this.b()) {
          this.d.p(p0);
       }
       return;
    }
    public void setStrokeWidthResource(int p0){
       if (this.b()) {
          this.setStrokeWidth(c.b(this.getResources(), p0));
       }
       return;
    }
    public void setSupportBackgroundTintList(ColorStateList p0){
       if (this.b()) {
          this.d.q(p0);
       }else if(this.d != null){
          super.setSupportBackgroundTintList(p0);
       }
       return;
    }
    public void setSupportBackgroundTintMode(PorterDuff$Mode p0){
       if (this.b()) {
          this.d.r(p0);
       }else if(this.d != null){
          super.setSupportBackgroundTintMode(p0);
       }
       return;
    }
}
