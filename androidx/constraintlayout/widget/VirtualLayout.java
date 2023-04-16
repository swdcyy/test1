package androidx.constraintlayout.widget.VirtualLayout;
import androidx.constraintlayout.widget.ConstraintHelper;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import ll8.c$b;
import android.content.res.TypedArray;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.solver.widgets.h;

public abstract class VirtualLayout extends ConstraintHelper	// class@0006bd
{
    public boolean k;
    public boolean l;

    public void VirtualLayout(Context p0){
       super(p0);
    }
    public void VirtualLayout(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void VirtualLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void o(AttributeSet p0){
       super.o(p0);
       if (p0 != null) {
          TypedArray typedArray = this.getContext().obtainStyledAttributes(p0, c$b.a0);
          int indexCount = typedArray.getIndexCount();
          int i = 0;
          while (i < indexCount) {
             int index = typedArray.getIndex(i);
             if (index == 6) {
                this.k = true;
             }else if(index == 13){
                this.l = true;
             }
             i = i + 1;
          }
          typedArray.recycle();
       }
       return;
    }
    public void onAttachedToWindow(){
       super.onAttachedToWindow();
       if (this.k != null || this.l != null) {
          ViewParent parent = this.getParent();
          if (parent != null && parent instanceof ConstraintLayout) {
             int visibility = this.getVisibility();
             float elevation = this.getElevation();
             int i = 0;
             while (i < this.c) {
                View viewById = parent.getViewById(this.b[i]);
                if (viewById != null) {
                   if (this.k != null) {
                      viewById.setVisibility(visibility);
                   }
                   if (this.l != null && elevation > 0) {
                      float f = viewById.getTranslationZ() + elevation;
                      viewById.setTranslationZ(f);
                   }
                }
             label_0046 :
                i = i + 1;
             }
          }
       }
       return;
    }
    public void setElevation(float p0){
       super.setElevation(p0);
       this.i();
    }
    public void setVisibility(int p0){
       super.setVisibility(p0);
       this.i();
    }
    public void x(h p0,int p1,int p2){
    }
}
