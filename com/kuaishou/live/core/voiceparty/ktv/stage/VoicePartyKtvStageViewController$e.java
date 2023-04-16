package com.kuaishou.live.core.voiceparty.ktv.stage.VoicePartyKtvStageViewController$e;
import android.content.DialogInterface$OnDismissListener;
import com.kuaishou.live.core.voiceparty.ktv.singersetting.LiveVoicePartyKtvSingerSettingDialog;
import com.kuaishou.live.core.voiceparty.ktv.stage.VoicePartyKtvStageViewController;
import java.lang.Object;
import android.content.DialogInterface;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import co2.f2;
import fs2.p;
import qu2.a;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.ktv.singersetting.LiveVoicePartyKtvSingerSettingDialog$b;
import fs2.f;
import yx2.d;
import fs2.g;
import lnc.i3;
import java.lang.Integer;
import java.lang.Number;
import java.lang.Boolean;
import k91.e;
import qrd.l1;
import java.lang.Long;
import com.kwai.robust.PatchProxyResult;

public final class VoicePartyKtvStageViewController$e implements DialogInterface$OnDismissListener	// class@001546
{
    public final LiveVoicePartyKtvSingerSettingDialog b;
    public final VoicePartyKtvStageViewController c;

    public void VoicePartyKtvStageViewController$e(LiveVoicePartyKtvSingerSettingDialog p0,VoicePartyKtvStageViewController p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void onDismiss(DialogInterface p0){
       float f;
       Object obj = this;
       if (PatchProxy.applyVoidOneRefsWithListener(p0, obj, VoicePartyKtvStageViewController$e.class, "1")) {
          return;
       }
       VoicePartyKtvStageViewController$e c = obj.c;
       VoicePartyKtvStageViewController m = c.m;
       if (m != null) {
          f2 uof2 = c.w.l();
          a uoa = obj.c.w.h();
          VoicePartyKtvStageViewController$e b = obj.b;
          a.o(b, "this");
          LiveVoicePartyKtvSingerSettingDialog$b uob = b.zh();
          a.o(uob, "this.status");
          if (!PatchProxy.applyVoidFourRefs(uof2, uoa, m, uob, null, f.class, "16")) {
             a.p(uof2, "voicePartyContext");
             a.p(uoa, "liveBasicContext");
             a.p(m, "before");
             a.p(uob, "after");
             d uod = g.a(new d("VOICEPARTY_KTV_AUDIO_MIXER_SET", uof2, uoa));
             i3 oi3 = i3.f();
             oi3.c("before_tone_value", Integer.valueOf(m.b));
             oi3.c("after_tone_value", Integer.valueOf(uob.b));
             f = (float)100;
             oi3.c("before_human_voice", Integer.valueOf((int)(m.c * f)));
             oi3.c("after_human_voice", Integer.valueOf((int)(uob.c * f)));
             oi3.c("before_bgm_voice", Integer.valueOf((int)(m.d * f)));
             oi3.c("after_bgm_voice", Integer.valueOf((int)(uob.d * f)));
             oi3.a("before_reduce_noice", Boolean.valueOf(m.g));
             oi3.a("after_reduce_noice", Boolean.valueOf(uob.g));
             oi3.d("denoise_type", e.a());
             String str = oi3.e();
             a.o(str, "JsonStringBuilder.newIns¡­Builder\)\n        .build\(\)");
             uod.a(str);
             uod.f();
             d uod1 = g.a(new d("INSERT_WHEAT_STATUS", uof2, uoa));
             i3 oi31 = i3.f();
             oi31.a("before_insert_wheat_status", Boolean.valueOf(m.b()));
             oi31.a("after_insert_wheat_status", Boolean.valueOf(uob.b()));
             oi31.a("before_headset_back_button", Boolean.valueOf(m.h));
             oi31.a("after_headset_back_button", Boolean.valueOf(uob.h));
             String str1 = oi31.e();
             a.o(str1, "JsonStringBuilder.newIns¡­Builder\)\n        .build\(\)");
             uod1.a(str1);
             long l = 1;
             if (PatchProxy.isSupport(g.class)) {
                Object obj1 = PatchProxy.applyThreeRefs(uod1, Long.valueOf(l), Long.valueOf(2), null, g.class, "1");
                if (obj1 != PatchProxyResult.class) {
                   uod1 = obj1;
                label_015d :
                   uod1.f();
                }
             }
             a.p(uod1, "$this$resultPackage");
             goto label_015d ;
          }
       }
       c = obj.c;
       c.m = null;
       c.l = null;
       PatchProxy.onMethodExit(VoicePartyKtvStageViewController$e.class, "1");
       return;
    }
}
