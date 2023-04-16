package eh9.q;
import erd.g;
import com.yxcorp.gifshow.camera.record.tab.d;
import java.lang.Object;
import vs5.b;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class q implements g	// class@002158
{
    public final d b;

    public void q(d p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       q tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, d.class, "13")) {
       }else if(p0 != null){
          tb.a(p0.a);
       }
       return;
    }
}
