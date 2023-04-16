package com.kuaishou.activity.kwaibubble.tk.KwaiPopTk$c;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.activity.kwaibubble.log.KwaiPopLog;
import java.lang.StringBuilder;

public final class KwaiPopTk$c implements g	// class@00078e
{
    public static final KwaiPopTk$c b;

    static {
       KwaiPopTk$c.b = new KwaiPopTk$c();
    }
    public void KwaiPopTk$c(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiPopTk$c.class, "1")) {
       }else {
          a.p(p0, "throwable");
          Object[] objArray = new Object[0];
          KwaiPopLog.e.D("link death:"+p0.getMessage(), objArray);
       }
       return;
    }
}
