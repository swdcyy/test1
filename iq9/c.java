package iq9.c;
import java.lang.Runnable;
import com.yxcorp.gifshow.corona.common.manager.a;
import java.util.List;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.google.gson.JsonArray;
import java.util.Iterator;
import z1.e;
import java.lang.Boolean;
import com.google.gson.JsonElement;
import wkd.b;
import com.kwai.framework.cache.CacheManager;
import lnc.a1;
import java.lang.reflect.Type;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import java.util.Map;
import com.kwai.feature.api.corona.monitor.CoronaMonitorUtils;

public final class c implements Runnable	// class@0028a4
{
    public final a b;
    public final List c;

    public void c(a p0,List p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       e a;
       c tb = this.b;
       c tc = this.c;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(tc, tb, a.class, "5")) {
       }else {
          JsonArray jsonArray = new JsonArray();
          Iterator iterator = tc.iterator();
          while (iterator.hasNext()) {
             e uoe = iterator.next();
             JsonArray jsonArray1 = new JsonArray();
             a = uoe.a;
             if (a == null || uoe.b == null) {
                continue ;
             }
             jsonArray1.a0(a);
             jsonArray1.H(uoe.b);
             jsonArray.G(jsonArray1);
          }
          Object obj = b.a(0x5f2ddeb4);
          try{
             obj.c("key_corona_video_watch_complete_state", jsonArray, JsonArray.class, (a.d + a1.k()));
          }catch(java.lang.Exception e0){
             ExceptionHandler.handleCaughtException(e0);
             CoronaMonitorUtils.a("VideoWatchCompleteStateManager", "doPersist", e0, null);
          }
       }
    }
}
