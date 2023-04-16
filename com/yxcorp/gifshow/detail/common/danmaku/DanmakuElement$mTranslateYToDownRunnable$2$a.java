package com.yxcorp.gifshow.detail.common.danmaku.DanmakuElement$mTranslateYToDownRunnable$2$a;
import java.lang.Runnable;
import com.yxcorp.gifshow.detail.common.danmaku.DanmakuElement$mTranslateYToDownRunnable$2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.detail.common.danmaku.DanmakuElement;
import im5.d;
import com.kwai.feature.api.danmaku.utils.DanmakuSwitchUtils;
import rm5.a;

public final class DanmakuElement$mTranslateYToDownRunnable$2$a implements Runnable	// class@0013ea
{
    public final DanmakuElement$mTranslateYToDownRunnable$2 b;

    public void DanmakuElement$mTranslateYToDownRunnable$2$a(DanmakuElement$mTranslateYToDownRunnable$2 p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, DanmakuElement$mTranslateYToDownRunnable$2$a.class, "1")) {
          return;
       }
       DanmakuElement u0 = this.b.this$0.U0;
       if (u0 != null && (u0.isRunning() == true && DanmakuSwitchUtils.h.d())) {
          a.c(this.b.this$0.W, 1, false, false, 4, null);
       }
    label_0031 :
       return;
    }
}
