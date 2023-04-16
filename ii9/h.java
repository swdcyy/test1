package ii9.h;
import com.yxcorp.gifshow.camera.record.base.b$a;
import ii9.i;
import java.lang.Object;
import java.util.Objects;
import ii9.i$a;

public final class h implements b$a	// class@002839
{
    public final i a;

    public void h(i p0){
       this.a = p0;
    }
    public final Object getData(){
       h ta = this.a;
       Objects.requireNonNull(ta);
       return new i$a(ta.t);
    }
}
