package com.kuaishou.live.core.voiceparty.ktv.stage.VoicePartyKtvStageViewController$d;
import android.content.DialogInterface$OnShowListener;
import com.kuaishou.live.core.voiceparty.ktv.singersetting.LiveVoicePartyKtvSingerSettingDialog;
import com.kuaishou.live.core.voiceparty.ktv.stage.VoicePartyKtvStageViewController;
import java.lang.Object;
import android.content.DialogInterface;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.ktv.singersetting.LiveVoicePartyKtvSingerSettingDialog$b;

public final class VoicePartyKtvStageViewController$d implements DialogInterface$OnShowListener	// class@001545
{
    public final LiveVoicePartyKtvSingerSettingDialog b;
    public final VoicePartyKtvStageViewController c;

    public void VoicePartyKtvStageViewController$d(LiveVoicePartyKtvSingerSettingDialog p0,VoicePartyKtvStageViewController p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void onShow(DialogInterface p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, VoicePartyKtvStageViewController$d.class, "1")) {
          return;
       }
       VoicePartyKtvStageViewController$d tb = this.b;
       a.o(tb, "this");
       p0.m = tb.zh();
       PatchProxy.onMethodExit(VoicePartyKtvStageViewController$d.class, "1");
       return;
    }
}
