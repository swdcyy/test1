package com.yxcorp.gifshow.ad.dislike.DislikeHelper$b;
import erd.g;
import java.lang.Object;
import vq4.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.ad.dislike.DislikeHelper;
import vq4.d;

public final class DislikeHelper$b implements g	// class@001738
{
    public final boolean b;

    public void DislikeHelper$b(boolean p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DislikeHelper$b.class, "1")) {
       }else {
          p0.I = DislikeHelper.c(this.b);
       }
       return;
    }
}
