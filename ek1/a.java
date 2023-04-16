package ek1.a;
import ek1.e;
import com.kuaishou.live.common.core.component.gift.domain.slot.config.slotqueue.LiveGiftSlotQueueConfig;
import ak1.a;
import java.lang.Object;
import com.kuaishou.live.common.core.component.gift.domain.slot.manager.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import java.lang.Number;
import java.util.List;
import java.lang.Integer;
import com.kuaishou.live.common.core.component.gift.domain.slot.manager.a$b;
import com.kuaishou.live.common.core.component.gift.domain.slot.manager.a$c;
import xj1.a;

public class a implements e	// class@00217e
{
    public final LiveGiftSlotQueueConfig b;
    public final a c;

    public void a(LiveGiftSlotQueueConfig p0,a p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public a a(a p0){
       a$c uoc;
       a uoa = a.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       Objects.requireNonNull(p0);
       obj = PatchProxy.apply(null, p0, uoa, "4");
       int i = (obj != patchProxyRe)? obj.intValue(): p0.c.size();
       if (i <= this.b.a()) {
          return p0;
       }else if(PatchProxy.isSupport(uoa)){
          uoc = PatchProxy.applyOneRefs(Integer.valueOf(i), p0, uoa, "6");
          if (uoc != patchProxyRe) {
             while (uoc.hasPrevious()) {
                a uoa1 = uoc.previous();
                if (uoa1.i()) {
                   continue ;
                }else {
                   uoc.remove(uoa1);
                   i = i - 1;
                   uoa1 = this.c;
                   uoa1 = (uoa1.c <= uoa1.b)? 1: null;
                   if (uoa1 || i <= this.b.a()) {
                      break ;
                   }
                }
             }
             return p0;
          }
       }
       uoc = new a$c(p0.c, i, p0);
       goto label_004f ;
    }
}
