package com.kwai.feature.post.api.encode.EncodeApiServiceManager;
import com.kwai.feature.post.api.encode.EncodeApiServiceManager$apiService$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import u16.d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class EncodeApiServiceManager	// class@00130b
{
    public static final p a;
    public static final EncodeApiServiceManager b;

    static {
       EncodeApiServiceManager.b = new EncodeApiServiceManager();
       EncodeApiServiceManager.a = s.c(EncodeApiServiceManager$apiService$2.INSTANCE);
    }
    public void EncodeApiServiceManager(){
       super();
    }
    public final d a(){
       Object obj = PatchProxy.apply(null, this, EncodeApiServiceManager.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return EncodeApiServiceManager.a.getValue();
    }
}
