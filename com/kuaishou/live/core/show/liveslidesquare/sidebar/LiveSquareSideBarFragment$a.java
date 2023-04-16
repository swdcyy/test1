package com.kuaishou.live.core.show.liveslidesquare.sidebar.LiveSquareSideBarFragment$a;
import androidx.recyclerview.widget.GridLayoutManager$b;
import com.kuaishou.live.core.show.liveslidesquare.sidebar.LiveSquareSideBarFragment;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import g9c.d;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import qvb.i;
import java.util.List;
import tb2.b;

public class LiveSquareSideBarFragment$a extends GridLayoutManager$b	// class@000c9e
{
    public final LiveSquareSideBarFragment e;

    public void LiveSquareSideBarFragment$a(LiveSquareSideBarFragment p0){
       this.e = p0;
       super();
    }
    public int f(int p0){
       List obj;
       LiveSquareSideBarFragment$a uoa = LiveSquareSideBarFragment$a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoa, "1");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       p0 = p0 - this.e.ia().b1();
       obj = this.e.q().getItems();
       int i = 1;
       if (p0 >= 0 && p0 < obj.size()) {
          b a = obj.get(p0).a;
          if (a == i || (a == 2 || (a == 3 || a == 4))) {
             i = 2;
          }
       }
       return i;
    }
}
