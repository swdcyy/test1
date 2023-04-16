package nf9.a$c;
import erd.g;
import nf9.a;
import java.lang.Object;
import j4b.n;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;

public final class a$c implements g	// class@003174
{
    public final a b;

    public void a$c(a p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$c.class, "1")) {
       }else {
          n a = p0.a;
          if (a != null) {
             a o = this.b.o;
             SimpleMagicFace mId = (o != null)? o.mId: null;
             if (MagicEmoji$MagicFace.isMagicFaceEquals(a, mId)) {
             label_0026 :
                this.b.o = p0.a;
             }
          }
          this.b.g2();
          goto label_0026 ;
       }
       return;
    }
}
