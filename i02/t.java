package i02.t;
import uw1.k;
import uw1.m;
import java.lang.Object;
import uw1.g;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import lp3.e;
import lp3.c;
import lp3.b;
import android.content.DialogInterface$OnDismissListener;

public class t implements k	// class@0027fd
{
    public m b;

    public void t(m p0){
       super();
       this.b = p0;
    }
    public void A2(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, t.class, "1")) {
          return;
       }
       t tb = this.b;
       if (tb == null) {
          return;
       }
       tb.A2(p0);
       return;
    }
    public void D0(){
       if (PatchProxy.applyVoid(null, this, t.class, "7")) {
          return;
       }
       t tb = this.b;
       if (tb == null) {
          return;
       }
       tb.D0();
       return;
    }
    public void I2(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, t.class, "2")) {
          return;
       }
       t tb = this.b;
       if (tb == null) {
          return;
       }
       tb.I2(p0);
       return;
    }
    public void U1(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, t.class, "3")) {
          return;
       }
       t tb = this.b;
       if (tb == null) {
          return;
       }
       tb.j(p0, null);
       return;
    }
    public boolean V4(boolean p0){
       t ot = t.class;
       if (PatchProxy.isSupport(ot)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, ot, "6");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       ot = this.b;
       if (ot == null) {
          return false;
       }else {
          return ot.V4(p0);
       }
    }
    public void create(e p0){
       b.a(this, p0);
    }
    public void destroy(){
       b.b(this);
    }
    public void k4(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, t.class, "4")) {
          return;
       }
       t tb = this.b;
       if (tb == null) {
          return;
       }
       tb.k4(p0);
       return;
    }
    public void m5(DialogInterface$OnDismissListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, t.class, "10")) {
          return;
       }
       t tb = this.b;
       if (tb == null) {
          return;
       }
       tb.m5(p0);
       return;
    }
    public boolean p5(){
       t obj = PatchProxy.apply(null, this, t.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.b;
       if (obj == null) {
          return false;
       }
       return obj.p5();
    }
    public void s3(DialogInterface$OnDismissListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, t.class, "9")) {
          return;
       }
       t tb = this.b;
       if (tb == null) {
          return;
       }
       tb.s3(p0);
       return;
    }
    public void vc(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, t.class, "5")) {
          return;
       }
       t tb = this.b;
       if (tb == null) {
          return;
       }
       tb.i(p0, true);
       return;
    }
}
