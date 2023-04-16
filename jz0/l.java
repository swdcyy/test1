package jz0.l;
import mk1.h;
import d01.a;
import mk1.b;
import android.view.View;
import java.util.HashSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import el1.a;
import tk1.b;
import wk1.b;
import mkc.b;
import mkc.c;
import com.kuaishou.live.common.core.component.gift.gift.p;
import brd.t;
import mk1.f;
import brd.x;
import jz0.i;
import jz0.j;
import erd.g;
import crd.b;

public class l	// class@002c4d
{
    public final h a;
    public final a b;
    public final b c;
    public final View d;
    public final HashSet e;

    public void l(h p0,a p1,b p2,View p3,HashSet p4){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, l.class, "1")) {
          return;
       }
       if (this.c.l()) {
          return;
       }
       this.a.B.k();
       this.a.B.m0();
       this.a.A.d("[LiveAudienceGiftBoxLoadToAudienceGiftPresenter][loadToAudiencePacketGift]");
       c.h(this.d, b.e);
       b[] uobArray = new b[]{b.g,b.i};
       c.d(this.d, uobArray);
       this.a.c.k(p.e(this.c)).compose(p.i("giftPanelOnLoadToAudiencePacketGiftsFailed")).subscribe(new i(this), new j(this));
       this.b.b(this.c);
       return;
    }
}
