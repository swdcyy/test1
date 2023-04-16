package com.yxcorp.gifshow.ad.detail.vm.danmaku.AdDanmakuElement$c;
import erd.a;
import com.yxcorp.gifshow.ad.detail.vm.danmaku.AdDanmakuElement;
import com.kwai.feature.api.danmaku.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.ad.detail.vm.danmaku.AdDanmakuElement$c$a;
import crd.b;
import ok.h;
import lnc.b9;
import crd.a;
import qrd.l1;

public final class AdDanmakuElement$c implements a	// class@0016f8
{
    public final AdDanmakuElement b;
    public final c c;
    public final boolean d;

    public void AdDanmakuElement$c(AdDanmakuElement p0,c p1,boolean p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, AdDanmakuElement$c.class, "1")) {
          return;
       }
       this.b.y0("initKit", "kit is null");
       AdDanmakuElement$c tb = this.b;
       b uob = b9.c(tb.Q, new AdDanmakuElement$c$a(this));
       this.b.N.c(uob);
       tb.Q = uob;
       if (!this.b.x0()) {
          this.b.z0(false);
       }
       return;
    }
}
