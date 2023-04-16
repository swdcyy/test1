package ed9.f;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import java.lang.Object;
import java.util.HashMap;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Map;
import com.kwai.gifshow.post.api.core.event.PanelShowEvent;
import com.kwai.gifshow.post.api.core.event.PanelShowEvent$PanelType;

public class f	// class@002114
{
    public final CameraPageType a;
    public final Map b;

    public void f(CameraPageType p0){
       super();
       this.b = new HashMap();
       this.a = p0;
    }
    public boolean a(){
       Object obj = PatchProxy.apply(null, this, f.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (this.b.isEmpty() ^ 0x01);
    }
    public boolean b(PanelShowEvent p0){
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       f uof = f.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, uof, "3");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (!this.b.isEmpty()) {
          if (p0.c == PanelShowEvent$PanelType.PRETTIFY && p0.a == null) {
             PanelShowEvent$PanelType iMMERSE_MODE = PanelShowEvent$PanelType.IMMERSE_MODE;
             Object obj1 = PatchProxy.applyOneRefs(iMMERSE_MODE, this, uof, "5");
             if (obj1 != patchProxyRe) {
                b1 = obj1.booleanValue();
             }else {
                Boolean uBoolean = this.b.get(iMMERSE_MODE);
                b1 = (uBoolean != null && uBoolean.booleanValue())? true: false;
             }
             if (!b1) {
             label_004e :
                b = false;
             }
          }
       }else {
          goto label_004e ;
       }
       return b;
    }
    public void c(PanelShowEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "1")) {
          return;
       }
       if (this.a == p0.b) {
          PanelShowEvent c = p0.c;
          if (c != PanelShowEvent$PanelType.MORE_OPTION) {
             if (p0.a != null) {
                this.b.put(c, Boolean.TRUE);
             }else {
                this.b.remove(c);
             }
          }
       }
       return;
    }
}
