package com.kuaishou.live.livestage.overlay.FlexWindowLayoutManager$a;
import erd.g;
import com.kuaishou.live.livestage.overlay.FlexWindowLayoutManager;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;

public final class FlexWindowLayoutManager$a implements g	// class@000bf0
{
    public final FlexWindowLayoutManager b;

    public void FlexWindowLayoutManager$a(FlexWindowLayoutManager p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FlexWindowLayoutManager$a.class, "1")) {
       }else {
          this.b.requestLayout();
       }
       return;
    }
}
