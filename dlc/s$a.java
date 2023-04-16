package dlc.s$a;
import df5.b;
import dlc.s;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import df5.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import org.greenrobot.eventbus.a;
import com.yxcorp.gifshow.detail.event.PlayEvent;
import com.yxcorp.gifshow.detail.event.PlayEvent$Status;

public class s$a implements b	// class@00226c
{
    public final s a;

    public void s$a(s p0){
       this.a = p0;
       super();
    }
    public void a(QPhoto p0){
       a.a(this, p0);
    }
    public void b(QPhoto p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, s$a.class, "1")) {
          return;
       }
       if (p0 != null && this.a.P != null) {
          a.d().k(new PlayEvent(p0, PlayEvent$Status.PAUSE, 29));
       }
       return;
    }
    public void c(QPhoto p0){
       a.c(this, p0);
    }
}
