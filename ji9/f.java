package ji9.f;
import erd.g;
import com.yxcorp.gifshow.camera.record.wide.a;
import java.lang.Object;
import bj9.a;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.camera.record.base.d;

public final class f implements g	// class@002aea
{
    public final a b;

    public void f(a p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       f tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, a.class, "14")) {
       }else if(p0.b != tb.c){
          tb.p2();
       }
       return;
    }
}
