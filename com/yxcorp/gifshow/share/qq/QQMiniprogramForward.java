package com.yxcorp.gifshow.share.qq.QQMiniprogramForward;
import com.yxcorp.gifshow.share.platform.QQForward;
import com.yxcorp.gifshow.share.util.PhotoForward;
import mhc.v;
import mhc.x;
import msd.p;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.share.platform.QQForward$Companion;
import com.yxcorp.gifshow.share.qq.QQMiniprogramForward$1;
import com.yxcorp.gifshow.share.OperationModel;
import brd.t;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.share.util.PhotoForward$DefaultImpls;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.share.platform.a;
import com.yxcorp.gifshow.share.KwaiOperator;
import android.graphics.Bitmap;
import com.yxcorp.gifshow.model.SharePlatformData$ShareConfig;
import yic.n0;

public class QQMiniprogramForward extends v implements QQForward, PhotoForward	// class@001c45
{
    public final boolean h;
    public final x i;
    public final int j;
    public final p k;

    public void QQMiniprogramForward(boolean p0){
       super(p0, null, 0, null, 14, null);
    }
    public void QQMiniprogramForward(boolean p0,x p1,int p2,p p3){
       a.p(p1, "forward");
       a.p(p3, "forwardTransformer");
       super(p1, 0, 0, null, null, false, 62, null);
       this.h = p0;
       this.i = p1;
       this.j = p2;
       this.k = p3;
    }
    public void QQMiniprogramForward(boolean p0,x p1,int p2,p p3,int p4,u p5){
       if (p4 & 0x02) {
          p1 = QQForward.m0.a(p0);
       }
       if (p4 & 0x04) {
          p2 = p1.k();
       }
       QQMiniprogramForward$1 iNSTANCE = (p4 & 0x08)? QQMiniprogramForward$1.INSTANCE: null;
       super(p0, p1, p2, iNSTANCE);
       return;
    }
    public t F0(OperationModel p0,boolean p1,boolean p2,p p3){
       if (PatchProxy.isSupport(QQMiniprogramForward.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, Boolean.valueOf(p1), Boolean.valueOf(p2), p3, this, QQMiniprogramForward.class, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "model");
       a.p(p3, "bitmapHandler");
       return PhotoForward$DefaultImpls.e(this, p0, p1, p2, p3);
    }
    public t G0(OperationModel p0,GifshowActivity p1){
       return a.e(this, p0, p1);
    }
    public void J(OperationModel p0){
       a.f(this, p0);
    }
    public t O0(OperationModel p0,boolean p1,boolean p2,p p3){
       if (PatchProxy.isSupport(QQMiniprogramForward.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, Boolean.valueOf(p1), Boolean.valueOf(p2), p3, this, QQMiniprogramForward.class, "7");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "model");
       a.p(p3, "bitmapHandler");
       return PhotoForward$DefaultImpls.f(this, p0, p1, p2, p3);
    }
    public t P0(KwaiOperator p0){
       String obj = PatchProxy.applyOneRefs(p0, this, QQMiniprogramForward.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "operator");
       obj = this.T0(p0.i());
       if (obj == null) {
          obj = "http://empty.com/null.jpg";
       }
       return this.g0(p0, obj);
    }
    public Bitmap S(OperationModel p0,Bitmap p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, QQMiniprogramForward.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "model");
       a.p(p1, "bitmap");
       return PhotoForward$DefaultImpls.b(this, p0, p1);
    }
    public int S0(){
       return 1;
    }
    public String T0(OperationModel p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, QQMiniprogramForward.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "model");
       return n0.f(this.a(p0));
    }
    public t W(OperationModel p0,boolean p1,boolean p2,p p3){
       if (PatchProxy.isSupport(QQMiniprogramForward.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, Boolean.valueOf(p1), Boolean.valueOf(p2), p3, this, QQMiniprogramForward.class, "4");
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
    public t q(OperationModel p0,p p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, QQMiniprogramForward.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "model");
       a.p(p1, "bitmapHandler");
       return PhotoForward$DefaultImpls.i(this, p0, p1);
    }
    public t x(KwaiOperator p0){
       return a.b(this, p0);
    }
    public Bitmap y(OperationModel p0){
       a.p(p0, "model");
       return PhotoForward$DefaultImpls.g(this, p0);
    }
}
