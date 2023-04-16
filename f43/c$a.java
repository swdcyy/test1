package f43.c$a;
import erd.g;
import f43.c;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import pp.a;
import q87.c;

public class c$a implements g	// class@00286b
{
    public final c b;

    public void c$a(c p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$a.class, "1")) {
       }else {
          Object[] objArray = new Object[0];
          a.C().t("GameLiveAuthManager", p0.getMessage(), objArray);
       }
       return;
    }
}
