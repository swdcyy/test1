package com.kuaishou.live.core.show.showprofile.a$b;
import wj2.o0;
import com.kuaishou.live.core.show.showprofile.a;
import com.kwai.framework.model.user.UserProfile;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import wj2.e;
import com.kwai.framework.model.feed.BaseFeed;

public class a$b implements o0	// class@001019
{
    public final UserProfile a;
    public final a b;

    public void a$b(a p0,UserProfile p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public boolean a(){
       Object obj = PatchProxy.apply(null, this, a$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.b.r.d(this.a);
    }
    public boolean b(BaseFeed p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.b.r.b(p0);
    }
}
