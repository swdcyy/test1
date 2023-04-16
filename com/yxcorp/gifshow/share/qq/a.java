package com.yxcorp.gifshow.share.qq.a;
import yic.h0;
import com.yxcorp.gifshow.share.platform.QQForward;
import mhc.v;
import mhc.x;
import com.yxcorp.gifshow.share.platform.QQForward$Companion;
import com.yxcorp.gifshow.share.OperationModel;
import com.yxcorp.gifshow.activity.GifshowActivity;
import brd.t;
import com.yxcorp.gifshow.share.platform.a;
import com.kwai.framework.model.user.User;
import android.graphics.Bitmap;
import yic.g0;
import com.yxcorp.gifshow.share.KwaiOperator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.z;
import lrd.b;
import io.reactivex.android.schedulers.a;
import tic.h;
import erd.o;
import brd.x;
import mhc.u1;

public class a extends v implements h0, QQForward	// class@001c49
{
    public boolean h;

    public void a(boolean p0){
       super(QQForward.m0.a(p0));
       this.h = p0;
    }
    public t G0(OperationModel p0,GifshowActivity p1){
       return a.e(this, p0, p1);
    }
    public void J(OperationModel p0){
       a.f(this, p0);
    }
    public Bitmap L0(User p0,boolean p1){
       return g0.c(this, p0, p1);
    }
    public Bitmap N0(){
       return g0.e(this);
    }
    public t P0(KwaiOperator p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.h(p0.i()).subscribeOn(b.c()).observeOn(a.c()).flatMap(new h(this, p0)).compose(u1.a(p0, this));
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
    public t g0(KwaiOperator p0,String p1){
       return a.c(this, p0, p1);
    }
    public t h(OperationModel p0){
       return g0.b(this, p0);
    }
    public t i(KwaiOperator p0){
       return a.a(this, p0);
    }
    public t l(KwaiOperator p0){
       return a.d(this, p0);
    }
    public boolean m(){
       return this.h;
    }
    public Bitmap u(User p0){
       return g0.f(this, p0);
    }
    public t x(KwaiOperator p0){
       return a.b(this, p0);
    }
}
