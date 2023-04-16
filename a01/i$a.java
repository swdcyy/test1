package a01.i$a;
import vg1.m;
import a01.i;
import com.kuaishou.live.common.core.component.gift.giftstore.bean.GiftPanelItem;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.String;
import lz0.c;
import mk1.h;
import cl1.c;
import com.yxcorp.gifshow.models.Gift;
import wk1.b;

public class i$a extends m	// class@00000f
{
    public final i e;

    public void i$a(i p0){
       this.e = p0;
       super();
    }
    public void b(GiftPanelItem p0,int p1,boolean p2,View p3,boolean p4){
       i$a uoa = i$a.class;
       int i = 1;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Boolean.valueOf(p2),p3,Boolean.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, uoa, "1")) {
             return;
          }
       }
       this.e.R8(p0, p1, p3);
       if (!this.e.x9()) {
          this.e.v.t.d();
       }
       Gift gift = p0.getGift();
       if (gift != null && !p2) {
          if (!this.e.b9()) {
             return;
          }else {
             c v = this.e.v;
             if (v.K != gift) {
                i = 0;
             }
             if (!i) {
                v.A.d("[LiveAudienceGiftBoxPrivilegeGiftPresenter][handleItemSelected]");
                i$a te = this.e;
                te.v.K = gift;
                te.q9(p1);
             }
             this.e.u9(gift);
             this.e.o9(gift.mId, "[LiveAudienceGiftBoxPrivilegeGiftPresenter][handleItemSelected]");
             this.e.P8(p0);
             this.e.e9(gift, p1);
             if (this.e.x9()) {
                this.e.v.t.d();
             }
          }
       }
       return;
    }
}
