package d2b.a;
import d2b.c;
import com.yxcorp.gifshow.local.sub.entrance.kingkong.view.ClipLayout;
import java.lang.Object;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import android.view.View;
import d2b.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import android.view.MotionEvent;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import g9c.d;

public class a implements c	// class@00241c
{
    public ClipLayout a;
    public View b;
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean g;

    public void a(ClipLayout p0){
       super();
       this.g = false;
       this.a = p0;
       int measuredHeig = p0.getMeasuredHeight();
       this.d = measuredHeig;
       this.e = measuredHeig;
    }
    public void a(CoordinatorLayout p0,View p1,View p2,int p3,int p4,int[] p5){
       b.g(this, p0, p1, p2, p3, p4, p5);
    }
    public void b(CoordinatorLayout p0,View p1,View p2,int p3,int p4,int p5,int p6,int p7){
       if (PatchProxy.isSupport(a.class)) {
          Object[] objArray = new Object[]{p0,p1,p2,Integer.valueOf(p3),Integer.valueOf(p4),Integer.valueOf(p5),Integer.valueOf(p6),Integer.valueOf(p7)};
          if (PatchProxy.applyVoid(objArray, this, a.class, "2")) {
             return;
          }
       }
       if (!p6 || p4) {
          this.a.a(p4);
       }
       return;
    }
    public boolean c(CoordinatorLayout p0,View p1,int p2,int p3,int p4,int p5){
       return b.e(this, p0, p1, p2, p3, p4, p5);
    }
    public void d(CoordinatorLayout p0,View p1,View p2,int p3){
       b.l(this, p0, p1, p2, p3);
    }
    public boolean e(CoordinatorLayout p0,View p1,View p2){
       return b.b(this, p0, p1, p2);
    }
    public void f(CoordinatorLayout p0,View p1,View p2,int p3,int p4,int p5,int p6){
       b.h(this, p0, p1, p2, p3, p4, p5, p6);
    }
    public boolean g(CoordinatorLayout p0,View p1,View p2){
       return false;
    }
    public boolean h(CoordinatorLayout p0,View p1,MotionEvent p2){
       return b.m(this, p0, p1, p2);
    }
    public boolean i(CoordinatorLayout p0,View p1,int p2){
       a obj;
       if (PatchProxy.isSupport(a.class)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), this, a.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = this.a;
       if (obj != null) {
          this.b = p1;
          int i = 0;
          int i1 = (obj.getVisibility() == 8)? 0: this.a.getMeasuredHeight();
          this.d = i1;
          p0.J(p1, p2);
          if (p1 instanceof RecyclerView) {
             if (p1.computeVerticalScrollOffset() > 0) {
                p1.setTranslationY(0);
                this.c = - this.d;
             }else if(this.g == null || this.d != this.e){
                i = 1;
             }
             if (i) {
                this.a.setTranslationY(0);
                p1.setTranslationY((float)this.d);
             }
          }
          this.e = this.d;
          this.g = true;
       }
       return true;
    }
    public boolean j(CoordinatorLayout p0,View p1,View p2,float p3,float p4){
       return false;
    }
    public void k(CoordinatorLayout p0,View p1,View p2){
       b.c(this, p0, p1, p2);
    }
    public boolean l(){
       boolean b = (this.c >= null)? true: false;
       return b;
    }
    public boolean m(CoordinatorLayout p0,View p1,MotionEvent p2){
       return false;
    }
    public boolean n(CoordinatorLayout p0,View p1,View p2,View p3,int p4,int p5){
       return b.k(this, p0, p1, p2, p3, p4, p5);
    }
    public void o(CoordinatorLayout p0,View p1,View p2,int p3,int p4,int[] p5,int p6){
       a uoa1;
       if (PatchProxy.isSupport(a.class)) {
          Object[] objArray = new Object[]{p0,p1,p2,Integer.valueOf(p3),Integer.valueOf(p4),p5,Integer.valueOf(p6)};
          if (PatchProxy.applyVoid(objArray, this, a.class, "3")) {
             return;
          }
       }
       if (p2 instanceof RecyclerView) {
          if (p2.getAdapter() != null && (p2.getAdapter() instanceof d && p2.getAdapter().X0() <= 0)) {
             return;
          }else {
             int i = p2.computeVerticalScrollOffset();
             float f = (float)i;
             a uoa = null;
             if (f - uoa) {
                if (p4 < 0 && (f + (float)p4) - uoa < 0) {
                label_0071 :
                   uoa1 = 1;
                label_007d :
                   if (uoa1) {
                      this.a.a(p4);
                      int i1 = this.f - p4;
                      this.c = i1;
                      if (i1 >= 0) {
                         this.c = 0;
                      }
                      uoa = this.d;
                      if (this.c <= (- uoa)) {
                         this.c = - uoa;
                      }
                      uoa1 = this.c;
                      this.f = uoa1;
                      this.a.setTranslationY((float)uoa1);
                      p1.setTranslationY((float)(this.c + this.d));
                      if (i) {
                         p5[1] = i + p4;
                      }else {
                         p5[1] = p4;
                      }
                   }
                }
             }else if(p4 < 0 && (this.f < null || (p4 > 0 && this.f > (- this.d)))){
                goto label_0071 ;
             }
             uoa1 = null;
             goto label_007d ;
          }
       }
       return;
    }
    public int p(){
       return b.a(this);
    }
    public boolean q(CoordinatorLayout p0,View p1,View p2,View p3,int p4){
       return b.j(this, p0, p1, p2, p3, p4);
    }
}
