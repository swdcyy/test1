package com.google.android.material.chip.Chip;
import com.google.android.material.chip.a$b;
import androidx.appcompat.widget.AppCompatCheckBox;
import android.graphics.Rect;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.RectF;
import com.google.android.material.chip.Chip$a;
import com.google.android.material.chip.a;
import com.google.android.material.chip.Chip$c;
import android.view.View;
import a2.a;
import a2.i0;
import java.lang.CharSequence;
import android.widget.CheckBox;
import android.text.TextUtils$TruncateAt;
import ek.b;
import android.view.MotionEvent;
import g2.a;
import android.view.KeyEvent;
import java.lang.String;
import java.lang.reflect.Field;
import java.lang.Class;
import java.lang.Object;
import java.lang.Integer;
import java.lang.reflect.Method;
import android.graphics.drawable.Drawable;
import android.content.res.ColorStateList;
import android.widget.TextView;
import rj.h;
import com.google.android.material.chip.Chip$b;
import android.view.ViewOutlineProvider;
import android.view.View$OnClickListener;
import android.text.TextUtils;
import android.text.TextPaint;
import o1.f$a;
import java.lang.UnsupportedOperationException;
import android.widget.CompoundButton;
import android.graphics.Canvas;
import ck.l;
import android.view.ViewParent;
import android.view.PointerIcon;
import android.graphics.PorterDuff$Mode;
import android.widget.CompoundButton$OnCheckedChangeListener;
import fk.a;
import android.graphics.drawable.RippleDrawable;
import android.content.res.Resources;
import android.widget.TextView$BufferType;
import y1.a;

public class Chip extends AppCompatCheckBox implements a$b	// class@00166f
{
    public a e;
    public RippleDrawable f;
    public View$OnClickListener g;
    public CompoundButton$OnCheckedChangeListener h;
    public boolean i;
    public int j;
    public boolean k;
    public boolean l;
    public boolean m;
    public final Chip$c n;
    public final Rect o;
    public final RectF p;
    public final f$a q;
    public static final Rect r;
    public static final int[] s;

    static {
       Chip.r = new Rect();
       int[] ointArray = new int[]{0x10100a1};
       Chip.s = ointArray;
    }
    public void Chip(Context p0){
       super(p0, null);
    }
    public void Chip(Context p0,AttributeSet p1){
       super(p0, p1, 0x7f0401d3);
    }
    public void Chip(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.j = Integer.MIN_VALUE;
       this.o = new Rect();
       this.p = new RectF();
       this.q = new Chip$a(this);
       this.n(p1);
       a uoa = a.m(p0, p1, p2, R.style.arg_RES_7f1104d3);
       this.setChipDrawable(uoa);
       Chip$c uoc = new Chip$c(this, this);
       this.n = uoc;
       i0.s0(this, uoc);
       this.h();
       this.setChecked(this.i);
       uoa.n1(false);
       this.setText(uoa.U());
       this.setEllipsize(uoa.O());
       this.setIncludeFontPadding(false);
       if (this.getTextAppearance() != null) {
          this.m(this.getTextAppearance());
       }
       this.setSingleLine();
       this.setGravity(0x800013);
       this.l();
       return;
    }
    public void a(){
       this.l();
       this.requestLayout();
       this.invalidateOutline();
    }
    public final void b(a p0){
       p0.c1(this);
    }
    public final float c(a p0){
       float f = (this.getChipStartPadding() + p0.c()) + this.getTextStartPadding();
       if (!i0.B(this)) {
          return f;
       }
       return (- f);
    }
    public final int[] d(){
       boolean b = this.isEnabled();
       if (this.m != null) {
          b = b + 1;
       }
       if (this.l != null) {
          b = b + 1;
       }
       if (this.k != null) {
          b = b + 1;
       }
       if (this.isChecked()) {
          b = b + 1;
       }
       int[] ointArray = new int[b];
       int i = 0;
       if (this.isEnabled()) {
          ointArray[i] = 0x101009e;
          i = 1;
       }
       if (this.m != null) {
          ointArray[i] = 0x101009c;
          i = i + 1;
       }
       if (this.l != null) {
          ointArray[i] = 0x1010367;
          i = i + 1;
       }
       if (this.k != null) {
          ointArray[i] = 0x10100a7;
          i = i + 1;
       }
       if (this.isChecked()) {
          ointArray[i] = 0x10100a1;
       }
       return ointArray;
    }
    public boolean dispatchHoverEvent(MotionEvent p0){
       boolean b = (!this.f(p0) && (this.n.t(p0) || super.dispatchHoverEvent(p0)))? true: false;
       return b;
    }
    public boolean dispatchKeyEvent(KeyEvent p0){
       boolean b = (this.n.u(p0) || super.dispatchKeyEvent(p0))? true: false;
       return b;
    }
    public void drawableStateChanged(){
       super.drawableStateChanged();
       Chip te = this.e;
       boolean b = (te != null && te.e0())? this.e.X0(this.d()): false;
       if (b) {
          this.invalidate();
       }
       return;
    }
    public final void e(){
       if (this.j == Integer.MIN_VALUE) {
          this.setFocusedVirtualView(-1);
       }
       return;
    }
    public final boolean f(MotionEvent p0){
       a uoa = a.class;
       if (p0.getAction() == 10) {
          try{
             Field declaredFiel = uoa.getDeclaredField("m");
             declaredFiel.setAccessible(true);
             int i = Integer.MIN_VALUE;
             if (declaredFiel.get(this.n).intValue() != i) {
                Class[] uClassArray = new Class[true];
                uClassArray[0] = Integer.TYPE;
                Method declaredMeth = uoa.getDeclaredMethod("O", uClassArray);
                declaredMeth.setAccessible(true);
                Object[] objArray = new Object[true];
                objArray[0] = Integer.valueOf(i);
                declaredMeth.invoke(this.n, objArray);
                return true;
             }
          }catch(java.lang.NoSuchMethodException e0){
          }catch(java.lang.IllegalAccessException e0){
          }catch(java.lang.reflect.InvocationTargetException e0){
          }catch(java.lang.NoSuchFieldException e0){
          }
       }
       return 0;
    }
    public boolean g(){
       Chip te = this.e;
       boolean b = (te != null && te.G() != null)? true: false;
       return b;
    }
    public Drawable getCheckedIcon(){
       Chip te = this.e;
       Drawable uDrawable = (te != null)? te.v(): null;
       return uDrawable;
    }
    public ColorStateList getChipBackgroundColor(){
       Chip te = this.e;
       ColorStateList uColorStateL = (te != null)? te.w(): null;
       return uColorStateL;
    }
    public float getChipCornerRadius(){
       Chip te = this.e;
       float f = (te != null)? te.x(): 0;
       return f;
    }
    public Drawable getChipDrawable(){
       return this.e;
    }
    public float getChipEndPadding(){
       Chip te = this.e;
       float f = (te != null)? te.y(): 0;
       return f;
    }
    public Drawable getChipIcon(){
       Chip te = this.e;
       Drawable uDrawable = (te != null)? te.z(): null;
       return uDrawable;
    }
    public float getChipIconSize(){
       Chip te = this.e;
       float f = (te != null)? te.A(): 0;
       return f;
    }
    public ColorStateList getChipIconTint(){
       Chip te = this.e;
       ColorStateList uColorStateL = (te != null)? te.B(): null;
       return uColorStateL;
    }
    public float getChipMinHeight(){
       Chip te = this.e;
       float f = (te != null)? te.C(): 0;
       return f;
    }
    public float getChipStartPadding(){
       Chip te = this.e;
       float f = (te != null)? te.D(): 0;
       return f;
    }
    public ColorStateList getChipStrokeColor(){
       Chip te = this.e;
       ColorStateList uColorStateL = (te != null)? te.E(): null;
       return uColorStateL;
    }
    public float getChipStrokeWidth(){
       Chip te = this.e;
       float f = (te != null)? te.F(): 0;
       return f;
    }
    public CharSequence getChipText(){
       return this.getText();
    }
    public Drawable getCloseIcon(){
       Chip te = this.e;
       Drawable uDrawable = (te != null)? te.G(): null;
       return uDrawable;
    }
    public CharSequence getCloseIconContentDescription(){
       Chip te = this.e;
       CharSequence uCharSequenc = (te != null)? te.H(): null;
       return uCharSequenc;
    }
    public float getCloseIconEndPadding(){
       Chip te = this.e;
       float f = (te != null)? te.I(): 0;
       return f;
    }
    public float getCloseIconSize(){
       Chip te = this.e;
       float f = (te != null)? te.J(): 0;
       return f;
    }
    public float getCloseIconStartPadding(){
       Chip te = this.e;
       float f = (te != null)? te.K(): 0;
       return f;
    }
    public ColorStateList getCloseIconTint(){
       Chip te = this.e;
       ColorStateList uColorStateL = (te != null)? te.M(): null;
       return uColorStateL;
    }
    public RectF getCloseIconTouchBounds(){
       this.p.setEmpty();
       if (this.g()) {
          this.e.N(this.p);
       }
       return this.p;
    }
    public Rect getCloseIconTouchBoundsInt(){
       RectF closeIconTou = this.getCloseIconTouchBounds();
       this.o.set((int)closeIconTou.left, (int)closeIconTou.top, (int)closeIconTou.right, (int)closeIconTou.bottom);
       return this.o;
    }
    public TextUtils$TruncateAt getEllipsize(){
       Chip te = this.e;
       TextUtils$TruncateAt truncateAt = (te != null)? te.O(): null;
       return truncateAt;
    }
    public void getFocusedRect(Rect p0){
       if (this.j == null) {
          p0.set(this.getCloseIconTouchBoundsInt());
       }else {
          super.getFocusedRect(p0);
       }
       return;
    }
    public h getHideMotionSpec(){
       Chip te = this.e;
       h oh = (te != null)? te.P(): null;
       return oh;
    }
    public float getIconEndPadding(){
       Chip te = this.e;
       float f = (te != null)? te.Q(): 0;
       return f;
    }
    public float getIconStartPadding(){
       Chip te = this.e;
       float f = (te != null)? te.R(): 0;
       return f;
    }
    public ColorStateList getRippleColor(){
       Chip te = this.e;
       ColorStateList uColorStateL = (te != null)? te.S(): null;
       return uColorStateL;
    }
    public h getShowMotionSpec(){
       Chip te = this.e;
       h oh = (te != null)? te.T(): null;
       return oh;
    }
    public CharSequence getText(){
       Chip te = this.e;
       CharSequence uCharSequenc = (te != null)? te.U(): "";
       return uCharSequenc;
    }
    public final b getTextAppearance(){
       Chip te = this.e;
       b uob = (te != null)? te.V(): null;
       return uob;
    }
    public float getTextEndPadding(){
       Chip te = this.e;
       float f = (te != null)? te.W(): 0;
       return f;
    }
    public float getTextStartPadding(){
       Chip te = this.e;
       float f = (te != null)? te.X(): 0;
       return f;
    }
    public final void h(){
       this.setOutlineProvider(new Chip$b(this));
    }
    public final boolean i(boolean p0){
       this.e();
       boolean b = true;
       if (p0) {
          if (this.j == -1) {
             this.setFocusedVirtualView(0);
          }else {
          label_0018 :
             b = false;
          }
       }else if(this.j == null){
          this.setFocusedVirtualView(-1);
       }else {
          goto label_0018 ;
       }
       return b;
    }
    public boolean j(){
       boolean b;
       this.playSoundEffect(0);
       Chip tg = this.g;
       if (tg != null) {
          tg.onClick(this);
          b = true;
       }else {
          b = false;
       }
       this.n.N(0, 1);
       return b;
    }
    public final void k(a p0){
       if (p0 != null) {
          p0.c1(null);
       }
       return;
    }
    public final void l(){
       if (!TextUtils.isEmpty(this.getText())) {
          Chip te = this.e;
          if (te != null) {
             float f = ((te.D() + this.e.y()) + this.e.X()) + this.e.W();
             if (!this.e.d0() || (this.e.z() != null || (this.e.v() != null && (this.e.c0() && this.isChecked())))) {
                f = f + ((this.e.R() + this.e.Q()) + this.e.A());
             }
          label_0064 :
             if (this.e.f0() && this.e.G() != null) {
                f = f + ((this.e.K() + this.e.I()) + this.e.J());
             }
             if ((float)i0.G(this) - f) {
                i0.J0(this, i0.H(this), this.getPaddingTop(), (int)f, this.getPaddingBottom());
             }
          }
       }
       return;
    }
    public final void m(b p0){
       TextPaint paint = this.getPaint();
       paint.drawableState = this.e.getState();
       p0.d(this.getContext(), paint, this.q);
    }
    public final void n(AttributeSet p0){
       if (p0 == null) {
          return;
       }
       String str = "http://schemas.android.com/apk/res/android";
       if (p0.getAttributeValue(str, "background") != null) {
          throw new UnsupportedOperationException("Do not set the background; Chip manages its own background drawable.");
       }
       if (p0.getAttributeValue(str, "drawableLeft") != null) {
          throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
       }
       if (p0.getAttributeValue(str, "drawableStart") != null) {
          throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
       }
       String str1 = "Please set end drawable using R.attr#closeIcon.";
       if (p0.getAttributeValue(str, "drawableEnd") != null) {
          throw new UnsupportedOperationException(str1);
       }
       if (p0.getAttributeValue(str, "drawableRight") != null) {
          throw new UnsupportedOperationException(str1);
       }
       boolean b = true;
       if (!p0.getAttributeBooleanValue(str, "singleLine", b) || (p0.getAttributeIntValue(str, "lines", b) != b || (p0.getAttributeIntValue(str, "minLines", b) != b || p0.getAttributeIntValue(str, "maxLines", b) != b))) {
          throw new UnsupportedOperationException("Chip does not support multi-line text");
       }
       p0.getAttributeIntValue(str, "gravity", 0x800013);
       return;
    }
    public int[] onCreateDrawableState(int p0){
       p0++;
       int[] ointArray = super.onCreateDrawableState(p0);
       if (this.isChecked()) {
          CheckBox.mergeDrawableStates(ointArray, Chip.s);
       }
       return ointArray;
    }
    public void onDraw(Canvas p0){
       if (!TextUtils.isEmpty(this.getText())) {
          Chip te = this.e;
          if (te != null && !te.y1()) {
             p0.translate(this.c(this.e), 0);
             super.onDraw(p0);
             p0.restoreToCount(p0.save());
             return;
          }
       }
       super.onDraw(p0);
       return;
    }
    public void onFocusChanged(boolean p0,int p1,Rect p2){
       if (p0) {
          this.setFocusedVirtualView(-1);
       }else {
          this.setFocusedVirtualView(Integer.MIN_VALUE);
       }
       this.invalidate();
       super.onFocusChanged(p0, p1, p2);
       this.n.E(p0, p1, p2);
       return;
    }
    public boolean onHoverEvent(MotionEvent p0){
       int actionMasked = p0.getActionMasked();
       if (actionMasked != 0.00f) {
          if (actionMasked == 10) {
             this.setCloseIconHovered(false);
          }
       }else {
          this.setCloseIconHovered(this.getCloseIconTouchBounds().contains(p0.getX(), p0.getY()));
       }
       return super.onHoverEvent(p0);
    }
    public boolean onKeyDown(int p0,KeyEvent p1){
       int keyCode = p1.getKeyCode();
       boolean b = false;
       if (keyCode != 61) {
          if (keyCode != 66) {
             switch (keyCode){
                 case 21:
                   if (p1.hasNoModifiers()) {
                      b = this.i(l.a(this));
                   }
                   break;
                 case 22:
                   if (p1.hasNoModifiers()) {
                      b = this.i((l.a(this) ^ true));
                   }
                   break;
                 case 23:
                   break;
                 default:
             }
          }
          Chip tj = this.j;
          if (tj != -1) {
             if (tj == null) {
                this.j();
                return true;
             }
          }else {
             this.performClick();
             return true;
          }
       }else if(p1.hasNoModifiers()){
          keyCode = 2;
       }else if(p1.hasModifiers(true)){
          keyCode = 1;
       }else {
          keyCode = 0;
       }
       if (keyCode) {
          ViewParent parent = this.getParent();
          View view = this;
          do {
             view = view.focusSearch(keyCode);
          } while (view != null && (view == this || view.getParent() != parent));
          if (view != null) {
             view.requestFocus();
             return true;
          }
       }
    label_006d :
       if (b) {
          this.invalidate();
          return true;
       }else {
          return super.onKeyDown(p0, p1);
       }
    }
    public PointerIcon onResolvePointerIcon(MotionEvent p0,int p1){
       if (this.getCloseIconTouchBounds().contains(p0.getX(), p0.getY()) && this.isEnabled()) {
          return PointerIcon.getSystemIcon(this.getContext(), 1002);
       }
       return null;
    }
    public boolean onTouchEvent(MotionEvent p0){
       int actionMasked = p0.getActionMasked();
       boolean b = this.getCloseIconTouchBounds().contains(p0.getX(), p0.getY());
       boolean b1 = false;
       if (actionMasked) {
          if (actionMasked != 1) {
             if (actionMasked != 2) {
                if (actionMasked != 3) {
                label_0040 :
                   actionMasked = 0;
                label_0041 :
                   if (actionMasked || super.onTouchEvent(p0)) {
                      b1 = true;
                   }
                   return b1;
                }
             }else if(this.k != null){
                if (!b) {
                   this.setCloseIconPressed(b1);
                }
             }else {
                goto label_0040 ;
             }
          }else if(this.k != null){
             this.j();
             actionMasked = 1;
          label_0035 :
             this.setCloseIconPressed(b1);
             goto label_0041 ;
          }
          actionMasked = 0;
          goto label_0035 ;
       }else if(b){
          this.setCloseIconPressed(true);
       }else {
          goto label_0040 ;
       }
       actionMasked = 1;
       goto label_0041 ;
    }
    public void setBackground(Drawable p0){
       if (p0 != this.e && p0 != this.f) {
          throw new UnsupportedOperationException("Do not set the background; Chip manages its own background drawable.");
       }
       super.setBackground(p0);
       return;
    }
    public void setBackgroundColor(int p0){
       throw new UnsupportedOperationException("Do not set the background color; Chip manages its own background drawable.");
    }
    public void setBackgroundDrawable(Drawable p0){
       if (p0 != this.e && p0 != this.f) {
          throw new UnsupportedOperationException("Do not set the background drawable; Chip manages its own background drawable.");
       }
       super.setBackgroundDrawable(p0);
       return;
    }
    public void setBackgroundResource(int p0){
       throw new UnsupportedOperationException("Do not set the background resource; Chip manages its own background drawable.");
    }
    public void setBackgroundTintList(ColorStateList p0){
       throw new UnsupportedOperationException("Do not set the background tint list; Chip manages its own background drawable.");
    }
    public void setBackgroundTintMode(PorterDuff$Mode p0){
       throw new UnsupportedOperationException("Do not set the background tint mode; Chip manages its own background drawable.");
    }
    public void setCheckable(boolean p0){
       Chip te = this.e;
       if (te != null) {
          te.m0(p0);
       }
       return;
    }
    public void setCheckableResource(int p0){
       Chip te = this.e;
       if (te != null) {
          te.n0(p0);
       }
       return;
    }
    public void setChecked(boolean p0){
       Chip te = this.e;
       if (te == null) {
          this.i = p0;
       }else if(te.b0()){
          super.setChecked(p0);
          if (this.isChecked() != p0) {
             te = this.h;
             if (te != null) {
                te.onCheckedChanged(this, p0);
             }
          }
       }
       return;
    }
    public void setCheckedIcon(Drawable p0){
       Chip te = this.e;
       if (te != null) {
          te.o0(p0);
       }
       return;
    }
    public void setCheckedIconEnabled(boolean p0){
       this.setCheckedIconVisible(p0);
    }
    public void setCheckedIconEnabledResource(int p0){
       this.setCheckedIconVisible(p0);
    }
    public void setCheckedIconResource(int p0){
       Chip te = this.e;
       if (te != null) {
          te.p0(p0);
       }
       return;
    }
    public void setCheckedIconVisible(int p0){
       Chip te = this.e;
       if (te != null) {
          te.q0(p0);
       }
       return;
    }
    public void setCheckedIconVisible(boolean p0){
       Chip te = this.e;
       if (te != null) {
          te.r0(p0);
       }
       return;
    }
    public void setChipBackgroundColor(ColorStateList p0){
       Chip te = this.e;
       if (te != null) {
          te.s0(p0);
       }
       return;
    }
    public void setChipBackgroundColorResource(int p0){
       Chip te = this.e;
       if (te != null) {
          te.t0(p0);
       }
       return;
    }
    public void setChipCornerRadius(float p0){
       Chip te = this.e;
       if (te != null) {
          te.u0(p0);
       }
       return;
    }
    public void setChipCornerRadiusResource(int p0){
       Chip te = this.e;
       if (te != null) {
          te.v0(p0);
       }
       return;
    }
    public void setChipDrawable(a p0){
       Chip te = this.e;
       if (te != p0) {
          this.k(te);
          this.e = p0;
          this.b(p0);
          if (a.a) {
             this.f = new RippleDrawable(a.a(this.e.S()), this.e, null);
             this.e.x1(false);
             i0.v0(this, this.f);
          }else {
             this.e.x1(true);
             i0.v0(this, this.e);
          }
       }
       return;
    }
    public void setChipEndPadding(float p0){
       Chip te = this.e;
       if (te != null) {
          te.w0(p0);
       }
       return;
    }
    public void setChipEndPaddingResource(int p0){
       Chip te = this.e;
       if (te != null) {
          te.x0(p0);
       }
       return;
    }
    public void setChipIcon(Drawable p0){
       Chip te = this.e;
       if (te != null) {
          te.y0(p0);
       }
       return;
    }
    public void setChipIconEnabled(boolean p0){
       this.setChipIconVisible(p0);
    }
    public void setChipIconEnabledResource(int p0){
       this.setChipIconVisible(p0);
    }
    public void setChipIconResource(int p0){
       Chip te = this.e;
       if (te != null) {
          te.z0(p0);
       }
       return;
    }
    public void setChipIconSize(float p0){
       Chip te = this.e;
       if (te != null) {
          te.A0(p0);
       }
       return;
    }
    public void setChipIconSizeResource(int p0){
       Chip te = this.e;
       if (te != null) {
          te.B0(p0);
       }
       return;
    }
    public void setChipIconTint(ColorStateList p0){
       Chip te = this.e;
       if (te != null) {
          te.C0(p0);
       }
       return;
    }
    public void setChipIconTintResource(int p0){
       Chip te = this.e;
       if (te != null) {
          te.D0(p0);
       }
       return;
    }
    public void setChipIconVisible(int p0){
       Chip te = this.e;
       if (te != null) {
          te.E0(p0);
       }
       return;
    }
    public void setChipIconVisible(boolean p0){
       Chip te = this.e;
       if (te != null) {
          te.F0(p0);
       }
       return;
    }
    public void setChipMinHeight(float p0){
       Chip te = this.e;
       if (te != null) {
          te.G0(p0);
       }
       return;
    }
    public void setChipMinHeightResource(int p0){
       Chip te = this.e;
       if (te != null) {
          te.H0(p0);
       }
       return;
    }
    public void setChipStartPadding(float p0){
       Chip te = this.e;
       if (te != null) {
          te.I0(p0);
       }
       return;
    }
    public void setChipStartPaddingResource(int p0){
       Chip te = this.e;
       if (te != null) {
          te.J0(p0);
       }
       return;
    }
    public void setChipStrokeColor(ColorStateList p0){
       Chip te = this.e;
       if (te != null) {
          te.K0(p0);
       }
       return;
    }
    public void setChipStrokeColorResource(int p0){
       Chip te = this.e;
       if (te != null) {
          te.L0(p0);
       }
       return;
    }
    public void setChipStrokeWidth(float p0){
       Chip te = this.e;
       if (te != null) {
          te.M0(p0);
       }
       return;
    }
    public void setChipStrokeWidthResource(int p0){
       Chip te = this.e;
       if (te != null) {
          te.N0(p0);
       }
       return;
    }
    public void setChipText(CharSequence p0){
       this.setText(p0);
    }
    public void setChipTextResource(int p0){
       this.setText(this.getResources().getString(p0));
    }
    public void setCloseIcon(Drawable p0){
       Chip te = this.e;
       if (te != null) {
          te.O0(p0);
       }
       return;
    }
    public void setCloseIconContentDescription(CharSequence p0){
       Chip te = this.e;
       if (te != null) {
          te.P0(p0);
       }
       return;
    }
    public void setCloseIconEnabled(boolean p0){
       this.setCloseIconVisible(p0);
    }
    public void setCloseIconEnabledResource(int p0){
       this.setCloseIconVisible(p0);
    }
    public void setCloseIconEndPadding(float p0){
       Chip te = this.e;
       if (te != null) {
          te.Q0(p0);
       }
       return;
    }
    public void setCloseIconEndPaddingResource(int p0){
       Chip te = this.e;
       if (te != null) {
          te.R0(p0);
       }
       return;
    }
    public final void setCloseIconFocused(boolean p0){
       if (this.m != p0) {
          this.m = p0;
          this.refreshDrawableState();
       }
       return;
    }
    public final void setCloseIconHovered(boolean p0){
       if (this.l != p0) {
          this.l = p0;
          this.refreshDrawableState();
       }
       return;
    }
    public final void setCloseIconPressed(boolean p0){
       if (this.k != p0) {
          this.k = p0;
          this.refreshDrawableState();
       }
       return;
    }
    public void setCloseIconResource(int p0){
       Chip te = this.e;
       if (te != null) {
          te.S0(p0);
       }
       return;
    }
    public void setCloseIconSize(float p0){
       Chip te = this.e;
       if (te != null) {
          te.T0(p0);
       }
       return;
    }
    public void setCloseIconSizeResource(int p0){
       Chip te = this.e;
       if (te != null) {
          te.U0(p0);
       }
       return;
    }
    public void setCloseIconStartPadding(float p0){
       Chip te = this.e;
       if (te != null) {
          te.V0(p0);
       }
       return;
    }
    public void setCloseIconStartPaddingResource(int p0){
       Chip te = this.e;
       if (te != null) {
          te.W0(p0);
       }
       return;
    }
    public void setCloseIconTint(ColorStateList p0){
       Chip te = this.e;
       if (te != null) {
          te.Y0(p0);
       }
       return;
    }
    public void setCloseIconTintResource(int p0){
       Chip te = this.e;
       if (te != null) {
          te.Z0(p0);
       }
       return;
    }
    public void setCloseIconVisible(int p0){
       Chip te = this.e;
       if (te != null) {
          te.a1(p0);
       }
       return;
    }
    public void setCloseIconVisible(boolean p0){
       Chip te = this.e;
       if (te != null) {
          te.b1(p0);
       }
       return;
    }
    public void setCompoundDrawables(Drawable p0,Drawable p1,Drawable p2,Drawable p3){
       if (p0 != null) {
          throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
       }
       if (p2 != null) {
          throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
       }
       super.setCompoundDrawables(p0, p1, p2, p3);
       return;
    }
    public void setCompoundDrawablesRelative(Drawable p0,Drawable p1,Drawable p2,Drawable p3){
       if (p0 != null) {
          throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
       }
       if (p2 != null) {
          throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
       }
       super.setCompoundDrawablesRelative(p0, p1, p2, p3);
       return;
    }
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int p0,int p1,int p2,int p3){
       if (p0) {
          throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
       }
       if (p2) {
          throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
       }
       super.setCompoundDrawablesRelativeWithIntrinsicBounds(p0, p1, p2, p3);
       return;
    }
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable p0,Drawable p1,Drawable p2,Drawable p3){
       if (p0 != null) {
          throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
       }
       if (p2 != null) {
          throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
       }
       super.setCompoundDrawablesRelativeWithIntrinsicBounds(p0, p1, p2, p3);
       return;
    }
    public void setCompoundDrawablesWithIntrinsicBounds(int p0,int p1,int p2,int p3){
       if (p0) {
          throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
       }
       if (p2) {
          throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
       }
       super.setCompoundDrawablesWithIntrinsicBounds(p0, p1, p2, p3);
       return;
    }
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable p0,Drawable p1,Drawable p2,Drawable p3){
       if (p0 != null) {
          throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
       }
       if (p2 != null) {
          throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
       }
       super.setCompoundDrawablesWithIntrinsicBounds(p0, p1, p2, p3);
       return;
    }
    public void setEllipsize(TextUtils$TruncateAt p0){
       if (this.e == null) {
          return;
       }
       if (p0 == TextUtils$TruncateAt.MARQUEE) {
          throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
       }
       super.setEllipsize(p0);
       Chip te = this.e;
       if (te != null) {
          te.d1(p0);
       }
       return;
    }
    public final void setFocusedVirtualView(int p0){
       Chip tj = this.j;
       if (tj != p0) {
          if (tj == null) {
             this.setCloseIconFocused(false);
          }
          this.j = p0;
          if (!p0) {
             this.setCloseIconFocused(true);
          }
       }
       return;
    }
    public void setGravity(int p0){
       if (p0 != 0x800013) {
       }else {
          super.setGravity(p0);
       }
       return;
    }
    public void setHideMotionSpec(h p0){
       Chip te = this.e;
       if (te != null) {
          te.e1(p0);
       }
       return;
    }
    public void setHideMotionSpecResource(int p0){
       Chip te = this.e;
       if (te != null) {
          te.f1(p0);
       }
       return;
    }
    public void setIconEndPadding(float p0){
       Chip te = this.e;
       if (te != null) {
          te.g1(p0);
       }
       return;
    }
    public void setIconEndPaddingResource(int p0){
       Chip te = this.e;
       if (te != null) {
          te.h1(p0);
       }
       return;
    }
    public void setIconStartPadding(float p0){
       Chip te = this.e;
       if (te != null) {
          te.i1(p0);
       }
       return;
    }
    public void setIconStartPaddingResource(int p0){
       Chip te = this.e;
       if (te != null) {
          te.j1(p0);
       }
       return;
    }
    public void setLines(int p0){
       if (p0 > 1) {
          throw new UnsupportedOperationException("Chip does not support multi-line text");
       }
       super.setLines(p0);
       return;
    }
    public void setMaxLines(int p0){
       if (p0 > 1) {
          throw new UnsupportedOperationException("Chip does not support multi-line text");
       }
       super.setMaxLines(p0);
       return;
    }
    public void setMaxWidth(int p0){
       super.setMaxWidth(p0);
       Chip te = this.e;
       if (te != null) {
          te.k1(p0);
       }
       return;
    }
    public void setMinLines(int p0){
       if (p0 > 1) {
          throw new UnsupportedOperationException("Chip does not support multi-line text");
       }
       super.setMinLines(p0);
       return;
    }
    public void setOnCheckedChangeListenerInternal(CompoundButton$OnCheckedChangeListener p0){
       this.h = p0;
    }
    public void setOnCloseIconClickListener(View$OnClickListener p0){
       this.g = p0;
    }
    public void setRippleColor(ColorStateList p0){
       Chip te = this.e;
       if (te != null) {
          te.l1(p0);
       }
       return;
    }
    public void setRippleColorResource(int p0){
       Chip te = this.e;
       if (te != null) {
          te.m1(p0);
       }
       return;
    }
    public void setShowMotionSpec(h p0){
       Chip te = this.e;
       if (te != null) {
          te.o1(p0);
       }
       return;
    }
    public void setShowMotionSpecResource(int p0){
       Chip te = this.e;
       if (te != null) {
          te.p1(p0);
       }
       return;
    }
    public void setSingleLine(boolean p0){
       if (!p0) {
          throw new UnsupportedOperationException("Chip does not support multi-line text");
       }
       super.setSingleLine(p0);
       return;
    }
    public void setText(CharSequence p0,TextView$BufferType p1){
       String str;
       if (this.e == null) {
          return;
       }
       if (p0 == null) {
          str = "";
       }
       CharSequence uCharSequenc = a.c().i(str);
       if (this.e.y1()) {
          uCharSequenc = null;
       }
       super.setText(uCharSequenc, p1);
       Chip te = this.e;
       if (te != null) {
          te.q1(str);
       }
       return;
    }
    public void setTextAppearance(int p0){
       super.setTextAppearance(p0);
       Chip te = this.e;
       if (te != null) {
          te.s1(p0);
       }
       if (this.getTextAppearance() != null) {
          this.getTextAppearance().e(this.getContext(), this.getPaint(), this.q);
          this.m(this.getTextAppearance());
       }
       return;
    }
    public void setTextAppearance(Context p0,int p1){
       super.setTextAppearance(p0, p1);
       Chip te = this.e;
       if (te != null) {
          te.s1(p1);
       }
       if (this.getTextAppearance() != null) {
          this.getTextAppearance().e(p0, this.getPaint(), this.q);
          this.m(this.getTextAppearance());
       }
       return;
    }
    public void setTextAppearance(b p0){
       Chip te = this.e;
       if (te != null) {
          te.r1(p0);
       }
       if (this.getTextAppearance() != null) {
          this.getTextAppearance().e(this.getContext(), this.getPaint(), this.q);
          this.m(p0);
       }
       return;
    }
    public void setTextAppearanceResource(int p0){
       Chip te = this.e;
       if (te != null) {
          te.s1(p0);
       }
       this.setTextAppearance(this.getContext(), p0);
       return;
    }
    public void setTextEndPadding(float p0){
       Chip te = this.e;
       if (te != null) {
          te.t1(p0);
       }
       return;
    }
    public void setTextEndPaddingResource(int p0){
       Chip te = this.e;
       if (te != null) {
          te.u1(p0);
       }
       return;
    }
    public void setTextStartPadding(float p0){
       Chip te = this.e;
       if (te != null) {
          te.v1(p0);
       }
       return;
    }
    public void setTextStartPaddingResource(int p0){
       Chip te = this.e;
       if (te != null) {
          te.w1(p0);
       }
       return;
    }
}
