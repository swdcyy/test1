package ai9.f;
import com.yxcorp.gifshow.camera.record.base.b$a;
import ai9.i;
import java.lang.Object;
import java.util.Objects;
import ai9.j;

public final class f implements b$a	// class@0000cd
{
    public final i a;

    public void f(i p0){
       this.a = p0;
    }
    public final Object getData(){
       f ta = this.a;
       Objects.requireNonNull(ta);
       return new j(ta.p);
    }
}
