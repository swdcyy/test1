package com.yxcorp.gifshow.detail.common.danmaku.DanmakuElement$c;
import erd.a;
import com.yxcorp.gifshow.detail.common.danmaku.DanmakuElement;
import com.kwai.feature.api.danmaku.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.detail.common.danmaku.DanmakuElement$c$a;
import crd.b;
import ok.h;
import lnc.b9;
import crd.a;
import qrd.l1;
import qp7.t0;
import qp7.b;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePageConfig;

public final class DanmakuElement$c implements a	// class@0013d8
{
    public final DanmakuElement b;
    public final c c;
    public final boolean d;

    public void DanmakuElement$c(DanmakuElement p0,c p1,boolean p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, DanmakuElement$c.class, "1")) {
          return;
       }
       this.b.z0("initKit", "kit is null");
       DanmakuElement$c tb = this.b;
       b uob = b9.c(tb.Y, new DanmakuElement$c$a(this));
       this.b.V.c(uob);
       tb.Y = uob;
       if (!this.b.H().b0()) {
          this.b.A0(false);
       }
       return;
    }
}
