package dl9.s0;
import java.lang.Runnable;
import dl9.x0;
import java.lang.Object;
import java.util.Objects;
import com.yxcorp.gifshow.comment.log.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class s0 implements Runnable	// class@001f9c
{
    public final x0 b;

    public void s0(x0 p0){
       this.b = p0;
    }
    public final void run(){
       x0 z = this.b.z;
       Objects.requireNonNull(z);
       if (PatchProxy.applyVoid(null, z, a.class, "5")) {
       }else {
          z.b = -1;
          z.f();
       }
       return;
    }
}
