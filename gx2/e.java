package gx2.e;
import qvb.f;
import dx2.p;
import brd.t;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import qvb.n0;
import com.kuaishou.live.core.voiceparty.theater.model.VoicePartyTheaterPlayListResponse;
import qu2.a;
import bs2.e;
import com.kuaishou.live.core.voiceparty.http.LiveVoicePartyApi;
import co2.f2;
import cjd.e;
import erd.o;
import java.util.List;
import la6.b;

public class e extends f	// class@002bb4
{
    public final p p;

    public void e(p p0){
       super();
       this.p = p0;
    }
    public t I1(){
       Object[] objArray = null;
       t obj = PatchProxy.apply(objArray, this, e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!this.K() && this.L0() != null) {
          objArray = this.L0().getCursor();
       }
       Object[] objArray1 = objArray;
       obj = (this.p.d().e())? LiveVoicePartyApi.e().j(this.p.d().getLiveStreamId(), this.p.g().y(), this.p.f(), objArray1, 20): LiveVoicePartyApi.e().g(this.p.d().getLiveStreamId(), this.p.g().y(), this.p.f(), objArray1, 20);
       return obj.map(new e());
    }
    public void M1(Object p0,List p1){
       this.h2(p0, p1);
    }
    public void d2(b p0,List p1){
       this.h2(p0, p1);
    }
    public void h2(VoicePartyTheaterPlayListResponse p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e.class, "2")) {
          return;
       }
       super.d2(p0, p1);
       return;
    }
}
