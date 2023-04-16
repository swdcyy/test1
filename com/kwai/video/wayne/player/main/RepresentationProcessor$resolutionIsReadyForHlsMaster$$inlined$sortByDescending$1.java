package com.kwai.video.wayne.player.main.RepresentationProcessor$resolutionIsReadyForHlsMaster$$inlined$sortByDescending$1;
import java.util.Comparator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.player.KwaiRepresentation;
import usd.q;
import java.lang.Integer;
import java.lang.Comparable;
import xrd.b;

public final class RepresentationProcessor$resolutionIsReadyForHlsMaster$$inlined$sortByDescending$1 implements Comparator	// class@000d93
{

    public void RepresentationProcessor$resolutionIsReadyForHlsMaster$$inlined$sortByDescending$1(){
       super();
    }
    public final int compare(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, RepresentationProcessor$resolutionIsReadyForHlsMaster$$inlined$sortByDescending$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return b.f(Integer.valueOf(q.u(p1.width, p1.height)), Integer.valueOf(q.u(p0.width, p0.height)));
    }
}
