package com.kuaishou.live.common.core.basic.resource.controlfiles.producer.LiveControlFileMd5CheckProducer$LiveControlFileMd5CheckConsumer;
import ftd.k0;
import ka1.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import ja1.e;
import kotlinx.coroutines.CoroutineDispatcher;
import ftd.z0;
import com.kuaishou.live.common.core.basic.resource.controlfiles.producer.LiveControlFileMd5CheckProducer$LiveControlFileMd5CheckConsumer$onNewResult$1;
import asd.c;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineStart;
import msd.p;
import ftd.z1;
import kotlinx.coroutines.a;
import ja1.f;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import java.io.File;
import ekd.a0;
import zsd.u;
import com.kuaishou.live.common.core.basic.resource.controlfiles.producer.LiveControlFileMd5CheckProducer$LiveControlFileMd5CheckConsumer$a;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlin.coroutines.CoroutineContext$b;
import asd.a;

public final class LiveControlFileMd5CheckProducer$LiveControlFileMd5CheckConsumer extends a implements k0	// class@000ed1
{

    public void LiveControlFileMd5CheckProducer$LiveControlFileMd5CheckConsumer(a p0){
       a.p(p0, "upstreamConsumer");
       super(p0);
    }
    public void b(Throwable p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveControlFileMd5CheckProducer$LiveControlFileMd5CheckConsumer.class, "5")) {
          return;
       }
       a.p(p0, "throwable");
       a.p(p1, "failedReason");
       a uoa = this.a();
       if (uoa != null) {
          uoa.b(p0, p1);
       }
       return;
    }
    public void c(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveControlFileMd5CheckProducer$LiveControlFileMd5CheckConsumer.class, "2")) {
          return;
       }
       a.p(p0, "task");
       a.f(this, z0.f(), null, new LiveControlFileMd5CheckProducer$LiveControlFileMd5CheckConsumer$onNewResult$1(this, p0, null), 2, null);
       return;
    }
    public final boolean d(f p0){
       String obj = PatchProxy.applyOneRefs(p0, this, LiveControlFileMd5CheckProducer$LiveControlFileMd5CheckConsumer.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = p0.b();
       File uFile = (obj == null || !obj.length())? 1: null;
       if (uFile) {
          return false;
       }else {
          uFile = new File(obj);
          if (!uFile.exists()) {
             p0.j(false);
             p0.i("deleteByUser");
             return false;
          }else {
             obj = p0.d();
             obj = (obj == null || !obj.length())? 1: null;
             if (obj || !u.J1(p0.d(), a0.b(uFile), false, 2, null)) {
                uFile.delete();
                p0.j(false);
                p0.i("md5NotRight");
                return false;
             }else {
                return true;
             }
          }
       }
    }
    public CoroutineContext getCoroutineContext(){
       Object obj = PatchProxy.apply(null, this, LiveControlFileMd5CheckProducer$LiveControlFileMd5CheckConsumer.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return z0.f().plus(new LiveControlFileMd5CheckProducer$LiveControlFileMd5CheckConsumer$a(CoroutineExceptionHandler.u0));
    }
}
