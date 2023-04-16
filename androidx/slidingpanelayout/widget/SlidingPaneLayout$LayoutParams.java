package androidx.slidingpanelayout.widget.SlidingPaneLayout$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.content.Context;
import android.util.AttributeSet;
import android.content.res.TypedArray;
import android.view.ViewGroup$LayoutParams;

public class SlidingPaneLayout$LayoutParams extends ViewGroup$MarginLayoutParams	// class@00098c
{
    public float a;
    public boolean b;
    public boolean c;
    public Paint d;
    public static final int[] e;

    static {
       int[] ointArray = new int[]{0x1010181};
       SlidingPaneLayout$LayoutParams.e = ointArray;
    }
    public void SlidingPaneLayout$LayoutParams(){
       super(-1, -1);
       this.a = 0;
    }
    public void SlidingPaneLayout$LayoutParams(Context p0,AttributeSet p1){
       super(p0, p1);
       this.a = 0;
       TypedArray typedArray = p0.obtainStyledAttributes(p1, SlidingPaneLayout$LayoutParams.e);
       this.a = typedArray.getFloat(0, 0);
       typedArray.recycle();
    }
    public void SlidingPaneLayout$LayoutParams(ViewGroup$LayoutParams p0){
       super(p0);
       this.a = 0;
    }
    public void SlidingPaneLayout$LayoutParams(ViewGroup$MarginLayoutParams p0){
       super(p0);
       this.a = 0;
    }
    public void SlidingPaneLayout$LayoutParams(SlidingPaneLayout$LayoutParams p0){
       super(p0);
       this.a = 0;
       this.a = p0.a;
    }
}
