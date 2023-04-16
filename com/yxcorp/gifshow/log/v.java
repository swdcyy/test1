package com.yxcorp.gifshow.log.v;
import java.lang.Object;
import com.yxcorp.gifshow.log.policy.LogPolicy;
import com.yxcorp.gifshow.log.v$a;
import android.os.HandlerThread;
import java.lang.Class;
import java.lang.String;
import com.yxcorp.gifshow.log.v$c;
import android.os.Looper;
import k2b.n2;
import java.lang.Runnable;
import android.os.Handler;
import brd.z;
import io.reactivex.android.schedulers.a;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import wkd.b;
import ob6.p;
import ob6.f;
import com.kwai.framework.network.keyconfig.ApiFeature;
import com.kwai.sdk.switchconfig.a;
import java.util.Map;
import ekd.s;
import android.util.Base64;
import com.yxcorp.gifshow.log.v$b;
import brd.t;

public abstract class v	// class@001b5a
{
    public Handler a;
    public LogPolicy b;
    public boolean c;
    public z d;
    public Runnable e;

    public void v(){
       super();
       this.b = LogPolicy.DEFAULT;
       this.c = true;
       this.e = new v$a(this);
       HandlerThread handlerThrea = new HandlerThread(this.getClass().getName(), 10);
       handlerThrea.start();
       v$c uoc = new v$c(this, handlerThrea.getLooper());
       this.a = uoc;
       uoc.post(new n2(this));
       this.d = a.a(handlerThrea.getLooper());
       v ta = this.a;
       Object obj = PatchProxy.apply(null, this, v.class, "6");
       long l = (obj != PatchProxyResult.class)? obj.longValue(): b.a(0x36463d96).i().f(ApiFeature.REAL_LOG);
       ta.sendEmptyMessageDelayed(true, (l + this.a()));
       return;
    }
    public abstract long a();
    public String b(){
       Object obj = PatchProxy.apply(null, this, v.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.t().c("recoLogEncoding", "");
    }
    public void c(){
    }
    public abstract boolean d(boolean p0);
    public void e(Map p0,byte[] p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, v.class, "3")) {
          return;
       }
       if (("gzip").equals(this.b())) {
          p0.put("encoding", "gzip");
          p0.put("log", Base64.encodeToString(s.b(p1), 2));
       }else {
          p0.put("log", Base64.encodeToString(p1, 2));
       }
       return;
    }
    public void f(Runnable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, v.class, "1")) {
          return;
       }
       this.a.post(new v$b(this, p0));
       return;
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, v.class, "5")) {
          return;
       }
       if (this.a.hasMessages(1)) {
          return;
       }
       this.a.sendEmptyMessageDelayed(1, this.a());
       return;
    }
    public void h(LogPolicy p0){
       if (p0 != null) {
          this.b = p0;
       }
       return;
    }
    public abstract t i(boolean p0);
    public void j(){
       if (PatchProxy.applyVoid(null, this, v.class, "7")) {
          return;
       }
       this.a.post(this.e);
       return;
    }
}
