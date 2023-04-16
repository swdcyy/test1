package b82.e;
import b82.a;
import java.lang.Object;
import java.util.PriorityQueue;
import tp5.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Queue;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.Boolean;
import pp.c;
import com.kuaishou.android.live.log.b;

public class e implements a	// class@000369
{
    public final Queue a;

    public void e(){
       super();
       this.a = new PriorityQueue();
    }
    public void a(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       this.a.offer(p0);
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, e.class, "3")) {
          return;
       }
       this.a.clear();
       return;
    }
    public c c(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       e uoe = e.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, uoe, "2");
       if (obj != patchProxyRe) {
          return obj;
       }
       Object obj1 = PatchProxy.apply(objArray, this, uoe, "5");
       if (obj1 != patchProxyRe) {
          objArray = obj1;
       }else {
          while (!this.a.isEmpty()) {
             c uoc = this.a.poll();
             if (uoc != null && uoc.isValid()) {
                objArray = uoc;
                break ;
             }
          }
       }
       LiveLogTag lIVE_ENTER_R = LiveLogTag.LIVE_ENTER_ROOM_EFFECT;
       boolean b = (objArray == null)? true: false;
       b.c0(lIVE_ENTER_R, "enter room v2 popNextTask", "task is null", Boolean.valueOf(b));
       return objArray;
    }
    public boolean d(){
       Object obj = PatchProxy.apply(null, this, e.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.a.isEmpty();
    }
}
