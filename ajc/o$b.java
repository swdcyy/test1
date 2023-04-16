package ajc.o$b;
import erd.o;
import brd.t;
import java.lang.Object;
import com.yxcorp.gifshow.share.OperationModel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.w;
import kotlin.jvm.internal.a;

public final class o$b implements o	// class@000144
{
    public final t b;

    public void o$b(t p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       o$b uob = PatchProxy.applyOneRefs(p0, this, o$b.class, "1");
       if (uob != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          uob = this.b;
       }
       return uob;
    }
}
