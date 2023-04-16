package com.yxcorp.gifshow.message_camera.effect.prettify.filter.IMFilterController$b$a;
import java.lang.Runnable;
import com.yxcorp.gifshow.message_camera.effect.prettify.filter.IMFilterController$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.yxcorp.gifshow.message_camera.effect.prettify.filter.IMFilterController;
import java.lang.Long;
import lnc.a1;
import dc5.c;
import iib.d;
import com.kwai.feature.post.api.componet.prettify.filter.model.FilterConfig;
import com.yxcorp.gifshow.prettify.filter.repo.a;
import java.lang.StringBuilder;

public final class IMFilterController$b$a implements Runnable	// class@001dc3
{
    public final IMFilterController$b b;

    public void IMFilterController$b$a(IMFilterController$b p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoidWithListener(null, this, IMFilterController$b$a.class, "1")) {
          return;
       }
       IMFilterController$b$a tb = this.b;
       IMFilterController$b c = tb.c;
       IMFilterController$b b = tb.b;
       IMFilterController$b a = tb.a;
       Objects.requireNonNull(c);
       IMFilterController iMFilterCont = IMFilterController.class;
       if (!PatchProxy.isSupport(iMFilterCont) || !PatchProxy.applyVoidTwoRefs(Long.valueOf(b), a, c, iMFilterCont, "13")) {
          if (a1.o(b) - 2000 > 0) {
             c.g("IMFilterController", "restore time out");
          }else {
             FilterConfig uFilterConfi = c.d().f();
             if (uFilterConfi != null && uFilterConfi.mFilterId != a.mFilterId) {
                c.g("IMFilterController", "has select other filter");
             }else {
                c.g("IMFilterController", "restore after download"+a.mFilterName);
                c.e(a);
             }
          }
       }
       PatchProxy.onMethodExit(IMFilterController$b$a.class, "1");
       return;
    }
}
