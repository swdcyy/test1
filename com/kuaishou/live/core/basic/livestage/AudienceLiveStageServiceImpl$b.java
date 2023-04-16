package com.kuaishou.live.core.basic.livestage.AudienceLiveStageServiceImpl$b;
import ee3.z;
import java.lang.Object;
import fe3.d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.model.user.QCurrentUser;
import kotlin.jvm.internal.a;

public final class AudienceLiveStageServiceImpl$b implements z	// class@000841
{
    public static final AudienceLiveStageServiceImpl$b a;

    static {
       AudienceLiveStageServiceImpl$b.a = new AudienceLiveStageServiceImpl$b();
    }
    public void AudienceLiveStageServiceImpl$b(){
       super();
    }
    public final d a(){
       Object obj = PatchProxy.apply(null, this, AudienceLiveStageServiceImpl$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       QCurrentUser mE = QCurrentUser.ME;
       a.o(mE, "QCurrentUser.ME");
       String id = mE.getId();
       a.o(id, "QCurrentUser.ME.id");
       return new d(id);
    }
}
