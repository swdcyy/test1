package ip2.a;
import com.kuaishou.live.core.voiceparty.core.shared.a$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.voiceparty.core.shared.CrossRoomPkClose;
import ut7.e;
import hp2.f;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.core.shared.CrossRoomPkOpen;

public class a extends a$b	// class@003067
{
    public String b;

    public void a(){
       super();
       this.b = "";
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, a.class, "4")) {
          return;
       }
       this.b(new CrossRoomPkClose());
       this.b = "";
       return;
    }
    public final void d(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       a.p(p0, "param");
       this.b = p0.a();
       this.b(new CrossRoomPkOpen(p0));
       return;
    }
    public void e(){
    }
}
