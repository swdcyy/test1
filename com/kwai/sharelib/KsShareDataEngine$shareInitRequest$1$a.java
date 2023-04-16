package com.kwai.sharelib.KsShareDataEngine$shareInitRequest$1$a;
import ca7.c;
import com.kwai.sharelib.KsShareDataEngine$shareInitRequest$1;
import brd.v;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.sharelib.log.KsSharePerformanceStat;
import uo7.k;
import kotlin.jvm.internal.a;
import com.kwai.middleware.azeroth.network.AzerothResponseException;
import com.kwai.sharelib.exception.ForwardToastException;
import java.lang.Exception;
import java.lang.NullPointerException;
import brd.g;
import com.kwai.sharelib.model.ShareInitResponse;
import kotlin.jvm.internal.Ref$ObjectRef;
import qrd.l1;

public final class KsShareDataEngine$shareInitRequest$1$a implements c	// class@00169e
{
    public final KsShareDataEngine$shareInitRequest$1 a;
    public final v b;

    public void KsShareDataEngine$shareInitRequest$1$a(KsShareDataEngine$shareInitRequest$1 p0,v p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void onFailure(Throwable p0){
       ForwardToastException uForwardToas;
       if (PatchProxy.applyVoidOneRefs(p0, this, KsShareDataEngine$shareInitRequest$1$a.class, "2")) {
          return;
       }
       this.a.c.h().x("request_share_init_end");
       KsShareDataEngine$shareInitRequest$1$a tb = this.b;
       a.o(tb, "emitter");
       if (tb.isDisposed()) {
          return;
       }
       tb = this.b;
       AzerothResponseException uAzerothResp = (!p0 instanceof AzerothResponseException)? null: p0;
       if (uAzerothResp) {
          uForwardToas = new ForwardToastException(uAzerothResp.mErrorMessage, uAzerothResp);
       }
       if (uForwardToas == null) {
          uForwardToas = new NullPointerException("Unexpected null throwable in share/init");
       }
       tb.onError(uForwardToas);
       return;
    }
    public void onSuccess(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KsShareDataEngine$shareInitRequest$1$a.class, "1")) {
       }else {
          this.a.c.h().x("request_share_init_end");
          KsShareDataEngine$shareInitRequest$1$a tb = this.b;
          a.o(tb, "emitter");
          if (!tb.isDisposed()) {
             if (p0 != null) {
                this.a.d.element = p0;
                this.b.onNext(p0);
                this.b.onComplete();
             }else {
                this.b.onError(new NullPointerException("Unexcepted null response when success"));
                p0 = l1.a;
             }
          }
       }
       return;
    }
}
