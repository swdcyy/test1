package androidx.appcompat.widget.AppCompatImageButton;
import a2.g0;
import e2.k;
import android.widget.ImageButton;
import android.content.Context;
import android.util.AttributeSet;
import w0.v;
import android.view.View;
import w0.s;
import w0.b;
import w0.f;
import android.widget.ImageView;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff$Mode;
import android.graphics.drawable.Drawable;
import android.graphics.Bitmap;
import android.net.Uri;

public class AppCompatImageButton extends ImageButton implements g0, k	// class@0005e5
{
    public final b b;
    public final f c;

    public void AppCompatImageButton(Context p0){
       super(p0, null);
    }
    public void AppCompatImageButton(Context p0,AttributeSet p1){
       super(p0, p1, 0x7f04045b);
    }
    public void AppCompatImageButton(Context p0,AttributeSet p1,int p2){
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
       AppCompatImageButton tb = this.b;
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
       AppCompatImageButton tb = this.b;
       ColorStateList uColorStateL = (tb != null)? tb.c(): null;
       return uColorStateL;
    }
    public PorterDuff$Mode getSupportBackgroundTintMode(){
       AppCompatImageButton tb = this.b;
       PorterDuff$Mode mode = (tb != null)? tb.d(): null;
       return mode;
    }
    public ColorStateList getSupportImageTintList(){
       AppCompatImageButton tc = this.c;
       ColorStateList uColorStateL = (tc != null)? tc.c(): null;
       return uColorStateL;
    }
    public PorterDuff$Mode getSupportImageTintMode(){
       AppCompatImageButton tc = this.c;
       PorterDuff$Mode mode = (tc != null)? tc.d(): null;
       return mode;
    }
    public boolean hasOverlappingRendering(){
       boolean b = (this.c.e() && super.hasOverlappingRendering())? true: false;
       return b;
    }
    public void setBackgroundDrawable(Drawable p0){
       super.setBackgroundDrawable(p0);
       AppCompatImageButton tb = this.b;
       if (tb != null) {
          tb.f(p0);
       }
       return;
    }
    public void setBackgroundResource(int p0){
       super.setBackgroundResource(p0);
       AppCompatImageButton tb = this.b;
       if (tb != null) {
          tb.g(p0);
       }
       return;
    }
    public void setImageBitmap(Bitmap p0){
       super.setImageBitmap(p0);
       AppCompatImageButton tc = this.c;
       if (tc != null) {
          tc.b();
       }
       return;
    }
    public void setImageDrawable(Drawable p0){
       super.setImageDrawable(p0);
       AppCompatImageButton tc = this.c;
       if (tc != null) {
          tc.b();
       }
       return;
    }
    public void setImageResource(int p0){
       this.c.g(p0);
    }
    public void setImageURI(Uri p0){
       super.setImageURI(p0);
       AppCompatImageButton tc = this.c;
       if (tc != null) {
          tc.b();
       }
       return;
    }
    public void setSupportBackgroundTintList(ColorStateList p0){
       AppCompatImageButton tb = this.b;
       if (tb != null) {
          tb.i(p0);
       }
       return;
    }
    public void setSupportBackgroundTintMode(PorterDuff$Mode p0){
       AppCompatImageButton tb = this.b;
       if (tb != null) {
          tb.j(p0);
       }
       return;
    }
    public void setSupportImageTintList(ColorStateList p0){
       AppCompatImageButton tc = this.c;
       if (tc != null) {
          tc.h(p0);
       }
       return;
    }
    public void setSupportImageTintMode(PorterDuff$Mode p0){
       AppCompatImageButton tc = this.c;
       if (tc != null) {
          tc.i(p0);
       }
       return;
    }
}
