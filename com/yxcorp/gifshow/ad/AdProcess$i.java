package com.yxcorp.gifshow.ad.AdProcess$i;
import erd.g;
import com.yxcorp.gifshow.ad.AdProcess;
import java.lang.Object;
import vq4.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.photoad.model.AdDataWrapper;
import vq4.d;

public final class AdProcess$i implements g	// class@0014e7
{
    public final AdProcess b;

    public void AdProcess$i(AdProcess p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AdProcess$i.class, "1")) {
       }else {
          p0.h0 = this.b.d().getDownloadSource();
       }
       return;
    }
}
