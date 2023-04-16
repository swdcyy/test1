package com.yxcorp.gifshow.detail.common.danmaku.DanmakuElement$k;
import ok.h;
import com.yxcorp.gifshow.detail.common.danmaku.DanmakuElement;
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
import com.yxcorp.gifshow.detail.common.danmaku.b;
import erd.g;

public final class DanmakuElement$k implements h	// class@0013e3
{
    public final DanmakuElement b;
    public final boolean c;

    public void DanmakuElement$k(DanmakuElement p0,boolean p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object apply(Object p0){
       p0 = PatchProxy.applyOneRefs(p0, this, DanmakuElement$k.class, "1");
       if (p0 != PatchProxyResult.class) {
       }else {
          p0 = t.just(r0.a(Boolean.valueOf((this.b.Z0 ^ 0x01)), Boolean.valueOf(this.c))).delay(0, TimeUnit.MILLISECONDS).observeOn(d.a).subscribe(new b(this));
       }
       return p0;
    }
}
