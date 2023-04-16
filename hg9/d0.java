package hg9.d0;
import erd.g;
import com.yxcorp.gifshow.camera.record.photo.m;
import java.lang.Object;
import ed9.b;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import oc9.d0;
import com.yxcorp.gifshow.camera.record.base.d;
import eg9.a;
import com.yxcorp.gifshow.camera.record.base.b;

public final class d0 implements g	// class@002653
{
    public final m b;

    public void d0(m p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       d0 tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, m.class, "13")) {
       }else if(!tb.f2()){
          tb.d.m(new a(true));
          tb.n2();
       }
       return;
    }
}
