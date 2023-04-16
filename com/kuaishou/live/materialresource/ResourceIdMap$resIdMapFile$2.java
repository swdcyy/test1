package com.kuaishou.live.materialresource.ResourceIdMap$resIdMapFile$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.materialresource.ResourceIdMap;
import java.io.File;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class ResourceIdMap$resIdMapFile$2 extends Lambda implements a	// class@000c94
{
    public final ResourceIdMap this$0;

    public void ResourceIdMap$resIdMapFile$2(ResourceIdMap p0){
       this.this$0 = p0;
       super(0);
    }
    public final File invoke(){
       Object obj = PatchProxy.apply(null, this, ResourceIdMap$resIdMapFile$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new File(this.this$0.d, "resIdMap.txt");
    }
    public Object invoke(){
       return this.invoke();
    }
}
