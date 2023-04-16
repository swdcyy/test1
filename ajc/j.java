package ajc.j;
import com.yxcorp.gifshow.share.platform.WechatForward;
import yic.s;
import mhc.v;
import mhc.x;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import nsd.u;
import com.yxcorp.gifshow.share.OperationModel;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.yxcorp.gifshow.share.platform.b;
import com.yxcorp.gifshow.share.KwaiOperator;
import brd.t;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import t45.d;
import brd.z;
import io.reactivex.android.schedulers.a;
import ajc.j$a;
import erd.o;
import brd.x;
import mhc.u1;
import yic.s$a;
import yic.r;
import com.kwai.feature.api.social.kwaitoken.model.ShareToken;
import com.yxcorp.gifshow.model.SharePlatformData$ShareConfig;
import java.lang.Number;
import android.graphics.Bitmap;

public class j extends v implements WechatForward, s	// class@00013e
{
    public final boolean h;
    public final x i;
    public final int j;

    public void j(boolean p0,x p1,int p2){
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
       OperationModel obj = PatchProxy.applyOneRefs(p0, this, j.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "operator");
       obj = p0.i();
       t ot = this.h(obj).subscribeOn(d.c).observeOn(a.c()).flatMap(new j$a(this, obj, p0)).compose(u1.a(p0, this));
       a.o(ot, "downloadCover\(model\).sub¡­nsformer\(operator, this\)\)");
       return ot;
    }
    public int S0(){
       return 4;
    }
    public t U(OperationModel p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, j.class, "6");
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
       Object obj = PatchProxy.apply(null, this, j.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return 0x7f08105b;
    }
    public x getForward(){
       return this.i;
    }
    public t h(OperationModel p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, j.class, "4");
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
       Object obj = PatchProxy.applyOneRefs(p0, this, j.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "model");
       return s$a.c(this, p0);
    }
    public Bitmap o0(OperationModel p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, j.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "model");
       return s$a.d(this, p0);
    }
    public Bitmap s(){
       Object obj = PatchProxy.apply(null, this, j.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return s$a.e(this);
    }
}
