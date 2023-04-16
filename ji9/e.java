package ji9.e;
import com.yxcorp.gifshow.camera.record.base.b$a;
import com.yxcorp.gifshow.camera.record.wide.a;
import java.lang.Object;
import java.util.Objects;
import ji9.a;
import java.lang.Boolean;

public final class e implements b$a	// class@002ae9
{
    public final a a;

    public void e(a p0){
       this.a = p0;
    }
    public final Object getData(){
       e ta = this.a;
       Objects.requireNonNull(ta);
       Boolean uBoolean = (ta.i2())? Boolean.valueOf(ta.k2()): null;
       return new a(uBoolean);
    }
}
