package androidx.constraintlayout.widget.Constraints$LayoutParams;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import android.content.Context;
import android.util.AttributeSet;
import ll8.c$b;
import android.content.res.TypedArray;

public class Constraints$LayoutParams extends ConstraintLayout$LayoutParams	// class@0006b8
{
    public float A0;
    public float B0;
    public float p0;
    public boolean q0;
    public float r0;
    public float s0;
    public float t0;
    public float u0;
    public float v0;
    public float w0;
    public float x0;
    public float y0;
    public float z0;

    public void Constraints$LayoutParams(int p0,int p1){
       super(p0, p1);
       this.p0 = 0x3f800000;
       this.q0 = false;
       this.r0 = 0;
       this.s0 = 0;
       this.t0 = 0;
       this.u0 = 0;
       this.v0 = 0x3f800000;
       this.w0 = 0x3f800000;
       this.x0 = 0;
       this.y0 = 0;
       this.z0 = 0;
       this.A0 = 0;
       this.B0 = 0;
    }
    public void Constraints$LayoutParams(Context p0,AttributeSet p1){
       super(p0, p1);
       this.p0 = 0x3f800000;
       boolean b = false;
       this.q0 = b;
       float f = 0;
       this.r0 = f;
       this.s0 = f;
       this.t0 = f;
       this.u0 = f;
       this.v0 = 0x3f800000;
       this.w0 = 0x3f800000;
       this.x0 = f;
       this.y0 = f;
       this.z0 = f;
       this.A0 = f;
       this.B0 = f;
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.c0);
       int indexCount = typedArray.getIndexCount();
       while (b < indexCount) {
          int index = typedArray.getIndex(b);
          if (index == 15) {
             this.p0 = typedArray.getFloat(index, this.p0);
          }else if(index == 28){
             this.r0 = typedArray.getFloat(index, this.r0);
             this.q0 = true;
          }else if(index == 23){
             this.t0 = typedArray.getFloat(index, this.t0);
          }else if(index == 24){
             this.u0 = typedArray.getFloat(index, this.u0);
          }else if(index == 22){
             this.s0 = typedArray.getFloat(index, this.s0);
          }else if(index == 20){
             this.v0 = typedArray.getFloat(index, this.v0);
          }else if(index == 21){
             this.w0 = typedArray.getFloat(index, this.w0);
          }else if(index == 16){
             this.x0 = typedArray.getFloat(index, this.x0);
          }else if(index == 17){
             this.y0 = typedArray.getFloat(index, this.y0);
          }else if(index == 18){
             this.z0 = typedArray.getFloat(index, this.z0);
          }else if(index == 19){
             this.A0 = typedArray.getFloat(index, this.A0);
          }else if(index == 27){
             this.B0 = typedArray.getFloat(index, this.B0);
          }
          b = b + 1;
       }
       typedArray.recycle();
       return;
    }
    public void Constraints$LayoutParams(Constraints$LayoutParams p0){
       super(p0);
       this.p0 = 0x3f800000;
       this.q0 = false;
       this.r0 = 0;
       this.s0 = 0;
       this.t0 = 0;
       this.u0 = 0;
       this.v0 = 0x3f800000;
       this.w0 = 0x3f800000;
       this.x0 = 0;
       this.y0 = 0;
       this.z0 = 0;
       this.A0 = 0;
       this.B0 = 0;
    }
}
