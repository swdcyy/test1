package com.kuaishou.tuna.plc.dynamic_container.PlcDynamicContainerActivity$c;
import android.view.View$OnClickListener;
import com.kuaishou.tuna.plc.dynamic_container.PlcDynamicContainerActivity;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class PlcDynamicContainerActivity$c implements View$OnClickListener	// class@000fc8
{
    public final PlcDynamicContainerActivity b;

    public void PlcDynamicContainerActivity$c(PlcDynamicContainerActivity p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PlcDynamicContainerActivity$c.class, "1")) {
          return;
       }
       this.b.finish();
       return;
    }
}
