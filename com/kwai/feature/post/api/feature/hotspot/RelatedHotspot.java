package com.kwai.feature.post.api.feature.hotspot.RelatedHotspot;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public class RelatedHotspot implements Serializable	// class@00139e
{
    public long hotspotId;
    public String hotspotName;
    public static final long serialVersionUID = 0x847a6083ba31e2cf;

    public void RelatedHotspot(){
       super();
    }
    public boolean isValid(){
       RelatedHotspot obj = PatchProxy.apply(null, this, RelatedHotspot.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.hotspotName;
       boolean b = (obj != null && !obj.isEmpty())? true: false;
       return b;
    }
}
