package hh1.h$a;
import yg1.c;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.config.LiveGiftPanelConfig;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import fh1.c;
import yg1.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import ch1.d;
import java.util.List;
import java.util.Collection;

public final class h$a implements c	// class@0026bb
{
    public final LiveGiftPanelConfig a;

    public void h$a(LiveGiftPanelConfig p0){
       a.p(p0, "giftPanelConfig");
       super();
       this.a = p0;
    }
    public Object a(Object p0){
       return this.b(p0);
    }
    public f b(c p0){
       c obj = PatchProxy.applyOneRefs(p0, this, h$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "response");
       obj = p0.code;
       c message = p0.message;
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = p0.data.iterator();
       while (iterator.hasNext()) {
          Object obj1 = iterator.next();
          if (this.a.p.contains(obj1.a())) {
             uArrayList.add(obj1);
          }
       }
       return new f(obj, message, uArrayList);
    }
}
