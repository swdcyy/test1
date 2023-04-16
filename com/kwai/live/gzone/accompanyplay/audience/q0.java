package com.kwai.live.gzone.accompanyplay.audience.q0;
import xl6.h;
import com.kwai.live.gzone.accompanyplay.audience.p0;
import java.lang.Object;
import xl6.f;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.live.gzone.accompanyplay.audience.k0$g;
import lnc.a1;

public class q0 implements h	// class@000bac
{
    public final p0 a;

    public void q0(p0 p0){
       this.a = p0;
       super();
    }
    public void a(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, q0.class, "1")) {
          return;
       }
       f a = p0.a;
       if (a != null) {
          p0 = p0.b;
          if (p0 != null) {
             this.a.V8(p0, a);
          }
       }
       return;
    }
    public void onError(int p0){
       q0 oq0 = q0.class;
       if (PatchProxy.isSupport(oq0) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, oq0, "2")) {
          return;
       }
       if (p0 == 3001) {
          this.a.s.g();
          return;
       }else {
          this.a.s.b(a1.p(R.string.arg_RES_7f102324));
          return;
       }
    }
}
