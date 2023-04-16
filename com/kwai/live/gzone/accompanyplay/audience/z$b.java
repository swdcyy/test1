package com.kwai.live.gzone.accompanyplay.audience.z$b;
import erd.g;
import com.kwai.live.gzone.accompanyplay.audience.z;
import java.lang.Object;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyCheckGameRegisterResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.live.gzone.accompanyplay.audience.d0$e;

public class z$b implements g	// class@000bca
{
    public final z b;

    public void z$b(z p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, z$b.class, "1")) {
       }else {
          z$b tb = this.b;
          tb.s = p0.mIsRegistered ^ 0x01;
          tb.R8();
          this.b.u.a();
       }
       return;
    }
}
