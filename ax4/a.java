package ax4.a;
import com.kuaishou.tachikoma.api.container.TKContainer;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public class a	// class@000313
{
    public LinkedList a;
    public LinkedList b;
    public boolean c;
    public TKContainer d;

    public void a(TKContainer p0){
       super();
       this.c = false;
       this.d = p0;
    }
    public final boolean a(){
       Object obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return TKContainer.L();
    }
}
