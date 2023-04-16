package l31.f$b;
import sj3.b;
import l31.f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.topbar.topuser.i;
import com.kuaishou.android.live.model.QLivePlayConfig;
import sj3.a;
import java.lang.Throwable;

public class f$b implements b	// class@002e72
{
    public final f b;

    public void f$b(f p0){
       this.b = p0;
       super();
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, f$b.class, "2")) {
          return;
       }
       this.b.x9(false, "LivePlayerReconnectListener.onAfterConfigUpdated");
       return;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, f$b.class, "1")) {
          return;
       }
       this.b.o9("onStartTryReconnect");
       return;
    }
    public void e2(QLivePlayConfig p0,QLivePlayConfig p1){
       a.b(this, p0, p1);
    }
    public void onError(Throwable p0){
       a.c(this, p0);
    }
}
