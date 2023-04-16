package com.yxcorp.gifshow.detail.common.danmaku.DanmakuElement$e;
import qp7.y0;
import com.yxcorp.gifshow.detail.common.danmaku.DanmakuElement;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import crd.a;
import crd.b;
import lnc.b9;
import qp7.g;
import qp7.b;
import lq7.d;
import kotlin.Pair;
import qrd.r0;

public final class DanmakuElement$e extends y0	// class@0013dd
{
    public final DanmakuElement a;

    public void DanmakuElement$e(DanmakuElement p0){
       this.a = p0;
       super();
    }
    public void e(boolean p0){
       if (PatchProxy.isSupport(DanmakuElement$e.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, DanmakuElement$e.class, "2")) {
          return;
       }
       this.a.V.d();
       b9.a(this.a.M);
       return;
    }
    public void f(boolean p0){
       DanmakuElement$e uoe = DanmakuElement$e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoe, "1")) {
          return;
       }
       this.a.D().d(false);
       this.a.D().c(r0.a(Boolean.FALSE, Boolean.FALSE));
       return;
    }
}
