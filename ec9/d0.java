package ec9.d0;
import erd.a;
import ec9.z;
import cc9.k;
import cc9.n;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ec9.b1;
import ec9.k;
import sa6.b;
import cc9.q;
import java.util.HashMap;
import java.lang.Integer;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import java.util.Map;
import j8c.a;
import java.lang.StringBuilder;
import q87.c;
import java.util.List;

public final class d0 implements a	// class@00216b
{
    public final z b;
    public final k c;
    public final n d;

    public void d0(z p0,k p1,n p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, d0.class, "1")) {
          return;
       }
       Object obj = this.b.a().j().i().get(Integer.valueOf(this.c.b()));
       if (obj instanceof n) {
          objArray = obj;
       }
       Object[] objArray1 = objArray;
       if (objArray1 != null) {
          this.b.a().j().i().put(Integer.valueOf(this.c.b()), n.a(objArray1, null, 100, 2, false, 9, null));
          objArray1 = new Object[0];
          a.D().w("CameraAssistant", "magic: "+this.d.c()+" download "+"success", objArray1);
          this.b.a().h(q.a(this.b.a().j(), null, 0, 0, null, false, false, false, false, 255, null));
       }
       return;
    }
}
