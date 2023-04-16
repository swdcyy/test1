package androidx.appcompat.widget.AppCompatImageView;
import a2.g0;
import e2.k;
import android.widget.ImageView;
import android.content.Context;
import android.util.AttributeSet;
import w0.v;
import android.view.View;
import w0.s;
import w0.b;
import w0.f;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff$Mode;
import android.graphics.drawable.Drawable;
import android.graphics.Bitmap;
import android.net.Uri;

public class AppCompatImageView extends ImageView implements g0, k	// class@0005e6
{
    public final b b;
    public final f c;

    public void AppCompatImageView(Context p0){
       super(p0, null);
    }
    public void AppCompatImageView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void AppCompatImageView(Context p0,AttributeSet p1,int p2){
       v.a(p0);
       super(p0, p1, p2);
       s.a(this, this.getContext());
       b uob = new b(this);
       this.b = uob;
       uob.e(p1, p2);
       f uof = new f(this);
       this.c = uof;
       uof.f(p1, p2);
    }
    public void drawableStateChanged(){
       super.drawableStateChanged();
       AppCompatImageView tb = this.b;
       if (tb != null) {
          tb.b();
       }
       tb = this.c;
       if (tb != null) {
          tb.b();
       }
       return;
    }
    public ColorStateList getSupportBackgroundTintList(){
       AppCompatImageView tb = this.b;
       ColorStateList uColorStateL = (tb != null)? tb.c(): null;
       return uColorStateL;
    }
    public PorterDuff$Mode getSupportBackgroundTintMode(){
       AppCompatImageView tb = this.b;
       PorterDuff$Mode mode = (tb != null)? tb.d(): null;
       return mode;
    }
    public ColorStateList getSupportImageTintList(){
       AppCompatImageView tc = this.c;
       ColorStateList uColorStateL = (tc != null)? tc.c(): null;
       return uColorStateL;
    }
    public PorterDuff$Mode getSupportImageTintMode(){
       AppCompatImageView tc = this.c;
       PorterDuff$Mode mode = (tc != null)? tc.d(): null;
       return mode;
    }
    public boolean hasOverlappingRendering(){
       boolean b = (this.c.e() && super.hasOverlappingRendering())? true: false;
       return b;
    }
    public void setBackgroundDrawable(Drawable p0){
       super.setBackgroundDrawable(p0);
       AppCompatImageView tb = this.b;
       if (tb != null) {
          tb.f(p0);
       }
       return;
    }
    public void setBackgroundResource(int p0){
       super.setBackgroundResource(p0);
       AppCompatImageView tb = this.b;
       if (tb != null) {
          tb.g(p0);
       }
       return;
    }
    public void setImageBitmap(Bitmap p0){
       super.setImageBitmap(p0);
       AppCompatImageView tc = this.c;
       if (tc != null) {
          tc.b();
       }
       return;
    }
    public void setImageDrawable(Drawable p0){
       super.setImageDrawable(p0);
       AppCompatImageView tc = this.c;
       if (tc != null) {
          tc.b();
       }
       return;
    }
    public void setImageResource(int p0){
       AppCompatImageView tc = this.c;
       if (tc != null) {
          tc.g(p0);
       }
       return;
    }
    public void setImageURI(Uri p0){
       super.setImageURI(p0);
       AppCompatImageView tc = this.c;
       if (tc != null) {
          tc.b();
       }
       return;
    }
    public void setSupportBackgroundTintList(ColorStateList p0){
       AppCompatImageView tb = this.b;
       if (tb != null) {
          tb.i(p0);
       }
       return;
    }
    public void setSupportBackgroundTintMode(PorterDuff$Mode p0){
       AppCompatImageView tb = this.b;
       if (tb != null) {
          tb.j(p0);
       }
       return;
    }
    public void setSupportImageTintList(ColorStateList p0){
       AppCompatImageView tc = this.c;
       if (tc != null) {
          tc.h(p0);
       }
       return;
    }
    public void setSupportImageTintMode(PorterDuff$Mode p0){
       AppCompatImageView tc = this.c;
       if (tc != null) {
          tc.i(p0);
       }
       return;
    }
}
