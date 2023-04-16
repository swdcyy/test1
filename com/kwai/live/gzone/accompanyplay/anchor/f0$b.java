package com.kwai.live.gzone.accompanyplay.anchor.f0$b;
import erd.g;
import com.kwai.live.gzone.accompanyplay.anchor.f0;
import java.lang.Object;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyBindGameAccountInfoResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.live.gzone.accompanyplay.edit.g;

public class f0$b implements g	// class@000b0b
{
    public final f0 b;

    public void f0$b(f0 p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f0$b.class, "1")) {
       }else {
          p0 = this.b.p;
          if (p0 != null) {
             p0.d();
          }
       }
       return;
    }
}
