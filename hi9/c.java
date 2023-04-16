package hi9.c;
import z1.a;
import com.yxcorp.gifshow.camera.record.whatsup.WhatsUpFragment;
import java.util.List;
import java.lang.Object;
import com.yxcorp.gifshow.camera.record.RecordPModuleRegister$a;
import java.util.Objects;
import com.yxcorp.gifshow.camera.record.base.CameraBaseFragment;
import com.yxcorp.gifshow.camera.record.RecordPModuleRegister$PModuleSubBiz;
import oc9.t;
import lnc.q;

public final class c implements a	// class@00268f
{
    public final WhatsUpFragment a;
    public final List b;

    public void c(WhatsUpFragment p0,List p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void accept(Object p0){
       c ta = this.a;
       Objects.requireNonNull(ta);
       q.a(this.b, p0.c(ta, null));
    }
}
