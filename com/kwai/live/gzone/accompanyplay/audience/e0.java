package com.kwai.live.gzone.accompanyplay.audience.e0;
import sfc.a;
import com.kwai.live.gzone.accompanyplay.audience.d0;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.retrofit.model.KwaiException;
import com.kwai.live.gzone.accompanyplay.audience.k0$g;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import o37.a;
import k37.a0;

public class e0 extends a	// class@000b7a
{
    public final d0 c;

    public void e0(d0 p0){
       this.c = p0;
       super();
    }
    public void accept(Object p0){
       this.b(p0);
    }
    public void b(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e0.class, "1")) {
          return;
       }
       int i = -1;
       if (p0 instanceof KwaiException) {
          i = p0.mErrorCode;
       }
       if (i == 0x103dd) {
          this.c.S8();
          return;
       }else {
          this.c.s.s(p0);
          a0.f(this.c.s.a(), this.c.s.t(), i);
          return;
       }
    }
}
