package dn2.c$b;
import java.lang.Object;
import dn2.g;
import dn2.c$c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.lang.System;
import java.lang.Long;
import com.yxcorp.utility.SystemUtil;
import dn2.c;
import java.lang.StringBuilder;
import java.util.List;
import com.kuaishou.android.live.log.b;
import java.lang.RuntimeException;

public abstract class c$b	// class@002554
{

    public void c$b(){
       super();
    }
    public void a(g p0,c$c p1,int p2){
       c$b uob = c$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, c$b.class, "1")) {
          return;
       }
       this.b(p0, p1);
       long l = System.currentTimeMillis() - System.currentTimeMillis();
       if (l - 50 > 0 && (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidTwoRefs(Long.valueOf(l), Integer.valueOf(p2), this, uob, "2"))) {
          if (!SystemUtil.I()) {
             b.P(c.g, this.getClass().getName()+" cost ="+l+" aliveCount = "+p2);
          }else {
             throw new RuntimeException("mConsumeTask cost "+l+" ms, please resolve it. aliveCount = "+p2);
          }
       }
       return;
    }
    public abstract void b(g p0,c$c p1);
}
