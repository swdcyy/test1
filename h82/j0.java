package h82.j0;
import ub.a;
import h82.k0;
import java.lang.String;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;

public class j0 extends a	// class@002cd7
{
    public final k0 b;

    public void j0(k0 p0){
       this.b = p0;
       super();
    }
    public void onFailure(String p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, j0.class, "1")) {
          return;
       }
       b.I(LiveLogTag.FANS_GROUP, "[RIGHT_BOTTOM] bind icon fail", p1);
       return;
    }
}
