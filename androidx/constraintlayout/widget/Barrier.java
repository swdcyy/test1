package androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintHelper;
import android.content.Context;
import android.view.View;
import android.util.AttributeSet;
import androidx.constraintlayout.solver.widgets.a;
import ll8.c$b;
import android.content.res.TypedArray;
import androidx.constraintlayout.widget.a$a;
import h1.b;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import android.util.SparseArray;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.d;
import androidx.constraintlayout.widget.a$b;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import cw9.c;

public class Barrier extends ConstraintHelper	// class@0006ae
{
    public int k;
    public int l;
    public a m;

    public void Barrier(Context p0){
       super(p0);
       super.setVisibility(8);
    }
    public void Barrier(Context p0,AttributeSet p1){
       super(p0, p1);
       super.setVisibility(8);
    }
    public void Barrier(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       super.setVisibility(8);
    }
    public int getMargin(){
       return this.m.j1();
    }
    public int getType(){
       return this.k;
    }
    public void o(AttributeSet p0){
       super.o(p0);
       this.m = new a();
       if (p0 != null) {
          TypedArray typedArray = this.getContext().obtainStyledAttributes(p0, c$b.a0);
          int indexCount = typedArray.getIndexCount();
          int i = 0;
          while (i < indexCount) {
             int index = typedArray.getIndex(i);
             if (index == 15) {
                this.setType(typedArray.getInt(index, 0));
             }else if(index == 14){
                this.m.m1(typedArray.getBoolean(index, true));
             }else if(index == 16){
                this.m.o1(typedArray.getDimensionPixelSize(index, 0));
             }
             i = i + 1;
          }
          typedArray.recycle();
       }
       this.e = this.m;
       this.w();
       return;
    }
    public void p(a$a p0,b p1,ConstraintLayout$LayoutParams p2,SparseArray p3){
       super.p(p0, p1, p2, p3);
       if (p1 instanceof a) {
          ConstraintWidget uConstraintW = p1;
          this.y(uConstraintW, p0.d.b0, p1.L().B1());
          uConstraintW.m1(p0.d.j0);
          uConstraintW.o1(p0.d.c0);
       }
       return;
    }
    public void r(ConstraintWidget p0,boolean p1){
       this.y(p0, this.k, p1);
    }
    public void setAllowsGoneWidget(boolean p0){
       this.m.m1(p0);
    }
    public void setDpMargin(int p0){
       this.m.o1((int)(((float)p0 * c.c(this.getResources()).density) + 0x3f000000));
    }
    public void setMargin(int p0){
       this.m.o1(p0);
    }
    public void setType(int p0){
       this.k = p0;
    }
    public boolean x(){
       return this.m.h1();
    }
    public final void y(ConstraintWidget p0,int p1,boolean p2){
       Barrier tk;
       this.l = p1;
       p1 = 1;
       if (p2) {
          tk = this.k;
          if (tk == 5) {
             this.l = p1;
          }else if(tk == 6){
             this.l = 0;
          }
       }else {
          tk = this.k;
          if (tk == 5) {
             this.l = 0;
          }else if(tk == 6){
             this.l = p1;
          }
       }
       if (p0 instanceof a) {
          p0.n1(this.l);
       }
       return;
    }
}
