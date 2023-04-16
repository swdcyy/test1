package cb2.q$a;
import xq5.c;
import cb2.q;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import cb2.w;
import ekd.k1;
import xq5.b;
import com.kwai.robust.PatchProxyResult;
import fb2.i;
import java.util.Objects;
import cb2.n;
import java.lang.Runnable;
import java.lang.Boolean;
import java.lang.System;
import pm8.a;
import android.content.SharedPreferences;
import o02.e;
import db2.a;
import wkd.b;
import ia0.g;
import com.kwai.framework.model.router.RouteType;
import t45.d;
import brd.z;
import com.yxcorp.retrofit.a;
import com.yxcorp.retrofit.e;
import p91.m;
import com.kwai.feature.api.live.service.basic.bizrelation.LiveBizParam;
import brd.t;
import cjd.e;
import erd.o;
import cb2.p;
import io.reactivex.internal.functions.Functions;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.feature.api.live.base.service.slideplay.LiveWillShowType;

public class q$a implements c	// class@000514
{
    public final q b;

    public void q$a(q p0){
       this.b = p0;
       super();
    }
    public void P(){
       if (PatchProxy.applyVoid(null, this, q$a.class, "2")) {
          return;
       }
       this.b.q.c();
       k1.n(this.b);
       return;
    }
    public void W4(){
       b.c(this);
    }
    public void r(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       q oq = q.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, q$a.class, "1")) {
          return;
       }
       if (this.b.P8()) {
          if (this.b.p.f()) {
             q$a tb = this.b;
             Objects.requireNonNull(tb);
             if (!PatchProxy.applyVoid(objArray, tb, oq, "7")) {
                k1.s(new n(tb), tb, tb.p.b());
             }
          }else {
             q$a tb1 = this.b;
             Objects.requireNonNull(tb1);
             q$a obj = PatchProxy.apply(objArray, tb1, oq, "5");
             if (obj != patchProxyRe) {
                b = obj.booleanValue();
             }else if(tb1.p.d()){
                long l = System.currentTimeMillis();
                if ((l - a.a.getLong("liveSlideGuideRecoLastRequestTimeMs", 0)) - tb1.s >= 0) {
                   long l1 = a.a0();
                   if (!l1 || (l - l1) - 0x5265c00 > 0) {
                      b = true;
                   }
                }
             }
             b = false;
             if (b) {
                a.x1(System.currentTimeMillis());
                obj = this.b;
                a uoa = PatchProxy.apply(objArray, objArray, e.class, "12");
                if (uoa != patchProxyRe) {
                }else if(e.o == null){
                   e.o = e.b(b.a(-1961311520).a(RouteType.LIVE, d.b), a.class);
                }
                uoa = e.o;
                Object obj1 = uoa;
                obj.X7(obj1.a(this.b.x.getLiveStreamId(), this.b.x.d(), this.b.v.mLiveSourceType, a.a0(), a.a.getLong("liveSlideGuideRecoLastShownTimeMs", 0)).map(new e()).subscribe(new p(this), Functions.e));
             }
          }
       }
       return;
    }
    public void t4(LiveWillShowType p0){
       b.e(this, p0);
    }
    public void x4(){
       b.d(this);
    }
    public void y1(){
       b.f(this);
    }
}
