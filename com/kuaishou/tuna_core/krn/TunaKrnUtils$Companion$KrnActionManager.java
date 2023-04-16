package com.kuaishou.tuna_core.krn.TunaKrnUtils$Companion$KrnActionManager;
import com.kuaishou.tuna_core.krn.TunaKrnUtils$Companion$KrnActionManager$a;
import nsd.u;
import android.app.Activity;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.tuna_core.krn.TunaKrnUtils$Companion$KrnActionManager$mTunaButtonActionListener$2;
import msd.a;
import qrd.p;
import qrd.s;
import oj0.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class TunaKrnUtils$Companion$KrnActionManager	// class@0010d0
{
    public final p a;
    public final Activity b;
    public static final TunaKrnUtils$Companion$KrnActionManager$a c;

    static {
       TunaKrnUtils$Companion$KrnActionManager.c = new TunaKrnUtils$Companion$KrnActionManager$a(null);
    }
    public void TunaKrnUtils$Companion$KrnActionManager(Activity p0){
       a.p(p0, "mActivity");
       super();
       this.b = p0;
       this.a = s.c(new TunaKrnUtils$Companion$KrnActionManager$mTunaButtonActionListener$2(this));
    }
    public final a a(){
       Object obj = PatchProxy.apply(null, this, TunaKrnUtils$Companion$KrnActionManager.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.getValue();
    }
}
