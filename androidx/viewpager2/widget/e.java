package androidx.viewpager2.widget.e;
import androidx.recyclerview.widget.RecyclerView$r;
import androidx.viewpager2.widget.ViewPager2;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewpager2.widget.e$a;
import androidx.viewpager2.widget.ViewPager2$h;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewGroup;
import j3.a;
import java.lang.IllegalStateException;
import java.lang.String;
import java.util.Locale;
import java.lang.Object;
import java.lang.Integer;

public final class e extends RecyclerView$r	// class@000a43
{
    public ViewPager2$h a;
    public final ViewPager2 b;
    public final RecyclerView c;
    public final LinearLayoutManager d;
    public int e;
    public int f;
    public e$a g;
    public int h;
    public int i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;

    public void e(ViewPager2 p0){
       super();
       this.b = p0;
       p0 = p0.k;
       this.c = p0;
       this.d = p0.getLayoutManager();
       this.g = new e$a();
       this.q();
    }
    public void a(RecyclerView p0,int p1){
       e$a a;
       e tg;
       int i1;
       int i = 1;
       if (this.e != i || (this.f != i && p1 == i)) {
          this.s(false);
          return;
       }else if(this.l() && p1 == 2){
          if (this.k != null) {
             this.e(2);
             this.j = i;
          }
          return;
       }else if(this.l() && !p1){
          this.t();
          if (this.k == null) {
             a = this.g.a;
             if (a != -1) {
                this.c(a, 0, false);
             }
          }else {
             tg = this.g;
             if (tg.c == null) {
                a = tg.a;
                if (this.h != a) {
                   this.d(a);
                }
             }else {
                i = 0;
             }
          }
          if (i) {
             this.e(false);
             this.q();
          }
       }
    label_0057 :
       if (this.e == 2 && (!p1 && this.l != null)) {
          this.t();
          tg = this.g;
          if (tg.c == null) {
             a = tg.a;
             if (this.i != a) {
                if (a == -1) {
                   i1 = 0;
                }
                this.d(i1);
             }
             this.e(false);
             this.q();
          }
       }
       return;
    }
    public void b(RecyclerView p0,int p1,int p2){
       e uoe;
       e$a a1;
       this.k = true;
       this.t();
       if (this.j != null) {
          this.j = false;
          if (p2 <= 0) {
             if (!p2) {
                p1 = (p1 < 0)? 1: 0;
                if (p1 != this.b.g()) {
                label_0020 :
                   uoe = null;
                label_0023 :
                   if (uoe) {
                      uoe = this.g;
                      if (uoe.c != null) {
                         uoe = uoe.a + true;
                      label_0033 :
                         this.i = uoe;
                         if (this.h != uoe) {
                            this.d(uoe);
                         }
                      }
                   }
                   a1 = this.g.a;
                   goto label_0033 ;
                }
             }else {
                goto label_0020 ;
             }
          }
          uoe = 1;
          goto label_0023 ;
       }else if(this.e == null){
          a1 = this.g.a;
          if (a1 == -1) {
             a1 = 0;
          }
          this.d(a1);
       }
       uoe = this.g;
       e$a a = uoe.a;
       if (a == -1) {
          a = 0;
       }
       this.c(a, uoe.b, uoe.c);
       uoe = this.g;
       e ti = this.i;
       if (uoe.a == ti || (ti == -1 && (uoe.c == null && this.f != true))) {
          this.e(false);
          this.q();
       }
    label_0071 :
       return;
    }
    public final void c(int p0,float p1,int p2){
       e ta = this.a;
       if (ta != null) {
          ta.b(p0, p1, p2);
       }
       return;
    }
    public final void d(int p0){
       e ta = this.a;
       if (ta != null) {
          ta.c(p0);
       }
       return;
    }
    public final void e(int p0){
       if (this.e == 3 && this.f == null) {
          return;
       }
       if (this.f == p0) {
          return;
       }
       this.f = p0;
       e ta = this.a;
       if (ta != null) {
          ta.a(p0);
       }
       return;
    }
    public final int f(){
       return this.d.i0();
    }
    public double g(){
       this.t();
       e tg = this.g;
       return ((double)tg.a + (double)tg.b);
    }
    public int h(){
       return this.f;
    }
    public boolean i(){
       boolean b = true;
       if (this.f == b) {
       }else {
          b = false;
       }
       return b;
    }
    public boolean j(){
       return this.m;
    }
    public boolean k(){
       boolean b = (this.f == null)? true: false;
       return b;
    }
    public final boolean l(){
       e te = this.e;
       boolean b = true;
       if (te != b && te != 4) {
          b = false;
       }
       return b;
    }
    public void m(){
       this.e = 4;
       this.s(true);
    }
    public void n(){
       this.l = true;
    }
    public void o(){
       if (this.i() && this.m == null) {
          return;
       }
       boolean b = false;
       this.m = b;
       this.t();
       e tg = this.g;
       if (tg.c == null) {
          e$a a = tg.a;
          if (a != this.h) {
             this.d(a);
          }
          this.e(b);
          this.q();
       }else {
          this.e(2);
       }
       return;
    }
    public void p(int p0,boolean p1){
       int i = (p1)? 2: 3;
       this.e = i;
       i = false;
       this.m = i;
       if (this.i != p0) {
          i = true;
       }
       this.i = p0;
       this.e(2);
       if (i) {
          this.d(p0);
       }
       return;
    }
    public final void q(){
       this.e = 0;
       this.f = 0;
       this.g.a();
       this.h = -1;
       this.i = -1;
       this.j = false;
       this.k = false;
       this.m = false;
       this.l = false;
    }
    public void r(ViewPager2$h p0){
       this.a = p0;
    }
    public final void s(boolean p0){
       this.m = p0;
       int i = (p0)? 4: 1;
       this.e = i;
       e ti = this.i;
       if (ti != -1) {
          this.h = ti;
          this.i = -1;
       }else if(this.h == -1){
          this.h = this.f();
       }
       this.e(1);
       return;
    }
    public final void t(){
       float f;
       e tg = this.g;
       int i = this.d.i0();
       tg.a = i;
       if (i == -1) {
          tg.a();
          return;
       }else {
          View view = this.d.findViewByPosition(i);
          if (view == null) {
             tg.a();
             return;
          }else {
             int leftDecorati = this.d.getLeftDecorationWidth(view);
             int rightDecorat = this.d.getRightDecorationWidth(view);
             int topDecoratio = this.d.getTopDecorationHeight(view);
             int bottomDecora = this.d.getBottomDecorationHeight(view);
             ViewGroup$LayoutParams layoutParams = view.getLayoutParams();
             if (layoutParams instanceof ViewGroup$MarginLayoutParams) {
                leftDecorati = leftDecorati + layoutParams.leftMargin;
                rightDecorat = rightDecorat + layoutParams.rightMargin;
                topDecoratio = topDecoratio + layoutParams.topMargin;
                bottomDecora = bottomDecora + layoutParams.bottomMargin;
             }
             int i1 = (view.getHeight() + topDecoratio) + bottomDecora;
             bottomDecora = (view.getWidth() + leftDecorati) + rightDecorat;
             Object[] objArray = (!this.d.getOrientation())? 1: null;
             if (objArray) {
                i = (view.getLeft() - leftDecorati) - this.c.getPaddingLeft();
                if (this.b.g()) {
                   i = - i;
                }
                i1 = bottomDecora;
             }else {
                i = (view.getTop() - topDecoratio) - this.c.getPaddingTop();
             }
             i = - i;
             tg.c = i;
             if (i < 0) {
                if (new a(this.d).d()) {
                   throw new IllegalStateException("Page\(s\) contain a ViewGroup with a LayoutTransition \(or animateLayoutChanges=\"true\"\), which interferes with the scrolling animation. Make sure to call getLayoutTransition\(\).setAnimateParentHierarchy\(false\) on all ViewGroups with a LayoutTransition before an animation is started.");
                }else {
                   objArray = new Object[]{Integer.valueOf(tg.c)};
                   throw new IllegalStateException(String.format(Locale.US, "Page can only be offset by a positive amount, not by %d", objArray));
                }
             }else if(!i1){
                f = 0;
             }else {
                f = (float)i / (float)i1;
             }
             tg.b = f;
             return;
          }
       }
    }
}
