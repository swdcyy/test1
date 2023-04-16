package com.yxcorp.gifshow.listcomponent.layoutmanager.VirtualLayoutManager$b;
import java.lang.Runnable;
import com.yxcorp.gifshow.listcomponent.layoutmanager.VirtualLayoutManager;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.RecyclerView;

public class VirtualLayoutManager$b implements Runnable	// class@001a7b
{
    public final VirtualLayoutManager b;

    public void VirtualLayoutManager$b(VirtualLayoutManager p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, VirtualLayoutManager$b.class, "1")) {
          return;
       }
       VirtualLayoutManager m = this.b.M;
       if (m != null) {
          m.requestLayout();
       }
       return;
    }
}
