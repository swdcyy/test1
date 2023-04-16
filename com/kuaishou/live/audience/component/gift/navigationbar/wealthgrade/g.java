package com.kuaishou.live.audience.component.gift.navigationbar.wealthgrade.g;
import sfc.a;
import com.kuaishou.live.audience.component.gift.navigationbar.wealthgrade.e;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class g extends a	// class@000b83
{
    public final e c;

    public void g(e p0){
       this.c = p0;
       super();
    }
    public void accept(Object p0){
       this.b(p0);
    }
    public void b(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "1")) {
          return;
       }
       super.b(p0);
       this.c.h("on_fetch_grade_info");
       return;
    }
}
