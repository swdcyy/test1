package com.kuaishou.live.core.voiceparty.theater.player.a$e;
import ok.o;
import java.lang.Object;
import com.yxcorp.gifshow.model.CDNUrl;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public final class a$e implements o	// class@0019a8
{
    public static final a$e b;

    static {
       a$e.b = new a$e();
    }
    public void a$e(){
       super();
    }
    public boolean apply(Object p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, a$e.class, "1");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(p0 != null && p0.isFreeTrafficCdn() == true){
          b = true;
       }else {
          b = false;
       }
       return b;
    }
}
