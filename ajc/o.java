package ajc.o;
import com.yxcorp.gifshow.share.platform.WechatForward;
import mhc.v2;
import mhc.v;
import mhc.x;
import com.yxcorp.gifshow.share.platform.WechatForward$Companion;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import nsd.u;
import com.yxcorp.gifshow.share.OperationModel;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.yxcorp.gifshow.share.platform.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.yxcorp.gifshow.share.KwaiOperator;
import brd.t;
import com.yxcorp.gifshow.activity.GifshowActivity;
import mhc.v2$a;
import brd.x;
import mhc.u1;
import wkd.b;
import fic.a;
import ajc.o$e;
import erd.o;
import zic.z0;
import ajc.o$c;
import ajc.o$d;
import ajc.o$a;
import java.util.concurrent.Callable;
import ajc.o$b;
import com.kwai.feature.api.social.kwaitoken.model.ShareToken;
import com.yxcorp.gifshow.model.SharePlatformData$ShareConfig;

public final class o extends v implements WechatForward, v2	// class@000148
{
    public final boolean h;
    public final x i;
    public final int j;

    public void o(boolean p0){
       x ox = WechatForward.n0.a(p0);
       super(p0, ox, ox.k());
    }
    public void o(boolean p0,x p1,int p2){
       a.p(p1, "forward");
       super(p1, 0, 0, null, null, false, 62, null);
       this.h = p0;
       this.i = p1;
       this.j = p2;
    }
    public WXMediaMessage G(OperationModel p0){
       return b.a(this, p0);
    }
    public WXMediaMessage I(OperationModel p0){
       return b.c(this, p0);
    }
    public int I0(){
       Object obj = PatchProxy.apply(null, this, o.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = (this.m())? 1: 2;
       return i;
    }
    public WXMediaMessage K0(OperationModel p0){
       return b.e(this, p0);
    }
    public WXMediaMessage N(OperationModel p0){
       return b.d(this, p0);
    }
    public t O(String p0,String p1,KwaiOperator p2,String p3){
       return b.i(this, p0, p1, p2, p3);
    }
    public t P0(KwaiOperator p0){
       t ot1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       o oo = o.class;
       GifshowActivity obj = PatchProxy.applyOneRefs(p0, this, oo, "2");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "operator");
       if (this.I0() != 2) {
          obj = p0.c();
          OperationModel operationMod = p0.i();
          t ot = PatchProxy.applyTwoRefsWithListener(obj, operationMod, this, oo, "5");
          if (ot != patchProxyRe) {
          }else {
             a.p(obj, "activity");
             a.p(operationMod, "model");
             ot = v2$a.c(this, obj, operationMod);
             PatchProxy.onMethodExit(oo, "5");
          }
          ot1 = ot.compose(u1.a(p0, this));
          a.o(ot1, "shareToken\(operator.acti¡­perator,\n          this\)\)");
       }else {
          ot1 = t.fromCallable(new o$a(p0)).flatMap(new o$b(b.a(-586496146).a(p0.i().r(), this.I0(), "").map(o$e.b).map(z0.a()).onErrorReturn(o$c.b).flatMap(new o$d(this, p0))));
          a.o(ot1, "Observable.fromCallable ¡­atMap { shareObservable }");
       }
       return ot1;
    }
    public String Q(OperationModel p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, o.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "model");
       return v2$a.a(this, p0);
    }
    public int S0(){
       return 2;
    }
    public WXMediaMessage X(OperationModel p0){
       return b.b(this, p0);
    }
    public WXMediaMessage a0(OperationModel p0){
       return b.g(this, p0);
    }
    public t b0(GifshowActivity p0,OperationModel p1,ShareToken p2){
       Object obj = PatchProxy.applyThreeRefsWithListener(p0, p1, p2, this, o.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "activity");
       a.p(p1, "model");
       a.p(p2, "token");
       PatchProxy.onMethodExit(o.class, "7");
       return v2$a.e(this, p0, p1, p2);
    }
    public t c0(WXMediaMessage p0,KwaiOperator p1,String p2){
       return b.j(this, p0, p1, p2);
    }
    public WXMediaMessage d0(OperationModel p0,ShareToken p1){
       return b.f(this, p0, p1);
    }
    public SharePlatformData$ShareConfig e0(OperationModel p0){
       return b.h(this, p0);
    }
    public x getForward(){
       return this.i;
    }
    public int k(){
       return this.j;
    }
    public t k0(GifshowActivity p0,OperationModel p1,ShareToken p2){
       Object obj = PatchProxy.applyThreeRefsWithListener(p0, p1, p2, this, o.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "activity");
       a.p(p1, "model");
       a.p(p2, "token");
       PatchProxy.onMethodExit(o.class, "8");
       return v2$a.f(this, p0, p1, p2);
    }
    public boolean m(){
       return this.h;
    }
    public t p0(GifshowActivity p0,OperationModel p1,t p2){
       Object obj = PatchProxy.applyThreeRefsWithListener(p0, p1, p2, this, o.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "activity");
       a.p(p1, "model");
       a.p(p2, "tokenObservable");
       PatchProxy.onMethodExit(o.class, "4");
       return v2$a.d(this, p0, p1, p2);
    }
    public t t(GifshowActivity p0,OperationModel p1){
       Object obj = PatchProxy.applyTwoRefsWithListener(p0, p1, this, o.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "activity");
       a.p(p1, "model");
       PatchProxy.onMethodExit(o.class, "5");
       return v2$a.c(this, p0, p1);
    }
    public t t0(GifshowActivity p0,OperationModel p1,ShareToken p2){
       Object obj = PatchProxy.applyThreeRefsWithListener(p0, p1, p2, this, o.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "activity");
       a.p(p1, "model");
       a.p(p2, "token");
       PatchProxy.onMethodExit(o.class, "6");
       return v2$a.b(this, p0, p1, p2);
    }
}
