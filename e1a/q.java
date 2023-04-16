package e1a.q;
import java.lang.Runnable;
import com.yxcorp.gifshow.detail.helper.d;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.LinkedHashMap;
import com.yxcorp.gifshow.detail.helper.PlayProgressPositionManager$1;
import com.google.gson.JsonArray;
import wkd.b;
import com.kwai.framework.cache.CacheManager;
import java.lang.reflect.Type;
import java.util.Iterator;
import com.google.gson.JsonElement;
import com.yxcorp.gifshow.detail.helper.PlayPositionInfo;

public final class q implements Runnable	// class@002054
{
    public final d b;

    public void q(d p0){
       this.b = p0;
    }
    public final void run(){
       q tb = this.b;
       Objects.requireNonNull(tb);
       d uod = d.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, tb, uod, "11")) {
       }else {
          PatchProxyResult patchProxyRe = PatchProxyResult.class;
          PlayProgressPositionManager$1 u1 = PatchProxy.apply(objArray, tb, uod, "12");
          if (u1 != patchProxyRe) {
          }else {
             u1 = new PlayProgressPositionManager$1(tb, 8, 0x3f400000, true);
             Object obj = PatchProxy.apply(objArray, tb, uod, "13");
             if (obj != patchProxyRe) {
             }else {
                Object obj1 = PatchProxy.apply(objArray, tb, uod, "14");
                obj = (obj1 != patchProxyRe)? obj1: b.a(0x5f2ddeb4).g("long_video_progress_key", JsonArray.class);
             }
             if (obj != null) {
                Iterator iterator = obj.iterator();
                try{
                   while (iterator.hasNext()) {
                      JsonElement jsonElement = iterator.next();
                      u1.put(jsonElement.q().e0(0).w(), new PlayPositionInfo(jsonElement.q().e0(true)));
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
