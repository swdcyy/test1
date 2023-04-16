package com.yxcorp.gifshow.widget.IconifyImageButton;
import rua.a;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.content.Context;
import lnc.a1;
import android.util.AttributeSet;
import android.graphics.drawable.Drawable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import android.widget.ImageView;
import android.graphics.Canvas;
import ll8.c$b;
import android.content.res.TypedArray;
import android.content.res.Resources;

public class IconifyImageButton extends KwaiImageView implements a	// class@001863
{
    public int A;
    public int B;
    public int C;
    public Drawable x;
    public int y;
    public int z;

    public void IconifyImageButton(Context p0){
       super(p0);
       this.B = a1.e(8.00f);
       this.C = a1.e(8.50f);
       this.p0(p0, null);
    }
    public void IconifyImageButton(Context p0,AttributeSet p1){
       super(p0, p1);
       this.B = a1.e(8.00f);
       this.C = a1.e(8.50f);
       this.p0(p0, p1);
    }
    public void IconifyImageButton(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.B = a1.e(8.00f);
       this.C = a1.e(8.50f);
       this.p0(p0, p1);
    }
    public Drawable getDotDrawable(){
       return this.x;
    }
    public int getNumber(){
       return this.y;
    }
    public void i(int p0,int p1){
       if (PatchProxy.isSupport(IconifyImageButton.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, IconifyImageButton.class, "4")) {
          return;
       }
       this.z = p0;
       this.A = p1;
       this.invalidate();
       return;
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, IconifyImageButton.class, "5")) {
          return;
       }
       super.onDraw(p0);
       if (this.y > null) {
          IconifyImageButton tx = this.x;
          if (tx != null) {
             IconifyImageButton tz = this.z;
             if (tz != null || this.A != null) {
                this.x.setBounds(this.z, this.A, (tz + tx.getIntrinsicWidth()), (this.A + this.x.getIntrinsicHeight()));
             }else {
                int intrinsicWid = tx.getIntrinsicWidth();
                int i = (this.getWidth() - a1.e(9.00f)) - intrinsicWid;
                int i1 = a1.e(9.00f);
                this.x.setBounds(i, i1, (intrinsicWid + i), (this.x.getIntrinsicHeight() + i1));
             }
             this.x.draw(p0);
          }
       }
       return;
    }
    public final void p0(Context p0,AttributeSet p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, IconifyImageButton.class, "1")) {
          return;
       }
       if (p1 != null) {
          TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.l1);
          Drawable drawable = typedArray.getDrawable(0);
          typedArray.recycle();
          if (drawable == null) {
             drawable = this.getResources().getDrawable(R.drawable.arg_RES_7f080daa);
          }
          this.x = drawable;
       }
       return;
    }
    public void setDotDrawable(int p0){
       if (PatchProxy.isSupport(IconifyImageButton.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, IconifyImageButton.class, "3")) {
          return;
       }
       Resources resources = this.getResources();
       if (!p0) {
          p0 = 0x7f080daa;
       }
       this.x = resources.getDrawable(p0);
       this.invalidate();
       return;
    }
    public void setNumber(int p0){
       if (PatchProxy.isSupport(IconifyImageButton.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, IconifyImageButton.class, "2")) {
          return;
       }
       if (this.y == p0) {
          return;
       }
       this.y = p0;
       if (this.x == null) {
          this.x = this.getResources().getDrawable(0x7f080daa);
       }
       this.invalidate();
       return;
    }
    public void setXOffset(int p0){
       this.C = p0;
    }
    public void setYOffset(int p0){
       this.B = p0;
    }
}
