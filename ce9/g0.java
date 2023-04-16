package ce9.g0;
import hka.h;
import com.yxcorp.gifshow.camera.record.magic.l;
import java.lang.Object;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;

public class g0 implements h	// class@0005c1
{
    public final l b;

    public void g0(l p0){
       this.b = p0;
       super();
    }
    public void a(Object p0){
    }
    public void b(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g0.class, "1")) {
       }else {
          g0 tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(p0, tb, l.class, "33")) {
             tb.o(p0);
          }
       }
       return;
    }
}
