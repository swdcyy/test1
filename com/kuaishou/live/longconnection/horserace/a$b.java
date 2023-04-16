package com.kuaishou.live.longconnection.horserace.a$b;
import erd.o;
import com.kuaishou.live.longconnection.horserace.a;
import java.util.List;
import java.lang.Object;
import java.util.Collection;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.e0;
import mf3.b;
import java.util.Iterator;
import com.kuaishou.android.live.model.Horse;
import com.kuaishou.live.longconnection.horserace.c;
import brd.a0;
import java.lang.IllegalStateException;

public class a$b implements o	// class@000c81
{
    public final List b;
    public final a c;

    public void a$b(a p0,List p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public Object apply(Object p0){
       Horse horse;
       a0 uoa0 = PatchProxy.applyOneRefs(p0, this, a$b.class, "1");
       if (uoa0 != PatchProxyResult.class) {
       }else {
          int i = 1;
          if (b.b()) {
             Object[] objArray = new Object[]{"data",p0};
             b.a("BarrierPolicy", "onBarrierReturn", objArray);
          }
          Iterator iterator = this.b.iterator();
          while (true) {
             if (!iterator.hasNext()) {
                throw new IllegalStateException("horse not in round");
             }
             horse = iterator.next();
             Iterator iterator1 = p0.iterator();
             while (true) {
                if (iterator1.hasNext()) {
                   c uoc = iterator1.next();
                   c a = uoc.a;
                   a.mSuccess = i;
                   if (a.equals(horse)) {
                      p0.mChosen = i;
                      this.c.c.remove(uoc);
                      p0 = this.c;
                      if (p0.d != null) {
                         p0 = p0.c.iterator();
                         while (p0.hasNext()) {
                            p0.next().c("other horse success");
                         }
                         this.c.c.clear();
                         this.c.c.add(uoc);
                      }
                      uoa0 = a0.B(uoc);
                      break ;
                   }
                }else {
                   continue ;
                }
             }
          }
       }
       return uoa0;
    }
}
