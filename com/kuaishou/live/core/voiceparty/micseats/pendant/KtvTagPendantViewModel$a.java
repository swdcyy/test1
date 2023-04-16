package com.kuaishou.live.core.voiceparty.micseats.pendant.KtvTagPendantViewModel$a;
import z0.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.model.user.UserInfo;
import java.lang.Boolean;

public final class KtvTagPendantViewModel$a implements a	// class@00161c
{

    public void KtvTagPendantViewModel$a(){
       super();
    }
    public final Object apply(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KtvTagPendantViewModel$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       boolean b = (p0 != null)? p0.isMale(): false;
       return Boolean.valueOf(b);
    }
}
