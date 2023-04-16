package com.kuaishou.live.core.basic.livestage.AudienceLiveStageServiceImpl$a;
import ee3.f;
import n91.f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;

public final class AudienceLiveStageServiceImpl$a implements f	// class@000840
{
    public final f a;

    public void AudienceLiveStageServiceImpl$a(f p0){
       this.a = p0;
       super();
    }
    public final long a(){
       Object obj = PatchProxy.apply(null, this, AudienceLiveStageServiceImpl$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.a.s();
    }
}
