package h82.z$a;
import kg1.f$b;
import h82.z;
import java.lang.Object;
import com.kuaishou.live.common.core.component.fansgroup.model.LiveFansGroupAudienceStatusResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class z$a implements f$b	// class@002cf1
{
    public final z a;

    public void z$a(z p0){
       this.a = p0;
       super();
    }
    public void a(LiveFansGroupAudienceStatusResponse p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, z$a.class, "1")) {
          return;
       }
       this.a.h9(p0.mIsInactiveSoon);
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, z$a.class, "2")) {
          return;
       }
       this.a.h9(false);
       return;
    }
}
