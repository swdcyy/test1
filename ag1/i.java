package ag1.i;
import cz2.d;
import com.kuaishou.live.common.core.component.effect.renderer.c;
import java.lang.Object;
import pz2.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import pz2.i;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import java.lang.StringBuilder;
import p91.m;
import java.lang.Boolean;
import com.kuaishou.android.live.log.b;
import gz2.h;
import kz2.a;
import hz2.c;
import java.util.Map;
import fg1.a;
import hz2.b;
import fg6.a;
import iz2.a;
import com.google.gson.Gson;
import eg1.e;
import lp3.c;
import lp3.i;
import ag1.i$a;
import lnc.o5;
import pz2.j;
import lp3.e;
import com.kuaishou.live.common.core.component.effect.renderer.LiveEffectBridge;
import java.util.Set;
import java.lang.Integer;

public class i implements d	// class@00008b
{
    public final c a;

    public void i(c p0){
       this.a = p0;
       super();
    }
    public void a(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "6")) {
          return;
       }
       c u = this.a.u;
       if (u != null) {
          u.a(p0);
       }
       return;
    }
    public void b(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "1")) {
          return;
       }
       c u = this.a.u;
       if (u != null) {
          u.b(p0);
       }
       return;
    }
    public void c(c p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, i.class, "2")) {
          return;
       }
       c u = this.a.u;
       if (u != null) {
          u.c(p0, p1);
       }
       return;
    }
    public void f(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "4")) {
          return;
       }
       if (this.a.q != null && (!TextUtils.x(p0.getExtraInfo()) && !p0.E())) {
          LiveLogTag lIVE_EFFECT = LiveLogTag.LIVE_EFFECT;
          String str = "LiveEffectRendererPresenter";
          lIVE_EFFECT.appendTag(str);
          b.S(lIVE_EFFECT, "localRender ExtraInfo = "+p0.getExtraInfo(), "isAnchor", Boolean.valueOf(this.a.r.e()));
          this.a.q.C0(p0, p0.getExtraInfo());
          if (p0 instanceof a) {
             a uoa = p0;
             this.a.q.C0(p0, uoa.K());
             str = uoa.K();
             b.S(lIVE_EFFECT.appendTag(str), "[onEffectRenderStarted]", "jsonStringToYtech", str);
          }
       }
       c u = this.a.u;
       if (u != null) {
          u.e(p0);
       }
       return;
    }
    public void g(c p0,boolean p1,String p2,c p3){
       if (PatchProxy.isSupport(i.class) && PatchProxy.applyVoidFourRefs(p0, Boolean.valueOf(p1), p2, p3, this, i.class, "3")) {
          return;
       }
       c u = this.a.u;
       if (u != null) {
          u.d(p0, p1, p2);
       }
       if (p1) {
          b.a(p3, a.h(this.a.r.e()));
       }
       return;
    }
    public void onReceivedEffectEvent(c p0,String p1){
       c t;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, i.class, "5")) {
          return;
       }
       a uoa = a.a.h(p1, a.class);
       if (uoa == null) {
          b.r(LiveLogTag.LIVE_EFFECT.appendTag("LiveEffectRendererPresenter"), "onReceivedEffectEvent message is null");
          return;
       }else if(p0 == null){
          b.P(LiveLogTag.LIVE_EFFECT.appendTag("LiveEffectRendererPresenter"), "[onReceivedEffectEvent] effectTask is null");
          return;
       }else if(uoa.mRequestType == 3010){
          t = this.a.t;
          if (t != null) {
             e uoe = t.a(e.class);
             if (uoe.H() == p0) {
                uoe.D();
                return;
             }
          }
       }
       if (this.a.y.a(uoa.mModule, p1, new i$a(this, o5.b(uoa.mSequenceId, -1), p0), this.a.t)) {
          return;
       }else if(uoa.mRequestType == 3008 && (p0 instanceof a && p0.E() == 1)){
          t = this.a.q;
          if (t != null) {
             t.C0(p0, p0.getExtraInfo());
             a uoa1 = p0;
             this.a.q.C0(p0, uoa1.K());
             b.S(LiveLogTag.LIVE_EFFECT.appendTag("LiveEffectRendererPresenter"), "[onEffectRenderStarted]", "jsonStringToYtech", uoa1.K());
          }
       }
       if (!p0.C().contains(Integer.valueOf(uoa.mRequestType))) {
          b.P(LiveLogTag.LIVE_EFFECT.appendTag("LiveEffectRendererPresenter"), "[onReceivedEffectEvent] effectTask cannot handle ReqType");
          return;
       }else {
          p0.g(p1, uoa.mRequestType);
          return;
       }
    }
}
