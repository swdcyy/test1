package androidx.drawerlayout.widget.DrawerLayout$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.content.Context;
import android.util.AttributeSet;
import androidx.drawerlayout.widget.DrawerLayout;
import android.content.res.TypedArray;
import android.view.ViewGroup$LayoutParams;

public class DrawerLayout$LayoutParams extends ViewGroup$MarginLayoutParams	// class@000739
{
    public int a;
    public float b;
    public boolean c;
    public int d;

    public void DrawerLayout$LayoutParams(int p0,int p1){
       super(p0, p1);
       this.a = 0;
    }
    public void DrawerLayout$LayoutParams(Context p0,AttributeSet p1){
       super(p0, p1);
       this.a = 0;
       TypedArray typedArray = p0.obtainStyledAttributes(p1, DrawerLayout.N);
       this.a = typedArray.getInt(0, 0);
       typedArray.recycle();
    }
    public void DrawerLayout$LayoutParams(ViewGroup$LayoutParams p0){
       super(p0);
       this.a = 0;
    }
    public void DrawerLayout$LayoutParams(ViewGroup$MarginLayoutParams p0){
       super(p0);
       this.a = 0;
    }
    public void DrawerLayout$LayoutParams(DrawerLayout$LayoutParams p0){
       super(p0);
       this.a = 0;
       this.a = p0.a;
    }
}
