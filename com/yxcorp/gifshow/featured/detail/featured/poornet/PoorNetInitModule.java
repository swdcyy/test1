package com.yxcorp.gifshow.featured.detail.featured.poornet.PoorNetInitModule;
import com.kwai.framework.init.TTIInitModule;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import wkd.b;
import com.yxcorp.gifshow.featured.detail.featured.poornet.b;
import android.app.Activity;
import java.util.Objects;
import lnc.u1;
import crd.b;
import b76.a;
import com.yxcorp.gifshow.featured.detail.featured.poornet.a;
import java.lang.Runnable;
import com.kwai.framework.init.e;

public class PoorNetInitModule extends TTIInitModule	// class@000f41
{
    public static final int q;

    public void PoorNetInitModule(){
       super();
    }
    public int f0(){
       return 5;
    }
    public void h0(){
       if (PatchProxy.applyVoid(null, this, PoorNetInitModule.class, "3")) {
          return;
       }
       b.a(-953099949).j();
       return;
    }
    public void j0(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PoorNetInitModule.class, "2")) {
          return;
       }
       b uob = b.a(-953099949);
       Objects.requireNonNull(uob);
       if (!PatchProxy.applyVoid(null, uob, b.class, "23")) {
          u1.b(uob);
          b c = uob.c;
          if (c != null) {
             c.dispose();
          }
          c = uob.f;
          if (c != null) {
             c.dispose();
          }
          uob.n();
       }
       return;
    }
    public void k0(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PoorNetInitModule.class, "1")) {
          return;
       }
       e.d(a.b, "PoorNetInitModule");
       return;
    }
}
