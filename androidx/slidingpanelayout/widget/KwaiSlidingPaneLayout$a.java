package androidx.slidingpanelayout.widget.KwaiSlidingPaneLayout$a;
import androidx.customview.widget.ViewDragHelper$c;
import androidx.slidingpanelayout.widget.KwaiSlidingPaneLayout;
import android.view.View;
import android.view.ViewGroup;
import androidx.slidingpanelayout.widget.SlidingPaneLayout;
import java.lang.Object;
import java.lang.String;
import ukd.a;

public class KwaiSlidingPaneLayout$a extends ViewDragHelper$c	// class@00098a
{
    public final ViewDragHelper$c a;
    public final KwaiSlidingPaneLayout b;

    public void KwaiSlidingPaneLayout$a(KwaiSlidingPaneLayout p0,ViewDragHelper$c p1){
       this.b = p0;
       super();
       this.a = p1;
    }
    public int a(View p0,int p1,int p2){
       return this.a.a(p0, p1, p2);
    }
    public int b(View p0,int p1,int p2){
       return this.a.b(p0, p1, p2);
    }
    public int c(int p0){
       return this.a.c(p0);
    }
    public int d(View p0){
       return this.a.d(p0);
    }
    public int e(View p0){
       return this.a.e(p0);
    }
    public void f(int p0,int p1){
       this.a.f(p0, p1);
    }
    public boolean g(int p0){
       return this.a.g(p0);
    }
    public void h(int p0,int p1){
       this.a.h(p0, p1);
    }
    public void i(View p0,int p1){
       this.a.i(p0, p1);
       int i = 1;
       if (this.b.getChildCount() > i && p0 == this.b.getChildAt(0)) {
          KwaiSlidingPaneLayout$a tb = this.b;
          a.o(tb.mDragHelper, "mCapturedView", tb.getChildAt(i));
       }
       return;
    }
    public void j(int p0){
       this.a.j(p0);
    }
    public void k(View p0,int p1,int p2,int p3,int p4){
       this.a.k(p0, p1, p2, p3, p4);
    }
    public void l(View p0,float p1,float p2){
       this.a.l(p0, p1, p2);
    }
    public boolean m(View p0,int p1){
       if (this.b.getChildCount() > 0 && p0 == this.b.getChildAt(0)) {
          return true;
       }
       return this.a.m(p0, p1);
    }
}
