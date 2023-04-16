package com.kuaishou.live.core.voiceparty.ktv.stage.VoicePartyKtvStageViewController$stageView$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.voiceparty.ktv.stage.VoicePartyKtvStageViewController;
import com.kuaishou.live.core.voiceparty.customview.stage.LiveVoicePartyStageView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import com.kuaishou.live.viewcontroller.ViewController;
import java.util.Objects;

public final class VoicePartyKtvStageViewController$stageView$2 extends Lambda implements a	// class@00154f
{
    public final VoicePartyKtvStageViewController this$0;

    public void VoicePartyKtvStageViewController$stageView$2(VoicePartyKtvStageViewController p0){
       this.this$0 = p0;
       super(0);
    }
    public final LiveVoicePartyStageView invoke(){
       View obj = PatchProxy.apply(null, this, VoicePartyKtvStageViewController$stageView$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.this$0.P2();
       Objects.requireNonNull(obj, "null cannot be cast to non-null type com.kuaishou.live.core.voiceparty.customview.stage.LiveVoicePartyStageView");
       return obj;
    }
    public Object invoke(){
       return this.invoke();
    }
}
