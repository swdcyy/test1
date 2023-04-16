package androidx.recyclerview.widget.i;
import androidx.recyclerview.widget.RecyclerView$n;
import android.content.Context;
import android.graphics.Rect;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$y;
import android.graphics.Canvas;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import android.view.ViewGroup;
import java.lang.Math;
import java.lang.IllegalArgumentException;
import java.lang.String;

public class i extends RecyclerView$n	// class@000913
{
    public Drawable a;
    public int b;
    public final Rect c;
    public static final int[] d;

    static {
       int[] ointArray = new int[]{0x1010214};
       i.d = ointArray;
    }
    public void i(Context p0,int p1){
       super();
       this.c = new Rect();
       TypedArray typedArray = p0.obtainStyledAttributes(i.d);
       this.a = typedArray.getDrawable(0);
       typedArray.recycle();
       this.j(p1);
    }
    public void c(Rect p0,View p1,RecyclerView p2,RecyclerView$y p3){
       i ta = this.a;
       if (ta == null) {
          p0.set(0, 0, 0, 0);
          return;
       }else if(this.b == 1){
          p0.set(0, 0, 0, ta.getIntrinsicHeight());
       }else {
          p0.set(0, 0, ta.getIntrinsicWidth(), 0);
       }
       return;
    }
    public void d(Canvas p0,RecyclerView p1,RecyclerView$y p2){
       if (p1.getLayoutManager() != null && this.a != null) {
          if (this.b == 1) {
             this.g(p0, p1);
          }else {
             this.f(p0, p1);
          }
       }
       return;
    }
    public final void f(Canvas p0,RecyclerView p1){
       int paddingTop;
       int i1;
       p0.save();
       int i = 0;
       if (p1.getClipToPadding()) {
          paddingTop = p1.getPaddingTop();
          i1 = p1.getHeight() - p1.getPaddingBottom();
          p0.clipRect(p1.getPaddingLeft(), paddingTop, (p1.getWidth() - p1.getPaddingRight()), i1);
       }else {
          i1 = p1.getHeight();
          paddingTop = 0;
       }
       int childCount = p1.getChildCount();
       for (; i < childCount; i = i + 1) {
          View childAt = p1.getChildAt(i);
          p1.getLayoutManager().getDecoratedBoundsWithMargins(childAt, this.c);
          int i2 = this.c.right + Math.round(childAt.getTranslationX());
          int i3 = i2 - this.a.getIntrinsicWidth();
          this.a.setBounds(i3, paddingTop, i2, i1);
          this.a.draw(p0);
       }
       p0.restore();
       return;
    }
    public final void g(Canvas p0,RecyclerView p1){
       int paddingLeft;
       int i1;
       p0.save();
       int i = 0;
       if (p1.getClipToPadding()) {
          paddingLeft = p1.getPaddingLeft();
          i1 = p1.getWidth() - p1.getPaddingRight();
          p0.clipRect(paddingLeft, p1.getPaddingTop(), i1, (p1.getHeight() - p1.getPaddingBottom()));
       }else {
          i1 = p1.getWidth();
          paddingLeft = 0;
       }
       int childCount = p1.getChildCount();
       for (; i < childCount; i = i + 1) {
          View childAt = p1.getChildAt(i);
          p1.getDecoratedBoundsWithMargins(childAt, this.c);
          int i2 = this.c.bottom + Math.round(childAt.getTranslationY());
          int i3 = i2 - this.a.getIntrinsicHeight();
          this.a.setBounds(paddingLeft, i3, i1, i2);
          this.a.draw(p0);
       }
       p0.restore();
       return;
    }
    public Drawable h(){
       return this.a;
    }
    public void i(Drawable p0){
       if (p0 == null) {
          throw new IllegalArgumentException("Drawable cannot be null.");
       }
       this.a = p0;
       return;
    }
    public void j(int p0){
       if (p0 && p0 != 1) {
          throw new IllegalArgumentException("Invalid orientation. It should be either HORIZONTAL or VERTICAL");
       }
       this.b = p0;
       return;
    }
}
