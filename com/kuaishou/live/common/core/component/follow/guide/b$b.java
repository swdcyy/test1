package com.kuaishou.live.common.core.component.follow.guide.b$b;
import s91.d;
import com.kuaishou.live.common.core.component.follow.guide.b$c;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.follow.LiveFollowGuideExtraInfoResponse;

public class b$b extends d	// class@00110c
{
    public final b$c b;

    public void b$b(b$c p0){
       this.b = p0;
       super();
    }
    public void a(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$b.class, "1")) {
          return;
       }
       super.a(p0);
       b$b tb = this.b;
       if (tb != null) {
          tb.a(null);
       }
       return;
    }
    public void accept(Object p0){
       this.a(p0);
    }
}
