package com.yxcorp.gifshow.share.im.c;
import pic.d;
import mhc.v;
import com.yxcorp.gifshow.share.im.c$a;
import nsd.u;
import gic.a;
import com.kwai.feature.api.social.message.imshare.model.ShareIMInfo;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import mhc.x;
import com.yxcorp.gifshow.share.OperationFactoryAdapter;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.util.Objects;
import rhc.e;
import com.yxcorp.gifshow.share.im.IMUniversalForward$Companion$toFactory$1;
import msd.l;
import com.yxcorp.gifshow.share.KwaiOperator;
import brd.t;
import brd.z;
import io.reactivex.android.schedulers.a;
import brd.x;
import mhc.u1;
import pic.c;

public final class c extends v implements d	// class@001bc0
{
    public final a h;
    public final int i;
    public static final c$a j;

    static {
       c.j = new c$a(null);
    }
    public void c(int p0){
       super(new a(null, 1, null), p0);
    }
    public void c(a p0,int p1){
       a.p(p0, "imforward");
       super(p0, 0, 0, null, null, false, 62, null);
       this.h = p0;
       this.i = p1;
    }
    public static final OperationFactoryAdapter T0(int p0){
       c$a obj;
       e uoe;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, uoc, "3");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       obj = c.j;
       Objects.requireNonNull(obj);
       if (PatchProxy.isSupport(c$a.class)) {
          uoe = PatchProxy.applyOneRefs(Integer.valueOf(p0), obj, c$a.class, "1");
          if (uoe != patchProxyRe) {
          label_0040 :
             return uoe;
          }
       }
       uoe = new e(new IMUniversalForward$Companion$toFactory$1(p0));
       goto label_0040 ;
    }
    public a M0(){
       return this.h;
    }
    public t P0(KwaiOperator p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "operator");
       t ot = this.j(this.i, p0).subscribeOn(a.c()).observeOn(a.c()).compose(u1.a(p0, this));
       a.o(ot, "shareMessage\(action, ope¡­nsformer\(operator, this\)\)");
       return ot;
    }
    public int S0(){
       return 7;
    }
    public x getPlatform(){
       Object obj = PatchProxy.apply(null, this, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.M0();
    }
    public t j(int p0,KwaiOperator p1){
       return c.a(this, p0, p1);
    }
    public t z(int p0,KwaiOperator p1){
       return c.b(this, p0, p1);
    }
}
