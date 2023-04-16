package com.kwai.framework.network.keyconfig.a$m;
import java.util.concurrent.Callable;
import com.kwai.framework.network.keyconfig.a;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ob6.h;
import java.util.concurrent.Future;
import ta6.c;
import java.lang.StringBuilder;
import com.kwai.framework.network.keyconfig.BaseConfig;
import java.lang.Long;
import q87.c;

public final class a$m implements Callable	// class@0017ec
{
    public final a b;
    public final RequestTiming c;
    public final String d;

    public void a$m(a p0,RequestTiming p1,String p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public Object call(){
       Object[] objArray = null;
       h oh = PatchProxy.apply(objArray, this, a$m.class, "1");
       if (oh != PatchProxyResult.class) {
       }else {
          oh = this.b.l(this.c, this.d).get();
          c uoc = c.C();
          StringBuilder str = "Keyconfig serverTimestamp: ";
          h mBaseConfig = oh.mBaseConfig;
          if (mBaseConfig != null) {
             objArray = Long.valueOf(mBaseConfig.g());
          }
          Object[] objArray1 = new Object[0];
          uoc.w("KeyConfigManager", str+objArray, objArray1);
       }
       return oh;
    }
}
