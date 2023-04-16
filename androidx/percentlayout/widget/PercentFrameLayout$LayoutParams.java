package androidx.percentlayout.widget.PercentFrameLayout$LayoutParams;
import androidx.percentlayout.widget.a$b;
import android.widget.FrameLayout$LayoutParams;
import android.content.Context;
import android.util.AttributeSet;
import androidx.percentlayout.widget.a$a;
import androidx.percentlayout.widget.a;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.content.res.TypedArray;

public class PercentFrameLayout$LayoutParams extends FrameLayout$LayoutParams implements a$b	// class@00085e
{
    public a$a b;

    public void PercentFrameLayout$LayoutParams(int p0,int p1){
       super(p0, p1);
    }
    public void PercentFrameLayout$LayoutParams(Context p0,AttributeSet p1){
       super(p0, p1);
       this.b = a.c(p0, p1);
    }
    public void PercentFrameLayout$LayoutParams(ViewGroup$LayoutParams p0){
       super(p0);
    }
    public void PercentFrameLayout$LayoutParams(ViewGroup$MarginLayoutParams p0){
       super(p0);
    }
    public void PercentFrameLayout$LayoutParams(FrameLayout$LayoutParams p0){
       super(p0);
       this.gravity = p0.gravity;
    }
    public void PercentFrameLayout$LayoutParams(PercentFrameLayout$LayoutParams p0){
       super(p0);
       this.b = p0.b;
    }
    public a$a a(){
       if (this.b == null) {
          this.b = new a$a();
       }
       return this.b;
    }
    public void setBaseAttributes(TypedArray p0,int p1,int p2){
       a.b(this, p0, p1, p2);
    }
}
