package com.kuaishou.pagedy.container.adapter.DynamicComponentAdapter$b;
import java.lang.Runnable;
import msd.a;
import com.kuaishou.pagedy.container.adapter.DynamicComponentAdapter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ho4.r$b;
import android.view.LayoutInflater;
import com.kuaishou.bowl.data.center.data.model.page.PageDyComponentInfo;
import qrd.l1;
import com.kuaishou.bowl.core.component.a;
import java.util.ArrayList;
import androidx.recyclerview.widget.RecyclerView$Adapter;

public final class DynamicComponentAdapter$b implements Runnable	// class@000a4c
{
    public final a b;
    public final DynamicComponentAdapter c;

    public void DynamicComponentAdapter$b(a p0,DynamicComponentAdapter p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoidWithListener(null, this, DynamicComponentAdapter$b.class, "1")) {
          return;
       }
       r$b uob = new r$b(this.c.h);
       PageDyComponentInfo pageDyCompon = new PageDyComponentInfo();
       pageDyCompon.name = "LOAD_MORE";
       uob.componentData = pageDyCompon;
       this.c.f.add(uob);
       DynamicComponentAdapter$b tc = this.c;
       tc.n0((tc.f.size() - 1));
       this.b.invoke();
       PatchProxy.onMethodExit(DynamicComponentAdapter$b.class, "1");
       return;
    }
}
