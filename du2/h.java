package du2.h;
import qvb.f;
import java.lang.String;
import brd.t;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import qvb.n0;
import com.kuaishou.live.core.voiceparty.online.userlist.VoicePartyOnlineResponse;
import bs2.a;
import com.kuaishou.live.core.voiceparty.http.LiveVoicePartyApi;
import cjd.e;
import erd.o;

public class h extends f	// class@0025a4
{
    public String p;
    public String q;

    public void h(String p0,String p1){
       super();
       this.p = p0;
       this.q = p1;
    }
    public t I1(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, h.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!this.K() && this.L0() != null) {
          objArray = this.L0().getCursor();
       }
       return LiveVoicePartyApi.b().w(this.p, this.q, objArray, 100).map(new e());
    }
}
