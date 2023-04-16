package com.kuaishou.live.widget.page2.c;
import androidx.recyclerview.widget.RecyclerView$r;
import com.kuaishou.live.widget.page2.ViewPager2;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.kuaishou.live.widget.page2.c$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Float;
import com.kuaishou.live.widget.page2.ViewPager2$g;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewGroup;
import vq3.b;
import java.lang.reflect.Array;
import java.lang.IllegalStateException;
import vq3.a;
import java.util.Comparator;
import java.util.Arrays;
import java.util.Locale;

public final class c extends RecyclerView$r	// class@00103e
{
    public ViewPager2$g a;
    public final ViewPager2 b;
    public final RecyclerView c;
    public final LinearLayoutManager d;
    public int e;
    public int f;
    public c$a g;
    public int h;
    public int i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;

    public void c(ViewPager2 p0){
       super();
       this.b = p0;
       p0 = p0.k;
       this.c = p0;
       this.d = p0.getLayoutManager();
       this.g = new c$a();
       this.i();
    }
    public void a(RecyclerView p0,int p1){
       c ti;
       int i1;
       c$a a;
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoc, "2")) {
          return;
       }
       int i = 1;
       if (this.e != i || (this.f != i && p1 == i)) {
          if (!PatchProxy.isSupport(uoc) || !PatchProxy.applyVoidOneRefs(Boolean.FALSE, this, uoc, "5")) {
             this.m = false;
             this.e = i;
             ti = this.i;
             if (ti != -1) {
                this.h = ti;
                this.i = -1;
             }else if(this.h == -1){
                ti = PatchProxy.apply(null, this, uoc, "13");
                i1 = (ti != PatchProxyResult.class)? ti.intValue(): this.d.i0();
                this.h = i1;
             }
             this.e(i);
          }
          return;
       }else if(this.h() && p1 == 2){
          if (this.k != null) {
             this.e(2);
             this.j = i;
          }
          return;
       }else if(this.h() && !p1){
          this.j();
          if (this.k == null) {
             a = this.g.a;
             if (a != -1) {
                this.c(a, 0, false);
             }
          }else {
             ti = this.g;
             if (ti.c == null) {
                a = ti.a;
                if (this.h != a) {
                   this.d(a);
                }
             }else {
                i = 0;
             }
          }
          if (i) {
             this.e(false);
             this.i();
          }
       }
    label_00a8 :
       if (this.e == 2 && (!p1 && this.l != null)) {
          this.j();
          ti = this.g;
          if (ti.c == null) {
             a = ti.a;
             if (this.i != a) {
                if (a == -1) {
                   i1 = 0;
                }
                this.d(i1);
             }
             this.e(false);
             this.i();
          }
       }
       return;
    }
    public void b(RecyclerView p0,int p1,int p2){
       c uoc;
       c$a a1;
       if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, c.class, "3")) {
          return;
       }
       this.k = true;
       this.j();
       if (this.j != null) {
          this.j = false;
          if (p2 <= 0) {
             if (!p2) {
                p1 = (p1 < 0)? 1: 0;
                if (p1 != this.b.c()) {
                label_003d :
                   uoc = null;
                label_0040 :
                   if (uoc) {
                      uoc = this.g;
                      if (uoc.c != null) {
                         uoc = uoc.a + true;
                      label_0050 :
                         this.i = uoc;
                         if (this.h != uoc) {
                            this.d(uoc);
                         }
                      }
                   }
                   a1 = this.g.a;
                   goto label_0050 ;
                }
             }else {
                goto label_003d ;
             }
          }
          uoc = 1;
          goto label_0040 ;
       }else if(this.e == null){
          a1 = this.g.a;
          if (a1 == -1) {
             a1 = 0;
          }
          this.d(a1);
       }
       uoc = this.g;
       c$a a = uoc.a;
       if (a == -1) {
          a = 0;
       }
       this.c(a, uoc.b, uoc.c);
       uoc = this.g;
       c ti = this.i;
       if (uoc.a == ti || (ti == -1 && (uoc.c == null && this.f != true))) {
          this.e(false);
          this.i();
       }
    label_008e :
       return;
    }
    public final void c(int p0,float p1,int p2){
       if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Float.valueOf(p1), Integer.valueOf(p2), this, c.class, "12")) {
          return;
       }
       c ta = this.a;
       if (ta != null) {
          ta.b(p0, p1, p2);
       }
       return;
    }
    public final void d(int p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "11")) {
          return;
       }
       uoc = this.a;
       if (uoc != null) {
          uoc.c(p0);
       }
       return;
    }
    public final void e(int p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "10")) {
          return;
       }
       if (this.e == 3 && this.f == null) {
          return;
       }
       if (this.f == p0) {
          return;
       }
       this.f = p0;
       uoc = this.a;
       if (uoc != null) {
          uoc.a(p0);
       }
       return;
    }
    public double f(){
       c obj = PatchProxy.apply(null, this, c.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       this.j();
       obj = this.g;
       return ((double)obj.a + (double)obj.b);
    }
    public boolean g(){
       boolean b = (this.f == null)? true: false;
       return b;
    }
    public final boolean h(){
       c te = this.e;
       boolean b = true;
       if (te != b && te != 4) {
          b = false;
       }
       return b;
    }
    public final void i(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       this.e = 0;
       this.f = 0;
       this.g.a();
       this.h = -1;
       this.i = -1;
       this.j = false;
       this.k = false;
       this.m = false;
       this.l = false;
       return;
    }
    public final void j(){
       int b;
       ViewGroup$MarginLayoutParams obj2;
       int left;
       int right;
       ViewGroup$MarginLayoutParams rightMargin;
       float f;
       Object obj = this;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, obj, c.class, "4")) {
          return;
       }
       c g = obj.g;
       int i = obj.d.i0();
       g.a = i;
       if (i == -1) {
          g.a();
          return;
       }else {
          View view = obj.d.findViewByPosition(i);
          if (view == null) {
             g.a();
             return;
          }else {
             int leftDecorati = obj.d.getLeftDecorationWidth(view);
             int rightDecorat = obj.d.getRightDecorationWidth(view);
             boolean topDecoratio = obj.d.getTopDecorationHeight(view);
             int bottomDecora = obj.d.getBottomDecorationHeight(view);
             ViewGroup$LayoutParams layoutParams = view.getLayoutParams();
             if (layoutParams instanceof ViewGroup$MarginLayoutParams) {
                leftDecorati = leftDecorati + layoutParams.leftMargin;
                rightDecorat = rightDecorat + layoutParams.rightMargin;
                topDecoratio = topDecoratio + layoutParams.topMargin;
                bottomDecora = bottomDecora + layoutParams.bottomMargin;
             }
             int i1 = (view.getHeight() + topDecoratio) + bottomDecora;
             bottomDecora = (view.getWidth() + leftDecorati) + rightDecorat;
             b uob = (!obj.d.getOrientation())? 1: null;
             if (uob) {
                i = (view.getLeft() - leftDecorati) - obj.c.getPaddingLeft();
                if (obj.b.c()) {
                   i = - i;
                }
                i1 = bottomDecora;
             }else {
                i = (view.getTop() - topDecoratio) - obj.c.getPaddingTop();
             }
             i = - i;
             g.c = i;
             if (i < 0) {
                b uob1 = new b(obj.d);
                PatchProxyResult patchProxyRe = PatchProxyResult.class;
                uob = b.class;
                Object obj1 = PatchProxy.apply(objArray, uob1, uob, "1");
                if (obj1 != patchProxyRe) {
                   b = obj1.booleanValue();
                }else {
                   obj1 = PatchProxy.apply(objArray, uob1, uob, "2");
                   if (obj1 != patchProxyRe) {
                      topDecoratio = obj1.booleanValue();
                   }else {
                      topDecoratio = uob1.a.getChildCount();
                      if (topDecoratio) {
                         bottomDecora = (!uob1.a.getOrientation())? 1: 0;
                         int[] ointArray = new int[]{topDecoratio,2};
                         int[][] ointArray1 = Array.newInstance(int.class, ointArray);
                         int i2 = 0;
                         while (true) {
                            if (i2 < topDecoratio) {
                               View childAt = uob1.a.getChildAt(i2);
                               if (childAt != null) {
                                  ViewGroup$LayoutParams layoutParams1 = childAt.getLayoutParams();
                                  if (layoutParams1 instanceof ViewGroup$MarginLayoutParams) {
                                  }else {
                                     rightMargin = b.b;
                                  }
                                  object oobject = ointArray1[i2];
                                  if (bottomDecora) {
                                     left = childAt.getLeft();
                                     obj2 = layoutParams1.leftMargin;
                                  }else {
                                     left = childAt.getTop();
                                     obj2 = layoutParams1.topMargin;
                                  }
                                  left = left - obj2;
                                  oobject[0] = left;
                                  object oobject1 = ointArray1[i2];
                                  if (bottomDecora) {
                                     right = childAt.getRight();
                                     rightMargin = layoutParams1.rightMargin;
                                  }else {
                                     right = childAt.getBottom();
                                     rightMargin = layoutParams1.bottomMargin;
                                  }
                                  right = right + rightMargin;
                                  oobject1[1] = right;
                                  i2 = i2 + 1;
                                  obj2 = null;
                               }else {
                                  throw new IllegalStateException("null view contained in the view hierarchy");
                               }
                            }else {
                               Arrays.sort(ointArray1, new a(uob1));
                               b = 1;
                               while (true) {
                                  if (b < topDecoratio) {
                                     bottomDecora = b - 1;
                                     if (ointArray1[bottomDecora][1] != ointArray1[b][0]) {
                                     label_016b :
                                        topDecoratio = false;
                                     }else {
                                        b = b + 1;
                                     }
                                  }else {
                                     b = ointArray1[0][1] - ointArray1[0][0];
                                     if (ointArray1[0][0] > 0 || ointArray1[(topDecoratio - 1)][1] < b) {
                                        goto label_016b ;
                                     }
                                  }
                               }
                               throw new IllegalStateException("Page\(s\) contain a ViewGroup with a LayoutTransition \(or animateLayoutChanges=\"true\"\), which interferes with the scrolling animation. Make sure to call getLayoutTransition\(\).setAnimateParentHierarchy\(false\) on all ViewGroups with a LayoutTransition before an animation is started.");
                            }
                         }
                      }
                      topDecoratio = true;
                   }
                   if (!topDecoratio || uob1.a.getChildCount() <= 1) {
                      obj2 = PatchProxy.apply(null, uob1, uob, "3");
                      if (obj2 != patchProxyRe) {
                         b = obj2.booleanValue();
                      }else {
                         b = uob1.a.getChildCount();
                         leftDecorati = 0;
                         while (true) {
                            if (leftDecorati < b) {
                               if (b.a(uob1.a.getChildAt(leftDecorati))) {
                                  b = true;
                               }else {
                                  leftDecorati = leftDecorati + 1;
                               }
                            }else {
                               b = false;
                            }
                         }
                      }
                      if (b) {
                         b = true;
                      }
                   }
                   b = false;
                }
                if (b) {
                   goto label_01a8 ;
                }else {
                   Object[] objArray1 = new Object[]{Integer.valueOf(g.c)};
                   throw new IllegalStateException(String.format(Locale.US, "Page can only be offset by a positive amount, not by %d", objArray1));
                }
             }else if(!i1){
                f = 0;
             }else {
                f = (float)i / (float)i1;
             }
             g.b = f;
             return;
          }
       }
    }
}
