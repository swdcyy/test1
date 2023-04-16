package com.kuaishou.activity.kwaibubble.tk.bridge.KwaiPopTkBridge$invoke$commend$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import tx4.h;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class KwaiPopTkBridge$invoke$commend$1 extends Lambda implements l	// class@000795
{
    public final h $function;

    public void KwaiPopTkBridge$invoke$commend$1(h p0){
       this.$function = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiPopTkBridge$invoke$commend$1.class, "1")) {
          return;
       }
       KwaiPopTkBridge$invoke$commend$1 t$function = this.$function;
       if (t$function != null) {
          Object[] objArray = new Object[]{p0};
          t$function.call(objArray);
       }
       return;
    }
}
