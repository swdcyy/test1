package cjc.g;
import pic.h;
import com.yxcorp.gifshow.share.util.PhotoForward;
import mhc.v;
import mhc.x;
import msd.p;
import nsd.u;
import pic.h$a;
import com.yxcorp.gifshow.share.weibo.WeiboTextLinkForward$1;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.share.KwaiOperator;
import brd.t;
import pic.g;
import com.yxcorp.gifshow.share.OperationModel;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.share.util.PhotoForward$DefaultImpls;
import com.sina.weibo.sdk.api.WebpageObject;
import com.sina.weibo.sdk.api.TextObject;
import com.sina.weibo.sdk.api.ImageObject;
import brd.x;
import android.graphics.Bitmap;
import java.io.File;

public final class g extends v implements h, PhotoForward	// class@0005bc
{
    public final x h;
    public final int i;
    public final p j;

    public void g(){
       super(null, 0, null, 7, null);
    }
    public void g(x p0,int p1,p p2,int p3,u p4){
       WeiboTextLinkForward$1 iNSTANCE;
       p0 = (p3 & 0x01)? h.B0.a(): null;
       if (p3 & 0x02) {
          p1 = p0.k();
       }
       if (p3 & 0x04) {
          iNSTANCE = WeiboTextLinkForward$1.INSTANCE;
       }
       a.p(p0, "forward");
       a.p(iNSTANCE, "forwardTransformer");
       super(p0, 0, 0, null, null, false, 62, null);
       this.h = p0;
       this.i = p1;
       this.j = iNSTANCE;
       return;
    }
    public t B0(KwaiOperator p0){
       return g.g(this, p0);
    }
    public t F0(OperationModel p0,boolean p1,boolean p2,p p3){
       if (PatchProxy.isSupport(g.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, Boolean.valueOf(p1), Boolean.valueOf(p2), p3, this, g.class, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "model");
       a.p(p3, "bitmapHandler");
       return PhotoForward$DefaultImpls.e(this, p0, p1, p2, p3);
    }
    public t H(WebpageObject p0,TextObject p1,ImageObject p2,KwaiOperator p3){
       return g.e(this, p0, p1, p2, p3);
    }
    public t O0(OperationModel p0,boolean p1,boolean p2,p p3){
       if (PatchProxy.isSupport(g.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, Boolean.valueOf(p1), Boolean.valueOf(p2), p3, this, g.class, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "model");
       a.p(p3, "bitmapHandler");
       return PhotoForward$DefaultImpls.f(this, p0, p1, p2, p3);
    }
    public t P0(KwaiOperator p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, g.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "operator");
       t ot = this.l(p0).compose(this.j.invoke(p0, this));
       a.o(ot, "shareText\(operator\).comp¡­nsformer\(operator, this\)\)");
       return ot;
    }
    public Bitmap S(OperationModel p0,Bitmap p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, g.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "model");
       a.p(p1, "bitmap");
       return PhotoForward$DefaultImpls.b(this, p0, p1);
    }
    public int S0(){
       return 3;
    }
    public t W(OperationModel p0,boolean p1,boolean p2,p p3){
       if (PatchProxy.isSupport(g.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, Boolean.valueOf(p1), Boolean.valueOf(p2), p3, this, g.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "model");
       a.p(p3, "bitmapHandler");
       return PhotoForward$DefaultImpls.c(this, p0, p1, p2, p3);
    }
    public t c(OperationModel p0){
       a.p(p0, "model");
       return PhotoForward$DefaultImpls.a(this, p0);
    }
    public x getForward(){
       return this.h;
    }
    public t i(KwaiOperator p0){
       return g.d(this, p0);
    }
    public WebpageObject i0(String p0,String p1,String p2,File p3){
       return g.b(this, p0, p1, p2, p3);
    }
    public int k(){
       return this.i;
    }
    public t l(KwaiOperator p0){
       return g.f(this, p0);
    }
    public t q(OperationModel p0,p p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, g.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "model");
       a.p(p1, "bitmapHandler");
       return PhotoForward$DefaultImpls.i(this, p0, p1);
    }
    public TextObject r(String p0){
       return g.a(this, p0);
    }
    public t w(KwaiOperator p0){
       return g.c(this, p0);
    }
    public Bitmap y(OperationModel p0){
       a.p(p0, "model");
       return PhotoForward$DefaultImpls.g(this, p0);
    }
}
