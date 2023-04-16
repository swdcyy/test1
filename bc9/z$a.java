package bc9.z$a;
import com.yxcorp.gifshow.camera.record.base.b$a;
import bc9.z;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ke9.b;
import com.yxcorp.gifshow.camera.record.assistant.a;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.model.MagicBaseConfig;
import ke9.b$a;

public final class z$a implements b$a	// class@000414
{
    public final z a;

    public void z$a(z p0){
       this.a = p0;
       super();
    }
    public Object getData(){
       b uob = PatchProxy.apply(null, this, z$a.class, "1");
       if (uob != PatchProxyResult.class) {
       }else if(this.a.g2().A()){
          uob = new b(this.a.h2(), 0);
       }else if(this.a.g2().C()){
          z u = this.a.u;
          if (u != null) {
             a.m(u);
             if (u.equals(this.a.h2())) {
                uob = new b(this.a.u, 1);
             }
          }
       }
       uob = b.e.a();
       return uob;
    }
}
