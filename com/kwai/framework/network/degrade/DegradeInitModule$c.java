package com.kwai.framework.network.degrade.DegradeInitModule$c;
import com.kwai.framework.network.degrade.e$b;
import com.kwai.framework.network.degrade.DegradeInitModule;
import java.lang.Object;
import java.util.HashMap;
import com.yxcorp.gifshow.retrofit.degrade.DegradeConfig$UrlDegrade;
import okhttp3.Request;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import okhttp3.HttpUrl;
import java.net.URL;
import java.util.Map;
import java.lang.Integer;
import ekd.k1;
import java.util.Random;

public class DegradeInitModule$c implements e$b	// class@0017b5
{
    public Map a;
    public final DegradeInitModule b;

    public void DegradeInitModule$c(DegradeInitModule p0){
       this.b = p0;
       super();
       this.a = new HashMap();
    }
    public synchronized String a(DegradeConfig$UrlDegrade p0,Request p1,String p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, DegradeInitModule$c.class, "1");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       if (p1 == null) {
          return "0";
       }
       String path = p1.url().url().getPath();
       Integer integer = this.a.get(path);
       integer = (integer == null)? Integer.valueOf(k1.b.nextInt(Integer.MAX_VALUE)): Integer.valueOf((integer.intValue() + 1));
       this.a.put(path, integer);
       return String.valueOf((integer.intValue() % p0.mMaxPage));
    }
}
