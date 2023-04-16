package mn1.a;
import androidx.lifecycle.Observer;
import com.kuaishou.live.common.core.component.hotspot.detail.normalmediaarea.LiveHotSpotDetailNormalMediaAreaDataBinding;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import kotlin.jvm.internal.a;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Objects;
import androidx.recyclerview.widget.GridLayoutManager;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import com.kuaishou.live.common.core.component.hotspot.detail.normalmediaarea.LiveHotSpotDetailNormalMediaAreaAdapter;
import mn1.c;
import androidx.recyclerview.widget.RecyclerView$n;
import com.kuaishou.live.viewcontroller.adapter.ViewControllerAdapter;

public final class a implements Observer	// class@0031cd
{
    public final LiveHotSpotDetailNormalMediaAreaDataBinding b;

    public void a(LiveHotSpotDetailNormalMediaAreaDataBinding p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
       }else if(p0 != null && p0.isEmpty() == true){
          this.b.f.setVisibility(8);
       }else {
          this.b.f.setVisibility(0);
          LiveHotSpotDetailNormalMediaAreaDataBinding b = this.b.b;
          String str = "recyclerView";
          a.o(b, str);
          if (b.getAdapter() == null) {
             a tb = this.b;
             Objects.requireNonNull(tb);
             if (!PatchProxy.applyVoid(null, tb, LiveHotSpotDetailNormalMediaAreaDataBinding.class, "3")) {
                LiveHotSpotDetailNormalMediaAreaDataBinding b1 = tb.b;
                a.o(b1, str);
                b1.setLayoutManager(new GridLayoutManager(tb.f.getContext(), 3));
                b1 = tb.b;
                a.o(b1, str);
                b1.setAdapter(tb.a());
                tb.b.addItemDecoration(new c());
             }
          }
          a.m(p0);
          this.b.a().O0(p0);
       }
       return;
    }
}
