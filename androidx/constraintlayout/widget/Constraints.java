package androidx.constraintlayout.widget.Constraints;
import android.view.ViewGroup;
import android.content.Context;
import android.view.View;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.Constraints$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import androidx.constraintlayout.widget.a;

public class Constraints extends ViewGroup	// class@0006b9
{
    public a b;

    public void Constraints(Context p0){
       super(p0);
       super.setVisibility(8);
    }
    public void Constraints(Context p0,AttributeSet p1){
       super(p0, p1);
       super.setVisibility(8);
    }
    public void Constraints(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       super.setVisibility(8);
    }
    public Constraints$LayoutParams a(){
       return new Constraints$LayoutParams(-2, -2);
    }
    public Constraints$LayoutParams b(AttributeSet p0){
       return new Constraints$LayoutParams(this.getContext(), p0);
    }
    public ViewGroup$LayoutParams generateDefaultLayoutParams(){
       return this.a();
    }
    public ViewGroup$LayoutParams generateLayoutParams(AttributeSet p0){
       return this.b(p0);
    }
    public ViewGroup$LayoutParams generateLayoutParams(ViewGroup$LayoutParams p0){
       return new ConstraintLayout$LayoutParams(p0);
    }
    public a getConstraintSet(){
       if (this.b == null) {
          this.b = new a();
       }
       this.b.k(this);
       return this.b;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
    }
}
