package h53.e;
import erd.g;
import h53.c;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;

public class e implements g	// class@002c60
{
    public final c b;

    public void e(c p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
       }else {
          b.I(LiveLogTag.GZONE, "requestUserPendantStatus: ", p0);
       }
       return;
    }
}
