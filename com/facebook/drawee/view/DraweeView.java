package com.facebook.drawee.view.DraweeView;
import android.widget.ImageView;
import android.content.Context;
import com.facebook.drawee.view.a$a;
import android.util.AttributeSet;
import kd.b;
import java.lang.String;
import ac.b;
import cc.a;
import android.content.res.ColorStateList;
import android.content.pm.ApplicationInfo;
import ac.a;
import java.lang.Object;
import ab.e;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import com.facebook.drawee.view.a;
import android.view.View$MeasureSpec;
import android.view.MotionEvent;
import android.graphics.Bitmap;
import android.net.Uri;
import ab.d$b;
import ab.d;

public class DraweeView extends ImageView	// class@00045b
{
    public final a$a b;
    public float c;
    public a d;
    public boolean e;
    public boolean f;
    public static boolean g;

    public void DraweeView(Context p0){
       super(p0);
       this.b = new a$a();
       this.c = 0;
       this.e = false;
       this.f = false;
       this.k(p0);
    }
    public void DraweeView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.b = new a$a();
       this.c = 0;
       this.e = false;
       this.f = false;
       this.k(p0);
    }
    public void DraweeView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = new a$a();
       this.c = 0;
       this.e = false;
       this.f = false;
       this.k(p0);
    }
    private void k(Context p0){
       boolean b;
       if (b.d()) {
          b.a("DraweeView#init");
       }
       if (this.e != null) {
          if (b.d()) {
             b.b();
          }
          return;
       }else {
          b = true;
          this.e = b;
          this.d = a.d(null, p0);
          ColorStateList imageTintLis = this.getImageTintList();
          if (imageTintLis == null) {
             if (b.d()) {
                b.b();
             }
             return;
          }else {
             this.setColorFilter(imageTintLis.getDefaultColor());
             if (!DraweeView.g || p0.getApplicationInfo().targetSdkVersion < 24) {
                b = false;
             }
             this.f = b;
             if (b.d()) {
                b.b();
             }
             return;
          }
       }
    }
    public static void setGlobalLegacyVisibilityHandlingEnabled(boolean p0){
       DraweeView.g = p0;
    }
    public float getAspectRatio(){
       return this.c;
    }
    public a getController(){
       return this.d.f();
    }
    public b getHierarchy(){
       a d = this.d.d;
       e.d(d);
       return d;
    }
    public Drawable getTopLevelDrawable(){
       return this.d.g();
    }
    public boolean j(){
       boolean b = (this.d.d != null)? true: false;
       return b;
    }
    public final void n(){
       if (this.f != null) {
          Drawable drawable = this.getDrawable();
          if (drawable != null) {
             boolean b = (!this.getVisibility())? true: false;
             drawable.setVisible(b, false);
          }
       }
       return;
    }
    public void o(){
       this.d.i();
    }
    public void onAttachedToWindow(){
       super.onAttachedToWindow();
       this.n();
       this.o();
    }
    public void onDetachedFromWindow(){
       super.onDetachedFromWindow();
       this.n();
       this.p();
    }
    public void onFinishTemporaryDetach(){
       super.onFinishTemporaryDetach();
       this.n();
       this.o();
    }
    public void onMeasure(int p0,int p1){
       DraweeView tb = this.b;
       tb.a = p0;
       tb.b = p1;
       DraweeView tc = this.c;
       ViewGroup$LayoutParams layoutParams = this.getLayoutParams();
       int i = this.getPaddingLeft() + this.getPaddingRight();
       int i1 = this.getPaddingTop() + this.getPaddingBottom();
       if (tc > 0 && layoutParams != null) {
          if (a.a(layoutParams.height)) {
             tb.b = View$MeasureSpec.makeMeasureSpec(View.resolveSize((int)(((float)(View$MeasureSpec.getSize(tb.a) - i) / tc) + (float)i1), tb.b), 0x40000000);
          }else if(a.a(layoutParams.width)){
             tb.a = View$MeasureSpec.makeMeasureSpec(View.resolveSize((int)(((float)(View$MeasureSpec.getSize(tb.b) - i1) * tc) + (float)i), tb.a), 0x40000000);
          }
       }
       tc = this.b;
       super.onMeasure(tc.a, tc.b);
       return;
    }
    public void onStartTemporaryDetach(){
       super.onStartTemporaryDetach();
       this.n();
       this.p();
    }
    public boolean onTouchEvent(MotionEvent p0){
       boolean b;
       DraweeView td = this.d;
       td = (!td.h())? 0: td.e.onTouchEvent(p0);
       if (td) {
          return true;
       }else {
          return super.onTouchEvent(p0);
       }
    }
    public void onVisibilityChanged(View p0,int p1){
       super.onVisibilityChanged(p0, p1);
       this.n();
    }
    public void p(){
       this.d.j();
    }
    public void setAspectRatio(float p0){
       if (!p0 - this.c) {
          return;
       }
       this.c = p0;
       this.requestLayout();
       return;
    }
    public void setController(a p0){
       this.d.k(p0);
       super.setImageDrawable(this.d.g());
    }
    public void setHierarchy(b p0){
       this.d.l(p0);
       super.setImageDrawable(this.d.g());
    }
    public void setImageBitmap(Bitmap p0){
       this.k(this.getContext());
       this.d.k(null);
       super.setImageBitmap(p0);
    }
    public void setImageDrawable(Drawable p0){
       this.k(this.getContext());
       this.d.k(null);
       super.setImageDrawable(p0);
    }
    public void setImageResource(int p0){
       this.k(this.getContext());
       this.d.k(null);
       super.setImageResource(p0);
    }
    public void setImageURI(Uri p0){
       this.k(this.getContext());
       this.d.k(null);
       super.setImageURI(p0);
    }
    public void setLegacyVisibilityHandlingEnabled(boolean p0){
       this.f = p0;
    }
    public String toString(){
       d$b uob = d.c(this);
       DraweeView td = this.d;
       String str = (td != null)? td.toString(): "<no holder set>";
       uob.b("holder", str);
       return uob.toString();
    }
}
