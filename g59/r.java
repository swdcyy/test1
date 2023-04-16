package g59.r;
import erd.g;
import g59.q;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import g59.q$a;
import android.os.SystemClock;

public final class r implements g	// class@002415
{
    public final q b;

    public void r(q p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, r.class, "1")) {
       }else {
          this.b.d.setNeedRetryFreeTraffic(false);
          this.b.e.a(p0);
          p0.b = SystemClock.elapsedRealtime();
       }
       return;
    }
}
