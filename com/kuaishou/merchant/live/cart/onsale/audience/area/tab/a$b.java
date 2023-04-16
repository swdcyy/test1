package com.kuaishou.merchant.live.cart.onsale.audience.area.tab.a$b;
import o34.d;
import com.kuaishou.merchant.live.cart.onsale.audience.area.tab.a;
import m34.b;
import o34.f$a;
import o34.f$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.kwai.library.widget.viewpager.tabstrip.a;
import com.kuaishou.merchant.live.cart.onsale.audience.area.tab.LiveAudienceCommodityFragment;
import qvb.i;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;

public class a$b extends d	// class@001927
{
    public final b b;
    public final a c;

    public void a$b(a p0,b p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void a(f$a p0,f$b p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a$b.class, "2")) {
          return;
       }
       Fragment uFragment = this.b.t();
       if (uFragment instanceof LiveAudienceCommodityFragment && this.a != null) {
          uFragment.q().remove(this.a);
       }
       return;
    }
    public List c(){
       Fragment obj = PatchProxy.apply(null, this, a$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b.t();
       if (obj instanceof LiveAudienceCommodityFragment) {
          return obj.q().getItems();
       }
       return new ArrayList();
    }
}
