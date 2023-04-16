package iz0.i$a;
import rk1.b;
import iz0.i;
import java.lang.Object;
import uk1.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Set;
import pk1.a;
import mk1.w;
import java.util.Objects;
import iz0.m;
import mk1.b;
import mk1.h;
import tk1.b;
import el1.a;
import wk1.b;
import mkc.b;
import android.view.View;
import mkc.c;
import d01.a;
import rk1.a;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.List;
import com.kuaishou.android.live.log.b;
import brd.t;
import mk1.f;
import iz0.h;
import iz0.b;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public class i$a implements b	// class@0029dc
{
    public final i a;

    public void i$a(i p0){
       this.a = p0;
       super();
    }
    public void a(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i$a.class, "2")) {
          return;
       }
       this.a.x.add(p0);
       return;
    }
    public void b(a p0){
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, i$a.class, str)) {
          return;
       }
       this.a.P8(p0);
       if (w.b()) {
          i a = this.a.A;
          if (a != null) {
             Objects.requireNonNull(a);
             if (!PatchProxy.applyVoid(null, a, m.class, str) && a.b.l()) {
                a.a.B.m0();
                a.a.B.k();
                a.a.A.d("[LiveAudienceGiftBoxLoadToAnchorGiftsPresenter][loadToAnchorPacketGift]");
                c.h(a.d, b.e);
                b[] uobArray = new b[]{b.i,b.g};
                c.d(a.d, uobArray);
                a.a.B.h(1);
                a.c.b(a.b);
             }
          }
       }
       return;
    }
    public void c(){
       a.a(this);
    }
    public void d(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i$a.class, "3")) {
          return;
       }
       this.a.x.remove(p0);
       return;
    }
    public void e(boolean p0,int p1){
       i$a uoa = i$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Integer.valueOf(p1), this, uoa, "4")) {
          return;
       }
       uoa = this.a;
       Objects.requireNonNull(uoa);
       i oi = i.class;
       if (!PatchProxy.isSupport(oi) || !PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Integer.valueOf(p1), uoa, oi, "8")) {
          if (uoa.y != null) {
             b.P(uoa.p, "[requestToAnchorGift] , mIsRequestingGiftData == true");
          }else {
             uoa.y = true;
             uoa.X7(uoa.t.c.r().subscribe(new h(uoa, p0, p1), new b(uoa)));
          }
       }
       return;
    }
}
