package kka.q;
import erd.g;
import com.yxcorp.gifshow.freetraffic.FreeTrafficManager;
import java.lang.Object;
import com.kwai.framework.config.heartbeat.g$c;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import zk.g;
import com.google.gson.JsonObject;
import com.kuaishou.gifshow.network.degrade.RequestTiming;

public final class q implements g	// class@001c1b
{
    public final FreeTrafficManager b;

    public void q(FreeTrafficManager p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       try{
          q tb = this.b;
          Objects.requireNonNull(tb);
          if (PatchProxy.applyVoidOneRefs(p0, tb, FreeTrafficManager.class, "32")) {
          }else {
             g og = p0.a.r0("freeTrafficStatusUpdateTime");
             if (og != null) {
                tb.x(og.t(), p0.b);
             }
          }
          return;
       }catch(java.lang.NumberFormatException e0){
       }
    }
}
