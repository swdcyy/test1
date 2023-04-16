package le9.c;
import erd.a;
import le9.d;
import com.yxcorp.gifshow.camera.record.magic.dataConvey.model.MagicRequest;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import j8c.a;
import java.lang.StringBuilder;
import q87.c;
import java.lang.CharSequence;
import java.util.Map;

public final class c implements a	// class@002dbb
{
    public final d b;
    public final MagicRequest c;

    public void c(d p0,MagicRequest p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w(this.b.b(), "handle request complete : "+this.c.getSeqId(), objArray);
       String seqId = this.c.getSeqId();
       if (seqId == null || !seqId.length()) {
          i = 1;
       }
       if (!i) {
          this.b.a.remove(this.c.getSeqId());
       }
       return;
    }
}
