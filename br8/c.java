package br8.c;
import androidx.recyclerview.widget.RecyclerView$n;
import br8.b;
import fr8.a;
import dr8.a;
import er8.a;
import fr8.b;
import cr8.b;
import br8.a;
import cr8.a;
import android.util.SparseArray;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$y;
import android.graphics.Canvas;
import android.view.ViewGroup;
import java.lang.Object;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import java.lang.Math;
import java.util.Objects;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;

public class c extends RecyclerView$n	// class@000447
{
    public final b a;
    public final SparseArray b;
    public final a c;
    public final b d;
    public final a e;
    public final a f;
    public final a g;
    public final Rect h;

    public void c(b p0){
       a uoa = new a();
       a uoa1 = new a();
       b uob = new b(p0, uoa);
       super();
       this.b = new SparseArray();
       this.h = new Rect();
       this.a = p0;
       this.c = uob;
       this.d = uoa;
       this.f = new a(uoa);
       this.g = uoa1;
       this.e = new a(p0, uob, uoa, uoa1);
    }
    public void c(Rect p0,View p1,RecyclerView p2,RecyclerView$y p3){
       c th;
       super.c(p0, p1, p2, p3);
       int childAdapter = p2.getChildAdapterPosition(p1);
       if (childAdapter == -1) {
          return;
       }
       if (this.e.d(childAdapter, this.d.b(p2))) {
          childAdapter = this.g(p2, childAdapter);
          this.g.a(this.h, childAdapter);
          if (this.d.a(p2) == 1) {
             th = this.h;
             p0.top = (childAdapter.getHeight() + th.top) + th.bottom;
          }else {
             th = this.h;
             p0.left = (childAdapter.getWidth() + th.left) + th.right;
          }
       }
       return;
    }
    public void e(Canvas p0,RecyclerView p1,RecyclerView$y p2){
       int top;
       Rect top1;
       ViewGroup$MarginLayoutParams leftMargin;
       ViewGroup$MarginLayoutParams topMargin;
       int i5;
       int i6;
       int i7;
       a f;
       a e2;
       a f2;
       c uoc = this;
       Canvas uCanvas = p0;
       ViewGroup viewGroup = p1;
       int childCount = p1.getChildCount();
       if (childCount > 0 && uoc.a.getItemCount() > 0) {
          int i = 0;
          while (i < childCount) {
             View childAt = viewGroup.getChildAt(i);
             int childAdapter = viewGroup.getChildAdapterPosition(childAt);
             int i1 = -1;
             if (childAdapter != i1) {
                c e = uoc.e;
                e.d.a(e.e, childAt);
                int i2 = 1;
                if (uoc.d.a(viewGroup) == i2) {
                   top = childAt.getTop();
                   top1 = e.e.top;
                }else {
                   top = childAt.getLeft();
                   top1 = e.e.left;
                }
                int i3 = (top <= top1 && e.a.E(childAdapter) - null >= 0)? 1: 0;
                if (i3 || uoc.e.d(childAdapter, uoc.d.b(viewGroup))) {
                   View view = uoc.c.a(viewGroup, childAdapter);
                   top1 = uoc.b.get(childAdapter);
                   if (top1 == null) {
                      top1 = new Rect();
                      uoc.b.put(childAdapter, top1);
                   }
                   c e1 = uoc.e;
                   int i4 = e1.b.a(viewGroup);
                   e1.d.a(e1.e, view);
                   ViewGroup$LayoutParams layoutParams = childAt.getLayoutParams();
                   if (layoutParams instanceof ViewGroup$MarginLayoutParams) {
                      leftMargin = layoutParams.leftMargin;
                      topMargin = layoutParams.topMargin;
                   }else {
                      i6 = 0;
                      i7 = 0;
                   }
                   if (i4 == i2) {
                      i4 = childAt.getLeft() - leftMargin;
                      i4 = i4 + e1.e.left;
                      i5 = childAt.getTop() - topMargin;
                      i5 = i5 - view.getHeight();
                      i5 = i5 - e1.e.bottom;
                      i6 = e1.c(viewGroup) + e1.e.top;
                      i5 = Math.max(i5, i6);
                   }else {
                      i4 = childAt.getTop() - topMargin;
                      i4 = i4 + e1.e.top;
                      i5 = childAt.getLeft() - leftMargin;
                      i5 = i5 - view.getWidth();
                      i5 = i5 - e1.e.right;
                      i6 = e1.b(viewGroup) + e1.e.left;
                      int i8 = i4;
                      i4 = Math.max(i5, i6);
                      i5 = i8;
                   }
                   i6 = view.getWidth() + i4;
                   i7 = view.getHeight() + i5;
                   top1.set(i4, i5, i6, i7);
                   if (i3) {
                      childAt = e1.a(viewGroup, view);
                      i3 = viewGroup.getChildAdapterPosition(childAt);
                      if (i3 != i1) {
                         i1 = e1.b.b(viewGroup);
                         if (i3 > 0 && e1.d(i3, i1)) {
                            View view1 = e1.c.a(viewGroup, i3);
                            e1.d.a(e1.e, view1);
                            e1.d.a(e1.f, view);
                            if (e1.b.a(viewGroup) == i2) {
                               i5 = childAt.getTop() - e1.e.bottom;
                               i5 = i5 - view1.getHeight();
                               i5 = i5 - e1.e.top;
                               i1 = p1.getPaddingTop() + view.getBottom();
                               f2 = e1.f;
                               i1 = i1 + f2.top;
                               i1 = i1 + f2.bottom;
                               if (i5 >= i1) {
                               label_018d :
                                  childAt = null;
                               label_018e :
                                  if (childAt) {
                                     childAt = e1.a(viewGroup, view);
                                     view1 = e1.c.a(viewGroup, viewGroup.getChildAdapterPosition(childAt));
                                     e1.d.a(e1.e, view1);
                                     e1.d.a(e1.f, view);
                                     if (e1.b.a(viewGroup) == i2) {
                                        f = e1.f;
                                        i3 = e1.c(viewGroup) + f.top;
                                        i3 = i3 + f.bottom;
                                        i5 = childAt.getTop() - view1.getHeight();
                                        e2 = e1.e;
                                        i5 = i5 - e2.bottom;
                                        i5 = i5 - e2.top;
                                        i5 = i5 - view.getHeight();
                                        i5 = i5 - i3;
                                        if (i5 < i3) {
                                           childAdapter = top1.top + i5;
                                           top1.top = childAdapter;
                                        }
                                     }else {
                                        f = e1.f;
                                        i3 = e1.b(viewGroup) + f.left;
                                        i3 = i3 + f.right;
                                        i5 = childAt.getLeft() - view1.getWidth();
                                        e2 = e1.e;
                                        i5 = i5 - e2.right;
                                        i5 = i5 - e2.left;
                                        i5 = i5 - view.getWidth();
                                        i5 = i5 - i3;
                                        if (i5 < i3) {
                                           childAdapter = top1.left + i5;
                                           top1.left = childAdapter;
                                        }
                                     }
                                  }
                               }
                            }else {
                               i5 = childAt.getLeft() - e1.e.right;
                               i5 = i5 - view1.getWidth();
                               i5 = i5 - e1.e.left;
                               i1 = p1.getPaddingLeft() + view.getRight();
                               f2 = e1.f;
                               i1 = i1 + f2.left;
                               i1 = i1 + f2.right;
                               if (i5 >= i1) {
                               }
                            }
                            childAt = 1;
                            goto label_018e ;
                         }else {
                            goto label_018d ;
                         }
                      }
                   }
                label_0209 :
                   c f1 = uoc.f;
                   Objects.requireNonNull(f1);
                   p0.save();
                   if (p1.getLayoutManager().getClipToPadding()) {
                      e2 = f1.c;
                      f1.a.a(e2, view);
                      if (f1.b.a(viewGroup) == i2) {
                         i2 = p1.getWidth() - p1.getPaddingRight();
                         i2 = i2 - e2.right;
                         i4 = p1.getHeight() - p1.getPaddingBottom();
                         e2.set(p1.getPaddingLeft(), p1.getPaddingTop(), i2, i4);
                      }else {
                         i2 = p1.getWidth() - p1.getPaddingRight();
                         i4 = p1.getHeight() - p1.getPaddingBottom();
                         i4 = i4 - e2.bottom;
                         e2.set(p1.getPaddingLeft(), p1.getPaddingTop(), i2, i4);
                      }
                      uCanvas.clipRect(f1.c);
                   }
                   uCanvas.translate((float)top1.left, (float)top1.top);
                   view.draw(uCanvas);
                   p0.restore();
                }
             }
             i = i + 1;
          }
       }
       return;
    }
    public int f(int p0,int p1){
       int i = 0;
       while (true) {
          if (i >= this.b.size()) {
             return -1;
          }
          c tb = this.b;
          if (tb.get(tb.keyAt(i)).contains(p0, p1)) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return this.b.keyAt(i);
    }
    public View g(RecyclerView p0,int p1){
       return this.c.a(p0, p1);
    }
}
