package com.yxcorp.gifshow.ad.dislike.DislikeHelper$e;
import erd.g;
import kotlin.jvm.internal.Ref$IntRef;
import com.kuaishou.commercial.photoreduce.a$a;
import java.lang.Object;
import vq4.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.ad.dislike.DislikeHelper;
import vq4.d;

public final class DislikeHelper$e implements g	// class@00173c
{
    public final Ref$IntRef b;
    public final boolean c;
    public final a$a d;

    public void DislikeHelper$e(Ref$IntRef p0,boolean p1,a$a p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DislikeHelper$e.class, "1")) {
       }else {
          this.b.element = DislikeHelper.c(this.c);
          p0 = p0.F;
          p0.I = this.b.element;
          p0.J = this.d.a;
       }
       return;
    }
}
