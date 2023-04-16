package com.tachikoma.component.listview.TKListView2$b;
import java.lang.Runnable;
import com.tachikoma.component.listview.TKListView2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class TKListView2$b implements Runnable	// class@000d0c
{
    public final TKListView2 b;

    public void TKListView2$b(TKListView2 p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, TKListView2$b.class, "1")) {
          return;
       }
       this.b.destroyOnMainThread();
       return;
    }
}
