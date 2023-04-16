package com.kuaishou.live.core.voiceparty.micseats.core.pendant.MicSeatPendantConfigProcessor$priority$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.voiceparty.micseats.core.interfaces.MicSeatPendantId;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import kotlin.jvm.internal.a;
import java.lang.Integer;

public final class MicSeatPendantConfigProcessor$priority$1 extends Lambda implements l	// class@00158c
{
    public static final MicSeatPendantConfigProcessor$priority$1 INSTANCE;

    static {
       MicSeatPendantConfigProcessor$priority$1.INSTANCE = new MicSeatPendantConfigProcessor$priority$1();
    }
    public void MicSeatPendantConfigProcessor$priority$1(){
       super(1);
    }
    public final int invoke(MicSeatPendantId p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MicSeatPendantConfigProcessor$priority$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       a.p(p0, "it");
       return 0;
    }
    public Object invoke(Object p0){
       return Integer.valueOf(this.invoke(p0));
    }
}
