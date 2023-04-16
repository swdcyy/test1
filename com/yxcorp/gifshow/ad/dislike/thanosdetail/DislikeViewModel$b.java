package com.yxcorp.gifshow.ad.dislike.thanosdetail.DislikeViewModel$b;
import erd.g;
import com.kuaishou.commercial.photoreduce.a$a;
import java.lang.Object;
import vq4.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import vq4.d;

public final class DislikeViewModel$b implements g	// class@001746
{
    public final a$a b;

    public void DislikeViewModel$b(a$a p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DislikeViewModel$b.class, "1")) {
       }else {
          a.p(p0, "clientAdLog");
          p0 = p0.F;
          p0.J = this.b.a;
          p0.I = 1;
       }
       return;
    }
}
