package com.kuaishou.tuna_core.krn.e;
import android.content.DialogInterface$OnDismissListener;
import com.kuaishou.tuna_core.krn.TunaKrnUtils$Companion$KrnActionManager;
import kotlin.jvm.internal.Ref$ObjectRef;
import java.lang.Object;
import android.content.DialogInterface;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.krn.event.a;
import oj0.a;
import crd.b;

public final class e implements DialogInterface$OnDismissListener	// class@0010d9
{
    public final TunaKrnUtils$Companion$KrnActionManager b;
    public final Ref$ObjectRef c;

    public void e(TunaKrnUtils$Companion$KrnActionManager p0,Ref$ObjectRef p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void onDismiss(DialogInterface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
          return;
       }
       e tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(null, tb, TunaKrnUtils$Companion$KrnActionManager.class, "2")) {
          a uoa = a.b();
          if (uoa != null) {
             uoa.c("KSBusinessClueDialogPerformTunaAction", tb.a());
          }
       }
       Ref$ObjectRef element = this.c.element;
       if (element != null) {
          element.dispose();
       }
       return;
    }
}
