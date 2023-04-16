package com.kwai.video.wayne.player.danmakumask.DanmakuProcessor$3;
import jyd.c_f;
import com.kwai.video.wayne.player.danmakumask.DanmakuProcessor;
import com.kwai.video.wayne.player.danmakumask.KSDanmakuMaskListener;
import java.lang.Object;
import kyd.a_f;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.wayne.player.danmakumask.DanmakuProcessor$5;
import tv.acfun.core.player.mask.model.ResultCode;
import java.lang.Enum;
import kyd.g_f;

public class DanmakuProcessor$3 implements c_f	// class@000d10
{
    public final DanmakuProcessor this$0;
    public final KSDanmakuMaskListener val$listener;

    public void DanmakuProcessor$3(DanmakuProcessor p0,KSDanmakuMaskListener p1){
       this.this$0 = p0;
       this.val$listener = p1;
       super();
    }
    public void onFrameResultUpdate(a_f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DanmakuProcessor$3.class, "1")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       int i = DanmakuProcessor$5.$SwitchMap$tv$acfun$core$player$mask$model$ResultCode[p0.e().ordinal()];
       if (i != 1) {
          if (i == 2) {
             this.val$listener.onFrameContentUpdate(null);
          }
       }else if(p0 instanceof g_f){
          this.val$listener.onFrameContentUpdate(p0);
       }
       return;
    }
}
