package com.kwai.video.player.mid.manifest.v2.filter.CheckRepresentationLegalFilter;
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

public class CheckRepresentationLegalFilter implements RepresentationFilter	// class@000b73
{

    public void CheckRepresentationLegalFilter(){
       super();
    }
    public boolean execute(List p0){
       HashSet obj = PatchProxy.applyOneRefs(p0, this, CheckRepresentationLegalFilter.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 == null || p0.isEmpty()) {
          return false;
       }
       obj = new HashSet();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          obj.add(iterator.next().generateUniqueKey());
       }
       obj.size();
       p0.size();
       return true;
    }
}
