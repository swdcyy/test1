package com.kwai.link.TransactionBase;
import java.lang.Object;
import java.lang.String;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import z27.y0;
import bv7.b;
import com.kwai.link.JniCaller;
import java.lang.Number;
import z27.v0;
import z27.q0;
import z27.x0;
import z27.b1;
import z27.w0;
import z27.z0;
import z27.a1;
import z27.d1;
import java.lang.Runnable;
import z27.c1;
import z27.u0;
import z27.t0;
import z27.r0;
import z27.s0;

public class TransactionBase	// class@000adf
{
    public long mNativeContext;

    public void TransactionBase(long p0){
       super();
       this.mNativeContext = p0;
    }
    public static Object a(TransactionBase p0){
       return p0.lambda$getErrorData$9();
    }
    public static void b(TransactionBase p0,long p1){
       p0.lambda$setHashId$6(p1);
    }
    public static Object c(TransactionBase p0){
       return p0.lambda$getErrorCode$7();
    }
    public static void d(TransactionBase p0,byte[] p1){
       p0.lambda$setLogParam$13(p1);
    }
    public static void e(TransactionBase p0,String p1){
       p0.lambda$startTrace$10(p1);
    }
    public static void f(TransactionBase p0,long p1){
       p0.lambda$setCacheTimeout$0(p1);
    }
    public static Object g(TransactionBase p0){
       return p0.lambda$getSubBiz$2();
    }
    public static Object h(TransactionBase p0){
       return p0.lambda$getErrorMessage$8();
    }
    public static Object i(TransactionBase p0){
       return p0.lambda$getCommand$4();
    }
    public static void j(TransactionBase p0,String p1){
       p0.lambda$setSubBiz$3(p1);
    }
    public static void k(TransactionBase p0,long p1){
       p0.lambda$setTransferTimeout$1(p1);
    }
    public static Object l(TransactionBase p0){
       return p0.lambda$getTraceContext$11();
    }
    private Object lambda$getCommand$4(){
       return this.getCommand(this.mNativeContext);
    }
    private Object lambda$getErrorCode$7(){
       return Integer.valueOf(this.getErrorCode(this.mNativeContext));
    }
    private Object lambda$getErrorData$9(){
       return this.getErrorData(this.mNativeContext);
    }
    private Object lambda$getErrorMessage$8(){
       return this.getErrorMessage(this.mNativeContext);
    }
    private Object lambda$getLogParam$12(){
       return this.getLogParam(this.mNativeContext);
    }
    private Object lambda$getSubBiz$2(){
       return this.getSubBiz(this.mNativeContext);
    }
    private Object lambda$getTraceContext$11(){
       return this.getTraceContext(this.mNativeContext);
    }
    private Object lambda$getUid$5(){
       return Long.valueOf(this.getUid(this.mNativeContext));
    }
    private void lambda$setCacheTimeout$0(long p0){
       this.setCacheTimeout(this.mNativeContext, p0);
    }
    private void lambda$setHashId$6(long p0){
       this.setHashId(this.mNativeContext, p0);
    }
    private void lambda$setLogParam$13(byte[] p0){
       this.setLogParam(this.mNativeContext, p0);
    }
    private void lambda$setSubBiz$3(String p0){
       this.setSubBiz(this.mNativeContext, p0);
    }
    private void lambda$setTransferTimeout$1(long p0){
       this.setTransferTimeout(this.mNativeContext, p0);
    }
    private void lambda$startTrace$10(String p0){
       this.startTrace(this.mNativeContext, p0);
    }
    public static Object m(TransactionBase p0){
       return p0.lambda$getUid$5();
    }
    public static Object n(TransactionBase p0){
       return p0.lambda$getLogParam$12();
    }
    public String getCommand(){
       Object obj = PatchProxy.apply(null, this, TransactionBase.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return JniCaller.objectCall(new y0(this));
    }
    public native final String getCommand(long p0);
    public int getErrorCode(){
       Object obj = PatchProxy.apply(null, this, TransactionBase.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return JniCaller.objectCall(new v0(this)).intValue();
    }
    public native final int getErrorCode(long p0);
    public byte[] getErrorData(){
       Object obj = PatchProxy.apply(null, this, TransactionBase.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return JniCaller.objectCall(new q0(this));
    }
    public native final byte[] getErrorData(long p0);
    public String getErrorMessage(){
       Object obj = PatchProxy.apply(null, this, TransactionBase.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return JniCaller.objectCall(new x0(this));
    }
    public native final String getErrorMessage(long p0);
    public byte[] getLogParam(){
       Object obj = PatchProxy.apply(null, this, TransactionBase.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return JniCaller.objectCall(new b1(this));
    }
    public native final byte[] getLogParam(long p0);
    public String getSubBiz(){
       Object obj = PatchProxy.apply(null, this, TransactionBase.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return JniCaller.objectCall(new w0(this));
    }
    public native final String getSubBiz(long p0);
    public String getTraceContext(){
       Object obj = PatchProxy.apply(null, this, TransactionBase.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return JniCaller.objectCall(new z0(this));
    }
    public native final String getTraceContext(long p0);
    public long getUid(){
       Object obj = PatchProxy.apply(null, this, TransactionBase.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return JniCaller.objectCall(new a1(this)).longValue();
    }
    public native final long getUid(long p0);
    public long moveNativeResource(){
       TransactionBase tmNativeCont = this.mNativeContext;
       this.mNativeContext = 0;
       return tmNativeCont;
    }
    public void setCacheTimeout(long p0){
       TransactionBase transactionB = TransactionBase.class;
       if (PatchProxy.isSupport(transactionB) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, transactionB, "1")) {
          return;
       }
       JniCaller.voidCall(new d1(this, p0));
       return;
    }
    public native final void setCacheTimeout(long p0,long p1);
    public void setHashId(long p0){
       TransactionBase transactionB = TransactionBase.class;
       if (PatchProxy.isSupport(transactionB) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, transactionB, "7")) {
          return;
       }
       JniCaller.voidCall(new c1(this, p0));
       return;
    }
    public native final void setHashId(long p0,long p1);
    public native final void setLogParam(long p0,byte[] p1);
    public void setLogParam(byte[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TransactionBase.class, "14")) {
          return;
       }
       JniCaller.voidCall(new u0(this, p0));
       return;
    }
    public native final void setSubBiz(long p0,String p1);
    public void setSubBiz(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TransactionBase.class, "4")) {
          return;
       }
       JniCaller.voidCall(new t0(this, p0));
       return;
    }
    public void setTransferTimeout(long p0){
       TransactionBase transactionB = TransactionBase.class;
       if (PatchProxy.isSupport(transactionB) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, transactionB, "2")) {
          return;
       }
       JniCaller.voidCall(new r0(this, p0));
       return;
    }
    public native final void setTransferTimeout(long p0,long p1);
    public native final void startTrace(long p0,String p1);
    public void startTrace(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TransactionBase.class, "11")) {
          return;
       }
       JniCaller.voidCall(new s0(this, p0));
       return;
    }
}
