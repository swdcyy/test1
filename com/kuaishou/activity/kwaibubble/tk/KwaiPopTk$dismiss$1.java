package com.kuaishou.activity.kwaibubble.tk.KwaiPopTk$dismiss$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.activity.kwaibubble.tk.KwaiPopTk;
import java.lang.Integer;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qn.h;

public final class KwaiPopTk$dismiss$1 extends Lambda implements a	// class@000791
{
    public final Integer $type;
    public final KwaiPopTk this$0;

    public void KwaiPopTk$dismiss$1(KwaiPopTk p0,Integer p1){
       this.this$0 = p0;
       this.$type = p1;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (PatchProxy.applyVoid(null, this, KwaiPopTk$dismiss$1.class, "1")) {
          return;
       }
       KwaiPopTk$dismiss$1 tthis$0 = this.this$0;
       KwaiPopTk a = tthis$0.a;
       if (a == null) {
          tthis$0.release();
       }else if(a != null){
          a.b(this.$type);
       }
       return;
    }
}
