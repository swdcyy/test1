package com.kuaishou.tuna.plc.dynamic_container.PlcDynamicContainerActivity$b;
import hy4.a$c;
import com.kuaishou.tuna.plc.dynamic_container.PlcDynamicContainerActivity;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import android.app.Activity;

public final class PlcDynamicContainerActivity$b implements a$c	// class@000fc7
{
    public final PlcDynamicContainerActivity a;

    public void PlcDynamicContainerActivity$b(PlcDynamicContainerActivity p0){
       this.a = p0;
       super();
    }
    public void a(boolean p0){
       this.a.E = p0;
    }
    public void b(int p0){
       if (PatchProxy.isSupport(PlcDynamicContainerActivity$b.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, PlcDynamicContainerActivity$b.class, "1")) {
          return;
       }
       if (!this.a.isFinishing()) {
          this.a.finish();
       }
       return;
    }
}
