package ajc.d;
import com.yxcorp.gifshow.share.platform.WechatForward;
import yic.s;
import mhc.v;
import nsd.u;
import mhc.x;
import com.yxcorp.gifshow.share.platform.WechatForward$Companion;
import java.lang.String;
import com.yxcorp.gifshow.share.OperationModel;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.yxcorp.gifshow.share.platform.b;
import com.yxcorp.gifshow.share.KwaiOperator;
import brd.t;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import yic.s$a;
import t45.d;
import brd.z;
import io.reactivex.android.schedulers.a;
import ajc.d$a;
import erd.o;
import brd.x;
import mhc.u1;
import yic.r;
import com.kwai.feature.api.social.kwaitoken.model.ShareToken;
import com.yxcorp.gifshow.model.SharePlatformData$ShareConfig;
import java.lang.Number;
import android.graphics.Bitmap;

public class d extends v implements WechatForward, s	// class@000133
{
    public final boolean h;
    public final int i;

    public void d(){
       super(0, 1, null);
    }
    public void d(int p0){
       super(WechatForward.n0.c(), 0, 0, null, null, false, 62, null);
       this.i = p0;
       this.h = true;
    }
    public void d(int p0,int p1,u p2){
       if (p1 & 0x01) {
          p0 = WechatForward.n0.c().k();
       }
       super(p0);
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
       d uod = d.class;
       OperationModel obj = PatchProxy.applyOneRefs(p0, this, uod, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "operator");
       obj = p0.i();
       t ot = PatchProxy.applyOneRefs(obj, this, uod, "6");
       if (ot != patchProxyRe) {
       }else {
          a.p(obj, "model");
          ot = s$a.b(this, obj);
       }
       t ot1 = ot.subscribeOn(d.c).observeOn(a.c()).flatMap(new d$a(this, obj, p0)).compose(u1.a(p0, this));
       a.o(ot1, "downloadCoverForMiniProg¡­nsformer\(operator, this\)\)");
       return ot1;
    }
    public int S0(){
       return 1;
    }
    public t U(OperationModel p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "6");
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
       Object obj = PatchProxy.apply(null, this, d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return 0x7f08105b;
    }
    public t h(OperationModel p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "model");
       return s$a.a(this, p0);
    }
    public int k(){
       return this.i;
    }
    public boolean m(){
       return this.h;
    }
    public t n0(OperationModel p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "model");
       return s$a.c(this, p0);
    }
    public Bitmap o0(OperationModel p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "model");
       return s$a.d(this, p0);
    }
    public Bitmap s(){
       Object obj = PatchProxy.apply(null, this, d.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return s$a.e(this);
    }
}
