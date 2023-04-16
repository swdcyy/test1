package com.yxcorp.gifshow.ad.detail.vm.danmaku.AdDanmakuElement$h;
import tw6.e;
import com.yxcorp.gifshow.ad.detail.vm.danmaku.AdDanmakuElement;
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

public final class AdDanmakuElement$h implements e	// class@0016fe
{
    public final AdDanmakuElement a;

    public void AdDanmakuElement$h(AdDanmakuElement p0){
       this.a = p0;
       super();
    }
    public void a(int p0){
       AdDanmakuElement$h oh = AdDanmakuElement$h.class;
       if (PatchProxy.isSupport(oh) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, oh, "2")) {
          return;
       }
       k1.r(this.a.u0(), 0);
       return;
    }
    public void b(int p0){
       AdDanmakuElement$h oh = AdDanmakuElement$h.class;
       if (PatchProxy.isSupport(oh) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, oh, "1")) {
          return;
       }
       AdDanmakuElement s = this.a.S;
       if (s != null && (s.isRunning() == true && DanmakuSwitchUtils.h.d())) {
          a.c(this.a.O, 1, true, false, 4, null);
       }
    label_0036 :
       return;
    }
}
