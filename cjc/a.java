package cjc.a;
import pic.h;
import yic.s;
import mhc.v;
import mhc.x;
import msd.p;
import nsd.u;
import pic.h$a;
import com.yxcorp.gifshow.share.weibo.WeiboImageForward$1;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.share.KwaiOperator;
import brd.t;
import pic.g;
import com.sina.weibo.sdk.api.WebpageObject;
import com.sina.weibo.sdk.api.TextObject;
import com.sina.weibo.sdk.api.ImageObject;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.share.OperationModel;
import yic.s$a;
import cjc.a$a;
import erd.o;
import brd.z;
import io.reactivex.android.schedulers.a;
import brd.x;
import yic.r;
import java.lang.Number;
import java.io.File;
import android.graphics.Bitmap;

public final class a extends v implements h, s	// class@0005b4
{
    public final x h;
    public final int i;
    public final p j;

    public void a(){
       super(null, 0, null, 7, null);
    }
    public void a(x p0,int p1,p p2,int p3,u p4){
       WeiboImageForward$1 iNSTANCE;
       p0 = (p3 & 0x01)? h.B0.a(): null;
       if (p3 & 0x02) {
          p1 = p0.k();
       }
       if (p3 & 0x04) {
          iNSTANCE = WeiboImageForward$1.INSTANCE;
       }
       a.p(p0, "forward");
       a.p(iNSTANCE, "shareResultConsumer");
       super(p0, 0, 0, null, null, false, 62, null);
       this.h = p0;
       this.i = p1;
       this.j = iNSTANCE;
       return;
    }
    public t B0(KwaiOperator p0){
       return g.g(this, p0);
    }
    public t H(WebpageObject p0,TextObject p1,ImageObject p2,KwaiOperator p3){
       return g.e(this, p0, p1, p2, p3);
    }
    public t P0(KwaiOperator p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       OperationModel obj = PatchProxy.applyOneRefs(p0, this, uoa, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "operator");
       obj = p0.i();
       t ot = PatchProxy.applyOneRefs(obj, this, uoa, "3");
       if (ot != patchProxyRe) {
       }else {
          a.p(obj, "model");
          ot = s$a.c(this, obj);
       }
       t ot1 = ot.flatMap(new a$a(this, p0)).observeOn(a.c()).compose(this.j.invoke(p0, this));
       a.o(ot1, "downloadCoverIfNeeded\(mo¡­Consumer\(operator, this\)\)");
       return ot1;
    }
    public int S0(){
       return 4;
    }
    public t U(OperationModel p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "model");
       return s$a.b(this, p0);
    }
    public t c(OperationModel p0){
       return r.a(this, p0);
    }
    public int f(){
       Object obj = PatchProxy.apply(null, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return 0x7f08105b;
    }
    public x getForward(){
       return this.h;
    }
    public t h(OperationModel p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "model");
       return s$a.a(this, p0);
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
    public t n0(OperationModel p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "model");
       return s$a.c(this, p0);
    }
    public Bitmap o0(OperationModel p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "model");
       return s$a.d(this, p0);
    }
    public TextObject r(String p0){
       return g.a(this, p0);
    }
    public Bitmap s(){
       Object obj = PatchProxy.apply(null, this, a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return s$a.e(this);
    }
    public t w(KwaiOperator p0){
       return g.c(this, p0);
    }
}
