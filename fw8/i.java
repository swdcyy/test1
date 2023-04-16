package fw8.i;
import erd.g;
import com.yxcorp.gifshow.activity.f;
import java.lang.Object;
import eda.n;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import wq6.h;
import zr6.e;
import wq6.d;
import ro5.a;

public final class i implements g	// class@00235f
{
    public final f b;

    public void i(f p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       i tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, f.class, "12")) {
       }else {
          a.h(tb.n());
       }
       return;
    }
}
