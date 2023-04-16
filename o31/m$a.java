package o31.m$a;
import ds5.c;
import o31.m;
import java.lang.Object;
import java.lang.String;
import ds5.b;
import com.kuaishou.android.live.model.QLivePlayConfig;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import t02.a0;
import o02.f;
import o02.e;
import p91.m;
import com.kwai.feature.api.live.base.model.LiveAudienceParam;
import brd.t;
import o31.l;
import crd.a;
import erd.g;
import o31.e;
import o31.c;
import o31.j;
import o31.g;
import crd.b;
import t45.d;
import brd.z;
import o31.k;
import o31.f;
import o31.i;
import o31.h;
import java.lang.Throwable;
import java.util.List;

public class m$a implements c	// class@003469
{
    public final m b;

    public void m$a(m p0){
       this.b = p0;
       super();
    }
    public String N5(){
       return b.a(this);
    }
    public void e2(QLivePlayConfig p0,QLivePlayConfig p1){
       b.c(this, p0, p1);
    }
    public void ff(QLivePlayConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m$a.class, "1")) {
          return;
       }
       m$a tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(null, tb, m.class, "3")) {
          a0 uoa0 = tb.Uo();
          if (uoa0 == null || uoa0.e == null) {
             Throwable throwable = new Throwable("mLivePlayCallerContext init error");
             tb.j = throwable;
             tb.So(throwable, tb.l);
          }else {
             a0 o = uoa0.o;
             m d = tb.d;
             Objects.requireNonNull(d);
             e.a().O(tb.getLiveStreamId(), uoa0.Z2.h(""), o.mLiveStreamStartPlaySourceForEnterPrompt, o.mUserStatusRequestExtraInfo).doOnSubscribe(new l(d)).doOnNext(new e(tb)).doOnNext(c.b).subscribe(new j(tb), new g(tb));
             m d1 = tb.d;
             Objects.requireNonNull(d1);
             e.a().d0(tb.getLiveStreamId(), uoa0.Z2.h("")).observeOn(d.c).doOnNext(new k(uoa0)).observeOn(d.a).doOnSubscribe(new l(d1)).doOnNext(new f(tb)).subscribe(new i(tb), new h(tb));
          }
       }
       return;
    }
    public void onError(Throwable p0){
       b.d(this, p0);
    }
    public boolean xi(){
       return b.e(this);
    }
}
