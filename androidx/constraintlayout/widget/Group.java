package androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.ConstraintHelper;
import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;

public class Group extends ConstraintHelper	// class@0006ba
{

    public void Group(Context p0){
       super(p0);
    }
    public void Group(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void Group(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void o(AttributeSet p0){
       super.o(p0);
       this.f = false;
    }
    public void onAttachedToWindow(){
       super.onAttachedToWindow();
       this.i();
    }
    public void s(ConstraintLayout p0){
       ConstraintLayout$LayoutParams layoutParams = this.getLayoutParams();
       layoutParams.n0.Y0(0);
       layoutParams.n0.z0(0);
    }
    public void setElevation(float p0){
       super.setElevation(p0);
       this.i();
    }
    public void setVisibility(int p0){
       super.setVisibility(p0);
       this.i();
    }
}
