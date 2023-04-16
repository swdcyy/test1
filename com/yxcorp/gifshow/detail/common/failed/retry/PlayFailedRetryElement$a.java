package com.yxcorp.gifshow.detail.common.failed.retry.PlayFailedRetryElement$a;
import jta.a;
import com.yxcorp.gifshow.detail.common.failed.retry.PlayFailedRetryElement;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Object;
import java.lang.String;
import qp7.x0;
import qp7.b;
import ur7.h;
import lnc.a1;
import java.util.Objects;
import pp7.b;

public class PlayFailedRetryElement$a extends a	// class@001403
{
    public final PlayFailedRetryElement a;

    public void PlayFailedRetryElement$a(PlayFailedRetryElement p0){
       this.a = p0;
       super();
    }
    public void c(float p0){
       PlayFailedRetryElement$a uoa = PlayFailedRetryElement$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uoa, "1")) {
          return;
       }
       h oh = this.a.E();
       float f = (float)a1.e(-19.00f) * (0x3f800000 - p0);
       Objects.requireNonNull(oh);
       h oh1 = h.class;
       if (!PatchProxy.isSupport(oh1) || !PatchProxy.applyVoidOneRefs(Float.valueOf(f), oh, oh1, "1")) {
          oh.e.f(Float.valueOf(f));
       }
       return;
    }
}
