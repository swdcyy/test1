package com.kwai.link.KlinkExtension;
import com.kwai.link.Klink;
import java.lang.Object;
import com.kwai.link.extensions.PassThroughTransaction;
import java.lang.String;
import com.kwai.link.extensions.HttpTransaction;
import java.lang.Long;
import com.kwai.link.TransactionBase;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import z27.g0;
import bv7.b;
import com.kwai.link.JniCaller;
import z27.h0;
import z27.i0;
import java.lang.Runnable;
import z27.j0;

public class KlinkExtension	// class@000adc
{
    public final long mNativeContext;

    public void KlinkExtension(Klink p0){
       super();
       this.mNativeContext = p0.mNativeContext;
    }
    public static void a(KlinkExtension p0,PassThroughTransaction p1){
       p0.lambda$passThrough$3(p1);
    }
    public static Object b(KlinkExtension p0,String p1){
       return p0.lambda$constructHttpTransaction$0(p1);
    }
    public static void c(KlinkExtension p0,HttpTransaction p1){
       p0.lambda$http$1(p1);
    }
    public static Object d(KlinkExtension p0,String p1){
       return p0.lambda$constructPassThroughTransaction$2(p1);
    }
    private Object lambda$constructHttpTransaction$0(String p0){
       return Long.valueOf(this.createHttpTransaction(this.mNativeContext, p0));
    }
    private Object lambda$constructPassThroughTransaction$2(String p0){
       return Long.valueOf(this.createPassThroughTransaction(this.mNativeContext, p0));
    }
    private void lambda$http$1(HttpTransaction p0){
       this.http(this.mNativeContext, p0.moveNativeResource());
    }
    private void lambda$passThrough$3(PassThroughTransaction p0){
       this.passThrough(this.mNativeContext, p0.moveNativeResource());
    }
    public HttpTransaction constructHttpTransaction(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KlinkExtension.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new HttpTransaction(JniCaller.objectCall(new g0(this, p0)).longValue());
    }
    public PassThroughTransaction constructPassThroughTransaction(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KlinkExtension.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new PassThroughTransaction(JniCaller.objectCall(new h0(this, p0)).longValue());
    }
    public native final long createHttpTransaction(long p0,String p1);
    public native final long createPassThroughTransaction(long p0,String p1);
    public native final void http(long p0,long p1);
    public void http(HttpTransaction p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KlinkExtension.class, "2")) {
          return;
       }
       JniCaller.voidCall(new i0(this, p0));
       return;
    }
    public native final void passThrough(long p0,long p1);
    public void passThrough(PassThroughTransaction p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KlinkExtension.class, "4")) {
          return;
       }
       JniCaller.voidCall(new j0(this, p0));
       return;
    }
}
