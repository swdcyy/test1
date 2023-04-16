package e19.g$c;
import g59.q$a;
import e19.g;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import de5.a;
import com.yxcorp.gifshow.detail.event.PlayEvent;
import com.yxcorp.gifshow.detail.event.PlayEvent$Status;
import org.greenrobot.eventbus.a;
import e17.i;

public class g$c implements q$a	// class@002127
{
    public final g a;
    public static final boolean b;

    public void g$c(g p0){
       this.a = p0;
       super();
    }
    public void a(QPhoto p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g$c.class, "1")) {
          return;
       }
       this.a.S8();
       g r = this.a.r;
       if (r != null) {
          r.z(p0);
       }
       a.d().k(new PlayEvent(this.a.q, PlayEvent$Status.RESUME, 1, "ThanosPhotoPlayRetry"));
       return;
    }
    public void onError(){
       if (PatchProxy.applyVoid(null, this, g$c.class, "2")) {
          return;
       }
       this.a.W8();
       i.a(R.style.arg_RES_7f11066a, 0x7f1038e5);
       return;
    }
}
