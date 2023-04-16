package bb3.c;
import vb3.l;
import com.kuaishou.live.lite.sidebar.e;
import java.lang.Object;
import com.kuaishou.live.lite.layoutmanager.StageType;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import bb3.a;
import java.lang.Enum;

public final class c implements l	// class@00035c
{
    public final e a;

    public void c(e p0){
       this.a = p0;
       super();
    }
    public final void a(StageType p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       a.p(p0, "it");
       int i = a.a[p0.ordinal()];
       if (i == 1 || (i == 2 || (i == 3 || i == 4))) {
          this.a.i();
       }
       return;
    }
}
