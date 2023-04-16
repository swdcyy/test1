package com.kwai.link.extensions.PassThroughTransaction;
import com.kwai.link.TransactionBase;
import java.lang.String;
import java.lang.Object;
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import a37.m;
import java.lang.Runnable;
import com.kwai.link.JniCaller;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import a37.i;
import bv7.b;
import a37.k;
import a37.j;
import bv7.a;
import a37.l;

public class PassThroughTransaction extends TransactionBase	// class@000ae4
{
    public a mOnComplete;

    public void PassThroughTransaction(long p0){
       super(p0);
       this.mOnComplete = null;
    }
    private void lambda$addRequestMessage$0(long p0,String p1,long p2,byte[] p3,String p4,byte[] p5){
       this.addRequestMessage(this.mNativeContext, p0, p1, p2, p3, p4, p5);
    }
    private Object lambda$getDeliveredCount$1(){
       return Integer.valueOf(this.getDeliveredCount(this.mNativeContext));
    }
    private Object lambda$getResponseMessages$3(){
       return this.getResponseMessages(this.mNativeContext);
    }
    private Object lambda$getSuccessCount$2(){
       return Integer.valueOf(this.getSuccessCount(this.mNativeContext));
    }
    private void lambda$setOnComplete$4(){
       this.setOnComplete(this.mNativeContext);
    }
    public static void o(PassThroughTransaction p0,long p1,String p2,long p3,byte[] p4,String p5,byte[] p6){
       p0.lambda$addRequestMessage$0(p1, p2, p3, p4, p5, p6);
    }
    public static Object p(PassThroughTransaction p0){
       return p0.lambda$getDeliveredCount$1();
    }
    public static void q(PassThroughTransaction p0){
       p0.lambda$setOnComplete$4();
    }
    public static Object r(PassThroughTransaction p0){
       return p0.lambda$getSuccessCount$2();
    }
    public static Object s(PassThroughTransaction p0){
       return p0.lambda$getResponseMessages$3();
    }
    public native final void addRequestMessage(long p0,long p1,String p2,long p3,byte[] p4,String p5,byte[] p6);
    public void addRequestMessage(long p0,String p1,long p2,byte[] p3,String p4,byte[] p5){
       PassThroughTransaction passThroughT = PassThroughTransaction.class;
       if (PatchProxy.isSupport(passThroughT)) {
          Object[] objArray = new Object[]{Long.valueOf(p0),p1,Long.valueOf(p2),p3,p4,p5};
          if (PatchProxy.applyVoid(objArray, this, passThroughT, "1")) {
             return;
          }
       }else {
          int i = this;
       }
       m om = new m(this, p0, p1, p2, p3, p4, p5);
       JniCaller.voidCall(passThroughT);
       return;
    }
    public int getDeliveredCount(){
       Object obj = PatchProxy.apply(null, this, PassThroughTransaction.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return JniCaller.objectCall(new i(this)).intValue();
    }
    public native final int getDeliveredCount(long p0);
    public ArrayList getResponseMessages(){
       Object obj = PatchProxy.apply(null, this, PassThroughTransaction.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return JniCaller.objectCall(new k(this));
    }
    public native final ArrayList getResponseMessages(long p0);
    public int getSuccessCount(){
       Object obj = PatchProxy.apply(null, this, PassThroughTransaction.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return JniCaller.objectCall(new j(this)).intValue();
    }
    public native final int getSuccessCount(long p0);
    public final void onComplete(long p0){
       PassThroughTransaction passThroughT = PassThroughTransaction.class;
       if (PatchProxy.isSupport(passThroughT) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, passThroughT, "6")) {
          return;
       }
       if (this.mOnComplete != null) {
          passThroughT = new PassThroughTransaction(p0);
          this.mOnComplete.accept(passThroughT);
          passThroughT.mNativeContext = 0;
       }
       return;
    }
    public native final void setOnComplete(long p0);
    public void setOnComplete(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PassThroughTransaction.class, "5")) {
          return;
       }
       this.mOnComplete = p0;
       JniCaller.voidCall(new l(this));
       return;
    }
}
