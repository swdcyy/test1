package com.kwai.video.wayne.player.danmakumask.DanmakuProcessor$1;
import com.kwai.video.wayne.player.listeners.OnPlayerLoadingChangedListener;
import com.kwai.video.wayne.player.danmakumask.DanmakuProcessor;
import java.lang.Object;
import com.kwai.video.wayne.player.main.LoadingType;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.video.wayne.player.util.DebugLog;

public class DanmakuProcessor$1 implements OnPlayerLoadingChangedListener	// class@000d0e
{
    public final DanmakuProcessor this$0;

    public void DanmakuProcessor$1(DanmakuProcessor p0){
       this.this$0 = p0;
       super();
    }
    public void onChanged(boolean p0,LoadingType p1){
       DanmakuProcessor$1 u1 = DanmakuProcessor$1.class;
       if (PatchProxy.isSupport(u1) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, u1, "1")) {
          return;
       }
       if (!p0 && p1 == LoadingType.STATE_FIRSTFRAME) {
          DebugLog.i(this.this$0.TAG, "first frame startmaskTimer");
          this.this$0.startMaskTimer(false);
       }
       return;
    }
}
