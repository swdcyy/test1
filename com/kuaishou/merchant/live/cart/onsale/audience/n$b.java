package com.kuaishou.merchant.live.cart.onsale.audience.n$b;
import java.lang.Runnable;
import com.kuaishou.merchant.live.cart.onsale.audience.n;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import qvb.i;
import java.util.Collection;
import ekd.q;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import androidx.recyclerview.widget.RecyclerView$Adapter;

public class n$b implements Runnable	// class@001966
{
    public final Object b;
    public final n c;

    public void n$b(n p0,Object p1){
       this.c = p0;
       super();
       this.b = p1;
    }
    public void run(){
       int i;
       if (PatchProxy.applyVoid(null, this, n$b.class, "1")) {
          return;
       }
       List items = this.c.b.getItems();
       if (this.c.c != null && !q.f(items)) {
          n c = this.c.c;
          n$b tb = this.b;
          Object obj = PatchProxy.applyTwoRefs(tb, items, this, n$b.class, "2");
          if (obj != PatchProxyResult.class) {
             i = obj.intValue();
          }else if(tb == null){
             i = -1;
          }else {
             i = items.indexOf(tb);
          }
          c.l0(i);
       }
       return;
    }
}
