package com.kuaishou.activity.kwaibubble.tk.KwaiPopTk$a;
import erd.g;
import com.kuaishou.activity.kwaibubble.tk.KwaiPopTk;
import java.lang.Object;
import com.trello.rxlifecycle3.android.ActivityEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class KwaiPopTk$a implements g	// class@00078c
{
    public final KwaiPopTk b;

    public void KwaiPopTk$a(KwaiPopTk p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, KwaiPopTk$a.class, "1")) {
       }else {
          p0 = this.b;
          if (p0.a == null) {
             p0.release();
          }
          PatchProxy.onMethodExit(KwaiPopTk$a.class, "1");
       }
       return;
    }
}
