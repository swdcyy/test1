package com.yxcorp.gifshow.share.wechat.a;
import yic.h0;
import com.yxcorp.gifshow.share.platform.WechatForward;
import mhc.v;
import mhc.x;
import com.yxcorp.gifshow.share.platform.WechatForward$Companion;
import com.yxcorp.gifshow.share.OperationModel;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.yxcorp.gifshow.share.platform.b;
import com.kwai.framework.model.user.User;
import android.graphics.Bitmap;
import yic.g0;
import java.lang.String;
import com.yxcorp.gifshow.share.KwaiOperator;
import brd.t;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.z;
import lrd.b;
import io.reactivex.android.schedulers.a;
import ajc.k;
import erd.o;
import brd.x;
import mhc.u1;
import com.kwai.feature.api.social.kwaitoken.model.ShareToken;
import com.yxcorp.gifshow.model.SharePlatformData$ShareConfig;

public class a extends v implements h0, WechatForward	// class@001ca5
{
    public boolean h;

    public void a(boolean p0){
       super(WechatForward.n0.a(p0));
       this.h = p0;
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
       OperationModel obj = PatchProxy.applyOneRefs(p0, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.i();
       return this.h(obj).subscribeOn(b.c()).observeOn(a.c()).flatMap(new k(this, obj, p0)).compose(u1.a(p0, this));
    }
    public Bitmap R(User p0){
       return g0.d(this, p0);
    }
    public int S0(){
       return 4;
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
