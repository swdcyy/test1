package iz0.i;
import im8.g;
import k51.c;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.String;
import java.util.List;
import pp.c;
import java.util.HashSet;
import iz0.i$a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import mk1.b;
import pk1.a;
import mk1.w;
import iz0.m;
import mk1.h;
import d01.a;
import android.view.View;
import java.util.Set;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import ry1.b;
import lp3.c;
import lp3.e;
import com.kuaishou.live.core.basic.model.LiveTimeConsumingUserStatusResponse;
import rm1.g;
import java.lang.Integer;
import com.kuaishou.android.live.log.b;
import bl1.a;
import wk1.b;
import mk1.f;
import mkc.b;
import mkc.c;
import brd.t;
import java.util.concurrent.TimeUnit;
import t45.d;
import brd.z;
import iz0.c;
import iz0.d;
import erd.g;
import crd.b;
import java.lang.Throwable;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView$a;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView;
import iz0.i$b;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import java.util.Iterator;
import uk1.b;
import oh3.j;
import t02.a0;
import jk1.f;
import iz0.g;
import iz0.e;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import ekd.m1;
import iz0.l;
import java.util.Map;
import java.util.HashMap;

public class i extends c implements g	// class@0029de
{
    public m A;
    public b B;
    public final List p;
    public View q;
    public View r;
    public b s;
    public h t;
    public b u;
    public a0 v;
    public a w;
    public Set x;
    public boolean y;
    public boolean z;
    public static String sLivePresenterClassName = "LiveAudienceGiftBoxLoadToAnchorGiftsPresenter";

    public void i(){
       super();
       this.p = LiveLogTag.GIFT.appendTag("LiveAudienceGiftBoxLoadToAnchorGiftsPresenter");
       this.x = new HashSet();
       this.y = false;
       this.z = false;
       this.B = new i$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, i.class, "3")) {
          return;
       }
       if (this.s.l()) {
          this.P8(a.a());
       }
       if (w.b()) {
          this.A = new m(this.t, this.s, this.w, this.r);
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, i.class, "4")) {
          return;
       }
       this.x.clear();
       return;
    }
    public void P8(a p0){
       int i;
       i oi = i.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, oi, "5")) {
          return;
       }
       if (!this.s.l()) {
          return;
       }
       Object obj = PatchProxy.apply(null, this, oi, "7");
       i = (obj != PatchProxyResult.class)? obj.intValue(): g.f(this.t.n.a(b.class).d0());
       b.c0(LiveLogTag.GIFT, "[GiftOpt][loadToAnchorGift]", "refreshMode", Integer.valueOf(i));
       this.t.o.m0();
       this.t.o.O2();
       this.t.A.d("[LiveAudienceGiftBoxLoadToAnchorGiftsPresenter][loadToAnchorGift]");
       if (this.t.c.l()) {
          if (i == 2) {
             if (p0.b() && this.z != null) {
                this.S8();
             }else {
                c.h(this.q, b.e);
                this.V8(i);
             }
          }else if(i == 1){
             this.S8();
             if (!p0.b() || this.z == null) {
                this.V8(i);
             }
          }else {
             this.S8();
          }
       }else {
          c.h(this.q, b.e);
          if (!i) {
             this.u = this.t.c.m().timeout(g.d(), TimeUnit.MILLISECONDS).observeOn(d.a).subscribe(new c(this), new d(this));
          }else {
             this.V8(i);
          }
       }
       return;
    }
    public final void R8(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "10")) {
          return;
       }
       if (!this.s.l()) {
          return;
       }
       b[] uobArray = new b[]{b.e};
       c.d(this.q, uobArray);
       View view = c.h(this.q, b.g);
       KwaiEmptyStateView$a uoa = KwaiEmptyStateView.e();
       uoa.b();
       uoa.p(new i$b(this));
       uoa.a(view);
       ExceptionHandler.handleUserNotLoginFirstTimeAlert(p0, view);
       Iterator iterator = this.x.iterator();
       while (iterator.hasNext()) {
          b uob = iterator.next();
          if (uob != null) {
             uob.d(p0);
          }
       }
       return;
    }
    public final void S8(){
       if (PatchProxy.applyVoid(null, this, i.class, "11")) {
          return;
       }
       if (!this.s.l()) {
          return;
       }
       b[] uobArray = new b[]{b.e,b.g};
       c.d(this.q, uobArray);
       List list = this.t.c.O3();
       Iterator iterator = this.x.iterator();
       while (iterator.hasNext()) {
          b uob = iterator.next();
          if (uob != null) {
             uob.a(list);
          }
       }
       return;
    }
    public final void V8(int p0){
       i oi = i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, oi, "6")) {
          return;
       }
       j.a(this.u);
       this.v.x1.Ug();
       long l = (this.t.c.l() && p0 == 2)? g.e(): g.d();
       this.z = true;
       this.X7(this.t.c.o().timeout(l, TimeUnit.MILLISECONDS).observeOn(d.a).subscribe(new g(this, p0), new e(this)));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "2")) {
          return;
       }
       this.q = m1.f(p0, 0x7f0a3f16);
       this.r = m1.f(p0, 0x7f0a10b1);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, i.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new l();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, i.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(i.class, new l());
       }else {
          obj.put(i.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, i.class, "1")) {
          return;
       }
       this.s = this.q8(b.class);
       this.t = this.q8(h.class);
       this.v = this.q8(a0.class);
       this.w = this.q8(a.class);
       return;
    }
}
