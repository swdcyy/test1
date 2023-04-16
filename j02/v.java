package j02.v;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.String;
import java.util.List;
import pp.c;
import java.lang.Object;
import java.util.HashMap;
import j02.v$a;
import j02.v$b;
import java.util.Set;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import androidx.collection.ArraySet;
import java.lang.StringBuilder;
import java.lang.Boolean;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.common.core.component.watchtimer.b;
import java.lang.Number;

public class v	// class@002a34
{
    public final HashMap a;
    public static final List b;

    static {
       v.b = LiveLogTag.LIVE_AUDIENCE_ENCOURAGE_TREASURE_BOX.appendTag("LiveWatchTimerTaskManagerWrapper");
    }
    public void v(){
       super();
       this.a = new HashMap();
    }
    public void v(v$a p0){
       super();
       this.a = new HashMap();
    }
    public static v a(){
       return v$b.a;
    }
    public final Set b(String p0){
       ArraySet uArraySet;
       Set obj = PatchProxy.applyOneRefs(p0, this, v.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a.get(p0);
       if (obj == null) {
          uArraySet = new ArraySet();
          this.a.put(p0, uArraySet);
       }
       return uArraySet;
    }
    public final String c(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, v.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return p0+"_"+p1;
    }
    public boolean d(String p0,String p1,String p2,String p3){
       Set obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, v.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.b(this.c(p0, p1));
       obj.remove(p3);
       if (obj.size() > 0) {
          b.S(v.b, "pause fail, other page still count down...", "currentPages", obj.toString());
          return false;
       }else {
          b.P(v.b, "pause success");
          return b.e().h(p0, p1, p2);
       }
    }
    public long e(String p0,String p1,String p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, v.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       b.U(v.b, "query", "biz", p0, "token", p1, "source", p2);
       return b.e().i(p0, p1, p2);
    }
}
