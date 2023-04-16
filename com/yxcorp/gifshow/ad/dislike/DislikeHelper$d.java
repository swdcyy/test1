package com.yxcorp.gifshow.ad.dislike.DislikeHelper$d;
import erd.g;
import java.lang.Object;
import vq4.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.ad.dislike.DislikeHelper;
import vq4.d;

public final class DislikeHelper$d implements g	// class@00173b
{
    public final boolean b;

    public void DislikeHelper$d(boolean p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DislikeHelper$d.class, "1")) {
       }else {
          p0.I = DislikeHelper.c(this.b);
       }
       return;
    }
}
