package zb2.h;
import bc2.b;
import a51.c;
import bc2.l;
import android.os.Handler;
import zb2.h$b;
import bc2.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import yb2.i;
import p91.m;
import zb2.s;
import zb2.h0;
import zb2.f0;
import jc2.r;
import zb2.i0;
import zb2.g0;
import zb2.j;
import zb2.d0;
import zb2.d0$a;
import hf3.a;
import com.kuaishou.livestream.message.nano.LiveLuckyStarMessages$SCLuckyStarStarted;
import zb2.x;
import lf3.g;
import com.kuaishou.livestream.message.nano.LiveLuckyStarMessages$SCLuckyStarOpened;
import zb2.u;
import com.kuaishou.livestream.message.nano.LiveLuckyStarMessages$SCLuckyStarAbnormalEnd;
import zb2.w;
import com.kuaishou.livestream.message.nano.LiveLuckyStarMessages$SCLuckyStarParticipantStatus;
import zb2.v;
import java.util.Objects;
import vq5.d;
import zb2.k;
import vq5.b;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import zb2.h$a;
import com.kuaishou.live.common.core.component.newpendant.top.helper.b;
import com.kuaishou.live.core.show.luckystar.pendant.a;
import android.view.View$OnClickListener;
import fc2.f;
import im8.a;
import ekd.k1;
import bc2.d;
import crd.b;
import lnc.b9;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Set;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.core.show.luckystar.LiveLuckyStarStyle;
import zb2.o;
import dc2.a;
import com.kuaishou.live.core.show.luckystar.model.LiveLuckyStarRollUserResponse;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Number;
import ks5.i;
import fc2.b;
import zb2.j0;
import com.facebook.imagepipeline.common.Priority;
import android.net.Uri;
import ekd.w0;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.core.ImagePipeline;
import com.facebook.drawee.backends.pipeline.Fresco;
import kb.c;
import com.kuaishou.live.core.show.luckystar.util.b;
import java.lang.Long;
import cc2.c;
import cc2.b;
import brd.t;
import cjd.e;
import erd.o;
import java.util.concurrent.TimeUnit;
import zb2.c;
import erd.g;
import zb2.g;
import zb2.f;
import zb2.e;

public abstract class h extends c implements b	// class@004e3a
{
    public b A;
    public boolean B;
    public final h$b C;
    public i v;
    public final l w;
    public d0 x;
    public b y;
    public final Handler z;
    public static String sLivePresenterClassName = "LiveLuckyStarBasePresenter";

    public void h(){
       super();
       this.w = new l();
       this.z = new Handler();
       this.C = new h$b(this);
    }
    public boolean E0(){
       return a.a(this);
    }
    public void E8(){
       h oh = h.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oh, "2")) {
          return;
       }
       super.E8();
       String str = "4";
       if (!PatchProxy.applyVoid(objArray, this, oh, str)) {
          this.v = new i();
          m om = this.X8();
          h tv = this.v;
          tv.a = om;
          tv.i = new s(om);
          this.v.j = this.a9();
          this.v.k = this.Z8();
          this.v.l = this.Y8();
          this.v.m = new i0(om.e());
          this.v.n = new g0(om.e());
       }
       if (!PatchProxy.applyVoid(objArray, this, oh, "5")) {
          d0 uod0 = new d0(this.v, new j(this));
          this.x = uod0;
          d0 uod01 = d0.class;
          if (!PatchProxy.applyVoid(objArray, uod0, uod01, "1") && !PatchProxy.applyVoid(objArray, uod0, uod01, str)) {
             uod0.a.a.u().u0(652, LiveLuckyStarMessages$SCLuckyStarStarted.class, new x(uod0));
             uod0.a.a.u().u0(653, LiveLuckyStarMessages$SCLuckyStarOpened.class, new u(uod0));
             uod0.a.a.u().u0(654, LiveLuckyStarMessages$SCLuckyStarAbnormalEnd.class, new w(uod0));
             uod0.a.a.u().u0(909, LiveLuckyStarMessages$SCLuckyStarParticipantStatus.class, new v(uod0));
          }
       }
       oh = this.C;
       Objects.requireNonNull(oh);
       if (!PatchProxy.applyVoid(objArray, oh, h$b.class, "1")) {
          oh.b.b9().t5("openluckystarinfopanel", new k(oh));
       }
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, h.class, "1")) {
          return;
       }
       super.F8();
       Context context = this.getContext();
       h$a uoa = new h$a(this);
       a uoa1 = (b.d(this))? new a(context, uoa): new f(context, uoa);
       this.A = uoa1;
       this.W7(uoa1);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, h.class, "3")) {
          return;
       }
       super.J8();
       h tC = this.C;
       Objects.requireNonNull(tC);
       if (!PatchProxy.applyVoid(null, tC, h$b.class, "4")) {
          tC.b.b9().Z4("openluckystarinfopanel");
       }
       k1.n(this);
       this.W8().c();
       this.z.removeCallbacksAndMessages(null);
       this.x.c();
       b9.a(this.y);
       return;
    }
    public boolean S8(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       h oh = h.class;
       Object[] objArray = null;
       h obj = PatchProxy.apply(objArray, this, oh, "12");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.v;
       i c = obj.c;
       if (obj.h.contains(c)) {
          b.S(LiveLogTag.LUCKY_STAR.appendTag("LiveLuckyStarBasePresenter"), "canShowOpenResult", "-> true", "currentInfo show participated");
          return true;
       }else {
          o obj1 = PatchProxy.apply(objArray, this, oh, "13");
          if (obj1 != patchProxyRe) {
             b = obj1.booleanValue();
          }else if(this.v.g == LiveLuckyStarStyle.LUCKY_STAR_V2 && (this.w.d() || this.w.g())){
             b = true;
          }else {
             b = false;
          }
          if (b) {
             b.S(LiveLogTag.LUCKY_STAR.appendTag("LiveLuckyStarBasePresenter"), "canShowOpenResult", "-> true", "can show openResultForV2");
             return true;
          }else {
             i m = this.v.m;
             obj1 = m.a;
             o b1 = m.b;
             if (obj1 != null && (TextUtils.n(obj1.b, c) && (b1 != null && b1.mHideOpenResult != null))) {
                b.S(LiveLogTag.LUCKY_STAR.appendTag("LiveLuckyStarBasePresenter"), "canShowOpenResult", "-> false", "rollUsers tell hide");
                return false;
             }else {
                b.S(LiveLogTag.LUCKY_STAR.appendTag("LiveLuckyStarBasePresenter"), "canShowOpenResult", "-> true", "default true");
                return true;
             }
          }
       }
    }
    public int V8(){
       Object obj = PatchProxy.apply(null, this, h.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.x.a.p;
    }
    public d W8(){
       return this.w;
    }
    public abstract m X8();
    public r Y8(){
       return null;
    }
    public abstract f0 Z8();
    public h0 a9(){
       return null;
    }
    public abstract d b9();
    public abstract i c9();
    public boolean d9(){
       h tv = this.v;
       boolean b = false;
       if (tv == null) {
          return b;
       }
       i o = tv.o;
       if (o == 1 || o == 2) {
          b = true;
       }
       return b;
    }
    public void e9(String p0){
    }
    public boolean h2(){
       return a.b(this);
    }
    public void h9(){
       if (PatchProxy.applyVoid(null, this, h.class, "7")) {
          return;
       }
       h tA = this.A;
       if (tA != null) {
          tA.s();
       }
       return;
    }
    public void j9(){
    }
    public void k9(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, h.class, "15")) {
          return;
       }
       if (this.v.g == LiveLuckyStarStyle.LUCKY_STAR_V2 && this.B == null) {
          j0 oj0 = j0.class;
          if (!PatchProxy.applyVoid(objArray, objArray, oj0, "2")) {
             String a = j0.a;
             Priority mEDIUM = Priority.MEDIUM;
             if (!PatchProxy.applyVoidTwoRefs(a, mEDIUM, objArray, oj0, "1")) {
                Fresco.getImagePipeline().prefetchToDiskCache(ImageRequestBuilder.k(w0.f(a)).a(), objArray, mEDIUM);
             }
          }
          long l = b.h(this.v.b);
          b.S(LiveLogTag.LUCKY_STAR.appendTag("LiveLuckyStarBasePresenter"), "start warm StyleV2 resource", "scatter delay", Long.valueOf(l));
          this.X7(b.b().i(b.g(this.v.a.e()), this.v.a.getLiveStreamId(), this.v.c).map(new e()).delaySubscription(l, TimeUnit.MILLISECONDS).doOnNext(new c(this)).flatMap(g.b).subscribe(f.b, e.b));
       }
       return;
    }
}
