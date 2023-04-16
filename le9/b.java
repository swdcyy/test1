package le9.b;
import erd.g;
import le9.d;
import com.yxcorp.gifshow.camera.record.magic.dataConvey.model.MagicRequest;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import j8c.a;
import w46.b;
import java.util.Map;

public final class b implements g	// class@002dba
{
    public final d b;
    public final MagicRequest c;

    public void b(d p0,MagicRequest p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
       }else {
          a.D().e(this.b.b(), "handle request error", p0);
          p0 = this.c.getSeqId();
          p0 = (p0 == null || !p0.length())? 1: null;
          if (!p0) {
             this.b.a.remove(this.c.getSeqId());
          }
       }
       return;
    }
}
