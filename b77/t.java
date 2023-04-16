package b77.t;
import qo6.k;
import b77.q;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kuaishou.android.live.log.LiveLogTag;
import com.kuaishou.android.live.log.c$b;
import com.kuaishou.android.live.log.c;
import pp.c;
import com.kuaishou.android.live.log.b;

public class t implements k	// class@0003ee
{
    public final q a;

    public void t(q p0){
       this.a = p0;
       super();
    }
    public void onError(int p0,String p1){
       t ot = t.class;
       if (PatchProxy.isSupport(ot) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, ot, "1")) {
          return;
       }
       b.C(LiveLogTag.GZONE, "LiveSportMessagePresenter", c.k("errCode: ", Integer.valueOf(p0), "errMsg", p1));
       return;
    }
    public void onSuccess(){
       if (PatchProxy.applyVoid(null, this, t.class, "2")) {
          return;
       }
       b.B(LiveLogTag.GZONE, "LiveSportMessagePresenter success");
       return;
    }
}
