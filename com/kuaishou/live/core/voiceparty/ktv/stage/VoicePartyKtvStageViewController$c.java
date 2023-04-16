package com.kuaishou.live.core.voiceparty.ktv.stage.VoicePartyKtvStageViewController$c;
import lf3.g;
import com.kuaishou.live.core.voiceparty.ktv.stage.VoicePartyKtvStageViewController;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.SCActionSignal;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.livestream.message.nano.LiveVoicePartyToastFeed;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import e17.i;
import lf3.f;

public final class VoicePartyKtvStageViewController$c implements g	// class@001544
{
    public final VoicePartyKtvStageViewController b;

    public void VoicePartyKtvStageViewController$c(VoicePartyKtvStageViewController p0){
       this.b = p0;
       super();
    }
    public void H4(MessageNano p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoicePartyKtvStageViewController$c.class, "1")) {
       }else {
          VoicePartyKtvStageViewController$c tb = this.b;
          SCActionSignal voicePartyTo = p0.voicePartyToastFeed;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(voicePartyTo, tb, VoicePartyKtvStageViewController.class, "12") && voicePartyTo != null) {
             int len = voicePartyTo.length;
             int i = 0;
             while (i < len) {
                object oobject = voicePartyTo[i];
                if (oobject != null && !TextUtils.x(oobject.toastMsg)) {
                   b.Z(LiveVoicePartyLogTag.KTV, "receive toast: "+oobject.toastMsg);
                   i.d(R.style.arg_RES_7f11066a, oobject.toastMsg);
                   break ;
                }
                i = i + 1;
             }
          }
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
