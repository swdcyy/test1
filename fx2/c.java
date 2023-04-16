package fx2.c;
import qvb.f;
import brd.t;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import qvb.n0;
import com.kuaishou.live.core.voiceparty.theater.model.VoicePartyTheaterTubeFeedResponse;
import kotlin.jvm.internal.a;
import java.util.List;
import la6.b;
import java.util.Iterator;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt__CollectionsKt;
import com.kuaishou.live.core.voiceparty.theater.model.VoicePartyTheaterTubeFeedWithEpisodes;
import com.yxcorp.gifshow.tube.TubeInfo;

public abstract class c extends f	// class@0029fe
{
    public String p;
    public final int q;

    public void c(int p0){
       super();
       this.q = p0;
    }
    public t I1(){
       Object[] objArray = null;
       VoicePartyTheaterTubeFeedResponse obj = PatchProxy.apply(objArray, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!this.K() && this.L0() != null) {
          obj = this.L0();
          a.o(obj, "latestPage");
          objArray = obj.getCursor();
       }
       return this.i2(this.q, objArray);
    }
    public void M1(Object p0,List p1){
       this.h2(p0, p1);
    }
    public void d2(b p0,List p1){
       this.h2(p0, p1);
    }
    public void h2(VoicePartyTheaterTubeFeedResponse p0,List p1){
       String str;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c.class, "2")) {
          return;
       }
       a.p(p1, "items");
       super.d2(p0, p1);
       p0 = (p0 != null)? p0.mLlsid: null;
       this.p = p0;
       int i = 0;
       Iterator iterator = p1.iterator();
       while (iterator.hasNext()) {
          VoicePartyTheaterTubeFeedWithEpisodes obj = iterator.next();
          int i1 = i + 1;
          if (i < 0) {
             CollectionsKt__CollectionsKt.W();
          }
          obj = obj.mTube;
          if (obj != null) {
             obj.llsid = this.p;
          }
          if (obj != null) {
             i = i + p1.size();
             obj.mPosition = i;
          }
          i = i1;
       }
       return;
    }
    public abstract t i2(int p0,String p1);
}
