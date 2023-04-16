package com.yxcorp.gifshow.share.im.a;
import pic.d;
import mhc.v;
import com.yxcorp.gifshow.share.im.a$a;
import nsd.u;
import gic.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import mhc.x;
import com.kwai.feature.api.social.message.imshare.model.ShareIMInfo;
import com.yxcorp.gifshow.share.OperationFactoryAdapter;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import rhc.e;
import com.yxcorp.gifshow.share.im.IMPhotoForward$Companion$toFactory$1;
import msd.l;
import com.yxcorp.gifshow.share.KwaiOperator;
import brd.t;
import com.yxcorp.gifshow.share.OperationModel;
import com.yxcorp.gifshow.entity.IMShareData;
import brd.z;
import io.reactivex.android.schedulers.a;
import brd.x;
import mhc.u1;
import pic.c;

public final class a extends v implements d	// class@001bbd
{
    public final a h;
    public static final a$a i;

    static {
       a.i = new a$a(null);
    }
    public void a(){
       super(null, 1, null);
    }
    public void a(a p0){
       a.p(p0, "imforward");
       super(p0, 0, 0, null, null, false, 62, null);
       this.h = p0;
    }
    public void a(a p0,int p1,u p2){
       ShareIMInfo shareIMInfo = null;
       if (p1 & 1) {
          shareIMInfo = new a(shareIMInfo, 1, shareIMInfo);
       }
       super(shareIMInfo);
       return;
    }
    public static final OperationFactoryAdapter T0(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a$a obj = PatchProxy.apply(null, null, a.class, "3");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = a.i;
       Objects.requireNonNull(obj);
       e uoe = PatchProxy.apply(null, obj, a$a.class, "1");
       if (uoe != patchProxyRe) {
       }else {
          uoe = new e(IMPhotoForward$Companion$toFactory$1.INSTANCE);
       }
       return uoe;
    }
    public a M0(){
       return this.h;
    }
    public t P0(KwaiOperator p0){
       IMShareData obj = PatchProxy.applyOneRefs(p0, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "operator");
       obj = p0.i().g(this.M0());
       int i = 2;
       obj = (obj != null)? obj.mPlatformData2InfoType: 2;
       if (obj != null) {
          i = obj;
       }
       t ot = this.j(i, p0).subscribeOn(a.c()).observeOn(a.c()).compose(u1.a(p0, this));
       a.o(ot, "shareMessage\(actionType,¡­nsformer\(operator, this\)\)");
       return ot;
    }
    public int S0(){
       return 7;
    }
    public x getPlatform(){
       Object obj = PatchProxy.apply(null, this, a.class, "2");
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
