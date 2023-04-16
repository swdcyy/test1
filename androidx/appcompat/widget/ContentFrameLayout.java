package androidx.appcompat.widget.ContentFrameLayout;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.Rect;
import android.view.View;
import a2.i0;
import android.util.TypedValue;
import android.view.ViewGroup;
import androidx.appcompat.widget.ContentFrameLayout$a;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import cw9.c;
import android.view.View$MeasureSpec;
import java.lang.Math;

public class ContentFrameLayout extends FrameLayout	// class@0005fc
{
    public TypedValue b;
    public TypedValue c;
    public TypedValue d;
    public TypedValue e;
    public TypedValue f;
    public TypedValue g;
    public final Rect h;
    public ContentFrameLayout$a i;

    public void ContentFrameLayout(Context p0){
       super(p0, null);
    }
    public void ContentFrameLayout(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void ContentFrameLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.h = new Rect();
    }
    public void a(int p0,int p1,int p2,int p3){
       this.h.set(p0, p1, p2, p3);
       if (i0.Y(this)) {
          this.requestLayout();
       }
       return;
    }
    public TypedValue getFixedHeightMajor(){
       if (this.f == null) {
          this.f = new TypedValue();
       }
       return this.f;
    }
    public TypedValue getFixedHeightMinor(){
       if (this.g == null) {
          this.g = new TypedValue();
       }
       return this.g;
    }
    public TypedValue getFixedWidthMajor(){
       if (this.d == null) {
          this.d = new TypedValue();
       }
       return this.d;
    }
    public TypedValue getFixedWidthMinor(){
       if (this.e == null) {
          this.e = new TypedValue();
       }
       return this.e;
    }
    public TypedValue getMinWidthMajor(){
       if (this.b == null) {
          this.b = new TypedValue();
       }
       return this.b;
    }
    public TypedValue getMinWidthMinor(){
       if (this.c == null) {
          this.c = new TypedValue();
       }
       return this.c;
    }
    public void onAttachedToWindow(){
       super.onAttachedToWindow();
       ContentFrameLayout ti = this.i;
       if (ti != null) {
          ti.a();
       }
       return;
    }
    public void onDetachedFromWindow(){
       super.onDetachedFromWindow();
       ContentFrameLayout ti = this.i;
       if (ti != null) {
          ti.onDetachedFromWindow();
       }
       return;
    }
    public void onMeasure(int p0,int p1){
       float dimension;
       int i1;
       float dimension1;
       float dimension2;
       int i2;
       DisplayMetrics heightPixels;
       float f1;
       DisplayMetrics uDisplayMetr = c.c(this.getContext().getResources());
       int i = 1;
       ContentFrameLayout uContentFram = (uDisplayMetr.widthPixels < uDisplayMetr.heightPixels)? 1: null;
       int mode = View$MeasureSpec.getMode(p0);
       int mode1 = View$MeasureSpec.getMode(p1);
       if (mode == Integer.MIN_VALUE) {
          ContentFrameLayout te = (uContentFram)? this.e: this.d;
          if (te != null) {
             TypedValue type = te.type;
             if (type != null) {
                if (type == 5) {
                   dimension = te.getDimension(uDisplayMetr);
                }else if(type == 6){
                   heightPixels = uDisplayMetr.widthPixels;
                   f1 = (float)heightPixels;
                   dimension = te.getFraction(f1, (float)heightPixels);
                }else {
                   i1 = 0;
                label_0048 :
                   if (i1 > 0) {
                      ContentFrameLayout th = this.h;
                      p0 = View$MeasureSpec.makeMeasureSpec(Math.min((i1 - (th.left + th.right)), View$MeasureSpec.getSize(p0)), 0x40000000);
                      i1 = 1;
                   label_0061 :
                      if (mode1 == Integer.MIN_VALUE) {
                         ContentFrameLayout tf = (uContentFram)? this.f: this.g;
                         if (tf != null) {
                            type = tf.type;
                            if (type != null) {
                               if (type == 5) {
                                  dimension1 = tf.getDimension(uDisplayMetr);
                               }else if(type == 6){
                                  heightPixels = uDisplayMetr.heightPixels;
                                  f1 = (float)heightPixels;
                                  dimension1 = tf.getFraction(f1, (float)heightPixels);
                               }else {
                                  mode1 = 0;
                               label_0084 :
                                  if (mode1 > 0) {
                                     th = this.h;
                                     p1 = View$MeasureSpec.makeMeasureSpec(Math.min((mode1 - (th.top + th.bottom)), View$MeasureSpec.getSize(p1)), 0x40000000);
                                  }
                               }
                               mode1 = (int)dimension1;
                               goto label_0084 ;
                            }
                         }
                      }
                   label_009a :
                      super.onMeasure(p0, p1);
                      p0 = this.getMeasuredWidth();
                      mode1 = View$MeasureSpec.makeMeasureSpec(p0, 0x40000000);
                      if (!i1 && mode == Integer.MIN_VALUE) {
                         uContentFram = (uContentFram)? this.c: this.b;
                         if (uContentFram != null) {
                            TypedValue type1 = uContentFram.type;
                            if (type1 != null) {
                               if (type1 == 5) {
                                  dimension2 = uContentFram.getDimension(uDisplayMetr);
                               }else if(type1 == 6){
                                  uDisplayMetr = uDisplayMetr.widthPixels;
                                  float f = (float)uDisplayMetr;
                                  dimension2 = uContentFram.getFraction(f, (float)uDisplayMetr);
                               }else {
                                  i2 = 0;
                               label_00ca :
                                  if (i2 > 0) {
                                     uContentFram = this.h;
                                     i2 = i2 - (uContentFram.left + uContentFram.right);
                                  }
                                  if (p0 < i2) {
                                     mode1 = View$MeasureSpec.makeMeasureSpec(i2, 0x40000000);
                                  label_00dc :
                                     if (i) {
                                        super.onMeasure(mode1, p1);
                                     }
                                     return;
                                  }
                               }
                               i2 = (int)dimension2;
                               goto label_00ca ;
                            }
                         }
                      }
                   label_00db :
                      i = 0;
                      goto label_00dc ;
                   }
                }
                i1 = (int)dimension;
                goto label_0048 ;
             }
          }
       }
    label_0060 :
       i1 = 0;
       goto label_0061 ;
    }
    public void setAttachListener(ContentFrameLayout$a p0){
       this.i = p0;
    }
}
