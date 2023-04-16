package cg4.a;
import java.lang.Object;
import java.util.ArrayList;
import gd4.b;
import cg4.a$a;
import com.kuaishou.merchant.transaction.detail.self.selfdetail.bottombar.model.BottomTips;
import java.lang.String;
import su.a;
import java.lang.Class;
import cg4.a$b;
import com.kuaishou.merchant.transaction.detail.self.selfdetail.bottombar.model.DetailBottomBarModel;
import cg4.a$c;
import cg4.a$d;
import cg4.a$e;
import com.kuaishou.merchant.transaction.detail.self.selfdetail.model.DetailResponse;
import cg4.a$f;
import nsd.u;
import cg4.a$g;
import cg4.a$h;
import cg4.a$i;
import com.kwai.robust.PatchProxy;
import java.util.List;

public final class a	// class@00050c
{
    public final List a;

    public void a(){
       a uoa = this;
       super();
       uoa.a = new ArrayList();
       uoa.a(new b("bottom_tips", a$a.a, BottomTips.class));
       uoa.a(new b("merchant_detail_bottom_bar", a$b.a, DetailBottomBarModel.class));
       uoa.a(new b("merchant_detail_main_view", a$c.a, null));
       uoa.a(new b("merchant_detail_panel_main_view", a$d.a, null));
       uoa.a(new b("merchant_detail_panel_list_anim_container", a$e.a, DetailResponse.class));
       b uob = new b("merchant_floating_pendant", a$f.a, null, 4, null);
       uoa.a(v1);
       b uob1 = new b("merchant_detail_replay", a$g.a, null, 4, null);
       uoa.a(v1);
       b uob2 = new b("merchant_detail_sale_info_slide", a$h.a, null, 4, null);
       uoa.a(v1);
       b uob3 = new b("merchant_detail_video_player", a$i.a, null, 4, null);
       uoa.a(v1);
    }
    public final void a(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       this.a.add(p0);
       return;
    }
}
