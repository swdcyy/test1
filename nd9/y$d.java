package nd9.y$d;
import android.os.Handler;
import nd9.y;
import android.os.Message;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class y$d extends Handler	// class@003160
{
    public final y a;

    public void y$d(y p0){
       this.a = p0;
       super();
    }
    public void handleMessage(Message p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, y$d.class, "1")) {
          return;
       }
       a.p(p0, "msg");
       this.a.a();
       return;
    }
}
