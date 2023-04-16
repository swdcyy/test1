package cx8.c$a;
import erd.f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import jq.a;

public final class c$a implements f	// class@00200e
{
    public static final c$a a;

    static {
       c$a.a = new c$a();
    }
    public void c$a(){
       super();
    }
    public final void cancel(){
       if (PatchProxy.applyVoid(null, this, c$a.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.c("LocationAPI", "getPublishPoiList setCancellable\(\)", objArray);
       return;
    }
}
