package com.kwai.feature.api.social.moment.model.MomentFeed$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public class MomentFeed$a	// class@001181
{
    public int a;

    public void MomentFeed$a(){
       super();
       this.a = 1;
    }
    public boolean equals(Object p0){
       MomentFeed$a uoa = MomentFeed$a.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, uoa, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (p0 == null || uoa != p0.getClass()) {
          return false;
       }
       if (this.a != p0.a) {
          b = false;
       }
       return b;
    }
    public int hashCode(){
       return this.a;
    }
}
