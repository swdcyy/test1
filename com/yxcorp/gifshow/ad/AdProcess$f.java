package com.yxcorp.gifshow.ad.AdProcess$f;
import erd.g;
import com.yxcorp.gifshow.ad.AdProcess;
import com.yxcorp.gifshow.photoad.model.AdDataWrapper;
import java.lang.Object;
import vq4.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import tkd.b;
import tkd.d;
import nl9.d;
import vq4.d;

public final class AdProcess$f implements g	// class@0014e4
{
    public final AdProcess b;
    public final AdDataWrapper c;

    public void AdProcess$f(AdProcess p0,AdDataWrapper p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AdProcess$f.class, "1")) {
       }else {
          int i = 0x4bd38ddd;
          if (d.a(i).bp(this.c)) {
             d.a(i).PZ(p0);
          }
          if (p0 != null) {
             p0 = p0.F;
             if (p0 != null) {
                p0.h0 = this.b.d().getDownloadSource();
             }
          }
       }
       return;
    }
}
