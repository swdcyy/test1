package cjc.b;
import pic.h;
import yic.s;
import mhc.v;
import mhc.x;
import nsd.u;
import pic.h$a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.share.KwaiOperator;
import brd.t;
import pic.g;
import com.sina.weibo.sdk.api.WebpageObject;
import com.sina.weibo.sdk.api.TextObject;
import com.sina.weibo.sdk.api.ImageObject;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.share.OperationModel;
import t45.d;
import brd.z;
import cjc.b$a;
import erd.o;
import io.reactivex.android.schedulers.a;
import brd.x;
import mhc.u1;
import yic.s$a;
import yic.r;
import java.lang.Number;
import java.io.File;
import android.graphics.Bitmap;

public class b extends v implements h, s	// class@0005b6
{
    public final x h;
    public final int i;

    public void b(){
       super(null, 0, 3, null);
    }
    public void b(x p0,int p1,int p2,u p3){
       p0 = (p2 & 0x01)? h.B0.a(): null;
       if (p2 & 0x02) {
          p1 = p0.k();
       }
       a.p(p0, "forward");
       super(p0, 0, 0, null, null, false, 62, null);
       this.h = p0;
       this.i = p1;
       return;
    }
    public t B0(KwaiOperator p0){
       return g.g(this, p0);
    }
    public t H(WebpageObject p0,TextObject p1,ImageObject p2,KwaiOperator p3){
       return g.e(this, p0, p1, p2, p3);
    }
    public t P0(KwaiOperator p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "operator");
       t ot = this.h(p0.i()).subscribeOn(d.c).flatMap(new b$a(this, p0)).observeOn(a.c()).compose(u1.a(p0, this));
       a.o(ot, "downloadCover\(operator.m¡­nsformer\(operator, this\)\)");
       return ot;
    }
    public int S0(){
       return 4;
    }
    public t U(OperationModel p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "6");
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
       Object obj = PatchProxy.apply(null, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return 0x7f08105b;
    }
    public x getForward(){
       return this.h;
    }
    public t h(OperationModel p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "4");
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
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "model");
       return s$a.c(this, p0);
    }
    public Bitmap o0(OperationModel p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "5");
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
       Object obj = PatchProxy.apply(null, this, b.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return s$a.e(this);
    }
    public t w(KwaiOperator p0){
       return g.c(this, p0);
    }
}
