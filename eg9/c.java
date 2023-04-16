package eg9.c;
import oc9.b0;
import eg9.j;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.camera.record.base.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import com.yxcorp.utility.n;
import com.yxcorp.gifshow.camera.record.base.d;
import com.yxcorp.gifshow.camerasdk.q;
import oc9.a0;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.camera.record.widget.RecordSwitchCameraView;

public class c extends j implements b0	// class@002139
{

    public void c(CameraPageType p0,b p1){
       super(p0, p1);
    }
    public void A0(){
       if (PatchProxy.applyVoid(null, this, c.class, "4")) {
          return;
       }
       j tq = this.q;
       if (tq != null) {
          n.Y(tq, 0, true);
       }
       return;
    }
    public void B(){
       if (PatchProxy.applyVoid(null, this, c.class, "3")) {
          return;
       }
       if (!this.h.isRecording()) {
          super.B();
       }
       return;
    }
    public void E0(){
       a0.n(this);
    }
    public void I7(){
       if (PatchProxy.applyVoid(null, this, c.class, "2")) {
          return;
       }
       j tq = this.q;
       if (tq != null) {
          n.Y(tq, 4, true);
       }
       return;
    }
    public boolean Kc(){
       return a0.c(this);
    }
    public void P1(){
       if (PatchProxy.applyVoid(null, this, c.class, "5")) {
          return;
       }
       this.o.setEnabled(true);
       j tq = this.q;
       if (tq != null) {
          n.Y(tq, 0, true);
       }
       return;
    }
    public boolean R0(){
       j obj = PatchProxy.apply(null, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.o;
       if (obj instanceof RecordSwitchCameraView) {
          return obj.a();
       }
       return false;
    }
    public void T1(boolean p0){
       a0.l(this, p0);
    }
    public void X7(int p0,float p1){
       a0.k(this, p0, p1);
    }
    public void d5(int p0){
       a0.o(this, p0);
    }
    public void e2(){
       a0.f(this);
    }
    public long ie(){
       return a0.a(this);
    }
    public void q1(){
       if (PatchProxy.applyVoid(null, this, c.class, "6")) {
          return;
       }
       j tq = this.q;
       if (tq != null) {
          n.Y(tq, 4, true);
       }
       return;
    }
    public boolean q2(){
       return a0.d(this);
    }
    public void qb(){
       a0.e(this);
    }
    public void s0(){
       a0.m(this);
    }
}
