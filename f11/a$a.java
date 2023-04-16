package f11.a$a;
import ds5.c;
import f11.a;
import java.lang.Object;
import java.lang.String;
import ds5.b;
import com.kuaishou.android.live.model.QLivePlayConfig;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import t02.a0;
import f11.h;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import wo1.a;
import n52.t;
import com.kuaishou.live.common.core.component.like.service.LiveHeartParticleServiceImpl;
import android.app.Activity;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import p91.m;
import lo1.l;
import lp3.e;
import ry1.b;
import android.view.View$OnTouchListener;
import lo1.c;
import java.lang.Throwable;

public class a$a implements c	// class@002267
{
    public final a b;

    public void a$a(a p0){
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
       boolean b;
       h oh;
       a uoa = a.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "1")) {
          return;
       }
       a$a tb = this.b;
       Objects.requireNonNull(tb);
       Object obj = PatchProxy.applyOneRefs(p0, tb, uoa, "4");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(p0.mIsShopLive == null && !tb.r.C0().isGamePatternType()){
          b = true;
       }else {
          b = false;
       }
       Objects.requireNonNull(tb);
       if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), tb, uoa, "5")) {
          if (b) {
             oh = new h(tb.m8(), tb.r, tb.t, tb.s);
          }else {
             uoa = tb.r;
             LiveHeartParticleServiceImpl liveHeartPar = new LiveHeartParticleServiceImpl(tb.getActivity(), tb.r.Z2.b(), tb.m8(), tb.u, uoa.Z2, tb.v, uoa.b3, tb.t);
          }
          tb.p = oh;
          uoa = tb.q;
          if (uoa != null) {
             oh.a(uoa);
             tb.q = null;
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
