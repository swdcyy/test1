package com.kwai.video.player.mid.manifest.v2.filter.CheckRepresentationLegalFilterV2;
import com.kwai.video.player.mid.manifest.v2.filter.RepresentationFilter;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.HashSet;
import java.util.Iterator;
import com.kwai.video.player.mid.manifest.v2.Representation;

public class CheckRepresentationLegalFilterV2 implements RepresentationFilter	// class@000b74
{

    public void CheckRepresentationLegalFilterV2(){
       super();
    }
    public boolean execute(List p0){
       HashSet obj = PatchProxy.applyOneRefs(p0, this, CheckRepresentationLegalFilterV2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 == null || p0.isEmpty()) {
          return false;
       }
       obj = new HashSet();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          obj.add(iterator.next().generateUniqueKeyV2());
       }
       obj.size();
       p0.size();
       return true;
    }
}
