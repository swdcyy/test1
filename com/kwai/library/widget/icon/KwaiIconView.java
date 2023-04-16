package com.kwai.library.widget.icon.KwaiIconView;
import androidx.appcompat.widget.AppCompatImageView;
import android.content.Context;
import android.util.AttributeSet;
import java.util.concurrent.atomic.AtomicBoolean;
import ll8.c$b;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import r0.a;
import android.content.res.Resources;
import android.widget.ImageView;
import android.content.res.Configuration;
import pd6.b;
import android.view.View;
import uz6.b;
import android.graphics.Canvas;

public class KwaiIconView extends AppCompatImageView	// class@000943
{
    public int d;
    public boolean e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public boolean k;
    public int l;
    public AtomicBoolean m;

    public void KwaiIconView(Context p0){
       super(p0, null);
    }
    public void KwaiIconView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void KwaiIconView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       p2 = 0;
       this.l = p2;
       this.m = new AtomicBoolean(p2);
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.T1);
       this.d = typedArray.getResourceId(p2, p2);
       this.l = typedArray.getInt(7, p2);
       this.e = typedArray.getBoolean(1, p2);
       int dimensionPix = typedArray.getDimensionPixelSize(2, p2);
       this.f = dimensionPix;
       if (dimensionPix <= 0) {
          this.g = typedArray.getDimensionPixelSize(4, p2);
          this.h = typedArray.getDimensionPixelSize(6, p2);
          this.i = typedArray.getDimensionPixelSize(5, p2);
          p2 = typedArray.getDimensionPixelSize(3, p2);
          this.j = p2;
          if (this.g <= null && (this.h <= null && (this.i > null || p2 > 0))) {
             this.k = true;
          }
       }else {
          this.j = dimensionPix;
          this.i = dimensionPix;
          this.h = dimensionPix;
          this.g = dimensionPix;
       }
       typedArray.recycle();
       return;
    }
    public KwaiIconView a(int p0){
       this.d = p0;
       if (p0) {
          this.setImageDrawable(a.d(this.getCompatUiModeContext(), this.d));
       }
       return this;
    }
    public KwaiIconView c(int p0,int p1){
       this.l = p1;
       this.a(p0);
       return this;
    }
    public final Context getCompatUiModeContext(){
       if (this.l == null) {
          return this.getContext();
       }
       Configuration configuratio = this.getResources().getConfiguration();
       int i = (this.l == 2)? 32: 16;
       Configuration uConfigurati = new Configuration(configuratio);
       uConfigurati.uiMode = i;
       return b.a(this.getContext(), uConfigurati);
    }
    public void onAttachedToWindow(){
       super.onAttachedToWindow();
       if (!this.m.getAndSet(true)) {
          this.a(this.d);
          if (this.e != null) {
             b.c(this);
          }
       }
       return;
    }
    public void onDraw(Canvas p0){
       Drawable drawable = this.getDrawable();
       if (this.k != null && drawable != null) {
          drawable.setBounds(this.g, this.h, (((this.getWidth() - this.getPaddingLeft()) - this.getPaddingRight()) - this.i), (((this.getHeight() - this.getPaddingTop()) - this.getPaddingBottom()) - this.j));
       }
       super.onDraw(p0);
       return;
    }
    public void setIconMargin(int p0){
       boolean b = (p0 > 0)? true: false;
       this.k = b;
       this.j = p0;
       this.i = p0;
       this.h = p0;
       this.g = p0;
       this.f = p0;
       this.invalidate();
       return;
    }
    public void setIconPressed(boolean p0){
       if (p0 && this.e == null) {
          this.e = true;
          b.c(this);
       }
       return;
    }
}
