package com.yxcorp.gifshow.detail.common.danmaku.a;
import erd.g;
import com.yxcorp.gifshow.detail.common.danmaku.DanmakuElement$c$a;
import java.lang.Object;
import im5.d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.detail.common.danmaku.DanmakuElement$c;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.detail.common.danmaku.DanmakuElement;

public final class a implements g	// class@0013f0
{
    public final DanmakuElement$c$a b;

    public void a(DanmakuElement$c$a p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
       }else {
          a.o(p0, "it");
          this.b.b.b.v0(p0, this.b.b.d);
       }
       return;
    }
}
