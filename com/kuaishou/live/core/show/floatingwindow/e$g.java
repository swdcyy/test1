package com.kuaishou.live.core.show.floatingwindow.e$g;
import mq5.d$a;
import com.kuaishou.live.core.show.floatingwindow.e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.live.core.show.floatingwindow.z;
import m91.b;
import t02.a0;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import aq5.a;

public class e$g implements d$a	// class@000b81
{
    public final e a;

    public void e$g(e p0){
       this.a = p0;
       super();
    }
    public boolean a(){
       Object obj = PatchProxy.apply(null, this, e$g.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (z.c() && !this.a.w.N().r2(AudienceBizRelation.VOICE_PARTY_THEATER))? true: false;
       return b;
    }
}
