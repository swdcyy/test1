package ajc.e;
import com.yxcorp.gifshow.share.platform.WechatForward;
import com.yxcorp.gifshow.share.util.PhotoForward;
import mhc.v;
import mhc.x;
import com.yxcorp.gifshow.share.platform.WechatForward$Companion;
import java.lang.String;
import nsd.u;
import com.yxcorp.gifshow.share.OperationModel;
import msd.p;
import brd.t;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.share.util.PhotoForward$DefaultImpls;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.yxcorp.gifshow.share.platform.b;
import com.yxcorp.gifshow.share.KwaiOperator;
import ajc.e$a;
import erd.o;
import brd.x;
import mhc.u1;
import android.graphics.Bitmap;
import com.kwai.feature.api.social.kwaitoken.model.ShareToken;
import com.yxcorp.gifshow.model.SharePlatformData$ShareConfig;

public final class e extends v implements WechatForward, PhotoForward	// class@000135
{
    public final boolean h;

    public void e(){
       super(WechatForward.n0.c(), 0, 0, null, null, false, 62, null);
       this.h = true;
    }
    public t F0(OperationModel p0,boolean p1,boolean p2,p p3){
       if (PatchProxy.isSupport(e.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, Boolean.valueOf(p1), Boolean.valueOf(p2), p3, this, e.class, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "model");
       a.p(p3, "bitmapHandler");
       return PhotoForward$DefaultImpls.e(this, p0, p1, p2, p3);
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
    public t O0(OperationModel p0,boolean p1,boolean p2,p p3){
       if (PatchProxy.isSupport(e.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, Boolean.valueOf(p1), Boolean.valueOf(p2), p3, this, e.class, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "model");
       a.p(p3, "bitmapHandler");
       return PhotoForward$DefaultImpls.f(this, p0, p1, p2, p3);
    }
    public t P0(KwaiOperator p0){
       OperationModel obj = PatchProxy.applyOneRefs(p0, this, e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "operator");
       obj = p0.i();
       t ot = this.c(obj).flatMap(new e$a(this, obj, p0)).compose(u1.b(p0, this));
       a.o(ot, "buildMiniProgramCover\(mo¡­nsformer\(operator, this\)\)");
       return ot;
    }
    public Bitmap S(OperationModel p0,Bitmap p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, e.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "model");
       a.p(p1, "bitmap");
       return PhotoForward$DefaultImpls.b(this, p0, p1);
    }
    public int S0(){
       return 1;
    }
    public t W(OperationModel p0,boolean p1,boolean p2,p p3){
       if (PatchProxy.isSupport(e.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, Boolean.valueOf(p1), Boolean.valueOf(p2), p3, this, e.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "model");
       a.p(p3, "bitmapHandler");
       return PhotoForward$DefaultImpls.c(this, p0, p1, p2, p3);
    }
    public WXMediaMessage X(OperationModel p0){
       return b.b(this, p0);
    }
    public WXMediaMessage a0(OperationModel p0){
       return b.g(this, p0);
    }
    public t c(OperationModel p0){
       a.p(p0, "model");
       return PhotoForward$DefaultImpls.a(this, p0);
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
    public boolean m(){
       return this.h;
    }
    public t q(OperationModel p0,p p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, e.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "model");
       a.p(p1, "bitmapHandler");
       return PhotoForward$DefaultImpls.i(this, p0, p1);
    }
    public Bitmap y(OperationModel p0){
       a.p(p0, "model");
       return PhotoForward$DefaultImpls.g(this, p0);
    }
}
