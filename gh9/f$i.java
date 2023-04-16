package gh9.f$i;
import java.lang.Runnable;
import gh9.f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class f$i implements Runnable	// class@00249c
{
    public final f b;

    public void f$i(f p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, f$i.class, "1")) {
          return;
       }
       this.b.h2();
       return;
    }
}
