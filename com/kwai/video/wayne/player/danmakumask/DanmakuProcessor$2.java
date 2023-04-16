package com.kwai.video.wayne.player.danmakumask.DanmakuProcessor$2;
import com.kwai.video.wayne.player.listeners.OnBuildDataChangedListener;
import com.kwai.video.wayne.player.danmakumask.DanmakuProcessor;
import java.lang.Object;
import com.kwai.video.wayne.player.builder.WayneBuildData;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class DanmakuProcessor$2 implements OnBuildDataChangedListener	// class@000d0f
{
    public final DanmakuProcessor this$0;

    public void DanmakuProcessor$2(DanmakuProcessor p0){
       this.this$0 = p0;
       super();
    }
    public void onChanged(WayneBuildData p0,WayneBuildData p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, DanmakuProcessor$2.class, "1")) {
          return;
       }
       this.this$0.refreshDatasource(p1);
       return;
    }
}
