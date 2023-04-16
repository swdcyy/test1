package com.kuaishou.activity.kwaibubble.tk.KwaiPopTk$release$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.activity.kwaibubble.tk.KwaiPopTk;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import rn.a;
import zn.c;
import rx4.a;
import zn.b;
import zn.a;

public final class KwaiPopTk$release$1 extends Lambda implements a	// class@000792
{
    public final KwaiPopTk this$0;

    public void KwaiPopTk$release$1(KwaiPopTk p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (PatchProxy.applyVoid(null, this, KwaiPopTk$release$1.class, "1")) {
          return;
       }
       KwaiPopTk$release$1 tthis$0 = this.this$0;
       if (tthis$0.a == null) {
          tthis$0.d(tthis$0);
       }
       KwaiPopTk b = this.this$0.b;
       if (b != null && !PatchProxy.applyVoid(null, b, c.class, "4")) {
          c a = b.a;
          if (a != null) {
             a.onPause();
          }
       }
       b = this.this$0.b;
       if (b != null) {
          b.c();
       }
       this.this$0.h().r(null);
       this.this$0.b = null;
       return;
    }
}
