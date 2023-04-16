package androidx.percentlayout.widget.PercentRelativeLayout$LayoutParams;
import androidx.percentlayout.widget.a$b;
import android.widget.RelativeLayout$LayoutParams;
import android.content.Context;
import android.util.AttributeSet;
import androidx.percentlayout.widget.a$a;
import androidx.percentlayout.widget.a;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.content.res.TypedArray;

public class PercentRelativeLayout$LayoutParams extends RelativeLayout$LayoutParams implements a$b	// class@000860
{
    public a$a b;

    public void PercentRelativeLayout$LayoutParams(int p0,int p1){
       super(p0, p1);
    }
    public void PercentRelativeLayout$LayoutParams(Context p0,AttributeSet p1){
       super(p0, p1);
       this.b = a.c(p0, p1);
    }
    public void PercentRelativeLayout$LayoutParams(ViewGroup$LayoutParams p0){
       super(p0);
    }
    public void PercentRelativeLayout$LayoutParams(ViewGroup$MarginLayoutParams p0){
       super(p0);
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
