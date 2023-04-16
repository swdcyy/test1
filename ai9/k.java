package ai9.k;
import com.yxcorp.gifshow.camera.record.base.b$a;
import ai9.p;
import java.lang.Object;
import java.util.Objects;
import ai9.q;

public final class k implements b$a	// class@0000d3
{
    public final p a;

    public void k(p p0){
       this.a = p0;
    }
    public final Object getData(){
       k ta = this.a;
       Objects.requireNonNull(ta);
       return new q(ta.x);
    }
}
