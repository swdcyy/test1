package com.yxcorp.gifshow.detail.common.danmaku.DanmakuElement$h;
import tw6.e;
import com.yxcorp.gifshow.detail.common.danmaku.DanmakuElement;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.lang.Runnable;
import ekd.k1;
import im5.d;
import com.kwai.feature.api.danmaku.utils.DanmakuSwitchUtils;
import rm5.a;

public final class DanmakuElement$h implements e	// class@0013e0
{
    public final DanmakuElement a;

    public void DanmakuElement$h(DanmakuElement p0){
       this.a = p0;
       super();
    }
    public void a(int p0){
       DanmakuElement$h oh = DanmakuElement$h.class;
       if (PatchProxy.isSupport(oh) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, oh, "2")) {
          return;
       }
       k1.r(this.a.w0(), 0);
       return;
    }
    public void b(int p0){
       DanmakuElement$h oh = DanmakuElement$h.class;
       if (PatchProxy.isSupport(oh) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, oh, "1")) {
          return;
       }
       DanmakuElement u0 = this.a.U0;
       if (u0 != null && (u0.isRunning() == true && DanmakuSwitchUtils.h.d())) {
          a.c(this.a.W, 1, true, false, 4, null);
       }
    label_0036 :
       return;
    }
}
