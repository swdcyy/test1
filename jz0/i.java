package jz0.i;
import erd.g;
import jz0.l;
import java.lang.Object;
import com.kuaishou.live.common.core.component.gift.giftstore.api.PacketGiftListResponse;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import mk1.b;
import java.util.Iterator;
import java.util.HashSet;
import uk1.b;

public final class i implements g	// class@002c4a
{
    public final l b;

    public void i(l p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       i tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, l.class, "2")) {
       }else if(tb.c.l()){
          Iterator iterator = tb.e.iterator();
          while (iterator.hasNext()) {
             b uob = iterator.next();
             if (uob != null) {
                uob.c(p0);
             }
          }
       }
       return;
    }
}
