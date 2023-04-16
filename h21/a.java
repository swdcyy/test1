package h21.a;
import gq1.o;
import lp3.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import gq1.n;
import mq1.b;
import java.lang.Boolean;

public class a extends a implements o	// class@00260b
{
    public n d;

    public void a(){
       super();
    }
    public int A3(){
       a obj = PatchProxy.apply(null, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.d;
       if (obj != null) {
          return obj.A3();
       }
       return -1;
    }
    public int Q(){
       a obj = PatchProxy.apply(null, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.d;
       if (obj != null) {
          return obj.Q();
       }
       return -1;
    }
    public void Qo(){
       PatchProxy.applyVoid(null, this, a.class, "1");
    }
    public void Ro(){
       if (PatchProxy.applyVoid(null, this, a.class, "6")) {
          return;
       }
       this.d = null;
       return;
    }
    public void V(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "7")) {
          return;
       }
       a td = this.d;
       if (td != null) {
          td.V(p0);
       }
       return;
    }
    public void Vh(n p0){
       this.d = p0;
    }
    public boolean o0(){
       a obj = PatchProxy.apply(null, this, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.d;
       if (obj != null) {
          return obj.o0();
       }
       return false;
    }
    public String p0(){
       a obj = PatchProxy.apply(null, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.d;
       if (obj != null) {
          return obj.p0();
       }
       return "";
    }
    public void x0(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "8")) {
          return;
       }
       a td = this.d;
       if (td != null) {
          td.x0(p0);
       }
       return;
    }
}
