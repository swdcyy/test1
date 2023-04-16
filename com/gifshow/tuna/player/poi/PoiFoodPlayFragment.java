package com.gifshow.tuna.player.poi.PoiFoodPlayFragment;
import com.gifshow.tuna.player.component.TunaPlayFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.gifshow.tuna.player.poi.f;
import java.util.List;
import oj.i;
import nj.g;
import oj.j;
import com.kwai.robust.PatchProxyResult;
import com.gifshow.tuna.player.poi.IPoiFoodVideoModel;
import lnc.i3;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class PoiFoodPlayFragment extends TunaPlayFragment	// class@0015ef
{
    public a t;
    public static final int u;

    public void PoiFoodPlayFragment(){
       super();
    }
    public void ch(){
       if (PatchProxy.applyVoid(null, this, PoiFoodPlayFragment.class, "2")) {
          return;
       }
       super.ch();
       this.q.add(new f());
       this.q.add(new i());
       return;
    }
    public int dc(){
       return 0x7f0d0221;
    }
    public void dh(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PoiFoodPlayFragment.class, "4")) {
          return;
       }
       super.dh(p0);
       p0.e = this.t;
       return;
    }
    public g eh(){
       Object obj = PatchProxy.apply(null, this, PoiFoodPlayFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new j();
    }
    public String getPageParams(){
       TunaPlayFragment obj = PatchProxy.apply(null, this, PoiFoodPlayFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.p;
       if (obj == null) {
          return super.getPageParams();
       }
       i3 oi3 = i3.f();
       oi3.d("photo_id", obj.getPhotoId());
       oi3.d("poidish_id", obj.getPoiDishId());
       oi3.d("s_author_id", obj.getPhotoAuthorId());
       return oi3.e();
    }
    public String o(){
       return "POI_RECOMMEND_FOOD";
    }
}
