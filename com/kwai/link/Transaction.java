package com.kwai.link.Transaction;
import com.kwai.link.TransactionBase;
import java.lang.Object;
import java.lang.Long;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import z27.k0;
import bv7.b;
import com.kwai.link.JniCaller;
import z27.l0;
import z27.m0;
import z27.n0;
import bv7.a;
import z27.o0;
import java.lang.Runnable;
import z27.p0;

public class Transaction extends TransactionBase	// class@000d17
{
    public a mOnComplete;

    public void Transaction(long p0){
       super(p0);
    }
    private Object lambda$getPushId$1(){
       return Long.valueOf(this.getPushId(this.mNativeContext));
    }
    private Object lambda$getResponseData$4(){
       return this.getResponseData(this.mNativeContext);
    }
    private Object lambda$isPush$0(){
       return Boolean.valueOf(this.isPush(this.mNativeContext));
    }
    private Object lambda$isPushStatSampled$2(){
       return Boolean.valueOf(this.isPushStatSampled(this.mNativeContext));
    }
    private void lambda$setOnComplete$5(){
       this.setOnComplete(this.mNativeContext);
    }
    private void lambda$setRequestData$3(byte[] p0){
       this.setRequestData(this.mNativeContext, p0);
    }
    public static Object o(Transaction p0){
       return p0.lambda$getPushId$1();
    }
    public static Object p(Transaction p0){
       return p0.lambda$getResponseData$4();
    }
    public static void q(Transaction p0){
       p0.lambda$setOnComplete$5();
    }
    public static Object r(Transaction p0){
       return p0.lambda$isPush$0();
    }
    public static Object s(Transaction p0){
       return p0.lambda$isPushStatSampled$2();
    }
    public static void t(Transaction p0,byte[] p1){
       p0.lambda$setRequestData$3(p1);
    }
    public long getPushId(){
       Object obj = PatchProxy.apply(null, this, Transaction.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return JniCaller.objectCall(new k0(this)).longValue();
    }
    public native final long getPushId(long p0);
    public byte[] getResponseData(){
       Object obj = PatchProxy.apply(null, this, Transaction.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return JniCaller.objectCall(new l0(this));
    }
    public native final byte[] getResponseData(long p0);
    public boolean isPush(){
       Object obj = PatchProxy.apply(null, this, Transaction.class, "1");
       if (obj == PatchProxyResult.class) {
          obj = JniCaller.objectCall(new m0(this));
       }
       return obj.booleanValue();
    }
    public native final boolean isPush(long p0);
    public boolean isPushStatSampled(){
       Object obj = PatchProxy.apply(null, this, Transaction.class, "3");
       if (obj == PatchProxyResult.class) {
          obj = JniCaller.objectCall(new n0(this));
       }
       return obj.booleanValue();
    }
    public native final boolean isPushStatSampled(long p0);
    public final void onComplete(long p0){
       Transaction transaction = Transaction.class;
       if (PatchProxy.isSupport(transaction) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, transaction, "7")) {
          return;
       }
       if (this.mOnComplete != null) {
          transaction = new Transaction(p0);
          this.mOnComplete.accept(transaction);
          transaction.mNativeContext = 0;
       }
       return;
    }
    public native final void setOnComplete(long p0);
    public void setOnComplete(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Transaction.class, "6")) {
          return;
       }
       this.mOnComplete = p0;
       JniCaller.voidCall(new o0(this));
       return;
    }
    public native final void setRequestData(long p0,byte[] p1);
    public void setRequestData(byte[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Transaction.class, "4")) {
          return;
       }
       JniCaller.voidCall(new p0(this, p0));
       return;
    }
}
