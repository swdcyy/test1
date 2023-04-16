package cx8.d$a;
import erd.f;
import cx8.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import jq.a;

public final class d$a implements f	// class@002011
{
    public final d a;

    public void d$a(d p0){
       this.a = p0;
       super();
    }
    public final void cancel(){
       if (PatchProxy.applyVoid(null, this, d$a.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.c("LocationAPI", "locationSearchNew setCancellable\(\) keyword="+this.a.b, objArray);
       return;
    }
}
