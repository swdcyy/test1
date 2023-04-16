package com.kuaishou.tuna.plc.plc2.PlcImpl$mCoverClickLnr$2$a;
import android.view.View$OnClickListener;
import com.kuaishou.tuna.plc.plc2.PlcImpl$mCoverClickLnr$2;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.tuna.plc.plc2.PlcLifecycleOwnerImpl;
import com.kuaishou.tuna.plc.plc2.PlcImpl;
import java.util.Objects;
import mrd.c;
import java.lang.Integer;
import brd.y;

public final class PlcImpl$mCoverClickLnr$2$a implements View$OnClickListener	// class@00103b
{
    public final PlcImpl$mCoverClickLnr$2 b;

    public void PlcImpl$mCoverClickLnr$2$a(PlcImpl$mCoverClickLnr$2 p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PlcImpl$mCoverClickLnr$2$a.class, "1")) {
          return;
       }
       PlcLifecycleOwnerImpl plcLifecycle = this.b.this$0.m();
       Objects.requireNonNull(plcLifecycle);
       if (!PatchProxy.applyVoid(null, plcLifecycle, PlcLifecycleOwnerImpl.class, "28")) {
          plcLifecycle.A().onNext(Integer.valueOf(10));
       }
       return;
    }
}
