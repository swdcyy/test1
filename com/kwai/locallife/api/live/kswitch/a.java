package com.kwai.locallife.api.live.kswitch.a;
import java.lang.Object;
import com.kwai.locallife.api.live.kswitch.a$a;
import com.kwai.locallife.api.live.kswitch.a$b;
import com.kwai.locallife.api.live.kswitch.LiveLocalLifeSwitchKeys;
import com.kwai.locallife.api.live.kswitch.a$c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;

public class a	// class@000ea3
{

    public void a(){
       super();
    }
    public void a(a$a p0){
       super();
    }
    public static a b(){
       return a$b.a;
    }
    public a$c a(LiveLocalLifeSwitchKeys p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.defaultValue() instanceof Boolean || p0.defaultValue() instanceof Integer) {
          return new a$c(this, p0);
       }
       throw new IllegalStateException(" expect "+p0.key()+"get a "+p0.defaultValue().getClass()+" value, but get Boolean");
    }
}
