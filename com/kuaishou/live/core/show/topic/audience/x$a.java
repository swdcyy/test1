package com.kuaishou.live.core.show.topic.audience.x$a;
import com.kuaishou.live.core.show.topic.audience.x$c;
import com.kuaishou.live.core.show.topic.audience.x;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.Integer;

public class x$a implements x$c	// class@001220
{
    public final x a;

    public void x$a(x p0){
       this.a = p0;
       super();
    }
    public void a(long p0,String p1,int p2){
       if (PatchProxy.isSupport(x$a.class) && PatchProxy.applyVoidThreeRefs(Long.valueOf(p0), p1, Integer.valueOf(p2), this, x$a.class, "1")) {
          return;
       }
       this.a.a9(p0, p1, p2);
       return;
    }
}
