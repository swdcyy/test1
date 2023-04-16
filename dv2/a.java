package dv2.a;
import ee3.d0;
import com.kuaishou.live.core.voiceparty.playway.video.VoicePartyAudienceVideoViewController;
import java.lang.Object;
import ee3.b0;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import ee3.j0;
import java.util.Collection;
import trd.u;
import java.util.Set;
import kotlin.collections.CollectionsKt___CollectionsKt;
import mrd.a;

public final class a implements d0	// class@0025a8
{
    public final VoicePartyAudienceVideoViewController a;

    public void a(VoicePartyAudienceVideoViewController p0){
       this.a = p0;
       super();
    }
    public void a(b0 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       a.p(p0, "stageStatus");
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = p0.b.iterator();
       while (iterator.hasNext()) {
          Object obj = iterator.next();
          if (obj.c != null) {
             uArrayList.add(obj);
          }
       }
       ArrayList uArrayList1 = new ArrayList(u.Y(uArrayList, 10));
       Iterator iterator1 = uArrayList.iterator();
       while (iterator1.hasNext()) {
          uArrayList1.add(iterator1.next().a);
       }
       this.a.n.onNext(CollectionsKt___CollectionsKt.L5(uArrayList1));
       return;
    }
}
