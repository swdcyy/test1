package com.yxcorp.gifshow.ad.AdProcess$d;
import android.content.DialogInterface$OnDismissListener;
import com.yxcorp.gifshow.ad.AdProcess$b;
import java.lang.Object;
import android.content.DialogInterface;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class AdProcess$d implements DialogInterface$OnDismissListener	// class@0014e1
{
    public final AdProcess$b b;

    public void AdProcess$d(AdProcess$b p0){
       this.b = p0;
       super();
    }
    public final void onDismiss(DialogInterface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AdProcess$d.class, "1")) {
          return;
       }
       AdProcess$d tb = this.b;
       if (tb.a == null) {
          tb.a();
       }
       return;
    }
}
