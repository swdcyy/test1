package cb3.g$a;
import java.lang.Runnable;
import cb3.g;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.lite.layoutmanager.StageType;
import vb3.c;

public final class g$a implements Runnable	// class@0004e5
{
    public final g b;

    public void g$a(g p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, g$a.class, "1")) {
          return;
       }
       b.Z(LiveLiteLogTag.LAYOUT_MANAGER, "fallbackRunnable execute");
       this.b.d(StageType.Show, null);
       return;
    }
}
