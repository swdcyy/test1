package d3a.a$a;
import ohc.g;
import d3a.a;
import mhc.n1;
import uo7.k;
import com.kwai.sharelib.model.ShareInitResponse$SharePanelElement;
import ohc.k;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ohc.a;

public class a$a extends g	// class@001e64
{
    public final n1 c;
    public final a d;

    public void a$a(a p0,n1 p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public void l(k p0,ShareInitResponse$SharePanelElement p1){
       this.t(p0, p1);
    }
    public void m(k p0,ShareInitResponse$SharePanelElement p1,Throwable p2){
       this.u(p0, p1, p2);
    }
    public void n(k p0,ShareInitResponse$SharePanelElement p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a$a.class, "2")) {
       }else {
          super.n(p0, p1);
          this.c.n(p0, p1);
       }
       return;
    }
    public void o(k p0,ShareInitResponse$SharePanelElement p1){
       this.v(p0, p1);
    }
    public void p(k p0,ShareInitResponse$SharePanelElement p1){
       this.w(p0, p1);
    }
    public void t(k p0,ShareInitResponse$SharePanelElement p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a$a.class, "4")) {
          return;
       }
       super.t(p0, p1);
       this.c.l(p0, p1);
       return;
    }
    public void u(k p0,ShareInitResponse$SharePanelElement p1,Throwable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, a$a.class, "5")) {
          return;
       }
       super.u(p0, p1, p2);
       this.c.m(p0, p1, p2);
       return;
    }
    public void v(k p0,ShareInitResponse$SharePanelElement p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a$a.class, "1")) {
          return;
       }
       super.v(p0, p1);
       this.c.o(p0, p1);
       return;
    }
    public void w(k p0,ShareInitResponse$SharePanelElement p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a$a.class, "3")) {
          return;
       }
       super.w(p0, p1);
       this.c.p(p0, p1);
       return;
    }
}
