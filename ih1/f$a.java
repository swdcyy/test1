package ih1.f$a;
import java.lang.Runnable;
import ih1.f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class f$a implements Runnable	// class@0028d9
{
    public final f b;

    public void f$a(f p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, f$a.class, "1")) {
          return;
       }
       this.b.e();
       return;
    }
}
