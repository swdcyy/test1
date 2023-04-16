package com.kuaishou.tuna_core.button.c;
import erd.o;
import java.lang.Object;
import com.kuaishou.tuna_core.button.local_phone.LocalPhoneResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.tuna_core.button.local_phone.LocalPhoneResponse$TunaLocalPhoneModel;
import kotlin.jvm.internal.a;
import com.kuaishou.tuna_logger.KsLogTunaCoreTag;
import java.util.List;
import com.kuaishou.tuna_core.button.TunaLocalPhoneUtils$Companion$getPhoneNumberFromServer$1$1;
import msd.a;
import c15.b;

public final class c implements o	// class@0010b9
{
    public static final c b;

    static {
       c.b = new c();
    }
    public void c(){
       super();
    }
    public Object apply(Object p0){
       LocalPhoneResponse localPhoneRe = PatchProxy.applyOneRefs(p0, this, c.class, "1");
       if (localPhoneRe != PatchProxyResult.class) {
       }else {
          a.p(p0, "res");
          p0 = p0.mData;
          if (p0 == null) {
             b.g(KsLogTunaCoreTag.TUNA_BUTTON.appendTag("getPhoneNumberFromServer"), TunaLocalPhoneUtils$Companion$getPhoneNumberFromServer$1$1.INSTANCE);
             p0 = new LocalPhoneResponse$TunaLocalPhoneModel();
          }
          localPhoneRe = p0;
       }
       return localPhoneRe;
    }
}
