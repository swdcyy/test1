package com.kuaishou.merchant.live.bubble.pinocchio.widget.PinocchioBubble$d;
import java.lang.Runnable;
import com.kuaishou.merchant.live.bubble.pinocchio.widget.PinocchioBubble;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.live.bubble.pinocchio.widget.PinocchioLevelView;
import java.lang.Boolean;
import java.util.Iterator;
import java.lang.Iterable;
import com.kuaishou.merchant.live.bubble.pinocchio.widget.PinocchioBubble$c;

public final class PinocchioBubble$d implements Runnable	// class@0018eb
{
    public final PinocchioBubble b;
    public final boolean c;

    public void PinocchioBubble$d(PinocchioBubble p0,boolean p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       String str = "1";
       if (PatchProxy.applyVoid(null, this, PinocchioBubble$d.class, str)) {
          return;
       }
       PinocchioBubble t = this.b.t;
       if (t != null) {
          PinocchioBubble$d tc = this.c;
          if (!PatchProxy.isSupport(PinocchioLevelView.class) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(tc), t, PinocchioLevelView.class, str)) {
             Iterator iterator = t.b.iterator();
             while (iterator.hasNext()) {
                iterator.next().a(tc);
             }
          }
       }
       return;
    }
}
