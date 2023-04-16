package g82.c0;
import erd.g;
import g82.v$b$a;
import java.lang.String;
import kg1.f$a;
import java.lang.Object;
import java.lang.Throwable;
import java.util.Objects;
import g82.v$b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import android.os.SystemClock;
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
import com.kwai.component.fansgroup.utils.FansGroupKswitchUtil;
import l95.b;
import com.yxcorp.retrofit.model.KwaiException;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import l95.c;

public final class c0 implements g	// class@002a96
{
    public final v$b$a b;
    public final String c;
    public final f$a d;
    public final long e;

    public void c0(v$b$a p0,String p1,f$a p2,long p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void accept(Object p0){
       c0 tc = this.c;
       c0 td = this.d;
       c0 te = this.e;
       v$b$a i = this.b.i;
       Objects.requireNonNull(i);
       if (!PatchProxy.isSupport(v$b.class) || !PatchProxy.applyVoidFourRefs(tc, td, Long.valueOf(te), p0, i, v$b.class, "12")) {
          if (td != null) {
             td.a();
          }
          i.b(i.b.p.R().t0(), i.b.p.Z2.a(), 8, (SystemClock.elapsedRealtime() - te), tc, i.b.p.Z2.d(), e.r(i.b.getActivity()), 0, i.b.p.c0());
          v$b b = i.b;
          Objects.requireNonNull(b);
          if (!PatchProxy.applyVoidTwoRefs(p0, tc, b, v.class, "53") && FansGroupKswitchUtil.b()) {
             b uob = new b(false, "QuickJoin", "REQUEST_JOIN");
             uob.g(tc);
             uob.f(404);
             if (p0 instanceof KwaiException) {
                p0 = p0.getMessage();
                uob.b(p0.getErrorCode());
                if (TextUtils.x(p0)) {
                   p0 = "join error";
                }
                uob.c(p0);
             }
             c.a(uob);
          }
       }
    label_00be :
       return;
    }
}
