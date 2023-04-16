package com.kuaishou.live.audience.course.m$a;
import com.yxcorp.gateway.pay.api.PayCallback;
import com.kuaishou.live.audience.course.m;
import brd.v;
import java.lang.Object;
import com.yxcorp.gateway.pay.params.PayResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Exception;
import java.lang.Throwable;
import brd.g;
import java.lang.Boolean;

public class m$a implements PayCallback	// class@000c09
{
    public final v a;
    public final m b;

    public void m$a(m p0,v p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onPayCancel(PayResult p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m$a.class, "3")) {
          return;
       }
       this.a.onError(new Exception("canceled"));
       return;
    }
    public void onPayFailure(PayResult p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m$a.class, "2")) {
          return;
       }
       this.a.onError(new Exception("failure"));
       return;
    }
    public void onPaySuccess(PayResult p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m$a.class, "1")) {
          return;
       }
       this.a.onNext(Boolean.TRUE);
       return;
    }
    public void onPayUnknown(PayResult p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m$a.class, "4")) {
          return;
       }
       this.a.onNext(Boolean.TRUE);
       return;
    }
}
