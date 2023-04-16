package e1a.r;
import java.lang.Runnable;
import com.yxcorp.gifshow.detail.helper.d;
import java.util.List;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.google.gson.JsonArray;
import java.util.Iterator;
import z1.e;
import com.yxcorp.gifshow.detail.helper.PlayPositionInfo;
import com.google.gson.JsonElement;
import wkd.b;
import com.kwai.framework.cache.CacheManager;
import lnc.a1;
import java.lang.reflect.Type;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;

public final class r implements Runnable	// class@002055
{
    public final d b;
    public final List c;

    public void r(d p0,List p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       r tb = this.b;
       r tc = this.c;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(tc, tb, d.class, "10")) {
       }else {
          JsonArray jsonArray = new JsonArray();
          Iterator iterator = tc.iterator();
          while (iterator.hasNext()) {
             e uoe = iterator.next();
             JsonArray jsonArray1 = new JsonArray();
             e a = uoe.a;
             if (a == null || uoe.b == null) {
                continue ;
             }
             jsonArray1.a0(a);
             jsonArray1.G(uoe.b.toJsonElement());
             jsonArray.G(jsonArray1);
          }
          Object obj = b.a(0x5f2ddeb4);
          try{
             obj.c("long_video_progress_key", jsonArray, JsonArray.class, (d.d + a1.k()));
          }catch(java.lang.Exception e0){
             ExceptionHandler.handleCaughtException(e0);
          }
       }
    }
}
