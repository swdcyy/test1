package androidx.constraintlayout.motion.widget.MotionHelper;
import e1.a;
import androidx.constraintlayout.motion.widget.MotionLayout$i;
import androidx.constraintlayout.widget.ConstraintHelper;
import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.motion.widget.MotionLayout;
import android.view.View;
import ll8.c$b;
import android.content.res.TypedArray;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.view.ViewGroup;

public class MotionHelper extends ConstraintHelper implements a, MotionLayout$i	// class@000666
{
    public boolean k;
    public boolean l;
    public float m;
    public View[] n;

    public void MotionHelper(Context p0){
       super(p0);
       this.k = false;
       this.l = false;
    }
    public void MotionHelper(Context p0,AttributeSet p1){
       super(p0, p1);
       this.k = false;
       this.l = false;
       this.o(p1);
    }
    public void MotionHelper(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.k = false;
       this.l = false;
       this.o(p1);
    }
    public void a(MotionLayout p0,int p1,int p2,float p3){
    }
    public void b(MotionLayout p0,int p1,int p2){
    }
    public void c(MotionLayout p0,int p1){
    }
    public void d(MotionLayout p0,int p1,boolean p2,float p3){
    }
    public float getProgress(){
       return this.m;
    }
    public void o(AttributeSet p0){
       super.o(p0);
       if (p0 != null) {
          TypedArray typedArray = this.getContext().obtainStyledAttributes(p0, c$b.y3);
          int indexCount = typedArray.getIndexCount();
          int i = 0;
          while (i < indexCount) {
             int index = typedArray.getIndex(i);
             if (index == 1) {
                this.k = typedArray.getBoolean(index, this.k);
             }else if(!index){
                this.l = typedArray.getBoolean(index, this.l);
             }
             i = i + 1;
          }
          typedArray.recycle();
       }
       return;
    }
    public void setProgress(float p0){
       this.m = p0;
       int i = 0;
       if (this.c > null) {
          this.n = this.n(this.getParent());
          for (; i < this.c; i = i + 1) {
          }
       }else {
          ViewGroup parent = this.getParent();
          int childCount = parent.getChildCount();
          for (; i < childCount; i = i + 1) {
          }
       }
       return;
    }
    public boolean x(){
       return this.l;
    }
    public boolean y(){
       return this.k;
    }
}
