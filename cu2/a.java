package cu2.a;
import qvb.f;
import java.lang.String;
import brd.t;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import bs2.a;
import com.kuaishou.live.core.voiceparty.http.LiveVoicePartyApi;
import cjd.e;
import erd.o;

public class a extends f	// class@0023e7
{
    public String p;
    public String q;
    public String r;

    public void a(String p0,String p1){
       super();
       this.p = p0;
       this.q = p1;
    }
    public t I1(){
       Object obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveVoicePartyApi.b().B(this.p, this.q, this.r).map(new e());
    }
    public void h2(String p0){
       this.r = p0;
    }
}
