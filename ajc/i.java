package ajc.i;
import com.yxcorp.gifshow.share.platform.WechatForward;
import yic.s;
import mhc.v;
import mhc.x;
import msd.p;
import nsd.u;
import com.yxcorp.gifshow.share.platform.WechatForward$Companion;
import com.yxcorp.gifshow.share.wechat.WechatLocalImageForward$1;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.share.OperationModel;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.yxcorp.gifshow.share.platform.b;
import com.yxcorp.gifshow.share.KwaiOperator;
import brd.t;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import yic.s$a;
import t45.d;
import brd.z;
import io.reactivex.android.schedulers.a;
import ajc.i$a;
import erd.o;
import brd.x;
import yic.r;
import com.kwai.feature.api.social.kwaitoken.model.ShareToken;
import com.yxcorp.gifshow.model.SharePlatformData$ShareConfig;
import java.lang.Number;
import android.graphics.Bitmap;

public final class i extends v implements WechatForward, s	// class@00013c
{
    public final boolean h;
    public final x i;
    public final int j;
    public final p k;

    public void i(boolean p0,x p1,int p2,p p3,int p4,u p5){
       WechatLocalImageForward$1 iNSTANCE;
       if (p4 & 0x02) {
          p1 = WechatForward.n0.a(p0);
       }
       if (p4 & 0x04) {
          p2 = p1.k();
       }
       if (p4 & 0x08) {
          iNSTANCE = WechatLocalImageForward$1.INSTANCE;
       }
       a.p(p1, "forward");
       a.p(iNSTANCE, "shareResultConsumer");
       super(p1, 0, 0, null, null, false, 62, null);
       this.h = p0;
       this.i = p1;
       this.j = p2;
       this.k = iNSTANCE;
       return;
    }
    public WXMediaMessage G(OperationModel p0){
       return b.a(this, p0);
    }
    public WXMediaMessage I(OperationModel p0){
       return b.c(this, p0);
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
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       i oi = i.class;
       OperationModel obj = PatchProxy.applyOneRefs(p0, this, oi, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "operator");
       obj = p0.i();
       t ot = PatchProxy.applyOneRefs(obj, this, oi, "3");
       if (ot != patchProxyRe) {
       }else {
          a.p(obj, "model");
          ot = s$a.c(this, obj);
       }
       t ot1 = ot.subscribeOn(d.c).observeOn(a.c()).flatMap(new i$a(this, obj, p0)).compose(this.k.invoke(p0, this));
       a.o(ot1, "downloadCoverIfNeeded\(mo¡­Consumer\(operator, this\)\)");
       return ot1;
    }
    public int S0(){
       return 6;
    }
    public t U(OperationModel p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, i.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "model");
       return s$a.b(this, p0);
    }
    public WXMediaMessage X(OperationModel p0){
       return b.b(this, p0);
    }
    public WXMediaMessage a0(OperationModel p0){
       return b.g(this, p0);
    }
    public t c(OperationModel p0){
       return r.a(this, p0);
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
    public int f(){
       Object obj = PatchProxy.apply(null, this, i.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return 0x7f08105b;
    }
    public x getForward(){
       return this.i;
    }
    public t h(OperationModel p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, i.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "model");
       return s$a.a(this, p0);
    }
    public int k(){
       return this.j;
    }
    public boolean m(){
       return this.h;
    }
    public t n0(OperationModel p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, i.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "model");
       return s$a.c(this, p0);
    }
    public Bitmap o0(OperationModel p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, i.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "model");
       return s$a.d(this, p0);
    }
    public Bitmap s(){
       Object obj = PatchProxy.apply(null, this, i.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return s$a.e(this);
    }
}
