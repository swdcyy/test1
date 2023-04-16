package androidx.viewpager.widget.ViewPager$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.content.Context;
import android.util.AttributeSet;
import androidx.viewpager.widget.ViewPager;
import android.content.res.TypedArray;

public class ViewPager$LayoutParams extends ViewGroup$LayoutParams	// class@000a0e
{
    public boolean a;
    public int b;
    public float c;
    public boolean d;
    public int e;
    public int f;

    public void ViewPager$LayoutParams(){
       super(-1, -1);
       this.c = 0;
    }
    public void ViewPager$LayoutParams(Context p0,AttributeSet p1){
       super(p0, p1);
       this.c = 0;
       TypedArray typedArray = p0.obtainStyledAttributes(p1, ViewPager.LAYOUT_ATTRS);
       this.b = typedArray.getInteger(0, 48);
       typedArray.recycle();
    }
}
