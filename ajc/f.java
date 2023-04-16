package ajc.f;
import com.yxcorp.gifshow.share.platform.WechatForward;
import yic.h0;
import mhc.v;
import mhc.x;
import com.yxcorp.gifshow.share.platform.WechatForward$Companion;
import java.lang.String;
import nsd.u;
import com.yxcorp.gifshow.share.OperationModel;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.yxcorp.gifshow.share.platform.b;
import com.kwai.framework.model.user.User;
import android.graphics.Bitmap;
import yic.g0;
import com.yxcorp.gifshow.share.KwaiOperator;
import brd.t;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import ajc.f$a;
import erd.o;
import brd.x;
import mhc.u1;
import com.kwai.feature.api.social.kwaitoken.model.ShareToken;
import com.yxcorp.gifshow.model.SharePlatformData$ShareConfig;

public final class f extends v implements WechatForward, h0	// class@000137
{
    public final boolean h;

    public void f(){
       super(WechatForward.n0.c(), 0, 0, null, null, false, 62, null);
       this.h = true;
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
    public Bitmap L0(User p0,boolean p1){
       return g0.c(this, p0, p1);
    }
    public WXMediaMessage N(OperationModel p0){
       return b.d(this, p0);
    }
    public Bitmap N0(){
       return g0.e(this);
    }
    public t O(String p0,String p1,KwaiOperator p2,String p3){
       return b.i(this, p0, p1, p2, p3);
    }
    public t P0(KwaiOperator p0){
       OperationModel obj = PatchProxy.applyOneRefs(p0, this, f.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "operator");
       obj = p0.i();
       t ot = this.c(obj).flatMap(new f$a(this, obj, p0)).compose(u1.a(p0, this));
       a.o(ot, "buildMiniProgramCover\(mo¡­nsformer\(operator, this\)\)");
       return ot;
    }
    public Bitmap R(User p0){
       return g0.d(this, p0);
    }
    public int S0(){
       return 1;
    }
    public WXMediaMessage X(OperationModel p0){
       return b.b(this, p0);
    }
    public WXMediaMessage a0(OperationModel p0){
       return b.g(this, p0);
    }
    public t c(OperationModel p0){
       return g0.a(this, p0);
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
    public t h(OperationModel p0){
       return g0.b(this, p0);
    }
    public boolean m(){
       return this.h;
    }
    public Bitmap u(User p0){
       return g0.f(this, p0);
    }
}
