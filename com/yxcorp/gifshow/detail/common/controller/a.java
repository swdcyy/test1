package com.yxcorp.gifshow.detail.common.controller.a;
import java.lang.Runnable;
import com.yxcorp.gifshow.detail.common.controller.CoronaPlayPayPauseElement$c;
import bm5.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.yxcorp.gifshow.detail.common.controller.CoronaPlayPayPauseElement;
import com.yxcorp.gifshow.entity.QPhoto;
import kotlin.jvm.internal.a;

public final class a implements Runnable	// class@0013d4
{
    public final CoronaPlayPayPauseElement$c b;
    public final a c;

    public void a(CoronaPlayPayPauseElement$c p0,a p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       CoronaPlayPayPauseElement$c b = this.b.b;
       a tc = this.c;
       Objects.requireNonNull(b);
       if (!PatchProxy.applyVoidOneRefs(tc, b, CoronaPlayPayPauseElement.class, "10") && tc != null) {
          a c = tc.c;
          if (c != null) {
             String photoId = c.getPhotoId();
             if (photoId != null) {
                CoronaPlayPayPauseElement b1 = b.B;
                if (b1 == null) {
                   a.S("mPhoto");
                }
                if (photoId.equals(b1.getPhotoId()) == true) {
                   if (tc.a != null) {
                      b.u0();
                   }else {
                      b.q0();
                   }
                   if (tc.b != null) {
                      b.t0(true);
                   }
                }
             }
          }
       }
       return;
    }
}
