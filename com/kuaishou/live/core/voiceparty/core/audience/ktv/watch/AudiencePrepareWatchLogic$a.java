package com.kuaishou.live.core.voiceparty.core.audience.ktv.watch.AudiencePrepareWatchLogic$a;
import erd.c;
import java.lang.Object;
import com.google.common.base.Optional;
import java.lang.Long;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class AudiencePrepareWatchLogic$a implements c	// class@0013bf
{
    public static final AudiencePrepareWatchLogic$a a;

    static {
       AudiencePrepareWatchLogic$a.a = new AudiencePrepareWatchLogic$a();
    }
    public void AudiencePrepareWatchLogic$a(){
       super();
    }
    public Object a(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, AudiencePrepareWatchLogic$a.class, "1");
       if (obj != PatchProxyResult.class) {
          p0 = obj;
       }else {
          a.p(p0, "lyrics");
          a.p(p1, "<anonymous parameter 1>");
       }
       return p0;
    }
}
