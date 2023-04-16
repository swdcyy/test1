package com.kuaishou.live.core.show.subscribe.plc.e$a;
import com.kuaishou.live.core.show.subscribe.plc.a;
import com.kuaishou.live.core.show.subscribe.plc.e;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.QPhoto;
import wk2.s;

public class e$a extends a	// class@00115e
{
    public final e d;

    public void e$a(e p0){
       this.d = p0;
       super();
    }
    public void accept(Object p0){
       this.b(p0);
    }
    public void b(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$a.class, "1")) {
          return;
       }
       super.b(p0);
       s.e(this.d.c, p0.getMessage());
       return;
    }
}
