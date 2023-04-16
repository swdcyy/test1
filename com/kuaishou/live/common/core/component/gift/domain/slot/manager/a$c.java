package com.kuaishou.live.common.core.component.gift.domain.slot.manager.a$c;
import com.kuaishou.live.common.core.component.gift.domain.slot.manager.a$b;
import java.util.List;
import com.kuaishou.live.common.core.component.gift.domain.slot.manager.a;
import java.lang.Object;
import java.util.ListIterator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.live.common.core.component.gift.domain.slot.manager.a$a;
import java.util.Map;
import ak1.a;

public class a$c implements a$b	// class@00126e
{
    public final ListIterator a;
    public final a b;

    public void a$c(List p0,int p1,a p2){
       super();
       this.a = p0.listIterator(p1);
       this.b = p2;
    }
    public void a$c(List p0,a p1){
       super();
       this.a = p0.listIterator();
       this.b = p1;
    }
    public boolean hasNext(){
       Object obj = PatchProxy.apply(null, this, a$c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.a.hasNext();
    }
    public boolean hasPrevious(){
       Object obj = PatchProxy.apply(null, this, a$c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.a.hasPrevious();
    }
    public Object next(){
       Object obj = PatchProxy.apply(null, this, a$c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.next();
    }
    public Object previous(){
       Object obj = PatchProxy.apply(null, this, a$c.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.previous();
    }
    public void remove(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$c.class, "5")) {
          return;
       }
       this.a.remove();
       a$c tb = this.b;
       tb.d.remove(tb.a.a(p0));
       tb = this.b;
       tb.b.b(tb.a.b(p0));
       return;
    }
}
