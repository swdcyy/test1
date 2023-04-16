package com.yxcorp.gifshow.ad.detail.vm.danmaku.AdDanmakuElement$k;
import ok.h;
import com.yxcorp.gifshow.ad.detail.vm.danmaku.AdDanmakuElement;
import java.lang.Object;
import java.lang.Void;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import crd.b;
import java.lang.Boolean;
import kotlin.Pair;
import qrd.r0;
import brd.t;
import java.util.concurrent.TimeUnit;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.ad.detail.vm.danmaku.b;
import erd.g;

public final class AdDanmakuElement$k implements h	// class@001701
{
    public final AdDanmakuElement b;
    public final boolean c;

    public void AdDanmakuElement$k(AdDanmakuElement p0,boolean p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object apply(Object p0){
       p0 = PatchProxy.applyOneRefs(p0, this, AdDanmakuElement$k.class, "1");
       if (p0 != PatchProxyResult.class) {
       }else {
          p0 = t.just(r0.a(Boolean.valueOf((this.b.X ^ 0x01)), Boolean.valueOf(this.c))).delay(0, TimeUnit.MILLISECONDS).observeOn(d.a).subscribe(new b(this));
       }
       return p0;
    }
}
