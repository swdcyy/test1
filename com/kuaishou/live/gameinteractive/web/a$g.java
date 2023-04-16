package com.kuaishou.live.gameinteractive.web.a$g;
import erd.o;
import com.kuaishou.live.gameinteractive.web.a;
import java.lang.Object;
import njd.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.gameinteractive.web.model.GameWebEnergyData;

public class a$g implements o	// class@001c00
{
    public final a b;

    public void a$g(a p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a$g.class, "1");
       if (obj != PatchProxyResult.class) {
       }else if(p0 != null && p0.a() != null){
          obj = p0.a();
       }else {
          obj = GameWebEnergyData.error(p0);
       }
       return obj;
    }
}
