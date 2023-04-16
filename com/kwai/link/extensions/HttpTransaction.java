package com.kwai.link.extensions.HttpTransaction;
import com.kwai.link.TransactionBase;
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Integer;
import com.kwai.link.extensions.HttpTransaction$Method;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import a37.g;
import java.lang.Runnable;
import com.kwai.link.JniCaller;
import com.kwai.robust.PatchProxyResult;
import a37.b;
import bv7.b;
import a37.c;
import java.lang.Number;
import a37.a;
import java.lang.Long;
import bv7.a;
import a37.e;
import a37.d;
import a37.h;
import a37.f;

public class HttpTransaction extends TransactionBase	// class@000ae2
{
    public a mOnComplete;

    public void HttpTransaction(long p0){
       super(p0);
       this.mOnComplete = null;
    }
    private void lambda$addRequestHeader$2(String p0,String p1){
       this.addRequestHeader(this.mNativeContext, p0, p1);
    }
    private Object lambda$getResponseBody$6(){
       return this.getResponseBody(this.mNativeContext);
    }
    private Object lambda$getResponseHeaders$5(){
       return this.getResponseHeaders(this.mNativeContext);
    }
    private Object lambda$getStatusCode$4(){
       return Integer.valueOf(this.getStatusCode(this.mNativeContext));
    }
    private void lambda$setMethod$0(HttpTransaction$Method p0){
       this.setMethod(this.mNativeContext, p0.getValue());
    }
    private void lambda$setOnComplete$7(){
       this.setOnComplete(this.mNativeContext);
    }
    private void lambda$setRequestBody$3(byte[] p0){
       this.setRequestBody(this.mNativeContext, p0);
    }
    private void lambda$setUrl$1(String p0){
       this.setUrl(this.mNativeContext, p0);
    }
    public static void o(HttpTransaction p0){
       p0.lambda$setOnComplete$7();
    }
    public static void p(HttpTransaction p0,String p1){
       p0.lambda$setUrl$1(p1);
    }
    public static Object q(HttpTransaction p0){
       return p0.lambda$getStatusCode$4();
    }
    public static void r(HttpTransaction p0,String p1,String p2){
       p0.lambda$addRequestHeader$2(p1, p2);
    }
    public static Object s(HttpTransaction p0){
       return p0.lambda$getResponseBody$6();
    }
    public static void t(HttpTransaction p0,HttpTransaction$Method p1){
       p0.lambda$setMethod$0(p1);
    }
    public static Object u(HttpTransaction p0){
       return p0.lambda$getResponseHeaders$5();
    }
    public static void v(HttpTransaction p0,byte[] p1){
       p0.lambda$setRequestBody$3(p1);
    }
    public native final void addRequestHeader(long p0,String p1,String p2);
    public void addRequestHeader(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, HttpTransaction.class, "3")) {
          return;
       }
       JniCaller.voidCall(new g(this, p0, p1));
       return;
    }
    public byte[] getResponseBody(){
       Object obj = PatchProxy.apply(null, this, HttpTransaction.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return JniCaller.objectCall(new b(this));
    }
    public native final byte[] getResponseBody(long p0);
    public ArrayList getResponseHeaders(){
       Object obj = PatchProxy.apply(null, this, HttpTransaction.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return JniCaller.objectCall(new c(this));
    }
    public native final ArrayList getResponseHeaders(long p0);
    public int getStatusCode(){
       Object obj = PatchProxy.apply(null, this, HttpTransaction.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return JniCaller.objectCall(new a(this)).intValue();
    }
    public native final int getStatusCode(long p0);
    public final void onComplete(long p0){
       HttpTransaction httpTransact = HttpTransaction.class;
       if (PatchProxy.isSupport(httpTransact) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, httpTransact, "9")) {
          return;
       }
       if (this.mOnComplete != null) {
          httpTransact = new HttpTransaction(p0);
          this.mOnComplete.accept(httpTransact);
          httpTransact.mNativeContext = 0;
       }
       return;
    }
    public native final void setMethod(long p0,int p1);
    public void setMethod(HttpTransaction$Method p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HttpTransaction.class, "1")) {
          return;
       }
       JniCaller.voidCall(new e(this, p0));
       return;
    }
    public native final void setOnComplete(long p0);
    public void setOnComplete(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HttpTransaction.class, "8")) {
          return;
       }
       this.mOnComplete = p0;
       JniCaller.voidCall(new d(this));
       return;
    }
    public native final void setRequestBody(long p0,byte[] p1);
    public void setRequestBody(byte[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HttpTransaction.class, "4")) {
          return;
       }
       JniCaller.voidCall(new h(this, p0));
       return;
    }
    public native final void setUrl(long p0,String p1);
    public void setUrl(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HttpTransaction.class, "2")) {
          return;
       }
       JniCaller.voidCall(new f(this, p0));
       return;
    }
}
