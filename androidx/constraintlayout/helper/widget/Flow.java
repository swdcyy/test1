package androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.VirtualLayout;
import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.solver.widgets.e;
import android.view.View;
import ll8.c$b;
import android.content.res.TypedArray;
import androidx.constraintlayout.solver.widgets.h;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.a$a;
import h1.b;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import android.util.SparseArray;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import android.view.View$MeasureSpec;

public class Flow extends VirtualLayout	// class@000664
{
    public e m;

    public void Flow(Context p0){
       super(p0);
    }
    public void Flow(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void Flow(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void o(AttributeSet p0){
       super.o(p0);
       this.m = new e();
       if (p0 != null) {
          TypedArray typedArray = this.getContext().obtainStyledAttributes(p0, c$b.a0);
          int indexCount = typedArray.getIndexCount();
          int i = 0;
          while (i < indexCount) {
             int index = typedArray.getIndex(i);
             if (!index) {
                this.m.U1(typedArray.getInt(index, 0));
             }else if(index == 1){
                this.m.u1(typedArray.getDimensionPixelSize(index, 0));
             }else if(index == 11){
                this.m.z1(typedArray.getDimensionPixelSize(index, 0));
             }else if(index == 12){
                this.m.w1(typedArray.getDimensionPixelSize(index, 0));
             }else {
                Flow uFlow = 2;
                if (index == uFlow) {
                   this.m.x1(typedArray.getDimensionPixelSize(index, 0));
                }else if(index == 3){
                   this.m.A1(typedArray.getDimensionPixelSize(index, 0));
                }else if(index == 4){
                   this.m.y1(typedArray.getDimensionPixelSize(index, 0));
                }else if(index == 5){
                   this.m.v1(typedArray.getDimensionPixelSize(index, 0));
                }else if(index == 38){
                   this.m.Z1(typedArray.getInt(index, 0));
                }else if(index == 28){
                   this.m.O1(typedArray.getInt(index, 0));
                }else if(index == 37){
                   this.m.Y1(typedArray.getInt(index, 0));
                }else if(index == 22){
                   this.m.I1(typedArray.getInt(index, 0));
                }else if(index == 30){
                   this.m.Q1(typedArray.getInt(index, 0));
                }else if(index == 24){
                   this.m.K1(typedArray.getInt(index, 0));
                }else if(index == 32){
                   this.m.S1(typedArray.getInt(index, 0));
                }else if(index == 26){
                   this.m.M1(typedArray.getFloat(index, 0x3f000000));
                }else if(index == 21){
                   this.m.H1(typedArray.getFloat(index, 0x3f000000));
                }else if(index == 29){
                   this.m.P1(typedArray.getFloat(index, 0x3f000000));
                }else if(index == 23){
                   this.m.J1(typedArray.getFloat(index, 0x3f000000));
                }else if(index == 31){
                   this.m.R1(typedArray.getFloat(index, 0x3f000000));
                }else if(index == 35){
                   this.m.W1(typedArray.getFloat(index, 0x3f000000));
                }else if(index == 25){
                   this.m.L1(typedArray.getInt(index, uFlow));
                }else if(index == 34){
                   this.m.V1(typedArray.getInt(index, uFlow));
                }else if(index == 27){
                   this.m.N1(typedArray.getDimensionPixelSize(index, 0));
                }else if(index == 36){
                   this.m.X1(typedArray.getDimensionPixelSize(index, 0));
                }else if(index == 33){
                   this.m.T1(typedArray.getInt(index, -1));
                }
             }
             i = i + 1;
          }
          typedArray.recycle();
       }
       this.e = this.m;
       this.w();
       return;
    }
    public void onMeasure(int p0,int p1){
       this.x(this.m, p0, p1);
    }
    public void p(a$a p0,b p1,ConstraintLayout$LayoutParams p2,SparseArray p3){
       super.p(p0, p1, p2, p3);
       if (p1 instanceof e) {
          ConstraintLayout$LayoutParams s = p2.S;
          if (s != -1) {
             p1.U1(s);
          }
       }
       return;
    }
    public void r(ConstraintWidget p0,boolean p1){
       this.m.g1(p1);
    }
    public void setFirstHorizontalBias(float p0){
       this.m.H1(p0);
       this.requestLayout();
    }
    public void setFirstHorizontalStyle(int p0){
       this.m.I1(p0);
       this.requestLayout();
    }
    public void setFirstVerticalBias(float p0){
       this.m.J1(p0);
       this.requestLayout();
    }
    public void setFirstVerticalStyle(int p0){
       this.m.K1(p0);
       this.requestLayout();
    }
    public void setHorizontalAlign(int p0){
       this.m.L1(p0);
       this.requestLayout();
    }
    public void setHorizontalBias(float p0){
       this.m.M1(p0);
       this.requestLayout();
    }
    public void setHorizontalGap(int p0){
       this.m.N1(p0);
       this.requestLayout();
    }
    public void setHorizontalStyle(int p0){
       this.m.O1(p0);
       this.requestLayout();
    }
    public void setMaxElementsWrap(int p0){
       this.m.T1(p0);
       this.requestLayout();
    }
    public void setOrientation(int p0){
       this.m.U1(p0);
       this.requestLayout();
    }
    public void setPadding(int p0){
       this.m.u1(p0);
       this.requestLayout();
    }
    public void setPaddingBottom(int p0){
       this.m.v1(p0);
       this.requestLayout();
    }
    public void setPaddingLeft(int p0){
       this.m.x1(p0);
       this.requestLayout();
    }
    public void setPaddingRight(int p0){
       this.m.y1(p0);
       this.requestLayout();
    }
    public void setPaddingTop(int p0){
       this.m.A1(p0);
       this.requestLayout();
    }
    public void setVerticalAlign(int p0){
       this.m.V1(p0);
       this.requestLayout();
    }
    public void setVerticalBias(float p0){
       this.m.W1(p0);
       this.requestLayout();
    }
    public void setVerticalGap(int p0){
       this.m.X1(p0);
       this.requestLayout();
    }
    public void setVerticalStyle(int p0){
       this.m.Y1(p0);
       this.requestLayout();
    }
    public void setWrapMode(int p0){
       this.m.Z1(p0);
       this.requestLayout();
    }
    public void x(h p0,int p1,int p2){
       int mode = View$MeasureSpec.getMode(p1);
       p1 = View$MeasureSpec.getSize(p1);
       int mode1 = View$MeasureSpec.getMode(p2);
       p2 = View$MeasureSpec.getSize(p2);
       if (p0 != null) {
          p0.o1(mode, p1, mode1, p2);
          this.setMeasuredDimension(p0.j1(), p0.i1());
       }else {
          this.setMeasuredDimension(0, 0);
       }
       return;
    }
}
