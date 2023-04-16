package com.kuaishou.live.common.core.component.chat.apply.a$a;
import sfc.a;
import com.kuaishou.live.common.core.component.chat.apply.a;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Iterator;
import java.util.Set;
import com.kuaishou.live.common.core.component.chat.apply.LiveAudienceApplyChatService$b;

public class a$a extends a	// class@001033
{
    public final a c;

    public void a$a(a p0){
       this.c = p0;
       super();
    }
    public void accept(Object p0){
       this.b(p0);
    }
    public void b(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "1")) {
          return;
       }
       Iterator iterator = this.c.c.iterator();
       while (iterator.hasNext()) {
          iterator.next().M4(p0);
       }
       return;
    }
}
