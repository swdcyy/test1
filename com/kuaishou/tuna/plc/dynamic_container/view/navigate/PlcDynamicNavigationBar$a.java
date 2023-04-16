package com.kuaishou.tuna.plc.dynamic_container.view.navigate.PlcDynamicNavigationBar$a;
import android.view.View$OnClickListener;
import com.kuaishou.tuna.plc.dynamic_container.view.navigate.PlcDynamicNavigationBar;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.tuna.plc.dynamic_container.view.navigate.PlcDynamicNavigationBar$b;

public final class PlcDynamicNavigationBar$a implements View$OnClickListener	// class@00100a
{
    public final PlcDynamicNavigationBar b;

    public void PlcDynamicNavigationBar$a(PlcDynamicNavigationBar p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PlcDynamicNavigationBar$a.class, "1")) {
          return;
       }
       PlcDynamicNavigationBar$a tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(null, tb, PlcDynamicNavigationBar.class, "11")) {
          PlcDynamicNavigationBar n = tb.n;
          if (n != null) {
             n.a();
          }
       }
       return;
    }
}
