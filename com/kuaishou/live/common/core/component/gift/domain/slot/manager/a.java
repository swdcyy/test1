package com.kuaishou.live.common.core.component.gift.domain.slot.manager.a;
import com.kuaishou.live.common.core.component.gift.domain.slot.manager.a$a;
import ak1.a;
import java.lang.Object;
import java.util.LinkedList;
import java.util.HashMap;
import com.kuaishou.live.common.core.component.gift.domain.slot.manager.a$b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.common.core.component.gift.domain.slot.manager.a$c;
import java.util.List;

public class a	// class@00126f
{
    public final a$a a;
    public final a b;
    public final List c;
    public final Map d;

    public void a(a$a p0,a p1){
       super();
       this.c = new LinkedList();
       this.d = new HashMap();
       this.b = p1;
       this.a = p0;
    }
    public a$b a(){
       Object obj = PatchProxy.apply(null, this, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new a$c(this.c, this);
    }
}
