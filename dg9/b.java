package dg9.b;
import com.yxcorp.gifshow.camera.record.base.b$a;
import dg9.f;
import java.lang.Object;
import java.util.Objects;

public final class b implements b$a	// class@001f2e
{
    public final f a;

    public void b(f p0){
       this.a = p0;
    }
    public final Object getData(){
       b ta = this.a;
       Objects.requireNonNull(ta);
       return ta;
    }
}
