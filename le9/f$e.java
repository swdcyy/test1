package le9.f$e;
import le9.h;
import le9.f;
import java.lang.Object;
import crd.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.camera.record.base.d;
import j8c.a;
import java.lang.StringBuilder;
import q87.c;
import ui9.j;
import com.yxcorp.gifshow.camerasdk.q;
import com.yxcorp.gifshow.camerasdk.magicface.ILiveImageHelper;
import com.yxcorp.gifshow.camera.record.base.b;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;

public final class f$e implements h	// class@002dc3
{
    public final f a;

    public void f$e(f p0){
       this.a = p0;
       super();
    }
    public void a(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$e.class, "4")) {
          return;
       }
       a.p(p0, "disposable");
       this.a.Y1(p0);
       return;
    }
    public void b(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$e.class, "1")) {
          return;
       }
       a.p(p0, "result");
       Object[] objArray = new Object[0];
       a.D().w("MagicDataConveyController", "setResponse: "+p0, objArray);
       d h = this.a.h;
       if (h != null) {
          j oj = h.q();
          if (oj != null) {
             oj.b(p0);
          }
       }
       return;
    }
    public b h(){
       d obj = PatchProxy.apply(null, this, f$e.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a.d;
       a.o(obj, "mCallerContext");
       return obj;
    }
    public MagicEmoji$MagicFace r(){
       Object obj = PatchProxy.apply(null, this, f$e.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.g2();
    }
}
