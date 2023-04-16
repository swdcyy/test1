package com.kuaishou.live.core.voiceparty.micseats.a$r;
import android.content.DialogInterface$OnCancelListener;
import com.kuaishou.live.core.voiceparty.micseats.a;
import java.lang.Object;
import android.content.DialogInterface;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import qu2.a;
import co2.f2;
import co2.k1;

public final class a$r implements DialogInterface$OnCancelListener	// class@001574
{
    public final a b;

    public void a$r(a p0){
       this.b = p0;
       super();
    }
    public final void onCancel(DialogInterface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$r.class, "1")) {
          return;
       }
       k1.h(this.b.q.a(), this.b.s, "CANEL");
       return;
    }
}
