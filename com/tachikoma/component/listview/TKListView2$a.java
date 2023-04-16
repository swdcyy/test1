package com.tachikoma.component.listview.TKListView2$a;
import java.lang.Runnable;
import com.tachikoma.component.listview.TKListView2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.tachikoma.core.component.TKBaseNativeModule;

public class TKListView2$a implements Runnable	// class@000d0b
{
    public final TKListView2 b;

    public void TKListView2$a(TKListView2 p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, TKListView2$a.class, "1")) {
          return;
       }
       if (this.b.isDestroy()) {
          return;
       }
       this.b.calculateVisibleItems();
       return;
    }
}
