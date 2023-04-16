package df9.b;
import com.kwai.video.westeros.v2.faceless.FaceMagicController$FaceMagicRecordingControlListener;
import df9.b$a;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import df9.b$b;
import java.lang.Runnable;
import i0d.g;

public final class b implements FaceMagicController$FaceMagicRecordingControlListener	// class@001f27
{
    public a a;
    public static final b$a b;

    static {
       b.b = new b$a(null);
    }
    public void b(){
       super();
    }
    public void onReceiveRecordingControl(int p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "2")) {
          return;
       }
       if (p0 != 1 && p0 != 2) {
          return;
       }
       g.b(new b$b(this, p0));
       return;
    }
}
