package com.kuaishou.tuna.plc.dynamic_container.view.navigate.PlcDynamicNavigationBar$c;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.tuna.plc.dynamic_container.view.navigate.PlcDynamicNavigationBar;
import com.kuaishou.tuna.plc.dynamic_container_api.PlcDynamicTitleIconInfo;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kuaishou.tuna.plc.dynamic_container.view.navigate.PlcDynamicNavigationBar$b;

public final class PlcDynamicNavigationBar$c extends m	// class@00100c
{
    public final PlcDynamicNavigationBar c;
    public final PlcDynamicTitleIconInfo d;

    public void PlcDynamicNavigationBar$c(PlcDynamicNavigationBar p0,PlcDynamicTitleIconInfo p1){
       this.c = p0;
       this.d = p1;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PlcDynamicNavigationBar$c.class, "1")) {
          return;
       }
       PlcDynamicNavigationBar$c tc = this.c;
       PlcDynamicNavigationBar$c td = this.d;
       a.m(td);
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoidOneRefs(td, tc, PlcDynamicNavigationBar.class, "10")) {
          PlcDynamicNavigationBar n = tc.n;
          if (n != null) {
             n.e(td);
          }
       }
       return;
    }
}
