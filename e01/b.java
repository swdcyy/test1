package e01.b;
import im8.g;
import k51.c;
import e01.b$a;
import io.reactivex.subjects.PublishSubject;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import mk1.h;
import android.view.View;
import ekd.m1;
import com.kuaishou.live.common.core.component.gift.domain.combo.animation.LiveGiftBoxGiftParticleAnimationView;
import com.kuaishou.live.common.core.component.gift.domain.combo.animation.LiveGiftBoxComboTextAnimationView;
import io.reactivex.BackpressureStrategy;
import brd.h;
import brd.t;
import t45.d;
import brd.z;
import e01.a;
import io.reactivex.internal.functions.Functions;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.yxcorp.gifshow.models.Gift;
import android.app.Activity;
import d61.y;
import com.kwai.robust.PatchProxyResult;
import e01.e;
import java.util.Map;
import java.util.HashMap;

public class b extends c implements g	// class@002076
{
    public h p;
    public LiveGiftBoxGiftParticleAnimationView q;
    public LiveGiftBoxComboTextAnimationView r;
    public View s;
    public final f t;
    public final c u;
    public final Object v;
    public static String sLivePresenterClassName = "LiveAudienceGiftSendAnimationPresenter";

    public void b(){
       super();
       this.t = new b$a(this);
       this.u = PublishSubject.g();
       this.v = new Object();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       this.s = m1.f(this.p.k, 0x7f0a1092);
       this.q = m1.f(this.p.k, 0x7f0a1d25);
       this.r = m1.f(this.p.k, 0x7f0a1d1e);
       this.X7(this.u.toFlowable(BackpressureStrategy.DROP).t(d.c).A(a.b, Functions.e));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, b.class, "3")) {
          return;
       }
       this.q.setVisibility(8);
       this.q.b();
       this.r.setVisibility(8);
       this.r.b();
       return;
    }
    public void P8(Gift p0,View p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "4")) {
          return;
       }
       if (y.d(this.getActivity())) {
          return;
       }
       this.q.c(p0, p1, this.s);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new e();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, b.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(b.class, new e());
       }else {
          obj.put(b.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.p = this.q8(h.class);
       return;
    }
}
