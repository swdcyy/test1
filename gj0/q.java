package gj0.q;
import erd.g;
import java.lang.String;
import sj0.b;
import java.lang.Object;
import gj0.d;
import com.kuaishou.krn.bundle.preload.KrnReactRootPreloadManager;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.krn.bundle.preload.PreloadType;
import java.lang.Enum;
import java.lang.StringBuilder;
import ek0.d;
import java.util.HashMap;
import fk0.a;
import com.kuaishou.krn.instance.JsExecutorConfig;
import bk0.j;

public final class q implements g	// class@0024ff
{
    public final String b;
    public final b c;

    public void q(String p0,b p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       q tb = this.b;
       q tc = this.c;
       if (PatchProxy.applyVoidThreeRefs(tb, tc, p0, null, KrnReactRootPreloadManager.class, "16")) {
       }else if(p0.preloadType != PreloadType.GENERATE_CODE_CACHE.ordinal()){
          d.e("reportGenerateCocdecache:"+p0);
          HashMap hashMap = new HashMap();
          hashMap.put("bundleId", p0.a());
          a uoa = tc.a();
          if (uoa != null) {
             hashMap.put("version", uoa.version);
             hashMap.put("componentName", uoa.componentName);
          }
          hashMap.put("sceneType", tb);
          hashMap.put("type", p0.c().mType.toString());
          j.b.b("krn_codecache_end", hashMap);
       }
       return;
    }
}
