package eh9.r;
import erd.g;
import com.yxcorp.gifshow.camera.record.tab.d;
import java.lang.Object;
import zca.v;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class r implements g	// class@002159
{
    public final d b;

    public void r(d p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       r tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, d.class, "14")) {
       }else {
          tb.c();
       }
       return;
    }
}
