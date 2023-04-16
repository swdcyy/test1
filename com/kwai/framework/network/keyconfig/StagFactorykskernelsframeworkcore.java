package com.kwai.framework.network.keyconfig.StagFactorykskernelsframeworkcore;
import zk.j;
import java.lang.Object;
import com.google.gson.Gson;
import el.a;
import com.google.gson.TypeAdapter;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ob6.h;
import com.kwai.framework.network.keyconfig.KeyConfig$TypeAdapter;

public final class StagFactorykskernelsframeworkcore implements j	// class@0017e0
{

    public void StagFactorykskernelsframeworkcore(){
       super();
    }
    public TypeAdapter a(Gson p0,a p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, StagFactorykskernelsframeworkcore.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p1.getRawType() == h.class) {
          return new KeyConfig$TypeAdapter(p0);
       }
       return null;
    }
}
