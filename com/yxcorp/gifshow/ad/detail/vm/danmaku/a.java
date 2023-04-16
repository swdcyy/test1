package com.yxcorp.gifshow.ad.detail.vm.danmaku.a;
import erd.g;
import com.yxcorp.gifshow.ad.detail.vm.danmaku.AdDanmakuElement$c$a;
import java.lang.Object;
import im5.d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.ad.detail.vm.danmaku.AdDanmakuElement$c;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.ad.detail.vm.danmaku.AdDanmakuElement;

public final class a implements g	// class@00170b
{
    public final AdDanmakuElement$c$a b;

    public void a(AdDanmakuElement$c$a p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
       }else {
          a.o(p0, "it");
          this.b.b.b.t0(p0, this.b.b.d);
       }
       return;
    }
}
