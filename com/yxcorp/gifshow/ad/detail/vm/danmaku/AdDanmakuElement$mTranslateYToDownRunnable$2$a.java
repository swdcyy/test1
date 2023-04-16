package com.yxcorp.gifshow.ad.detail.vm.danmaku.AdDanmakuElement$mTranslateYToDownRunnable$2$a;
import java.lang.Runnable;
import com.yxcorp.gifshow.ad.detail.vm.danmaku.AdDanmakuElement$mTranslateYToDownRunnable$2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.ad.detail.vm.danmaku.AdDanmakuElement;
import im5.d;
import com.kwai.feature.api.danmaku.utils.DanmakuSwitchUtils;
import rm5.a;

public final class AdDanmakuElement$mTranslateYToDownRunnable$2$a implements Runnable	// class@001706
{
    public final AdDanmakuElement$mTranslateYToDownRunnable$2 b;

    public void AdDanmakuElement$mTranslateYToDownRunnable$2$a(AdDanmakuElement$mTranslateYToDownRunnable$2 p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, AdDanmakuElement$mTranslateYToDownRunnable$2$a.class, "1")) {
          return;
       }
       AdDanmakuElement s = this.b.this$0.S;
       if (s != null && (s.isRunning() == true && DanmakuSwitchUtils.h.d())) {
          a.c(this.b.this$0.O, 1, false, false, 4, null);
       }
    label_0031 :
       return;
    }
}
