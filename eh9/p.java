package eh9.p;
import erd.g;
import com.yxcorp.gifshow.camera.record.tab.d;
import java.lang.Object;
import vs5.c;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class p implements g	// class@002157
{
    public final d b;

    public void p(d p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       p tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, d.class, "12")) {
       }else {
          tb.e();
       }
       return;
    }
}
