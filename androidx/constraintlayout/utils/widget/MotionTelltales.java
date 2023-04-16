package androidx.constraintlayout.utils.widget.MotionTelltales;
import androidx.constraintlayout.utils.widget.MockView;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Matrix;
import android.util.AttributeSet;
import ll8.c$b;
import android.content.res.TypedArray;
import android.view.View;
import android.graphics.Canvas;
import android.view.ViewParent;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.lang.CharSequence;
import java.lang.String;

public class MotionTelltales extends MockView	// class@0006ad
{
    public Paint m;
    public MotionLayout n;
    public float[] o;
    public Matrix p;
    public int q;
    public int r;
    public float s;

    public void MotionTelltales(Context p0){
       super(p0);
       this.m = new Paint();
       float[] uofloatArray = new float[2];
       this.o = uofloatArray;
       this.p = new Matrix();
       this.q = 0;
       this.r = -65281;
       this.s = 0.25f;
       this.a(p0, null);
    }
    public void MotionTelltales(Context p0,AttributeSet p1){
       super(p0, p1);
       this.m = new Paint();
       float[] uofloatArray = new float[2];
       this.o = uofloatArray;
       this.p = new Matrix();
       this.q = 0;
       this.r = -65281;
       this.s = 0.25f;
       this.a(p0, p1);
    }
    public void MotionTelltales(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.m = new Paint();
       float[] uofloatArray = new float[2];
       this.o = uofloatArray;
       this.p = new Matrix();
       this.q = 0;
       this.r = -65281;
       this.s = 0.25f;
       this.a(p0, p1);
    }
    private void a(Context p0,AttributeSet p1){
       if (p1 != null) {
          TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.B3);
          int indexCount = typedArray.getIndexCount();
          int i = 0;
          while (i < indexCount) {
             int index = typedArray.getIndex(i);
             if (!index) {
                this.r = typedArray.getColor(index, this.r);
             }else if(index == 2){
                this.q = typedArray.getInt(index, this.q);
             }else if(index == 1){
                this.s = typedArray.getFloat(index, this.s);
             }
             i = i + 1;
          }
          typedArray.recycle();
       }
       this.m.setColor(this.r);
       this.m.setStrokeWidth(5.00f);
       return;
    }
    public void onAttachedToWindow(){
       super.onAttachedToWindow();
    }
    public void onDraw(Canvas p0){
       MotionTelltales motionTellta = this;
       super.onDraw(p0);
       this.getMatrix().invert(motionTellta.p);
       if (motionTellta.n == null) {
          ViewParent parent = this.getParent();
          if (parent instanceof MotionLayout) {
             motionTellta.n = parent;
          }
          return;
       }else {
          int width = this.getWidth();
          int height = this.getHeight();
          float[] uofloatArray = new float[5]{0x3dcccccd,0x3e800000,0x3f000000,0x3f400000,0x3f666666};
          int i = 0;
          while (i < 5) {
             int i1 = uofloatArray[i];
             for (int i2 = 0; i2 < 5; i2 = i2 + 1) {
                int i3 = uofloatArray[i2];
                motionTellta.n.X(this, i3, i1, motionTellta.o, motionTellta.q);
                motionTellta.p.mapVectors(motionTellta.o);
                float f = (float)width * i3;
                float f1 = (float)height * i1;
                MotionTelltales o = motionTellta.o;
                MotionTelltales s = motionTellta.s;
                float f2 = o[0] * s;
                float f3 = f - f2;
                f2 = o[1] * s;
                float f4 = f1 - f2;
                motionTellta.p.mapVectors(o);
                p0.drawLine(f, f1, f3, f4, motionTellta.m);
             }
             i = i + 1;
          }
          return;
       }
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       super.onLayout(p0, p1, p2, p3, p4);
       this.postInvalidate();
    }
    public void setText(CharSequence p0){
       this.g = p0.toString();
       this.requestLayout();
    }
}
