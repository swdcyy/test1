package zp1.p;
import cq1.b;
import com.kuaishou.live.common.core.component.multichat.render.cell.LiveMultiInteractRenderChildController;
import java.lang.String;
import yp1.b;
import zp1.i;
import zp1.l;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import cq1.c;
import cq1.a;
import yp1.c;
import java.util.Map;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import java.util.Objects;
import zp1.p$a;
import java.lang.Runnable;
import java.lang.Float;
import com.kwai.robust.PatchProxyResult;

public abstract class p extends LiveMultiInteractRenderChildController implements b	// class@004afb
{
    public final String n;
    public final b o;
    public final i p;
    public final l q;

    public void p(String p0,b p1,i p2,l p3){
       a.p(p0, "cellUserId");
       a.p(p1, "renderModel");
       a.p(p2, "chatCellBaseDelegate");
       a.p(p3, "chatCellRendDelegate");
       super();
       this.n = p0;
       this.o = p1;
       this.p = p2;
       this.q = p3;
    }
    public void F2(){
       if (PatchProxy.applyVoid(null, this, p.class, "1")) {
          return;
       }
       super.F2();
       c uoc = this.Z2();
       if (uoc != null) {
          uoc.b(this);
       }
       return;
    }
    public void J2(){
       if (PatchProxy.applyVoid(null, this, p.class, "2")) {
          return;
       }
       c uoc = this.Z2();
       if (uoc != null) {
          uoc.a(this);
       }
       return;
    }
    public int c2(){
       return a.a(this);
    }
    public final void c3(c p0){
       ViewGroup$LayoutParams layoutParams;
       p op = p.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, op, "4")) {
          return;
       }
       a.p(p0, "renderLayoutData");
       Rect rect = p0.b().get(this.n);
       p0 = p0.c;
       if (rect != null) {
          View view = this.Y2();
          if (!PatchProxy.applyVoidTwoRefs(view, rect, this, op, "6")) {
             if (this.getView().getLayoutParams() instanceof FrameLayout$LayoutParams) {
                layoutParams = this.getView().getLayoutParams();
                Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
             }else {
                layoutParams = new FrameLayout$LayoutParams(-1, -1);
             }
             layoutParams.width = rect.width();
             layoutParams.height = rect.height();
             layoutParams.leftMargin = rect.left;
             layoutParams.topMargin = rect.top;
             view.setLayoutParams(layoutParams);
          }
          this.d3(p0, rect);
          this.Y2().post(new p$a(this, p0));
       }
       return;
    }
    public void d3(float p0,Rect p1){
       if (PatchProxy.isSupport(p.class) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), p1, this, p.class, "5")) {
          return;
       }
       a.p(p1, "cellRect");
       return;
    }
    public View getView(){
       Object obj = PatchProxy.apply(null, this, p.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.Y2();
    }
    public void j2(){
       a.c(this);
    }
    public void m(){
       a.b(this);
    }
}
