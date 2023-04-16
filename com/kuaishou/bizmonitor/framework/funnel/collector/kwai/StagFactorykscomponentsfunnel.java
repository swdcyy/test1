package com.kuaishou.bizmonitor.framework.funnel.collector.kwai.StagFactorykscomponentsfunnel;
import zk.j;
import java.lang.Object;
import com.google.gson.Gson;
import el.a;
import com.google.gson.TypeAdapter;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.bizmonitor.framework.funnel.collector.kwai.PersistentStorage$b;
import com.kuaishou.bizmonitor.framework.funnel.collector.kwai.PersistentStorage$Item$TypeAdapter;

public final class StagFactorykscomponentsfunnel implements j	// class@001151
{

    public void StagFactorykscomponentsfunnel(){
       super();
    }
    public TypeAdapter a(Gson p0,a p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, StagFactorykscomponentsfunnel.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p1.getRawType() == PersistentStorage$b.class) {
          return new PersistentStorage$Item$TypeAdapter(p0);
       }
       return null;
    }
}
