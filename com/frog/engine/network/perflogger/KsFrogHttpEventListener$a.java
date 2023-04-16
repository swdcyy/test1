package com.frog.engine.network.perflogger.KsFrogHttpEventListener$a;
import okhttp3.EventListener$Factory;
import java.lang.Object;
import okhttp3.Call;
import okhttp3.EventListener;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import okhttp3.Request;
import java.lang.Long;
import com.frog.engine.network.perflogger.KsFrogHttpEventListener;

public final class KsFrogHttpEventListener$a implements EventListener$Factory	// class@00154e
{

    public void KsFrogHttpEventListener$a(){
       super();
    }
    public EventListener create(Call p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KsFrogHttpEventListener$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       long l = -1;
       Object obj1 = p0.request().tag();
       if (obj1 instanceof Long) {
          l = obj1.longValue();
       }
       return new KsFrogHttpEventListener(p0.request(), l);
    }
}
