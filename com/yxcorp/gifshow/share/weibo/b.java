package com.yxcorp.gifshow.share.weibo.b;
import pic.h;
import yic.h0;
import mhc.v;
import mhc.x;
import pic.h$a;
import com.yxcorp.gifshow.share.KwaiOperator;
import brd.t;
import pic.g;
import com.sina.weibo.sdk.api.WebpageObject;
import com.sina.weibo.sdk.api.TextObject;
import com.sina.weibo.sdk.api.ImageObject;
import com.kwai.framework.model.user.User;
import android.graphics.Bitmap;
import yic.g0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.share.OperationModel;
import cjc.f;
import erd.o;
import brd.x;
import mhc.u1;
import java.io.File;

public class b extends v implements h, h0	// class@001cad
{

    public void b(){
       super(h.B0.a());
    }
    public t B0(KwaiOperator p0){
       return g.g(this, p0);
    }
    public t H(WebpageObject p0,TextObject p1,ImageObject p2,KwaiOperator p3){
       return g.e(this, p0, p1, p2, p3);
    }
    public Bitmap L0(User p0,boolean p1){
       return g0.c(this, p0, p1);
    }
    public Bitmap N0(){
       return g0.e(this);
    }
    public t P0(KwaiOperator p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.h(p0.i()).flatMap(new f(this, p0)).compose(u1.a(p0, this));
    }
    public Bitmap R(User p0){
       return g0.d(this, p0);
    }
    public int S0(){
       return 4;
    }
    public t c(OperationModel p0){
       return g0.a(this, p0);
    }
    public t h(OperationModel p0){
       return g0.b(this, p0);
    }
    public t i(KwaiOperator p0){
       return g.d(this, p0);
    }
    public WebpageObject i0(String p0,String p1,String p2,File p3){
       return g.b(this, p0, p1, p2, p3);
    }
    public t l(KwaiOperator p0){
       return g.f(this, p0);
    }
    public TextObject r(String p0){
       return g.a(this, p0);
    }
    public Bitmap u(User p0){
       return g0.f(this, p0);
    }
    public t w(KwaiOperator p0){
       return g.c(this, p0);
    }
}
