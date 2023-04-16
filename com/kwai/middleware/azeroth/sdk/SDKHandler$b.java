package com.kwai.middleware.azeroth.sdk.SDKHandler$b;
import java.util.concurrent.Callable;
import com.kwai.middleware.azeroth.sdk.SDKHandler;
import java.lang.Object;
import ub7.f;
import java.util.Map;
import java.util.LinkedHashMap;

public final class SDKHandler$b implements Callable	// class@000f18
{
    public final SDKHandler b;

    public void SDKHandler$b(SDKHandler p0){
       this.b = p0;
       super();
    }
    public Object call(){
       Map map;
       SDKHandler d = this.b.d;
       if (d != null) {
          map = d.get();
          if (map != null) {
          label_0014 :
             return map;
          }
       }
       map = new LinkedHashMap();
       goto label_0014 ;
    }
}
