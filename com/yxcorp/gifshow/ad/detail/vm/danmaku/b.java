package com.yxcorp.gifshow.ad.detail.vm.danmaku.b;
import erd.g;
import com.yxcorp.gifshow.ad.detail.vm.danmaku.AdDanmakuElement$k;
import java.lang.Object;
import kotlin.Pair;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import java.lang.Boolean;
import com.yxcorp.gifshow.ad.detail.vm.danmaku.AdDanmakuElement;
import qp7.g;
import qp7.b;
import lq7.d;
import kotlin.jvm.internal.a;

public final class b implements g	// class@00170c
{
    public final AdDanmakuElement$k b;

    public void b(AdDanmakuElement$k p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
       }else {
          this.b.b.y0("notifyDanmakuInputVisible", "visible: "+p0.getFirst().booleanValue());
          a.o(p0, "it");
          this.b.b.D().c(p0);
       }
       return;
    }
}
