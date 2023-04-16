package com.kwai.live.gzone.accompanyplay.audience.m$a;
import erd.g;
import com.kwai.live.gzone.accompanyplay.audience.m;
import java.lang.Object;
import java.lang.Long;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.live.gzone.accompanyplay.audience.k0$g;
import com.kwai.live.gzone.accompanyplay.audience.LiveGzoneAccompanyLoading;

public class m$a implements g	// class@000b97
{
    public final m b;

    public void m$a(m p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m$a.class, "1")) {
       }else if(this.b.s.q()){
          this.b.s.k(p0.longValue(), LiveGzoneAccompanyLoading.NON);
       }else {
          this.b.s.h(p0.longValue());
       }
       return;
    }
}
