package b83.a;
import b83.a$b;
import nsd.u;
import com.kuaishou.live.lite.sidebar.e;
import com.kuaishou.live.lite.bottombar.LiveLiteBottomBarService;
import t73.b;
import z1.k;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.concurrent.atomic.AtomicBoolean;
import b83.a$a;
import z1.a;
import w73.s$b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.gift.log.LiveGiftTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import w73.a;
import com.kuaishou.live.lite.bottombar.LiveLiteBottomBarService$BottomBarType;
import com.kuaishou.live.lite.adapter.component.gift.giftguide.entry.bottombar.a;
import com.kuaishou.live.lite.bottombar.LiveLiteBottomBarService$a;
import java.lang.Integer;
import com.kuaishou.live.lite.sidebar.e$a;
import java.lang.Boolean;
import com.kuaishou.live.lite.adapter.component.gift.giftguide.entry.sidebar.b;

public final class a	// class@00036c
{
    public b a;
    public a b;
    public s$b c;
    public Integer d;
    public LiveLiteBottomBarService$BottomBarType e;
    public boolean f;
    public final AtomicBoolean g;
    public boolean h;
    public long i;
    public b j;
    public b k;
    public final e l;
    public final LiveLiteBottomBarService m;
    public final b n;
    public final k o;
    public final k p;
    public final k q;
    public static final a$b r;

    static {
       a.r = new a$b(null);
    }
    public void a(e p0,LiveLiteBottomBarService p1,b p2,k p3,k p4,k p5){
       a.p(p0, "liteSideBarService");
       a.p(p1, "liteBottomBarService");
       a.p(p2, "liveLitePopularityEntryCallback");
       a.p(p3, "liveStreamPackageSupplier");
       a.p(p4, "feedLogCtxSupplier");
       a.p(p5, "bizLogParams");
       super();
       this.l = p0;
       this.m = p1;
       this.n = p2;
       this.o = p3;
       this.p = p4;
       this.q = p5;
       this.g = new AtomicBoolean(false);
       this.h = true;
       p0.e(new a$a(this));
    }
    public final void a(s$b p0){
       LiveLiteBottomBarService$BottomBarType uBottomBarTy;
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "9")) {
          return;
       }
       LiveGiftTag lIVE_POPULAR = LiveGiftTag.LIVE_POPULARITY;
       String str = "PopularitySideBarHandler";
       lIVE_POPULAR.appendTag(str);
       b.S(lIVE_POPULAR, "addPopularityTicketBottomBarItem", "liveLitePopularityTicketStatus", p0);
       a c = p0.a().c;
       if (c != 1) {
          uBottomBarTy = (c != 2)? null: LiveLiteBottomBarService$BottomBarType.GIFT;
       }else {
          uBottomBarTy = LiveLiteBottomBarService$BottomBarType.GUIDE_GIFT;
       }
       this.e = uBottomBarTy;
       if (uBottomBarTy != null) {
          a uoa = p0.a();
          a tb = this.b;
          if (tb == null) {
             a uoa1 = new a(this.n, uoa, this.o, this.p, this.q, LiveLiteBottomBarService$BottomBarType.POPULARITY, this.g);
             this.h = false;
             this.m.e(uBottomBarTy, tb);
             this.b = tb;
          }else {
             tb.e(uoa);
          }
          return;
       }else {
          b.S(lIVE_POPULAR.appendTag(str), "addPopularityTicketBottomBarItem: replacePlan invalid!", "replacePlan", Integer.valueOf(p0.a().c));
          return;
       }
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, a.class, "8")) {
          return;
       }
       LiveGiftTag lIVE_POPULAR = LiveGiftTag.LIVE_POPULARITY;
       lIVE_POPULAR.appendTag("PopularitySideBarHandler");
       b.T(lIVE_POPULAR, "removePopularityTicketBottomBarItem", "popularityTicketBottomBarItem", this.b, "replaceBottomBarItemType", this.e);
       a tb = this.b;
       if (tb != null) {
          a te = this.e;
          if (te != null) {
             this.m.h(te, tb);
             this.b = null;
             this.e = null;
          }
       }
       return;
    }
    public final void c(){
       a uoa = a.class;
       if (PatchProxy.applyVoid(null, this, uoa, "3")) {
          return;
       }
       this.f = false;
       if (!PatchProxy.applyVoid(null, this, uoa, "7")) {
          LiveGiftTag lIVE_POPULAR = LiveGiftTag.LIVE_POPULARITY;
          lIVE_POPULAR.appendTag("PopularitySideBarHandler");
          b.T(lIVE_POPULAR, "removePopularityTicketSideBarItem", "popularityTicketSideBarItem", this.a, "replaceSidebarItemType", this.d);
          uoa = this.a;
          if (uoa != null) {
             a td = this.d;
             if (td != null) {
                this.l.h(td.intValue(), uoa, true);
                this.a = null;
                this.d = null;
             }
          }
       }
       this.b();
       return;
    }
    public final void d(boolean p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "4")) {
          return;
       }
       uoa = this.a;
       if (uoa != null && !this.l.j()) {
          uoa.p(p0);
       }
       uoa = this.b;
       if (uoa != null && !this.l.j()) {
          uoa.k(p0);
       }
       return;
    }
}
