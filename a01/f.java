package a01.f;
import erd.g;
import a01.i;
import com.yxcorp.gifshow.models.Gift;
import java.lang.Object;
import com.kuaishou.live.common.core.component.gift.giftstore.api.PrivilegeGiftListResponse;
import lz0.c;
import t02.a0;
import p91.m;
import java.util.List;
import tz0.t;
import vg1.c;
import vg1.e;
import qk1.a;

public final class f implements g	// class@00000c
{
    public final i b;
    public final Gift c;

    public void f(i p0,Gift p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       f tb = this.b;
       f tc = this.c;
       p0 = p0.getPrivilegeGiftPanelItems(tb.w.Z2.s());
       t.a(p0);
       tb.S8().e(p0);
       if (tc != null) {
          tb.X8().m(tc.mId);
       }
       tb.m9();
       return;
    }
}
