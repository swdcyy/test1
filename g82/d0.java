package g82.d0;
import erd.g;
import g82.v$b$a;
import java.lang.String;
import kg1.f$a;
import java.lang.Object;
import com.kuaishou.live.common.core.component.fansgroup.model.LiveFansGroupJoinResponse;
import java.util.Objects;
import android.os.SystemClock;
import mg1.a;
import g82.v$b;
import g82.v;
import com.kuaishou.live.core.basic.activity.x;
import t02.a0;
import com.kuaishou.live.core.basic.activity.LivePlayFragment;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.live.core.basic.utils.e;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import k2b.e0;
import com.google.gson.JsonElement;
import kg1.i;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.component.fansgroup.utils.FansGroupKswitchUtil;
import l95.b;
import l95.c;

public final class d0 implements g	// class@002a98
{
    public final v$b$a b;
    public final boolean c;
    public final String d;
    public final f$a e;
    public final long f;

    public void d0(v$b$a p0,boolean p1,String p2,f$a p3,long p4){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
    }
    public final void accept(Object p0){
       v$b$a i;
       d0 tb = this.b;
       d0 td = this.d;
       d0 te = this.e;
       d0 tf = this.f;
       Objects.requireNonNull(tb);
       long l = SystemClock.elapsedRealtime();
       if (this.c != null) {
          i = tb.i;
          boolean b = (i.b.Y != null)? true: false;
          i.Tf(td, new a(b, "LIVE_GZONE_RANK "));
       }
       if (te != null) {
          te.b();
       }
       i.b(tb.i.b.p.R().t0(), tb.i.b.p.Z2.a(), 7, (l - tf), td, tb.i.b.p.Z2.d(), e.r(tb.i.b.getActivity()), p0.mCsLogCorrelateInfo, tb.i.b.p.c0());
       p0 = tb.i.b;
       Objects.requireNonNull(p0);
       if (!PatchProxy.applyVoidOneRefs(td, p0, v.class, "54") && FansGroupKswitchUtil.b()) {
          p0 = new b(false, "QuickJoin", "REQUEST_JOIN");
          p0.g(td);
          p0.f(200);
          c.a(p0);
       }
       return;
    }
}
