package com.kwai.feature.post.api.encode.c;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import com.kwai.feature.post.api.encode.d;
import com.yxcorp.gifshow.util.PostUtils;
import java.util.concurrent.TimeoutException;
import java.lang.String;
import lnc.p3;
import q87.c;

public final class c implements g	// class@00130e
{
    public static final c b;

    static {
       c.b = new c();
    }
    public void c(){
       super();
    }
    public final void accept(Object p0){
       Object[] objArray;
       int i = 0;
       if (!PostUtils.u(p0) && !p0 instanceof TimeoutException) {
          PostUtils.D("EncodeApiHelper", "EncodeConfigResponse", p0);
       }else {
          objArray = new Object[i];
          p3.D().A("EncodeConfigResponse", "network error!", objArray);
       }
       objArray = new Object[i];
       p3.D().w("EncodeConfigResponse", "error!", objArray);
       return;
    }
}
