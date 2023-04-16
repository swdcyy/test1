package com.kwai.library.widget.star.KwaiRatingStarView;
import android.view.View;
import android.content.Context;
import android.util.AttributeSet;
import ll8.c$b;
import android.content.res.TypedArray;
import d27.b;
import java.lang.String;
import java.lang.Object;
import java.util.Map;
import java.lang.ref.WeakReference;
import android.graphics.Path;
import e27.a$b;
import e27.a;
import e27.a$a;
import e27.b;
import android.graphics.Paint;
import android.graphics.Paint$Style;
import android.graphics.LinearGradient;
import d27.a;
import android.graphics.Shader$TileMode;
import android.graphics.Canvas;
import java.lang.Math;
import android.graphics.Shader;
import android.view.View$MeasureSpec;
import android.view.MotionEvent;
import com.kwai.library.widget.star.KwaiRatingStarView$a;

public class KwaiRatingStarView extends View	// class@000a2b
{
    public int b;
    public float c;
    public int d;
    public int e;
    public int f;
    public int g;
    public LinearGradient[] h;
    public int i;
    public Paint j;
    public Paint k;
    public Path l;
    public KwaiRatingStarView$a m;

    public void KwaiRatingStarView(Context p0){
       super(p0);
       this.b = 0;
       this.d = 0;
       this.h = null;
       this.a(null, 0);
    }
    public void KwaiRatingStarView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.b = 0;
       this.d = 0;
       this.h = null;
       this.a(p1, 0);
    }
    public void KwaiRatingStarView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = 0;
       this.d = 0;
       this.h = null;
       this.a(p1, p2);
    }
    public final void a(AttributeSet p0,int p1){
       Path path;
       Paint paint;
       KwaiRatingStarView tg;
       LinearGradient[] linearGradie;
       a uoa;
       float f;
       float f1;
       float f2;
       int i1;
       int i2;
       float f3;
       LinearGradient linearGradie1;
       int i = 0;
       TypedArray typedArray = this.getContext().obtainStyledAttributes(p0, c$b.e2, p1, i);
       this.b = typedArray.getDimensionPixelOffset(1, this.b);
       this.c = typedArray.getFloat(3, 0);
       this.d = typedArray.getInt(i, i);
       this.e = typedArray.getColor(6, i);
       this.f = typedArray.getColor(4, i);
       this.g = typedArray.getColor(5, i);
       this.i = typedArray.getDimensionPixelOffset(2, i);
       typedArray.recycle();
       KwaiRatingStarView ti = this.i;
       String str = String.valueOf(ti);
       Map b = b.b;
       if (b.containsKey(str)) {
          WeakReference weakReferenc = b.get(str);
          if (weakReferenc != null && weakReferenc.get() != null) {
             path = weakReferenc.get();
          }else {
             b.remove(str);
          label_0069 :
             a$b uob = new a$b();
             uob.a = 9;
             uob.b = 9;
             uob.c = ti;
             uob.d = ti;
             a$a uoa1 = null;
             int i3 = 9;
             int i4 = 9;
             a uoa2 = uob;
             KwaiRatingStarView kwaiRatingSt = ti;
             try{
                uoa2 = new a(i3, i4, kwaiRatingSt, ti, uoa1);
                Path path1 = uob.d("M6.3271,2.82466L8.52757,3.14587C8.80082,3.18576 8.98999,3.43961 8.9501,3.71285C8.93421,3.82173 8.88285,3.92232 8.80398,3.99903L7.21334,5.54633C7.09522,5.66123 7.0413,5.82695 7.06919,5.98936L7.44459,8.17533C7.49133,8.44749 7.30859,8.70601 7.03643,8.75275C6.92809,8.77135 6.81664,8.75374 6.71932,8.70262L4.75122,7.66895C4.60566,7.5925 4.43181,7.5925 4.28624,7.66895L2.31815,8.70262C2.07367,8.83102 1.7714,8.73693 1.643,8.49245C1.59188,8.39513 1.57427,8.28368 1.59287,8.17533L1.96827,5.98936C1.99616,5.82695 1.94224,5.66123 1.82412,5.54633L0.23348,3.99903C0.03554,3.80649 0.03117,3.48994 0.22371,3.292C0.30043,3.21313 0.40102,3.16177 0.50989,3.14587L2.71037,2.82466C2.87299,2.80092 3.01356,2.69878 3.08638,2.55144L4.07049,0.5603C4.19284,0.31275 4.49272,0.21125 4.74027,0.33361C4.83867,0.38224 4.91834,0.4619 4.96697,0.5603L5.95108,2.55144C6.0239,2.69878 6.16447,2.80092 6.3271,2.82466Z");
                b.put(str, new WeakReference(path1));
                path = path1;
             }catch(java.lang.Exception e0){
                path = new Path();
             }
          }
       }else {
          goto label_0069 ;
       }
    }
    public void onDraw(Canvas p0){
       p0.save();
       float f = (float)this.getPaddingLeft();
       int i = Math.round((this.c * (float)this.d));
       for (int i1 = 0; i1 < this.d; i1 = i1 + 1) {
          p0.translate(f, 0);
          if (i1 < i) {
             KwaiRatingStarView th = this.h;
             if (th != null) {
                this.j.setShader(th[i1]);
             }
             p0.drawPath(this.l, this.j);
          }else {
             p0.drawPath(this.l, this.k);
          }
          int i2 = this.b + this.i;
          f = (float)i2;
       }
       p0.restore();
       return;
    }
    public void onMeasure(int p0,int p1){
       KwaiRatingStarView kwaiRatingSt1;
       KwaiRatingStarView ti = this.i;
       if (ti == null) {
          ti = (View$MeasureSpec.getSize(p1) - this.getPaddingTop()) - this.getPaddingBottom();
       }
       this.i = ti;
       int mode = View$MeasureSpec.getMode(p0);
       p0 = View$MeasureSpec.getSize(p0);
       KwaiRatingStarView kwaiRatingSt = 0x40000000;
       if (mode != kwaiRatingSt) {
          int i = this.getPaddingLeft() + this.getPaddingRight();
          KwaiRatingStarView td = this.d;
          if (td > null) {
             i = (i + (this.b * (td - 1))) + (this.i * td);
          }
          if (mode == Integer.MIN_VALUE) {
             p0 = Math.min(p0, i);
          }else {
             p0 = i;
          }
       }
       mode = View$MeasureSpec.getMode(p1);
       p1 = View$MeasureSpec.getSize(p1);
       if (mode != kwaiRatingSt) {
          kwaiRatingSt = this.i;
          p1 = (mode == Integer.MIN_VALUE)? Math.min(p1, kwaiRatingSt): kwaiRatingSt;
       }
    label_0059 :
       this.setMeasuredDimension(p0, p1);
       return;
    }
    public boolean onTouchEvent(MotionEvent p0){
       int action = p0.getAction();
       if (action) {
          if (action != 1) {
             return super.onTouchEvent(p0);
          }else {
             int i = (int)Math.floor((double)((p0.getX() * (float)this.d) / (float)this.getMeasuredWidth())) + 1;
             if (i == -1.#Rf) {
                return 1;
             }else {
                float f = 0x3f800000;
                KwaiRatingStarView td = this.d;
                if (!(((float)i * f) / (float)td) - this.c) {
                   i--;
                }
                this.setProgress((((float)i * f) / (float)td));
                KwaiRatingStarView tm = this.m;
                if (tm != null) {
                   tm.a(i);
                }
             }
          }
       }
       return 1;
    }
    public void setMarginHorizontal(int p0){
       if (this.b != p0) {
          this.b = p0;
          this.requestLayout();
          this.invalidate();
       }
       return;
    }
    public void setOnSelectListener(KwaiRatingStarView$a p0){
       this.m = p0;
    }
    public void setProgress(float p0){
       if (p0 - this.c) {
          if (p0 < 0) {
             p0 = 0;
          }else if(p0 - 0x3f800000 > 0){
             p0 = 0x3f800000;
          }
          this.c = p0;
          this.invalidate();
       }
       return;
    }
    public void setStarCount(int p0){
       if (this.d != p0) {
          this.d = p0;
          this.requestLayout();
          this.invalidate();
       }
       return;
    }
}
