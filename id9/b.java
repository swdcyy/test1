package id9.b;
import erd.g;
import id9.d;
import java.lang.Object;
import ed9.b;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.camera.record.base.d;
import eg9.a;
import com.yxcorp.gifshow.camera.record.base.b;

public final class b implements g	// class@0027e8
{
    public final d b;

    public void b(d p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       b tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, d.class, "5")) {
       }else {
          tb.d.m(new a(true));
       }
       return;
    }
}
