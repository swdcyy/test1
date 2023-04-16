package jz0.e;
import im8.g;
import k51.c;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.String;
import java.util.List;
import pp.c;
import java.util.HashSet;
import jz0.e$a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import mk1.w;
import jz0.l;
import mk1.h;
import d01.a;
import mk1.b;
import android.view.View;
import pk1.a;
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
import mkc.b;
import mkc.c;
import com.kuaishou.live.common.core.component.gift.gift.p;
import mk1.f;
import java.util.Collection;
import ekd.q;
import brd.t;
import brd.x;
import jz0.b;
import jz0.a;
import erd.g;
import crd.b;
import java.lang.Throwable;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView$a;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView;
import lnc.a1;
import java.lang.CharSequence;
import jz0.e$b;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import java.util.Iterator;
import uk1.b;
import java.lang.Boolean;
import java.util.concurrent.TimeUnit;
import t45.d;
import brd.z;
import jz0.d;
import jz0.c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import ekd.m1;
import jz0.h;
import java.util.Map;
import java.util.HashMap;

public class e extends c implements g	// class@002c46
{
    public final List p;
    public a q;
    public View r;
    public View s;
    public h t;
    public b u;
    public final HashSet v;
    public boolean w;
    public n x;
    public l y;
    public a z;
    public static final String A = "e";
    public static String sLivePresenterClassName = "LiveAudienceGiftBoxLoadToAudienceGiftPresenter";

    public void e(){
       super();
       this.p = LiveLogTag.GIFT.appendTag("LiveAudienceGiftBoxLoadToAudienceGiftPresenter");
       this.v = new HashSet();
       this.w = false;
       this.z = new e$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, e.class, "3")) {
          return;
       }
       if (w.b()) {
          l ol = new l(this.t, this.q, this.u, this.s, this.v);
          this.y = v0;
       }
       if (!this.u.l()) {
          this.P8(a.a());
          e ty = this.y;
          if (ty != null) {
             ty.a();
          }
       }
       return;
    }
    public void P8(a p0){
       e uoe = e.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoe, "5")) {
          return;
       }
       if (this.u.l()) {
          return;
       }
       Object obj = PatchProxy.apply(null, this, uoe, "6");
       int i = (obj != PatchProxyResult.class)? obj.intValue(): g.f(this.t.n.a(b.class).d0());
       b.c0(LiveLogTag.GIFT, "[GiftOpt][loadToAudienceGift]", "refreshMode", Integer.valueOf(i));
       this.t.o.m0();
       this.t.o.O2();
       this.t.A.d("[LiveAudienceGiftBoxLoadToAudienceGiftPresenter][loadToAudienceGift]");
       c.h(this.r, b.d);
       String str = p.e(this.u);
       List list = this.t.c.j(str);
       if (q.f(list) ^ 1) {
          if (i == 2) {
             if (p0.b()) {
                this.S8(list);
             }else {
                this.V8(1, 0);
             }
          }else if(i == 1){
             this.S8(list);
             if (!p0.b()) {
                this.V8(0, 0);
             }
          }else {
             this.S8(list);
          }
       }else if(!i){
          this.t.c.n(str).compose(p.i("giftPanelOnLoadToAudienceGiftsFailed")).subscribe(new b(this, str), new a(this));
       }else {
          this.V8(1, 0);
       }
       return;
    }
    public final void R8(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "8")) {
          return;
       }
       if (this.u.l()) {
          return;
       }
       b[] uobArray = new b[]{b.d};
       c.d(this.r, uobArray);
       View view = c.h(this.r, b.g);
       KwaiEmptyStateView$a uoa = KwaiEmptyStateView.e();
       uoa.b();
       uoa.i(a1.p(R.string.arg_RES_7f102f5a));
       uoa.p(new e$b(this));
       uoa.a(view);
       ExceptionHandler.handleUserNotLoginFirstTimeAlert(p0, view);
       Iterator iterator = this.v.iterator();
       while (iterator.hasNext()) {
          b uob = iterator.next();
          if (uob != null) {
             uob.d(p0);
          }
       }
       return;
    }
    public final void S8(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "7")) {
          return;
       }
       if (this.u.l()) {
          return;
       }
       b[] uobArray = new b[]{b.d,b.g};
       c.d(this.r, uobArray);
       Iterator iterator = this.v.iterator();
       while (iterator.hasNext()) {
          b uob = iterator.next();
          if (uob != null) {
             uob.a(p0);
          }
       }
       return;
    }
    public void V8(boolean p0,int p1){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Integer.valueOf(p1), this, uoe, "4")) {
          return;
       }
       if (this.w != null) {
          b.P(this.p, "[requestToAudienceGift], mIsRequestingGiftData == true");
          return;
       }else {
          this.w = true;
          String str = p.e(this.u);
          t ot = this.t.c.n(str).compose(p.i("giftPanelOnLoadToAudienceGiftsFailed"));
          long l = (true ^ q.f(this.t.c.j(str)))? g.e(): g.d();
          this.X7(ot.timeout(l, TimeUnit.MILLISECONDS).observeOn(d.a).subscribe(new d(this, p0, p1, str), new c(this, str, p0)));
          return;
       }
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "2")) {
          return;
       }
       this.r = m1.f(p0, 0x7f0a3f16);
       this.s = m1.f(p0, 0x7f0a10b1);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, e.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new h();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, e.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(e.class, new h());
       }else {
          obj.put(e.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       this.t = this.q8(h.class);
       this.u = this.q8(b.class);
       this.q = this.q8(a.class);
       return;
    }
}
