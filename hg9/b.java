package hg9.b;
import erd.g;
import com.yxcorp.gifshow.camera.record.photo.e;
import java.lang.Object;
import j4b.l;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class b implements g	// class@00264f
{
    public final e b;

    public void b(e p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       b tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, e.class, "10")) {
       }else {
          tb.A = false;
          tb.n2();
       }
       return;
    }
}
