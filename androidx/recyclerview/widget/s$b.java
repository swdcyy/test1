package androidx.recyclerview.widget.s$b;
import androidx.recyclerview.widget.s;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.s$a;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import androidx.recyclerview.widget.RecyclerView$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.graphics.Rect;

public class s$b extends s	// class@000933
{

    public void s$b(RecyclerView$LayoutManager p0){
       super(p0, null);
    }
    public int d(View p0){
       return (this.a.getDecoratedBottom(p0) + p0.getLayoutParams().bottomMargin);
    }
    public int e(View p0){
       RecyclerView$LayoutParams layoutParams = p0.getLayoutParams();
       return ((this.a.getDecoratedMeasuredHeight(p0) + layoutParams.topMargin) + layoutParams.bottomMargin);
    }
    public int f(View p0){
       RecyclerView$LayoutParams layoutParams = p0.getLayoutParams();
       return ((this.a.getDecoratedMeasuredWidth(p0) + layoutParams.leftMargin) + layoutParams.rightMargin);
    }
    public int g(View p0){
       return (this.a.getDecoratedTop(p0) - p0.getLayoutParams().topMargin);
    }
    public int h(){
       return this.a.getHeight();
    }
    public int i(){
       return (this.a.getHeight() - this.a.getPaddingBottom());
    }
    public int j(){
       return this.a.getPaddingBottom();
    }
    public int l(){
       return this.a.getHeightMode();
    }
    public int m(){
       return this.a.getWidthMode();
    }
    public int n(){
       return this.a.getPaddingTop();
    }
    public int o(){
       return ((this.a.getHeight() - this.a.getPaddingTop()) - this.a.getPaddingBottom());
    }
    public int q(View p0){
       this.a.getTransformedBoundingBox(p0, true, this.c);
       return this.c.bottom;
    }
    public int r(View p0){
       this.a.getTransformedBoundingBox(p0, true, this.c);
       return this.c.top;
    }
    public void s(View p0,int p1){
       p0.offsetTopAndBottom(p1);
    }
    public void t(int p0){
       this.a.offsetChildrenVertical(p0);
    }
}
