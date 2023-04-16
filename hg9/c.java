package hg9.c;
import erd.g;
import com.yxcorp.gifshow.camera.record.photo.e;
import java.lang.Object;
import zb9.q;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class c implements g	// class@002652
{
    public final e b;

    public void c(e p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       c tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, e.class, "22")) {
       }else {
          tb.z = p0.a;
          tb.n2();
       }
       return;
    }
}
