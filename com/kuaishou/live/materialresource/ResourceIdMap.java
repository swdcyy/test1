package com.kuaishou.live.materialresource.ResourceIdMap;
import java.io.File;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.HashMap;
import com.kuaishou.live.materialresource.ResourceIdMap$resIdMapFile$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class ResourceIdMap	// class@000c95
{
    public final HashMap a;
    public b b;
    public final p c;
    public final File d;

    public void ResourceIdMap(File p0){
       a.p(p0, "cacheDir");
       super();
       this.d = p0;
       this.a = new HashMap();
       this.c = s.c(new ResourceIdMap$resIdMapFile$2(this));
    }
    public final File a(){
       Object obj = PatchProxy.apply(null, this, ResourceIdMap.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.c.getValue();
    }
}
