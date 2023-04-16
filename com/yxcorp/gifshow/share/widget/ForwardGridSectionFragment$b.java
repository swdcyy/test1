package com.yxcorp.gifshow.share.widget.ForwardGridSectionFragment$b;
import android.content.DialogInterface$OnDismissListener;
import com.yxcorp.gifshow.share.widget.ForwardGridSectionFragment;
import java.lang.Object;
import android.content.DialogInterface;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import mhc.o0;
import djc.a;
import java.util.Objects;
import java.lang.StringBuilder;
import java.lang.System;
import java.lang.Exception;
import java.lang.Throwable;
import android.util.Log;
import k2b.u1;

public final class ForwardGridSectionFragment$b implements DialogInterface$OnDismissListener	// class@001cc3
{
    public final ForwardGridSectionFragment b;

    public void ForwardGridSectionFragment$b(ForwardGridSectionFragment p0){
       this.b = p0;
       super();
    }
    public final void onDismiss(DialogInterface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ForwardGridSectionFragment$b.class, "1")) {
          return;
       }
       o0 oo0 = this.b.Rh();
       if (oo0 != null) {
          oo0.c(this.b);
       }
       a uoa = this.b.Qh();
       Objects.requireNonNull(uoa);
       if (!PatchProxy.applyVoid(null, uoa, a.class, "4") && uoa.a != null) {
          u1.R("B526435", "DISMISS_S "+System.currentTimeMillis()+' '+Log.getStackTraceString(new Exception()), 13);
       }
       return;
    }
}
