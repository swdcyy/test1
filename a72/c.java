package a72.c;
import java.lang.Runnable;
import com.kuaishou.live.core.show.divertpush.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import aq5.a;
import m91.b;

public class c implements Runnable	// class@000073
{
    public final c b;

    public void c(c p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       this.b.R.yj(AudienceBizRelation.TOP_DIVERT_PUSH);
       return;
    }
}
