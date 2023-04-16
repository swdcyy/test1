package androidx.percentlayout.widget.PercentFrameLayout;
import android.widget.FrameLayout;
import android.content.Context;
import androidx.percentlayout.widget.a;
import android.view.ViewGroup;
import android.util.AttributeSet;
import androidx.percentlayout.widget.PercentFrameLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;

public class PercentFrameLayout extends FrameLayout	// class@00085f
{
    public final a b;

    public void PercentFrameLayout(Context p0){
       super(p0);
       this.b = new a(this);
    }
    public void PercentFrameLayout(Context p0,AttributeSet p1){
       super(p0, p1);
       this.b = new a(this);
    }
    public void PercentFrameLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = new a(this);
    }
    public PercentFrameLayout$LayoutParams a(){
       return new PercentFrameLayout$LayoutParams(-1, -1);
    }
    public PercentFrameLayout$LayoutParams b(AttributeSet p0){
       return new PercentFrameLayout$LayoutParams(this.getContext(), p0);
    }
    public ViewGroup$LayoutParams generateDefaultLayoutParams(){
       return this.a();
    }
    public FrameLayout$LayoutParams generateDefaultLayoutParams(){
       return this.a();
    }
    public ViewGroup$LayoutParams generateLayoutParams(AttributeSet p0){
       return this.b(p0);
    }
    public FrameLayout$LayoutParams generateLayoutParams(AttributeSet p0){
       return this.b(p0);
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       super.onLayout(p0, p1, p2, p3, p4);
       this.b.e();
    }
    public void onMeasure(int p0,int p1){
       this.b.a(p0, p1);
       super.onMeasure(p0, p1);
       if (this.b.d()) {
          super.onMeasure(p0, p1);
       }
       return;
    }
}
