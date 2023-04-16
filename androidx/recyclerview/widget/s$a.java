package androidx.recyclerview.widget.s$a;
import androidx.recyclerview.widget.s;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import androidx.recyclerview.widget.RecyclerView$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.graphics.Rect;

public class s$a extends s	// class@000932
{

    public void s$a(RecyclerView$LayoutManager p0){
       super(p0, null);
    }
    public int d(View p0){
       return (this.a.getDecoratedRight(p0) + p0.getLayoutParams().rightMargin);
    }
    public int e(View p0){
       RecyclerView$LayoutParams layoutParams = p0.getLayoutParams();
       return ((this.a.getDecoratedMeasuredWidth(p0) + layoutParams.leftMargin) + layoutParams.rightMargin);
    }
    public int f(View p0){
       RecyclerView$LayoutParams layoutParams = p0.getLayoutParams();
       return ((this.a.getDecoratedMeasuredHeight(p0) + layoutParams.topMargin) + layoutParams.bottomMargin);
    }
    public int g(View p0){
       return (this.a.getDecoratedLeft(p0) - p0.getLayoutParams().leftMargin);
    }
    public int h(){
       return this.a.getWidth();
    }
    public int i(){
       return (this.a.getWidth() - this.a.getPaddingRight());
    }
    public int j(){
       return this.a.getPaddingRight();
    }
    public int l(){
       return this.a.getWidthMode();
    }
    public int m(){
       return this.a.getHeightMode();
    }
    public int n(){
       return this.a.getPaddingLeft();
    }
    public int o(){
       return ((this.a.getWidth() - this.a.getPaddingLeft()) - this.a.getPaddingRight());
    }
    public int q(View p0){
       this.a.getTransformedBoundingBox(p0, true, this.c);
       return this.c.right;
    }
    public int r(View p0){
       this.a.getTransformedBoundingBox(p0, true, this.c);
       return this.c.left;
    }
    public void s(View p0,int p1){
       p0.offsetLeftAndRight(p1);
    }
    public void t(int p0){
       this.a.offsetChildrenHorizontal(p0);
    }
}
