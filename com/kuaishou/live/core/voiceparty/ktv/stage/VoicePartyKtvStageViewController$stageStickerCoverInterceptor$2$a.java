package com.kuaishou.live.core.voiceparty.ktv.stage.VoicePartyKtvStageViewController$stageStickerCoverInterceptor$2$a;
import fk2.b;
import com.kuaishou.live.core.voiceparty.ktv.stage.VoicePartyKtvStageViewController$stageStickerCoverInterceptor$2;
import java.lang.Object;
import android.graphics.Rect;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.live.core.voiceparty.customview.stage.LiveVoicePartyStageView;
import com.kuaishou.live.core.voiceparty.ktv.stage.VoicePartyKtvStageViewController;
import android.widget.RelativeLayout;

public final class VoicePartyKtvStageViewController$stageStickerCoverInterceptor$2$a implements b	// class@00154d
{
    public final VoicePartyKtvStageViewController$stageStickerCoverInterceptor$2 b;

    public void VoicePartyKtvStageViewController$stageStickerCoverInterceptor$2$a(VoicePartyKtvStageViewController$stageStickerCoverInterceptor$2 p0){
       this.b = p0;
       super();
    }
    public final boolean Q0(Rect p0){
       int[] obj = PatchProxy.applyOneRefs(p0, this, VoicePartyKtvStageViewController$stageStickerCoverInterceptor$2$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = new int[2];
       this.b.this$0.a3().getLocationInWindow(obj);
       return p0.intersects(obj[0], obj[1], (obj[0] + this.b.this$0.a3().getWidth()), (obj[1] + this.b.this$0.a3().getHeight()));
    }
}
