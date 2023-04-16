package jn1.d;
import androidx.lifecycle.Observer;
import com.kuaishou.live.common.core.component.hotspot.detail.explain.LiveHotSpotDetailExplainDataBinding;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Collection;
import kotlin.jvm.internal.a;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Objects;
import com.kuaishou.live.common.core.component.hotspot.detail.explain.LiveHotSpotDetailExplainLinkAdapter;
import com.kuaishou.live.common.core.component.hotspot.detail.explain.LiveHotSpotDetailExplainDataBinding$a;
import com.kuaishou.live.common.core.component.hotspot.detail.explain.LiveHotSpotFlexBoxLayoutManager;
import com.kuaishou.live.common.core.component.hotspot.detail.explain.LiveHotSpotDetailExplainDataBinding$initRecyclerView$1;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView$n;
import com.kuaishou.live.viewcontroller.adapter.ViewControllerAdapter;

public final class d implements Observer	// class@002bd0
{
    public final LiveHotSpotDetailExplainDataBinding b;

    public void d(LiveHotSpotDetailExplainDataBinding p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
       }else {
          int i = 0;
          d uod = (p0 == null || p0.isEmpty())? 1: null;
          if (uod) {
             p0 = this.b.c;
             a.o(p0, "linkRecyclerView");
             p0.setVisibility(8);
          }else {
             LiveHotSpotDetailExplainDataBinding c = this.b.c;
             a.o(c, "linkRecyclerView");
             c.setVisibility(i);
             LiveHotSpotDetailExplainDataBinding c1 = this.b.c;
             a.o(c1, "linkRecyclerView");
             if (c1.getAdapter() == null) {
                d tb = this.b;
                Objects.requireNonNull(tb);
                if (!PatchProxy.applyVoid(null, tb, LiveHotSpotDetailExplainDataBinding.class, "3")) {
                   c = tb.c;
                   a.o(c, "linkRecyclerView");
                   c.setAdapter(tb.a());
                   LiveHotSpotDetailExplainDataBinding$a uoa = new LiveHotSpotDetailExplainDataBinding$a();
                   LiveHotSpotFlexBoxLayoutManager liveHotSpotF = new LiveHotSpotFlexBoxLayoutManager();
                   liveHotSpotF.c = 3;
                   liveHotSpotF.a = new LiveHotSpotDetailExplainDataBinding$initRecyclerView$1(tb, uoa, liveHotSpotF);
                   LiveHotSpotDetailExplainDataBinding c2 = tb.c;
                   a.o(c2, "linkRecyclerView");
                   c2.setLayoutManager(liveHotSpotF);
                   tb.c.addItemDecoration(uoa);
                }
             }
             this.b.a().O0(p0);
          }
       }
       return;
    }
}
