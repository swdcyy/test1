package com.kuaishou.live.ad.social.v;
import z61.b;
import com.kuaishou.live.ad.social.w;
import z61.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import zl0.l1;
import com.google.gson.JsonObject;

public class v extends b	// class@000a26
{
    public w a;

    public void v(){
       super();
       this.a = new w();
    }
    public c getViewItemInstanceFactory(){
       Object obj = PatchProxy.apply(null, this, v.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new l1(this);
    }
    public void update(JsonObject p0){
    }
}
