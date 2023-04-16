package com.kuaishou.activity.kwaibubble.krn.KwaiPopKrn$a;
import ik0.a;
import android.app.Activity;
import com.kuaishou.activity.kwaibubble.krn.KwaiPopKrn;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import rn.a;
import java.lang.Integer;
import rn.a$a;

public final class KwaiPopKrn$a implements a	// class@000776
{
    public final Activity b;
    public final KwaiPopKrn c;

    public void KwaiPopKrn$a(Activity p0,KwaiPopKrn p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public boolean Wc(boolean p0){
       if (PatchProxy.isSupport2(KwaiPopKrn$a.class, "1")) {
          Object obj = PatchProxy.applyOneRefsWithListener(Boolean.valueOf(p0), this, KwaiPopKrn$a.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       a$a.a(this.c, null, 1, null);
       PatchProxy.onMethodExit(KwaiPopKrn$a.class, "1");
       return 1;
    }
}
