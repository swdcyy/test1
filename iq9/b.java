package iq9.b;
import java.lang.Runnable;
import com.yxcorp.gifshow.corona.common.manager.a;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.LinkedHashMap;
import com.yxcorp.gifshow.corona.common.manager.VideoWatchCompleteStateManager$1;
import com.google.gson.JsonArray;
import wkd.b;
import com.kwai.framework.cache.CacheManager;
import java.lang.reflect.Type;
import java.util.Iterator;
import com.google.gson.JsonElement;
import java.lang.Boolean;

public final class b implements Runnable	// class@0028a3
{
    public final a b;

    public void b(a p0){
       this.b = p0;
    }
    public final void run(){
       b tb = this.b;
       Objects.requireNonNull(tb);
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, tb, uoa, "6")) {
       }else {
          PatchProxyResult patchProxyRe = PatchProxyResult.class;
          VideoWatchCompleteStateManager$1 u1 = PatchProxy.apply(objArray, tb, uoa, "7");
          if (u1 != patchProxyRe) {
          }else {
             u1 = new VideoWatchCompleteStateManager$1(tb, 8, 0x3f400000, true);
             Object obj = PatchProxy.apply(objArray, tb, uoa, "8");
             if (obj != patchProxyRe) {
             }else {
                Object obj1 = PatchProxy.apply(objArray, tb, uoa, "9");
                obj = (obj1 != patchProxyRe)? obj1: b.a(0x5f2ddeb4).g("key_corona_video_watch_complete_state", JsonArray.class);
             }
             if (obj != null) {
                Iterator iterator = obj.iterator();
                try{
                   while (iterator.hasNext()) {
                      JsonElement jsonElement = iterator.next();
                      u1.put(jsonElement.q().e0(0).w(), Boolean.valueOf(jsonElement.q().e0(true).d()));
                   }
                }catch(java.lang.Exception e0){
                   u1.clear();
                }
             }
          }
       }
       return;
    }
}
