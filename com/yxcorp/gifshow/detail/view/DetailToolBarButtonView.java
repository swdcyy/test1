package com.yxcorp.gifshow.detail.view.DetailToolBarButtonView;
import androidx.appcompat.widget.AppCompatImageView;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Object;
import java.lang.String;
import android.widget.ImageView;
import android.graphics.drawable.StateListDrawable;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import android.content.res.Resources;
import android.graphics.drawable.Drawable$ConstantState;
import android.view.View;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.DrawFilter;
import java.lang.Number;
import java.lang.Math;

public class DetailToolBarButtonView extends AppCompatImageView	// class@001a3f
{
    public float d;
    public float e;
    public Drawable f;
    public Drawable g;
    public int h;
    public int i;
    public boolean j;
    public boolean k;

    public void DetailToolBarButtonView(Context p0){
       super(p0);
       this.d = 0x3f800000;
       this.f();
    }
    public void DetailToolBarButtonView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.d = 0x3f800000;
       this.f();
    }
    public void DetailToolBarButtonView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.d = 0x3f800000;
       this.f();
    }
    public final void a(Canvas p0,Drawable p1,float p2){
       int i1;
       if (PatchProxy.isSupport(DetailToolBarButtonView.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Float.valueOf(p2), this, DetailToolBarButtonView.class, "13")) {
          return;
       }
       int i = 0;
       if (p1.getIntrinsicHeight() != -1 && this.k == null) {
          i1 = this.getHeight() - p1.getIntrinsicHeight();
          if (i1 < 0) {
             i1 = 0;
          }
          int i2 = this.getWidth() - p1.getIntrinsicWidth();
          if (i2 >= 0) {
             i = i2;
          }
       }else {
          i1 = 0;
       }
       p1.setAlpha((int)(p2 * 0x437f0000));
       if (p1 instanceof StateListDrawable) {
          p1.setState(this.getDrawableState());
       }
       i = i / 2;
       i1 = i1 / 2;
       p1.setBounds(i, i1, (this.getWidth() - i), (this.getHeight() - i1));
       p1.draw(p0);
       return;
    }
    public final Drawable c(int p0){
       if (PatchProxy.isSupport(DetailToolBarButtonView.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, DetailToolBarButtonView.class, "16");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       Drawable drawable = this.getResources().getDrawable(p0);
       if (drawable.getConstantState() != null) {
          drawable = drawable.getConstantState().newDrawable();
       }
       return drawable;
    }
    public boolean d(){
       boolean b = (this.g != null)? true: false;
       return b;
    }
    public void draw(Canvas p0){
       DetailToolBarButtonView tg;
       if (PatchProxy.applyVoidOneRefs(p0, this, DetailToolBarButtonView.class, "11")) {
          return;
       }
       int i = 0;
       if (!PatchProxy.applyVoid(null, this, DetailToolBarButtonView.class, "12")) {
          if (this.f == null && this.d - i > 0) {
             tg = this.h;
             if (tg > null) {
                this.f = this.c(tg);
             }
          }
          if (this.g == null && this.e - i > 0) {
             tg = this.i;
             if (tg > null) {
                this.g = this.c(tg);
             }
          }
       }
    label_0040 :
       if (this.g != null || (!this.e - i && (this.f != null || !this.d - i))) {
          p0.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
          tg = this.g;
          if (tg != null) {
             this.a(p0, tg, this.i(this.e));
          }
          tg = this.f;
          if (tg != null) {
             this.a(p0, tg, this.i(this.d));
          }
       }else {
          super.draw(p0);
       }
       return;
    }
    public boolean e(){
       boolean b = (this.f != null)? true: false;
       return b;
    }
    public final void f(){
       if (PatchProxy.applyVoid(null, this, DetailToolBarButtonView.class, "1")) {
          return;
       }
       this.f = this.getDrawable();
       if (this.getDrawable() != null && this.getDrawable().getConstantState() != null) {
          this.f = this.getDrawable().getConstantState().newDrawable();
       }
       return;
    }
    public float getProgress(){
       return this.d;
    }
    public final float i(float p0){
       if (PatchProxy.isSupport(DetailToolBarButtonView.class)) {
          Object obj = PatchProxy.applyOneRefs(Float.valueOf(p0), this, DetailToolBarButtonView.class, "17");
          if (obj != PatchProxyResult.class) {
             return obj.floatValue();
          }
       }
       float alpha = (this.j != null)? this.getAlpha(): 0x3f800000;
       return (p0 * alpha);
    }
    public void j(float p0,float p1){
       if (PatchProxy.isSupport(DetailToolBarButtonView.class) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), Float.valueOf(p1), this, DetailToolBarButtonView.class, "10")) {
          return;
       }
       float f = 0x3f800000;
       this.d = (p0 - p1 >= 0)? Math.min(f, ((p0 - p1) / (f - p1))): 0;
       this.e = (p0 - p1 < 0)? f - Math.min(f, (p0 / p1)): 0;
       this.invalidate();
       return;
    }
    public void k(int p0,int p1){
       if (PatchProxy.isSupport(DetailToolBarButtonView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, DetailToolBarButtonView.class, "2")) {
          return;
       }
       this.setImageResource(p0);
       this.setBottomResourceId(p1);
       return;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, DetailToolBarButtonView.class, "15")) {
          return;
       }
       super.onDetachedFromWindow();
       DetailToolBarButtonView tg = this.g;
       if (tg != null) {
          tg.setAlpha(255);
       }
       tg = this.f;
       if (tg != null) {
          tg.setAlpha(255);
       }
       return;
    }
    public void setBottomDrawable(Drawable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DetailToolBarButtonView.class, "6")) {
          return;
       }
       this.g = p0;
       if (p0 != null && p0.getConstantState() != null) {
          this.g = p0.getConstantState().newDrawable();
       }
       this.setProgress(0);
       return;
    }
    public void setBottomResourceId(int p0){
       if (PatchProxy.isSupport(DetailToolBarButtonView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, DetailToolBarButtonView.class, "5")) {
          return;
       }
       if (this.i != p0 && this.g != null) {
          this.g = null;
       }
       this.i = p0;
       this.setProgress(0);
       return;
    }
    public void setDisableScale(boolean p0){
       this.k = p0;
    }
    public void setEnableDrawableApplyViewAlpha(boolean p0){
       this.j = p0;
    }
    public void setFrontImageDrawableWithoutNew(Drawable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DetailToolBarButtonView.class, "7")) {
          return;
       }
       super.setImageDrawable(p0);
       this.f = p0;
       return;
    }
    public void setImageDrawable(Drawable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DetailToolBarButtonView.class, "4")) {
          return;
       }
       super.setImageDrawable(p0);
       this.f = p0;
       if (p0 != null && p0.getConstantState() != null) {
          this.f = p0.getConstantState().newDrawable();
       }
       return;
    }
    public void setImageResource(int p0){
       if (PatchProxy.isSupport(DetailToolBarButtonView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, DetailToolBarButtonView.class, "3")) {
          return;
       }
       super.setImageResource(p0);
       if (this.h != p0 && this.f != null) {
          this.f = null;
       }
       this.h = p0;
       return;
    }
    public void setProgress(float p0){
       if (PatchProxy.isSupport(DetailToolBarButtonView.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, DetailToolBarButtonView.class, "9")) {
          return;
       }
       this.d = p0;
       this.e = 0x3f800000 - p0;
       this.invalidate();
       return;
    }
}
