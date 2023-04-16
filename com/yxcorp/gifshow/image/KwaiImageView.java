package com.yxcorp.gifshow.image.KwaiImageView;
import e2.k;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import ll8.c$b;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import w0.n;
import android.widget.ImageView;
import android.content.res.ColorStateList;
import com.kwai.robust.PatchProxyResult;
import android.graphics.PorterDuff$Mode;
import java.lang.Boolean;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Bitmap;
import com.facebook.drawee.view.DraweeView;
import android.net.Uri;
import com.facebook.drawee.view.SimpleDraweeView;

public class KwaiImageView extends KwaiBindableImageView implements k	// class@001946
{
    public n v;
    public Drawable w;

    public void KwaiImageView(Context p0){
       super(p0);
       this.o0(p0, null, 0);
    }
    public void KwaiImageView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.o0(p0, p1, 0);
    }
    public void KwaiImageView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.o0(p0, p1, p2);
    }
    private void o0(Context p0,AttributeSet p1,int p2){
       if (PatchProxy.isSupport(KwaiImageView.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, KwaiImageView.class, "1")) {
          return;
       }
       if (p1 != null) {
          TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.W1);
          this.w = typedArray.getDrawable(0);
          typedArray.recycle();
       }
       n on = new n(this);
       this.v = on;
       on.f(p1, p2);
       return;
    }
    public void drawableStateChanged(){
       if (PatchProxy.applyVoid(null, this, KwaiImageView.class, "13")) {
          return;
       }
       super.drawableStateChanged();
       KwaiImageView tw = this.w;
       if (tw != null && tw.isStateful()) {
          this.w.setState(this.getDrawableState());
       }
       tw = this.v;
       if (tw != null) {
          tw.b();
       }
       return;
    }
    public ColorStateList getSupportImageTintList(){
       Object[] objArray = null;
       KwaiImageView obj = PatchProxy.apply(objArray, this, KwaiImageView.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.v;
       if (obj != null) {
          objArray = obj.c();
       }
       return objArray;
    }
    public PorterDuff$Mode getSupportImageTintMode(){
       Object[] objArray = null;
       KwaiImageView obj = PatchProxy.apply(objArray, this, KwaiImageView.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.v;
       if (obj != null) {
          objArray = obj.d();
       }
       return objArray;
    }
    public boolean hasOverlappingRendering(){
       Object obj = PatchProxy.apply(null, this, KwaiImageView.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.v.e() && super.hasOverlappingRendering())? true: false;
       return b;
    }
    public void n0(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiImageView.class, "3")) {
          return;
       }
       KwaiImageView tw = this.w;
       if (tw != null) {
          tw.setBounds(new Rect(this.getPaddingLeft(), this.getPaddingTop(), (this.getWidth() - this.getPaddingRight()), (this.getHeight() - this.getPaddingBottom())));
          this.w.draw(p0);
       }
       return;
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiImageView.class, "4")) {
          return;
       }
       try{
          super.onDraw(p0);
          this.n0(p0);
          return;
       }catch(java.lang.RuntimeException e0){
       }
    }
    public void setForegroundDrawable(Drawable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiImageView.class, "2")) {
          return;
       }
       this.w = p0;
       this.invalidate();
       return;
    }
    public void setImageBitmap(Bitmap p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiImageView.class, "7")) {
          return;
       }
       super.setImageBitmap(p0);
       KwaiImageView tv = this.v;
       if (tv != null) {
          tv.b();
       }
       return;
    }
    public void setImageDrawable(Drawable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiImageView.class, "6")) {
          return;
       }
       super.setImageDrawable(p0);
       KwaiImageView tv = this.v;
       if (tv != null) {
          tv.b();
       }
       return;
    }
    public void setImageResource(int p0){
       if (PatchProxy.isSupport(KwaiImageView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, KwaiImageView.class, "5")) {
          return;
       }
       KwaiImageView tv = this.v;
       if (tv != null) {
          tv.g(p0);
       }
       return;
    }
    public void setImageURI(Uri p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiImageView.class, "8")) {
          return;
       }
       super.setImageURI(p0);
       KwaiImageView tv = this.v;
       if (tv != null) {
          tv.b();
       }
       return;
    }
    public void setSupportImageTintList(ColorStateList p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiImageView.class, "9")) {
          return;
       }
       KwaiImageView tv = this.v;
       if (tv != null) {
          tv.h(p0);
       }
       return;
    }
    public void setSupportImageTintMode(PorterDuff$Mode p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiImageView.class, "11")) {
          return;
       }
       KwaiImageView tv = this.v;
       if (tv != null) {
          tv.i(p0);
       }
       return;
    }
}
