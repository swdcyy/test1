package com.kwai.video.wayne.player.main.RepresentationProcessor$onAttach$2;
import com.kwai.video.wayne.player.listeners.OnBuildDataChangedListener;
import com.kwai.video.wayne.player.main.RepresentationProcessor;
import java.lang.Object;
import com.kwai.video.wayne.player.builder.WayneBuildData;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class RepresentationProcessor$onAttach$2 implements OnBuildDataChangedListener	// class@000d92
{
    public final RepresentationProcessor this$0;

    public void RepresentationProcessor$onAttach$2(RepresentationProcessor p0){
       this.this$0 = p0;
       super();
    }
    public void onChanged(WayneBuildData p0,WayneBuildData p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, RepresentationProcessor$onAttach$2.class, "1")) {
          return;
       }
       a.p(p0, "old");
       a.p(p1, "new");
       this.this$0.initQualityList();
       return;
    }
}
