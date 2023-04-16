package com.yxcorp.gifshow.share.qq.QQPictureForward;
import com.yxcorp.gifshow.share.platform.QQForward;
import yic.x;
import mhc.v;
import mhc.x;
import com.yxcorp.gifshow.share.qq.QQPictureForward$1;
import msd.p;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import nsd.u;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.yxcorp.gifshow.share.KwaiOperator;
import android.graphics.Bitmap;
import com.yxcorp.gifshow.share.OperationModel;
import brd.t;
import java.lang.Integer;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.share.platform.a;
import android.view.View;
import android.app.Activity;
import com.kwai.framework.ui.popupmanager.dialog.a;
import com.yxcorp.gifshow.share.qq.QQPictureForward$a;
import erd.o;
import brd.x;
import com.yxcorp.gifshow.model.SharePlatformData$ShareConfig;
import java.lang.Boolean;
import android.graphics.Bitmap$Config;

public final class QQPictureForward extends v implements QQForward, x	// class@001c48
{
    public final boolean h;
    public final x i;
    public final int j;
    public final p k;
    public final x l;

    public void QQPictureForward(boolean p0,x p1,int p2,x p3){
       super(p0, p1, p2, p3, QQPictureForward$1.INSTANCE);
    }
    public void QQPictureForward(boolean p0,x p1,int p2,x p3,p p4){
       a.p(p1, "forward");
       a.p(p3, "pictureDelegate");
       a.p(p4, "forwardTransformer");
       super(p1, 0, 0, null, null, false, 62, null);
       this.l = p3;
       this.h = p0;
       this.i = p1;
       this.j = p2;
       this.k = p4;
    }
    public int A(){
       Object obj = PatchProxy.apply(null, this, QQPictureForward.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.l.A();
    }
    public void A0(String p0,KwaiOperator p1,Bitmap p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, QQPictureForward.class, "5")) {
          return;
       }
       a.p(p0, "fileName");
       a.p(p1, "operator");
       a.p(p2, "bmp");
       this.l.A0(p0, p1, p2);
       return;
    }
    public Bitmap D(OperationModel p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, QQPictureForward.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "model");
       return this.l.D(p0);
    }
    public t D0(String p0,String p1,int p2){
       if (PatchProxy.isSupport(QQPictureForward.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), this, QQPictureForward.class, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p1, "defaultShareUrl");
       return this.l.D0(p0, p1, p2);
    }
    public t G0(OperationModel p0,GifshowActivity p1){
       return a.e(this, p0, p1);
    }
    public void J(OperationModel p0){
       a.f(this, p0);
    }
    public Bitmap L(OperationModel p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, QQPictureForward.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "model");
       return this.l.L(p0);
    }
    public Bitmap P(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, QQPictureForward.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "view");
       return this.l.P(p0);
    }
    public t P0(KwaiOperator p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, QQPictureForward.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "operator");
       String[] stringArray = new String[]{"android.permission.WRITE_EXTERNAL_STORAGE","android.permission.READ_EXTERNAL_STORAGE"};
       t ot = a.k(p0.c(), stringArray).flatMap(new QQPictureForward$a(this, p0)).compose(this.k.invoke(p0, this));
       a.o(ot, "PermissionDlgUtils.reque¡­nsformer\(operator, this\)\)");
       return ot;
    }
    public int S0(){
       return 6;
    }
    public void Z(View p0,KwaiOperator p1,Bitmap p2,int p3,int p4){
       QQPictureForward qQPictureFor = QQPictureForward.class;
       if (PatchProxy.isSupport(qQPictureFor)) {
          Object[] objArray = new Object[]{p0,p1,p2,Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, qQPictureFor, "15")) {
             return;
          }
       }
       a.p(p0, "view");
       a.p(p1, "operator");
       a.p(p2, "bmp");
       this.l.Z(p0, p1, p2, p3, p4);
       return;
    }
    public int b(){
       Object obj = PatchProxy.apply(null, this, QQPictureForward.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.l.b();
    }
    public int f(){
       Object obj = PatchProxy.apply(null, this, QQPictureForward.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.l.f();
    }
    public t g0(KwaiOperator p0,String p1){
       return a.c(this, p0, p1);
    }
    public x getForward(){
       return this.i;
    }
    public t i(KwaiOperator p0){
       return a.a(this, p0);
    }
    public int k(){
       return this.j;
    }
    public t l(KwaiOperator p0){
       return a.d(this, p0);
    }
    public boolean m(){
       return this.h;
    }
    public int q0(){
       Object obj = PatchProxy.apply(null, this, QQPictureForward.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.l.q0();
    }
    public Bitmap r0(GifshowActivity p0,OperationModel p1,Bitmap p2){
       Object obj = PatchProxy.applyThreeRefsWithListener(p0, p1, p2, this, QQPictureForward.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "a");
       a.p(p1, "model");
       a.p(p2, "qrBmp");
       PatchProxy.onMethodExit(QQPictureForward.class, "9");
       return this.l.r0(p0, p1, p2);
    }
    public SharePlatformData$ShareConfig s0(OperationModel p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, QQPictureForward.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "model");
       return this.l.s0(p0);
    }
    public Bitmap u0(OperationModel p0,boolean p1){
       QQPictureForward qQPictureFor = QQPictureForward.class;
       if (PatchProxy.isSupport(qQPictureFor)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, qQPictureFor, "7");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "model");
       return this.l.u0(p0, p1);
    }
    public t x(KwaiOperator p0){
       return a.b(this, p0);
    }
    public void x0(String p0,KwaiOperator p1,Bitmap p2,int p3,int p4,Bitmap$Config p5,int p6){
       QQPictureForward qQPictureFor = this;
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p2;
       object oobject3 = p5;
       QQPictureForward qQPictureFor1 = QQPictureForward.class;
       if (PatchProxy.isSupport(qQPictureFor1)) {
          Object[] objArray = new Object[]{oobject,oobject1,oobject2,Integer.valueOf(p3),Integer.valueOf(p4),oobject3,Integer.valueOf(p6)};
          if (PatchProxy.applyVoid(objArray, this, qQPictureFor1, "6")) {
             return;
          }
       }
       a.p(p0, "fileName");
       a.p(p1, "operator");
       a.p(p2, "bmp");
       a.p(p5, "bitmapConfig");
       qQPictureFor.l.x0(p0, p1, p2, p3, p4, p5, p6);
       return;
    }
}
