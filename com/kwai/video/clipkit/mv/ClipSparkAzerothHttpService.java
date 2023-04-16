package com.kwai.video.clipkit.mv.ClipSparkAzerothHttpService;
import com.kwai.video.ksspark.NewSparkHttpService;
import java.lang.Object;
import java.lang.String;
import com.kwai.video.ksspark.NewSparkHttpCallback;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import com.kwai.video.clipkit.KSClipLog;
import c97.d;
import com.kwai.middleware.azeroth.network.a$b;
import java.util.HashMap;
import zk.d;
import x97.p;
import com.kwai.video.clipkit.mv.ClipSparkAzerothHttpService$StringResponseJsonAdapter;
import java.lang.reflect.Type;
import com.kwai.middleware.azeroth.network.a;
import com.kwai.video.clipkit.mv.ClipSparkAzerothHttpService$1;
import java.util.Map;
import ca7.c;

public class ClipSparkAzerothHttpService implements NewSparkHttpService	// class@001ab2
{
    public String mSpecialHost;

    public void ClipSparkAzerothHttpService(){
       super();
    }
    public void sendHttpRequest(String p0,String p1,String p2,NewSparkHttpCallback p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, ClipSparkAzerothHttpService.class, "1")) {
          return;
       }
       KSClipLog.i("ClipSparkRecovery", "sendHttpRequest path: "+p0+", method: "+p2+", body: "+p1);
       a$b uob = d.a().k("material/kmovie");
       uob.k(this.mSpecialHost);
       uob.i("COMMON_RESOURCE");
       HashMap hashMap = new HashMap();
       hashMap.put("resourceInfos", p1);
       p1 = "GET";
       if (!p1.equals(p2)) {
          p1 = "POST";
       }
       uob.b().f(p.class, new ClipSparkAzerothHttpService$StringResponseJsonAdapter());
       uob.a().f(p0, p1, null, null, hashMap, String.class, new ClipSparkAzerothHttpService$1(this, p3));
       return;
    }
    public void setSpecialHost(String p0){
       this.mSpecialHost = p0;
    }
}
