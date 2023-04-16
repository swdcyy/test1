package bc9.s;
import com.yxcorp.gifshow.util.resource.f$c;
import bc9.l;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import j8c.a;
import q87.c;
import com.yxcorp.gifshow.camera.record.base.d;
import com.yxcorp.gifshow.camera.record.CameraActivity;
import com.yxcorp.gifshow.camera.record.assistant.a;
import ec9.j;
import cc9.c;
import sa6.a;

public final class s implements f$c	// class@000404
{
    public final l a;

    public void s(l p0){
       this.a = p0;
       super();
    }
    public void a(){
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, s.class, "1")) {
          return;
       }
       this.a.i2(false);
       Object[] objArray = new Object[false];
       a.D().w("CameraAssistant", "download model onCloseBtn", objArray);
       s ta = this.a;
       if (ta.e instanceof CameraActivity) {
          ta.g2().g().w0(new c(3));
       }
       return;
    }
    public void c(){
    }
    public void onShow(){
    }
}
