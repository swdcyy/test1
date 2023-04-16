package fg9.a;
import com.yxcorp.gifshow.camera.record.base.b$a;
import fg9.c;
import java.lang.Object;
import java.util.Objects;
import fg9.e;

public final class a implements b$a	// class@002311
{
    public final c a;

    public void a(c p0){
       this.a = p0;
    }
    public final Object getData(){
       a ta = this.a;
       Objects.requireNonNull(ta);
       return new e(ta.s);
    }
}
