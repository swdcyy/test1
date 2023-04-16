package jh9.e$b;
import tyc.h3;
import jh9.e;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.library.widget.refresh.RefreshLayout;
import android.view.View;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.camera.record.toolbox.widget.ScrollToTopCoordinatorLayout;
import com.yxcorp.gifshow.widget.NestedListenerCoordinatorLayout;

public final class e$b implements h3	// class@002ae1
{
    public final e a;

    public void e$b(e p0){
       this.a = p0;
       super();
    }
    public boolean F(int p0){
       e$b obj;
       e$b uob = e$b.class;
       if (PatchProxy.isSupport(uob)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uob, "6");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = this.a;
       boolean b = (obj.u != null && !e.R8(obj).u())? true: false;
       return b;
    }
    public void a(View p0,View p1,int p2,Integer p3){
       if (PatchProxy.isSupport(e$b.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), p3, this, e$b.class, "1")) {
          return;
       }
       a.p(p0, "child");
       a.p(p1, "target");
       e$b ta = this.a;
       ta.w = true;
       e.P8(ta).setScrollOrder(0);
       return;
    }
    public void b(View p0,int p1,int p2,int[] p3,Integer p4){
       if (PatchProxy.isSupport(e$b.class)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),p3,p4};
          if (PatchProxy.applyVoid(objArray, this, e$b.class, "4")) {
             return;
          }
       }
       a.p(p0, "target");
       a.p(p3, "consumed");
       if (p2 > 0) {
          e.P8(this.a).setScrollOrder(1);
       }else if(p2 < 0){
          e$b ta = this.a;
          if (ta.u != null && ta.v < null) {
             e.P8(ta).setScrollOrder(2);
          }
       }
       e.P8(this.a).setScrollOrder(0);
       return;
    }
    public void c(View p0,Integer p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e$b.class, "5")) {
          return;
       }
       a.p(p0, "target");
       e$b ta = this.a;
       ta.w = false;
       e.P8(ta).setScrollOrder(false);
       ta = this.a;
       if (ta.u < null || ta.x != null) {
          e.R8(ta).setRefreshing(false);
          ta.x = false;
       }
       return;
    }
    public void d(View p0,View p1,int p2,Integer p3){
       if (PatchProxy.isSupport(e$b.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), p3, this, e$b.class, "2")) {
          return;
       }
       a.p(p0, "child");
       a.p(p1, "target");
       return;
    }
    public boolean e(View p0,int p1,int p2,int p3,int p4,Integer p5,int[] p6){
       if (PatchProxy.isSupport(e$b.class)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4),p5,p6};
          Object obj = PatchProxy.apply(objArray, this, e$b.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       a.p(p0, "target");
       p0.v = p4;
       if (p5 != null && !p5.intValue()) {
          if (p4 < 0) {
             e$b ta = this.a;
             if (ta.u == null) {
                e.P8(ta).setScrollOrder(2);
                return 1;
             }
          }
       }else if(p5 != null && (p5.intValue() == 1 && (p4 < 0 && (this.a.u != null && p6 != null)))){
          p6[1] = p4;
       }
       return 0;
    }
}
