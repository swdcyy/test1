package androidx.appcompat.widget.LinearLayoutCompat$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.content.Context;
import android.util.AttributeSet;
import ll8.c$b;
import android.content.res.TypedArray;
import android.view.ViewGroup$LayoutParams;

public class LinearLayoutCompat$LayoutParams extends ViewGroup$MarginLayoutParams	// class@000603
{
    public float a;
    public int b;

    public void LinearLayoutCompat$LayoutParams(int p0,int p1){
       super(p0, p1);
       this.b = -1;
       this.a = 0;
    }
    public void LinearLayoutCompat$LayoutParams(int p0,int p1,float p2){
       super(p0, p1);
       this.b = -1;
       this.a = p2;
    }
    public void LinearLayoutCompat$LayoutParams(Context p0,AttributeSet p1){
       super(p0, p1);
       this.b = -1;
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.q2);
       this.a = typedArray.getFloat(3, 0);
       this.b = typedArray.getInt(0, -1);
       typedArray.recycle();
    }
    public void LinearLayoutCompat$LayoutParams(ViewGroup$LayoutParams p0){
       super(p0);
       this.b = -1;
    }
    public void LinearLayoutCompat$LayoutParams(ViewGroup$MarginLayoutParams p0){
       super(p0);
       this.b = -1;
    }
    public void LinearLayoutCompat$LayoutParams(LinearLayoutCompat$LayoutParams p0){
       super(p0);
       this.b = -1;
       this.a = p0.a;
       this.b = p0.b;
    }
}
