package com.yxcorp.gifshow.detail.common.danmaku.b;
import erd.g;
import com.yxcorp.gifshow.detail.common.danmaku.DanmakuElement$k;
import java.lang.Object;
import kotlin.Pair;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import java.lang.Boolean;
import com.yxcorp.gifshow.detail.common.danmaku.DanmakuElement;
import qp7.g;
import qp7.b;
import lq7.d;
import kotlin.jvm.internal.a;

public final class b implements g	// class@0013f1
{
    public final DanmakuElement$k b;

    public void b(DanmakuElement$k p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
       }else {
          this.b.b.z0("notifyDanmakuInputVisible", "visible: "+p0.getFirst().booleanValue());
          a.o(p0, "it");
          this.b.b.D().c(p0);
       }
       return;
    }
}
