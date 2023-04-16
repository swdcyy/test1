package br8.a;
import br8.b;
import cr8.a;
import fr8.b;
import dr8.a;
import java.lang.Object;
import android.graphics.Rect;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup$LayoutParams;
import androidx.recyclerview.widget.RecyclerView$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;

public class a	// class@000445
{
    public final b a;
    public final b b;
    public final a c;
    public final a d;
    public final Rect e;
    public final Rect f;

    public void a(b p0,a p1,b p2,a p3){
       super();
       this.e = new Rect();
       this.f = new Rect();
       this.a = p0;
       this.c = p1;
       this.b = p2;
       this.d = p3;
    }
    public final View a(RecyclerView p0,View p1){
       a te;
       int i3;
       int b = this.b.b(p0);
       int i = (b)? -1: 1;
       b = (b)? p0.getChildCount() - 1: 0;
       while (b >= 0) {
          int i1 = p0.getChildCount() - 1;
          if (b <= i1) {
             View childAt = p0.getChildAt(b);
             int i2 = this.b.a(p0);
             RecyclerView$LayoutParams layoutParams = childAt.getLayoutParams();
             this.d.a(this.e, p1);
             int childAdapter = p0.getChildAdapterPosition(childAt);
             if (childAdapter != -1 && this.c.a(p0, childAdapter) == p1) {
                if (i2 == 1) {
                   i2 = childAt.getTop() - layoutParams.topMargin;
                   te = this.e;
                   i3 = p1.getBottom() + te.bottom;
                   i3 = i3 + te.top;
                   if (i2 <= i3) {
                   }
                }else {
                   i2 = childAt.getLeft() - layoutParams.leftMargin;
                   te = this.e;
                   i3 = p1.getRight() + te.right;
                   i3 = i3 + te.left;
                   if (i2 <= i3) {
                   }
                }
             }
          label_0076 :
             a uoa = null;
          label_0077 :
             if (!uoa) {
                return childAt;
             }
          }else {
             break ;
          }
          b = b + i;
       }
       return null;
    }
    public final int b(RecyclerView p0){
       if (p0.getLayoutManager().getClipToPadding()) {
          return p0.getPaddingLeft();
       }
       return 0;
    }
    public final int c(RecyclerView p0){
       if (p0.getLayoutManager().getClipToPadding()) {
          return p0.getPaddingTop();
       }
       return 0;
    }
    public boolean d(int p0,boolean p1){
       boolean b = false;
       if (this.e(p0)) {
          return b;
       }
       long l = this.a.E(p0);
       if (l < 0) {
          return b;
       }
       a uoa = -1;
       int i = (p1)? 1: -1;
       i = i + p0;
       if (!this.e(i)) {
          uoa = this.a.E(i);
       }
       int i1 = (p1)? this.a.getItemCount() - 1: 0;
       if (p0 == i1 || l - uoa) {
          b = true;
       }
       return b;
    }
    public final boolean e(int p0){
       boolean b = (p0 < 0 || p0 >= this.a.getItemCount())? true: false;
       return b;
    }
}
