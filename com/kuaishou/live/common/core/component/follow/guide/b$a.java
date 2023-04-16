package com.kuaishou.live.common.core.component.follow.guide.b$a;
import erd.g;
import com.kuaishou.live.common.core.component.follow.guide.b$c;
import java.lang.Object;
import com.kuaishou.live.core.show.follow.LiveFollowGuideExtraInfoResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class b$a implements g	// class@00110b
{
    public final b$c b;

    public void b$a(b$c p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a.class, "1")) {
       }else {
          b$a tb = this.b;
          if (tb != null) {
             tb.a(p0);
          }
       }
       return;
    }
}
