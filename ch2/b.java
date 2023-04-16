package ch2.b;
import uw1.f;
import ch2.a;
import com.kuaishou.livestream.message.nano.LiveKrnRedPackMessage$LiveKrnRedPack;
import java.lang.Object;
import java.lang.String;
import uw1.e;
import ia1.b;
import com.kuaishou.live.common.core.component.redpacket.container.LiveRedPacketContainerItemBaseFragment;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.redpacket.krn.LiveKrnRedPacketFragment;
import java.util.Map;

public class b implements f	// class@000533
{
    public final LiveKrnRedPackMessage$LiveKrnRedPack a;
    public final a b;

    public void b(a p0,LiveKrnRedPackMessage$LiveKrnRedPack p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public String a(){
       return this.a.redPackId;
    }
    public long b(){
       return e.d(this);
    }
    public boolean c(){
       return e.e(this);
    }
    public b e(){
       return null;
    }
    public LiveRedPacketContainerItemBaseFragment f(String p0){
       a obj = PatchProxy.applyOneRefs(p0, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b.p;
       b ta = this.a;
       LiveKrnRedPacketFragment liveKrnRedPa = PatchProxy.applyThreeRefs(obj, ta, p0, null, LiveKrnRedPacketFragment.class, "1");
       if (liveKrnRedPa != PatchProxyResult.class) {
       }else {
          liveKrnRedPa = new LiveKrnRedPacketFragment(p0);
          liveKrnRedPa.m = obj;
          liveKrnRedPa.n = ta;
       }
       return liveKrnRedPa;
    }
    public int g(){
       return this.a.redPackType;
    }
    public long getOpenTime(){
       return this.a.grabTime;
    }
    public int getPriority(){
       return e.c(this);
    }
    public Map i(){
       return e.a(this);
    }
}
