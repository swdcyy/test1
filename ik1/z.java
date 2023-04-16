package ik1.z;
import androidx.recyclerview.widget.RecyclerView$r;
import com.kuaishou.live.common.core.component.gift.gift.LiveGiftGridListView;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;

public class z extends RecyclerView$r	// class@00293f
{
    public final LiveGiftGridListView a;

    public void z(LiveGiftGridListView p0){
       this.a = p0;
       super();
    }
    public void a(RecyclerView p0,int p1){
       if (PatchProxy.isSupport(z.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, z.class, "1")) {
          return;
       }
       if (!p1) {
          this.a.x();
       }
       return;
    }
}
