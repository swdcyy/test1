package lg9.c;
import r16.g;
import java.lang.Object;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.camera.record.base.b;
import oc9.t;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import tkd.b;
import tkd.d;
import ce9.h0;
import com.kwai.gifshow.post.api.core.model.CameraFramePageType;
import com.yxcorp.gifshow.camera.record.frame.c;
import uh9.c;
import ng9.e;
import ng9.c;
import com.yxcorp.gifshow.camera.record.base.d;
import eg9.j;

public class c implements g	// class@002de1
{

    public void c(){
       super();
    }
    public t Lb(CameraPageType p0,b p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, c.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return d.a(-61722509).GH(p0, p1);
    }
    public t S20(CameraPageType p0,b p1,CameraFramePageType p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new c(p0, p1, p2);
    }
    public t YP(CameraPageType p0,b p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new c(p0, p1);
    }
    public boolean isAvailable(){
       return true;
    }
    public t q4(CameraPageType p0,b p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, c.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return d.a(0x25e02757).xP(p0, p1, null);
    }
    public t uh(CameraPageType p0,b p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new j(p0, p1);
    }
}
